package module.entity;

public class QuestionInitialState {
	
	private Question question;
	private String component;
	private String value;

	public QuestionInitialState(Question question, String component,
			String value) {
		super();
		this.question = question;
		this.component = component;
		this.value = value;
	}
	
	public String getComponent() {
		return component;
	}
	public void setComponent(String component) {
		this.component = component;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	

}
