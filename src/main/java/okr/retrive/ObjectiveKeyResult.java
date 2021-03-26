package okr.retrive;

public class ObjectiveKeyResult {
	
	String description;
	Integer parentId;
	Integer id;
	Double progress;
	
	
	
	public ObjectiveKeyResult(String description, Integer parentId, Integer id, Double progress) {
		super();
		this.description = description;
		this.parentId = parentId;
		this.id = id;
		this.progress = progress;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getProgress() {
		return progress;
	}
	public void setProgress(Double progress) {
		this.progress = progress;
	}
	
}
