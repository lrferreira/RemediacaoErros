package module.entity;

import module.author.expertise.creation.sorters.entity.ItemSorter;

public class Remediation {




	private Long id;
	
	private Goal goal;
	
	private ItemSorter itemSorter;
		
	private Criterion criterion;

	private Integer attempts; //se critério = persistência no erro
	
	private String wrongAnswer;
	
	private String relatedError;
	
	
	public Remediation() {
		super();

	}
	
	
	public Remediation(Long id, Goal goal, ItemSorter itemSorter,
			Criterion criterion, Integer attempts, String wrongAnswer, String relatedError) {
		super();
		this.id = id;
		this.goal = goal;
		this.itemSorter = itemSorter;
		this.criterion = criterion;
		this.attempts = attempts;
		this.wrongAnswer = wrongAnswer;
		this.relatedError = relatedError;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Goal getGoal() {
		return goal;
	}

	public void setGoal(Goal goal) {
		this.goal = goal;
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

	public Integer getAttempts() {
		return attempts;
	}

	public void setAttempts(Integer attempts) {
		this.attempts = attempts;
	}

	public String getWrongAnswer() {
		return wrongAnswer;
	}

	public void setWrongAnswer(String wrongAnswer) {
		this.wrongAnswer = wrongAnswer;
	}


	public String getRelatedError() {
		return relatedError;
	}


	public void setRelatedError(String relatedError) {
		this.relatedError = relatedError;
	}
	
	
	
	
}
