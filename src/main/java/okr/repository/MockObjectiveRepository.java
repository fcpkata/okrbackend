package okr.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import okr.model.Objective;

@Component
public class MockObjectiveRepository implements ObjectiveRepository {

	private Map<Integer, Objective> objectiveMap;
	
	public MockObjectiveRepository() {
		objectiveMap = new HashMap<>();
		objectiveMap.put(1, new Objective(1, 0, "Default objective", 0.0));
	}

	@Override
	public Objective saveObjective(String description) {
		
		objectiveMap.put(objectiveMap.size() + 1, new Objective(objectiveMap.size() + 1,0, description, 0.0));
		
		return objectiveMap.get(objectiveMap.size());
	}

	@Override
	public okr.model.Objective getById(Integer id) {
		
		return objectiveMap.get(id);
	}
}
