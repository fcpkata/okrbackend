package okr.retrive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import okr.repository.ObjectiveRepository;

@ExtendWith(MockitoExtension.class)
class RetrieveServiceTest {
	
	@Mock
	private ObjectiveRepository objectiveRepository;
	
	private RetrieveService retrieveService;
	
	@BeforeEach
	public void setup() {
		retrieveService = new RetrieveService(objectiveRepository);
	}

	@Test
	void retrieveObjectiveFromRepository() {
		retrieveService.retrieveObjectivesFor(1);
	}

}
