package okr.create;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import okr.model.Objective;
import okr.repository.MockObjectiveRepository;
import okr.repository.ObjectiveRepository;

public class ObjectiveRepositoryTest {
	
	ObjectiveRepository objectiveRepository;
	
	
	@BeforeEach
	void setup() {
		objectiveRepository = new MockObjectiveRepository();		
	}
	
	@Test
	public void shouldReturnObjective_byId() {
		
		Objective objective =  objectiveRepository.saveObjective(new Objective(1, 0,"Objective for OKR 1",0.0));
		
		assertThat(objective).isNotNull();
	}
	
	@Test 
	public void shouldReturnExpectedObjective() {
		
		Objective objective =  objectiveRepository.saveObjective(new Objective(1, 0,"Objective for OKR 1",0.0));
		Objective onboardObjective =  objectiveRepository.saveObjective(new Objective(2, 0,"Objective for OKR 2",0.0));
		
		assertThat(objective.getId()).isEqualTo(1);
		assertThat(onboardObjective.getId()).isEqualTo(2);
		
		assertThat(objective.getDescription()).isEqualTo("Objective for OKR 1");
		assertThat(onboardObjective.getDescription()).isEqualTo("Objective for OKR 2");
		
	}
}
