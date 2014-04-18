package entity;

public class RuleInformation {

	private String ruleName;
	private String [] declarations;
	private String [] localdecl;
	private String [] conditions;
	private String [] actions;
	
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	public String[] getDeclarations() {
		return declarations;
	}
	public void setDeclarations(String[] declarations) {
		this.declarations = declarations;
	}
	public String[] getLocaldecl() {
		return localdecl;
	}
	public void setLocaldecl(String[] localdecl) {
		this.localdecl = localdecl;
	}
	public String[] getConditions() {
		return conditions;
	}
	public void setConditions(String[] conditions) {
		this.conditions = conditions;
	}
	public String[] getActions() {
		return actions;
	}
	public void setActions(String[] actions) {
		this.actions = actions;
	}
	
	
	
}
