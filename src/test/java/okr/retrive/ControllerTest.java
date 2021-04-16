package okr.retrive;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ControllerTest {

	@Test
	public void controllerReturnsHelloText() {
		Controller controller = new Controller();
		assertThat(controller.retrive()).isInstanceOf(Objective.class);
	}
}
