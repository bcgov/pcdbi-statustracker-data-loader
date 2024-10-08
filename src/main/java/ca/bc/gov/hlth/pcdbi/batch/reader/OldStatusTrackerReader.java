package ca.bc.gov.hlth.pcdbi.batch.reader;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import ca.bc.gov.hlth.pcdbi.batch.model.oldstatustracker.OldStatusTracker;
import ca.bc.gov.hlth.pcdbi.service.ChefsService;

public class OldStatusTrackerReader implements ItemReader<OldStatusTracker> {
	
	private static final Logger logger = LoggerFactory.getLogger(OldStatusTrackerReader.class);
	
	private static final String CURRENT_INDEX = "current.index";

	//private ChefsService chefsService;

	private List<OldStatusTracker> items;

	private int currentIndex = 0;

	public OldStatusTrackerReader(ChefsService chefsService) {
		//this.chefsService = chefsService;
		this.items = chefsService.getOldStatusTrackers().getBody();
		logger.info("Read {} records", this.items.size());
	}

	@Override
	public OldStatusTracker read()
			throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		logger.info("read");
		if (currentIndex < items.size()) {
			logger.info("read item {}", items.get(currentIndex) );
			return items.get(currentIndex++);
		}

		return null;
	}

	public void open(ExecutionContext executionContext) throws ItemStreamException {
		if (executionContext.containsKey(CURRENT_INDEX)) {
			currentIndex = Long.valueOf(executionContext.getLong(CURRENT_INDEX)).intValue();
		} else {
			currentIndex = 0;
		}
	}

	public void update(ExecutionContext executionContext) throws ItemStreamException {
		executionContext.putLong(CURRENT_INDEX, Long.valueOf(currentIndex).longValue());
	}

	public void close() throws ItemStreamException {
	}
}
