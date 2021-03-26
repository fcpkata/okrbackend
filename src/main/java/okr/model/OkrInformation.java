package okr.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OkrInformation {
	
	private String id;
	private String parentId;
	private String description;
	private Double progress;
	

}
