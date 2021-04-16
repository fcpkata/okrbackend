package okr.create;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class ObjectiveControllerTest {
	
	@Mock
	ObjectiveService objectiveService;
	
	private ObjectiveController objectiveController;
	
	@BeforeEach
	void setup() {
		objectiveController = new ObjectiveController(objectiveService);
		
	}
	
	@Test
	public void createsObjectiveForADescription() {
		
		Integer id = objectiveController.createObjective("Objective for OKR 1");
		assertThat(id).isEqualTo(1);
	}
	
	@Test
	void shouldThrowBadRequestException_whenDescriptionIsNull() throws Exception {
		
		assertThatThrownBy(() -> objectiveController.createObjective("Objective for OKR 1"))
					.isInstanceOf(RuntimeException.class)
					.hasMessage("Bad Request");
	}

}
