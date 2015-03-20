package module.author.expertise.creation.sorters.entity;

import java.io.Serializable;

public class SubErrorType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String description;
	private ErrorType errorType;

	public SubErrorType(Long id, String description, ErrorType errorType) {
		super();
		this.id = id;
		this.description = description;
		this.errorType = errorType;
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
	public ErrorType getErrorType() {
		return errorType;
	}
	public void setErrorType(ErrorType errorType) {
		this.errorType = errorType;
	}
	
}
