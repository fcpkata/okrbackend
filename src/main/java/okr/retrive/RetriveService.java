package okr.retrive;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import okr.model.OkrInformation;
import okr.service.DataService;

@Service
public class RetriveService {

	private DataService dataService;

	@Autowired
	public RetriveService(DataService dataService) {
		this.dataService = dataService;

	}

	public ObjectiveKeyResult getOkrById(Integer id) {
		Optional<OkrInformation> fetchOkrById = dataService.fetchOkrById(id);
		OkrInformation okrInformation = fetchOkrById.get();
		return ObjectiveKeyResult.builder().id(okrInformation.getId()).parentId(okrInformation.getParentId())
				.description(okrInformation.getDescription()).progress(okrInformation.getProgress()).build();

	}

}
