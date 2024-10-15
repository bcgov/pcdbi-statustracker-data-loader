package ca.bc.gov.hlth.pcdbi.batch.processor;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import ca.bc.gov.hlth.pcdbi.batch.model.oldstatustracker.OldStatusTracker;
import ca.bc.gov.hlth.pcdbi.batch.model.statustracker.StatusTracker;

public class OldStatusTrackerProcessor implements ItemProcessor<OldStatusTracker, StatusTracker> {
	private static final Logger logger = LoggerFactory.getLogger(OldStatusTrackerProcessor.class);

	@Override
	public StatusTracker process(OldStatusTracker item) throws Exception {
		logger.debug("Processing item {}", item);

		StatusTracker statusTracker = new StatusTracker();
		
		// TODO (weskubo-cgi) remove this after verification
		statusTracker.setSubmissionId(item.getForm().getSubmissionId());

		// All Initiative Types
		statusTracker.setTypeOfInitiative(item.getTypeOfInitiative());
		statusTracker.setHealthAuthority(item.getHealthAuthority());
		statusTracker.setPcnName(item.getPcnName());
		statusTracker.setPcnNames(new ArrayList<String>(item.getPcnNames()));
		
		statusTracker.setActualAnnouncementDate(item.getAnnouncementDate());
		statusTracker.setCurrentFiscalYear(item.getCurrentFiscalYear());
		statusTracker.setIssueClosedDate(item.getIssueClosedDate());
		statusTracker.setIssueRaisedDate(item.getIssueRaisedDate());
		statusTracker.setDateMitigationPlanCommences(item.getDateMitigationPlanCommences());

		statusTracker.setMitigationStrategy(item.getMitigationStrategy());
		statusTracker.setIssuesNotes(item.getIssuesNotes());
		statusTracker.setCommunityName(item.getCommunityName());
		statusTracker.setPhase(item.getPhase());
		statusTracker.setRelevantSites(item.getRelevantSites());
		statusTracker.setLevelOfRisk(item.getRiskCategory());
		statusTracker.setInitiativeStatus(item.getInitiativeStatus());
		statusTracker.setStatusUpdate(item.getStatusUpdate());

		statusTracker.setAnyIssuesRisk(item.getAnyIssuesRisk());

		// Skip empty records which are prevalent
		statusTracker.setIssuesAndRisksWell(item.getIssuesAndRisks().stream().filter(issueRisk -> StringUtils.isNotBlank(issueRisk.getIssueRaisedDate())).collect(Collectors.toList()));

		// Specific Initiative Types
		switch (item.getTypeOfInitiative()) {
		case "PCN":
			processPCN(item, statusTracker);
			break;
		case "UPCC":
			processUPCC(item, statusTracker);
			break;
		case "CHC":
			processCHC(item, statusTracker);
			break;
		case "FNPCC":
			processFNPCC(item, statusTracker);
			break;
		case "NPPCC":
			processNPPCC(item, statusTracker);
			break;
		}

		return statusTracker;
	}
	
	private void processPCN(OldStatusTracker oldStatusTracker, StatusTracker statusTracker) {		
		// Validated		
		statusTracker.setPcnImSerPubBldCapLncDate(oldStatusTracker.getActualOpeningDate());
		statusTracker.setPcnInEoiAppDate(oldStatusTracker.getEoiApprovalDate());
		statusTracker.setPcnInEoiSubDate(oldStatusTracker.getEoiSubmissionDate());
		statusTracker.setTargetLaunchOpenDate(oldStatusTracker.getPcnForecastedImplementationDate());
		statusTracker.setPcnPlFunPkgAppIssDate(oldStatusTracker.getImplementationDate());
		statusTracker.setPcnImEstFndPreLncDate(oldStatusTracker.getImplementationDate());
		statusTracker.setOtherPcIsIncluded(oldStatusTracker.getOtherPcIsIncluded());
		statusTracker.setPcnPlSerPlnOprBudEdrDate(oldStatusTracker.getSpApprovalDate());
		statusTracker.setPcnPlSerPlnOprBudSubUndRevDate(oldStatusTracker.getSpSubmissionDate());
		statusTracker.setAllClinicsImpacted(oldStatusTracker.getAllClinicsImpacted());
		
		// Skip empty records which are prevalent		
		statusTracker.setClinicNames(oldStatusTracker.getClinicNames().stream().filter(clinicName -> StringUtils.isNotBlank(clinicName)).collect(Collectors.toList()));
	}
	
	private void processUPCC(OldStatusTracker oldStatusTracker, StatusTracker statusTracker) {
		// Validated
		statusTracker.setUpccImSerPubBldCapDrsOpnDate(oldStatusTracker.getActualOpeningDate());
		statusTracker.setUpccChangesToService(oldStatusTracker.getUpccChangesToService());
		statusTracker.setUpccChangeToServiceDate(oldStatusTracker.getUpccChangeToServiceDate());
		statusTracker.setUpccInConSumAccCfmDate(oldStatusTracker.getEoiApprovalDate());
		statusTracker.setUpccInConSumSubDate(oldStatusTracker.getEoiSubmissionDate());
		statusTracker.setUpccPlFunPkgAppIssDate(oldStatusTracker.getImplementationDate());
		statusTracker.setUpccImEstFndAppNotOpnDate(oldStatusTracker.getImplementationDate());
		statusTracker.setUpccServiceDeliveryMode(oldStatusTracker.getUpccServiceDeliveryMode());
		statusTracker.setUpccPlSerPlnOprBudEdrDate(oldStatusTracker.getSpApprovalDate());
		statusTracker.setUpccPlSerPlnOprBudSubUndRevDate(oldStatusTracker.getSpSubmissionDate());
		statusTracker.setTargetLaunchOpenDate(oldStatusTracker.getTargetOpeningDate());
		statusTracker.setUpccName(oldStatusTracker.getUpccName());
		statusTracker.setUpccTypeOfCare(oldStatusTracker.getUpccTypeOfCare());
	}
	
	private void processCHC(OldStatusTracker oldStatusTracker, StatusTracker statusTracker) {
		// Validated
		statusTracker.setChcImSerPubBldCapDrsOpnDate(oldStatusTracker.getActualOpeningDate());
		statusTracker.setChcAddress(oldStatusTracker.getChcAddress());
		statusTracker.setChcName(oldStatusTracker.getChcName());
		statusTracker.setChcInConSumAccCfmDate(oldStatusTracker.getEoiApprovalDate());
		statusTracker.setChcInConSumSubDate(oldStatusTracker.getEoiSubmissionDate());
		statusTracker.setChcPlFunPkgAppIssDate(oldStatusTracker.getImplementationDate());
		statusTracker.setChcImEstFndAppNotOpnDate(oldStatusTracker.getImplementationDate());
		statusTracker.setChcFundingSources(oldStatusTracker.getChcFundingSources());
		statusTracker.setChcKeyAttributes(oldStatusTracker.getChcKeyAttributes());
		statusTracker.setChcPlProEdrDate(oldStatusTracker.getSpApprovalDate());
		statusTracker.setChcPlProSubDate(oldStatusTracker.getSpSubmissionDate());
		statusTracker.setTargetLaunchOpenDate(oldStatusTracker.getTargetOpeningDate());
	}
	
	private void processFNPCC(OldStatusTracker oldStatusTracker, StatusTracker statusTracker) {
		// Validated
		statusTracker.setFnpccImSerPubBldCapDrsOpnDate(oldStatusTracker.getActualOpeningDate());
		statusTracker.setFnpccAddress(oldStatusTracker.getFnpccAddress());
		statusTracker.setFnpccInPreAnlRepCfmDate(oldStatusTracker.getEoiApprovalDate());
		statusTracker.setFnpccInPreAnlRepSubDate(oldStatusTracker.getEoiSubmissionDate());
		statusTracker.setFnpccName(oldStatusTracker.getFnpccName());
		statusTracker.setFnpccPlFunPkgAppIssDate(oldStatusTracker.getImplementationDate());
		statusTracker.setFnpccImEstFndAppNotOpnDate(oldStatusTracker.getImplementationDate());
		statusTracker.setFnpccImplementationType(oldStatusTracker.getFnpccImplementationType());
		statusTracker.setFnpccPlSerPlnOprBudEdrDate(oldStatusTracker.getSpApprovalDate());
		statusTracker.setFnpccPlSerPlnOprBudSubUndRevDate(oldStatusTracker.getSpSubmissionDate());
		statusTracker.setTargetLaunchOpenDate(oldStatusTracker.getTargetOpeningDate());
		statusTracker.setFnpccFirstNationOrganizationLead(oldStatusTracker.getFnpccFirstNationOrganizationLead());
		statusTracker.setFnpccAdditionalDetails(oldStatusTracker.getFnpccAdditionalDetails());
	}
	
	private void processNPPCC(OldStatusTracker oldStatusTracker, StatusTracker statusTracker) {
		// Validated
		statusTracker.setNppccImSerPubBldCapDrsOpnDate(oldStatusTracker.getActualOpeningDate());
		statusTracker.setNppccAddress(oldStatusTracker.getNppccAddress());
		statusTracker.setNppccPlFunPkgAppIssDate(oldStatusTracker.getImplementationDate());
		statusTracker.setNppccImEstFndAppNotOpnDate(oldStatusTracker.getImplementationDate());
		statusTracker.setNppccKeyAttributes(oldStatusTracker.getNppccKeyAttributes());
		statusTracker.setNppccName(oldStatusTracker.getNppccName());
		statusTracker.setNppccPlProEdrDate(oldStatusTracker.getSpApprovalDate());
		statusTracker.setNppccPlProSubDate(oldStatusTracker.getSpSubmissionDate());
	}

}
