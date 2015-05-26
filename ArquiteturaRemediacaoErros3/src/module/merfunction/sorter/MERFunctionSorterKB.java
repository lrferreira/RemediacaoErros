package module.merfunction.sorter;

import javax.swing.JComponent;
import module.entity.Goal;
import module.entity.Action;
import module.entity.WrongAnswer;
import module.entity.RuleToHuman;
import util.Constants;
import module.entity.MERFunction;
import module.mer.manager.MERManagerController;
import module.entity.DBConnect;


 class Jeops_RuleBase_MERFunctionSorterKB extends jeops.AbstractRuleBase {



 

	
    /**
     * Identifiers of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0
     */
    private String[] identifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0
     *
     * @return the identifiers declared in rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0
     */
    private String[] getDeclaredIdentifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0() {
         return identifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(2L));
    }

    /**
     * Condition 1 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_1() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(3L));
    }

    /**
     * Condition 2 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 4 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt3"));
    }

    /**
     * Condition 5 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_5() {
        return (module_entity_Action_1.getRemediation().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond(int index) {
        switch (index) {
            case 0: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_0();
            case 1: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_1();
            case 2: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_2();
            case 3: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_3();
            case 4: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_4();
            case 5: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_0()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_1()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_2()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_3()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_4()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond_5()) return false;
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
    private boolean checkCondForDeclaration_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(int declIndex) {
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
     * Executes the action part of the rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0
     */
    private void merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0() {
			module_entity_Action_1.getRegrasAcionadas().add("merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Fun��o da MRE: merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificáveis \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Fun��o MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1
     */
    private String[] identifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1
     *
     * @return the identifiers declared in rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1
     */
    private String[] getDeclaredIdentifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1() {
         return identifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(2L));
    }

    /**
     * Condition 1 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1_cond_1() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(2L));
    }

    /**
     * Condition 2 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 4 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt3"));
    }

    /**
     * Condition 5 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1_cond_5() {
        return (module_entity_Action_1.getRemediation().getId().equals(2L));
    }

    /**
     * Checks whether some conditions of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1_cond(int index) {
        switch (index) {
            case 0: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1_cond_0();
            case 1: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1_cond_1();
            case 2: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1_cond_2();
            case 3: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1_cond_3();
            case 4: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1_cond_4();
            case 5: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1_cond_0()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1_cond_1()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1_cond_2()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1_cond_3()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1_cond_4()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1_cond_5()) return false;
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
    private boolean checkCondForDeclaration_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1(int declIndex) {
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
     * Executes the action part of the rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1
     */
    private void merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1() {
			module_entity_Action_1.getRegrasAcionadas().add("merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Fun��o da MRE: merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificáveis \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Fun��o MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2
     */
    private String[] identifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2
     *
     * @return the identifiers declared in rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2
     */
    private String[] getDeclaredIdentifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2() {
         return identifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(2L));
    }

    /**
     * Condition 1 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2_cond_1() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(2L));
    }

    /**
     * Condition 2 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 4 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt3"));
    }

    /**
     * Condition 5 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2_cond_5() {
        return (module_entity_Action_1.getRemediation().getId().equals(3L));
    }

    /**
     * Checks whether some conditions of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2_cond(int index) {
        switch (index) {
            case 0: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2_cond_0();
            case 1: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2_cond_1();
            case 2: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2_cond_2();
            case 3: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2_cond_3();
            case 4: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2_cond_4();
            case 5: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2_cond_0()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2_cond_1()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2_cond_2()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2_cond_3()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2_cond_4()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2_cond_5()) return false;
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
    private boolean checkCondForDeclaration_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2(int declIndex) {
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
     * Executes the action part of the rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2
     */
    private void merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2() {
			module_entity_Action_1.getRegrasAcionadas().add("merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Fun��o da MRE: merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificáveis \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Fun��o MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3
     */
    private String[] identifiers_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3
     *
     * @return the identifiers declared in rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3
     */
    private String[] getDeclaredIdentifiers_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3() {
         return identifiers_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(3L));
    }

    /**
     * Condition 1 of rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 2 of rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 3 of rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt3"));
    }

    /**
     * Condition 4 of rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3_cond_4() {
        return (module_entity_Action_1.getRemediation().getId().equals(4L));
    }

    /**
     * Checks whether some conditions of rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3_cond(int index) {
        switch (index) {
            case 0: return merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3_cond_0();
            case 1: return merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3_cond_1();
            case 2: return merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3_cond_2();
            case 3: return merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3_cond_3();
            case 4: return merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3_cond_4();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3_cond_0()) return false;
                if (!merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3_cond_1()) return false;
                if (!merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3_cond_2()) return false;
                if (!merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3_cond_3()) return false;
                if (!merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3_cond_4()) return false;
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
    private boolean checkCondForDeclaration_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3(int declIndex) {
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
     * Executes the action part of the rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3
     */
    private void merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3() {
			module_entity_Action_1.getRegrasAcionadas().add("merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Fun��o da MRE: merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Indiretamente identificáveis \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(2L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Fun��o MRE: Restrição de Interpretação");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4
     */
    private String[] identifiers_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4
     *
     * @return the identifiers declared in rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4
     */
    private String[] getDeclaredIdentifiers_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4() {
         return identifiers_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(2L));
    }

    /**
     * Condition 1 of rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4_cond_1() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(1L));
    }

    /**
     * Condition 2 of rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 4 of rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt3"));
    }

    /**
     * Condition 5 of rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4_cond_5() {
        return (module_entity_Action_1.getRemediation().getId().equals(5L));
    }

    /**
     * Checks whether some conditions of rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4_cond(int index) {
        switch (index) {
            case 0: return merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4_cond_0();
            case 1: return merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4_cond_1();
            case 2: return merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4_cond_2();
            case 3: return merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4_cond_3();
            case 4: return merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4_cond_4();
            case 5: return merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4_cond_0()) return false;
                if (!merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4_cond_1()) return false;
                if (!merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4_cond_2()) return false;
                if (!merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4_cond_3()) return false;
                if (!merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4_cond_4()) return false;
                if (!merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4_cond_5()) return false;
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
    private boolean checkCondForDeclaration_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4(int declIndex) {
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
     * Executes the action part of the rule merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4
     */
    private void merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4() {
			module_entity_Action_1.getRegrasAcionadas().add("merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Fun��o da MRE: merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificáveis \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(2L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Fun��o MRE: Restrição de Interpretação");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5
     */
    private String[] identifiers_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5
     *
     * @return the identifiers declared in rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5
     */
    private String[] getDeclaredIdentifiers_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5() {
         return identifiers_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(1L));
    }

    /**
     * Condition 1 of rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 2 of rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 3 of rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt3"));
    }

    /**
     * Condition 4 of rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5_cond_4() {
        return (module_entity_Action_1.getRemediation().getId().equals(5L));
    }

    /**
     * Checks whether some conditions of rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5_cond(int index) {
        switch (index) {
            case 0: return merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5_cond_0();
            case 1: return merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5_cond_1();
            case 2: return merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5_cond_2();
            case 3: return merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5_cond_3();
            case 4: return merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5_cond_4();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5_cond_0()) return false;
                if (!merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5_cond_1()) return false;
                if (!merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5_cond_2()) return false;
                if (!merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5_cond_3()) return false;
                if (!merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5_cond_4()) return false;
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
    private boolean checkCondForDeclaration_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5(int declIndex) {
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
     * Executes the action part of the rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5
     */
    private void merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5() {
			module_entity_Action_1.getRegrasAcionadas().add("merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Fun��o da MRE: merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Interpretação Equivocada \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(1L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Fun��o MRE: Papéis Complementares");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6
     */
    private String[] identifiers_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6
     *
     * @return the identifiers declared in rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6
     */
    private String[] getDeclaredIdentifiers_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6() {
         return identifiers_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(1L));
    }

    /**
     * Condition 1 of rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 2 of rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 3 of rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt3"));
    }

    /**
     * Condition 4 of rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6_cond_4() {
        return (module_entity_Action_1.getRemediation().getId().equals(5L));
    }

    /**
     * Checks whether some conditions of rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6_cond(int index) {
        switch (index) {
            case 0: return merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6_cond_0();
            case 1: return merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6_cond_1();
            case 2: return merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6_cond_2();
            case 3: return merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6_cond_3();
            case 4: return merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6_cond_4();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6_cond_0()) return false;
                if (!merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6_cond_1()) return false;
                if (!merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6_cond_2()) return false;
                if (!merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6_cond_3()) return false;
                if (!merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6_cond_4()) return false;
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
    private boolean checkCondForDeclaration_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6(int declIndex) {
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
     * Executes the action part of the rule merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6
     */
    private void merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6() {
			module_entity_Action_1.getRegrasAcionadas().add("merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Fun��o da MRE: merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Interpretação Equivocada \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(1L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Fun��o MRE: Papéis Complementares");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7
     */
    private String[] identifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7
     *
     * @return the identifiers declared in rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7
     */
    private String[] getDeclaredIdentifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7() {
         return identifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(2L));
    }

    /**
     * Condition 1 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7_cond_1() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(2L));
    }

    /**
     * Condition 2 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 4 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt3"));
    }

    /**
     * Condition 5 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7_cond_5() {
        return (module_entity_Action_1.getRemediation().getId().equals(6L));
    }

    /**
     * Checks whether some conditions of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7_cond(int index) {
        switch (index) {
            case 0: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7_cond_0();
            case 1: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7_cond_1();
            case 2: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7_cond_2();
            case 3: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7_cond_3();
            case 4: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7_cond_4();
            case 5: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7_cond_0()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7_cond_1()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7_cond_2()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7_cond_3()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7_cond_4()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7_cond_5()) return false;
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
    private boolean checkCondForDeclaration_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7(int declIndex) {
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
     * Executes the action part of the rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7
     */
    private void merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7() {
			module_entity_Action_1.getRegrasAcionadas().add("merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Fun��o da MRE: merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificáveis \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Fun��o MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8
     */
    private String[] identifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8
     *
     * @return the identifiers declared in rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8
     */
    private String[] getDeclaredIdentifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8() {
         return identifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(2L));
    }

    /**
     * Condition 1 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8_cond_1() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(2L));
    }

    /**
     * Condition 2 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 4 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt3"));
    }

    /**
     * Condition 5 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8_cond_5() {
        return (module_entity_Action_1.getRemediation().getId().equals(6L));
    }

    /**
     * Checks whether some conditions of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8_cond(int index) {
        switch (index) {
            case 0: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8_cond_0();
            case 1: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8_cond_1();
            case 2: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8_cond_2();
            case 3: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8_cond_3();
            case 4: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8_cond_4();
            case 5: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8_cond_0()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8_cond_1()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8_cond_2()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8_cond_3()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8_cond_4()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8_cond_5()) return false;
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
    private boolean checkCondForDeclaration_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8(int declIndex) {
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
     * Executes the action part of the rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8
     */
    private void merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8() {
			module_entity_Action_1.getRegrasAcionadas().add("merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Fun��o da MRE: merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificáveis \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Fun��o MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9
     */
    private String[] identifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9
     *
     * @return the identifiers declared in rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9
     */
    private String[] getDeclaredIdentifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9() {
         return identifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(2L));
    }

    /**
     * Condition 1 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9_cond_1() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(2L));
    }

    /**
     * Condition 2 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 4 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt3"));
    }

    /**
     * Condition 5 of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9_cond_5() {
        return (module_entity_Action_1.getRemediation().getId().equals(6L));
    }

    /**
     * Checks whether some conditions of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9_cond(int index) {
        switch (index) {
            case 0: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9_cond_0();
            case 1: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9_cond_1();
            case 2: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9_cond_2();
            case 3: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9_cond_3();
            case 4: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9_cond_4();
            case 5: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9_cond_0()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9_cond_1()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9_cond_2()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9_cond_3()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9_cond_4()) return false;
                if (!merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9_cond_5()) return false;
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
    private boolean checkCondForDeclaration_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9(int declIndex) {
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
     * Executes the action part of the rule merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9
     */
    private void merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9() {
			module_entity_Action_1.getRegrasAcionadas().add("merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Fun��o da MRE: merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " \t Tipo de Erro = Diretamente Identificáveis \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Fun��o MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 

// end_rules
	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0",
        "merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1",
        "merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2",
        "merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3",
        "merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4",
        "merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5",
        "merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6",
        "merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7",
        "merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8",
        "merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9"
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
        6,
        6,
        6,
        5,
        6,
        5,
        5,
        6,
        6,
        6
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
            case 0: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0_cond(condIndex);
            case 1: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1_cond(condIndex);
            case 2: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2_cond(condIndex);
            case 3: return merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3_cond(condIndex);
            case 4: return merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4_cond(condIndex);
            case 5: return merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5_cond(condIndex);
            case 6: return merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6_cond(condIndex);
            case 7: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7_cond(condIndex);
            case 8: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8_cond(condIndex);
            case 9: return merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(declIndex);
            case 1: return checkConditionsOnlyOf_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1(declIndex);
            case 2: return checkConditionsOnlyOf_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2(declIndex);
            case 3: return checkConditionsOnlyOf_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3(declIndex);
            case 4: return checkConditionsOnlyOf_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4(declIndex);
            case 5: return checkConditionsOnlyOf_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5(declIndex);
            case 6: return checkConditionsOnlyOf_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6(declIndex);
            case 7: return checkConditionsOnlyOf_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7(declIndex);
            case 8: return checkConditionsOnlyOf_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8(declIndex);
            case 9: return checkConditionsOnlyOf_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9(declIndex);
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
            case 0: return checkCondForDeclaration_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(declIndex);
            case 1: return checkCondForDeclaration_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1(declIndex);
            case 2: return checkCondForDeclaration_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2(declIndex);
            case 3: return checkCondForDeclaration_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3(declIndex);
            case 4: return checkCondForDeclaration_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4(declIndex);
            case 5: return checkCondForDeclaration_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5(declIndex);
            case 6: return checkCondForDeclaration_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6(declIndex);
            case 7: return checkCondForDeclaration_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7(declIndex);
            case 8: return checkCondForDeclaration_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8(declIndex);
            case 9: return checkCondForDeclaration_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9(declIndex);
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
            case 0: return getDeclaredClassName_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(declIndex);
            case 1: return getDeclaredClassName_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1(declIndex);
            case 2: return getDeclaredClassName_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2(declIndex);
            case 3: return getDeclaredClassName_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3(declIndex);
            case 4: return getDeclaredClassName_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4(declIndex);
            case 5: return getDeclaredClassName_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5(declIndex);
            case 6: return getDeclaredClassName_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6(declIndex);
            case 7: return getDeclaredClassName_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7(declIndex);
            case 8: return getDeclaredClassName_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8(declIndex);
            case 9: return getDeclaredClassName_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9(declIndex);
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
            case 0: return getDeclaredClass_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(declIndex);
            case 1: return getDeclaredClass_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1(declIndex);
            case 2: return getDeclaredClass_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2(declIndex);
            case 3: return getDeclaredClass_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3(declIndex);
            case 4: return getDeclaredClass_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4(declIndex);
            case 5: return getDeclaredClass_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5(declIndex);
            case 6: return getDeclaredClass_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6(declIndex);
            case 7: return getDeclaredClass_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7(declIndex);
            case 8: return getDeclaredClass_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8(declIndex);
            case 9: return getDeclaredClass_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9(declIndex);
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
            case 0: merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(); break;
            case 1: merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1(); break;
            case 2: merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2(); break;
            case 3: merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3(); break;
            case 4: merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4(); break;
            case 5: merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5(); break;
            case 6: merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6(); break;
            case 7: merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7(); break;
            case 8: merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8(); break;
            case 9: merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9(); break;
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
            case 0: return getDeclaredIdentifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0();
            case 1: return getDeclaredIdentifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1();
            case 2: return getDeclaredIdentifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2();
            case 3: return getDeclaredIdentifiers_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3();
            case 4: return getDeclaredIdentifiers_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4();
            case 5: return getDeclaredIdentifiers_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5();
            case 6: return getDeclaredIdentifiers_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6();
            case 7: return getDeclaredIdentifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7();
            case 8: return getDeclaredIdentifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8();
            case 9: return getDeclaredIdentifiers_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9();
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
            case 0: setObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(declIndex, value); break;
            case 1: setObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1(declIndex, value); break;
            case 2: setObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2(declIndex, value); break;
            case 3: setObject_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3(declIndex, value); break;
            case 4: setObject_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4(declIndex, value); break;
            case 5: setObject_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5(declIndex, value); break;
            case 6: setObject_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6(declIndex, value); break;
            case 7: setObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7(declIndex, value); break;
            case 8: setObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8(declIndex, value); break;
            case 9: setObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9(declIndex, value); break;
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
            case 0: return getObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(declIndex);
            case 1: return getObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1(declIndex);
            case 2: return getObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2(declIndex);
            case 3: return getObject_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3(declIndex);
            case 4: return getObject_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4(declIndex);
            case 5: return getObject_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5(declIndex);
            case 6: return getObject_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6(declIndex);
            case 7: return getObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7(declIndex);
            case 8: return getObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8(declIndex);
            case 9: return getObject_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9(declIndex);
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
            case 0: return getObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0();
            case 1: return getObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1();
            case 2: return getObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2();
            case 3: return getObjects_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3();
            case 4: return getObjects_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4();
            case 5: return getObjects_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5();
            case 6: return getObjects_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6();
            case 7: return getObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7();
            case 8: return getObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8();
            case 9: return getObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9();
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
            case 0: setObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_1_0(objects); break;
            case 1: setObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_2_1(objects); break;
            case 2: setObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_3_2(objects); break;
            case 3: setObjects_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_4_3(objects); break;
            case 4: setObjects_merfunction_2_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_4(objects); break;
            case 5: setObjects_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_5(objects); break;
            case 6: setObjects_merfunction_1_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_5_6(objects); break;
            case 7: setObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_7(objects); break;
            case 8: setObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_8(objects); break;
            case 9: setObjects_merfunction_3_PATH_1_GOAL_1_COMPONENT_txt3_REMEDIATION_6_9(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private module.entity.Action module_entity_Action_1;
    private module.entity.DBConnect module_entity_DBConnect_1;
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
 * @version 25/05/2015
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
