package module.entity;

import java.util.ArrayList;

public class Path {
	
	private Long id;
	private String description;
	private ArrayList<Goal> goals;
	
	
	public Path(Long id, String description) {
		this.id = id;
		this.description = description;
		this.goals = new ArrayList<Goal>();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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

	public Goal getGoalById(Long id){
		for (Goal g: goals){
			if (id.equals(g.getId()))
				return g;
		}
		return null;
	}

}
