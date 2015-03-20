package src.module.merfunction.sorter;

import javax.swing.JComponent;
import module.entity.Goal;
import module.entity.Action;
import module.entity.WrongAnswer;
import module.entity.RuleToHuman;
import util.Constants;
import module.entity.MERFunction;
import module.mer.manager.MERManagerController;


 class Jeops_RuleBase_MERFunctionSorterKB extends jeops.AbstractRuleBase {



	
    /**
     * Identifiers of rule constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0
     */
    private String[] identifiers_constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0
     *
     * @return the identifiers declared in rule constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0
     */
    private String[] getDeclaredIdentifiers_constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0() {
         return identifiers_constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO);
    }

    /**
     * Condition 1 of rule constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 2 of rule constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(1));
    }

    /**
     * Condition 3 of rule constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela1"));
    }

    /**
     * Checks whether some conditions of rule constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0_cond(int index) {
        switch (index) {
            case 0: return constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0_cond_0();
            case 1: return constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0_cond_1();
            case 2: return constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0_cond_2();
            case 3: return constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0_cond_0()) return false;
                if (!constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0_cond_1()) return false;
                if (!constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0_cond_2()) return false;
                if (!constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0_cond_3()) return false;
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
    private boolean checkCondForDeclaration_constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0(int declIndex) {
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
     * Executes the action part of the rule constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0
     */
    private void constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificável - Deficiência no Domínio \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Restrição Interpretação");
			flush();

	    }




	
    /**
     * Identifiers of rule complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1
     */
    private String[] identifiers_complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1
     *
     * @return the identifiers declared in rule complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1
     */
    private String[] getDeclaredIdentifiers_complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1() {
         return identifiers_complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA);
    }

    /**
     * Condition 1 of rule complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 2 of rule complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(1));
    }

    /**
     * Condition 3 of rule complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela1"));
    }

    /**
     * Checks whether some conditions of rule complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1_cond(int index) {
        switch (index) {
            case 0: return complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1_cond_0();
            case 1: return complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1_cond_1();
            case 2: return complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1_cond_2();
            case 3: return complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1_cond_0()) return false;
                if (!complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1_cond_1()) return false;
                if (!complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1_cond_2()) return false;
                if (!complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1_cond_3()) return false;
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
    private boolean checkCondForDeclaration_complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1(int declIndex) {
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
     * Executes the action part of the rule complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1
     */
    private void complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Interpretação Equivocada \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_PAPEIS_COMPLEMENTARES);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Papéis Complementares");
			flush();

	    }




	
    /**
     * Identifiers of rule constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2
     */
    private String[] identifiers_constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2
     *
     * @return the identifiers declared in rule constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2
     */
    private String[] getDeclaredIdentifiers_constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2() {
         return identifiers_constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL);
    }

    /**
     * Condition 1 of rule constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 2 of rule constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(1));
    }

    /**
     * Condition 3 of rule constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela1"));
    }

    /**
     * Checks whether some conditions of rule constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2_cond(int index) {
        switch (index) {
            case 0: return constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2_cond_0();
            case 1: return constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2_cond_1();
            case 2: return constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2_cond_2();
            case 3: return constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2_cond_0()) return false;
                if (!constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2_cond_1()) return false;
                if (!constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2_cond_2()) return false;
                if (!constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2_cond_3()) return false;
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
    private boolean checkCondForDeclaration_constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2(int declIndex) {
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
     * Executes the action part of the rule constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2
     */
    private void constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Solução Não Categorizável \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Compreensão Mais Aprofundada");
			flush();

	    }




	
    /**
     * Identifiers of rule constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3
     */
    private String[] identifiers_constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3
     *
     * @return the identifiers declared in rule constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3
     */
    private String[] getDeclaredIdentifiers_constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3() {
         return identifiers_constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR);
    }

    /**
     * Condition 1 of rule constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 2 of rule constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(2)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(2));
    }

    /**
     * Condition 3 of rule constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtOp")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtOp"));
    }

    /**
     * Checks whether some conditions of rule constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3_cond(int index) {
        switch (index) {
            case 0: return constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3_cond_0();
            case 1: return constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3_cond_1();
            case 2: return constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3_cond_2();
            case 3: return constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3_cond_0()) return false;
                if (!constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3_cond_1()) return false;
                if (!constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3_cond_2()) return false;
                if (!constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3_cond_3()) return false;
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
    private boolean checkCondForDeclaration_constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3(int declIndex) {
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
     * Executes the action part of the rule constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3
     */
    private void constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificável - Deficiência na Escolha do Operador \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Compreensão Mais Aprofundada");
			flush();

	    }




	
    /**
     * Identifiers of rule constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4
     */
    private String[] identifiers_constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4
     *
     * @return the identifiers declared in rule constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4
     */
    private String[] getDeclaredIdentifiers_constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4() {
         return identifiers_constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO);
    }

    /**
     * Condition 1 of rule constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 2 of rule constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(2)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(2));
    }

    /**
     * Condition 3 of rule constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtOp")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtOp"));
    }

    /**
     * Checks whether some conditions of rule constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4_cond(int index) {
        switch (index) {
            case 0: return constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4_cond_0();
            case 1: return constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4_cond_1();
            case 2: return constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4_cond_2();
            case 3: return constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4_cond_0()) return false;
                if (!constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4_cond_1()) return false;
                if (!constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4_cond_2()) return false;
                if (!constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4_cond_3()) return false;
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
    private boolean checkCondForDeclaration_constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4(int declIndex) {
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
     * Executes the action part of the rule constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4
     */
    private void constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificável - Deficiência no Domínio \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Restrição Interpretação");
			flush();

	    }




	
    /**
     * Identifiers of rule constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5
     */
    private String[] identifiers_constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5
     *
     * @return the identifiers declared in rule constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5
     */
    private String[] getDeclaredIdentifiers_constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5() {
         return identifiers_constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL);
    }

    /**
     * Condition 1 of rule constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 2 of rule constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(2)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(2));
    }

    /**
     * Condition 3 of rule constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtOp")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtOp"));
    }

    /**
     * Checks whether some conditions of rule constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5_cond(int index) {
        switch (index) {
            case 0: return constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5_cond_0();
            case 1: return constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5_cond_1();
            case 2: return constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5_cond_2();
            case 3: return constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5_cond_0()) return false;
                if (!constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5_cond_1()) return false;
                if (!constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5_cond_2()) return false;
                if (!constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5_cond_3()) return false;
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
    private boolean checkCondForDeclaration_constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5(int declIndex) {
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
     * Executes the action part of the rule constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5
     */
    private void constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Solução Não Categorizável \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Compreensão Mais Aprofundada");
			flush();

	    }




	
    /**
     * Identifiers of rule constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6
     */
    private String[] identifiers_constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6
     *
     * @return the identifiers declared in rule constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6
     */
    private String[] getDeclaredIdentifiers_constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6() {
         return identifiers_constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO);
    }

    /**
     * Condition 1 of rule constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 2 of rule constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(3)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(3));
    }

    /**
     * Condition 3 of rule constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela2")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela2"));
    }

    /**
     * Checks whether some conditions of rule constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6_cond(int index) {
        switch (index) {
            case 0: return constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6_cond_0();
            case 1: return constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6_cond_1();
            case 2: return constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6_cond_2();
            case 3: return constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6_cond_0()) return false;
                if (!constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6_cond_1()) return false;
                if (!constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6_cond_2()) return false;
                if (!constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6_cond_3()) return false;
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
    private boolean checkCondForDeclaration_constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6(int declIndex) {
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
     * Executes the action part of the rule constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6
     */
    private void constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificável - Deficiência no Domínio \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Restrição Interpretação");
			flush();

	    }




	
    /**
     * Identifiers of rule constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7
     */
    private String[] identifiers_constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7
     *
     * @return the identifiers declared in rule constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7
     */
    private String[] getDeclaredIdentifiers_constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7() {
         return identifiers_constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL);
    }

    /**
     * Condition 1 of rule constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 2 of rule constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(3)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(3));
    }

    /**
     * Condition 3 of rule constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela2")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela2"));
    }

    /**
     * Checks whether some conditions of rule constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7_cond(int index) {
        switch (index) {
            case 0: return constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7_cond_0();
            case 1: return constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7_cond_1();
            case 2: return constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7_cond_2();
            case 3: return constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7_cond_0()) return false;
                if (!constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7_cond_1()) return false;
                if (!constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7_cond_2()) return false;
                if (!constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7_cond_3()) return false;
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
    private boolean checkCondForDeclaration_constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7(int declIndex) {
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
     * Executes the action part of the rule constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7
     */
    private void constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Indiretamente Identificável \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Restrição Interpretação");
			flush();

	    }




	
    /**
     * Identifiers of rule constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8
     */
    private String[] identifiers_constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8
     *
     * @return the identifiers declared in rule constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8
     */
    private String[] getDeclaredIdentifiers_constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8() {
         return identifiers_constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL);
    }

    /**
     * Condition 1 of rule constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 2 of rule constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(3)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(3));
    }

    /**
     * Condition 3 of rule constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela2")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela2"));
    }

    /**
     * Checks whether some conditions of rule constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8_cond(int index) {
        switch (index) {
            case 0: return constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8_cond_0();
            case 1: return constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8_cond_1();
            case 2: return constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8_cond_2();
            case 3: return constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8_cond_0()) return false;
                if (!constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8_cond_1()) return false;
                if (!constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8_cond_2()) return false;
                if (!constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8_cond_3()) return false;
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
    private boolean checkCondForDeclaration_constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8(int declIndex) {
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
     * Executes the action part of the rule constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8
     */
    private void constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Solução Não Categorizável \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Compreensão Mais Aprofundada");
			flush();

	    }




	
    /**
     * Identifiers of rule constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9
     */
    private String[] identifiers_constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9
     *
     * @return the identifiers declared in rule constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9
     */
    private String[] getDeclaredIdentifiers_constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9() {
         return identifiers_constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR);
    }

    /**
     * Condition 1 of rule constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 2 of rule constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(4)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(4));
    }

    /**
     * Condition 3 of rule constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtResp")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtResp"));
    }

    /**
     * Checks whether some conditions of rule constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9_cond(int index) {
        switch (index) {
            case 0: return constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9_cond_0();
            case 1: return constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9_cond_1();
            case 2: return constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9_cond_2();
            case 3: return constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9_cond_0()) return false;
                if (!constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9_cond_1()) return false;
                if (!constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9_cond_2()) return false;
                if (!constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9_cond_3()) return false;
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
    private boolean checkCondForDeclaration_constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9(int declIndex) {
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
     * Executes the action part of the rule constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9
     */
    private void constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificável - Deficiência na Escolha do Operador \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Compreensão Mais Aprofundada");
			flush();

	    }




	
    /**
     * Identifiers of rule complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10
     */
    private String[] identifiers_complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10
     *
     * @return the identifiers declared in rule complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10
     */
    private String[] getDeclaredIdentifiers_complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10() {
         return identifiers_complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA);
    }

    /**
     * Condition 1 of rule complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 2 of rule complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(4)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(4));
    }

    /**
     * Condition 3 of rule complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtResp")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtResp"));
    }

    /**
     * Checks whether some conditions of rule complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10_cond(int index) {
        switch (index) {
            case 0: return complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10_cond_0();
            case 1: return complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10_cond_1();
            case 2: return complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10_cond_2();
            case 3: return complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10_cond_0()) return false;
                if (!complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10_cond_1()) return false;
                if (!complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10_cond_2()) return false;
                if (!complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10_cond_3()) return false;
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
    private boolean checkCondForDeclaration_complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10(int declIndex) {
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
     * Executes the action part of the rule complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10
     */
    private void complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Interpretação Equivocada \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_PAPEIS_COMPLEMENTARES);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Papéis Complementares");
			flush();

	    }




	
    /**
     * Identifiers of rule constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11
     */
    private String[] identifiers_constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11
     *
     * @return the identifiers declared in rule constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11
     */
    private String[] getDeclaredIdentifiers_constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11() {
         return identifiers_constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL);
    }

    /**
     * Condition 1 of rule constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 2 of rule constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(4)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(4));
    }

    /**
     * Condition 3 of rule constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtResp")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtResp"));
    }

    /**
     * Checks whether some conditions of rule constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11_cond(int index) {
        switch (index) {
            case 0: return constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11_cond_0();
            case 1: return constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11_cond_1();
            case 2: return constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11_cond_2();
            case 3: return constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11_cond_0()) return false;
                if (!constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11_cond_1()) return false;
                if (!constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11_cond_2()) return false;
                if (!constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11_cond_3()) return false;
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
    private boolean checkCondForDeclaration_constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11(int declIndex) {
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
     * Executes the action part of the rule constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11
     */
    private void constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Indiretamente Identificável \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Restrição Interpretação");
			flush();

	    }




	
    /**
     * Identifiers of rule constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12
     */
    private String[] identifiers_constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12
     *
     * @return the identifiers declared in rule constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12
     */
    private String[] getDeclaredIdentifiers_constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12() {
         return identifiers_constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL);
    }

    /**
     * Condition 1 of rule constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 2 of rule constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(4)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(4));
    }

    /**
     * Condition 3 of rule constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtResp")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtResp"));
    }

    /**
     * Checks whether some conditions of rule constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12_cond(int index) {
        switch (index) {
            case 0: return constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12_cond_0();
            case 1: return constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12_cond_1();
            case 2: return constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12_cond_2();
            case 3: return constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12_cond_0()) return false;
                if (!constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12_cond_1()) return false;
                if (!constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12_cond_2()) return false;
                if (!constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12_cond_3()) return false;
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
    private boolean checkCondForDeclaration_constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12(int declIndex) {
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
     * Executes the action part of the rule constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12
     */
    private void constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Solução Não Categorizável \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Compreensão Mais Aprofundada");
			flush();

	    }




	
    /**
     * Identifiers of rule constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13
     */
    private String[] identifiers_constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13
     *
     * @return the identifiers declared in rule constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13
     */
    private String[] getDeclaredIdentifiers_constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13() {
         return identifiers_constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO);
    }

    /**
     * Condition 1 of rule constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(2)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(2));
    }

    /**
     * Condition 2 of rule constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(5)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(5));
    }

    /**
     * Condition 3 of rule constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela1"));
    }

    /**
     * Checks whether some conditions of rule constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13_cond(int index) {
        switch (index) {
            case 0: return constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13_cond_0();
            case 1: return constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13_cond_1();
            case 2: return constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13_cond_2();
            case 3: return constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13_cond_0()) return false;
                if (!constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13_cond_1()) return false;
                if (!constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13_cond_2()) return false;
                if (!constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13_cond_3()) return false;
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
    private boolean checkCondForDeclaration_constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13(int declIndex) {
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
     * Executes the action part of the rule constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13
     */
    private void constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificável - Deficiência no Domínio \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Restrição Interpretação");
			flush();

	    }




	
    /**
     * Identifiers of rule complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14
     */
    private String[] identifiers_complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14
     *
     * @return the identifiers declared in rule complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14
     */
    private String[] getDeclaredIdentifiers_complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14() {
         return identifiers_complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA);
    }

    /**
     * Condition 1 of rule complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(2)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(2));
    }

    /**
     * Condition 2 of rule complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(5)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(5));
    }

    /**
     * Condition 3 of rule complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela1"));
    }

    /**
     * Checks whether some conditions of rule complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14_cond(int index) {
        switch (index) {
            case 0: return complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14_cond_0();
            case 1: return complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14_cond_1();
            case 2: return complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14_cond_2();
            case 3: return complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14_cond_0()) return false;
                if (!complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14_cond_1()) return false;
                if (!complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14_cond_2()) return false;
                if (!complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14_cond_3()) return false;
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
    private boolean checkCondForDeclaration_complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14(int declIndex) {
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
     * Executes the action part of the rule complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14
     */
    private void complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Interpretação Equivocada \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_PAPEIS_COMPLEMENTARES);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Papéis Complementares");
			flush();

	    }




	
    /**
     * Identifiers of rule constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15
     */
    private String[] identifiers_constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15
     *
     * @return the identifiers declared in rule constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15
     */
    private String[] getDeclaredIdentifiers_constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15() {
         return identifiers_constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL);
    }

    /**
     * Condition 1 of rule constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(2)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(2));
    }

    /**
     * Condition 2 of rule constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(5)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(5));
    }

    /**
     * Condition 3 of rule constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela1"));
    }

    /**
     * Checks whether some conditions of rule constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15_cond(int index) {
        switch (index) {
            case 0: return constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15_cond_0();
            case 1: return constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15_cond_1();
            case 2: return constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15_cond_2();
            case 3: return constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15_cond_0()) return false;
                if (!constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15_cond_1()) return false;
                if (!constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15_cond_2()) return false;
                if (!constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15_cond_3()) return false;
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
    private boolean checkCondForDeclaration_constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15(int declIndex) {
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
     * Executes the action part of the rule constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15
     */
    private void constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Solução Não Categorizável \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Compreensão Mais Aprofundada");
			flush();

	    }




	
    /**
     * Identifiers of rule constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16
     */
    private String[] identifiers_constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16
     *
     * @return the identifiers declared in rule constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16
     */
    private String[] getDeclaredIdentifiers_constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16() {
         return identifiers_constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR);
    }

    /**
     * Condition 1 of rule constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(2)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(2));
    }

    /**
     * Condition 2 of rule constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(6)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(6));
    }

    /**
     * Condition 3 of rule constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtOp")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtOp"));
    }

    /**
     * Checks whether some conditions of rule constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16_cond(int index) {
        switch (index) {
            case 0: return constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16_cond_0();
            case 1: return constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16_cond_1();
            case 2: return constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16_cond_2();
            case 3: return constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16_cond_0()) return false;
                if (!constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16_cond_1()) return false;
                if (!constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16_cond_2()) return false;
                if (!constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16_cond_3()) return false;
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
    private boolean checkCondForDeclaration_constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16(int declIndex) {
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
     * Executes the action part of the rule constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16
     */
    private void constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificável - Deficiência na Escolha do Operador \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Compreensão Mais Aprofundada");
			flush();

	    }




	
    /**
     * Identifiers of rule constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17
     */
    private String[] identifiers_constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17
     *
     * @return the identifiers declared in rule constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17
     */
    private String[] getDeclaredIdentifiers_constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17() {
         return identifiers_constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO);
    }

    /**
     * Condition 1 of rule constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(2)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(2));
    }

    /**
     * Condition 2 of rule constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(6)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(6));
    }

    /**
     * Condition 3 of rule constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtOp")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtOp"));
    }

    /**
     * Checks whether some conditions of rule constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17_cond(int index) {
        switch (index) {
            case 0: return constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17_cond_0();
            case 1: return constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17_cond_1();
            case 2: return constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17_cond_2();
            case 3: return constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17_cond_0()) return false;
                if (!constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17_cond_1()) return false;
                if (!constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17_cond_2()) return false;
                if (!constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17_cond_3()) return false;
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
    private boolean checkCondForDeclaration_constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17(int declIndex) {
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
     * Executes the action part of the rule constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17
     */
    private void constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificável - Deficiência no Domínio \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Restrição Interpretação");
			flush();

	    }




	
    /**
     * Identifiers of rule constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18
     */
    private String[] identifiers_constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18
     *
     * @return the identifiers declared in rule constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18
     */
    private String[] getDeclaredIdentifiers_constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18() {
         return identifiers_constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL);
    }

    /**
     * Condition 1 of rule constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(2)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(2));
    }

    /**
     * Condition 2 of rule constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(6)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(6));
    }

    /**
     * Condition 3 of rule constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtOp")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtOp"));
    }

    /**
     * Checks whether some conditions of rule constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18_cond(int index) {
        switch (index) {
            case 0: return constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18_cond_0();
            case 1: return constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18_cond_1();
            case 2: return constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18_cond_2();
            case 3: return constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18_cond_0()) return false;
                if (!constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18_cond_1()) return false;
                if (!constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18_cond_2()) return false;
                if (!constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18_cond_3()) return false;
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
    private boolean checkCondForDeclaration_constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18(int declIndex) {
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
     * Executes the action part of the rule constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18
     */
    private void constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Solução Não Categorizável \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Compreensão Mais Aprofundada");
			flush();

	    }




	
    /**
     * Identifiers of rule constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19
     */
    private String[] identifiers_constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19
     *
     * @return the identifiers declared in rule constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19
     */
    private String[] getDeclaredIdentifiers_constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19() {
         return identifiers_constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO);
    }

    /**
     * Condition 1 of rule constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(2)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(2));
    }

    /**
     * Condition 2 of rule constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(7)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(7));
    }

    /**
     * Condition 3 of rule constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela2")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela2"));
    }

    /**
     * Checks whether some conditions of rule constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19_cond(int index) {
        switch (index) {
            case 0: return constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19_cond_0();
            case 1: return constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19_cond_1();
            case 2: return constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19_cond_2();
            case 3: return constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19_cond_0()) return false;
                if (!constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19_cond_1()) return false;
                if (!constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19_cond_2()) return false;
                if (!constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19_cond_3()) return false;
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
    private boolean checkCondForDeclaration_constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19(int declIndex) {
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
     * Executes the action part of the rule constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19
     */
    private void constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificável - Deficiência no Domínio \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Restrição Interpretação");
			flush();

	    }




	
    /**
     * Identifiers of rule constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20
     */
    private String[] identifiers_constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20
     *
     * @return the identifiers declared in rule constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20
     */
    private String[] getDeclaredIdentifiers_constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20() {
         return identifiers_constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL);
    }

    /**
     * Condition 1 of rule constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(2)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(2));
    }

    /**
     * Condition 2 of rule constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(7)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(7));
    }

    /**
     * Condition 3 of rule constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela2")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela2"));
    }

    /**
     * Checks whether some conditions of rule constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20_cond(int index) {
        switch (index) {
            case 0: return constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20_cond_0();
            case 1: return constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20_cond_1();
            case 2: return constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20_cond_2();
            case 3: return constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20_cond_0()) return false;
                if (!constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20_cond_1()) return false;
                if (!constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20_cond_2()) return false;
                if (!constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20_cond_3()) return false;
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
    private boolean checkCondForDeclaration_constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20(int declIndex) {
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
     * Executes the action part of the rule constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20
     */
    private void constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Indiretamente Identificável \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Restrição Interpretação");
			flush();

	    }




	
    /**
     * Identifiers of rule constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21
     */
    private String[] identifiers_constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21
     *
     * @return the identifiers declared in rule constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21
     */
    private String[] getDeclaredIdentifiers_constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21() {
         return identifiers_constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL);
    }

    /**
     * Condition 1 of rule constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(2)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(2));
    }

    /**
     * Condition 2 of rule constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(7)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(7));
    }

    /**
     * Condition 3 of rule constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela2")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtParcela2"));
    }

    /**
     * Checks whether some conditions of rule constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21_cond(int index) {
        switch (index) {
            case 0: return constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21_cond_0();
            case 1: return constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21_cond_1();
            case 2: return constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21_cond_2();
            case 3: return constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21_cond_0()) return false;
                if (!constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21_cond_1()) return false;
                if (!constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21_cond_2()) return false;
                if (!constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21_cond_3()) return false;
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
    private boolean checkCondForDeclaration_constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21(int declIndex) {
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
     * Executes the action part of the rule constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21
     */
    private void constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Solução Não Categorizável \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Compreensão Mais Aprofundada");
			flush();

	    }




	
    /**
     * Identifiers of rule constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22
     */
    private String[] identifiers_constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22
     *
     * @return the identifiers declared in rule constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22
     */
    private String[] getDeclaredIdentifiers_constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22() {
         return identifiers_constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR);
    }

    /**
     * Condition 1 of rule constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(2)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(2));
    }

    /**
     * Condition 2 of rule constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(8)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(8));
    }

    /**
     * Condition 3 of rule constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtResp")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtResp"));
    }

    /**
     * Checks whether some conditions of rule constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22_cond(int index) {
        switch (index) {
            case 0: return constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22_cond_0();
            case 1: return constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22_cond_1();
            case 2: return constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22_cond_2();
            case 3: return constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22_cond_0()) return false;
                if (!constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22_cond_1()) return false;
                if (!constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22_cond_2()) return false;
                if (!constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22_cond_3()) return false;
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
    private boolean checkCondForDeclaration_constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22(int declIndex) {
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
     * Executes the action part of the rule constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22
     */
    private void constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificável - Deficiência na Escolha do Operador \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Compreensão Mais Aprofundada");
			flush();

	    }




	
    /**
     * Identifiers of rule complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23
     */
    private String[] identifiers_complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23
     *
     * @return the identifiers declared in rule complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23
     */
    private String[] getDeclaredIdentifiers_complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23() {
         return identifiers_complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA);
    }

    /**
     * Condition 1 of rule complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(2)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(2));
    }

    /**
     * Condition 2 of rule complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(8)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(8));
    }

    /**
     * Condition 3 of rule complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtResp")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtResp"));
    }

    /**
     * Checks whether some conditions of rule complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23_cond(int index) {
        switch (index) {
            case 0: return complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23_cond_0();
            case 1: return complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23_cond_1();
            case 2: return complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23_cond_2();
            case 3: return complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23_cond_0()) return false;
                if (!complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23_cond_1()) return false;
                if (!complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23_cond_2()) return false;
                if (!complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23_cond_3()) return false;
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
    private boolean checkCondForDeclaration_complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23(int declIndex) {
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
     * Executes the action part of the rule complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23
     */
    private void complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Interpretação Equivocada \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_PAPEIS_COMPLEMENTARES);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Papéis Complementares");
			flush();

	    }




	
    /**
     * Identifiers of rule constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24
     */
    private String[] identifiers_constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24
     *
     * @return the identifiers declared in rule constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24
     */
    private String[] getDeclaredIdentifiers_constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24() {
         return identifiers_constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL);
    }

    /**
     * Condition 1 of rule constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(2)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(2));
    }

    /**
     * Condition 2 of rule constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(8)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(8));
    }

    /**
     * Condition 3 of rule constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtResp")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtResp"));
    }

    /**
     * Checks whether some conditions of rule constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24_cond(int index) {
        switch (index) {
            case 0: return constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24_cond_0();
            case 1: return constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24_cond_1();
            case 2: return constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24_cond_2();
            case 3: return constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24_cond_0()) return false;
                if (!constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24_cond_1()) return false;
                if (!constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24_cond_2()) return false;
                if (!constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24_cond_3()) return false;
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
    private boolean checkCondForDeclaration_constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24(int declIndex) {
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
     * Executes the action part of the rule constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24
     */
    private void constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Indiretamente Identificável \n");
			module_entity_MERFunction_1.setType(Constants.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
			modified(module_entity_MERFunction_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Função MRE: Restrição Interpretação");
			flush();

	    }




	
    /**
     * Identifiers of rule constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25
     */
    private String[] identifiers_constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25 = {
        "action",
        "merFunction",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25
     *
     * @return the identifiers declared in rule constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25
     */
    private String[] getDeclaredIdentifiers_constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25() {
         return identifiers_constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_MERFunction_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getType() == Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL);
    }

    /**
     * Condition 1 of rule constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(2)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(2));
    }

    /**
     * Condition 2 of rule constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(8)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(8));
    }

    /**
     * Condition 3 of rule constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txtResp")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txtResp"));
    }

    /**
     * Checks whether some conditions of rule constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25_cond(int index) {
        switch (index) {
            case 0: return constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25_cond_0();
            case 1: return constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25_cond_1();
            case 2: return constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25_cond_2();
            case 3: return constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25_cond_0()) return false;
                if (!constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25_cond_1()) return false;
                if (!constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25_cond_2()) return false;
                if (!constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25_cond_3()) return false;
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
    private boolean checkCondForDeclaration_constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25(int declIndex) {
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
     * Executes the action part of the rule constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25
     */
    private void constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Solução Não Categorizável \n");
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
        "constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0",
        "complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1",
        "constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2",
        "constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3",
        "constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4",
        "constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5",
        "constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6",
        "constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7",
        "constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8",
        "constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9",
        "complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10",
        "constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11",
        "constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12",
        "constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13",
        "complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14",
        "constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15",
        "constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16",
        "constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17",
        "constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18",
        "constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19",
        "constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20",
        "constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21",
        "constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22",
        "complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23",
        "constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24",
        "constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25"
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
        3,
        3,
        3,
        3,
        3,
        3,
        3,
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
        4,
        4,
        4,
        4,
        4,
        4,
        4,
        4,
        4,
        4,
        4,
        4,
        4,
        4,
        4,
        4,
        4,
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
            case 0: return constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0_cond(condIndex);
            case 1: return complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1_cond(condIndex);
            case 2: return constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2_cond(condIndex);
            case 3: return constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3_cond(condIndex);
            case 4: return constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4_cond(condIndex);
            case 5: return constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5_cond(condIndex);
            case 6: return constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6_cond(condIndex);
            case 7: return constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7_cond(condIndex);
            case 8: return constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8_cond(condIndex);
            case 9: return constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9_cond(condIndex);
            case 10: return complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10_cond(condIndex);
            case 11: return constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11_cond(condIndex);
            case 12: return constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12_cond(condIndex);
            case 13: return constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13_cond(condIndex);
            case 14: return complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14_cond(condIndex);
            case 15: return constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15_cond(condIndex);
            case 16: return constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16_cond(condIndex);
            case 17: return constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17_cond(condIndex);
            case 18: return constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18_cond(condIndex);
            case 19: return constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19_cond(condIndex);
            case 20: return constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20_cond(condIndex);
            case 21: return constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21_cond(condIndex);
            case 22: return constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22_cond(condIndex);
            case 23: return complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23_cond(condIndex);
            case 24: return constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24_cond(condIndex);
            case 25: return constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0(declIndex);
            case 1: return checkConditionsOnlyOf_complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1(declIndex);
            case 2: return checkConditionsOnlyOf_constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2(declIndex);
            case 3: return checkConditionsOnlyOf_constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3(declIndex);
            case 4: return checkConditionsOnlyOf_constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4(declIndex);
            case 5: return checkConditionsOnlyOf_constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5(declIndex);
            case 6: return checkConditionsOnlyOf_constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6(declIndex);
            case 7: return checkConditionsOnlyOf_constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7(declIndex);
            case 8: return checkConditionsOnlyOf_constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8(declIndex);
            case 9: return checkConditionsOnlyOf_constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9(declIndex);
            case 10: return checkConditionsOnlyOf_complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10(declIndex);
            case 11: return checkConditionsOnlyOf_constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11(declIndex);
            case 12: return checkConditionsOnlyOf_constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12(declIndex);
            case 13: return checkConditionsOnlyOf_constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13(declIndex);
            case 14: return checkConditionsOnlyOf_complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14(declIndex);
            case 15: return checkConditionsOnlyOf_constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15(declIndex);
            case 16: return checkConditionsOnlyOf_constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16(declIndex);
            case 17: return checkConditionsOnlyOf_constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17(declIndex);
            case 18: return checkConditionsOnlyOf_constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18(declIndex);
            case 19: return checkConditionsOnlyOf_constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19(declIndex);
            case 20: return checkConditionsOnlyOf_constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20(declIndex);
            case 21: return checkConditionsOnlyOf_constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21(declIndex);
            case 22: return checkConditionsOnlyOf_constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22(declIndex);
            case 23: return checkConditionsOnlyOf_complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23(declIndex);
            case 24: return checkConditionsOnlyOf_constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24(declIndex);
            case 25: return checkConditionsOnlyOf_constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25(declIndex);
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
            case 0: return checkCondForDeclaration_constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0(declIndex);
            case 1: return checkCondForDeclaration_complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1(declIndex);
            case 2: return checkCondForDeclaration_constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2(declIndex);
            case 3: return checkCondForDeclaration_constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3(declIndex);
            case 4: return checkCondForDeclaration_constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4(declIndex);
            case 5: return checkCondForDeclaration_constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5(declIndex);
            case 6: return checkCondForDeclaration_constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6(declIndex);
            case 7: return checkCondForDeclaration_constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7(declIndex);
            case 8: return checkCondForDeclaration_constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8(declIndex);
            case 9: return checkCondForDeclaration_constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9(declIndex);
            case 10: return checkCondForDeclaration_complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10(declIndex);
            case 11: return checkCondForDeclaration_constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11(declIndex);
            case 12: return checkCondForDeclaration_constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12(declIndex);
            case 13: return checkCondForDeclaration_constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13(declIndex);
            case 14: return checkCondForDeclaration_complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14(declIndex);
            case 15: return checkCondForDeclaration_constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15(declIndex);
            case 16: return checkCondForDeclaration_constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16(declIndex);
            case 17: return checkCondForDeclaration_constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17(declIndex);
            case 18: return checkCondForDeclaration_constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18(declIndex);
            case 19: return checkCondForDeclaration_constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19(declIndex);
            case 20: return checkCondForDeclaration_constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20(declIndex);
            case 21: return checkCondForDeclaration_constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21(declIndex);
            case 22: return checkCondForDeclaration_constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22(declIndex);
            case 23: return checkCondForDeclaration_complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23(declIndex);
            case 24: return checkCondForDeclaration_constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24(declIndex);
            case 25: return checkCondForDeclaration_constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25(declIndex);
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
            case 0: return getDeclaredClassName_constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0(declIndex);
            case 1: return getDeclaredClassName_complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1(declIndex);
            case 2: return getDeclaredClassName_constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2(declIndex);
            case 3: return getDeclaredClassName_constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3(declIndex);
            case 4: return getDeclaredClassName_constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4(declIndex);
            case 5: return getDeclaredClassName_constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5(declIndex);
            case 6: return getDeclaredClassName_constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6(declIndex);
            case 7: return getDeclaredClassName_constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7(declIndex);
            case 8: return getDeclaredClassName_constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8(declIndex);
            case 9: return getDeclaredClassName_constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9(declIndex);
            case 10: return getDeclaredClassName_complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10(declIndex);
            case 11: return getDeclaredClassName_constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11(declIndex);
            case 12: return getDeclaredClassName_constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12(declIndex);
            case 13: return getDeclaredClassName_constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13(declIndex);
            case 14: return getDeclaredClassName_complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14(declIndex);
            case 15: return getDeclaredClassName_constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15(declIndex);
            case 16: return getDeclaredClassName_constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16(declIndex);
            case 17: return getDeclaredClassName_constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17(declIndex);
            case 18: return getDeclaredClassName_constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18(declIndex);
            case 19: return getDeclaredClassName_constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19(declIndex);
            case 20: return getDeclaredClassName_constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20(declIndex);
            case 21: return getDeclaredClassName_constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21(declIndex);
            case 22: return getDeclaredClassName_constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22(declIndex);
            case 23: return getDeclaredClassName_complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23(declIndex);
            case 24: return getDeclaredClassName_constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24(declIndex);
            case 25: return getDeclaredClassName_constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25(declIndex);
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
            case 0: return getDeclaredClass_constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0(declIndex);
            case 1: return getDeclaredClass_complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1(declIndex);
            case 2: return getDeclaredClass_constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2(declIndex);
            case 3: return getDeclaredClass_constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3(declIndex);
            case 4: return getDeclaredClass_constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4(declIndex);
            case 5: return getDeclaredClass_constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5(declIndex);
            case 6: return getDeclaredClass_constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6(declIndex);
            case 7: return getDeclaredClass_constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7(declIndex);
            case 8: return getDeclaredClass_constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8(declIndex);
            case 9: return getDeclaredClass_constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9(declIndex);
            case 10: return getDeclaredClass_complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10(declIndex);
            case 11: return getDeclaredClass_constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11(declIndex);
            case 12: return getDeclaredClass_constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12(declIndex);
            case 13: return getDeclaredClass_constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13(declIndex);
            case 14: return getDeclaredClass_complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14(declIndex);
            case 15: return getDeclaredClass_constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15(declIndex);
            case 16: return getDeclaredClass_constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16(declIndex);
            case 17: return getDeclaredClass_constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17(declIndex);
            case 18: return getDeclaredClass_constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18(declIndex);
            case 19: return getDeclaredClass_constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19(declIndex);
            case 20: return getDeclaredClass_constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20(declIndex);
            case 21: return getDeclaredClass_constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21(declIndex);
            case 22: return getDeclaredClass_constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22(declIndex);
            case 23: return getDeclaredClass_complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23(declIndex);
            case 24: return getDeclaredClass_constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24(declIndex);
            case 25: return getDeclaredClass_constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25(declIndex);
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
            case 0: constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0(); break;
            case 1: complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1(); break;
            case 2: constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2(); break;
            case 3: constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3(); break;
            case 4: constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4(); break;
            case 5: constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5(); break;
            case 6: constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6(); break;
            case 7: constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7(); break;
            case 8: constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8(); break;
            case 9: constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9(); break;
            case 10: complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10(); break;
            case 11: constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11(); break;
            case 12: constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12(); break;
            case 13: constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13(); break;
            case 14: complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14(); break;
            case 15: constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15(); break;
            case 16: constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16(); break;
            case 17: constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17(); break;
            case 18: constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18(); break;
            case 19: constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19(); break;
            case 20: constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20(); break;
            case 21: constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21(); break;
            case 22: constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22(); break;
            case 23: complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23(); break;
            case 24: constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24(); break;
            case 25: constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 26;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0();
            case 1: return getDeclaredIdentifiers_complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1();
            case 2: return getDeclaredIdentifiers_constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2();
            case 3: return getDeclaredIdentifiers_constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3();
            case 4: return getDeclaredIdentifiers_constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4();
            case 5: return getDeclaredIdentifiers_constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5();
            case 6: return getDeclaredIdentifiers_constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6();
            case 7: return getDeclaredIdentifiers_constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7();
            case 8: return getDeclaredIdentifiers_constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8();
            case 9: return getDeclaredIdentifiers_constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9();
            case 10: return getDeclaredIdentifiers_complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10();
            case 11: return getDeclaredIdentifiers_constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11();
            case 12: return getDeclaredIdentifiers_constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12();
            case 13: return getDeclaredIdentifiers_constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13();
            case 14: return getDeclaredIdentifiers_complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14();
            case 15: return getDeclaredIdentifiers_constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15();
            case 16: return getDeclaredIdentifiers_constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16();
            case 17: return getDeclaredIdentifiers_constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17();
            case 18: return getDeclaredIdentifiers_constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18();
            case 19: return getDeclaredIdentifiers_constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19();
            case 20: return getDeclaredIdentifiers_constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20();
            case 21: return getDeclaredIdentifiers_constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21();
            case 22: return getDeclaredIdentifiers_constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22();
            case 23: return getDeclaredIdentifiers_complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23();
            case 24: return getDeclaredIdentifiers_constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24();
            case 25: return getDeclaredIdentifiers_constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25();
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
            case 0: setObject_constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0(declIndex, value); break;
            case 1: setObject_complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1(declIndex, value); break;
            case 2: setObject_constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2(declIndex, value); break;
            case 3: setObject_constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3(declIndex, value); break;
            case 4: setObject_constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4(declIndex, value); break;
            case 5: setObject_constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5(declIndex, value); break;
            case 6: setObject_constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6(declIndex, value); break;
            case 7: setObject_constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7(declIndex, value); break;
            case 8: setObject_constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8(declIndex, value); break;
            case 9: setObject_constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9(declIndex, value); break;
            case 10: setObject_complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10(declIndex, value); break;
            case 11: setObject_constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11(declIndex, value); break;
            case 12: setObject_constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12(declIndex, value); break;
            case 13: setObject_constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13(declIndex, value); break;
            case 14: setObject_complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14(declIndex, value); break;
            case 15: setObject_constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15(declIndex, value); break;
            case 16: setObject_constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16(declIndex, value); break;
            case 17: setObject_constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17(declIndex, value); break;
            case 18: setObject_constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18(declIndex, value); break;
            case 19: setObject_constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19(declIndex, value); break;
            case 20: setObject_constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20(declIndex, value); break;
            case 21: setObject_constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21(declIndex, value); break;
            case 22: setObject_constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22(declIndex, value); break;
            case 23: setObject_complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23(declIndex, value); break;
            case 24: setObject_constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24(declIndex, value); break;
            case 25: setObject_constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25(declIndex, value); break;
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
            case 0: return getObject_constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0(declIndex);
            case 1: return getObject_complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1(declIndex);
            case 2: return getObject_constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2(declIndex);
            case 3: return getObject_constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3(declIndex);
            case 4: return getObject_constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4(declIndex);
            case 5: return getObject_constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5(declIndex);
            case 6: return getObject_constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6(declIndex);
            case 7: return getObject_constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7(declIndex);
            case 8: return getObject_constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8(declIndex);
            case 9: return getObject_constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9(declIndex);
            case 10: return getObject_complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10(declIndex);
            case 11: return getObject_constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11(declIndex);
            case 12: return getObject_constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12(declIndex);
            case 13: return getObject_constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13(declIndex);
            case 14: return getObject_complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14(declIndex);
            case 15: return getObject_constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15(declIndex);
            case 16: return getObject_constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16(declIndex);
            case 17: return getObject_constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17(declIndex);
            case 18: return getObject_constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18(declIndex);
            case 19: return getObject_constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19(declIndex);
            case 20: return getObject_constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20(declIndex);
            case 21: return getObject_constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21(declIndex);
            case 22: return getObject_constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22(declIndex);
            case 23: return getObject_complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23(declIndex);
            case 24: return getObject_constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24(declIndex);
            case 25: return getObject_constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25(declIndex);
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
            case 0: return getObjects_constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0();
            case 1: return getObjects_complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1();
            case 2: return getObjects_constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2();
            case 3: return getObjects_constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3();
            case 4: return getObjects_constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4();
            case 5: return getObjects_constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5();
            case 6: return getObjects_constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6();
            case 7: return getObjects_constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7();
            case 8: return getObjects_constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8();
            case 9: return getObjects_constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9();
            case 10: return getObjects_complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10();
            case 11: return getObjects_constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11();
            case 12: return getObjects_constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12();
            case 13: return getObjects_constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13();
            case 14: return getObjects_complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14();
            case 15: return getObjects_constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15();
            case 16: return getObjects_constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16();
            case 17: return getObjects_constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17();
            case 18: return getObjects_constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18();
            case 19: return getObjects_constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19();
            case 20: return getObjects_constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20();
            case 21: return getObjects_constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21();
            case 22: return getObjects_constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22();
            case 23: return getObjects_complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23();
            case 24: return getObjects_constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24();
            case 25: return getObjects_constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25();
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
            case 0: setObjects_constrainInterpretation01_PATH_1_GOAL_1_COMPONENT_txtParcela1_0(objects); break;
            case 1: setObjects_complementaryRoles_PATH_1_GOAL_1_COMPONENT_txtParcela1_1(objects); break;
            case 2: setObjects_constructDeeperUnderstanding03_PATH_1_GOAL_1_COMPONENT_txtParcela1_2(objects); break;
            case 3: setObjects_constructDeeperUnderstanding02_PATH_1_GOAL_2_COMPONENT_txtOp_3(objects); break;
            case 4: setObjects_constrainInterpretation01_PATH_1_GOAL_2_COMPONENT_txtOp_4(objects); break;
            case 5: setObjects_constructDeeperUnderstanding03_PATH_1_GOAL_2_COMPONENT_txtOp_5(objects); break;
            case 6: setObjects_constrainInterpretation01_PATH_1_GOAL_3_COMPONENT_txtParcela2_6(objects); break;
            case 7: setObjects_constrainInterpretation02_PATH_1_GOAL_3_COMPONENT_txtParcela2_7(objects); break;
            case 8: setObjects_constructDeeperUnderstanding03_PATH_1_GOAL_3_COMPONENT_txtParcela2_8(objects); break;
            case 9: setObjects_constructDeeperUnderstanding02_PATH_1_GOAL_4_COMPONENT_txtResp_9(objects); break;
            case 10: setObjects_complementaryRoles_PATH_1_GOAL_4_COMPONENT_txtResp_10(objects); break;
            case 11: setObjects_constrainInterpretation02_PATH_1_GOAL_4_COMPONENT_txtResp_11(objects); break;
            case 12: setObjects_constructDeeperUnderstanding03_PATH_1_GOAL_4_COMPONENT_txtResp_12(objects); break;
            case 13: setObjects_constrainInterpretation01_PATH_2_GOAL_5_COMPONENT_txtParcela1_13(objects); break;
            case 14: setObjects_complementaryRoles_PATH_2_GOAL_5_COMPONENT_txtParcela1_14(objects); break;
            case 15: setObjects_constructDeeperUnderstanding03_PATH_2_GOAL_5_COMPONENT_txtParcela1_15(objects); break;
            case 16: setObjects_constructDeeperUnderstanding02_PATH_2_GOAL_6_COMPONENT_txtOp_16(objects); break;
            case 17: setObjects_constrainInterpretation01_PATH_2_GOAL_6_COMPONENT_txtOp_17(objects); break;
            case 18: setObjects_constructDeeperUnderstanding03_PATH_2_GOAL_6_COMPONENT_txtOp_18(objects); break;
            case 19: setObjects_constrainInterpretation01_PATH_2_GOAL_7_COMPONENT_txtParcela2_19(objects); break;
            case 20: setObjects_constrainInterpretation02_PATH_2_GOAL_7_COMPONENT_txtParcela2_20(objects); break;
            case 21: setObjects_constructDeeperUnderstanding03_PATH_2_GOAL_7_COMPONENT_txtParcela2_21(objects); break;
            case 22: setObjects_constructDeeperUnderstanding02_PATH_2_GOAL_8_COMPONENT_txtResp_22(objects); break;
            case 23: setObjects_complementaryRoles_PATH_2_GOAL_8_COMPONENT_txtResp_23(objects); break;
            case 24: setObjects_constrainInterpretation02_PATH_2_GOAL_8_COMPONENT_txtResp_24(objects); break;
            case 25: setObjects_constructDeeperUnderstanding03_PATH_2_GOAL_8_COMPONENT_txtResp_25(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private module.entity.Action module_entity_Action_1;
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
 * @version 26/08/2014
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
