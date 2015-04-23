package module.entity;

import module.author.expertise.creation.sorters.entity.ErrorType;

public class WrongAnswer extends Answer{
	
	private ErrorType errorType;

	public WrongAnswer(String answer) {
		super(answer);
	}

	public WrongAnswer(String answer, ErrorType errorType) {
		super(answer);
		this.setErrorType(errorType);
	}
	
	public WrongAnswer() {

	}

	public ErrorType getErrorType() {
		return errorType;
	}

	public void setErrorType(ErrorType errorType) {
		this.errorType = errorType;
	}

	

}
