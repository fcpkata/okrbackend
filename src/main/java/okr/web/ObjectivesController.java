package okr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import okr.data.ObjectiveRepository;

@RestController
public class ObjectivesController {

	@Autowired
	private ObjectiveRepository repo;

	@GetMapping("/objectives/{id}")
	public ObjectivePayload retrieveObjective(@PathVariable("id") int id) {
		return new ObjectivePayload(repo.getById(id));
	}
}
