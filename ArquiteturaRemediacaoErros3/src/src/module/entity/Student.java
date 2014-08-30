package module.entity;

import java.util.ArrayList;

public class Student {

	
	private String nome;
	
	private ArrayList<Action> actions;

	public Student(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Action> getActions() {
		return actions;
	}

	public void setActions(ArrayList<Action> actions) {
		this.actions = actions;
	}
}
