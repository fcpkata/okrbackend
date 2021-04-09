package okr.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
public class ObjectivesControllerMvcTest {
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void shouldRetrieveObjectiveGivenId() throws Exception {
		mockMvc.perform(get("/objectives/10"))
			.andExpect(status().isOk());
	}
}
