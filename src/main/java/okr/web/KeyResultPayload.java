package okr.web;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.NoArgsConstructor;
import okr.domain.Objective;

@NoArgsConstructor
public class KeyResultPayload {
	@JsonProperty("id")
	private int id;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("progress")
	private float progress;
	
	public KeyResultPayload(Objective keyResult) {
		this.id = keyResult.getId();
		this.description = keyResult.getDescription();
		this.progress = keyResult.getProgress();
	}
}
