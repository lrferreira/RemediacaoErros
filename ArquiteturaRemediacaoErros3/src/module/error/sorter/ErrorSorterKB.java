package module.error.sorter;

import module.entity.WrongAnswer;
import module.entity.Historic;
import module.entity.RuleToHuman;
import util.Constants;


 class Jeops_RuleBase_ErrorSorterKB extends jeops.AbstractRuleBase {
	


	
    /**
     * Identifiers of rule directlyIdentifiableDeficiencyDomain_0
     */
    private String[] identifiers_directlyIdentifiableDeficiencyDomain_0 = {
        "h",
        "wrongAnswer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule directlyIdentifiableDeficiencyDomain_0
     *
     * @return the identifiers declared in rule directlyIdentifiableDeficiencyDomain_0
     */
    private String[] getDeclaredIdentifiers_directlyIdentifiableDeficiencyDomain_0() {
         return identifiers_directlyIdentifiableDeficiencyDomain_0;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule directlyIdentifiableDeficiencyDomain_0.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_directlyIdentifiableDeficiencyDomain_0(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule directlyIdentifiableDeficiencyDomain_0.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_directlyIdentifiableDeficiencyDomain_0(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule directlyIdentifiableDeficiencyDomain_0.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_directlyIdentifiableDeficiencyDomain_0(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule directlyIdentifiableDeficiencyDomain_0.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_directlyIdentifiableDeficiencyDomain_0(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule directlyIdentifiableDeficiencyDomain_0
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_directlyIdentifiableDeficiencyDomain_0() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule directlyIdentifiableDeficiencyDomain_0
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_directlyIdentifiableDeficiencyDomain_0(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule directlyIdentifiableDeficiencyDomain_0.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[0].equalsIgnoreCase("10")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyDomain_0_cond_0() {
        return (module_entity_WrongAnswer_1.getAnswers()[0].equalsIgnoreCase("10"));
    }

    /**
     * Condition 1 of rule directlyIdentifiableDeficiencyDomain_0.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[1].equalsIgnoreCase("10")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyDomain_0_cond_1() {
        return (module_entity_WrongAnswer_1.getAnswers()[1].equalsIgnoreCase("10"));
    }

    /**
     * Condition 2 of rule directlyIdentifiableDeficiencyDomain_0.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[2].equalsIgnoreCase("16")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyDomain_0_cond_2() {
        return (module_entity_WrongAnswer_1.getAnswers()[2].equalsIgnoreCase("16"));
    }

    /**
     * Checks whether some conditions of rule directlyIdentifiableDeficiencyDomain_0 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyDomain_0_cond(int index) {
        switch (index) {
            case 0: return directlyIdentifiableDeficiencyDomain_0_cond_0();
            case 1: return directlyIdentifiableDeficiencyDomain_0_cond_1();
            case 2: return directlyIdentifiableDeficiencyDomain_0_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule directlyIdentifiableDeficiencyDomain_0 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_directlyIdentifiableDeficiencyDomain_0(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!directlyIdentifiableDeficiencyDomain_0_cond_0()) return false;
                if (!directlyIdentifiableDeficiencyDomain_0_cond_1()) return false;
                if (!directlyIdentifiableDeficiencyDomain_0_cond_2()) return false;
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
    private boolean checkCondForDeclaration_directlyIdentifiableDeficiencyDomain_0(int declIndex) {
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
     * Executes the action part of the rule directlyIdentifiableDeficiencyDomain_0
     */
    private void directlyIdentifiableDeficiencyDomain_0() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar o erro: directlyIdentifiableDeficiencyDomain_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 0 = 10\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 1 = 10\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 2 = 16\n");
			module_entity_Historic_1.setNumeroTentativas(module_entity_Historic_1.getNumeroTentativas() + 1);
			modified(module_entity_Historic_1);
			System.out.println("Erro classificado como Diretamente Identificável - Deficiência no Domínio");
			module_entity_WrongAnswer_1.setType(Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO);
			modified(module_entity_WrongAnswer_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule directlyIdentifiableDeficiencyDomain_1
     */
    private String[] identifiers_directlyIdentifiableDeficiencyDomain_1 = {
        "h",
        "wrongAnswer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule directlyIdentifiableDeficiencyDomain_1
     *
     * @return the identifiers declared in rule directlyIdentifiableDeficiencyDomain_1
     */
    private String[] getDeclaredIdentifiers_directlyIdentifiableDeficiencyDomain_1() {
         return identifiers_directlyIdentifiableDeficiencyDomain_1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule directlyIdentifiableDeficiencyDomain_1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_directlyIdentifiableDeficiencyDomain_1(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule directlyIdentifiableDeficiencyDomain_1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_directlyIdentifiableDeficiencyDomain_1(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule directlyIdentifiableDeficiencyDomain_1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_directlyIdentifiableDeficiencyDomain_1(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule directlyIdentifiableDeficiencyDomain_1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_directlyIdentifiableDeficiencyDomain_1(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule directlyIdentifiableDeficiencyDomain_1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_directlyIdentifiableDeficiencyDomain_1() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule directlyIdentifiableDeficiencyDomain_1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_directlyIdentifiableDeficiencyDomain_1(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule directlyIdentifiableDeficiencyDomain_1.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[0].equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyDomain_1_cond_0() {
        return (module_entity_WrongAnswer_1.getAnswers()[0].equalsIgnoreCase("6"));
    }

    /**
     * Condition 1 of rule directlyIdentifiableDeficiencyDomain_1.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[1].equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyDomain_1_cond_1() {
        return (module_entity_WrongAnswer_1.getAnswers()[1].equalsIgnoreCase("6"));
    }

    /**
     * Condition 2 of rule directlyIdentifiableDeficiencyDomain_1.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[2].equalsIgnoreCase("16")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyDomain_1_cond_2() {
        return (module_entity_WrongAnswer_1.getAnswers()[2].equalsIgnoreCase("16"));
    }

    /**
     * Checks whether some conditions of rule directlyIdentifiableDeficiencyDomain_1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyDomain_1_cond(int index) {
        switch (index) {
            case 0: return directlyIdentifiableDeficiencyDomain_1_cond_0();
            case 1: return directlyIdentifiableDeficiencyDomain_1_cond_1();
            case 2: return directlyIdentifiableDeficiencyDomain_1_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule directlyIdentifiableDeficiencyDomain_1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_directlyIdentifiableDeficiencyDomain_1(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!directlyIdentifiableDeficiencyDomain_1_cond_0()) return false;
                if (!directlyIdentifiableDeficiencyDomain_1_cond_1()) return false;
                if (!directlyIdentifiableDeficiencyDomain_1_cond_2()) return false;
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
    private boolean checkCondForDeclaration_directlyIdentifiableDeficiencyDomain_1(int declIndex) {
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
     * Executes the action part of the rule directlyIdentifiableDeficiencyDomain_1
     */
    private void directlyIdentifiableDeficiencyDomain_1() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar o erro: directlyIdentifiableDeficiencyDomain_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 0 = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 1 = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 2 = 16\n");
			module_entity_Historic_1.setNumeroTentativas(module_entity_Historic_1.getNumeroTentativas() + 1);
			modified(module_entity_Historic_1);
			System.out.println("Erro classificado como Diretamente Identificável - Deficiência no Domínio");
			module_entity_WrongAnswer_1.setType(Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO);
			modified(module_entity_WrongAnswer_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule directlyIdentifiableDeficiencyDomain_2
     */
    private String[] identifiers_directlyIdentifiableDeficiencyDomain_2 = {
        "h",
        "wrongAnswer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule directlyIdentifiableDeficiencyDomain_2
     *
     * @return the identifiers declared in rule directlyIdentifiableDeficiencyDomain_2
     */
    private String[] getDeclaredIdentifiers_directlyIdentifiableDeficiencyDomain_2() {
         return identifiers_directlyIdentifiableDeficiencyDomain_2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule directlyIdentifiableDeficiencyDomain_2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_directlyIdentifiableDeficiencyDomain_2(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule directlyIdentifiableDeficiencyDomain_2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_directlyIdentifiableDeficiencyDomain_2(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule directlyIdentifiableDeficiencyDomain_2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_directlyIdentifiableDeficiencyDomain_2(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule directlyIdentifiableDeficiencyDomain_2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_directlyIdentifiableDeficiencyDomain_2(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule directlyIdentifiableDeficiencyDomain_2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_directlyIdentifiableDeficiencyDomain_2() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule directlyIdentifiableDeficiencyDomain_2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_directlyIdentifiableDeficiencyDomain_2(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule directlyIdentifiableDeficiencyDomain_2.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[0].equalsIgnoreCase("10")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyDomain_2_cond_0() {
        return (module_entity_WrongAnswer_1.getAnswers()[0].equalsIgnoreCase("10"));
    }

    /**
     * Condition 1 of rule directlyIdentifiableDeficiencyDomain_2.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[1].equalsIgnoreCase("10")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyDomain_2_cond_1() {
        return (module_entity_WrongAnswer_1.getAnswers()[1].equalsIgnoreCase("10"));
    }

    /**
     * Condition 2 of rule directlyIdentifiableDeficiencyDomain_2.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[2].equalsIgnoreCase("")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyDomain_2_cond_2() {
        return (module_entity_WrongAnswer_1.getAnswers()[2].equalsIgnoreCase(""));
    }

    /**
     * Checks whether some conditions of rule directlyIdentifiableDeficiencyDomain_2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyDomain_2_cond(int index) {
        switch (index) {
            case 0: return directlyIdentifiableDeficiencyDomain_2_cond_0();
            case 1: return directlyIdentifiableDeficiencyDomain_2_cond_1();
            case 2: return directlyIdentifiableDeficiencyDomain_2_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule directlyIdentifiableDeficiencyDomain_2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_directlyIdentifiableDeficiencyDomain_2(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!directlyIdentifiableDeficiencyDomain_2_cond_0()) return false;
                if (!directlyIdentifiableDeficiencyDomain_2_cond_1()) return false;
                if (!directlyIdentifiableDeficiencyDomain_2_cond_2()) return false;
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
    private boolean checkCondForDeclaration_directlyIdentifiableDeficiencyDomain_2(int declIndex) {
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
     * Executes the action part of the rule directlyIdentifiableDeficiencyDomain_2
     */
    private void directlyIdentifiableDeficiencyDomain_2() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar o erro: directlyIdentifiableDeficiencyDomain_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 0 = 10\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 1 = 10\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 2 = \n");
			module_entity_Historic_1.setNumeroTentativas(module_entity_Historic_1.getNumeroTentativas() + 1);
			modified(module_entity_Historic_1);
			System.out.println("Erro classificado como Diretamente Identificável - Deficiência no Domínio");
			module_entity_WrongAnswer_1.setType(Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO);
			modified(module_entity_WrongAnswer_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule directlyIdentifiableDeficiencyDomain_3
     */
    private String[] identifiers_directlyIdentifiableDeficiencyDomain_3 = {
        "h",
        "wrongAnswer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule directlyIdentifiableDeficiencyDomain_3
     *
     * @return the identifiers declared in rule directlyIdentifiableDeficiencyDomain_3
     */
    private String[] getDeclaredIdentifiers_directlyIdentifiableDeficiencyDomain_3() {
         return identifiers_directlyIdentifiableDeficiencyDomain_3;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule directlyIdentifiableDeficiencyDomain_3.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_directlyIdentifiableDeficiencyDomain_3(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule directlyIdentifiableDeficiencyDomain_3.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_directlyIdentifiableDeficiencyDomain_3(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule directlyIdentifiableDeficiencyDomain_3.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_directlyIdentifiableDeficiencyDomain_3(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule directlyIdentifiableDeficiencyDomain_3.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_directlyIdentifiableDeficiencyDomain_3(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule directlyIdentifiableDeficiencyDomain_3
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_directlyIdentifiableDeficiencyDomain_3() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule directlyIdentifiableDeficiencyDomain_3
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_directlyIdentifiableDeficiencyDomain_3(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule directlyIdentifiableDeficiencyDomain_3.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[0].equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyDomain_3_cond_0() {
        return (module_entity_WrongAnswer_1.getAnswers()[0].equalsIgnoreCase("6"));
    }

    /**
     * Condition 1 of rule directlyIdentifiableDeficiencyDomain_3.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[1].equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyDomain_3_cond_1() {
        return (module_entity_WrongAnswer_1.getAnswers()[1].equalsIgnoreCase("6"));
    }

    /**
     * Condition 2 of rule directlyIdentifiableDeficiencyDomain_3.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[2].equalsIgnoreCase("")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyDomain_3_cond_2() {
        return (module_entity_WrongAnswer_1.getAnswers()[2].equalsIgnoreCase(""));
    }

    /**
     * Checks whether some conditions of rule directlyIdentifiableDeficiencyDomain_3 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyDomain_3_cond(int index) {
        switch (index) {
            case 0: return directlyIdentifiableDeficiencyDomain_3_cond_0();
            case 1: return directlyIdentifiableDeficiencyDomain_3_cond_1();
            case 2: return directlyIdentifiableDeficiencyDomain_3_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule directlyIdentifiableDeficiencyDomain_3 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_directlyIdentifiableDeficiencyDomain_3(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!directlyIdentifiableDeficiencyDomain_3_cond_0()) return false;
                if (!directlyIdentifiableDeficiencyDomain_3_cond_1()) return false;
                if (!directlyIdentifiableDeficiencyDomain_3_cond_2()) return false;
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
    private boolean checkCondForDeclaration_directlyIdentifiableDeficiencyDomain_3(int declIndex) {
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
     * Executes the action part of the rule directlyIdentifiableDeficiencyDomain_3
     */
    private void directlyIdentifiableDeficiencyDomain_3() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar o erro: directlyIdentifiableDeficiencyDomain_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 0 = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 1 = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 2 = \n");
			module_entity_Historic_1.setNumeroTentativas(module_entity_Historic_1.getNumeroTentativas() + 1);
			modified(module_entity_Historic_1);
			System.out.println("Erro classificado como Diretamente Identificável - Deficiência no Domínio");
			module_entity_WrongAnswer_1.setType(Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO);
			modified(module_entity_WrongAnswer_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule directlyIdentifiableDeficiencyOperatorChoice_4
     */
    private String[] identifiers_directlyIdentifiableDeficiencyOperatorChoice_4 = {
        "h",
        "wrongAnswer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule directlyIdentifiableDeficiencyOperatorChoice_4
     *
     * @return the identifiers declared in rule directlyIdentifiableDeficiencyOperatorChoice_4
     */
    private String[] getDeclaredIdentifiers_directlyIdentifiableDeficiencyOperatorChoice_4() {
         return identifiers_directlyIdentifiableDeficiencyOperatorChoice_4;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule directlyIdentifiableDeficiencyOperatorChoice_4.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_directlyIdentifiableDeficiencyOperatorChoice_4(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule directlyIdentifiableDeficiencyOperatorChoice_4.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_directlyIdentifiableDeficiencyOperatorChoice_4(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule directlyIdentifiableDeficiencyOperatorChoice_4.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_directlyIdentifiableDeficiencyOperatorChoice_4(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule directlyIdentifiableDeficiencyOperatorChoice_4.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_directlyIdentifiableDeficiencyOperatorChoice_4(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule directlyIdentifiableDeficiencyOperatorChoice_4
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_directlyIdentifiableDeficiencyOperatorChoice_4() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule directlyIdentifiableDeficiencyOperatorChoice_4
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_directlyIdentifiableDeficiencyOperatorChoice_4(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule directlyIdentifiableDeficiencyOperatorChoice_4.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[0].equalsIgnoreCase("10")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyOperatorChoice_4_cond_0() {
        return (module_entity_WrongAnswer_1.getAnswers()[0].equalsIgnoreCase("10"));
    }

    /**
     * Condition 1 of rule directlyIdentifiableDeficiencyOperatorChoice_4.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[1].equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyOperatorChoice_4_cond_1() {
        return (module_entity_WrongAnswer_1.getAnswers()[1].equalsIgnoreCase("6"));
    }

    /**
     * Condition 2 of rule directlyIdentifiableDeficiencyOperatorChoice_4.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[2].equalsIgnoreCase("4")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyOperatorChoice_4_cond_2() {
        return (module_entity_WrongAnswer_1.getAnswers()[2].equalsIgnoreCase("4"));
    }

    /**
     * Checks whether some conditions of rule directlyIdentifiableDeficiencyOperatorChoice_4 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyOperatorChoice_4_cond(int index) {
        switch (index) {
            case 0: return directlyIdentifiableDeficiencyOperatorChoice_4_cond_0();
            case 1: return directlyIdentifiableDeficiencyOperatorChoice_4_cond_1();
            case 2: return directlyIdentifiableDeficiencyOperatorChoice_4_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule directlyIdentifiableDeficiencyOperatorChoice_4 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_directlyIdentifiableDeficiencyOperatorChoice_4(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!directlyIdentifiableDeficiencyOperatorChoice_4_cond_0()) return false;
                if (!directlyIdentifiableDeficiencyOperatorChoice_4_cond_1()) return false;
                if (!directlyIdentifiableDeficiencyOperatorChoice_4_cond_2()) return false;
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
    private boolean checkCondForDeclaration_directlyIdentifiableDeficiencyOperatorChoice_4(int declIndex) {
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
     * Executes the action part of the rule directlyIdentifiableDeficiencyOperatorChoice_4
     */
    private void directlyIdentifiableDeficiencyOperatorChoice_4() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar o erro: directlyIdentifiableDeficiencyOperatorChoice_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 0 = 10\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 1 = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 2 = 4\n");
			module_entity_Historic_1.setNumeroTentativas(module_entity_Historic_1.getNumeroTentativas() + 1);
			modified(module_entity_Historic_1);
			System.out.println("Erro classificado como Diretamente Identificável - Deficiência na Escolha do Operador");
			module_entity_WrongAnswer_1.setType(Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR);
			modified(module_entity_WrongAnswer_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule directlyIdentifiableDeficiencyRule_5
     */
    private String[] identifiers_directlyIdentifiableDeficiencyRule_5 = {
        "h",
        "wrongAnswer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule directlyIdentifiableDeficiencyRule_5
     *
     * @return the identifiers declared in rule directlyIdentifiableDeficiencyRule_5
     */
    private String[] getDeclaredIdentifiers_directlyIdentifiableDeficiencyRule_5() {
         return identifiers_directlyIdentifiableDeficiencyRule_5;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule directlyIdentifiableDeficiencyRule_5.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_directlyIdentifiableDeficiencyRule_5(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule directlyIdentifiableDeficiencyRule_5.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_directlyIdentifiableDeficiencyRule_5(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule directlyIdentifiableDeficiencyRule_5.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_directlyIdentifiableDeficiencyRule_5(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule directlyIdentifiableDeficiencyRule_5.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_directlyIdentifiableDeficiencyRule_5(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule directlyIdentifiableDeficiencyRule_5
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_directlyIdentifiableDeficiencyRule_5() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule directlyIdentifiableDeficiencyRule_5
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_directlyIdentifiableDeficiencyRule_5(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule directlyIdentifiableDeficiencyRule_5.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[0].equalsIgnoreCase("")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyRule_5_cond_0() {
        return (module_entity_WrongAnswer_1.getAnswers()[0].equalsIgnoreCase(""));
    }

    /**
     * Condition 1 of rule directlyIdentifiableDeficiencyRule_5.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[1].equalsIgnoreCase("")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyRule_5_cond_1() {
        return (module_entity_WrongAnswer_1.getAnswers()[1].equalsIgnoreCase(""));
    }

    /**
     * Condition 2 of rule directlyIdentifiableDeficiencyRule_5.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[2].equalsIgnoreCase("")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyRule_5_cond_2() {
        return (module_entity_WrongAnswer_1.getAnswers()[2].equalsIgnoreCase(""));
    }

    /**
     * Checks whether some conditions of rule directlyIdentifiableDeficiencyRule_5 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyRule_5_cond(int index) {
        switch (index) {
            case 0: return directlyIdentifiableDeficiencyRule_5_cond_0();
            case 1: return directlyIdentifiableDeficiencyRule_5_cond_1();
            case 2: return directlyIdentifiableDeficiencyRule_5_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule directlyIdentifiableDeficiencyRule_5 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_directlyIdentifiableDeficiencyRule_5(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!directlyIdentifiableDeficiencyRule_5_cond_0()) return false;
                if (!directlyIdentifiableDeficiencyRule_5_cond_1()) return false;
                if (!directlyIdentifiableDeficiencyRule_5_cond_2()) return false;
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
    private boolean checkCondForDeclaration_directlyIdentifiableDeficiencyRule_5(int declIndex) {
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
     * Executes the action part of the rule directlyIdentifiableDeficiencyRule_5
     */
    private void directlyIdentifiableDeficiencyRule_5() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar o erro: directlyIdentifiableDeficiencyRule_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 0 = \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 1 = \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 2 = \n");
			module_entity_Historic_1.setNumeroTentativas(module_entity_Historic_1.getNumeroTentativas() + 1);
			modified(module_entity_Historic_1);
			System.out.println("Erro classificado como Diretamente Identificável - Deficiência na Regra");
			module_entity_WrongAnswer_1.setType(Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_REGRA);
			modified(module_entity_WrongAnswer_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule indirectlyIdentifiable_6
     */
    private String[] identifiers_indirectlyIdentifiable_6 = {
        "h",
        "wrongAnswer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule indirectlyIdentifiable_6
     *
     * @return the identifiers declared in rule indirectlyIdentifiable_6
     */
    private String[] getDeclaredIdentifiers_indirectlyIdentifiable_6() {
         return identifiers_indirectlyIdentifiable_6;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule indirectlyIdentifiable_6.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_indirectlyIdentifiable_6(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule indirectlyIdentifiable_6.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_indirectlyIdentifiable_6(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule indirectlyIdentifiable_6.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_indirectlyIdentifiable_6(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule indirectlyIdentifiable_6.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_indirectlyIdentifiable_6(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule indirectlyIdentifiable_6
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_indirectlyIdentifiable_6() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule indirectlyIdentifiable_6
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_indirectlyIdentifiable_6(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule indirectlyIdentifiable_6.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[0].equalsIgnoreCase("10")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean indirectlyIdentifiable_6_cond_0() {
        return (module_entity_WrongAnswer_1.getAnswers()[0].equalsIgnoreCase("10"));
    }

    /**
     * Condition 1 of rule indirectlyIdentifiable_6.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[1].equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean indirectlyIdentifiable_6_cond_1() {
        return (module_entity_WrongAnswer_1.getAnswers()[1].equalsIgnoreCase("6"));
    }

    /**
     * Condition 2 of rule indirectlyIdentifiable_6.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[2].equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean indirectlyIdentifiable_6_cond_2() {
        return (module_entity_WrongAnswer_1.getAnswers()[2].equalsIgnoreCase("6"));
    }

    /**
     * Checks whether some conditions of rule indirectlyIdentifiable_6 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean indirectlyIdentifiable_6_cond(int index) {
        switch (index) {
            case 0: return indirectlyIdentifiable_6_cond_0();
            case 1: return indirectlyIdentifiable_6_cond_1();
            case 2: return indirectlyIdentifiable_6_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule indirectlyIdentifiable_6 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_indirectlyIdentifiable_6(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!indirectlyIdentifiable_6_cond_0()) return false;
                if (!indirectlyIdentifiable_6_cond_1()) return false;
                if (!indirectlyIdentifiable_6_cond_2()) return false;
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
    private boolean checkCondForDeclaration_indirectlyIdentifiable_6(int declIndex) {
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
     * Executes the action part of the rule indirectlyIdentifiable_6
     */
    private void indirectlyIdentifiable_6() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar o erro: indirectlyIdentifiable_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 0 = 10\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 1 = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 2 = 6\n");
			module_entity_Historic_1.setNumeroTentativas(module_entity_Historic_1.getNumeroTentativas() + 1);
			modified(module_entity_Historic_1);
			System.out.println("Erro classificado como Indiretamente Identificável");
			module_entity_WrongAnswer_1.setType(Constants.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL);
			modified(module_entity_WrongAnswer_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule misinterpretation_7
     */
    private String[] identifiers_misinterpretation_7 = {
        "h",
        "wrongAnswer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule misinterpretation_7
     *
     * @return the identifiers declared in rule misinterpretation_7
     */
    private String[] getDeclaredIdentifiers_misinterpretation_7() {
         return identifiers_misinterpretation_7;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule misinterpretation_7.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_misinterpretation_7(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule misinterpretation_7.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_misinterpretation_7(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule misinterpretation_7.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_misinterpretation_7(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule misinterpretation_7.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_misinterpretation_7(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule misinterpretation_7
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_misinterpretation_7() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule misinterpretation_7
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_misinterpretation_7(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule misinterpretation_7.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[0].equalsIgnoreCase("")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean misinterpretation_7_cond_0() {
        return (module_entity_WrongAnswer_1.getAnswers()[0].equalsIgnoreCase(""));
    }

    /**
     * Condition 1 of rule misinterpretation_7.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[1].equalsIgnoreCase("")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean misinterpretation_7_cond_1() {
        return (module_entity_WrongAnswer_1.getAnswers()[1].equalsIgnoreCase(""));
    }

    /**
     * Condition 2 of rule misinterpretation_7.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[2].equalsIgnoreCase("")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean misinterpretation_7_cond_2() {
        return (module_entity_WrongAnswer_1.getAnswers()[2].equalsIgnoreCase(""));
    }

    /**
     * Checks whether some conditions of rule misinterpretation_7 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean misinterpretation_7_cond(int index) {
        switch (index) {
            case 0: return misinterpretation_7_cond_0();
            case 1: return misinterpretation_7_cond_1();
            case 2: return misinterpretation_7_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule misinterpretation_7 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_misinterpretation_7(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!misinterpretation_7_cond_0()) return false;
                if (!misinterpretation_7_cond_1()) return false;
                if (!misinterpretation_7_cond_2()) return false;
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
    private boolean checkCondForDeclaration_misinterpretation_7(int declIndex) {
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
     * Executes the action part of the rule misinterpretation_7
     */
    private void misinterpretation_7() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar o erro: misinterpretation_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 0 = \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 1 = \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 2 = \n");
			module_entity_Historic_1.setNumeroTentativas(module_entity_Historic_1.getNumeroTentativas() + 1);
			modified(module_entity_Historic_1);
			System.out.println("Erro classificado como Interpretação Equivocada");
			module_entity_WrongAnswer_1.setType(Constants.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA);
			modified(module_entity_WrongAnswer_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule solutionNonCategorizable_8
     */
    private String[] identifiers_solutionNonCategorizable_8 = {
        "h",
        "wrongAnswer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule solutionNonCategorizable_8
     *
     * @return the identifiers declared in rule solutionNonCategorizable_8
     */
    private String[] getDeclaredIdentifiers_solutionNonCategorizable_8() {
         return identifiers_solutionNonCategorizable_8;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule solutionNonCategorizable_8.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_solutionNonCategorizable_8(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule solutionNonCategorizable_8.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_solutionNonCategorizable_8(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule solutionNonCategorizable_8.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_solutionNonCategorizable_8(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule solutionNonCategorizable_8.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_solutionNonCategorizable_8(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule solutionNonCategorizable_8
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_solutionNonCategorizable_8() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule solutionNonCategorizable_8
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_solutionNonCategorizable_8(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule solutionNonCategorizable_8.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[0].equalsIgnoreCase("1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean solutionNonCategorizable_8_cond_0() {
        return (module_entity_WrongAnswer_1.getAnswers()[0].equalsIgnoreCase("1"));
    }

    /**
     * Condition 1 of rule solutionNonCategorizable_8.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[1].equalsIgnoreCase("1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean solutionNonCategorizable_8_cond_1() {
        return (module_entity_WrongAnswer_1.getAnswers()[1].equalsIgnoreCase("1"));
    }

    /**
     * Condition 2 of rule solutionNonCategorizable_8.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers()[2].equalsIgnoreCase("1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean solutionNonCategorizable_8_cond_2() {
        return (module_entity_WrongAnswer_1.getAnswers()[2].equalsIgnoreCase("1"));
    }

    /**
     * Checks whether some conditions of rule solutionNonCategorizable_8 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean solutionNonCategorizable_8_cond(int index) {
        switch (index) {
            case 0: return solutionNonCategorizable_8_cond_0();
            case 1: return solutionNonCategorizable_8_cond_1();
            case 2: return solutionNonCategorizable_8_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule solutionNonCategorizable_8 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_solutionNonCategorizable_8(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!solutionNonCategorizable_8_cond_0()) return false;
                if (!solutionNonCategorizable_8_cond_1()) return false;
                if (!solutionNonCategorizable_8_cond_2()) return false;
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
    private boolean checkCondForDeclaration_solutionNonCategorizable_8(int declIndex) {
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
     * Executes the action part of the rule solutionNonCategorizable_8
     */
    private void solutionNonCategorizable_8() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar o erro: solutionNonCategorizable_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 0 = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 1 = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta campo 2 = 1\n");
			module_entity_Historic_1.setNumeroTentativas(module_entity_Historic_1.getNumeroTentativas() + 1);
			modified(module_entity_Historic_1);
			System.out.println("Erro classificado como Solução Não Categorizável");
			module_entity_WrongAnswer_1.setType(Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL);
			modified(module_entity_WrongAnswer_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }



// end_rules

// rule necessary by default


	
    /**
     * Identifiers of rule solutionNonCategorizable
     */
    private String[] identifiers_solutionNonCategorizable = {
        "h",
        "wrongAnswer",
        "ruleToHuman"
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
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.RuleToHuman";
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
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.RuleToHuman.class;
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
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
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
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_RuleToHuman_1;
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
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_RuleToHuman_1
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
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule solutionNonCategorizable.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getAnswers() == null</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean solutionNonCategorizable_cond_0() {
        return (module_entity_WrongAnswer_1.getAnswers() == null);
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
                return true;
            case 1:
                if (!solutionNonCategorizable_cond_0()) return false;
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
    private boolean checkCondForDeclaration_solutionNonCategorizable(int declIndex) {
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
     * Executes the action part of the rule solutionNonCategorizable
     */
    private void solutionNonCategorizable() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar o erro: solutionNonCategorizable_ ");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  ");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Usuário não informou nenhuma resposta (campos nulos)");
			module_entity_Historic_1.setNumeroTentativas(module_entity_Historic_1.getNumeroTentativas() + 1);
			modified(module_entity_Historic_1);
			System.out.println("Erro classificado como SoluÃ§Ã£o NÃ£o CategorizÃ¡vel");		
			module_entity_WrongAnswer_1.setType(Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL);
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_WrongAnswer_1);
			flush();			
	    }




	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "directlyIdentifiableDeficiencyDomain_0",
        "directlyIdentifiableDeficiencyDomain_1",
        "directlyIdentifiableDeficiencyDomain_2",
        "directlyIdentifiableDeficiencyDomain_3",
        "directlyIdentifiableDeficiencyOperatorChoice_4",
        "directlyIdentifiableDeficiencyRule_5",
        "indirectlyIdentifiable_6",
        "misinterpretation_7",
        "solutionNonCategorizable_8",
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
        3,
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
        3,
        3,
        3,
        3,
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
            case 0: return directlyIdentifiableDeficiencyDomain_0_cond(condIndex);
            case 1: return directlyIdentifiableDeficiencyDomain_1_cond(condIndex);
            case 2: return directlyIdentifiableDeficiencyDomain_2_cond(condIndex);
            case 3: return directlyIdentifiableDeficiencyDomain_3_cond(condIndex);
            case 4: return directlyIdentifiableDeficiencyOperatorChoice_4_cond(condIndex);
            case 5: return directlyIdentifiableDeficiencyRule_5_cond(condIndex);
            case 6: return indirectlyIdentifiable_6_cond(condIndex);
            case 7: return misinterpretation_7_cond(condIndex);
            case 8: return solutionNonCategorizable_8_cond(condIndex);
            case 9: return solutionNonCategorizable_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_directlyIdentifiableDeficiencyDomain_0(declIndex);
            case 1: return checkConditionsOnlyOf_directlyIdentifiableDeficiencyDomain_1(declIndex);
            case 2: return checkConditionsOnlyOf_directlyIdentifiableDeficiencyDomain_2(declIndex);
            case 3: return checkConditionsOnlyOf_directlyIdentifiableDeficiencyDomain_3(declIndex);
            case 4: return checkConditionsOnlyOf_directlyIdentifiableDeficiencyOperatorChoice_4(declIndex);
            case 5: return checkConditionsOnlyOf_directlyIdentifiableDeficiencyRule_5(declIndex);
            case 6: return checkConditionsOnlyOf_indirectlyIdentifiable_6(declIndex);
            case 7: return checkConditionsOnlyOf_misinterpretation_7(declIndex);
            case 8: return checkConditionsOnlyOf_solutionNonCategorizable_8(declIndex);
            case 9: return checkConditionsOnlyOf_solutionNonCategorizable(declIndex);
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
            case 0: return checkCondForDeclaration_directlyIdentifiableDeficiencyDomain_0(declIndex);
            case 1: return checkCondForDeclaration_directlyIdentifiableDeficiencyDomain_1(declIndex);
            case 2: return checkCondForDeclaration_directlyIdentifiableDeficiencyDomain_2(declIndex);
            case 3: return checkCondForDeclaration_directlyIdentifiableDeficiencyDomain_3(declIndex);
            case 4: return checkCondForDeclaration_directlyIdentifiableDeficiencyOperatorChoice_4(declIndex);
            case 5: return checkCondForDeclaration_directlyIdentifiableDeficiencyRule_5(declIndex);
            case 6: return checkCondForDeclaration_indirectlyIdentifiable_6(declIndex);
            case 7: return checkCondForDeclaration_misinterpretation_7(declIndex);
            case 8: return checkCondForDeclaration_solutionNonCategorizable_8(declIndex);
            case 9: return checkCondForDeclaration_solutionNonCategorizable(declIndex);
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
            case 0: return getDeclaredClassName_directlyIdentifiableDeficiencyDomain_0(declIndex);
            case 1: return getDeclaredClassName_directlyIdentifiableDeficiencyDomain_1(declIndex);
            case 2: return getDeclaredClassName_directlyIdentifiableDeficiencyDomain_2(declIndex);
            case 3: return getDeclaredClassName_directlyIdentifiableDeficiencyDomain_3(declIndex);
            case 4: return getDeclaredClassName_directlyIdentifiableDeficiencyOperatorChoice_4(declIndex);
            case 5: return getDeclaredClassName_directlyIdentifiableDeficiencyRule_5(declIndex);
            case 6: return getDeclaredClassName_indirectlyIdentifiable_6(declIndex);
            case 7: return getDeclaredClassName_misinterpretation_7(declIndex);
            case 8: return getDeclaredClassName_solutionNonCategorizable_8(declIndex);
            case 9: return getDeclaredClassName_solutionNonCategorizable(declIndex);
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
            case 0: return getDeclaredClass_directlyIdentifiableDeficiencyDomain_0(declIndex);
            case 1: return getDeclaredClass_directlyIdentifiableDeficiencyDomain_1(declIndex);
            case 2: return getDeclaredClass_directlyIdentifiableDeficiencyDomain_2(declIndex);
            case 3: return getDeclaredClass_directlyIdentifiableDeficiencyDomain_3(declIndex);
            case 4: return getDeclaredClass_directlyIdentifiableDeficiencyOperatorChoice_4(declIndex);
            case 5: return getDeclaredClass_directlyIdentifiableDeficiencyRule_5(declIndex);
            case 6: return getDeclaredClass_indirectlyIdentifiable_6(declIndex);
            case 7: return getDeclaredClass_misinterpretation_7(declIndex);
            case 8: return getDeclaredClass_solutionNonCategorizable_8(declIndex);
            case 9: return getDeclaredClass_solutionNonCategorizable(declIndex);
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
            case 0: directlyIdentifiableDeficiencyDomain_0(); break;
            case 1: directlyIdentifiableDeficiencyDomain_1(); break;
            case 2: directlyIdentifiableDeficiencyDomain_2(); break;
            case 3: directlyIdentifiableDeficiencyDomain_3(); break;
            case 4: directlyIdentifiableDeficiencyOperatorChoice_4(); break;
            case 5: directlyIdentifiableDeficiencyRule_5(); break;
            case 6: indirectlyIdentifiable_6(); break;
            case 7: misinterpretation_7(); break;
            case 8: solutionNonCategorizable_8(); break;
            case 9: solutionNonCategorizable(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 10;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_directlyIdentifiableDeficiencyDomain_0();
            case 1: return getDeclaredIdentifiers_directlyIdentifiableDeficiencyDomain_1();
            case 2: return getDeclaredIdentifiers_directlyIdentifiableDeficiencyDomain_2();
            case 3: return getDeclaredIdentifiers_directlyIdentifiableDeficiencyDomain_3();
            case 4: return getDeclaredIdentifiers_directlyIdentifiableDeficiencyOperatorChoice_4();
            case 5: return getDeclaredIdentifiers_directlyIdentifiableDeficiencyRule_5();
            case 6: return getDeclaredIdentifiers_indirectlyIdentifiable_6();
            case 7: return getDeclaredIdentifiers_misinterpretation_7();
            case 8: return getDeclaredIdentifiers_solutionNonCategorizable_8();
            case 9: return getDeclaredIdentifiers_solutionNonCategorizable();
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
            case 0: setObject_directlyIdentifiableDeficiencyDomain_0(declIndex, value); break;
            case 1: setObject_directlyIdentifiableDeficiencyDomain_1(declIndex, value); break;
            case 2: setObject_directlyIdentifiableDeficiencyDomain_2(declIndex, value); break;
            case 3: setObject_directlyIdentifiableDeficiencyDomain_3(declIndex, value); break;
            case 4: setObject_directlyIdentifiableDeficiencyOperatorChoice_4(declIndex, value); break;
            case 5: setObject_directlyIdentifiableDeficiencyRule_5(declIndex, value); break;
            case 6: setObject_indirectlyIdentifiable_6(declIndex, value); break;
            case 7: setObject_misinterpretation_7(declIndex, value); break;
            case 8: setObject_solutionNonCategorizable_8(declIndex, value); break;
            case 9: setObject_solutionNonCategorizable(declIndex, value); break;
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
            case 0: return getObject_directlyIdentifiableDeficiencyDomain_0(declIndex);
            case 1: return getObject_directlyIdentifiableDeficiencyDomain_1(declIndex);
            case 2: return getObject_directlyIdentifiableDeficiencyDomain_2(declIndex);
            case 3: return getObject_directlyIdentifiableDeficiencyDomain_3(declIndex);
            case 4: return getObject_directlyIdentifiableDeficiencyOperatorChoice_4(declIndex);
            case 5: return getObject_directlyIdentifiableDeficiencyRule_5(declIndex);
            case 6: return getObject_indirectlyIdentifiable_6(declIndex);
            case 7: return getObject_misinterpretation_7(declIndex);
            case 8: return getObject_solutionNonCategorizable_8(declIndex);
            case 9: return getObject_solutionNonCategorizable(declIndex);
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
            case 0: return getObjects_directlyIdentifiableDeficiencyDomain_0();
            case 1: return getObjects_directlyIdentifiableDeficiencyDomain_1();
            case 2: return getObjects_directlyIdentifiableDeficiencyDomain_2();
            case 3: return getObjects_directlyIdentifiableDeficiencyDomain_3();
            case 4: return getObjects_directlyIdentifiableDeficiencyOperatorChoice_4();
            case 5: return getObjects_directlyIdentifiableDeficiencyRule_5();
            case 6: return getObjects_indirectlyIdentifiable_6();
            case 7: return getObjects_misinterpretation_7();
            case 8: return getObjects_solutionNonCategorizable_8();
            case 9: return getObjects_solutionNonCategorizable();
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
            case 0: setObjects_directlyIdentifiableDeficiencyDomain_0(objects); break;
            case 1: setObjects_directlyIdentifiableDeficiencyDomain_1(objects); break;
            case 2: setObjects_directlyIdentifiableDeficiencyDomain_2(objects); break;
            case 3: setObjects_directlyIdentifiableDeficiencyDomain_3(objects); break;
            case 4: setObjects_directlyIdentifiableDeficiencyOperatorChoice_4(objects); break;
            case 5: setObjects_directlyIdentifiableDeficiencyRule_5(objects); break;
            case 6: setObjects_indirectlyIdentifiable_6(objects); break;
            case 7: setObjects_misinterpretation_7(objects); break;
            case 8: setObjects_solutionNonCategorizable_8(objects); break;
            case 9: setObjects_solutionNonCategorizable(objects); break;
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
    public Jeops_RuleBase_ErrorSorterKB(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file ErrorSorterKB.rules
 *
 * @version 15/07/2014
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
