package okr.retrive;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import okr.model.OkrInformation;
import okr.service.DataService;

@RunWith(MockitoJUnitRunner.class)
public class RetriveServiceTest {
	
	private RetriveService retriveService;
	
	@Mock
	private DataService dataService;

	@Before
	public void setUp() {
		
		retriveService = new RetriveService(dataService);
	}

	@Test
	public void shouldReturnAnInstanceOfObjectiveKeyResult() {
		when(dataService.fetchOkrById(ArgumentMatchers.anyInt())).thenReturn(Optional.of(OkrInformation.builder().build()));
		assertTrue(retriveService.getOkrById(10) instanceof ObjectiveKeyResult);
	}
	
	@Test
	public void shouldReturnOKRForAnObjectiveId() {
		
		when(dataService.fetchOkrById(ArgumentMatchers.anyInt())).thenReturn(Optional.of(OkrInformation.builder().id(10).build()));
		assertTrue(retriveService.getOkrById(10).getId().equals(10));
	}
	
	@Test
	public void shouldReturnSpecificOKRForAnObjectiveId() {
		
		when(dataService.fetchOkrById(ArgumentMatchers.anyInt())).thenReturn(Optional.of(OkrInformation.builder().id(20).build()));
		assertTrue(retriveService.getOkrById(20).getId().equals(20));
	}

}
