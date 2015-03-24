package module.entity;

import java.util.ArrayList;

public class Path {
	
	private Integer id;
	private String description;
	private ArrayList<Goal> goals;
	
	
	public Path(Integer id, String description) {
		this.id = id;
		this.description = description;
		this.goals = new ArrayList<Goal>();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<Goal> getGoals() {
		return goals;
	}
	public void setGoals(ArrayList<Goal> goals) {
		this.goals = goals;
	}

	public Goal getGoalById(Integer id){
		for (Goal g: goals){
			if (id == g.getId())
				return g;
		}
		return null;
	}

}
