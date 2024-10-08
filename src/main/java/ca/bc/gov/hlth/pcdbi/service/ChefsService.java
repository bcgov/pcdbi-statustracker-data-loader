package ca.bc.gov.hlth.pcdbi.service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.configuration.BatchConfigurationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ca.bc.gov.hlth.pcdbi.batch.model.oldstatustracker.OldStatusTracker;
import ca.bc.gov.hlth.pcdbi.batch.model.statustracker.StatusTracker;
import ca.bc.gov.hlth.pcdbi.batch.model.submission.Submission;
import ca.bc.gov.hlth.pcdbi.batch.model.submission.SubmissionRequest;
import ca.bc.gov.hlth.pcdbi.batch.model.submission.SubmissionResponse;
import ca.bc.gov.hlth.pcdbi.batch.model.version.FormVersion;
import ca.bc.gov.hlth.pcdbi.batch.model.version.FormVersions;
import jakarta.annotation.PostConstruct;

@Service
public class ChefsService {

    private static final Logger logger = LoggerFactory.getLogger(ChefsService.class);
    
    @Value("${chefs.forms.oldStatusTracker.formId}")
    private String oldStatusTrackerFormId;
    
    @Value("${chefs.forms.oldStatusTracker.apiKey}")
    private String oldStatusTrackerApikey;
    
    @Value("${chefs.forms.statusTracker.formId}")
    private String statusTrackerFormId;
    
    @Value("${chefs.forms.statusTracker.apiKey}")
    private String statusTrackerApiKey;

    private String submissionpath = "forms/%s/submissions?deleted=false&draft=false";
    
    private String oldStatusTrackerSubmissionPath = submissionpath + "&fields=TODO,communities";
    
    private String formSubmissionPath = "forms/%s/versions/%s/submissions";
    
    private String publishedFormVersionPath = "forms/%s/version";
    
    private String statusTrackerFormVersion;
    
    @Autowired
    private WebClient chefsWebClient;
    
    @PostConstruct
    public void init() {
        Optional<FormVersion> opt = getPublishedFormVersion(statusTrackerFormId, statusTrackerApiKey).getBody().getVersions().stream().filter((version) -> version.getPublished()).findAny();
        statusTrackerFormVersion  = opt.orElseThrow(() -> new BatchConfigurationException("Could not find latest version of Status Tracker form")).getId();
    }
    
    public ResponseEntity<List<OldStatusTracker>> getOldStatusTrackers() {
        String path = String.format(oldStatusTrackerSubmissionPath, oldStatusTrackerFormId);
        return chefsWebClient.get()
                .uri(path)
                .headers(header -> header.setBasicAuth(oldStatusTrackerFormId, oldStatusTrackerApikey))
                .retrieve()
                .toEntityList(OldStatusTracker.class)
                .block();
    }
    
    public Submission createStatusTracker(StatusTracker statusTracker) {
        
        Submission submission = new Submission();
        submission.setData(statusTracker);
        SubmissionRequest submissionRequest = new SubmissionRequest(submission);

        String path = String.format(formSubmissionPath, statusTrackerFormId, statusTrackerFormVersion);
        try {
            return chefsWebClient.post()
                    .uri(path)
                    .headers(header -> header.setBasicAuth(statusTrackerFormId, statusTrackerApiKey))
                    .bodyValue(submissionRequest)
                    .retrieve()
                    .bodyToMono(Submission.class)
                    .block();    
        } catch (Exception e) {
            
            try {
                String obj = new ObjectMapper().writeValueAsString(submissionRequest);
                logger.error("Could not process submission {}", obj);
            } catch (JsonProcessingException jpe) {
                // Ignore as this is just a secondary error
            }
            throw e;
        }
        
    }
    
    private ResponseEntity<FormVersions> getPublishedFormVersion(String formId, String apiKey) {
        String path = String.format(publishedFormVersionPath, formId);
        return chefsWebClient
                .mutate()
                .codecs(configurer -> configurer
                        .defaultCodecs()
                        .maxInMemorySize(16 * 1024 * 1024))
                .build()
        		.get()
                .uri(path)
                .headers(header -> header.setBasicAuth(formId, apiKey))
                .retrieve()
                .toEntity(FormVersions.class)
                .block();
    }

}
