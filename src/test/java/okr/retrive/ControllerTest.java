package okr.retrive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ControllerTest {

	@Test
	public void controllerReturnsHelloText() {
		Controller controller = new Controller();
		assertEquals("Hello, world", controller.index());
	}
}
