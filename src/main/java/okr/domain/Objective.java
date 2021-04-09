package okr.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Objective {
	@JsonProperty("id")
	private int id;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("progress")
	private float progress;
}
