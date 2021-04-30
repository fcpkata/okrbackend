package okr.retrive;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import okr.model.Objective;
import okr.repository.ObjectiveRepository;


public class ControllerAcceptanceTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	private ObjectiveRepository objectiveRepository;
	
	@Test
	public void shouldReturn200_forGetObjectiveEndpoint() throws Exception {
		
		when(objectiveRepository.getById(any())).thenReturn(Objective.builder()
				.id(10)
				.parentId(0)
				.progress(10.00)
				.description("Objective description")
				.build());
		
		mockMvc.perform(get("/getObjective/10")
				.header("content-type", MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value("10"))
				.andExpect(jsonPath("$.description").value("Objective description"))
				.andExpect(jsonPath("$.progress").value("10.0"));
	}
	
	private RestTemplate restTemplate;
	
	@BeforeEach
	public void setup() {
		restTemplate = new RestTemplate();
	}
	
	
	@Test
	void shouldReturn200_forRetrieveObjective() throws Exception {
//		restTemplate.getForObject("http://localhost:8081/okrservice/objectives/1", responseType);
	}
	
}
