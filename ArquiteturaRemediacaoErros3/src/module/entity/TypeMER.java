package module.entity;

public class TypeMER {

	private Long id;
	private String description;

	public TypeMER(Long id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (obj == null) {
	        return false;
	    } else if (!this.getId().equals(((TypeMER)obj).getId())) {
	    	return false;
	    }
	    return true;
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
