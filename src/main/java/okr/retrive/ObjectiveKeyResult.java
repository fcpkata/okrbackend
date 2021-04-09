package okr.retrive;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
@Getter
public class ObjectiveKeyResult {
	
	String description;
	Integer parentId;
	Integer id;
	Double progress;	
}
