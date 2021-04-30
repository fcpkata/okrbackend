package okr.retrive;

import org.springframework.stereotype.Service;

import okr.model.Objective;
import okr.repository.ObjectiveRepository;


@Service
public class RetrieveService {

	private ObjectiveRepository objectiveRepository;

	public RetrieveService(ObjectiveRepository objectiveRepository) {
		this.objectiveRepository = objectiveRepository;
	}

	public Objective retrieveObjectivesFor(int objectiveId) {
		return objectiveRepository.getById(objectiveId);
	}

}
