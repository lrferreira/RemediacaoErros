package module.entity;

public class Criterion {

	private Long id;
	private String description;

	public Criterion(Long id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}