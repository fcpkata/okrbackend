package okr.web;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import okr.data.ObjectiveRepository;
import okr.domain.Objective;

@Tag("Integration")
@WebMvcTest
public class ObjectivesControllerMvcTest {
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ObjectiveRepository repo;
	
	@Test
	public void shouldRetrieveObjectiveGivenId() throws Exception {
		when(repo.getById(10)).thenReturn(new Objective(10, "Expand business in asia", 20, List.of()));
		
		mockMvc.perform(get("/objectives/10"))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.id").value("10"))
			.andExpect(jsonPath("$.description").value("Expand business in asia"))
			.andExpect(jsonPath("$.progress").value("20.0"));
	}
	
	@Test
	public void shouldRetrieveKeyResults() throws Exception {
		Objective keyResult = new Objective(11, "Show charging points in CarPass app", 0, List.of());
		when(repo.getById(10)).thenReturn(new Objective(10, "Expand business in asia", 20, List.of(keyResult)));
		
		mockMvc.perform(get("/objectives/10"))
			.andExpect(jsonPath("$.keyResults[0].id").value("11"))
			.andExpect(jsonPath("$.keyResults[0].description").value("Show charging points in CarPass app"))
			.andExpect(jsonPath("$.keyResults[0].progress").value("0.0"));
	}

	@Test
	public void shouldNotReturnChildrenForKeyResults() throws Exception {
		Objective keyResult = new Objective(11, "Show charging points in CarPass app", 0, List.of());
		when(repo.getById(10)).thenReturn(new Objective(10, "Expand business in asia", 20, List.of(keyResult)));
		
		mockMvc.perform(get("/objectives/10"))
			.andExpect(jsonPath("$.keyResults[0].keyResults").doesNotExist());
	}
}
