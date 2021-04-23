package okr.repository;

import okr.model.Objective;

public interface ObjectiveRepository {
	
	Objective saveObjective(String description);

	okr.retrive.Objective getById(Integer id);

}
