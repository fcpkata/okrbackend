package okr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import okr.retrive.ObjectiveKeyResult;

public class OKRControllerTest {

	private static OKRController controller;

	@BeforeClass
	public static void setup() {

		controller = new OKRController();
	}

	@Test
	public void shouldReturnObjectOfTypeOKR() {
		assertTrue(controller.index(10) instanceof ObjectiveKeyResult);
	}
	
	@Test
	public void shouldReturnOKRForAGivenObjectiveKey() {
		ObjectiveKeyResult response = controller.index(10);
		assertTrue(response.getId().equals(10));
	}
}
