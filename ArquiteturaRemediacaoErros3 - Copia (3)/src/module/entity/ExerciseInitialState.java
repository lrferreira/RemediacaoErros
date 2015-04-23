package module.entity;

public class ExerciseInitialState {
	
	private Exercise exercise;
	private String component;
	private String value;

	public ExerciseInitialState(Exercise exercise, String component,
			String value) {
		super();
		this.exercise = exercise;
		this.component = component;
		this.value = value;
	}
	
	public Exercise getExercise() {
		return exercise;
	}
	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
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
	
	

}
