package okr.repository;

import okr.model.Objective;

public interface ObjectiveRepository {
	
	Objective saveObjective(Objective objective);

	Objective getById(Integer id);

}
