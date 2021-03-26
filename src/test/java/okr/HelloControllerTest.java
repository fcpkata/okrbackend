package okr;

import static org.junit.Assert.*;

import org.junit.Test;

import okr.HelloController;

public class HelloControllerTest {

	@Test
	public void controllerReturnsHelloText() {
		HelloController controller = new HelloController();
		assertEquals("Hello, world", controller.index());
	}
}
