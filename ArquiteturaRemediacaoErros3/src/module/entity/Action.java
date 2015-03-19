package module.entity;

import java.util.Date;

public class Action {

	/*Ac~ao: Se refere a etapa do processo de resoluc~ao em que o aprendiz se encontra. Esse
fato ira permitir uma instruc~ao para o aprendiz (remediac~ao) antes que o processo
de resoluc~ao nal seja apresentado, ou seja, a etapa da resoluc~ao para o tipo de
MRE a ser apresentado depende desta informac~ao;*/
	
	private Answer answer;
	
	private Integer attempt;
	
	private Student student;
	
	private Goal goal;
	
	private Boolean correct;
	
	private Date date;

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Integer getAttempt() {
		return attempt;
	}

	public void setAttempt(Integer attempt) {
		this.attempt = attempt;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Goal getGoal() {
		return goal;
	}

	public void setGoal(Goal goal) {
		this.goal = goal;
	}

	public Boolean getCorrect() {
		return correct;
	}

	public void setCorrect(Boolean correct) {
		this.correct = correct;
	}
	
	public boolean isCorrect(){
		return this.correct;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
