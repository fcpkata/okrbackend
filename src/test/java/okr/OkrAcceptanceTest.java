package okr;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import okr.web.ObjectivePayload;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class OkrAcceptanceTest {
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void testGetObjectivesShouldReturnData() {
		ObjectivePayload response = restTemplate.getForObject("/objectives/10", ObjectivePayload.class);
		assertThat(response.getId()).isEqualTo(10);
	}
}
