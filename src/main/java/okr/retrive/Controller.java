package okr.retrive;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import okr.repository.ObjectiveRepository;


@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class Controller {
	
	private ObjectiveRepository objectiveRepository;

	public Controller(ObjectiveRepository objectiveRepository) {
		this.objectiveRepository = objectiveRepository;
	}

	@GetMapping("/getObjective/{id}")
	public ResponseEntity<Objective> retrive(@PathVariable("id") Integer id) {
		return new ResponseEntity<Objective>(objectiveRepository.getById(id), HttpStatus.OK);
	}
}
