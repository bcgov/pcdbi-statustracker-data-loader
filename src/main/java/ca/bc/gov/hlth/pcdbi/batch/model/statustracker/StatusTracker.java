package ca.bc.gov.hlth.pcdbi.batch.model.statustracker;

import java.util.List;

import ca.bc.gov.hlth.pcdbi.batch.model.oldstatustracker.IssueAndRisk;
import ca.bc.gov.hlth.pcdbi.batch.model.oldstatustracker.PCNNameWithType;
import ca.bc.gov.hlth.pcdbi.batch.model.submission.Data;

public class StatusTracker extends Data {
	
	
	
	
	
	
	
	// PCN
	private String pcnImSerPubBldCapLncDate;
	
	// UPCC
	private String upccAddress;
	private String upccImSerPubBldCapDrsOpnDate;	
	private String upccChangesToService;
	private String upccChangeToServiceDate;

	// CHC
	private String chcName;
	private String chcAddress;
	private String chcImSerPubBldCapDrsOpnDate;
	

	// FNPCC
	private String fnpccName;
	public String getFnpccName() {
		return fnpccName;
	}
	public void setFnpccName(String fnpccName) {
		this.fnpccName = fnpccName;
	}
	private String fnpccAddress;
	private String fnpccImSerPubBldCapDrsOpnDate;

	// NPPCC
	private String nppccAddress;
	private String nppccImSerPubBldCapDrsOpnDate;
	
	
	// Initiative Dates
	private String actualAnnouncementDate;
	
//	// Status
	private String currentFiscalYear;
	private String issueClosedDate;
	private String issueRaisedDate;
	private String dateMitigationPlanCommences;
	private String chcInConSumAccCfmDate;
	private String fnpccInPreAnlRepCfmDate;
	
	private String pcnInEoiAppDate;
	private String upccInConSumAccCfmDate;
	private String chcInConSumSubDate;
	private String fnpccInPreAnlRepSubDate;
	
	private String pcnInEoiSubDate;
	private String upccInConSumSubDate;
	
	private String targetLaunchOpenDate;
	private String chcPlFunPkgAppIssDate; 
	private String chcImEstFndAppNotOpnDate;
	private String chcImEstFndAppNotOpnDate;
	private String fnpccPlFunPkgAppIssDate;
	private String fnpccImEstFndAppNotOpnDate;
	private String fnpccImEstFndAppNotOpnDate;
	private String nppccPlFunPkgAppIssDate;
	private String nppccImEstFndAppNotOpnDate;
	private String nppccImEstFndAppNotOpnDate;
	private String pcnPlFunPkgAppIssDate;
	private String pcnImEstFndPreLncDate;
	private String pcnImEstFndPreLncDate;
	private String upccPlFunPkgAppIssDate;
	private String upccImEstFndAppNotOpnDate;
	private String upccImEstFndAppNotOpnDate;
	
	private String chcFundingSources;
	private String healthAuthority;
	
	private String fnpccImplementationType;
	private String chcImplementationType;
	private String nppccImplementationType;
	private String typeOfInitiative;
	private String descriptionOfIssueOrRisk;
	private String nppccKeyAttributes;
	private String chcKeyAttributes;
	private String mitigationStrategy;
	private String issuesNotes;
	private String nppccName;
	private String otherPcIsIncluded;
	private String communityName;
	private String pcnNames;
	
	private String phase;

	private String relevantSites;
	private String levelOfRisk;

	private String upccServiceDeliveryMode;
	private String chcPlProEdrDate;
	private String fnpccPlSerPlnOprBudEdrDate;
	private String nppccPlProEdrDate;
	private String pcnPlSerPlnOprBudEdrDate;
	private String upccPlSerPlnOprBudEdrDate;
	private String chcPlProSubDate;
	private String fnpccPlSerPlnOprBudSubUndRevDate;
	private String nppccPlProSubDate;
	private String pcnPlSerPlnOprBudSubUndRevDate;
	private String upccPlSerPlnOprBudSubUndRevDate;
	private String initiativeStatus;
	private String statusUpdate;
	private String targetLaunchOpenDate;
	
	
	private String issueRiskCategory;
	private String upccName;

	private String anyIssuesRisk;
	private String fnpccFirstNationOrganizationLead;
	private String fnpccAdditionalDetails;
	private String upccTypeOfCare;
	private String allClinicsImpacted;
	
	public String getCurrentFiscalYear() {
		return currentFiscalYear;
	}
	public void setCurrentFiscalYear(String currentFiscalYear) {
		this.currentFiscalYear = currentFiscalYear;
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
	public String getChcInConSumAccCfmDate() {
		return chcInConSumAccCfmDate;
	}
	public void setChcInConSumAccCfmDate(String chcInConSumAccCfmDate) {
		this.chcInConSumAccCfmDate = chcInConSumAccCfmDate;
	}
	public String getFnpccInPreAnlRepCfmDate() {
		return fnpccInPreAnlRepCfmDate;
	}
	public void setFnpccInPreAnlRepCfmDate(String fnpccInPreAnlRepCfmDate) {
		this.fnpccInPreAnlRepCfmDate = fnpccInPreAnlRepCfmDate;
	}
	public String getPcnImSerPubBldCapLncDate() {
		return pcnImSerPubBldCapLncDate;
	}
	public void setPcnImSerPubBldCapLncDate(String pcnImSerPubBldCapLncDate) {
		this.pcnImSerPubBldCapLncDate = pcnImSerPubBldCapLncDate;
	}
	public String getUpccImSerPubBldCapDrsOpnDate() {
		return upccImSerPubBldCapDrsOpnDate;
	}
	public void setUpccImSerPubBldCapDrsOpnDate(String upccImSerPubBldCapDrsOpnDate) {
		this.upccImSerPubBldCapDrsOpnDate = upccImSerPubBldCapDrsOpnDate;
	}
	public String getChcImSerPubBldCapDrsOpnDate() {
		return chcImSerPubBldCapDrsOpnDate;
	}
	public void setChcImSerPubBldCapDrsOpnDate(String chcImSerPubBldCapDrsOpnDate) {
		this.chcImSerPubBldCapDrsOpnDate = chcImSerPubBldCapDrsOpnDate;
	}
	public String getFnpccImSerPubBldCapDrsOpnDate() {
		return fnpccImSerPubBldCapDrsOpnDate;
	}
	public void setFnpccImSerPubBldCapDrsOpnDate(String fnpccImSerPubBldCapDrsOpnDate) {
		this.fnpccImSerPubBldCapDrsOpnDate = fnpccImSerPubBldCapDrsOpnDate;
	}
	public String getNppccImSerPubBldCapDrsOpnDate() {
		return nppccImSerPubBldCapDrsOpnDate;
	}
	public void setNppccImSerPubBldCapDrsOpnDate(String nppccImSerPubBldCapDrsOpnDate) {
		this.nppccImSerPubBldCapDrsOpnDate = nppccImSerPubBldCapDrsOpnDate;
	}
	public String getUpccAddress() {
		return upccAddress;
	}
	public void setUpccAddress(String upccAddress) {
		this.upccAddress = upccAddress;
	}
	public String getChcAddress() {
		return chcAddress;
	}
	public void setChcAddress(String chcAddress) {
		this.chcAddress = chcAddress;
	}
	public String getFnpccAddress() {
		return fnpccAddress;
	}
	public void setFnpccAddress(String fnpccAddress) {
		this.fnpccAddress = fnpccAddress;
	}
	public String getNppccAddress() {
		return nppccAddress;
	}
	public void setNppccAddress(String nppccAddress) {
		this.nppccAddress = nppccAddress;
	}
	public String getActualAnnouncementDate() {
		return actualAnnouncementDate;
	}
	public void setActualAnnouncementDate(String actualAnnouncementDate) {
		this.actualAnnouncementDate = actualAnnouncementDate;
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
	public String getChcName() {
		return chcName;
	}
	public void setChcName(String chcName) {
		this.chcName = chcName;
	}
	public String getPcnInEoiAppDate() {
		return pcnInEoiAppDate;
	}
	public void setPcnInEoiAppDate(String pcnInEoiAppDate) {
		this.pcnInEoiAppDate = pcnInEoiAppDate;
	}
	public String getUpccInConSumAccCfmDate() {
		return upccInConSumAccCfmDate;
	}
	public void setUpccInConSumAccCfmDate(String upccInConSumAccCfmDate) {
		this.upccInConSumAccCfmDate = upccInConSumAccCfmDate;
	}
	public String getChcInConSumSubDate() {
		return chcInConSumSubDate;
	}
	public void setChcInConSumSubDate(String chcInConSumSubDate) {
		this.chcInConSumSubDate = chcInConSumSubDate;
	}
	public String getFnpccInPreAnlRepSubDate() {
		return fnpccInPreAnlRepSubDate;
	}
	public void setFnpccInPreAnlRepSubDate(String fnpccInPreAnlRepSubDate) {
		this.fnpccInPreAnlRepSubDate = fnpccInPreAnlRepSubDate;
	}
	public String getPcnInEoiSubDate() {
		return pcnInEoiSubDate;
	}
	public void setPcnInEoiSubDate(String pcnInEoiSubDate) {
		this.pcnInEoiSubDate = pcnInEoiSubDate;
	}
	public String getUpccInConSumSubDate() {
		return upccInConSumSubDate;
	}
	public void setUpccInConSumSubDate(String upccInConSumSubDate) {
		this.upccInConSumSubDate = upccInConSumSubDate;
	}
	
	
	
	
//	// Form/submission fields
//	private String lateEntry;
//
//	// Header fields
//	private String typeOfInitiative;
//	private String healthAuthority;
//	private String communityName;
//	private String pcnName;
//	private List<String> pcnNames;
//	private PCNNameWithType pcnNameWithType;
//	private List<PCNNameWithType> pcnNamesWithType;
//
//	// PCN
//	private String allClinicsImpacted;
//	private List<String> clinicNames;
//	private String hsiarServicePlanGapAnalysis;
//	private String pcnForecastedImplementationDate;
//	private String otherPcIsIncluded;
//
//	// UPCC
//	private String upccName;
//	private String upccTypeOfCare;
//	private String upccCovidTestSite;
//	
//	private String upccServiceDeliveryMode;
//
//	// CHC
//	
//	private String chcAddress;
//	private String chcKeyAttributes;
//	private String chcFundingSources;
//
//	// FNPCC
//	private String fnpccName;
//	private String fnpccForecastedImplementationDate;
//	private String fnpccImplementationType;
//	private String fnpccAddress;
//	private String fnpccFirstNationOrganizationLead;
//	private String fnpccAdditionalDetails;
//
//	// NPPCC
//	private String nppccName;
//	private String nppccAddress;
//	private String nppccKeyAttributes;
//	private String nppccfundingSourcesAndPartnershipStructure;
//
//	// Status
//	private String currentFiscalYear;
//	private String initiativeStatus;
//	private String phase;
//	private String statusUpdate;
//
//	// Initiative Dates
//	private String eoiSubmissionDate;
//	private String eoiApprovalDate;
//	private String spSubmissionDate;
//
//	private String spApprovalDate;
//	private String implementationDate;
//	private String announcementPending;
//	private String announcementDate;
//
//	private String targetOpeningDate;
//	private String actualOpeningDate;
//	private String scaleUpResources;
//	private String openDateForScaleUpResources;
//
//	private String reasonForDelay;
//	private String reasonForExceptionInDate;
//
//	// Issues and/or Risks
//	private String anyIssuesRisk;
//	private List<IssueAndRisk> issuesAndRisks;
//
//	// Deprecated
//	// XXX These fields are deprecated/renamed and won't be mapped to the export
//	private String forecastedImplementationYear;
//	private String fnpccFiscalYearAndQuarterLaunch;
	
	

}
