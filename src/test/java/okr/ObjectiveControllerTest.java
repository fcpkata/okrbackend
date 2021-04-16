package okr;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ObjectiveControllerTest {
	
	@Test
	public void createObjective() {
		
		ObjectiveController objectiveController= new ObjectiveController();
		Integer id = objectiveController.createObjective();
		assertThat(id).isEqualTo(1);
	}

}
