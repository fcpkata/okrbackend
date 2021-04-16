package okr;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObjectiveController {

	@PostMapping("/create")
	public Integer createObjective() {
		return 1;
	}

}
