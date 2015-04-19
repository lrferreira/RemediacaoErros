package module.entity;

import java.util.ArrayList;

public class Exercise {

	private Long id;
	private String enunciate;
	private ArrayList<Path> paths;
	private ArrayList<ExerciseInitialState> initialState;
	
	public Exercise(Long id, String enunciate, ArrayList<Path> paths,
			ArrayList<ExerciseInitialState> initialState) {
		super();
		this.id = id;
		this.enunciate = enunciate;
		this.paths = paths;
		this.initialState = initialState;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEnunciate() {
		return enunciate;
	}
	public void setEnunciate(String enunciate) {
		this.enunciate = enunciate;
	}
	public ArrayList<Path> getPaths() {
		return paths;
	}
	public void setPaths(ArrayList<Path> paths) {
		this.paths = paths;
	}
	public ArrayList<ExerciseInitialState> getInitialState() {
		return initialState;
	}
	public void setInitialState(ArrayList<ExerciseInitialState> initialState) {
		this.initialState = initialState;
	}
	
	
	
}
