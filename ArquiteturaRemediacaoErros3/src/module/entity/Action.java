package module.entity;

import java.util.ArrayList;
import java.util.Date;



public class Action {

	/*Ac~ao: Se refere a etapa do processo de resoluc~ao em que o aprendiz se encontra. Esse
fato ira permitir uma instruc~ao para o aprendiz (remediac~ao) antes que o processo
de resoluc~ao nal seja apresentado, ou seja, a etapa da resoluc~ao para o tipo de
MRE a ser apresentado depende desta informac~ao;*/
	

	private Long id;
	
	private Answer answer;
	
	private Integer attempt;
	
	private Student student;
	
	private Goal goal;
	
	private Boolean correct;
	
	private Date date;
	
	private  Remediation remediation;
	
	private MultipleExternalRepresentation mer;

	private ArrayList<String> regrasAcionadas;
	
	
	public Action() {
		super();
		
	}
	
	
	public Action(Long id, Answer answer, Integer attempt, Student student,
			Goal goal, Boolean correct, Date date, Remediation remediation,
			MultipleExternalRepresentation mer,
			ArrayList<String> regrasAcionadas) {
		super();
		this.id = id;
		this.answer = answer;
		this.attempt = attempt;
		this.student = student;
		this.goal = goal;
		this.correct = correct;
		this.date = date;
		this.remediation = remediation;
		this.mer = mer;
		this.regrasAcionadas = regrasAcionadas;
	}

	
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

	public Remediation getRemediation() {
		return remediation;
	}

	public void setRemediation(Remediation remediation) {
		this.remediation = remediation;
	}

	public MultipleExternalRepresentation getMer() {
		return mer;
	}

	public void setMer(MultipleExternalRepresentation mer) {
		this.mer = mer;
	}

	public ArrayList<String> getRegrasAcionadas() {
		return regrasAcionadas;
	}

	public void setRegrasAcionadas(ArrayList<String> regrasAcionadas) {
		this.regrasAcionadas = regrasAcionadas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
