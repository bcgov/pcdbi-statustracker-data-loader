package ca.bc.gov.hlth.pcdbi.batch.model.submission;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class Data {
	@JsonIgnore
    private Boolean lateEntry = Boolean.FALSE;
	//@JsonIgnore
    private String submissionId;

    public Boolean getLateEntry() {
        return lateEntry;
    }

    public void setLateEntry(Boolean lateEntry) {
        this.lateEntry = lateEntry;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

}
