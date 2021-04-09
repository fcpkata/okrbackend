package okr;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import okr.retrive.ObjectiveKeyResult;
import okr.retrive.RetriveService;

@RunWith(MockitoJUnitRunner.class)
public class OKRControllerTest {

	@Mock
	private RetriveService retriveService;

	private OKRController controller;

	@Before
	public void setup() {

		controller = new OKRController(retriveService);
	}

	@Test
	public void shouldReturnObjectOfTypeOKR() {
		when(retriveService.getOkrById(10)).thenReturn(ObjectiveKeyResult.builder().build());
		assertTrue(controller.index(10) instanceof ObjectiveKeyResult);
	}

	@Test
	public void shouldReturnOKRForAGivenObjectiveKey() {
		mockRetriveService(10);
		ObjectiveKeyResult response = controller.index(10);
		assertTrue(response.getId().equals(10));
	}

	@Test
	public void shouldReturnSpecificOKRForAnObjectiveKey() {
		mockRetriveService(15);
		ObjectiveKeyResult response = controller.index(15);
		assertTrue(response.getId().equals(15));
	}

	private void mockRetriveService(Integer objectiveId) {
		when(retriveService.getOkrById(objectiveId)).thenReturn(ObjectiveKeyResult.builder().id(objectiveId).build());
	}
}
