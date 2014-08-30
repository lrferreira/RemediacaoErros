package module.entity;

public class WrongAnswer extends Answer{
	
	private int type;

	public WrongAnswer(String answer) {
		super(answer);
	}

	public WrongAnswer(String answer, int type) {
		super(answer);
		this.type = type;
	}
	
	public WrongAnswer() {

	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	

}
