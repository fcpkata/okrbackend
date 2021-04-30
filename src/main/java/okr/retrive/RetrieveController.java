package okr.retrive;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import okr.model.Objective;
import okr.repository.ObjectiveRepository;


@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class RetrieveController {
	
	private ObjectiveRepository objectiveRepository;

	public RetrieveController(ObjectiveRepository objectiveRepository) {
		this.objectiveRepository = objectiveRepository;
	}

	@RequestMapping(path = "/objectives/{id}", produces = "application/json", consumes = "application/json")
	public ResponseEntity<Objective> retrive(@PathVariable("id") Integer id) {
		
		 return ResponseEntity.status(HttpStatus.OK)
					  					.body(objectiveRepository.getById(id));
	}
}
