package okr;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import okr.model.ProgressStatus;

class OKRControllerTest {
	
	private OKRController okrController;
	
	@Before
	public void setup() {
		okrController = new OKRController();
	}

	@Test
	public void updatesOkrProgressForTheId() {
		ResponseEntity<Void> responseEntity = okrController.updateOkrProgress("10", ProgressStatus.builder().value("50%").build());
		assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.CREATED);
	}

}
