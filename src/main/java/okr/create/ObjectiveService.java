package okr.create;

import okr.model.Objective;
import okr.model.ObjectiveRequest;
import okr.repository.ObjectiveRepository;

public class ObjectiveService {

	private ObjectiveRepository objectiveRepository;

	public ObjectiveService(ObjectiveRepository objectiveRepository) {
		this.objectiveRepository = objectiveRepository;
	}

	public Objective createObjective(ObjectiveRequest objectiveRequest) {
		
		return objectiveRepository.saveObjective(Objective.builder().description(objectiveRequest.getDescription()).parentId(objectiveRequest.getParentId()).build());
	}

}
