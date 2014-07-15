package module.expression.identifier;

import module.entity.Historic;
import module.entity.WrongAnswer;
import module.entity.RuleToHuman;
import java.util.ArrayList;
import module.error.sorter.ErrorSorterController;


 class Jeops_RuleBase_ExpressionIdentifierWrongAnswerKB extends jeops.AbstractRuleBase {



	
    /**
     * Identifiers of rule wrongAnswer_0
     */
    private String[] identifiers_wrongAnswer_0 = {
        "h",
        "wrongAnswer",
        "ruleToHuman"
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
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.RuleToHuman";
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
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.RuleToHuman.class;
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
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
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
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_RuleToHuman_1;
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
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_RuleToHuman_1
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
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule wrongAnswer_0.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[0].equalsIgnoreCase("10")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_0_cond_0() {
        return (module_entity_Historic_1.getResposta().getAnswers()[0].equalsIgnoreCase("10"));
    }

    /**
     * Condition 1 of rule wrongAnswer_0.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[1].equalsIgnoreCase("10")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_0_cond_1() {
        return (module_entity_Historic_1.getResposta().getAnswers()[1].equalsIgnoreCase("10"));
    }

    /**
     * Condition 2 of rule wrongAnswer_0.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[2].equalsIgnoreCase("16")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_0_cond_2() {
        return (module_entity_Historic_1.getResposta().getAnswers()[2].equalsIgnoreCase("16"));
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
            case 1: return wrongAnswer_0_cond_1();
            case 2: return wrongAnswer_0_cond_2();
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
                if (!wrongAnswer_0_cond_1()) return false;
                if (!wrongAnswer_0_cond_2()) return false;
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
    private boolean checkCondForDeclaration_wrongAnswer_0(int declIndex) {
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
     * Executes the action part of the rule wrongAnswer_0
     */
    private void wrongAnswer_0() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: wrongAnswer_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 0 = 10\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 1 = 10\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 2 = 16\n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_WrongAnswer_1.setAnswers(module_entity_Historic_1.getResposta().getAnswers());
			modified(module_entity_WrongAnswer_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule wrongAnswer_1
     */
    private String[] identifiers_wrongAnswer_1 = {
        "h",
        "wrongAnswer",
        "ruleToHuman"
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
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.RuleToHuman";
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
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.RuleToHuman.class;
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
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
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
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_RuleToHuman_1;
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
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_RuleToHuman_1
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
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule wrongAnswer_1.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[0].equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_1_cond_0() {
        return (module_entity_Historic_1.getResposta().getAnswers()[0].equalsIgnoreCase("6"));
    }

    /**
     * Condition 1 of rule wrongAnswer_1.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[1].equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_1_cond_1() {
        return (module_entity_Historic_1.getResposta().getAnswers()[1].equalsIgnoreCase("6"));
    }

    /**
     * Condition 2 of rule wrongAnswer_1.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[2].equalsIgnoreCase("16")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_1_cond_2() {
        return (module_entity_Historic_1.getResposta().getAnswers()[2].equalsIgnoreCase("16"));
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
            case 1: return wrongAnswer_1_cond_1();
            case 2: return wrongAnswer_1_cond_2();
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
                if (!wrongAnswer_1_cond_1()) return false;
                if (!wrongAnswer_1_cond_2()) return false;
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
    private boolean checkCondForDeclaration_wrongAnswer_1(int declIndex) {
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
     * Executes the action part of the rule wrongAnswer_1
     */
    private void wrongAnswer_1() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: wrongAnswer_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 0 = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 1 = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 2 = 16\n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_WrongAnswer_1.setAnswers(module_entity_Historic_1.getResposta().getAnswers());
			modified(module_entity_WrongAnswer_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule wrongAnswer_2
     */
    private String[] identifiers_wrongAnswer_2 = {
        "h",
        "wrongAnswer",
        "ruleToHuman"
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
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.RuleToHuman";
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
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.RuleToHuman.class;
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
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
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
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_RuleToHuman_1;
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
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_RuleToHuman_1
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
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule wrongAnswer_2.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[0].equalsIgnoreCase("10")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_2_cond_0() {
        return (module_entity_Historic_1.getResposta().getAnswers()[0].equalsIgnoreCase("10"));
    }

    /**
     * Condition 1 of rule wrongAnswer_2.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[1].equalsIgnoreCase("10")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_2_cond_1() {
        return (module_entity_Historic_1.getResposta().getAnswers()[1].equalsIgnoreCase("10"));
    }

    /**
     * Condition 2 of rule wrongAnswer_2.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[2].equalsIgnoreCase("")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_2_cond_2() {
        return (module_entity_Historic_1.getResposta().getAnswers()[2].equalsIgnoreCase(""));
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
            case 1: return wrongAnswer_2_cond_1();
            case 2: return wrongAnswer_2_cond_2();
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
                if (!wrongAnswer_2_cond_1()) return false;
                if (!wrongAnswer_2_cond_2()) return false;
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
    private boolean checkCondForDeclaration_wrongAnswer_2(int declIndex) {
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
     * Executes the action part of the rule wrongAnswer_2
     */
    private void wrongAnswer_2() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: wrongAnswer_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 0 = 10\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 1 = 10\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 2 = \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_WrongAnswer_1.setAnswers(module_entity_Historic_1.getResposta().getAnswers());
			modified(module_entity_WrongAnswer_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule wrongAnswer_3
     */
    private String[] identifiers_wrongAnswer_3 = {
        "h",
        "wrongAnswer",
        "ruleToHuman"
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
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.RuleToHuman";
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
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.RuleToHuman.class;
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
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
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
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_RuleToHuman_1;
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
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_RuleToHuman_1
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
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule wrongAnswer_3.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[0].equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_3_cond_0() {
        return (module_entity_Historic_1.getResposta().getAnswers()[0].equalsIgnoreCase("6"));
    }

    /**
     * Condition 1 of rule wrongAnswer_3.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[1].equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_3_cond_1() {
        return (module_entity_Historic_1.getResposta().getAnswers()[1].equalsIgnoreCase("6"));
    }

    /**
     * Condition 2 of rule wrongAnswer_3.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[2].equalsIgnoreCase("")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_3_cond_2() {
        return (module_entity_Historic_1.getResposta().getAnswers()[2].equalsIgnoreCase(""));
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
            case 1: return wrongAnswer_3_cond_1();
            case 2: return wrongAnswer_3_cond_2();
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
                if (!wrongAnswer_3_cond_1()) return false;
                if (!wrongAnswer_3_cond_2()) return false;
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
    private boolean checkCondForDeclaration_wrongAnswer_3(int declIndex) {
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
     * Executes the action part of the rule wrongAnswer_3
     */
    private void wrongAnswer_3() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: wrongAnswer_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 0 = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 1 = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 2 = \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_WrongAnswer_1.setAnswers(module_entity_Historic_1.getResposta().getAnswers());
			modified(module_entity_WrongAnswer_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule wrongAnswer_4
     */
    private String[] identifiers_wrongAnswer_4 = {
        "h",
        "wrongAnswer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule wrongAnswer_4
     *
     * @return the identifiers declared in rule wrongAnswer_4
     */
    private String[] getDeclaredIdentifiers_wrongAnswer_4() {
         return identifiers_wrongAnswer_4;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule wrongAnswer_4.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_wrongAnswer_4(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule wrongAnswer_4.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_wrongAnswer_4(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule wrongAnswer_4.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_wrongAnswer_4(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule wrongAnswer_4.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_wrongAnswer_4(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule wrongAnswer_4
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_wrongAnswer_4() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule wrongAnswer_4
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_wrongAnswer_4(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule wrongAnswer_4.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[0].equalsIgnoreCase("10")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_4_cond_0() {
        return (module_entity_Historic_1.getResposta().getAnswers()[0].equalsIgnoreCase("10"));
    }

    /**
     * Condition 1 of rule wrongAnswer_4.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[1].equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_4_cond_1() {
        return (module_entity_Historic_1.getResposta().getAnswers()[1].equalsIgnoreCase("6"));
    }

    /**
     * Condition 2 of rule wrongAnswer_4.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[2].equalsIgnoreCase("4")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_4_cond_2() {
        return (module_entity_Historic_1.getResposta().getAnswers()[2].equalsIgnoreCase("4"));
    }

    /**
     * Checks whether some conditions of rule wrongAnswer_4 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_4_cond(int index) {
        switch (index) {
            case 0: return wrongAnswer_4_cond_0();
            case 1: return wrongAnswer_4_cond_1();
            case 2: return wrongAnswer_4_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule wrongAnswer_4 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_wrongAnswer_4(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!wrongAnswer_4_cond_0()) return false;
                if (!wrongAnswer_4_cond_1()) return false;
                if (!wrongAnswer_4_cond_2()) return false;
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
    private boolean checkCondForDeclaration_wrongAnswer_4(int declIndex) {
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
     * Executes the action part of the rule wrongAnswer_4
     */
    private void wrongAnswer_4() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: wrongAnswer_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 0 = 10\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 1 = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 2 = 4\n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_WrongAnswer_1.setAnswers(module_entity_Historic_1.getResposta().getAnswers());
			modified(module_entity_WrongAnswer_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule wrongAnswer_5
     */
    private String[] identifiers_wrongAnswer_5 = {
        "h",
        "wrongAnswer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule wrongAnswer_5
     *
     * @return the identifiers declared in rule wrongAnswer_5
     */
    private String[] getDeclaredIdentifiers_wrongAnswer_5() {
         return identifiers_wrongAnswer_5;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule wrongAnswer_5.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_wrongAnswer_5(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule wrongAnswer_5.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_wrongAnswer_5(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule wrongAnswer_5.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_wrongAnswer_5(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule wrongAnswer_5.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_wrongAnswer_5(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule wrongAnswer_5
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_wrongAnswer_5() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule wrongAnswer_5
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_wrongAnswer_5(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule wrongAnswer_5.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[0].equalsIgnoreCase("")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_5_cond_0() {
        return (module_entity_Historic_1.getResposta().getAnswers()[0].equalsIgnoreCase(""));
    }

    /**
     * Condition 1 of rule wrongAnswer_5.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[1].equalsIgnoreCase("")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_5_cond_1() {
        return (module_entity_Historic_1.getResposta().getAnswers()[1].equalsIgnoreCase(""));
    }

    /**
     * Condition 2 of rule wrongAnswer_5.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[2].equalsIgnoreCase("")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_5_cond_2() {
        return (module_entity_Historic_1.getResposta().getAnswers()[2].equalsIgnoreCase(""));
    }

    /**
     * Condition 3 of rule wrongAnswer_5.<p>
     * The original expression was:<br>
     * <code>h.getNumeroTentativas() >= 2</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_5_cond_3() {
        return (module_entity_Historic_1.getNumeroTentativas() >= 2);
    }

    /**
     * Checks whether some conditions of rule wrongAnswer_5 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_5_cond(int index) {
        switch (index) {
            case 0: return wrongAnswer_5_cond_0();
            case 1: return wrongAnswer_5_cond_1();
            case 2: return wrongAnswer_5_cond_2();
            case 3: return wrongAnswer_5_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule wrongAnswer_5 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_wrongAnswer_5(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!wrongAnswer_5_cond_0()) return false;
                if (!wrongAnswer_5_cond_1()) return false;
                if (!wrongAnswer_5_cond_2()) return false;
                if (!wrongAnswer_5_cond_3()) return false;
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
    private boolean checkCondForDeclaration_wrongAnswer_5(int declIndex) {
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
     * Executes the action part of the rule wrongAnswer_5
     */
    private void wrongAnswer_5() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: wrongAnswer_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 0 = \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 1 = \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 2 = \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_WrongAnswer_1.setAnswers(module_entity_Historic_1.getResposta().getAnswers());
			modified(module_entity_WrongAnswer_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule wrongAnswer_6
     */
    private String[] identifiers_wrongAnswer_6 = {
        "h",
        "wrongAnswer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule wrongAnswer_6
     *
     * @return the identifiers declared in rule wrongAnswer_6
     */
    private String[] getDeclaredIdentifiers_wrongAnswer_6() {
         return identifiers_wrongAnswer_6;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule wrongAnswer_6.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_wrongAnswer_6(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule wrongAnswer_6.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_wrongAnswer_6(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule wrongAnswer_6.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_wrongAnswer_6(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule wrongAnswer_6.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_wrongAnswer_6(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule wrongAnswer_6
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_wrongAnswer_6() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule wrongAnswer_6
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_wrongAnswer_6(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule wrongAnswer_6.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[0].equalsIgnoreCase("10")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_6_cond_0() {
        return (module_entity_Historic_1.getResposta().getAnswers()[0].equalsIgnoreCase("10"));
    }

    /**
     * Condition 1 of rule wrongAnswer_6.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[1].equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_6_cond_1() {
        return (module_entity_Historic_1.getResposta().getAnswers()[1].equalsIgnoreCase("6"));
    }

    /**
     * Condition 2 of rule wrongAnswer_6.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[2].equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_6_cond_2() {
        return (module_entity_Historic_1.getResposta().getAnswers()[2].equalsIgnoreCase("6"));
    }

    /**
     * Condition 3 of rule wrongAnswer_6.<p>
     * The original expression was:<br>
     * <code>h.getNumeroTentativas() >= 2</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_6_cond_3() {
        return (module_entity_Historic_1.getNumeroTentativas() >= 2);
    }

    /**
     * Checks whether some conditions of rule wrongAnswer_6 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_6_cond(int index) {
        switch (index) {
            case 0: return wrongAnswer_6_cond_0();
            case 1: return wrongAnswer_6_cond_1();
            case 2: return wrongAnswer_6_cond_2();
            case 3: return wrongAnswer_6_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule wrongAnswer_6 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_wrongAnswer_6(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!wrongAnswer_6_cond_0()) return false;
                if (!wrongAnswer_6_cond_1()) return false;
                if (!wrongAnswer_6_cond_2()) return false;
                if (!wrongAnswer_6_cond_3()) return false;
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
    private boolean checkCondForDeclaration_wrongAnswer_6(int declIndex) {
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
     * Executes the action part of the rule wrongAnswer_6
     */
    private void wrongAnswer_6() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: wrongAnswer_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 0 = 10\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 1 = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 2 = 6\n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_WrongAnswer_1.setAnswers(module_entity_Historic_1.getResposta().getAnswers());
			modified(module_entity_WrongAnswer_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule wrongAnswer_7
     */
    private String[] identifiers_wrongAnswer_7 = {
        "h",
        "wrongAnswer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule wrongAnswer_7
     *
     * @return the identifiers declared in rule wrongAnswer_7
     */
    private String[] getDeclaredIdentifiers_wrongAnswer_7() {
         return identifiers_wrongAnswer_7;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule wrongAnswer_7.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_wrongAnswer_7(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule wrongAnswer_7.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_wrongAnswer_7(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule wrongAnswer_7.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_wrongAnswer_7(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule wrongAnswer_7.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_wrongAnswer_7(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule wrongAnswer_7
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_wrongAnswer_7() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule wrongAnswer_7
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_wrongAnswer_7(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule wrongAnswer_7.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[0].equalsIgnoreCase("")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_7_cond_0() {
        return (module_entity_Historic_1.getResposta().getAnswers()[0].equalsIgnoreCase(""));
    }

    /**
     * Condition 1 of rule wrongAnswer_7.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[1].equalsIgnoreCase("")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_7_cond_1() {
        return (module_entity_Historic_1.getResposta().getAnswers()[1].equalsIgnoreCase(""));
    }

    /**
     * Condition 2 of rule wrongAnswer_7.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[2].equalsIgnoreCase("")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_7_cond_2() {
        return (module_entity_Historic_1.getResposta().getAnswers()[2].equalsIgnoreCase(""));
    }

    /**
     * Condition 3 of rule wrongAnswer_7.<p>
     * The original expression was:<br>
     * <code>h.getNumeroTentativas() >= 2</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_7_cond_3() {
        return (module_entity_Historic_1.getNumeroTentativas() >= 2);
    }

    /**
     * Checks whether some conditions of rule wrongAnswer_7 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_7_cond(int index) {
        switch (index) {
            case 0: return wrongAnswer_7_cond_0();
            case 1: return wrongAnswer_7_cond_1();
            case 2: return wrongAnswer_7_cond_2();
            case 3: return wrongAnswer_7_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule wrongAnswer_7 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_wrongAnswer_7(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!wrongAnswer_7_cond_0()) return false;
                if (!wrongAnswer_7_cond_1()) return false;
                if (!wrongAnswer_7_cond_2()) return false;
                if (!wrongAnswer_7_cond_3()) return false;
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
    private boolean checkCondForDeclaration_wrongAnswer_7(int declIndex) {
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
     * Executes the action part of the rule wrongAnswer_7
     */
    private void wrongAnswer_7() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: wrongAnswer_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 0 = \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 1 = \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 2 = \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_WrongAnswer_1.setAnswers(module_entity_Historic_1.getResposta().getAnswers());
			modified(module_entity_WrongAnswer_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule wrongAnswer_8
     */
    private String[] identifiers_wrongAnswer_8 = {
        "h",
        "wrongAnswer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule wrongAnswer_8
     *
     * @return the identifiers declared in rule wrongAnswer_8
     */
    private String[] getDeclaredIdentifiers_wrongAnswer_8() {
         return identifiers_wrongAnswer_8;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule wrongAnswer_8.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_wrongAnswer_8(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule wrongAnswer_8.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_wrongAnswer_8(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule wrongAnswer_8.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_wrongAnswer_8(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule wrongAnswer_8.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_wrongAnswer_8(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule wrongAnswer_8
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_wrongAnswer_8() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule wrongAnswer_8
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_wrongAnswer_8(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule wrongAnswer_8.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[0].equalsIgnoreCase("1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_8_cond_0() {
        return (module_entity_Historic_1.getResposta().getAnswers()[0].equalsIgnoreCase("1"));
    }

    /**
     * Condition 1 of rule wrongAnswer_8.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[1].equalsIgnoreCase("1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_8_cond_1() {
        return (module_entity_Historic_1.getResposta().getAnswers()[1].equalsIgnoreCase("1"));
    }

    /**
     * Condition 2 of rule wrongAnswer_8.<p>
     * The original expression was:<br>
     * <code>h.getResposta().getAnswers()[2].equalsIgnoreCase("1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_8_cond_2() {
        return (module_entity_Historic_1.getResposta().getAnswers()[2].equalsIgnoreCase("1"));
    }

    /**
     * Checks whether some conditions of rule wrongAnswer_8 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_8_cond(int index) {
        switch (index) {
            case 0: return wrongAnswer_8_cond_0();
            case 1: return wrongAnswer_8_cond_1();
            case 2: return wrongAnswer_8_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule wrongAnswer_8 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_wrongAnswer_8(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!wrongAnswer_8_cond_0()) return false;
                if (!wrongAnswer_8_cond_1()) return false;
                if (!wrongAnswer_8_cond_2()) return false;
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
    private boolean checkCondForDeclaration_wrongAnswer_8(int declIndex) {
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
     * Executes the action part of the rule wrongAnswer_8
     */
    private void wrongAnswer_8() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: wrongAnswer_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 0 = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 1 = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 2 = 1\n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_WrongAnswer_1.setAnswers(module_entity_Historic_1.getResposta().getAnswers());
			modified(module_entity_WrongAnswer_1);
			modified(module_entity_RuleToHuman_1);
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
        "wrongAnswer_3",
        "wrongAnswer_4",
        "wrongAnswer_5",
        "wrongAnswer_6",
        "wrongAnswer_7",
        "wrongAnswer_8"
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
        3,
        3,
        3,
        3,
        3,
        3,
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
        3,
        3,
        3,
        3,
        4,
        4,
        4,
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
            case 0: return wrongAnswer_0_cond(condIndex);
            case 1: return wrongAnswer_1_cond(condIndex);
            case 2: return wrongAnswer_2_cond(condIndex);
            case 3: return wrongAnswer_3_cond(condIndex);
            case 4: return wrongAnswer_4_cond(condIndex);
            case 5: return wrongAnswer_5_cond(condIndex);
            case 6: return wrongAnswer_6_cond(condIndex);
            case 7: return wrongAnswer_7_cond(condIndex);
            case 8: return wrongAnswer_8_cond(condIndex);
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
            case 4: return checkConditionsOnlyOf_wrongAnswer_4(declIndex);
            case 5: return checkConditionsOnlyOf_wrongAnswer_5(declIndex);
            case 6: return checkConditionsOnlyOf_wrongAnswer_6(declIndex);
            case 7: return checkConditionsOnlyOf_wrongAnswer_7(declIndex);
            case 8: return checkConditionsOnlyOf_wrongAnswer_8(declIndex);
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
            case 4: return checkCondForDeclaration_wrongAnswer_4(declIndex);
            case 5: return checkCondForDeclaration_wrongAnswer_5(declIndex);
            case 6: return checkCondForDeclaration_wrongAnswer_6(declIndex);
            case 7: return checkCondForDeclaration_wrongAnswer_7(declIndex);
            case 8: return checkCondForDeclaration_wrongAnswer_8(declIndex);
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
            case 4: return getDeclaredClassName_wrongAnswer_4(declIndex);
            case 5: return getDeclaredClassName_wrongAnswer_5(declIndex);
            case 6: return getDeclaredClassName_wrongAnswer_6(declIndex);
            case 7: return getDeclaredClassName_wrongAnswer_7(declIndex);
            case 8: return getDeclaredClassName_wrongAnswer_8(declIndex);
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
            case 4: return getDeclaredClass_wrongAnswer_4(declIndex);
            case 5: return getDeclaredClass_wrongAnswer_5(declIndex);
            case 6: return getDeclaredClass_wrongAnswer_6(declIndex);
            case 7: return getDeclaredClass_wrongAnswer_7(declIndex);
            case 8: return getDeclaredClass_wrongAnswer_8(declIndex);
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
            case 4: wrongAnswer_4(); break;
            case 5: wrongAnswer_5(); break;
            case 6: wrongAnswer_6(); break;
            case 7: wrongAnswer_7(); break;
            case 8: wrongAnswer_8(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 9;
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
            case 4: return getDeclaredIdentifiers_wrongAnswer_4();
            case 5: return getDeclaredIdentifiers_wrongAnswer_5();
            case 6: return getDeclaredIdentifiers_wrongAnswer_6();
            case 7: return getDeclaredIdentifiers_wrongAnswer_7();
            case 8: return getDeclaredIdentifiers_wrongAnswer_8();
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
            case 4: setObject_wrongAnswer_4(declIndex, value); break;
            case 5: setObject_wrongAnswer_5(declIndex, value); break;
            case 6: setObject_wrongAnswer_6(declIndex, value); break;
            case 7: setObject_wrongAnswer_7(declIndex, value); break;
            case 8: setObject_wrongAnswer_8(declIndex, value); break;
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
            case 4: return getObject_wrongAnswer_4(declIndex);
            case 5: return getObject_wrongAnswer_5(declIndex);
            case 6: return getObject_wrongAnswer_6(declIndex);
            case 7: return getObject_wrongAnswer_7(declIndex);
            case 8: return getObject_wrongAnswer_8(declIndex);
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
            case 4: return getObjects_wrongAnswer_4();
            case 5: return getObjects_wrongAnswer_5();
            case 6: return getObjects_wrongAnswer_6();
            case 7: return getObjects_wrongAnswer_7();
            case 8: return getObjects_wrongAnswer_8();
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
            case 4: setObjects_wrongAnswer_4(objects); break;
            case 5: setObjects_wrongAnswer_5(objects); break;
            case 6: setObjects_wrongAnswer_6(objects); break;
            case 7: setObjects_wrongAnswer_7(objects); break;
            case 8: setObjects_wrongAnswer_8(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private module.entity.Historic module_entity_Historic_1;
    private module.entity.WrongAnswer module_entity_WrongAnswer_1;
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
 * @version 15/07/2014
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
