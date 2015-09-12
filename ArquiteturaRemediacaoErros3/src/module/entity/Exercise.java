package module.entity;

import java.util.ArrayList;

public class Exercise {

	private Long id;
	private ArrayList<Question> questions;

	public Exercise(Long id, ArrayList<Question> questions) {
		super();
		this.id = id;
		this.questions = questions;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ArrayList<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}
	
	
	
	
	
}
