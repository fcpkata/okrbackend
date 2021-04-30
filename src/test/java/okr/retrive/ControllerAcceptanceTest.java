package okr.retrive;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import okr.model.Objective;
import okr.repository.ObjectiveRepository;


public class ControllerAcceptanceTest {
	
	private RestTemplate restTemplate;
	
	@BeforeEach
	public void setup() {
		restTemplate = new RestTemplate();
	}
	
	
	@Test
	void shouldReturn200_forRetrieveObjective() throws Exception {
		ResponseEntity<Objective> response = restTemplate.exchange("http://localhost:8081/okrservice/objectives/1", HttpMethod.GET, prepareEntity(), Objective.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(response.getBody().getId()).isEqualTo(1);
		assertThat(response.getBody().getDescription()).isEqualTo("Default objective");
		assertThat(response.getBody().getProgress()).isEqualTo(0.0);
		assertThat(response.getBody().getParentId()).isEqualTo(0);
	}
	
	@Test
	void shouldReturn404_forRetrieveObjective_whenIdIsNotAvailable() throws Exception {
		ResponseEntity<Objective> response = restTemplate.exchange("http://localhost:8081/okrservice/objectives/5", HttpMethod.GET, prepareEntity(), Objective.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
	}


	private HttpEntity<Object> prepareEntity() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		HttpEntity<Object> entity = new HttpEntity<>(headers);
		return entity;
	}
	
}
