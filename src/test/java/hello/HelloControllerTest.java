package hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloControllerTest {

	@Test
	public void controllerReturnsHelloText() {
		HelloController controller = new HelloController();
		assertEquals("Hello, world", controller.index());
	}
}
