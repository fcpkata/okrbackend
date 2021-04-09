package okr.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import okr.model.OkrInformation;

public class MockDataService implements DataService {
	
	private static List<OkrInformation> okrInformations = new ArrayList<>();
	
	static {
		okrInformations.add(OkrInformation.builder()
										  .id(10)
										  .parentId(0)
										  .description("Objective Description")
										  .build());
	}

	@Override
	public List<OkrInformation> fetchAllOkrs() {
		return okrInformations;
	}

	@Override
	public Optional<OkrInformation> fetchOkrById(Integer id) {
		return okrInformations.stream()
							  .filter(okr -> id == okr.getId())
							  .findFirst();
	}

	@Override
	public void saveOkrFor(OkrInformation okrInformation) {
		
		Optional<OkrInformation> existingOkrInformation = fetchOkrById(okrInformation.getId());
		
		int indexOf = okrInformations.indexOf(existingOkrInformation.get());
		
		okrInformations.remove(indexOf);
				
		okrInformations.add(okrInformation);
		
	}

}
