package module.entity;

import java.util.ArrayList;

public class MultipleExternalRepresentation {

	private int id;
	
	private String descricao;
	
	private String [] tags;
	
	private String imageName;
	
	private Integer complexity;
	
	private ArrayList<MERFunction> merFunctions;
	
	private ArrayList<TypeMER> typeMers;
	
	public MultipleExternalRepresentation(int id, String imageName, String descricao) {
		this.id = id;
		this.setDescricao(descricao);
		this.setImageName(imageName);
		
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



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public String [] getTags() {
		return tags;
	}



	public void setTags(String [] tags) {
		this.tags = tags;
	}


	public String getImageName() {
		return imageName;
	}



	public void setImageName(String imageName) {
		this.imageName = imageName;
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

	
	
}
