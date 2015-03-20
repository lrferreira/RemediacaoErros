package module.entity;

public class WrongAnswer extends Answer{
	
	private ErrorType type;

	public WrongAnswer(String [] answers) {
		super(answers);
	}

	public WrongAnswer(String [] answers, ErrorType type) {
		super(answers);
		this.type = type;
	}
	
	public WrongAnswer() {

	}

	public ErrorType getType() {
		return type;
	}

	public void setType(ErrorType type) {
		this.type = type;
	}

	

}
