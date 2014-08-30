package tests;

import entity.Historic;
import entity.WrongAnswer;

import java.util.ArrayList;

import module.error.sorter.ClassificadorErroControlador;
import module.expression.identifier.IdentificadorExpressaoControlador;


 class Jeops_RuleBase_TesteCriaRegrasBaseRegras extends jeops.AbstractRuleBase {


	
    /**
     * Identifiers of rule wrongAnswer_0
     */
    private String[] identifiers_wrongAnswer_0 = {
        "h",
        "respostaErrada"
    };

    /**
     * Returns the identifiers declared in rule wrongAnswer_0
     *
     * @return the identifiers declared in rule wrongAnswer_0
     */
    private String[] getDeclaredIdentifiers_wrongAnswer_0() {
         return identifiers_wrongAnswer_0;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule wrongAnswer_0.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_wrongAnswer_0(int index) {
        switch (index) {
            case 0: return "entity.Historic";
            case 1: return "entity.WrongAnswer";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule wrongAnswer_0.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_wrongAnswer_0(int index) {
        switch (index) {
            case 0: return entity.Historic.class;
            case 1: return entity.WrongAnswer.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule wrongAnswer_0.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_wrongAnswer_0(int index, Object value) {
        switch (index) {
            case 0: this.entity_Historic_1 = (entity.Historic) value; break;
            case 1: this.entity_WrongAnswer_1 = (entity.WrongAnswer) value; break;
        }
    }

    /**
     * Returns an object declared in the rule wrongAnswer_0.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_wrongAnswer_0(int index) {
        switch (index) {
            case 0: return entity_Historic_1;
            case 1: return entity_WrongAnswer_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule wrongAnswer_0
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_wrongAnswer_0() {
        return new Object[] {
                            entity_Historic_1,
                            entity_WrongAnswer_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule wrongAnswer_0
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_wrongAnswer_0(Object[] objects) {
        entity_Historic_1 = (entity.Historic) objects[0];
        entity_WrongAnswer_1 = (entity.WrongAnswer) objects[1];
    }

    /**
     * Condition 0 of rule wrongAnswer_0.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getDescricao().equalsIgnoreCase("123")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_0_cond_0() {
        return (entity_Historic_1.getResposta().getDescricao().equalsIgnoreCase("123"));
    }

    /**
     * Checks whether some conditions of rule wrongAnswer_0 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_0_cond(int index) {
        switch (index) {
            case 0: return wrongAnswer_0_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule wrongAnswer_0 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_wrongAnswer_0(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!wrongAnswer_0_cond_0()) return false;
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
    private boolean checkCondForDeclaration_wrongAnswer_0(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule wrongAnswer_0
     */
    private void wrongAnswer_0() {
			entity_Historic_1.setNumeroTentativas(entity_Historic_1.getNumeroTentativas() + 1);
			modified(entity_Historic_1);
			System.out.println("Resposta Errada (1) detectada");
			entity_WrongAnswer_1.setDescricao(entity_Historic_1.getResposta().getDescricao());
			modified(entity_WrongAnswer_1);
			flush();

	    }



// end_rules


    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "wrongAnswer_0"
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
            case 0: return wrongAnswer_0_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_wrongAnswer_0(declIndex);
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
            case 0: return checkCondForDeclaration_wrongAnswer_0(declIndex);
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
            case 0: return getDeclaredClassName_wrongAnswer_0(declIndex);
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
            case 0: return getDeclaredClass_wrongAnswer_0(declIndex);
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
            case 0: wrongAnswer_0(); break;
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
            case 0: return getDeclaredIdentifiers_wrongAnswer_0();
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
            case 0: setObject_wrongAnswer_0(declIndex, value); break;
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
            case 0: return getObject_wrongAnswer_0(declIndex);
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
            case 0: return getObjects_wrongAnswer_0();
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
            case 0: setObjects_wrongAnswer_0(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private entity.Historic entity_Historic_1;
    private entity.WrongAnswer entity_WrongAnswer_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_TesteCriaRegrasBaseRegras(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file TesteCriaRegrasBaseRegras.rules
 *
 * @version 17/04/2014
 */
public class TesteCriaRegrasBaseRegras extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public TesteCriaRegrasBaseRegras(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public TesteCriaRegrasBaseRegras() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_TesteCriaRegrasBaseRegras(this);
    }

}
