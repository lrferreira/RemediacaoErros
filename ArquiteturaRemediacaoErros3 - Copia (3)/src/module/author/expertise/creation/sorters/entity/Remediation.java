package module.author.expertise.creation.sorters.entity;

import java.io.Serializable;
import java.util.ArrayList;

import module.entity.MultipleExternalRepresentation;

public class Remediation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String description;
	private ArrayList<MultipleExternalRepresentation> mers;

	public Remediation(Long id, String description,
			ArrayList<MultipleExternalRepresentation> mers) {
		super();
		this.id = id;
		this.description = description;
		this.mers = mers;
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
	public ArrayList<MultipleExternalRepresentation> getMers() {
		return mers;
	}
	public void setMers(ArrayList<MultipleExternalRepresentation> mers) {
		this.mers = mers;
	}
	
}
