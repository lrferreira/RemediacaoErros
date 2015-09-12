package module.entity;

import java.util.ArrayList;

import module.author.expertise.creation.sorters.entity.ItemSorter;

public class Remediation {




	private Long id;
	
	private Goal goal;
	
	private ItemSorter itemSorter;
		
	private Criterion criterion;

	private Integer attempts; //se critério = persistência no erro
	
	private String wrongAnswer;
	
	private String relatedError;
	
	private MultipleExternalRepresentation mer;
	
	private TreatmentWrongAnswer treatmentWrongAnswer;
	
	private Boolean active;
	
	
	public Remediation() {
		super();

	}
	
	
	public Remediation(Long id, Goal goal, ItemSorter itemSorter,
			Criterion criterion, Integer attempts, String wrongAnswer, TreatmentWrongAnswer treatment, String relatedError, MultipleExternalRepresentation mer, Boolean active) {
		super();
		this.id = id;
		this.goal = goal;
		this.itemSorter = itemSorter;
		this.criterion = criterion;
		this.attempts = attempts;
		this.wrongAnswer = wrongAnswer;
		this.relatedError = relatedError;
		this.treatmentWrongAnswer = treatment;
		this.mer = mer;
		this.active = active;
	}
	
	public static boolean hasTreatment(TreatmentWrongAnswer t, ArrayList<Remediation> rs){
		for (Remediation r : rs){
			if (r.getTreatmentWrongAnswer().equals(t) && r.isActive())
				return true;
		}
		return false;
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


	public MultipleExternalRepresentation getMer() {
		return mer;
	}


	public void setMer(MultipleExternalRepresentation mer) {
		this.mer = mer;
	}


	public TreatmentWrongAnswer getTreatmentWrongAnswer() {
		return treatmentWrongAnswer;
	}


	public void setTreatmentWrongAnswer(TreatmentWrongAnswer treatmentWrongAnswer) {
		this.treatmentWrongAnswer = treatmentWrongAnswer;
	}


	public Boolean getActive() {
		return active;
	}


	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean isActive(){
		return this.active;
	}
	
	
	
}
