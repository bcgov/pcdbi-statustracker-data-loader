package ca.bc.gov.hlth.pcdbi.batch.model.oldstatustracker;

import java.util.ArrayList;
import java.util.List;

import ca.bc.gov.hlth.pcdbi.batch.model.common.Form;
import ca.bc.gov.hlth.pcdbi.batch.model.common.IssueAndRisk;

public class OldStatusTracker {

	private Form form;

	// Header fields
	private String typeOfInitiative;
	private String healthAuthority;
	private String communityName;
	private String pcnName;
	private List<String> pcnNames = new ArrayList<String>();

	// PCN
	private String allClinicsImpacted;
	private List<String> clinicNames = new ArrayList<String>();
	private String hsiarServicePlanGapAnalysis;
	private String pcnForecastedImplementationDate;
	private String otherPcIsIncluded;

	// UPCC
	private String upccName;
	private String upccTypeOfCare;

	private String upccCovidTestSite;
	private String upccChangesToService;
	private String upccChangeToServiceDate;
	private String upccServiceDeliveryMode;

	// CHC
	private String chcName;
	private String chcAddress;
	private String chcKeyAttributes;
	private String chcFundingSources;

	// FNPCC
	private String fnpccName;
	private String fnpccForecastedImplementationDate;
	private String fnpccImplementationType;
	private String fnpccAddress;
	private String fnpccFirstNationOrganizationLead;
	private String fnpccAdditionalDetails;

	// NPPCC
	private String nppccName;
	private String nppccAddress;
	private String nppccKeyAttributes;
	private String nppccfundingSourcesAndPartnershipStructure;

	// Status
	private String currentFiscalYear;
	private String initiativeStatus;
	private String phase;
	private String statusUpdate;

	// Initiative Dates
	private String eoiSubmissionDate;
	private String eoiApprovalDate;
	private String spSubmissionDate;

	private String spApprovalDate;
	private String implementationDate;
	private String announcementPending;
	private String announcementDate;

	private String targetOpeningDate;
	private String actualOpeningDate;
	private String scaleUpResources;
	private String openDateForScaleUpResources;

	private String reasonForDelay;
	private String reasonForExceptionInDate;

	// Issues and/or Risks
	private String anyIssuesRisk;
	private List<IssueAndRisk> issuesAndRisks = new ArrayList<IssueAndRisk>();

	// New
	private String issueClosedDate;
	private String issueRaisedDate;
	private String dateMitigationPlanCommences;
	private String mitigationStrategy;
	private String issuesNotes;
	private String riskCategory;
	private String relevantSites;

	public Form getForm() {
		return form;
	}

	public void setForm(Form form) {
		this.form = form;
	}

	public String getTypeOfInitiative() {
		return typeOfInitiative;
	}

	public void setTypeOfInitiative(String typeOfInitiative) {
		this.typeOfInitiative = typeOfInitiative;
	}

	public String getHealthAuthority() {
		return healthAuthority;
	}

	public void setHealthAuthority(String healthAuthority) {
		this.healthAuthority = healthAuthority;
	}

	public String getCommunityName() {
		return communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getPcnName() {
		return pcnName;
	}

	public void setPcnName(String pcnName) {
		this.pcnName = pcnName;
	}

	public List<String> getPcnNames() {
		return pcnNames;
	}

	public void setPcnNames(List<String> pcnNames) {
		this.pcnNames = pcnNames;
	}

	public String getAllClinicsImpacted() {
		return allClinicsImpacted;
	}

	public void setAllClinicsImpacted(String allClinicsImpacted) {
		this.allClinicsImpacted = allClinicsImpacted;
	}

	public List<String> getClinicNames() {
		return clinicNames;
	}

	public void setClinicNames(List<String> clinicNames) {
		this.clinicNames = clinicNames;
	}

	public String getHsiarServicePlanGapAnalysis() {
		return hsiarServicePlanGapAnalysis;
	}

	public void setHsiarServicePlanGapAnalysis(String hsiarServicePlanGapAnalysis) {
		this.hsiarServicePlanGapAnalysis = hsiarServicePlanGapAnalysis;
	}

	public String getPcnForecastedImplementationDate() {
		return pcnForecastedImplementationDate;
	}

	public void setPcnForecastedImplementationDate(String pcnForecastedImplementationDate) {
		this.pcnForecastedImplementationDate = pcnForecastedImplementationDate;
	}

	public String getOtherPcIsIncluded() {
		return otherPcIsIncluded;
	}

	public void setOtherPcIsIncluded(String otherPcIsIncluded) {
		this.otherPcIsIncluded = otherPcIsIncluded;
	}

	public String getUpccName() {
		return upccName;
	}

	public void setUpccName(String upccName) {
		this.upccName = upccName;
	}

	public String getUpccTypeOfCare() {
		return upccTypeOfCare;
	}

	public void setUpccTypeOfCare(String upccTypeOfCare) {
		this.upccTypeOfCare = upccTypeOfCare;
	}

	public String getUpccCovidTestSite() {
		return upccCovidTestSite;
	}

	public void setUpccCovidTestSite(String upccCovidTestSite) {
		this.upccCovidTestSite = upccCovidTestSite;
	}

	public String getUpccChangesToService() {
		return upccChangesToService;
	}

	public void setUpccChangesToService(String upccChangesToService) {
		this.upccChangesToService = upccChangesToService;
	}

	public String getUpccChangeToServiceDate() {
		return upccChangeToServiceDate;
	}

	public void setUpccChangeToServiceDate(String upccChangeToServiceDate) {
		this.upccChangeToServiceDate = upccChangeToServiceDate;
	}

	public String getUpccServiceDeliveryMode() {
		return upccServiceDeliveryMode;
	}

	public void setUpccServiceDeliveryMode(String upccServiceDeliveryMode) {
		this.upccServiceDeliveryMode = upccServiceDeliveryMode;
	}

	public String getChcName() {
		return chcName;
	}

	public void setChcName(String chcName) {
		this.chcName = chcName;
	}

	public String getChcAddress() {
		return chcAddress;
	}

	public void setChcAddress(String chcAddress) {
		this.chcAddress = chcAddress;
	}

	public String getChcKeyAttributes() {
		return chcKeyAttributes;
	}

	public void setChcKeyAttributes(String chcKeyAttributes) {
		this.chcKeyAttributes = chcKeyAttributes;
	}

	public String getChcFundingSources() {
		return chcFundingSources;
	}

	public void setChcFundingSources(String chcFundingSources) {
		this.chcFundingSources = chcFundingSources;
	}

	public String getFnpccName() {
		return fnpccName;
	}

	public void setFnpccName(String fnpccName) {
		this.fnpccName = fnpccName;
	}

	public String getFnpccForecastedImplementationDate() {
		return fnpccForecastedImplementationDate;
	}

	public void setFnpccForecastedImplementationDate(String fnpccForecastedImplementationDate) {
		this.fnpccForecastedImplementationDate = fnpccForecastedImplementationDate;
	}

	public String getFnpccImplementationType() {
		return fnpccImplementationType;
	}

	public void setFnpccImplementationType(String fnpccImplementationType) {
		this.fnpccImplementationType = fnpccImplementationType;
	}

	public String getFnpccAddress() {
		return fnpccAddress;
	}

	public void setFnpccAddress(String fnpccAddress) {
		this.fnpccAddress = fnpccAddress;
	}

	public String getFnpccFirstNationOrganizationLead() {
		return fnpccFirstNationOrganizationLead;
	}

	public void setFnpccFirstNationOrganizationLead(String fnpccFirstNationOrganizationLead) {
		this.fnpccFirstNationOrganizationLead = fnpccFirstNationOrganizationLead;
	}

	public String getFnpccAdditionalDetails() {
		return fnpccAdditionalDetails;
	}

	public void setFnpccAdditionalDetails(String fnpccAdditionalDetails) {
		this.fnpccAdditionalDetails = fnpccAdditionalDetails;
	}

	public String getNppccName() {
		return nppccName;
	}

	public void setNppccName(String nppccName) {
		this.nppccName = nppccName;
	}

	public String getNppccAddress() {
		return nppccAddress;
	}

	public void setNppccAddress(String nppccAddress) {
		this.nppccAddress = nppccAddress;
	}

	public String getNppccKeyAttributes() {
		return nppccKeyAttributes;
	}

	public void setNppccKeyAttributes(String nppccKeyAttributes) {
		this.nppccKeyAttributes = nppccKeyAttributes;
	}

	public String getNppccfundingSourcesAndPartnershipStructure() {
		return nppccfundingSourcesAndPartnershipStructure;
	}

	public void setNppccfundingSourcesAndPartnershipStructure(String nppccfundingSourcesAndPartnershipStructure) {
		this.nppccfundingSourcesAndPartnershipStructure = nppccfundingSourcesAndPartnershipStructure;
	}

	public String getCurrentFiscalYear() {
		return currentFiscalYear;
	}

	public void setCurrentFiscalYear(String currentFiscalYear) {
		this.currentFiscalYear = currentFiscalYear;
	}

	public String getInitiativeStatus() {
		return initiativeStatus;
	}

	public void setInitiativeStatus(String initiativeStatus) {
		this.initiativeStatus = initiativeStatus;
	}

	public String getPhase() {
		return phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}

	public String getStatusUpdate() {
		return statusUpdate;
	}

	public void setStatusUpdate(String statusUpdate) {
		this.statusUpdate = statusUpdate;
	}

	public String getEoiSubmissionDate() {
		return eoiSubmissionDate;
	}

	public void setEoiSubmissionDate(String eoiSubmissionDate) {
		this.eoiSubmissionDate = eoiSubmissionDate;
	}

	public String getEoiApprovalDate() {
		return eoiApprovalDate;
	}

	public void setEoiApprovalDate(String eoiApprovalDate) {
		this.eoiApprovalDate = eoiApprovalDate;
	}

	public String getSpSubmissionDate() {
		return spSubmissionDate;
	}

	public void setSpSubmissionDate(String spSubmissionDate) {
		this.spSubmissionDate = spSubmissionDate;
	}

	public String getSpApprovalDate() {
		return spApprovalDate;
	}

	public void setSpApprovalDate(String spApprovalDate) {
		this.spApprovalDate = spApprovalDate;
	}

	public String getImplementationDate() {
		return implementationDate;
	}

	public void setImplementationDate(String implementationDate) {
		this.implementationDate = implementationDate;
	}

	public String getAnnouncementPending() {
		return announcementPending;
	}

	public void setAnnouncementPending(String announcementPending) {
		this.announcementPending = announcementPending;
	}

	public String getAnnouncementDate() {
		return announcementDate;
	}

	public void setAnnouncementDate(String announcementDate) {
		this.announcementDate = announcementDate;
	}

	public String getTargetOpeningDate() {
		return targetOpeningDate;
	}

	public void setTargetOpeningDate(String targetOpeningDate) {
		this.targetOpeningDate = targetOpeningDate;
	}

	public String getActualOpeningDate() {
		return actualOpeningDate;
	}

	public void setActualOpeningDate(String actualOpeningDate) {
		this.actualOpeningDate = actualOpeningDate;
	}

	public String getScaleUpResources() {
		return scaleUpResources;
	}

	public void setScaleUpResources(String scaleUpResources) {
		this.scaleUpResources = scaleUpResources;
	}

	public String getOpenDateForScaleUpResources() {
		return openDateForScaleUpResources;
	}

	public void setOpenDateForScaleUpResources(String openDateForScaleUpResources) {
		this.openDateForScaleUpResources = openDateForScaleUpResources;
	}

	public String getReasonForDelay() {
		return reasonForDelay;
	}

	public void setReasonForDelay(String reasonForDelay) {
		this.reasonForDelay = reasonForDelay;
	}

	public String getReasonForExceptionInDate() {
		return reasonForExceptionInDate;
	}

	public void setReasonForExceptionInDate(String reasonForExceptionInDate) {
		this.reasonForExceptionInDate = reasonForExceptionInDate;
	}

	public String getAnyIssuesRisk() {
		return anyIssuesRisk;
	}

	public void setAnyIssuesRisk(String anyIssuesRisk) {
		this.anyIssuesRisk = anyIssuesRisk;
	}

	public List<IssueAndRisk> getIssuesAndRisks() {
		return issuesAndRisks;
	}

	public void setIssuesAndRisks(List<IssueAndRisk> issuesAndRisks) {
		this.issuesAndRisks = issuesAndRisks;
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

	public String getDateMitigationPlanCommences() {
		return dateMitigationPlanCommences;
	}

	public void setDateMitigationPlanCommences(String dateMitigationPlanCommences) {
		this.dateMitigationPlanCommences = dateMitigationPlanCommences;
	}

	public String getMitigationStrategy() {
		return mitigationStrategy;
	}

	public void setMitigationStrategy(String mitigationStrategy) {
		this.mitigationStrategy = mitigationStrategy;
	}

	public String getIssuesNotes() {
		return issuesNotes;
	}

	public void setIssuesNotes(String issuesNotes) {
		this.issuesNotes = issuesNotes;
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

	@Override
	public String toString() {
		return "OldStatusTracker [form=" + form + ", typeOfInitiative=" + typeOfInitiative + ", healthAuthority="
				+ healthAuthority + ", communityName=" + communityName + ", pcnName=" + pcnName + ", pcnNames="
				+ pcnNames + ", allClinicsImpacted=" + allClinicsImpacted + ", clinicNames=" + clinicNames
				+ ", hsiarServicePlanGapAnalysis=" + hsiarServicePlanGapAnalysis + ", pcnForecastedImplementationDate="
				+ pcnForecastedImplementationDate + ", otherPcIsIncluded=" + otherPcIsIncluded + ", upccName="
				+ upccName + ", upccTypeOfCare=" + upccTypeOfCare + ", upccCovidTestSite=" + upccCovidTestSite
				+ ", upccChangesToService=" + upccChangesToService + ", upccChangeToServiceDate="
				+ upccChangeToServiceDate + ", upccServiceDeliveryMode=" + upccServiceDeliveryMode + ", chcName="
				+ chcName + ", chcAddress=" + chcAddress + ", chcKeyAttributes=" + chcKeyAttributes
				+ ", chcFundingSources=" + chcFundingSources + ", fnpccName=" + fnpccName
				+ ", fnpccForecastedImplementationDate=" + fnpccForecastedImplementationDate
				+ ", fnpccImplementationType=" + fnpccImplementationType + ", fnpccAddress=" + fnpccAddress
				+ ", fnpccFirstNationOrganizationLead=" + fnpccFirstNationOrganizationLead + ", fnpccAdditionalDetails="
				+ fnpccAdditionalDetails + ", nppccName=" + nppccName + ", nppccAddress=" + nppccAddress
				+ ", nppccKeyAttributes=" + nppccKeyAttributes + ", nppccfundingSourcesAndPartnershipStructure="
				+ nppccfundingSourcesAndPartnershipStructure + ", currentFiscalYear=" + currentFiscalYear
				+ ", initiativeStatus=" + initiativeStatus + ", phase=" + phase + ", statusUpdate=" + statusUpdate
				+ ", eoiSubmissionDate=" + eoiSubmissionDate + ", eoiApprovalDate=" + eoiApprovalDate
				+ ", spSubmissionDate=" + spSubmissionDate + ", spApprovalDate=" + spApprovalDate
				+ ", implementationDate=" + implementationDate + ", announcementPending=" + announcementPending
				+ ", announcementDate=" + announcementDate + ", targetOpeningDate=" + targetOpeningDate
				+ ", actualOpeningDate=" + actualOpeningDate + ", scaleUpResources=" + scaleUpResources
				+ ", openDateForScaleUpResources=" + openDateForScaleUpResources + ", reasonForDelay=" + reasonForDelay
				+ ", reasonForExceptionInDate=" + reasonForExceptionInDate + ", anyIssuesRisk=" + anyIssuesRisk
				+ ", issuesAndRisks=" + issuesAndRisks + ", issueClosedDate=" + issueClosedDate + ", issueRaisedDate="
				+ issueRaisedDate + ", dateMitigationPlanCommences=" + dateMitigationPlanCommences
				+ ", mitigationStrategy=" + mitigationStrategy + ", issuesNotes=" + issuesNotes + ", riskCategory="
				+ riskCategory + ", relevantSites=" + relevantSites + "]";
	}

}
