
package module.entity;

import java.util.ArrayList;

import javax.swing.JComponent;

public class Goal {
	
	private Integer id;
	private Boolean satisfied;
	private JComponent component;
	private CorrectAnswer answer;
	private Goal superGoal;
	private Goal subGoal;
	private String description;
	private Path path;
	
	private ArrayList<Action> actions;
	

	public Goal(){
		setSatisfied(false);
	}
	
	public Goal(Integer id, Path path, Boolean satisfied, JComponent component, CorrectAnswer answer, Goal superGoal, Goal subGoal, String description){
		this.setId(id);
		this.setPath(path);
		this.setSatisfied(satisfied);
		this.setComponent(component);
		this.setAnswer(answer);
		this.setSuperGoal(superGoal);
		this.setSubGoal(subGoal);
		this.setDescription(description);
	}
	
	public JComponent getComponent() {
		return component;
	}

	public void setComponent(JComponent component) {
		this.component = component;
	}

	public CorrectAnswer getAnswer() {
		return answer;
	}

	public void setAnswer(CorrectAnswer answer) {
		this.answer = answer;
	}

	public Goal getSubGoal() {
		return subGoal;
	}

	public void setSubGoal(Goal subGoal) {
		this.subGoal = subGoal;
	}

	public Boolean getSatisfied() {
		return satisfied;
	}

	public void setSatisfied(Boolean satisfied) {
		this.satisfied = satisfied;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Goal getSuperGoal() {
		return superGoal;
	}

	public void setSuperGoal(Goal superGoal) {
		this.superGoal = superGoal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ArrayList<Action> getActions() {
		return actions;
	}

	public void setActions(ArrayList<Action> actions) {
		this.actions = actions;
	}

	public Path getPath() {
		return path;
	}

	public void setPath(Path path) {
		this.path = path;
	}

}
