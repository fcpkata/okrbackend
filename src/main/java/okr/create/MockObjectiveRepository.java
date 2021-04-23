package okr.create;

import java.util.HashMap;
import java.util.Map;

import okr.model.Objective;
import okr.repository.ObjectiveRepository;

public class MockObjectiveRepository implements ObjectiveRepository {

	private Map<Integer, Objective> objectiveMap = new HashMap<>();

	@Override
	public Objective saveObjective(String description) {
		
		objectiveMap.put(objectiveMap.size() + 1, new Objective(objectiveMap.size() + 1, description));
		
		return objectiveMap.get(objectiveMap.size());
	}

	@Override
	public okr.retrive.Objective getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
