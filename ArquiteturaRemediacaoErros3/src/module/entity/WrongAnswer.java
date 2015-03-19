package module.entity;

public class WrongAnswer extends Answer{
	
	private Integer type;

	public WrongAnswer(String answer) {
		super(answer);
	}

	public WrongAnswer(String answer, Integer type) {
		super(answer);
		this.type = type;
	}
	
	public WrongAnswer() {

	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	

}
