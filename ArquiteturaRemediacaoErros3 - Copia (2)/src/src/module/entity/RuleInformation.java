package src.module.entity;

import java.util.ArrayList;

public class RuleInformation {

	private String ruleName;
	private ArrayList<String> declarations;
	private ArrayList<String> localdecl;
	private ArrayList<String> conditions;
	private ArrayList<String> actions;
	
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	public ArrayList<String> getDeclarations() {
		return declarations;
	}
	public void setDeclarations(ArrayList<String> declarations) {
		this.declarations = declarations;
	}
	public ArrayList<String> getLocaldecl() {
		return localdecl;
	}
	public void setLocaldecl(ArrayList<String> localdecl) {
		this.localdecl = localdecl;
	}
	public ArrayList<String> getConditions() {
		return conditions;
	}
	public void setConditions(ArrayList<String> conditions) {
		this.conditions = conditions;
	}
	public ArrayList<String> getActions() {
		return actions;
	}
	public void setActions(ArrayList<String> actions) {
		this.actions = actions;
	}
	
	
}
