package okr.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

import okr.model.OkrInformation;

public class OkrDataServiceTest {
	
	private DataService dataService;
	
	@Before
	public void setup() {
		dataService = new MockDataService();
	}

	@Test
	public void fetchAllDataFromBackend() {
		List<OkrInformation> okrs = dataService.fetchAllOkrs();
		assertThat(okrs.size() > 0).isTrue();
	}
	
	@Test
	public void fetchesOkrForTheId10() throws Exception {
		Optional<OkrInformation> okrOptional = dataService.fetchOkrById(10);
		assertThat(okrOptional.get().getDescription()).isEqualTo("Objective Description");
	}
	
	@Test
	public void fetchEmptyWhenIdIsNotFound() throws Exception {
		Optional<OkrInformation> okrOptional = dataService.fetchOkrById(1000);
		assertTrue(okrOptional.isEmpty());
	}

	@Test
	public void updateOkrDataForTheId10_forExisting() throws Exception {
		dataService.saveOkrFor(OkrInformation.builder().id(10)
													    .parentId(0)
													    .description("Objective Description")
													    .progress(20.0)
													    .build());
		
		Optional<OkrInformation> okrOptional = dataService.fetchOkrById(10);
		assertThat(okrOptional.get().getProgress()).isEqualTo(20.0);
		
	}
	
	@Test
	public void insertOkrDataForTheId100_forNew() throws Exception {
		dataService.saveOkrFor(OkrInformation.builder().id(100)
			    .parentId(0)
			    .description("Objective Description")
			    .progress(20.0)
			    .build());

		Optional<OkrInformation> okrOptional = dataService.fetchOkrById(100);
		
		assertTrue(dataService.fetchAllOkrs().size() >= 2);
		assertThat(okrOptional.get().getProgress()).isEqualTo(20.0);
	}
	
	
}
