package module.error.sorter;

import entity.WrongAnswer;
import util.Constantes;


 class Jeops_RuleBase_ErrorSorterKB extends jeops.AbstractRuleBase {
	



// end_rules

// rule necessary by default


	
    /**
     * Identifiers of rule solutionNonCategorizable
     */
    private String[] identifiers_solutionNonCategorizable = {
        "wrongAnswer"
    };

    /**
     * Returns the identifiers declared in rule solutionNonCategorizable
     *
     * @return the identifiers declared in rule solutionNonCategorizable
     */
    private String[] getDeclaredIdentifiers_solutionNonCategorizable() {
         return identifiers_solutionNonCategorizable;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule solutionNonCategorizable.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_solutionNonCategorizable(int index) {
        switch (index) {
            case 0: return "entity.WrongAnswer";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule solutionNonCategorizable.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_solutionNonCategorizable(int index) {
        switch (index) {
            case 0: return entity.WrongAnswer.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule solutionNonCategorizable.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_solutionNonCategorizable(int index, Object value) {
        switch (index) {
            case 0: this.entity_WrongAnswer_1 = (entity.WrongAnswer) value; break;
        }
    }

    /**
     * Returns an object declared in the rule solutionNonCategorizable.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_solutionNonCategorizable(int index) {
        switch (index) {
            case 0: return entity_WrongAnswer_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule solutionNonCategorizable
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_solutionNonCategorizable() {
        return new Object[] {
                            entity_WrongAnswer_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule solutionNonCategorizable
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_solutionNonCategorizable(Object[] objects) {
        entity_WrongAnswer_1 = (entity.WrongAnswer) objects[0];
    }

    /**
     * Condition 0 of rule solutionNonCategorizable.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getDescricao() == null</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean solutionNonCategorizable_cond_0() {
        return (entity_WrongAnswer_1.getDescricao() == null);
    }

    /**
     * Checks whether some conditions of rule solutionNonCategorizable is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean solutionNonCategorizable_cond(int index) {
        switch (index) {
            case 0: return solutionNonCategorizable_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule solutionNonCategorizable that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_solutionNonCategorizable(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!solutionNonCategorizable_cond_0()) return false;
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
    private boolean checkCondForDeclaration_solutionNonCategorizable(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule solutionNonCategorizable
     */
    private void solutionNonCategorizable() {
			System.out.println("Erro classificado como Solução Não Categorizável");		
			entity_WrongAnswer_1.setTipo(Constantes.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL);
			modified(entity_WrongAnswer_1);
			flush();			
	    }




	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "solutionNonCategorizable"
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
        1
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
            case 0: return solutionNonCategorizable_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_solutionNonCategorizable(declIndex);
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
            case 0: return checkCondForDeclaration_solutionNonCategorizable(declIndex);
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
            case 0: return getDeclaredClassName_solutionNonCategorizable(declIndex);
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
            case 0: return getDeclaredClass_solutionNonCategorizable(declIndex);
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
            case 0: solutionNonCategorizable(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 1;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_solutionNonCategorizable();
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
            case 0: setObject_solutionNonCategorizable(declIndex, value); break;
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
            case 0: return getObject_solutionNonCategorizable(declIndex);
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
            case 0: return getObjects_solutionNonCategorizable();
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
            case 0: setObjects_solutionNonCategorizable(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private entity.WrongAnswer entity_WrongAnswer_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_ErrorSorterKB(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file ErrorSorterKB.rules
 *
 * @version 28/05/2014
 */
public class ErrorSorterKB extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public ErrorSorterKB(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public ErrorSorterKB() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_ErrorSorterKB(this);
    }

}
