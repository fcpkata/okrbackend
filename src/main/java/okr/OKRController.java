package okr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import okr.model.ProgressStatus;
import okr.retrive.ObjectiveKeyResult;
import okr.retrive.RetriveService;

@RestController
@RequestMapping("/objectives")
public class OKRController {
	
	private RetriveService retriveService;

	@Autowired
	public OKRController(RetriveService retriveService) {
		this.retriveService = retriveService;
		
	}
	
	@PatchMapping("/{okrId}/progress")
	public ResponseEntity<Void> updateOkrProgress(@PathVariable String okrId,@RequestBody ProgressStatus progressStatus) {
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@GetMapping("/objectives/{id}")
	public ObjectiveKeyResult index(Integer id) {
		return retriveService.getOkrById(id);
	}
}
