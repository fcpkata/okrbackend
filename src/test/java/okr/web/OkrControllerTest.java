package okr.web;

import org.junit.jupiter.api.Test;

import okr.web.OkrController;

import static org.assertj.core.api.Assertions.assertThat;

public class OkrControllerTest {

	@Test
	public void controllerReturnsHelloText() {
		OkrController controller = new OkrController();
		assertThat(controller.index()).isEqualTo("Hello, world");
	}
}
