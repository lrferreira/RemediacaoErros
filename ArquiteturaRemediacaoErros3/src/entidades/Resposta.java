package entidades;

import java.util.Observable;
import java.util.Observer;

import br.ufpr.c3sl.condigital.virtualkeyboard.communication.KeyBoardComunication;
import br.ufpr.c3sl.condigital.virtualkeyboard.formula.ElementOfFormula;
import br.ufpr.c3sl.condigital.virtualkeyboard.main.VirtualKeyBoardMain;

public class Resposta implements Observer{
	
	private VirtualKeyBoardMain keyboard;
	private KeyBoardComunication communication;

	private String descricao;
		
	
	public Resposta(String descricao) {
		this.setDescricao(descricao);
	}
	
	public Resposta(){

	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public void update(Observable o, Object arg) {
		ElementOfFormula form = keyboard.getFormula().getClone();
		descricao = form.getClone().toString();
		keyboard.setVisible(false);
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

	
}
