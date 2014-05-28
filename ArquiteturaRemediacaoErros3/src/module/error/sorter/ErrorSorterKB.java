package module.error.sorter;

import entity.WrongAnswer;
import util.Constantes;


 class Jeops_RuleBase_ErrorSorterKB extends jeops.AbstractRuleBase {
	


	
    /**
     * Identifiers of rule directlyIdentifiableDeficiencyDomain_0
     */
    private String[] identifiers_directlyIdentifiableDeficiencyDomain_0 = {
        "wrongAnswer"
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
            case 0: return "entity.WrongAnswer";
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
            case 0: return entity.WrongAnswer.class;
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
            case 0: this.entity_WrongAnswer_1 = (entity.WrongAnswer) value; break;
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
            case 0: return entity_WrongAnswer_1;
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
                            entity_WrongAnswer_1
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
        entity_WrongAnswer_1 = (entity.WrongAnswer) objects[0];
    }

    /**
     * Condition 0 of rule directlyIdentifiableDeficiencyDomain_0.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getDescricao().equalsIgnoreCase("123")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyDomain_0_cond_0() {
        return (entity_WrongAnswer_1.getDescricao().equalsIgnoreCase("123"));
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
                if (!directlyIdentifiableDeficiencyDomain_0_cond_0()) return false;
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
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule directlyIdentifiableDeficiencyDomain_0
     */
    private void directlyIdentifiableDeficiencyDomain_0() {
			System.out.println("Erro classificado como Diretamente Identific�vel - Defici�ncia no Dom�nio");
			entity_WrongAnswer_1.setTipo(Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO);
			modified(entity_WrongAnswer_1);
			flush();

	    }




	
    /**
     * Identifiers of rule directlyIdentifiableDeficiencyOperatorChoice_1
     */
    private String[] identifiers_directlyIdentifiableDeficiencyOperatorChoice_1 = {
        "wrongAnswer"
    };

    /**
     * Returns the identifiers declared in rule directlyIdentifiableDeficiencyOperatorChoice_1
     *
     * @return the identifiers declared in rule directlyIdentifiableDeficiencyOperatorChoice_1
     */
    private String[] getDeclaredIdentifiers_directlyIdentifiableDeficiencyOperatorChoice_1() {
         return identifiers_directlyIdentifiableDeficiencyOperatorChoice_1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule directlyIdentifiableDeficiencyOperatorChoice_1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_directlyIdentifiableDeficiencyOperatorChoice_1(int index) {
        switch (index) {
            case 0: return "entity.WrongAnswer";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule directlyIdentifiableDeficiencyOperatorChoice_1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_directlyIdentifiableDeficiencyOperatorChoice_1(int index) {
        switch (index) {
            case 0: return entity.WrongAnswer.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule directlyIdentifiableDeficiencyOperatorChoice_1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_directlyIdentifiableDeficiencyOperatorChoice_1(int index, Object value) {
        switch (index) {
            case 0: this.entity_WrongAnswer_1 = (entity.WrongAnswer) value; break;
        }
    }

    /**
     * Returns an object declared in the rule directlyIdentifiableDeficiencyOperatorChoice_1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_directlyIdentifiableDeficiencyOperatorChoice_1(int index) {
        switch (index) {
            case 0: return entity_WrongAnswer_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule directlyIdentifiableDeficiencyOperatorChoice_1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_directlyIdentifiableDeficiencyOperatorChoice_1() {
        return new Object[] {
                            entity_WrongAnswer_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule directlyIdentifiableDeficiencyOperatorChoice_1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_directlyIdentifiableDeficiencyOperatorChoice_1(Object[] objects) {
        entity_WrongAnswer_1 = (entity.WrongAnswer) objects[0];
    }

    /**
     * Condition 0 of rule directlyIdentifiableDeficiencyOperatorChoice_1.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getDescricao().equalsIgnoreCase("456")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyOperatorChoice_1_cond_0() {
        return (entity_WrongAnswer_1.getDescricao().equalsIgnoreCase("456"));
    }

    /**
     * Checks whether some conditions of rule directlyIdentifiableDeficiencyOperatorChoice_1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyOperatorChoice_1_cond(int index) {
        switch (index) {
            case 0: return directlyIdentifiableDeficiencyOperatorChoice_1_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule directlyIdentifiableDeficiencyOperatorChoice_1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_directlyIdentifiableDeficiencyOperatorChoice_1(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!directlyIdentifiableDeficiencyOperatorChoice_1_cond_0()) return false;
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
    private boolean checkCondForDeclaration_directlyIdentifiableDeficiencyOperatorChoice_1(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule directlyIdentifiableDeficiencyOperatorChoice_1
     */
    private void directlyIdentifiableDeficiencyOperatorChoice_1() {
			System.out.println("Erro classificado como Diretamente Identific�vel - Defici�ncia na Escolha do Operador");
			entity_WrongAnswer_1.setTipo(Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR);
			modified(entity_WrongAnswer_1);
			flush();

	    }




	
    /**
     * Identifiers of rule directlyIdentifiableDeficiencyRule_2
     */
    private String[] identifiers_directlyIdentifiableDeficiencyRule_2 = {
        "wrongAnswer"
    };

    /**
     * Returns the identifiers declared in rule directlyIdentifiableDeficiencyRule_2
     *
     * @return the identifiers declared in rule directlyIdentifiableDeficiencyRule_2
     */
    private String[] getDeclaredIdentifiers_directlyIdentifiableDeficiencyRule_2() {
         return identifiers_directlyIdentifiableDeficiencyRule_2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule directlyIdentifiableDeficiencyRule_2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_directlyIdentifiableDeficiencyRule_2(int index) {
        switch (index) {
            case 0: return "entity.WrongAnswer";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule directlyIdentifiableDeficiencyRule_2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_directlyIdentifiableDeficiencyRule_2(int index) {
        switch (index) {
            case 0: return entity.WrongAnswer.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule directlyIdentifiableDeficiencyRule_2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_directlyIdentifiableDeficiencyRule_2(int index, Object value) {
        switch (index) {
            case 0: this.entity_WrongAnswer_1 = (entity.WrongAnswer) value; break;
        }
    }

    /**
     * Returns an object declared in the rule directlyIdentifiableDeficiencyRule_2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_directlyIdentifiableDeficiencyRule_2(int index) {
        switch (index) {
            case 0: return entity_WrongAnswer_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule directlyIdentifiableDeficiencyRule_2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_directlyIdentifiableDeficiencyRule_2() {
        return new Object[] {
                            entity_WrongAnswer_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule directlyIdentifiableDeficiencyRule_2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_directlyIdentifiableDeficiencyRule_2(Object[] objects) {
        entity_WrongAnswer_1 = (entity.WrongAnswer) objects[0];
    }

    /**
     * Condition 0 of rule directlyIdentifiableDeficiencyRule_2.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getDescricao().equalsIgnoreCase("789")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyRule_2_cond_0() {
        return (entity_WrongAnswer_1.getDescricao().equalsIgnoreCase("789"));
    }

    /**
     * Checks whether some conditions of rule directlyIdentifiableDeficiencyRule_2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean directlyIdentifiableDeficiencyRule_2_cond(int index) {
        switch (index) {
            case 0: return directlyIdentifiableDeficiencyRule_2_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule directlyIdentifiableDeficiencyRule_2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_directlyIdentifiableDeficiencyRule_2(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!directlyIdentifiableDeficiencyRule_2_cond_0()) return false;
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
    private boolean checkCondForDeclaration_directlyIdentifiableDeficiencyRule_2(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule directlyIdentifiableDeficiencyRule_2
     */
    private void directlyIdentifiableDeficiencyRule_2() {
			System.out.println("Erro classificado como Diretamente Identific�vel - Defici�ncia na Regra");
			entity_WrongAnswer_1.setTipo(Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_REGRA);
			modified(entity_WrongAnswer_1);
			flush();

	    }




	
    /**
     * Identifiers of rule indirectlyIdentifiable_3
     */
    private String[] identifiers_indirectlyIdentifiable_3 = {
        "wrongAnswer"
    };

    /**
     * Returns the identifiers declared in rule indirectlyIdentifiable_3
     *
     * @return the identifiers declared in rule indirectlyIdentifiable_3
     */
    private String[] getDeclaredIdentifiers_indirectlyIdentifiable_3() {
         return identifiers_indirectlyIdentifiable_3;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule indirectlyIdentifiable_3.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_indirectlyIdentifiable_3(int index) {
        switch (index) {
            case 0: return "entity.WrongAnswer";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule indirectlyIdentifiable_3.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_indirectlyIdentifiable_3(int index) {
        switch (index) {
            case 0: return entity.WrongAnswer.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule indirectlyIdentifiable_3.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_indirectlyIdentifiable_3(int index, Object value) {
        switch (index) {
            case 0: this.entity_WrongAnswer_1 = (entity.WrongAnswer) value; break;
        }
    }

    /**
     * Returns an object declared in the rule indirectlyIdentifiable_3.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_indirectlyIdentifiable_3(int index) {
        switch (index) {
            case 0: return entity_WrongAnswer_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule indirectlyIdentifiable_3
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_indirectlyIdentifiable_3() {
        return new Object[] {
                            entity_WrongAnswer_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule indirectlyIdentifiable_3
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_indirectlyIdentifiable_3(Object[] objects) {
        entity_WrongAnswer_1 = (entity.WrongAnswer) objects[0];
    }

    /**
     * Condition 0 of rule indirectlyIdentifiable_3.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getDescricao().equalsIgnoreCase("4")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean indirectlyIdentifiable_3_cond_0() {
        return (entity_WrongAnswer_1.getDescricao().equalsIgnoreCase("4"));
    }

    /**
     * Checks whether some conditions of rule indirectlyIdentifiable_3 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean indirectlyIdentifiable_3_cond(int index) {
        switch (index) {
            case 0: return indirectlyIdentifiable_3_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule indirectlyIdentifiable_3 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_indirectlyIdentifiable_3(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!indirectlyIdentifiable_3_cond_0()) return false;
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
    private boolean checkCondForDeclaration_indirectlyIdentifiable_3(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule indirectlyIdentifiable_3
     */
    private void indirectlyIdentifiable_3() {
			System.out.println("Erro classificado como Indiretamente Identific�vel");
			entity_WrongAnswer_1.setTipo(Constantes.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL);
			modified(entity_WrongAnswer_1);
			flush();

	    }




	
    /**
     * Identifiers of rule misinterpretation_4
     */
    private String[] identifiers_misinterpretation_4 = {
        "wrongAnswer"
    };

    /**
     * Returns the identifiers declared in rule misinterpretation_4
     *
     * @return the identifiers declared in rule misinterpretation_4
     */
    private String[] getDeclaredIdentifiers_misinterpretation_4() {
         return identifiers_misinterpretation_4;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule misinterpretation_4.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_misinterpretation_4(int index) {
        switch (index) {
            case 0: return "entity.WrongAnswer";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule misinterpretation_4.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_misinterpretation_4(int index) {
        switch (index) {
            case 0: return entity.WrongAnswer.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule misinterpretation_4.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_misinterpretation_4(int index, Object value) {
        switch (index) {
            case 0: this.entity_WrongAnswer_1 = (entity.WrongAnswer) value; break;
        }
    }

    /**
     * Returns an object declared in the rule misinterpretation_4.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_misinterpretation_4(int index) {
        switch (index) {
            case 0: return entity_WrongAnswer_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule misinterpretation_4
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_misinterpretation_4() {
        return new Object[] {
                            entity_WrongAnswer_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule misinterpretation_4
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_misinterpretation_4(Object[] objects) {
        entity_WrongAnswer_1 = (entity.WrongAnswer) objects[0];
    }

    /**
     * Condition 0 of rule misinterpretation_4.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getDescricao().equalsIgnoreCase("3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean misinterpretation_4_cond_0() {
        return (entity_WrongAnswer_1.getDescricao().equalsIgnoreCase("3"));
    }

    /**
     * Checks whether some conditions of rule misinterpretation_4 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean misinterpretation_4_cond(int index) {
        switch (index) {
            case 0: return misinterpretation_4_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule misinterpretation_4 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_misinterpretation_4(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!misinterpretation_4_cond_0()) return false;
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
    private boolean checkCondForDeclaration_misinterpretation_4(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule misinterpretation_4
     */
    private void misinterpretation_4() {
			System.out.println("Erro classificado como Interpreta��o Equivocada");
			entity_WrongAnswer_1.setTipo(Constantes.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA);
			modified(entity_WrongAnswer_1);
			flush();

	    }



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
        "directlyIdentifiableDeficiencyDomain_0",
        "directlyIdentifiableDeficiencyOperatorChoice_1",
        "directlyIdentifiableDeficiencyRule_2",
        "indirectlyIdentifiable_3",
        "misinterpretation_4",
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
        1,
        1,
        1,
        1,
        1,
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
            case 0: return directlyIdentifiableDeficiencyDomain_0_cond(condIndex);
            case 1: return directlyIdentifiableDeficiencyOperatorChoice_1_cond(condIndex);
            case 2: return directlyIdentifiableDeficiencyRule_2_cond(condIndex);
            case 3: return indirectlyIdentifiable_3_cond(condIndex);
            case 4: return misinterpretation_4_cond(condIndex);
            case 5: return solutionNonCategorizable_cond(condIndex);
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
            case 1: return checkConditionsOnlyOf_directlyIdentifiableDeficiencyOperatorChoice_1(declIndex);
            case 2: return checkConditionsOnlyOf_directlyIdentifiableDeficiencyRule_2(declIndex);
            case 3: return checkConditionsOnlyOf_indirectlyIdentifiable_3(declIndex);
            case 4: return checkConditionsOnlyOf_misinterpretation_4(declIndex);
            case 5: return checkConditionsOnlyOf_solutionNonCategorizable(declIndex);
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
            case 1: return checkCondForDeclaration_directlyIdentifiableDeficiencyOperatorChoice_1(declIndex);
            case 2: return checkCondForDeclaration_directlyIdentifiableDeficiencyRule_2(declIndex);
            case 3: return checkCondForDeclaration_indirectlyIdentifiable_3(declIndex);
            case 4: return checkCondForDeclaration_misinterpretation_4(declIndex);
            case 5: return checkCondForDeclaration_solutionNonCategorizable(declIndex);
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
            case 1: return getDeclaredClassName_directlyIdentifiableDeficiencyOperatorChoice_1(declIndex);
            case 2: return getDeclaredClassName_directlyIdentifiableDeficiencyRule_2(declIndex);
            case 3: return getDeclaredClassName_indirectlyIdentifiable_3(declIndex);
            case 4: return getDeclaredClassName_misinterpretation_4(declIndex);
            case 5: return getDeclaredClassName_solutionNonCategorizable(declIndex);
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
            case 1: return getDeclaredClass_directlyIdentifiableDeficiencyOperatorChoice_1(declIndex);
            case 2: return getDeclaredClass_directlyIdentifiableDeficiencyRule_2(declIndex);
            case 3: return getDeclaredClass_indirectlyIdentifiable_3(declIndex);
            case 4: return getDeclaredClass_misinterpretation_4(declIndex);
            case 5: return getDeclaredClass_solutionNonCategorizable(declIndex);
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
            case 1: directlyIdentifiableDeficiencyOperatorChoice_1(); break;
            case 2: directlyIdentifiableDeficiencyRule_2(); break;
            case 3: indirectlyIdentifiable_3(); break;
            case 4: misinterpretation_4(); break;
            case 5: solutionNonCategorizable(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 6;
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
            case 1: return getDeclaredIdentifiers_directlyIdentifiableDeficiencyOperatorChoice_1();
            case 2: return getDeclaredIdentifiers_directlyIdentifiableDeficiencyRule_2();
            case 3: return getDeclaredIdentifiers_indirectlyIdentifiable_3();
            case 4: return getDeclaredIdentifiers_misinterpretation_4();
            case 5: return getDeclaredIdentifiers_solutionNonCategorizable();
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
            case 1: setObject_directlyIdentifiableDeficiencyOperatorChoice_1(declIndex, value); break;
            case 2: setObject_directlyIdentifiableDeficiencyRule_2(declIndex, value); break;
            case 3: setObject_indirectlyIdentifiable_3(declIndex, value); break;
            case 4: setObject_misinterpretation_4(declIndex, value); break;
            case 5: setObject_solutionNonCategorizable(declIndex, value); break;
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
            case 1: return getObject_directlyIdentifiableDeficiencyOperatorChoice_1(declIndex);
            case 2: return getObject_directlyIdentifiableDeficiencyRule_2(declIndex);
            case 3: return getObject_indirectlyIdentifiable_3(declIndex);
            case 4: return getObject_misinterpretation_4(declIndex);
            case 5: return getObject_solutionNonCategorizable(declIndex);
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
            case 1: return getObjects_directlyIdentifiableDeficiencyOperatorChoice_1();
            case 2: return getObjects_directlyIdentifiableDeficiencyRule_2();
            case 3: return getObjects_indirectlyIdentifiable_3();
            case 4: return getObjects_misinterpretation_4();
            case 5: return getObjects_solutionNonCategorizable();
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
            case 1: setObjects_directlyIdentifiableDeficiencyOperatorChoice_1(objects); break;
            case 2: setObjects_directlyIdentifiableDeficiencyRule_2(objects); break;
            case 3: setObjects_indirectlyIdentifiable_3(objects); break;
            case 4: setObjects_misinterpretation_4(objects); break;
            case 5: setObjects_solutionNonCategorizable(objects); break;
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
