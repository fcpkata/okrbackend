package okr;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ObjectiveControllerTest {
	
	@Test
	public void createObjective() {
		
		ObjectiveController objectiveController= new ObjectiveController();
		Integer id = objectiveController.createObjective();
		assertThat(id).isEqualTo(1);
	}

}
