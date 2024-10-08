package ca.bc.gov.hlth.pcdbi.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import ca.bc.gov.hlth.pcdbi.batch.listener.Step1ExecutionListener;
import ca.bc.gov.hlth.pcdbi.batch.model.oldstatustracker.OldStatusTracker;
import ca.bc.gov.hlth.pcdbi.batch.model.statustracker.StatusTracker;
import ca.bc.gov.hlth.pcdbi.batch.processor.OldStatusTrackerProcessor;
import ca.bc.gov.hlth.pcdbi.batch.reader.OldStatusTrackerReader;
import ca.bc.gov.hlth.pcdbi.batch.writer.ChefsItemWriter;
import ca.bc.gov.hlth.pcdbi.service.ChefsService;

@Configuration
public class BatchConfiguration {
    
    @Value("${chunk.size:50}")
    private Integer chunkSize;

    @Autowired
    private ChefsService chefsService;

    @Value("${spring.profiles.active}")
    private String activeProfile;

    @Bean
    ItemReader<OldStatusTracker> reader() throws UnexpectedInputException, ParseException {
    	return new OldStatusTrackerReader(chefsService);
    }

    @Bean
    ItemProcessor<OldStatusTracker, StatusTracker> processor() {
        return new OldStatusTrackerProcessor();
    }

    @Bean
    ChefsItemWriter writer() {
        return new ChefsItemWriter(chefsService);
    }

    @Bean
    Step1ExecutionListener stepListener() {
        return new Step1ExecutionListener();
    }

    @Bean
    Step step1(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("step1", jobRepository).<OldStatusTracker, StatusTracker>chunk(chunkSize, transactionManager).reader(reader())
                .processor(processor()).writer(writer()).listener(stepListener()).build();
    }


    @Bean(name = "statusTrackerImportJob")
    Job job(JobRepository jobRepository, @Qualifier("step1") Step step1) {
        return new JobBuilder("clinicRecordsImportJob", jobRepository).preventRestart().start(step1).build();
    }

}
