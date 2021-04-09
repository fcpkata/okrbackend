package okr.web;

import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonProperty;

import okr.domain.Objective;

public class ObjectivePayload {
	@JsonProperty("id")
	private int id;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("progress")
	private float progress;
	
	@JsonProperty("keyResults")
	List<KeyResultPayload> keyResults;

	public ObjectivePayload(Objective objective) {
		this.id = objective.getId();
		this.description = objective.getDescription();
		this.progress = objective.getProgress();
		this.keyResults = objective.getKeyResults().stream()
				.map(KeyResultPayload::new)
				.collect(Collectors.toList());
	}
}
