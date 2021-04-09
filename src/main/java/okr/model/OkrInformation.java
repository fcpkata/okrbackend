package okr.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OkrInformation {
	
	private Integer id;
	private Integer parentId;
	private String description;
	private Double progress;
	

}
