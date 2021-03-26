package okr.service;

import java.util.List;
import java.util.Optional;

import okr.model.OkrInformation;

public interface DataService {
	
	List<OkrInformation> fetchAllOkrs();
	
	Optional<OkrInformation> fetchOkrById(String id);

	void saveOkrFor(OkrInformation okrInformation);

}
