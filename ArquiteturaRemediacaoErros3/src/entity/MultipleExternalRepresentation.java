package entity;

public class MultipleExternalRepresentation {

	private int id;
	
	private String descricao;
	
	private String [] tags;

	public MultipleExternalRepresentation(int id, String descricao) {
		this.id = id;
		this.setDescricao(descricao);
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

	
	
}
