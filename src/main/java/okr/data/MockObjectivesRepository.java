package okr.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import okr.domain.Objective;

@Repository
public class MockObjectivesRepository implements ObjectiveRepository {

	private static Map<Integer, Objective> data = new HashMap<>();
	
	static {
		data.put(10, new Objective(10, "Expand business in asia", 20, List.of()));
	}
	
	@Override
	public Objective getById(int id) {
		return data.get(id);
	}

}
