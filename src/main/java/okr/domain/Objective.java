package okr.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Objective {
	private int id;
	private String description;
	private float progress;
	List<Objective> keyResults;
}
