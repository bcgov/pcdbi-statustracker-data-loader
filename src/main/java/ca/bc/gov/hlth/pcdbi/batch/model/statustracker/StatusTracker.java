package ca.bc.gov.hlth.pcdbi.batch.model.statustracker;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import ca.bc.gov.hlth.pcdbi.batch.model.common.IssueAndRisk;
import ca.bc.gov.hlth.pcdbi.batch.model.submission.Data;

@JsonInclude(Include.NON_EMPTY)
public class StatusTracker extends Data {

	// Header fields
	private String typeOfInitiative;
	private String healthAuthority;
	private String communityName;
	private List<String> pcnNames;
	private String pcnName;

	// PCN
	private String allClinicsImpacted;
	private List<String> clinicNames = new ArrayList<String>();
	private String pcnImSerPubBldCapLncDate;

	// UPCC
	private String upccName;
	private String upccTypeOfCare;
	private String upccServiceDeliveryMode;
	private String upccAddress;
	private String upccChangesToService;
	private String upccChangeToServiceDate;

	private String upccImSerPubBldCapDrsOpnDate;

	// CHC
	private String chcName;
	private String chcImplementationType;
	private String chcAddress;
	private String chcKeyAttributes;
	private String chcFundingSources;

	private String chcImSerPubBldCapDrsOpnDate;

	// FNPCC
	private String fnpccName;
	private String fnpccImplementationType;
	private String fnpccFirstNationOrganizationLead;
	private String fnpccAddress;
	private String fnpccAdditionalDetails;

	private String fnpccImSerPubBldCapDrsOpnDate;

	// NPPCC
	private String nppccName;
	private String nppccImplementationType;
	private String nppccAddress;
	private String nppccKeyAttributes;

	private String nppccImSerPubBldCapDrsOpnDate;

	// Initiative Dates
	private String actualAnnouncementDate;

	private String currentFiscalYear;
	private String statusUpdate;

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
	private String fnpccPlFunPkgAppIssDate;
	private String fnpccImEstFndAppNotOpnDate;
	private String nppccPlFunPkgAppIssDate;
	private String nppccImEstFndAppNotOpnDate;
	private String pcnPlFunPkgAppIssDate;
	private String pcnImEstFndPreLncDate;
	private String upccPlFunPkgAppIssDate;
	private String upccImEstFndAppNotOpnDate;

	private String mitigationStrategy;
	private String issuesNotes;

	private String otherPcIsIncluded;

	private String phase;

	private String relevantSites;
	private String levelOfRisk;

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

	private String anyIssuesRisk;
	private List<IssueAndRisk> issuesAndRisksWell = new ArrayList<IssueAndRisk>();

	public List<IssueAndRisk> getIssuesAndRisksWell() {
		return issuesAndRisksWell;
	}

	public void setIssuesAndRisksWell(List<IssueAndRisk> issuesAndRisksWell) {
		this.issuesAndRisksWell = issuesAndRisksWell;
	}

	public String getAnyIssuesRisk() {
		return anyIssuesRisk;
	}

	public void setAnyIssuesRisk(String anyIssuesRisk) {
		this.anyIssuesRisk = anyIssuesRisk;
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

	public String getUpccTypeOfCare() {
		return upccTypeOfCare;
	}

	public void setUpccTypeOfCare(String upccTypeOfCare) {
		this.upccTypeOfCare = upccTypeOfCare;
	}

	public String getAllClinicsImpacted() {
		return allClinicsImpacted;
	}

	public void setAllClinicsImpacted(String allClinicsImpacted) {
		this.allClinicsImpacted = allClinicsImpacted;
	}

	public String getCurrentFiscalYear() {
		return currentFiscalYear;
	}

	public String getUpccName() {
		return upccName;
	}

	public void setUpccName(String upccName) {
		this.upccName = upccName;
	}

	public String getUpccServiceDeliveryMode() {
		return upccServiceDeliveryMode;
	}

	public void setUpccServiceDeliveryMode(String upccServiceDeliveryMode) {
		this.upccServiceDeliveryMode = upccServiceDeliveryMode;
	}

	public String getChcPlProEdrDate() {
		return chcPlProEdrDate;
	}

	public void setChcPlProEdrDate(String chcPlProEdrDate) {
		this.chcPlProEdrDate = chcPlProEdrDate;
	}

	public String getFnpccPlSerPlnOprBudEdrDate() {
		return fnpccPlSerPlnOprBudEdrDate;
	}

	public void setFnpccPlSerPlnOprBudEdrDate(String fnpccPlSerPlnOprBudEdrDate) {
		this.fnpccPlSerPlnOprBudEdrDate = fnpccPlSerPlnOprBudEdrDate;
	}

	public String getNppccPlProEdrDate() {
		return nppccPlProEdrDate;
	}

	public void setNppccPlProEdrDate(String nppccPlProEdrDate) {
		this.nppccPlProEdrDate = nppccPlProEdrDate;
	}

	public String getPcnPlSerPlnOprBudEdrDate() {
		return pcnPlSerPlnOprBudEdrDate;
	}

	public void setPcnPlSerPlnOprBudEdrDate(String pcnPlSerPlnOprBudEdrDate) {
		this.pcnPlSerPlnOprBudEdrDate = pcnPlSerPlnOprBudEdrDate;
	}

	public String getUpccPlSerPlnOprBudEdrDate() {
		return upccPlSerPlnOprBudEdrDate;
	}

	public void setUpccPlSerPlnOprBudEdrDate(String upccPlSerPlnOprBudEdrDate) {
		this.upccPlSerPlnOprBudEdrDate = upccPlSerPlnOprBudEdrDate;
	}

	public String getChcPlProSubDate() {
		return chcPlProSubDate;
	}

	public void setChcPlProSubDate(String chcPlProSubDate) {
		this.chcPlProSubDate = chcPlProSubDate;
	}

	public String getFnpccPlSerPlnOprBudSubUndRevDate() {
		return fnpccPlSerPlnOprBudSubUndRevDate;
	}

	public void setFnpccPlSerPlnOprBudSubUndRevDate(String fnpccPlSerPlnOprBudSubUndRevDate) {
		this.fnpccPlSerPlnOprBudSubUndRevDate = fnpccPlSerPlnOprBudSubUndRevDate;
	}

	public String getNppccPlProSubDate() {
		return nppccPlProSubDate;
	}

	public void setNppccPlProSubDate(String nppccPlProSubDate) {
		this.nppccPlProSubDate = nppccPlProSubDate;
	}

	public String getPcnPlSerPlnOprBudSubUndRevDate() {
		return pcnPlSerPlnOprBudSubUndRevDate;
	}

	public void setPcnPlSerPlnOprBudSubUndRevDate(String pcnPlSerPlnOprBudSubUndRevDate) {
		this.pcnPlSerPlnOprBudSubUndRevDate = pcnPlSerPlnOprBudSubUndRevDate;
	}

	public String getUpccPlSerPlnOprBudSubUndRevDate() {
		return upccPlSerPlnOprBudSubUndRevDate;
	}

	public void setUpccPlSerPlnOprBudSubUndRevDate(String upccPlSerPlnOprBudSubUndRevDate) {
		this.upccPlSerPlnOprBudSubUndRevDate = upccPlSerPlnOprBudSubUndRevDate;
	}

	public String getInitiativeStatus() {
		return initiativeStatus;
	}

	public void setInitiativeStatus(String initiativeStatus) {
		this.initiativeStatus = initiativeStatus;
	}

	public String getStatusUpdate() {
		return statusUpdate;
	}

	public void setStatusUpdate(String statusUpdate) {
		this.statusUpdate = statusUpdate;
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

	public String getTargetLaunchOpenDate() {
		return targetLaunchOpenDate;
	}

	public void setTargetLaunchOpenDate(String targetLaunchOpenDate) {
		this.targetLaunchOpenDate = targetLaunchOpenDate;
	}

	public String getChcPlFunPkgAppIssDate() {
		return chcPlFunPkgAppIssDate;
	}

	public void setChcPlFunPkgAppIssDate(String chcPlFunPkgAppIssDate) {
		this.chcPlFunPkgAppIssDate = chcPlFunPkgAppIssDate;
	}

	public String getChcImEstFndAppNotOpnDate() {
		return chcImEstFndAppNotOpnDate;
	}

	public void setChcImEstFndAppNotOpnDate(String chcImEstFndAppNotOpnDate) {
		this.chcImEstFndAppNotOpnDate = chcImEstFndAppNotOpnDate;
	}

	public String getFnpccPlFunPkgAppIssDate() {
		return fnpccPlFunPkgAppIssDate;
	}

	public void setFnpccPlFunPkgAppIssDate(String fnpccPlFunPkgAppIssDate) {
		this.fnpccPlFunPkgAppIssDate = fnpccPlFunPkgAppIssDate;
	}

	public String getFnpccImEstFndAppNotOpnDate() {
		return fnpccImEstFndAppNotOpnDate;
	}

	public void setFnpccImEstFndAppNotOpnDate(String fnpccImEstFndAppNotOpnDate) {
		this.fnpccImEstFndAppNotOpnDate = fnpccImEstFndAppNotOpnDate;
	}

	public String getNppccPlFunPkgAppIssDate() {
		return nppccPlFunPkgAppIssDate;
	}

	public void setNppccPlFunPkgAppIssDate(String nppccPlFunPkgAppIssDate) {
		this.nppccPlFunPkgAppIssDate = nppccPlFunPkgAppIssDate;
	}

	public String getNppccImEstFndAppNotOpnDate() {
		return nppccImEstFndAppNotOpnDate;
	}

	public void setNppccImEstFndAppNotOpnDate(String nppccImEstFndAppNotOpnDate) {
		this.nppccImEstFndAppNotOpnDate = nppccImEstFndAppNotOpnDate;
	}

	public String getPcnPlFunPkgAppIssDate() {
		return pcnPlFunPkgAppIssDate;
	}

	public void setPcnPlFunPkgAppIssDate(String pcnPlFunPkgAppIssDate) {
		this.pcnPlFunPkgAppIssDate = pcnPlFunPkgAppIssDate;
	}

	public String getPcnImEstFndPreLncDate() {
		return pcnImEstFndPreLncDate;
	}

	public void setPcnImEstFndPreLncDate(String pcnImEstFndPreLncDate) {
		this.pcnImEstFndPreLncDate = pcnImEstFndPreLncDate;
	}

	public String getUpccPlFunPkgAppIssDate() {
		return upccPlFunPkgAppIssDate;
	}

	public void setUpccPlFunPkgAppIssDate(String upccPlFunPkgAppIssDate) {
		this.upccPlFunPkgAppIssDate = upccPlFunPkgAppIssDate;
	}

	public String getUpccImEstFndAppNotOpnDate() {
		return upccImEstFndAppNotOpnDate;
	}

	public void setUpccImEstFndAppNotOpnDate(String upccImEstFndAppNotOpnDate) {
		this.upccImEstFndAppNotOpnDate = upccImEstFndAppNotOpnDate;
	}

	public String getChcFundingSources() {
		return chcFundingSources;
	}

	public void setChcFundingSources(String chcFundingSources) {
		this.chcFundingSources = chcFundingSources;
	}

	public String getHealthAuthority() {
		return healthAuthority;
	}

	public void setHealthAuthority(String healthAuthority) {
		this.healthAuthority = healthAuthority;
	}

	public String getFnpccImplementationType() {
		return fnpccImplementationType;
	}

	public void setFnpccImplementationType(String fnpccImplementationType) {
		this.fnpccImplementationType = fnpccImplementationType;
	}

	public String getChcImplementationType() {
		return chcImplementationType;
	}

	public void setChcImplementationType(String chcImplementationType) {
		this.chcImplementationType = chcImplementationType;
	}

	public String getNppccImplementationType() {
		return nppccImplementationType;
	}

	public void setNppccImplementationType(String nppccImplementationType) {
		this.nppccImplementationType = nppccImplementationType;
	}

	public String getTypeOfInitiative() {
		return typeOfInitiative;
	}

	public void setTypeOfInitiative(String typeOfInitiative) {
		this.typeOfInitiative = typeOfInitiative;
	}

	public String getNppccKeyAttributes() {
		return nppccKeyAttributes;
	}

	public void setNppccKeyAttributes(String nppccKeyAttributes) {
		this.nppccKeyAttributes = nppccKeyAttributes;
	}

	public String getChcKeyAttributes() {
		return chcKeyAttributes;
	}

	public void setChcKeyAttributes(String chcKeyAttributes) {
		this.chcKeyAttributes = chcKeyAttributes;
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

	public String getNppccName() {
		return nppccName;
	}

	public void setNppccName(String nppccName) {
		this.nppccName = nppccName;
	}

	public String getOtherPcIsIncluded() {
		return otherPcIsIncluded;
	}

	public void setOtherPcIsIncluded(String otherPcIsIncluded) {
		this.otherPcIsIncluded = otherPcIsIncluded;
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

	public String getPhase() {
		return phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}

	public String getRelevantSites() {
		return relevantSites;
	}

	public void setRelevantSites(String relevantSites) {
		this.relevantSites = relevantSites;
	}

	public String getLevelOfRisk() {
		return levelOfRisk;
	}

	public void setLevelOfRisk(String levelOfRisk) {
		this.levelOfRisk = levelOfRisk;
	}

	public List<String> getClinicNames() {
		return clinicNames;
	}

	public void setClinicNames(List<String> clinicNames) {
		this.clinicNames = clinicNames;
	}

	public String getFnpccName() {
		return fnpccName;
	}

	public void setFnpccName(String fnpccName) {
		this.fnpccName = fnpccName;
	}

}
