package okr.web;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class OkrControllerTest {

	@Test
	public void controllerReturnsHelloText() {
		OkrController controller = new OkrController();
		assertThat(controller.index()).isEqualTo("Hello, world");
	}
}
