package module.entity;

public class WrongAnswer extends Answer{
	
	private int type;

	public WrongAnswer(String [] answers) {
		super(answers);
	}

	public WrongAnswer(String [] answers, int type) {
		super(answers);
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
