package module.expression.identifier;

import javax.swing.JComponent;
import module.entity.Goal;
import module.entity.Action;
import module.entity.WrongAnswer;
import module.entity.RuleToHuman;
import module.entity.Remediation;
import module.entity.DBConnect;
import java.util.ArrayList;
import module.error.sorter.ErrorSorterController;
import module.entity.DBConnect;


 class Jeops_RuleBase_ExpressionIdentifierWrongAnswerKB extends jeops.AbstractRuleBase {





	
    /**
     * Identifiers of rule wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0
     */
    private String[] identifiers_wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0
     *
     * @return the identifiers declared in rule wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0
     */
    private String[] getDeclaredIdentifiers_wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0() {
         return identifiers_wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 1 of rule wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 2 of rule wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt3"));
    }

    /**
     * Condition 3 of rule wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("-")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_3() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("-"));
    }

    /**
     * Checks whether some conditions of rule wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond(int index) {
        switch (index) {
            case 0: return wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_0();
            case 1: return wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_1();
            case 2: return wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_2();
            case 3: return wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_0()) return false;
                if (!wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_1()) return false;
                if (!wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_2()) return false;
                if (!wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_3()) return false;
                return true;
            case 1:
                return true;
            case 2:
                return true;
            default: return false;
        }
    }

    /**
     * Checks whether all the conditions of a rule which
     * reference some declared element of the declarations are
     * true.
     *
     * @param declIndex the index of the declared element.
     * @return <code>true</code> if the conditions that reference
     *          up to the given declaration are true;
     *          <code>false</code> otherwise.
     */
    private boolean checkCondForDeclaration_wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0
     */
    private void wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo = -\n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_");
			Remediation r = module_entity_DBConnect_1.getRemediation(1L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 

// end_rules

// rule necessary by default

	
    /**
     * Identifiers of rule wrongAnswer_default
     */
    private String[] identifiers_wrongAnswer_default = {
        "action",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule wrongAnswer_default
     *
     * @return the identifiers declared in rule wrongAnswer_default
     */
    private String[] getDeclaredIdentifiers_wrongAnswer_default() {
         return identifiers_wrongAnswer_default;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule wrongAnswer_default.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_wrongAnswer_default(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule wrongAnswer_default.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_wrongAnswer_default(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule wrongAnswer_default.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_wrongAnswer_default(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule wrongAnswer_default.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_wrongAnswer_default(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule wrongAnswer_default
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_wrongAnswer_default() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule wrongAnswer_default
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_wrongAnswer_default(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[1];
    }

    /**
     * Condition 0 of rule wrongAnswer_default.<p>
     * The original expression was:<br>
     * <code>action.getCorrect() == null</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_default_cond_0() {
        return (module_entity_Action_1.getCorrect() == null);
    }

    /**
     * Checks whether some conditions of rule wrongAnswer_default is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_default_cond(int index) {
        switch (index) {
            case 0: return wrongAnswer_default_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule wrongAnswer_default that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_wrongAnswer_default(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!wrongAnswer_default_cond_0()) return false;
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Checks whether all the conditions of a rule which
     * reference some declared element of the declarations are
     * true.
     *
     * @param declIndex the index of the declared element.
     * @return <code>true</code> if the conditions that reference
     *          up to the given declaration are true;
     *          <code>false</code> otherwise.
     */
    private boolean checkCondForDeclaration_wrongAnswer_default(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule wrongAnswer_default
     */
    private void wrongAnswer_default() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: wrongAnswer_default \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��o: n�o estar prevista no cadastro de erros  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo = " + module_entity_Action_1.getAnswer().getValue() + "\n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }

	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0",
        "wrongAnswer_default"
    };

    /**
     * Returns the name of the rules in this class file.
     *
     * @return the name of the rules in this class file.
     */
    public String[] getRuleNames() {
        return File_ruleNames;
    }

    /**
     * The number of declarations of the rules in this class file.
     */
    private static final int[] File_numberOfDeclarations = {
        3,
        2
    };

    /**
     * Returns the number of declarations of the rules in this class file.
     *
     * @return the number of declarations  of the rules in this class file.
     */
    public int[] getNumberOfDeclarations() {
        return File_numberOfDeclarations;
    }

    /**
     * The number of conditions of the rules in this class file.
     */
    private static final int[] File_numberOfConditions = {
        4,
        1
    };

    /**
     * Returns the number of conditions of the rules in this class file.
     *
     * @return the number of conditions  of the rules in this class file.
     */
    public int[] getNumberOfConditions() {
        return File_numberOfConditions;
    }

    /**
     * Checks whether a condition of some rule is satisfied.
     *
     * @param ruleIndex the index of the rule to be checked
     * @param condIndex the index of the condition to be checked
     * @return <code>true</code> if the corresponding condition for the
     *          given rule is satisfied. <code>false</code> otherwise.
     */
    public boolean checkCondition(int ruleIndex, int condIndex) {
        switch (ruleIndex) {
            case 0: return wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond(condIndex);
            case 1: return wrongAnswer_default_cond(condIndex);
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of some rule that depend only on
     * the given object are satisfied.
     *
     * @param ruleIndex the index of the rule to be checked
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          the given rule are satisfied;
     *           <code>false</code> otherwise.
     */
    public boolean checkConditionsOnlyOf(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return checkConditionsOnlyOf_wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(declIndex);
            case 1: return checkConditionsOnlyOf_wrongAnswer_default(declIndex);
            default: return false;
        }
    }

    /**
     * Checks whether all the conditions of a rule which
     * reference only the elements declared up to the given index
     * are true.
     *
     * @param ruleIndex the index of the rule to be checked
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all the conditions of a rule which
     *          reference only the elements declared up to the given index
     *          are satisfied; <code>false</code> otherwise.
     */
    public boolean checkCondForDeclaration(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return checkCondForDeclaration_wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(declIndex);
            case 1: return checkCondForDeclaration_wrongAnswer_default(declIndex);
            default: return false;
        }
    }

    /**
     * Returns the class name of an object declared in a rule.
     *
     * @param ruleIndex the index of the rule
     * @param declIndex the index of the declaration
     * @return the class name of the declared object.
     */
    public String getDeclaredClassName(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredClassName_wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(declIndex);
            case 1: return getDeclaredClassName_wrongAnswer_default(declIndex);
            default: return null;
        }
    }

    /**
     * Returns the class of an object declared in a rule.
     *
     * @param ruleIndex the index of the rule
     * @param declIndex the index of the declaration
     * @return the class of the declared object.
     */
    public Class getDeclaredClass(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredClass_wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(declIndex);
            case 1: return getDeclaredClass_wrongAnswer_default(declIndex);
            default: return null;
        }
    }

    /**
     * Fires one of the rules in this rule base.
     *
     * @param ruleIndex the index of the rule to be fired
     */
    protected void internalFireRule(int ruleIndex) {
        switch (ruleIndex) {
            case 0: wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(); break;
            case 1: wrongAnswer_default(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 2;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0();
            case 1: return getDeclaredIdentifiers_wrongAnswer_default();
            default: return new String[0];
        }
    }

    /**
     * Sets an object that represents a declaration of some rule.
     *
     * @param ruleIndex the index of the rule
     * @param declIndex the index of the declaration in the rule.
     * @param value the value of the object being set.
     */
    public void setObject(int ruleIndex, int declIndex, Object value) {
        switch (ruleIndex) {
            case 0: setObject_wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(declIndex, value); break;
            case 1: setObject_wrongAnswer_default(declIndex, value); break;
        }
    }

    /**
     * Returns an object that represents a declaration of some rule.
     *
     * @param ruleIndex the index of the rule
     * @param declIndex the index of the declaration in the rule.
     * @return the value of the corresponding object.
     */
    public Object getObject(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return getObject_wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(declIndex);
            case 1: return getObject_wrongAnswer_default(declIndex);
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations of
     * some rule.
     *
     * @param ruleIndex the index of the rule
     * @return an object array of the variables bound to the
     *          declarations of some rule.
     */
    public Object[] getObjects(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getObjects_wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0();
            case 1: return getObjects_wrongAnswer_default();
            default: return null;
        }
    }
    /**
     * Defines all variables bound to the declarations of
     * some rule.
     *
     * @param ruleIndex the index of the rule
     * @param objects an object array of the variables bound to the
     *          declarations of some rule.
     */
    public void setObjects(int ruleIndex, Object[] objects) {
        switch (ruleIndex) {
            case 0: setObjects_wrongAnswer_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(objects); break;
            case 1: setObjects_wrongAnswer_default(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private module.entity.Action module_entity_Action_1;
    private module.entity.DBConnect module_entity_DBConnect_1;
    private module.entity.RuleToHuman module_entity_RuleToHuman_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_ExpressionIdentifierWrongAnswerKB(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file ExpressionIdentifierWrongAnswerKB.rules
 *
 * @version 22/04/2015
 */
public class ExpressionIdentifierWrongAnswerKB extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public ExpressionIdentifierWrongAnswerKB(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public ExpressionIdentifierWrongAnswerKB() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_ExpressionIdentifierWrongAnswerKB(this);
    }

}
