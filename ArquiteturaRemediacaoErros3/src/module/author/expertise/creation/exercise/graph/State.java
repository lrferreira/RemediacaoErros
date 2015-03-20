package module.author.expertise.creation.exercise.graph;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JTextField;

public class State {
	
	private int id;

	private HashMap map;

	public State(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
		map = new HashMap();
	}

	public State(int id, HashMap map) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.map = map;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public HashMap getMap() {
		return map;
	}

	public void setMap(HashMap map) {
		this.map = map;
	}
	
}
