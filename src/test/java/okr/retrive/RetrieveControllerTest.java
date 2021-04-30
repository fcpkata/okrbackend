package okr.retrive;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import okr.model.Objective;
import okr.repository.ObjectiveRepository;

@ExtendWith(MockitoExtension.class)
public class RetrieveControllerTest {

	@Mock
	private ObjectiveRepository objectiveRepository;

	@Test
	public void controllerReturnsHelloText() {
		when(objectiveRepository.getById(any())).thenReturn(Objective.builder()
																	.id(10)
																	.parentId(0)
																	.progress(10.00)
																	.description("Objective description")
																	.build());
		
		
		RetrieveController controller = new RetrieveController(objectiveRepository);
		
		ResponseEntity<Objective> response = controller.retrive(10);
		
		assertThat(response.getBody().getId()).isEqualTo(10);
		assertThat(response.getBody().getDescription()).isEqualTo("Objective description");
		assertThat(response.getBody().getParentId()).isEqualTo(0);
		assertThat(response.getBody().getProgress()).isEqualTo(10.00);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}
}
