package module.entity;

import br.ufpr.c3sl.condigital.virtualkeyboard.communication.KeyBoardComunication;
import br.ufpr.c3sl.condigital.virtualkeyboard.main.VirtualKeyBoardMain;


public class Answer {
	
	private VirtualKeyBoardMain keyboard;
	private KeyBoardComunication communication;

	private String value;
	
	public Answer(String value){
		this.setValue(value);
	}
	
	public Answer(){

	}

	
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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	
}
