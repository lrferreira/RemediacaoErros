package entity;

public class MultipleExternalRepresentacion {

	private int id;
	
	private String descricao;

	public MultipleExternalRepresentacion(int id, String descricao) {
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

	
	
}
