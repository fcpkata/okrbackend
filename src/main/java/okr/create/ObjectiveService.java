package okr.create;

import okr.model.Objective;
import okr.repository.ObjectiveRepository;

public class ObjectiveService {

	private ObjectiveRepository objectiveRepository;

	public ObjectiveService(ObjectiveRepository objectiveRepository) {
		this.objectiveRepository = objectiveRepository;
	}

	public Objective createObjective(String description) {
		return objectiveRepository.saveObjective(description);
	}

}
