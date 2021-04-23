package okr.create;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import okr.model.Objective;
import okr.repository.ObjectiveRepository;

public class ObjectiveRepositoryTest {
	
	ObjectiveRepository objectiveRepository;
	
	@BeforeEach
	void setup() {
		objectiveRepository = new MockObjectiveRepository();		
	}
	
	@Test
	public void shouldReturnObjective_byId() {
		
		Objective objective =  objectiveRepository.saveObjective("Expand business");
		
		assertThat(objective).isNotNull();
	}
	
	@Test 
	public void shouldReturnExpectedObjective() {
		
		Objective objective =  objectiveRepository.saveObjective("Expand business");
		Objective onboardObjective =  objectiveRepository.saveObjective("Onboard more customer");
		
		assertThat(objective.getId()).isEqualTo(1);
		assertThat(onboardObjective.getId()).isEqualTo(2);
		
		assertThat(objective.getDescription()).isEqualTo("Expand business");
		assertThat(onboardObjective.getDescription()).isEqualTo("Onboard more customer");
		
	}
}
