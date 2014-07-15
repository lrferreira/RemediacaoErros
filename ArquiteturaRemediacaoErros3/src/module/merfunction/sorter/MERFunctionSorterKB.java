package module.merfunction.sorter;
import module.entity.Historic;
import module.entity.WrongAnswer;
import module.entity.RuleToHuman;
import util.Constants;
import module.entity.MERFunction;
import module.mer.manager.MERManagerController;


 class Jeops_RuleBase_MERFunctionSorterKB extends jeops.AbstractRuleBase {



	
    /**
     * Identifiers of rule constrainInterpretation01_0
     */
    private String[] identifiers_constrainInterpretation01_0 = {
        "h",
        "wrongAnswer",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constrainInterpretation01_0
     *
     * @return the identifiers declared in rule constrainInterpretation01_0
     */
    private String[] getDeclaredIdentifiers_constrainInterpretation01_0() {
         return identifiers_constrainInterpretation01_0;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constrainInterpretation01_0.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constrainInterpretation01_0(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.MERFunction";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constrainInterpretation01_0.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constrainInterpretation01_0(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.MERFunction.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constrainInterpretation01_0.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constrainInterpretation01_0(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constrainInterpretation01_0.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constrainInterpretation01_0(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_MERFunction_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constrainInterpretation01_0
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constrainInterpretation01_0() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constrainInterpretation01_0
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constrainInterpretation01_0(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule constrainInterpretation01_0.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_0_cond_0() {
        return (module_entity_WrongAnswer_1.getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO);
    }

    /**
     * Checks whether some conditions of rule constrainInterpretation01_0 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_0_cond(int index) {
        switch (index) {
            case 0: return constrainInterpretation01_0_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constrainInterpretation01_0 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constrainInterpretation01_0(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!constrainInterpretation01_0_cond_0()) return false;
                return true;
            case 2:
                return true;
            case 3:
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
    private boolean checkCondForDeclaration_constrainInterpretation01_0(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule constrainInterpretation01_0
     */
    private void constrainInterpretation01_0() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constrainInterpretation01_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificável - Deficiência no Domínio \n");
			module_entity_Historic_1.setNumeroTentativas(module_entity_Historic_1.getNumeroTentativas() + 1);
			modified(module_entity_Historic_1);
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Restrição Interpretação");
			flush();

	    }




	
    /**
     * Identifiers of rule constrainInterpretation01_1
     */
    private String[] identifiers_constrainInterpretation01_1 = {
        "h",
        "wrongAnswer",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constrainInterpretation01_1
     *
     * @return the identifiers declared in rule constrainInterpretation01_1
     */
    private String[] getDeclaredIdentifiers_constrainInterpretation01_1() {
         return identifiers_constrainInterpretation01_1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constrainInterpretation01_1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constrainInterpretation01_1(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.MERFunction";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constrainInterpretation01_1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constrainInterpretation01_1(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.MERFunction.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constrainInterpretation01_1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constrainInterpretation01_1(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constrainInterpretation01_1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constrainInterpretation01_1(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_MERFunction_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constrainInterpretation01_1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constrainInterpretation01_1() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constrainInterpretation01_1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constrainInterpretation01_1(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule constrainInterpretation01_1.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_1_cond_0() {
        return (module_entity_WrongAnswer_1.getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO);
    }

    /**
     * Checks whether some conditions of rule constrainInterpretation01_1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_1_cond(int index) {
        switch (index) {
            case 0: return constrainInterpretation01_1_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constrainInterpretation01_1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constrainInterpretation01_1(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!constrainInterpretation01_1_cond_0()) return false;
                return true;
            case 2:
                return true;
            case 3:
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
    private boolean checkCondForDeclaration_constrainInterpretation01_1(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule constrainInterpretation01_1
     */
    private void constrainInterpretation01_1() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constrainInterpretation01_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificável - Deficiência no Domínio \n");
			module_entity_Historic_1.setNumeroTentativas(module_entity_Historic_1.getNumeroTentativas() + 1);
			modified(module_entity_Historic_1);
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Restrição Interpretação");
			flush();

	    }




	
    /**
     * Identifiers of rule constrainInterpretation01_2
     */
    private String[] identifiers_constrainInterpretation01_2 = {
        "h",
        "wrongAnswer",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constrainInterpretation01_2
     *
     * @return the identifiers declared in rule constrainInterpretation01_2
     */
    private String[] getDeclaredIdentifiers_constrainInterpretation01_2() {
         return identifiers_constrainInterpretation01_2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constrainInterpretation01_2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constrainInterpretation01_2(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.MERFunction";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constrainInterpretation01_2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constrainInterpretation01_2(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.MERFunction.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constrainInterpretation01_2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constrainInterpretation01_2(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constrainInterpretation01_2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constrainInterpretation01_2(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_MERFunction_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constrainInterpretation01_2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constrainInterpretation01_2() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constrainInterpretation01_2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constrainInterpretation01_2(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule constrainInterpretation01_2.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_2_cond_0() {
        return (module_entity_WrongAnswer_1.getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO);
    }

    /**
     * Checks whether some conditions of rule constrainInterpretation01_2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_2_cond(int index) {
        switch (index) {
            case 0: return constrainInterpretation01_2_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constrainInterpretation01_2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constrainInterpretation01_2(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!constrainInterpretation01_2_cond_0()) return false;
                return true;
            case 2:
                return true;
            case 3:
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
    private boolean checkCondForDeclaration_constrainInterpretation01_2(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule constrainInterpretation01_2
     */
    private void constrainInterpretation01_2() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constrainInterpretation01_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificável - Deficiência no Domínio \n");
			module_entity_Historic_1.setNumeroTentativas(module_entity_Historic_1.getNumeroTentativas() + 1);
			modified(module_entity_Historic_1);
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Restrição Interpretação");
			flush();

	    }




	
    /**
     * Identifiers of rule constrainInterpretation01_3
     */
    private String[] identifiers_constrainInterpretation01_3 = {
        "h",
        "wrongAnswer",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constrainInterpretation01_3
     *
     * @return the identifiers declared in rule constrainInterpretation01_3
     */
    private String[] getDeclaredIdentifiers_constrainInterpretation01_3() {
         return identifiers_constrainInterpretation01_3;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constrainInterpretation01_3.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constrainInterpretation01_3(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.MERFunction";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constrainInterpretation01_3.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constrainInterpretation01_3(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.MERFunction.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constrainInterpretation01_3.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constrainInterpretation01_3(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constrainInterpretation01_3.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constrainInterpretation01_3(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_MERFunction_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constrainInterpretation01_3
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constrainInterpretation01_3() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constrainInterpretation01_3
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constrainInterpretation01_3(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule constrainInterpretation01_3.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_3_cond_0() {
        return (module_entity_WrongAnswer_1.getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO);
    }

    /**
     * Checks whether some conditions of rule constrainInterpretation01_3 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_3_cond(int index) {
        switch (index) {
            case 0: return constrainInterpretation01_3_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constrainInterpretation01_3 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constrainInterpretation01_3(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!constrainInterpretation01_3_cond_0()) return false;
                return true;
            case 2:
                return true;
            case 3:
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
    private boolean checkCondForDeclaration_constrainInterpretation01_3(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule constrainInterpretation01_3
     */
    private void constrainInterpretation01_3() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constrainInterpretation01_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificável - Deficiência no Domínio \n");
			module_entity_Historic_1.setNumeroTentativas(module_entity_Historic_1.getNumeroTentativas() + 1);
			modified(module_entity_Historic_1);
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Restrição Interpretação");
			flush();

	    }




	
    /**
     * Identifiers of rule constructDeeperUnderstanding02_4
     */
    private String[] identifiers_constructDeeperUnderstanding02_4 = {
        "h",
        "wrongAnswer",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constructDeeperUnderstanding02_4
     *
     * @return the identifiers declared in rule constructDeeperUnderstanding02_4
     */
    private String[] getDeclaredIdentifiers_constructDeeperUnderstanding02_4() {
         return identifiers_constructDeeperUnderstanding02_4;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constructDeeperUnderstanding02_4.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constructDeeperUnderstanding02_4(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.MERFunction";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constructDeeperUnderstanding02_4.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constructDeeperUnderstanding02_4(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.MERFunction.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constructDeeperUnderstanding02_4.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constructDeeperUnderstanding02_4(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constructDeeperUnderstanding02_4.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constructDeeperUnderstanding02_4(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_MERFunction_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constructDeeperUnderstanding02_4
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constructDeeperUnderstanding02_4() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constructDeeperUnderstanding02_4
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constructDeeperUnderstanding02_4(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule constructDeeperUnderstanding02_4.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_4_cond_0() {
        return (module_entity_WrongAnswer_1.getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR);
    }

    /**
     * Checks whether some conditions of rule constructDeeperUnderstanding02_4 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_4_cond(int index) {
        switch (index) {
            case 0: return constructDeeperUnderstanding02_4_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constructDeeperUnderstanding02_4 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constructDeeperUnderstanding02_4(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!constructDeeperUnderstanding02_4_cond_0()) return false;
                return true;
            case 2:
                return true;
            case 3:
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
    private boolean checkCondForDeclaration_constructDeeperUnderstanding02_4(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule constructDeeperUnderstanding02_4
     */
    private void constructDeeperUnderstanding02_4() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constructDeeperUnderstanding02_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificável - Deficiência na Escolha do Operador \n");
			module_entity_Historic_1.setNumeroTentativas(module_entity_Historic_1.getNumeroTentativas() + 1);
			modified(module_entity_Historic_1);
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Compreensão Mais Aprofundada");
			flush();

	    }




	
    /**
     * Identifiers of rule constructDeeperUnderstanding01_5
     */
    private String[] identifiers_constructDeeperUnderstanding01_5 = {
        "h",
        "wrongAnswer",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constructDeeperUnderstanding01_5
     *
     * @return the identifiers declared in rule constructDeeperUnderstanding01_5
     */
    private String[] getDeclaredIdentifiers_constructDeeperUnderstanding01_5() {
         return identifiers_constructDeeperUnderstanding01_5;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constructDeeperUnderstanding01_5.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constructDeeperUnderstanding01_5(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.MERFunction";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constructDeeperUnderstanding01_5.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constructDeeperUnderstanding01_5(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.MERFunction.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constructDeeperUnderstanding01_5.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constructDeeperUnderstanding01_5(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constructDeeperUnderstanding01_5.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constructDeeperUnderstanding01_5(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_MERFunction_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constructDeeperUnderstanding01_5
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constructDeeperUnderstanding01_5() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constructDeeperUnderstanding01_5
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constructDeeperUnderstanding01_5(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule constructDeeperUnderstanding01_5.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_REGRA</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding01_5_cond_0() {
        return (module_entity_WrongAnswer_1.getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_REGRA);
    }

    /**
     * Checks whether some conditions of rule constructDeeperUnderstanding01_5 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding01_5_cond(int index) {
        switch (index) {
            case 0: return constructDeeperUnderstanding01_5_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constructDeeperUnderstanding01_5 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constructDeeperUnderstanding01_5(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!constructDeeperUnderstanding01_5_cond_0()) return false;
                return true;
            case 2:
                return true;
            case 3:
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
    private boolean checkCondForDeclaration_constructDeeperUnderstanding01_5(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule constructDeeperUnderstanding01_5
     */
    private void constructDeeperUnderstanding01_5() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constructDeeperUnderstanding01_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificável - Deficiência na Regra \n");
			module_entity_Historic_1.setNumeroTentativas(module_entity_Historic_1.getNumeroTentativas() + 1);
			modified(module_entity_Historic_1);
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Compreensão Mais Aprofundada");
			flush();

	    }




	
    /**
     * Identifiers of rule constrainInterpretation02_6
     */
    private String[] identifiers_constrainInterpretation02_6 = {
        "h",
        "wrongAnswer",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constrainInterpretation02_6
     *
     * @return the identifiers declared in rule constrainInterpretation02_6
     */
    private String[] getDeclaredIdentifiers_constrainInterpretation02_6() {
         return identifiers_constrainInterpretation02_6;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constrainInterpretation02_6.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constrainInterpretation02_6(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.MERFunction";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constrainInterpretation02_6.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constrainInterpretation02_6(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.MERFunction.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constrainInterpretation02_6.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constrainInterpretation02_6(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constrainInterpretation02_6.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constrainInterpretation02_6(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_MERFunction_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constrainInterpretation02_6
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constrainInterpretation02_6() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constrainInterpretation02_6
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constrainInterpretation02_6(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule constrainInterpretation02_6.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getType() == Constants.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_6_cond_0() {
        return (module_entity_WrongAnswer_1.getType() == Constants.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL);
    }

    /**
     * Checks whether some conditions of rule constrainInterpretation02_6 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_6_cond(int index) {
        switch (index) {
            case 0: return constrainInterpretation02_6_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constrainInterpretation02_6 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constrainInterpretation02_6(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!constrainInterpretation02_6_cond_0()) return false;
                return true;
            case 2:
                return true;
            case 3:
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
    private boolean checkCondForDeclaration_constrainInterpretation02_6(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule constrainInterpretation02_6
     */
    private void constrainInterpretation02_6() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constrainInterpretation02_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Indiretamente Identificável \n");
			module_entity_Historic_1.setNumeroTentativas(module_entity_Historic_1.getNumeroTentativas() + 1);
			modified(module_entity_Historic_1);
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Restrição Interpretação");
			flush();

	    }




	
    /**
     * Identifiers of rule complementaryRoles_7
     */
    private String[] identifiers_complementaryRoles_7 = {
        "h",
        "wrongAnswer",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule complementaryRoles_7
     *
     * @return the identifiers declared in rule complementaryRoles_7
     */
    private String[] getDeclaredIdentifiers_complementaryRoles_7() {
         return identifiers_complementaryRoles_7;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule complementaryRoles_7.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_complementaryRoles_7(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.MERFunction";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule complementaryRoles_7.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_complementaryRoles_7(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.MERFunction.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule complementaryRoles_7.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_complementaryRoles_7(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule complementaryRoles_7.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_complementaryRoles_7(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_MERFunction_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule complementaryRoles_7
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_complementaryRoles_7() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule complementaryRoles_7
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_complementaryRoles_7(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule complementaryRoles_7.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getType() == Constants.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_7_cond_0() {
        return (module_entity_WrongAnswer_1.getType() == Constants.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA);
    }

    /**
     * Checks whether some conditions of rule complementaryRoles_7 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_7_cond(int index) {
        switch (index) {
            case 0: return complementaryRoles_7_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule complementaryRoles_7 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_complementaryRoles_7(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!complementaryRoles_7_cond_0()) return false;
                return true;
            case 2:
                return true;
            case 3:
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
    private boolean checkCondForDeclaration_complementaryRoles_7(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule complementaryRoles_7
     */
    private void complementaryRoles_7() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: complementaryRoles_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Interpretação Equivocada \n");
			module_entity_Historic_1.setNumeroTentativas(module_entity_Historic_1.getNumeroTentativas() + 1);
			modified(module_entity_Historic_1);
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_PAPEIS_COMPLEMENTARES);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Papéis Complementares");
			flush();

	    }




	
    /**
     * Identifiers of rule constructDeeperUnderstanding03_8
     */
    private String[] identifiers_constructDeeperUnderstanding03_8 = {
        "h",
        "wrongAnswer",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constructDeeperUnderstanding03_8
     *
     * @return the identifiers declared in rule constructDeeperUnderstanding03_8
     */
    private String[] getDeclaredIdentifiers_constructDeeperUnderstanding03_8() {
         return identifiers_constructDeeperUnderstanding03_8;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constructDeeperUnderstanding03_8.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constructDeeperUnderstanding03_8(int index) {
        switch (index) {
            case 0: return "module.entity.Historic";
            case 1: return "module.entity.WrongAnswer";
            case 2: return "module.entity.MERFunction";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constructDeeperUnderstanding03_8.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constructDeeperUnderstanding03_8(int index) {
        switch (index) {
            case 0: return module.entity.Historic.class;
            case 1: return module.entity.WrongAnswer.class;
            case 2: return module.entity.MERFunction.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constructDeeperUnderstanding03_8.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constructDeeperUnderstanding03_8(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Historic_1 = (module.entity.Historic) value; break;
            case 1: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 2: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constructDeeperUnderstanding03_8.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constructDeeperUnderstanding03_8(int index) {
        switch (index) {
            case 0: return module_entity_Historic_1;
            case 1: return module_entity_WrongAnswer_1;
            case 2: return module_entity_MERFunction_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constructDeeperUnderstanding03_8
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constructDeeperUnderstanding03_8() {
        return new Object[] {
                            module_entity_Historic_1,
                            module_entity_WrongAnswer_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constructDeeperUnderstanding03_8
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constructDeeperUnderstanding03_8(Object[] objects) {
        module_entity_Historic_1 = (module.entity.Historic) objects[0];
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[1];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule constructDeeperUnderstanding03_8.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getType() == Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_8_cond_0() {
        return (module_entity_WrongAnswer_1.getType() == Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL);
    }

    /**
     * Checks whether some conditions of rule constructDeeperUnderstanding03_8 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_8_cond(int index) {
        switch (index) {
            case 0: return constructDeeperUnderstanding03_8_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constructDeeperUnderstanding03_8 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constructDeeperUnderstanding03_8(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!constructDeeperUnderstanding03_8_cond_0()) return false;
                return true;
            case 2:
                return true;
            case 3:
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
    private boolean checkCondForDeclaration_constructDeeperUnderstanding03_8(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule constructDeeperUnderstanding03_8
     */
    private void constructDeeperUnderstanding03_8() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constructDeeperUnderstanding03_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Solução Não Categorizável \n");
			module_entity_Historic_1.setNumeroTentativas(module_entity_Historic_1.getNumeroTentativas() + 1);
			modified(module_entity_Historic_1);
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Compreensão Mais Aprofundada");
			flush();

	    }



// end_rules
	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "constrainInterpretation01_0",
        "constrainInterpretation01_1",
        "constrainInterpretation01_2",
        "constrainInterpretation01_3",
        "constructDeeperUnderstanding02_4",
        "constructDeeperUnderstanding01_5",
        "constrainInterpretation02_6",
        "complementaryRoles_7",
        "constructDeeperUnderstanding03_8"
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
        4,
        4,
        4,
        4,
        4,
        4,
        4,
        4,
        4
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
        1,
        1,
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
            case 0: return constrainInterpretation01_0_cond(condIndex);
            case 1: return constrainInterpretation01_1_cond(condIndex);
            case 2: return constrainInterpretation01_2_cond(condIndex);
            case 3: return constrainInterpretation01_3_cond(condIndex);
            case 4: return constructDeeperUnderstanding02_4_cond(condIndex);
            case 5: return constructDeeperUnderstanding01_5_cond(condIndex);
            case 6: return constrainInterpretation02_6_cond(condIndex);
            case 7: return complementaryRoles_7_cond(condIndex);
            case 8: return constructDeeperUnderstanding03_8_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_constrainInterpretation01_0(declIndex);
            case 1: return checkConditionsOnlyOf_constrainInterpretation01_1(declIndex);
            case 2: return checkConditionsOnlyOf_constrainInterpretation01_2(declIndex);
            case 3: return checkConditionsOnlyOf_constrainInterpretation01_3(declIndex);
            case 4: return checkConditionsOnlyOf_constructDeeperUnderstanding02_4(declIndex);
            case 5: return checkConditionsOnlyOf_constructDeeperUnderstanding01_5(declIndex);
            case 6: return checkConditionsOnlyOf_constrainInterpretation02_6(declIndex);
            case 7: return checkConditionsOnlyOf_complementaryRoles_7(declIndex);
            case 8: return checkConditionsOnlyOf_constructDeeperUnderstanding03_8(declIndex);
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
            case 0: return checkCondForDeclaration_constrainInterpretation01_0(declIndex);
            case 1: return checkCondForDeclaration_constrainInterpretation01_1(declIndex);
            case 2: return checkCondForDeclaration_constrainInterpretation01_2(declIndex);
            case 3: return checkCondForDeclaration_constrainInterpretation01_3(declIndex);
            case 4: return checkCondForDeclaration_constructDeeperUnderstanding02_4(declIndex);
            case 5: return checkCondForDeclaration_constructDeeperUnderstanding01_5(declIndex);
            case 6: return checkCondForDeclaration_constrainInterpretation02_6(declIndex);
            case 7: return checkCondForDeclaration_complementaryRoles_7(declIndex);
            case 8: return checkCondForDeclaration_constructDeeperUnderstanding03_8(declIndex);
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
            case 0: return getDeclaredClassName_constrainInterpretation01_0(declIndex);
            case 1: return getDeclaredClassName_constrainInterpretation01_1(declIndex);
            case 2: return getDeclaredClassName_constrainInterpretation01_2(declIndex);
            case 3: return getDeclaredClassName_constrainInterpretation01_3(declIndex);
            case 4: return getDeclaredClassName_constructDeeperUnderstanding02_4(declIndex);
            case 5: return getDeclaredClassName_constructDeeperUnderstanding01_5(declIndex);
            case 6: return getDeclaredClassName_constrainInterpretation02_6(declIndex);
            case 7: return getDeclaredClassName_complementaryRoles_7(declIndex);
            case 8: return getDeclaredClassName_constructDeeperUnderstanding03_8(declIndex);
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
            case 0: return getDeclaredClass_constrainInterpretation01_0(declIndex);
            case 1: return getDeclaredClass_constrainInterpretation01_1(declIndex);
            case 2: return getDeclaredClass_constrainInterpretation01_2(declIndex);
            case 3: return getDeclaredClass_constrainInterpretation01_3(declIndex);
            case 4: return getDeclaredClass_constructDeeperUnderstanding02_4(declIndex);
            case 5: return getDeclaredClass_constructDeeperUnderstanding01_5(declIndex);
            case 6: return getDeclaredClass_constrainInterpretation02_6(declIndex);
            case 7: return getDeclaredClass_complementaryRoles_7(declIndex);
            case 8: return getDeclaredClass_constructDeeperUnderstanding03_8(declIndex);
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
            case 0: constrainInterpretation01_0(); break;
            case 1: constrainInterpretation01_1(); break;
            case 2: constrainInterpretation01_2(); break;
            case 3: constrainInterpretation01_3(); break;
            case 4: constructDeeperUnderstanding02_4(); break;
            case 5: constructDeeperUnderstanding01_5(); break;
            case 6: constrainInterpretation02_6(); break;
            case 7: complementaryRoles_7(); break;
            case 8: constructDeeperUnderstanding03_8(); break;
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
            case 0: return getDeclaredIdentifiers_constrainInterpretation01_0();
            case 1: return getDeclaredIdentifiers_constrainInterpretation01_1();
            case 2: return getDeclaredIdentifiers_constrainInterpretation01_2();
            case 3: return getDeclaredIdentifiers_constrainInterpretation01_3();
            case 4: return getDeclaredIdentifiers_constructDeeperUnderstanding02_4();
            case 5: return getDeclaredIdentifiers_constructDeeperUnderstanding01_5();
            case 6: return getDeclaredIdentifiers_constrainInterpretation02_6();
            case 7: return getDeclaredIdentifiers_complementaryRoles_7();
            case 8: return getDeclaredIdentifiers_constructDeeperUnderstanding03_8();
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
            case 0: setObject_constrainInterpretation01_0(declIndex, value); break;
            case 1: setObject_constrainInterpretation01_1(declIndex, value); break;
            case 2: setObject_constrainInterpretation01_2(declIndex, value); break;
            case 3: setObject_constrainInterpretation01_3(declIndex, value); break;
            case 4: setObject_constructDeeperUnderstanding02_4(declIndex, value); break;
            case 5: setObject_constructDeeperUnderstanding01_5(declIndex, value); break;
            case 6: setObject_constrainInterpretation02_6(declIndex, value); break;
            case 7: setObject_complementaryRoles_7(declIndex, value); break;
            case 8: setObject_constructDeeperUnderstanding03_8(declIndex, value); break;
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
            case 0: return getObject_constrainInterpretation01_0(declIndex);
            case 1: return getObject_constrainInterpretation01_1(declIndex);
            case 2: return getObject_constrainInterpretation01_2(declIndex);
            case 3: return getObject_constrainInterpretation01_3(declIndex);
            case 4: return getObject_constructDeeperUnderstanding02_4(declIndex);
            case 5: return getObject_constructDeeperUnderstanding01_5(declIndex);
            case 6: return getObject_constrainInterpretation02_6(declIndex);
            case 7: return getObject_complementaryRoles_7(declIndex);
            case 8: return getObject_constructDeeperUnderstanding03_8(declIndex);
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
            case 0: return getObjects_constrainInterpretation01_0();
            case 1: return getObjects_constrainInterpretation01_1();
            case 2: return getObjects_constrainInterpretation01_2();
            case 3: return getObjects_constrainInterpretation01_3();
            case 4: return getObjects_constructDeeperUnderstanding02_4();
            case 5: return getObjects_constructDeeperUnderstanding01_5();
            case 6: return getObjects_constrainInterpretation02_6();
            case 7: return getObjects_complementaryRoles_7();
            case 8: return getObjects_constructDeeperUnderstanding03_8();
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
            case 0: setObjects_constrainInterpretation01_0(objects); break;
            case 1: setObjects_constrainInterpretation01_1(objects); break;
            case 2: setObjects_constrainInterpretation01_2(objects); break;
            case 3: setObjects_constrainInterpretation01_3(objects); break;
            case 4: setObjects_constructDeeperUnderstanding02_4(objects); break;
            case 5: setObjects_constructDeeperUnderstanding01_5(objects); break;
            case 6: setObjects_constrainInterpretation02_6(objects); break;
            case 7: setObjects_complementaryRoles_7(objects); break;
            case 8: setObjects_constructDeeperUnderstanding03_8(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private module.entity.Historic module_entity_Historic_1;
    private module.entity.WrongAnswer module_entity_WrongAnswer_1;
    private module.entity.MERFunction module_entity_MERFunction_1;
    private module.entity.RuleToHuman module_entity_RuleToHuman_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_MERFunctionSorterKB(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file MERFunctionSorterKB.rules
 *
 * @version 15/07/2014
 */
public class MERFunctionSorterKB extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public MERFunctionSorterKB(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public MERFunctionSorterKB() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_MERFunctionSorterKB(this);
    }

}
