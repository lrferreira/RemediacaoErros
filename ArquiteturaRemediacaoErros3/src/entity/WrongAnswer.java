package entity;

public class WrongAnswer extends Answer{
	
	private int tipo;

	public WrongAnswer(String descricao) {
		super(descricao);
	}
	
	public WrongAnswer() {

	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	

}
