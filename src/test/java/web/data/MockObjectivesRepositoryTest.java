package web.data;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

import okr.data.MockObjectivesRepository;
import okr.data.ObjectiveRepository;
import okr.domain.Objective;

public class MockObjectivesRepositoryTest {

	@Test
	public void shouldRetriveObjectById() {
		ObjectiveRepository repo = new MockObjectivesRepository();
		Objective obj = repo.getById(10);
		assertThat(obj.getId()).isEqualTo(10);
		assertThat(obj.getDescription()).isEqualTo("Expand business in asia");
		assertThat(obj.getProgress()).isEqualTo(20);
		assertThat(obj.getKeyResults()).isEqualTo(List.of());
	}
}
