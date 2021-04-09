package okr.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import okr.domain.Objective;

@RestController
public class ObjetivesController {

	@GetMapping("/objectives/{id}")
	public Objective retrieveObjective() {
		return null;
	}
}
