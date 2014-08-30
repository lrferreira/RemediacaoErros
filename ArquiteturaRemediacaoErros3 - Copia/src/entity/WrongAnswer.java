package entity;

public class WrongAnswer extends Answer{
	
	private int tipo;

	public WrongAnswer(String descricao) {
		super(descricao);
	}

	public WrongAnswer(String descricao, int tipo) {
		super(descricao);
		this.tipo = tipo;
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
