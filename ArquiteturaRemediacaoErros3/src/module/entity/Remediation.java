package module.entity;

import module.author.expertise.creation.sorters.entity.ItemSorter;

public class Remediation {

	private Integer id;
	
	private Goal goal;
	
	private ItemSorter itemSorter;
		
	private MultipleExternalRepresentation mer;
	
	private Criterion criterion;

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Goal getGoal() {
		return goal;
	}

	public void setGoal(Goal goal) {
		this.goal = goal;
	}

	public MultipleExternalRepresentation getMer() {
		return mer;
	}

	public void setMer(MultipleExternalRepresentation mer) {
		this.mer = mer;
	}

	public ItemSorter getItemSorter() {
		return itemSorter;
	}

	public void setItemSorter(ItemSorter itemSorter) {
		this.itemSorter = itemSorter;
	}

	public Criterion getCriterion() {
		return criterion;
	}

	public void setCriterion(Criterion criterion) {
		this.criterion = criterion;
	}
	
	
	
	
}
