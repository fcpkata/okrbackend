package okr.create;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import okr.model.Objective;
import okr.repository.ObjectiveRepository;

class ObjectiveServiceTest {
	
	@Mock
	private ObjectiveRepository objectiveRepository;
	
	ObjectiveService objectiveService;

	@BeforeEach
	void setup() {
		objectiveService = new ObjectiveService(objectiveRepository);		
	}

	@Test
	void createsANewObjective() {
		
		when(objectiveRepository.saveObjective(anyString())).thenReturn(new Objective(1, "New Description"));
		
		Objective objective = objectiveService.createObjective("New Description");
		assertThat(objective.getId()).isEqualTo(1);
	}

}
