package okr.create;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objectives")
public class ObjectiveController {

	private ObjectiveService objectiveService;

	public ObjectiveController(ObjectiveService objectiveService) {
		this.objectiveService = objectiveService;
	}

	@PostMapping("/create")
	public Integer createObjective(@RequestBody String description) {
		
		if(description != null) {
			throw new RuntimeException("Bad Request");
		}
		
		return objectiveService.createObjective(description).getId();
	}

}
