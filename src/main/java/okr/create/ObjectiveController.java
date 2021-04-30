package okr.create;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import okr.model.ObjectiveRequest;

@RestController
@RequestMapping("/objectives")
public class ObjectiveController {

	private ObjectiveService objectiveService;

	public ObjectiveController(ObjectiveService objectiveService) {
		this.objectiveService = objectiveService;
	}

	@PostMapping("/create")
	public Integer createObjective(@RequestBody ObjectiveRequest objectiveRequest) {
		
		if(objectiveRequest.getDescription() == null || objectiveRequest.getDescription() == "") {
			throw new RuntimeException("Missing Description");
		}
		
		return objectiveService.createObjective(objectiveRequest).getId();
	}

}
