package okr.create;

import org.springframework.stereotype.Service;

import okr.model.Objective;
import okr.repository.ObjectiveRepository;

@Service
public class ObjectiveService {

	private ObjectiveRepository objectiveRepository;

	public ObjectiveService(ObjectiveRepository objectiveRepository) {
		this.objectiveRepository = objectiveRepository;
	}

	public Objective createObjective(String description) {
		return objectiveRepository.saveObjective(description);
	}

}
