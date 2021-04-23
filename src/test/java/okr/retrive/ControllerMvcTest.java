package okr.retrive;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest(controllers = Controller.class)
public class ControllerMvcTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void shouldReturn200_forGetObjectiveEndpoint() throws Exception {
		
		mockMvc.perform(get("/getObjective/10")
				.header("content-type", MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk());
	}
}
