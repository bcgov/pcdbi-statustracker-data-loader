package ca.bc.gov.hlth.pcdbi.batch.model.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class IssueAndRisk {

	private String issuesNotes;

	private List<String> typeOfIssue;

	private String issueAndRisk;

	private String riskCategory;

	private String relevantSites;
	private String issueClosedDate;

	private String issueRaisedDate;

	private String mitigationStrategy;

	private String dateMitigationPlanCommences;

	public String getIssuesNotes() {
		return issuesNotes;
	}

	public void setIssuesNotes(String issuesNotes) {
		this.issuesNotes = issuesNotes;
	}

	public List<String> getTypeOfIssue() {
		return typeOfIssue;
	}

	public void setTypeOfIssue(List<String> typeOfIssue) {
		this.typeOfIssue = typeOfIssue;
	}

	public String getIssueAndRisk() {
		return issueAndRisk;
	}

	public void setIssueAndRisk(String issueAndRisk) {
		this.issueAndRisk = issueAndRisk;
	}

	public String getRiskCategory() {
		return riskCategory;
	}

	public void setRiskCategory(String riskCategory) {
		this.riskCategory = riskCategory;
	}

	public String getRelevantSites() {
		return relevantSites;
	}

	public void setRelevantSites(String relevantSites) {
		this.relevantSites = relevantSites;
	}

	public String getIssueClosedDate() {
		return issueClosedDate;
	}

	public void setIssueClosedDate(String issueClosedDate) {
		this.issueClosedDate = issueClosedDate;
	}

	public String getIssueRaisedDate() {
		return issueRaisedDate;
	}

	public void setIssueRaisedDate(String issueRaisedDate) {
		this.issueRaisedDate = issueRaisedDate;
	}

	public String getMitigationStrategy() {
		return mitigationStrategy;
	}

	public void setMitigationStrategy(String mitigationStrategy) {
		this.mitigationStrategy = mitigationStrategy;
	}

	public String getDateMitigationPlanCommences() {
		return dateMitigationPlanCommences;
	}

	public void setDateMitigationPlanCommences(String dateMitigationPlanCommences) {
		this.dateMitigationPlanCommences = dateMitigationPlanCommences;
	}

	@Override
	public String toString() {
		return "IssueAndRisk [issuesNotes=" + issuesNotes + ", typeOfIssue=" + typeOfIssue + ", issueAndRisk="
				+ issueAndRisk + ", riskCategory=" + riskCategory + ", relevantSites=" + relevantSites
				+ ", issueClosedDate=" + issueClosedDate + ", issueRaisedDate=" + issueRaisedDate
				+ ", mitigationStrategy=" + mitigationStrategy + ", dateMitigationPlanCommences="
				+ dateMitigationPlanCommences + "]";
	}

}