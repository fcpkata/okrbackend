package okr.retrive;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ControllerTest {

	@Test
	public void controllerReturnsHelloText() {
		Controller controller = new Controller();
		ResponseEntity<Objective> response = controller.retrive(10);
		assertThat(response.getBody()).isInstanceOf(Objective.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}
}
