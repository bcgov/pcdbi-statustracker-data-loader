package ca.bc.gov.hlth.pcdbi.batch.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import ca.bc.gov.hlth.pcdbi.batch.model.oldstatustracker.OldStatusTracker;
import ca.bc.gov.hlth.pcdbi.batch.model.statustracker.StatusTracker;

public class OldStatusTrackerProcessor implements ItemProcessor<OldStatusTracker, StatusTracker> {
	private static final Logger logger = LoggerFactory.getLogger(OldStatusTrackerProcessor.class);

	@Override
	public StatusTracker process(OldStatusTracker item) throws Exception {
		logger.info("Process item {}", item);

		StatusTracker statusTracker = new StatusTracker();

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
		case "FPNCC":
			processFNPCC(item, statusTracker);
			break;
		case "NPPCC":
			processNPPCC(item, statusTracker);
			break;
		}
	
		statusTracker.setActualAnnouncementDate(item.getAnnouncementDate());

		statusTracker.setCurrentFiscalYear(item.getCurrentFiscalYear());
		statusTracker.setIssueClosedDate(item.getIssueClosedDate());
		statusTracker.setIssueRaisedDate(item.getIssueRaisedDate());
		statusTracker.setDateMitigationPlanCommences(item.getDateMitigationPlanCommences());
		
		
		
		
		
		
		
		
		// TODO (weskubo-cgi) Implement conversion logic
		return statusTracker;
	}
	
	private void processPCN(OldStatusTracker oldStatusTracker, StatusTracker statusTracker) {
		statusTracker.setPcnImSerPubBldCapLncDate(oldStatusTracker.getActualOpeningDate());
		statusTracker.setPcnInEoiAppDate(oldStatusTracker.getEoiApprovalDate());
		statusTracker.setPcnInEoiSubDate(oldStatusTracker.getEoiSubmissionDate());
	}
	
	private void processUPCC(OldStatusTracker oldStatusTracker, StatusTracker statusTracker) {
		statusTracker.setUpccImSerPubBldCapDrsOpnDate(oldStatusTracker.getActualOpeningDate());
		// upccAddress not mapped
		statusTracker.setUpccChangesToService(oldStatusTracker.getUpccChangesToService());
		statusTracker.setUpccChangeToServiceDate(oldStatusTracker.getUpccChangeToServiceDate());
		statusTracker.setUpccInConSumAccCfmDate(oldStatusTracker.getEoiApprovalDate());
		statusTracker.setUpccInConSumSubDate(oldStatusTracker.getEoiSubmissionDate());
	}
	
	private void processCHC(OldStatusTracker oldStatusTracker, StatusTracker statusTracker) {
		statusTracker.setChcImSerPubBldCapDrsOpnDate(oldStatusTracker.getActualOpeningDate());
		statusTracker.setChcAddress(oldStatusTracker.getChcAddress());
		statusTracker.setChcName(oldStatusTracker.getChcName());
		statusTracker.setChcInConSumAccCfmDate(oldStatusTracker.getEoiApprovalDate());
		statusTracker.setChcInConSumSubDate(oldStatusTracker.getEoiSubmissionDate());
	}
	
	private void processFNPCC(OldStatusTracker oldStatusTracker, StatusTracker statusTracker) {
		statusTracker.setFnpccImSerPubBldCapDrsOpnDate(oldStatusTracker.getActualOpeningDate());
		statusTracker.setFnpccAddress(oldStatusTracker.getFnpccAddress());
		statusTracker.setFnpccInPreAnlRepCfmDate(oldStatusTracker.getEoiApprovalDate());
		statusTracker.setFnpccInPreAnlRepSubDate(oldStatusTracker.getEoiSubmissionDate());
		statusTracker.setFnpccName(oldStatusTracker.getFnpccName());
	}
	
	private void processNPPCC(OldStatusTracker oldStatusTracker, StatusTracker statusTracker) {
		statusTracker.setNppccImSerPubBldCapDrsOpnDate(oldStatusTracker.getActualOpeningDate());
		statusTracker.setNppccAddress(oldStatusTracker.getNppccAddress());
		
	}

}
