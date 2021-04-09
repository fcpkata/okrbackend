package okr;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OkrController {

	@RequestMapping("/")
	public String index() {
		return "Hello, world";
	}
}
