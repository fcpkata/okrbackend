package okr.create;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import okr.model.Objective;
import okr.repository.ObjectiveRepository;
@ExtendWith(MockitoExtension.class)
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
		
		when(objectiveRepository.saveObjective(anyString())).thenReturn(new Objective(1, 0, "New Description", 0.0));
		
		Objective objective = objectiveService.createObjective("New Description");
		assertThat(objective.getId()).isEqualTo(1);
	}

}
