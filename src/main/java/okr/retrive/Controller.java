package okr.retrive;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/")
	public Objective retrive() {
		return new Objective();
	}
}
