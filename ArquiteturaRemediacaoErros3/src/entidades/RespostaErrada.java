package entidades;

public class RespostaErrada extends Resposta{
	
	private int tipo;

	public RespostaErrada(String descricao) {
		super(descricao);
	}
	
	public RespostaErrada() {

	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	

}
