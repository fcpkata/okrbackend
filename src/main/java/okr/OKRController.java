package okr;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import okr.model.ProgressStatus;

@RestController
@RequestMapping("/objectives")
public class OKRController {

	
	@PatchMapping("/{okrId}/progress")
	public ResponseEntity<Void> updateOkrProgress(@PathVariable String okrId,@RequestBody ProgressStatus progressStatus) {
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
