package module.mer.manager;
import entity.Historic;
import entity.WrongAnswer;
import util.Constantes;
import entity.MERFunction;
import java.util.ArrayList;

 class Jeops_RuleBase_MERManagerKB extends jeops.AbstractRuleBase {




	
    /**
     * Identifiers of rule ruleMRE_0
     */
    private String[] identifiers_ruleMRE_0 = {
        "wrongAnswer",
        "merFunction"
    };

    /**
     * Returns the identifiers declared in rule ruleMRE_0
     *
     * @return the identifiers declared in rule ruleMRE_0
     */
    private String[] getDeclaredIdentifiers_ruleMRE_0() {
         return identifiers_ruleMRE_0;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMRE_0.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMRE_0(int index) {
        switch (index) {
            case 0: return "entity.WrongAnswer";
            case 1: return "entity.MERFunction";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMRE_0.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMRE_0(int index) {
        switch (index) {
            case 0: return entity.WrongAnswer.class;
            case 1: return entity.MERFunction.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMRE_0.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMRE_0(int index, Object value) {
        switch (index) {
            case 0: this.entity_WrongAnswer_1 = (entity.WrongAnswer) value; break;
            case 1: this.entity_MERFunction_1 = (entity.MERFunction) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMRE_0.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMRE_0(int index) {
        switch (index) {
            case 0: return entity_WrongAnswer_1;
            case 1: return entity_MERFunction_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMRE_0
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMRE_0() {
        return new Object[] {
                            entity_WrongAnswer_1,
                            entity_MERFunction_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMRE_0
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMRE_0(Object[] objects) {
        entity_WrongAnswer_1 = (entity.WrongAnswer) objects[0];
        entity_MERFunction_1 = (entity.MERFunction) objects[1];
    }

    /**
     * Condition 0 of rule ruleMRE_0.<p>
     * The original expression was:<br>
     * <code>merFunction.getTipo() == 12</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_0_cond_0() {
        return (entity_MERFunction_1.getTipo() == 12);
    }

    /**
     * Condition 1 of rule ruleMRE_0.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getTipo() == 2</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_0_cond_1() {
        return (entity_WrongAnswer_1.getTipo() == 2);
    }

    /**
     * Checks whether some conditions of rule ruleMRE_0 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_0_cond(int index) {
        switch (index) {
            case 0: return ruleMRE_0_cond_0();
            case 1: return ruleMRE_0_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMRE_0 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMRE_0(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMRE_0_cond_1()) return false;
                return true;
            case 1:
                if (!ruleMRE_0_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMRE_0(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule ruleMRE_0
     */
    private void ruleMRE_0() {
			System.out.println("Exibição de MRE 1 - Figura de Pedro e Helena mostrando pontos de interrogação e o esqueleto da operação que se espera do aluno");
			flush();

	    }




	
    /**
     * Identifiers of rule ruleMRE_1
     */
    private String[] identifiers_ruleMRE_1 = {
        "wrongAnswer",
        "merFunction"
    };

    /**
     * Returns the identifiers declared in rule ruleMRE_1
     *
     * @return the identifiers declared in rule ruleMRE_1
     */
    private String[] getDeclaredIdentifiers_ruleMRE_1() {
         return identifiers_ruleMRE_1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMRE_1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMRE_1(int index) {
        switch (index) {
            case 0: return "entity.WrongAnswer";
            case 1: return "entity.MERFunction";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMRE_1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMRE_1(int index) {
        switch (index) {
            case 0: return entity.WrongAnswer.class;
            case 1: return entity.MERFunction.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMRE_1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMRE_1(int index, Object value) {
        switch (index) {
            case 0: this.entity_WrongAnswer_1 = (entity.WrongAnswer) value; break;
            case 1: this.entity_MERFunction_1 = (entity.MERFunction) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMRE_1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMRE_1(int index) {
        switch (index) {
            case 0: return entity_WrongAnswer_1;
            case 1: return entity_MERFunction_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMRE_1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMRE_1() {
        return new Object[] {
                            entity_WrongAnswer_1,
                            entity_MERFunction_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMRE_1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMRE_1(Object[] objects) {
        entity_WrongAnswer_1 = (entity.WrongAnswer) objects[0];
        entity_MERFunction_1 = (entity.MERFunction) objects[1];
    }

    /**
     * Condition 0 of rule ruleMRE_1.<p>
     * The original expression was:<br>
     * <code>merFunction.getTipo() == 13</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_1_cond_0() {
        return (entity_MERFunction_1.getTipo() == 13);
    }

    /**
     * Condition 1 of rule ruleMRE_1.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getTipo() == 4</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_1_cond_1() {
        return (entity_WrongAnswer_1.getTipo() == 4);
    }

    /**
     * Checks whether some conditions of rule ruleMRE_1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_1_cond(int index) {
        switch (index) {
            case 0: return ruleMRE_1_cond_0();
            case 1: return ruleMRE_1_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMRE_1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMRE_1(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMRE_1_cond_1()) return false;
                return true;
            case 1:
                if (!ruleMRE_1_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMRE_1(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule ruleMRE_1
     */
    private void ruleMRE_1() {
			System.out.println("Exibição de MRE 2 - Figura procurando mostrar que Helena possui mais laranjas que Pedro");
			flush();

	    }




	
    /**
     * Identifiers of rule ruleMRE_2
     */
    private String[] identifiers_ruleMRE_2 = {
        "wrongAnswer",
        "merFunction"
    };

    /**
     * Returns the identifiers declared in rule ruleMRE_2
     *
     * @return the identifiers declared in rule ruleMRE_2
     */
    private String[] getDeclaredIdentifiers_ruleMRE_2() {
         return identifiers_ruleMRE_2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMRE_2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMRE_2(int index) {
        switch (index) {
            case 0: return "entity.WrongAnswer";
            case 1: return "entity.MERFunction";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMRE_2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMRE_2(int index) {
        switch (index) {
            case 0: return entity.WrongAnswer.class;
            case 1: return entity.MERFunction.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMRE_2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMRE_2(int index, Object value) {
        switch (index) {
            case 0: this.entity_WrongAnswer_1 = (entity.WrongAnswer) value; break;
            case 1: this.entity_MERFunction_1 = (entity.MERFunction) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMRE_2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMRE_2(int index) {
        switch (index) {
            case 0: return entity_WrongAnswer_1;
            case 1: return entity_MERFunction_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMRE_2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMRE_2() {
        return new Object[] {
                            entity_WrongAnswer_1,
                            entity_MERFunction_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMRE_2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMRE_2(Object[] objects) {
        entity_WrongAnswer_1 = (entity.WrongAnswer) objects[0];
        entity_MERFunction_1 = (entity.MERFunction) objects[1];
    }

    /**
     * Condition 0 of rule ruleMRE_2.<p>
     * The original expression was:<br>
     * <code>merFunction.getTipo() == 11</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_2_cond_0() {
        return (entity_MERFunction_1.getTipo() == 11);
    }

    /**
     * Condition 1 of rule ruleMRE_2.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getTipo() == 1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_2_cond_1() {
        return (entity_WrongAnswer_1.getTipo() == 1);
    }

    /**
     * Checks whether some conditions of rule ruleMRE_2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_2_cond(int index) {
        switch (index) {
            case 0: return ruleMRE_2_cond_0();
            case 1: return ruleMRE_2_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMRE_2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMRE_2(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMRE_2_cond_1()) return false;
                return true;
            case 1:
                if (!ruleMRE_2_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMRE_2(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule ruleMRE_2
     */
    private void ruleMRE_2() {
			System.out.println("Exibição de MRE 5 - Figura enumerando as laranjas extras que Helena possui, para o aluno poder identificar a quantidade exata de laranjas que ela possui");
			flush();

	    }



// end_rules
	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "ruleMRE_0",
        "ruleMRE_1",
        "ruleMRE_2"
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
        2,
        2,
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
        2,
        2,
        2
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
            case 0: return ruleMRE_0_cond(condIndex);
            case 1: return ruleMRE_1_cond(condIndex);
            case 2: return ruleMRE_2_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_ruleMRE_0(declIndex);
            case 1: return checkConditionsOnlyOf_ruleMRE_1(declIndex);
            case 2: return checkConditionsOnlyOf_ruleMRE_2(declIndex);
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
            case 0: return checkCondForDeclaration_ruleMRE_0(declIndex);
            case 1: return checkCondForDeclaration_ruleMRE_1(declIndex);
            case 2: return checkCondForDeclaration_ruleMRE_2(declIndex);
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
            case 0: return getDeclaredClassName_ruleMRE_0(declIndex);
            case 1: return getDeclaredClassName_ruleMRE_1(declIndex);
            case 2: return getDeclaredClassName_ruleMRE_2(declIndex);
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
            case 0: return getDeclaredClass_ruleMRE_0(declIndex);
            case 1: return getDeclaredClass_ruleMRE_1(declIndex);
            case 2: return getDeclaredClass_ruleMRE_2(declIndex);
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
            case 0: ruleMRE_0(); break;
            case 1: ruleMRE_1(); break;
            case 2: ruleMRE_2(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 3;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_ruleMRE_0();
            case 1: return getDeclaredIdentifiers_ruleMRE_1();
            case 2: return getDeclaredIdentifiers_ruleMRE_2();
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
            case 0: setObject_ruleMRE_0(declIndex, value); break;
            case 1: setObject_ruleMRE_1(declIndex, value); break;
            case 2: setObject_ruleMRE_2(declIndex, value); break;
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
            case 0: return getObject_ruleMRE_0(declIndex);
            case 1: return getObject_ruleMRE_1(declIndex);
            case 2: return getObject_ruleMRE_2(declIndex);
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
            case 0: return getObjects_ruleMRE_0();
            case 1: return getObjects_ruleMRE_1();
            case 2: return getObjects_ruleMRE_2();
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
            case 0: setObjects_ruleMRE_0(objects); break;
            case 1: setObjects_ruleMRE_1(objects); break;
            case 2: setObjects_ruleMRE_2(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private entity.WrongAnswer entity_WrongAnswer_1;
    private entity.MERFunction entity_MERFunction_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_MERManagerKB(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file MERManagerKB.rules
 *
 * @version 28/05/2014
 */
public class MERManagerKB extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public MERManagerKB(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public MERManagerKB() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_MERManagerKB(this);
    }

}
