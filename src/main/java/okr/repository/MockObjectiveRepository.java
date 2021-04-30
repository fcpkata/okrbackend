package okr.repository;

import java.util.HashMap;
import java.util.Map;

import okr.model.Objective;

public class MockObjectiveRepository implements ObjectiveRepository {

	private Map<Integer, Objective> objectiveMap;
	
	public MockObjectiveRepository() {
		objectiveMap = new HashMap<>();
		objectiveMap.put(1, new Objective(1, 0, "Default objective", 0.0));
	}

	@Override
	public Objective saveObjective(Objective objective) {
		
		objectiveMap.put(objectiveMap.size() + 1, objective);
		
		return objectiveMap.get(objectiveMap.size());
	}

	@Override
	public Objective getById(Integer id) {
		return null;
	}
}
