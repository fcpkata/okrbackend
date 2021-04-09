package okr;

import static org.junit.Assert.*;

import org.junit.Test;

import okr.OkrController;

public class OkrControllerTest {

	@Test
	public void controllerReturnsHelloText() {
		OkrController controller = new OkrController();
		assertEquals("Hello, world", controller.index());
	}
}
