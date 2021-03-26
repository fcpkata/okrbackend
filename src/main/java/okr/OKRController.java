package okr;

import org.springframework.web.bind.annotation.RestController;

import okr.retrive.ObjectiveKeyResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class OKRController {
	
	@Autowired
	public OKRController() {
		
	}

	@GetMapping("/objectives/{id}")
	public ObjectiveKeyResult index(Integer id) {
		return new ObjectiveKeyResult("",0,10,0.0);
	}
}
