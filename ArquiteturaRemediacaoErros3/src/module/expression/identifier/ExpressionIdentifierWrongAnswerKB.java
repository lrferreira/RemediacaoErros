package module.expression.identifier;

import entity.Historic;
import entity.WrongAnswer;
import java.util.ArrayList;
import module.error.sorter.ClassificadorErroControlador;


 class Jeops_RuleBase_ExpressionIdentifierWrongAnswerKB extends jeops.AbstractRuleBase {



	
    /**
     * Identifiers of rule wrongAnswer_0
     */
    private String[] identifiers_wrongAnswer_0 = {
        "h",
        "wrongAnswer"
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




	
    /**
     * Identifiers of rule wrongAnswer_1
     */
    private String[] identifiers_wrongAnswer_1 = {
        "h",
        "wrongAnswer"
    };

    /**
     * Returns the identifiers declared in rule wrongAnswer_1
     *
     * @return the identifiers declared in rule wrongAnswer_1
     */
    private String[] getDeclaredIdentifiers_wrongAnswer_1() {
         return identifiers_wrongAnswer_1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule wrongAnswer_1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_wrongAnswer_1(int index) {
        switch (index) {
            case 0: return "entity.Historic";
            case 1: return "entity.WrongAnswer";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule wrongAnswer_1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_wrongAnswer_1(int index) {
        switch (index) {
            case 0: return entity.Historic.class;
            case 1: return entity.WrongAnswer.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule wrongAnswer_1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_wrongAnswer_1(int index, Object value) {
        switch (index) {
            case 0: this.entity_Historic_1 = (entity.Historic) value; break;
            case 1: this.entity_WrongAnswer_1 = (entity.WrongAnswer) value; break;
        }
    }

    /**
     * Returns an object declared in the rule wrongAnswer_1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_wrongAnswer_1(int index) {
        switch (index) {
            case 0: return entity_Historic_1;
            case 1: return entity_WrongAnswer_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule wrongAnswer_1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_wrongAnswer_1() {
        return new Object[] {
                            entity_Historic_1,
                            entity_WrongAnswer_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule wrongAnswer_1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_wrongAnswer_1(Object[] objects) {
        entity_Historic_1 = (entity.Historic) objects[0];
        entity_WrongAnswer_1 = (entity.WrongAnswer) objects[1];
    }

    /**
     * Condition 0 of rule wrongAnswer_1.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getDescricao().equalsIgnoreCase("456")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_1_cond_0() {
        return (entity_Historic_1.getResposta().getDescricao().equalsIgnoreCase("456"));
    }

    /**
     * Checks whether some conditions of rule wrongAnswer_1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_1_cond(int index) {
        switch (index) {
            case 0: return wrongAnswer_1_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule wrongAnswer_1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_wrongAnswer_1(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!wrongAnswer_1_cond_0()) return false;
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
    private boolean checkCondForDeclaration_wrongAnswer_1(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule wrongAnswer_1
     */
    private void wrongAnswer_1() {
			entity_Historic_1.setNumeroTentativas(entity_Historic_1.getNumeroTentativas() + 1);
			modified(entity_Historic_1);
			System.out.println("Resposta Errada (1) detectada");
			entity_WrongAnswer_1.setDescricao(entity_Historic_1.getResposta().getDescricao());
			modified(entity_WrongAnswer_1);
			flush();

	    }




	
    /**
     * Identifiers of rule wrongAnswer_2
     */
    private String[] identifiers_wrongAnswer_2 = {
        "h",
        "wrongAnswer"
    };

    /**
     * Returns the identifiers declared in rule wrongAnswer_2
     *
     * @return the identifiers declared in rule wrongAnswer_2
     */
    private String[] getDeclaredIdentifiers_wrongAnswer_2() {
         return identifiers_wrongAnswer_2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule wrongAnswer_2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_wrongAnswer_2(int index) {
        switch (index) {
            case 0: return "entity.Historic";
            case 1: return "entity.WrongAnswer";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule wrongAnswer_2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_wrongAnswer_2(int index) {
        switch (index) {
            case 0: return entity.Historic.class;
            case 1: return entity.WrongAnswer.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule wrongAnswer_2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_wrongAnswer_2(int index, Object value) {
        switch (index) {
            case 0: this.entity_Historic_1 = (entity.Historic) value; break;
            case 1: this.entity_WrongAnswer_1 = (entity.WrongAnswer) value; break;
        }
    }

    /**
     * Returns an object declared in the rule wrongAnswer_2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_wrongAnswer_2(int index) {
        switch (index) {
            case 0: return entity_Historic_1;
            case 1: return entity_WrongAnswer_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule wrongAnswer_2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_wrongAnswer_2() {
        return new Object[] {
                            entity_Historic_1,
                            entity_WrongAnswer_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule wrongAnswer_2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_wrongAnswer_2(Object[] objects) {
        entity_Historic_1 = (entity.Historic) objects[0];
        entity_WrongAnswer_1 = (entity.WrongAnswer) objects[1];
    }

    /**
     * Condition 0 of rule wrongAnswer_2.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getDescricao().equalsIgnoreCase("789")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_2_cond_0() {
        return (entity_Historic_1.getResposta().getDescricao().equalsIgnoreCase("789"));
    }

    /**
     * Checks whether some conditions of rule wrongAnswer_2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_2_cond(int index) {
        switch (index) {
            case 0: return wrongAnswer_2_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule wrongAnswer_2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_wrongAnswer_2(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!wrongAnswer_2_cond_0()) return false;
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
    private boolean checkCondForDeclaration_wrongAnswer_2(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule wrongAnswer_2
     */
    private void wrongAnswer_2() {
			entity_Historic_1.setNumeroTentativas(entity_Historic_1.getNumeroTentativas() + 1);
			modified(entity_Historic_1);
			System.out.println("Resposta Errada (1) detectada");
			entity_WrongAnswer_1.setDescricao(entity_Historic_1.getResposta().getDescricao());
			modified(entity_WrongAnswer_1);
			flush();

	    }




	
    /**
     * Identifiers of rule wrongAnswer_3
     */
    private String[] identifiers_wrongAnswer_3 = {
        "h",
        "wrongAnswer"
    };

    /**
     * Returns the identifiers declared in rule wrongAnswer_3
     *
     * @return the identifiers declared in rule wrongAnswer_3
     */
    private String[] getDeclaredIdentifiers_wrongAnswer_3() {
         return identifiers_wrongAnswer_3;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule wrongAnswer_3.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_wrongAnswer_3(int index) {
        switch (index) {
            case 0: return "entity.Historic";
            case 1: return "entity.WrongAnswer";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule wrongAnswer_3.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_wrongAnswer_3(int index) {
        switch (index) {
            case 0: return entity.Historic.class;
            case 1: return entity.WrongAnswer.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule wrongAnswer_3.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_wrongAnswer_3(int index, Object value) {
        switch (index) {
            case 0: this.entity_Historic_1 = (entity.Historic) value; break;
            case 1: this.entity_WrongAnswer_1 = (entity.WrongAnswer) value; break;
        }
    }

    /**
     * Returns an object declared in the rule wrongAnswer_3.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_wrongAnswer_3(int index) {
        switch (index) {
            case 0: return entity_Historic_1;
            case 1: return entity_WrongAnswer_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule wrongAnswer_3
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_wrongAnswer_3() {
        return new Object[] {
                            entity_Historic_1,
                            entity_WrongAnswer_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule wrongAnswer_3
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_wrongAnswer_3(Object[] objects) {
        entity_Historic_1 = (entity.Historic) objects[0];
        entity_WrongAnswer_1 = (entity.WrongAnswer) objects[1];
    }

    /**
     * Condition 0 of rule wrongAnswer_3.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getDescricao().equalsIgnoreCase("4")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_3_cond_0() {
        return (entity_Historic_1.getResposta().getDescricao().equalsIgnoreCase("4"));
    }

    /**
     * Checks whether some conditions of rule wrongAnswer_3 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_3_cond(int index) {
        switch (index) {
            case 0: return wrongAnswer_3_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule wrongAnswer_3 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_wrongAnswer_3(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!wrongAnswer_3_cond_0()) return false;
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
    private boolean checkCondForDeclaration_wrongAnswer_3(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule wrongAnswer_3
     */
    private void wrongAnswer_3() {
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
        "wrongAnswer_0",
        "wrongAnswer_1",
        "wrongAnswer_2",
        "wrongAnswer_3"
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
        1,
        1,
        1,
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
            case 1: return wrongAnswer_1_cond(condIndex);
            case 2: return wrongAnswer_2_cond(condIndex);
            case 3: return wrongAnswer_3_cond(condIndex);
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
            case 1: return checkConditionsOnlyOf_wrongAnswer_1(declIndex);
            case 2: return checkConditionsOnlyOf_wrongAnswer_2(declIndex);
            case 3: return checkConditionsOnlyOf_wrongAnswer_3(declIndex);
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
            case 1: return checkCondForDeclaration_wrongAnswer_1(declIndex);
            case 2: return checkCondForDeclaration_wrongAnswer_2(declIndex);
            case 3: return checkCondForDeclaration_wrongAnswer_3(declIndex);
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
            case 1: return getDeclaredClassName_wrongAnswer_1(declIndex);
            case 2: return getDeclaredClassName_wrongAnswer_2(declIndex);
            case 3: return getDeclaredClassName_wrongAnswer_3(declIndex);
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
            case 1: return getDeclaredClass_wrongAnswer_1(declIndex);
            case 2: return getDeclaredClass_wrongAnswer_2(declIndex);
            case 3: return getDeclaredClass_wrongAnswer_3(declIndex);
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
            case 1: wrongAnswer_1(); break;
            case 2: wrongAnswer_2(); break;
            case 3: wrongAnswer_3(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 4;
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
            case 1: return getDeclaredIdentifiers_wrongAnswer_1();
            case 2: return getDeclaredIdentifiers_wrongAnswer_2();
            case 3: return getDeclaredIdentifiers_wrongAnswer_3();
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
            case 1: setObject_wrongAnswer_1(declIndex, value); break;
            case 2: setObject_wrongAnswer_2(declIndex, value); break;
            case 3: setObject_wrongAnswer_3(declIndex, value); break;
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
            case 1: return getObject_wrongAnswer_1(declIndex);
            case 2: return getObject_wrongAnswer_2(declIndex);
            case 3: return getObject_wrongAnswer_3(declIndex);
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
            case 1: return getObjects_wrongAnswer_1();
            case 2: return getObjects_wrongAnswer_2();
            case 3: return getObjects_wrongAnswer_3();
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
            case 1: setObjects_wrongAnswer_1(objects); break;
            case 2: setObjects_wrongAnswer_2(objects); break;
            case 3: setObjects_wrongAnswer_3(objects); break;
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
    public Jeops_RuleBase_ExpressionIdentifierWrongAnswerKB(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file ExpressionIdentifierWrongAnswerKB.rules
 *
 * @version 28/05/2014
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
