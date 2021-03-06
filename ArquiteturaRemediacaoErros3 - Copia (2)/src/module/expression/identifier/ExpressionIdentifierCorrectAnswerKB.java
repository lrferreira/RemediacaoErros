package module.expression.identifier;

import module.entity.Historic;
import module.entity.CorrectAnswer;
import module.entity.RuleToHuman;
import java.util.ArrayList;
import module.error.sorter.ErrorSorterController;


 class Jeops_RuleBase_ExpressionIdentifierCorrectAnswerKB extends jeops.AbstractRuleBase {
	


	
    /**
     * Identifiers of rule correctAnswer_0
     */
    private String[] identifiers_correctAnswer_0 = {
        "h",
        "correctAnswer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule correctAnswer_0
     *
     * @return the identifiers declared in rule correctAnswer_0
     */
    private String[] getDeclaredIdentifiers_correctAnswer_0() {
         return identifiers_correctAnswer_0;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule correctAnswer_0.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_correctAnswer_0(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.CorrectAnswer";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule correctAnswer_0.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_correctAnswer_0(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.CorrectAnswer.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule correctAnswer_0.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_correctAnswer_0(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_CorrectAnswer_1 = (module.entity.CorrectAnswer) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule correctAnswer_0.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_correctAnswer_0(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_CorrectAnswer_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule correctAnswer_0
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_correctAnswer_0() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_CorrectAnswer_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule correctAnswer_0
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_correctAnswer_0(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_CorrectAnswer_1 = (module.entity.CorrectAnswer) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule correctAnswer_0.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[0].equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_0_cond_0() {
        return (module_entity_Historic_1.getResposta().getAnswers()[0].equalsIgnoreCase("6"));
    }

    /**
     * Condition 1 of rule correctAnswer_0.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[1].equalsIgnoreCase("10")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_0_cond_1() {
        return (module_entity_Historic_1.getResposta().getAnswers()[1].equalsIgnoreCase("10"));
    }

    /**
     * Condition 2 of rule correctAnswer_0.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[2].equalsIgnoreCase("16")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_0_cond_2() {
        return (module_entity_Historic_1.getResposta().getAnswers()[2].equalsIgnoreCase("16"));
    }

    /**
     * Checks whether some conditions of rule correctAnswer_0 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_0_cond(int index) {
        switch (index) {
            case 0: return correctAnswer_0_cond_0();
            case 1: return correctAnswer_0_cond_1();
            case 2: return correctAnswer_0_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule correctAnswer_0 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_correctAnswer_0(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!correctAnswer_0_cond_0()) return false;
                if (!correctAnswer_0_cond_1()) return false;
                if (!correctAnswer_0_cond_2()) return false;
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
    private boolean checkCondForDeclaration_correctAnswer_0(int declIndex) {
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
     * Executes the action part of the rule correctAnswer_0
     */
    private void correctAnswer_0() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta correta: correctAnswer_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 0 = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 1 = 10\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 2 = 16\n");
			System.out.println("Resposta Correta (1) detectada\n");
			module_entity_CorrectAnswer_1.setAnswers(module_entity_Historic_1.getResposta().getAnswers());
			modified(module_entity_CorrectAnswer_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule correctAnswer_1
     */
    private String[] identifiers_correctAnswer_1 = {
        "h",
        "correctAnswer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule correctAnswer_1
     *
     * @return the identifiers declared in rule correctAnswer_1
     */
    private String[] getDeclaredIdentifiers_correctAnswer_1() {
         return identifiers_correctAnswer_1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule correctAnswer_1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_correctAnswer_1(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.CorrectAnswer";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule correctAnswer_1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_correctAnswer_1(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.CorrectAnswer.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule correctAnswer_1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_correctAnswer_1(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_CorrectAnswer_1 = (module.entity.CorrectAnswer) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule correctAnswer_1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_correctAnswer_1(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_CorrectAnswer_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule correctAnswer_1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_correctAnswer_1() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_CorrectAnswer_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule correctAnswer_1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_correctAnswer_1(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_CorrectAnswer_1 = (module.entity.CorrectAnswer) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule correctAnswer_1.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[0].equalsIgnoreCase("10")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_1_cond_0() {
        return (module_entity_Historic_1.getResposta().getAnswers()[0].equalsIgnoreCase("10"));
    }

    /**
     * Condition 1 of rule correctAnswer_1.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[1].equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_1_cond_1() {
        return (module_entity_Historic_1.getResposta().getAnswers()[1].equalsIgnoreCase("6"));
    }

    /**
     * Condition 2 of rule correctAnswer_1.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[2].equalsIgnoreCase("16")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_1_cond_2() {
        return (module_entity_Historic_1.getResposta().getAnswers()[2].equalsIgnoreCase("16"));
    }

    /**
     * Checks whether some conditions of rule correctAnswer_1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_1_cond(int index) {
        switch (index) {
            case 0: return correctAnswer_1_cond_0();
            case 1: return correctAnswer_1_cond_1();
            case 2: return correctAnswer_1_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule correctAnswer_1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_correctAnswer_1(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!correctAnswer_1_cond_0()) return false;
                if (!correctAnswer_1_cond_1()) return false;
                if (!correctAnswer_1_cond_2()) return false;
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
    private boolean checkCondForDeclaration_correctAnswer_1(int declIndex) {
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
     * Executes the action part of the rule correctAnswer_1
     */
    private void correctAnswer_1() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta correta: correctAnswer_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 0 = 10\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 1 = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 2 = 16\n");
			System.out.println("Resposta Correta (1) detectada\n");
			module_entity_CorrectAnswer_1.setAnswers(module_entity_Historic_1.getResposta().getAnswers());
			modified(module_entity_CorrectAnswer_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }



// end_rules
	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "correctAnswer_0",
        "correctAnswer_1"
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
        3
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
        3,
        3
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
            case 0: return correctAnswer_0_cond(condIndex);
            case 1: return correctAnswer_1_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_correctAnswer_0(declIndex);
            case 1: return checkConditionsOnlyOf_correctAnswer_1(declIndex);
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
            case 0: return checkCondForDeclaration_correctAnswer_0(declIndex);
            case 1: return checkCondForDeclaration_correctAnswer_1(declIndex);
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
            case 0: return getDeclaredClassName_correctAnswer_0(declIndex);
            case 1: return getDeclaredClassName_correctAnswer_1(declIndex);
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
            case 0: return getDeclaredClass_correctAnswer_0(declIndex);
            case 1: return getDeclaredClass_correctAnswer_1(declIndex);
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
            case 0: correctAnswer_0(); break;
            case 1: correctAnswer_1(); break;
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
            case 0: return getDeclaredIdentifiers_correctAnswer_0();
            case 1: return getDeclaredIdentifiers_correctAnswer_1();
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
            case 0: setObject_correctAnswer_0(declIndex, value); break;
            case 1: setObject_correctAnswer_1(declIndex, value); break;
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
            case 0: return getObject_correctAnswer_0(declIndex);
            case 1: return getObject_correctAnswer_1(declIndex);
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
            case 0: return getObjects_correctAnswer_0();
            case 1: return getObjects_correctAnswer_1();
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
            case 0: setObjects_correctAnswer_0(objects); break;
            case 1: setObjects_correctAnswer_1(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private module.entity.Historic module_entity_Historic_1;
    private module.entity.CorrectAnswer module_entity_CorrectAnswer_1;
    private module.entity.RuleToHuman module_entity_RuleToHuman_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_ExpressionIdentifierCorrectAnswerKB(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file ExpressionIdentifierCorrectAnswerKB.rules
 *
 * @version 15/07/2014
 */
public class ExpressionIdentifierCorrectAnswerKB extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public ExpressionIdentifierCorrectAnswerKB(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public ExpressionIdentifierCorrectAnswerKB() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_ExpressionIdentifierCorrectAnswerKB(this);
    }

}
