package module.entity;

import java.util.ArrayList;

public class MultipleExternalRepresentation {

	private int id;
	
	private String description;
	
	private String [] tags;
	
	private String path;
	
	private Integer complexity;
	
	private ArrayList<MERFunction> merFunctions;
	
	private ArrayList<TypeMER> typeMers;
	
	public MultipleExternalRepresentation(int id, String path, String descricao) {
		this.id = id;
		this.setDescription(descricao);
		this.setPath(path);
		
	}



	public MultipleExternalRepresentation() {
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String [] getTags() {
		return tags;
	}



	public void setTags(String [] tags) {
		this.tags = tags;
	}


	public Integer getComplexity() {
		return complexity;
	}



	public void setComplexity(Integer complexity) {
		this.complexity = complexity;
	}



	public ArrayList<MERFunction> getMerFunctions() {
		return merFunctions;
	}



	public void setMerFunctions(ArrayList<MERFunction> merFunctions) {
		this.merFunctions = merFunctions;
	}



	public ArrayList<TypeMER> getTypeMers() {
		return typeMers;
	}



	public void setTypeMers(ArrayList<TypeMER> typeMers) {
		this.typeMers = typeMers;
	}



	public String getPath() {
		return path;
	}



	public void setPath(String path) {
		this.path = path;
	}

	
	
}
