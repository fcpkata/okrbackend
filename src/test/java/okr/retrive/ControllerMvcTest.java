package okr.retrive;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
public class ControllerMvcTest {
	
//	@Autowired
//	MockMvc mockMvc;
//
//	@Test
//	public void controllerReturnsHelloText() throws Exception {
//		
//		mockMvc.perform(get("/getObjective/10")).andExpect(status().isOk());
//	}
}
