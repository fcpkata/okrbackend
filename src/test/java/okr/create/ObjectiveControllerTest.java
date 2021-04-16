package okr.create;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ObjectiveControllerTest {
	
	@Test
	public void createsObjectiveForADescription() {
		
		ObjectiveController objectiveController= new ObjectiveController();
		Integer id = objectiveController.createObjective("Objective for OKR 1");
		assertThat(id).isEqualTo(1);
	}

}
