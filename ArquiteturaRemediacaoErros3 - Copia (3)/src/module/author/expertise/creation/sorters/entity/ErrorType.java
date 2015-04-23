package module.author.expertise.creation.sorters.entity;

import java.io.Serializable;
import java.util.ArrayList;


public class ErrorType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String description;
	private ArrayList<SubErrorType> subErrorTypes;

	public ErrorType(Long id, String description, ArrayList<SubErrorType> subErrorTypes) {
		super();
		this.id = id;
		this.description = description;
		this.subErrorTypes = subErrorTypes;
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
	public ArrayList<SubErrorType> getSubErrorTypes() {
		return subErrorTypes;
	}
	public void setSubErrorType(ArrayList<SubErrorType> subErrorTypes) {
		this.subErrorTypes = subErrorTypes;
	}
	
}
