package module.entity;

import java.util.Observable;
import java.util.Observer;

import br.ufpr.c3sl.condigital.virtualkeyboard.communication.KeyBoardComunication;
import br.ufpr.c3sl.condigital.virtualkeyboard.formula.ElementOfFormula;
import br.ufpr.c3sl.condigital.virtualkeyboard.main.VirtualKeyBoardMain;

public class Answer {
	
	private VirtualKeyBoardMain keyboard;
	private KeyBoardComunication communication;

	private String [] answers;
			
	
	public Answer(String[] answers) {
		this.setAnswers(answers);
	}
	
	public Answer(){

	}

	public String [] getAnswers() {
		return answers;
	}

	public void setAnswers(String [] answers) {
		this.answers = answers;
	}

	/*
	@Override
	public void update(Observable o, Object arg) {
		ElementOfFormula form = keyboard.getFormula().getClone();
		answers.form.getClone().toString();
		keyboard.setVisible(false);
	}
*/
	public VirtualKeyBoardMain getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(VirtualKeyBoardMain keyboard) {
		this.keyboard = keyboard;
	}

	public KeyBoardComunication getCommunication() {
		return communication;
	}

	public void setCommunication(KeyBoardComunication communication) {
		this.communication = communication;
	}

	
}
