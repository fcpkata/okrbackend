package okr.create;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import okr.model.Objective;
import okr.model.ObjectiveRequest;

@ExtendWith(MockitoExtension.class)
public class ObjectiveControllerTest {
	
	@Mock
	ObjectiveService mockObjectiveService;
	
	@Mock
	ObjectiveRequest objRequest;
	
	private ObjectiveController objectiveController;
	
	@BeforeEach
	void setup() {
		objectiveController = new ObjectiveController(mockObjectiveService);
		
	}
	
	@Test
	public void createsObjectiveForADescription() {
		
		when(mockObjectiveService.createObjective(objRequest)).thenReturn(new Objective(1, 0,"Objective for OKR 1",0.0));
		
		Integer id = objectiveController.createObjective(objRequest);
		assertThat(id).isEqualTo(1);
	}
	
//	@Test
//	void shouldThrowBadRequestException_whenDescriptionIsNull() throws Exception {
//		
//		assertThatThrownBy(() -> objectiveController.createObjective(objRequest))
//					.isInstanceOf(RuntimeException.class);
//	}

}
