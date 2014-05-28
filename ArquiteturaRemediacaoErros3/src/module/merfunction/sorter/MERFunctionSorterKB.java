package module.merfunction.sorter;
import entity.Historic;
import entity.WrongAnswer;
import util.Constantes;
import entity.MERFunction;
import module.mer.manager.GerenciadorMREControlador;


 class Jeops_RuleBase_MERFunctionSorterKB extends jeops.AbstractRuleBase {



	
    /**
     * Identifiers of rule constrainInterpretation01_0
     */
    private String[] identifiers_constrainInterpretation01_0 = {
        "wrongAnswer",
        "merFunction"
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
            case 0: return "entity.WrongAnswer";
            case 1: return "entity.MERFunction";
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
            case 0: return entity.WrongAnswer.class;
            case 1: return entity.MERFunction.class;
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
            case 0: this.entity_WrongAnswer_1 = (entity.WrongAnswer) value; break;
            case 1: this.entity_MERFunction_1 = (entity.MERFunction) value; break;
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
            case 0: return entity_WrongAnswer_1;
            case 1: return entity_MERFunction_1;
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
                            entity_WrongAnswer_1,
                            entity_MERFunction_1
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
        entity_WrongAnswer_1 = (entity.WrongAnswer) objects[0];
        entity_MERFunction_1 = (entity.MERFunction) objects[1];
    }

    /**
     * Condition 0 of rule constrainInterpretation01_0.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getTipo() == Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_0_cond_0() {
        return (entity_WrongAnswer_1.getTipo() == Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO);
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
                if (!constrainInterpretation01_0_cond_0()) return false;
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
    private boolean checkCondForDeclaration_constrainInterpretation01_0(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule constrainInterpretation01_0
     */
    private void constrainInterpretation01_0() {
			entity_MERFunction_1.setTipo(Constantes.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
			modified(entity_MERFunction_1);
			System.out.println("Função MRE: Restrição Interpretação");
			flush();

	    }




	
    /**
     * Identifiers of rule constructDeeperUnderstanding02_1
     */
    private String[] identifiers_constructDeeperUnderstanding02_1 = {
        "wrongAnswer",
        "merFunction"
    };

    /**
     * Returns the identifiers declared in rule constructDeeperUnderstanding02_1
     *
     * @return the identifiers declared in rule constructDeeperUnderstanding02_1
     */
    private String[] getDeclaredIdentifiers_constructDeeperUnderstanding02_1() {
         return identifiers_constructDeeperUnderstanding02_1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constructDeeperUnderstanding02_1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constructDeeperUnderstanding02_1(int index) {
        switch (index) {
            case 0: return "entity.WrongAnswer";
            case 1: return "entity.MERFunction";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constructDeeperUnderstanding02_1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constructDeeperUnderstanding02_1(int index) {
        switch (index) {
            case 0: return entity.WrongAnswer.class;
            case 1: return entity.MERFunction.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constructDeeperUnderstanding02_1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constructDeeperUnderstanding02_1(int index, Object value) {
        switch (index) {
            case 0: this.entity_WrongAnswer_1 = (entity.WrongAnswer) value; break;
            case 1: this.entity_MERFunction_1 = (entity.MERFunction) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constructDeeperUnderstanding02_1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constructDeeperUnderstanding02_1(int index) {
        switch (index) {
            case 0: return entity_WrongAnswer_1;
            case 1: return entity_MERFunction_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constructDeeperUnderstanding02_1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constructDeeperUnderstanding02_1() {
        return new Object[] {
                            entity_WrongAnswer_1,
                            entity_MERFunction_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constructDeeperUnderstanding02_1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constructDeeperUnderstanding02_1(Object[] objects) {
        entity_WrongAnswer_1 = (entity.WrongAnswer) objects[0];
        entity_MERFunction_1 = (entity.MERFunction) objects[1];
    }

    /**
     * Condition 0 of rule constructDeeperUnderstanding02_1.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getTipo() == Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_1_cond_0() {
        return (entity_WrongAnswer_1.getTipo() == Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR);
    }

    /**
     * Checks whether some conditions of rule constructDeeperUnderstanding02_1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_1_cond(int index) {
        switch (index) {
            case 0: return constructDeeperUnderstanding02_1_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constructDeeperUnderstanding02_1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constructDeeperUnderstanding02_1(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constructDeeperUnderstanding02_1_cond_0()) return false;
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
    private boolean checkCondForDeclaration_constructDeeperUnderstanding02_1(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule constructDeeperUnderstanding02_1
     */
    private void constructDeeperUnderstanding02_1() {
			entity_MERFunction_1.setTipo(Constantes.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
			modified(entity_MERFunction_1);
			System.out.println("Função MRE: Compreensão Mais Aprofundada");
			flush();

	    }




	
    /**
     * Identifiers of rule constrainInterpretation02_2
     */
    private String[] identifiers_constrainInterpretation02_2 = {
        "wrongAnswer",
        "merFunction"
    };

    /**
     * Returns the identifiers declared in rule constrainInterpretation02_2
     *
     * @return the identifiers declared in rule constrainInterpretation02_2
     */
    private String[] getDeclaredIdentifiers_constrainInterpretation02_2() {
         return identifiers_constrainInterpretation02_2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constrainInterpretation02_2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constrainInterpretation02_2(int index) {
        switch (index) {
            case 0: return "entity.WrongAnswer";
            case 1: return "entity.MERFunction";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constrainInterpretation02_2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constrainInterpretation02_2(int index) {
        switch (index) {
            case 0: return entity.WrongAnswer.class;
            case 1: return entity.MERFunction.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constrainInterpretation02_2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constrainInterpretation02_2(int index, Object value) {
        switch (index) {
            case 0: this.entity_WrongAnswer_1 = (entity.WrongAnswer) value; break;
            case 1: this.entity_MERFunction_1 = (entity.MERFunction) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constrainInterpretation02_2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constrainInterpretation02_2(int index) {
        switch (index) {
            case 0: return entity_WrongAnswer_1;
            case 1: return entity_MERFunction_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constrainInterpretation02_2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constrainInterpretation02_2() {
        return new Object[] {
                            entity_WrongAnswer_1,
                            entity_MERFunction_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constrainInterpretation02_2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constrainInterpretation02_2(Object[] objects) {
        entity_WrongAnswer_1 = (entity.WrongAnswer) objects[0];
        entity_MERFunction_1 = (entity.MERFunction) objects[1];
    }

    /**
     * Condition 0 of rule constrainInterpretation02_2.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getTipo() == Constantes.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_2_cond_0() {
        return (entity_WrongAnswer_1.getTipo() == Constantes.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL);
    }

    /**
     * Checks whether some conditions of rule constrainInterpretation02_2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_2_cond(int index) {
        switch (index) {
            case 0: return constrainInterpretation02_2_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constrainInterpretation02_2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constrainInterpretation02_2(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constrainInterpretation02_2_cond_0()) return false;
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
    private boolean checkCondForDeclaration_constrainInterpretation02_2(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule constrainInterpretation02_2
     */
    private void constrainInterpretation02_2() {
			entity_MERFunction_1.setTipo(Constantes.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
			modified(entity_MERFunction_1);
			System.out.println("Função MRE: Restrição Interpretação");
			flush();

	    }




	
    /**
     * Identifiers of rule complementaryRoles_3
     */
    private String[] identifiers_complementaryRoles_3 = {
        "wrongAnswer",
        "merFunction"
    };

    /**
     * Returns the identifiers declared in rule complementaryRoles_3
     *
     * @return the identifiers declared in rule complementaryRoles_3
     */
    private String[] getDeclaredIdentifiers_complementaryRoles_3() {
         return identifiers_complementaryRoles_3;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule complementaryRoles_3.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_complementaryRoles_3(int index) {
        switch (index) {
            case 0: return "entity.WrongAnswer";
            case 1: return "entity.MERFunction";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule complementaryRoles_3.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_complementaryRoles_3(int index) {
        switch (index) {
            case 0: return entity.WrongAnswer.class;
            case 1: return entity.MERFunction.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule complementaryRoles_3.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_complementaryRoles_3(int index, Object value) {
        switch (index) {
            case 0: this.entity_WrongAnswer_1 = (entity.WrongAnswer) value; break;
            case 1: this.entity_MERFunction_1 = (entity.MERFunction) value; break;
        }
    }

    /**
     * Returns an object declared in the rule complementaryRoles_3.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_complementaryRoles_3(int index) {
        switch (index) {
            case 0: return entity_WrongAnswer_1;
            case 1: return entity_MERFunction_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule complementaryRoles_3
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_complementaryRoles_3() {
        return new Object[] {
                            entity_WrongAnswer_1,
                            entity_MERFunction_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule complementaryRoles_3
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_complementaryRoles_3(Object[] objects) {
        entity_WrongAnswer_1 = (entity.WrongAnswer) objects[0];
        entity_MERFunction_1 = (entity.MERFunction) objects[1];
    }

    /**
     * Condition 0 of rule complementaryRoles_3.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getTipo() == Constantes.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_3_cond_0() {
        return (entity_WrongAnswer_1.getTipo() == Constantes.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA);
    }

    /**
     * Checks whether some conditions of rule complementaryRoles_3 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_3_cond(int index) {
        switch (index) {
            case 0: return complementaryRoles_3_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule complementaryRoles_3 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_complementaryRoles_3(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!complementaryRoles_3_cond_0()) return false;
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
    private boolean checkCondForDeclaration_complementaryRoles_3(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule complementaryRoles_3
     */
    private void complementaryRoles_3() {
			entity_MERFunction_1.setTipo(Constantes.TIPO_FUNCAOMRE_PAPEIS_COMPLEMENTARES);
			modified(entity_MERFunction_1);
			System.out.println("Função MRE: Papéis Complementares");
			flush();

	    }



// end_rules
	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "constrainInterpretation01_0",
        "constructDeeperUnderstanding02_1",
        "constrainInterpretation02_2",
        "complementaryRoles_3"
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
            case 0: return constrainInterpretation01_0_cond(condIndex);
            case 1: return constructDeeperUnderstanding02_1_cond(condIndex);
            case 2: return constrainInterpretation02_2_cond(condIndex);
            case 3: return complementaryRoles_3_cond(condIndex);
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
            case 1: return checkConditionsOnlyOf_constructDeeperUnderstanding02_1(declIndex);
            case 2: return checkConditionsOnlyOf_constrainInterpretation02_2(declIndex);
            case 3: return checkConditionsOnlyOf_complementaryRoles_3(declIndex);
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
            case 1: return checkCondForDeclaration_constructDeeperUnderstanding02_1(declIndex);
            case 2: return checkCondForDeclaration_constrainInterpretation02_2(declIndex);
            case 3: return checkCondForDeclaration_complementaryRoles_3(declIndex);
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
            case 1: return getDeclaredClassName_constructDeeperUnderstanding02_1(declIndex);
            case 2: return getDeclaredClassName_constrainInterpretation02_2(declIndex);
            case 3: return getDeclaredClassName_complementaryRoles_3(declIndex);
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
            case 1: return getDeclaredClass_constructDeeperUnderstanding02_1(declIndex);
            case 2: return getDeclaredClass_constrainInterpretation02_2(declIndex);
            case 3: return getDeclaredClass_complementaryRoles_3(declIndex);
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
            case 1: constructDeeperUnderstanding02_1(); break;
            case 2: constrainInterpretation02_2(); break;
            case 3: complementaryRoles_3(); break;
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
            case 0: return getDeclaredIdentifiers_constrainInterpretation01_0();
            case 1: return getDeclaredIdentifiers_constructDeeperUnderstanding02_1();
            case 2: return getDeclaredIdentifiers_constrainInterpretation02_2();
            case 3: return getDeclaredIdentifiers_complementaryRoles_3();
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
            case 1: setObject_constructDeeperUnderstanding02_1(declIndex, value); break;
            case 2: setObject_constrainInterpretation02_2(declIndex, value); break;
            case 3: setObject_complementaryRoles_3(declIndex, value); break;
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
            case 1: return getObject_constructDeeperUnderstanding02_1(declIndex);
            case 2: return getObject_constrainInterpretation02_2(declIndex);
            case 3: return getObject_complementaryRoles_3(declIndex);
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
            case 1: return getObjects_constructDeeperUnderstanding02_1();
            case 2: return getObjects_constrainInterpretation02_2();
            case 3: return getObjects_complementaryRoles_3();
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
            case 1: setObjects_constructDeeperUnderstanding02_1(objects); break;
            case 2: setObjects_constrainInterpretation02_2(objects); break;
            case 3: setObjects_complementaryRoles_3(objects); break;
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
    public Jeops_RuleBase_MERFunctionSorterKB(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file MERFunctionSorterKB.rules
 *
 * @version 28/05/2014
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
