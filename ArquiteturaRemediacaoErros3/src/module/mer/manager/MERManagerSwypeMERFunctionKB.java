package module.mer.manager;

import javax.swing.JComponent;
import module.entity.Goal;
import module.entity.Action;
import module.entity.WrongAnswer;
import util.Constants;
import module.entity.MERFunction;
import module.entity.MultipleExternalRepresentation;
import module.entity.RuleToHuman;
import module.entity.TypeMER;
import module.entity.DBConnect;
import java.util.ArrayList;

 class Jeops_RuleBase_MERManagerSwypeMERFunctionKB extends jeops.AbstractRuleBase {




	
    /**
     * Identifiers of rule ruleMER_criterion_4_swypemersmerfunction_20
     */
    private String[] identifiers_ruleMER_criterion_4_swypemersmerfunction_20 = {
        "action",
        "lastAction",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_criterion_4_swypemersmerfunction_20
     *
     * @return the identifiers declared in rule ruleMER_criterion_4_swypemersmerfunction_20
     */
    private String[] getDeclaredIdentifiers_ruleMER_criterion_4_swypemersmerfunction_20() {
         return identifiers_ruleMER_criterion_4_swypemersmerfunction_20;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_criterion_4_swypemersmerfunction_20.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_criterion_4_swypemersmerfunction_20(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.Action";
            case 2: return "module.entity.DBConnect";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_criterion_4_swypemersmerfunction_20.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_criterion_4_swypemersmerfunction_20(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.Action.class;
            case 2: return module.entity.DBConnect.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_criterion_4_swypemersmerfunction_20.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_criterion_4_swypemersmerfunction_20(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_Action_2 = (module.entity.Action) value; break;
            case 2: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_criterion_4_swypemersmerfunction_20.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_criterion_4_swypemersmerfunction_20(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_Action_2;
            case 2: return module_entity_DBConnect_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_criterion_4_swypemersmerfunction_20
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_criterion_4_swypemersmerfunction_20() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_Action_2,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_criterion_4_swypemersmerfunction_20
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_criterion_4_swypemersmerfunction_20(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_Action_2 = (module.entity.Action) objects[1];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMER_criterion_4_swypemersmerfunction_20.<p>
     * The original expression was:<br>
     * <code>action.getMerFunction().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_20_cond_0() {
        return (module_entity_Action_1.getMerFunction().getId().equals(2L));
    }

    /**
     * Condition 1 of rule ruleMER_criterion_4_swypemersmerfunction_20.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_20_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(4L));
    }

    /**
     * Condition 2 of rule ruleMER_criterion_4_swypemersmerfunction_20.<p>
     * The original expression was:<br>
     * <code>!lastAction.getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_20_cond_2() {
        return (!module_entity_Action_2.getMer().getId().equals(6L));
    }

    /**
     * Checks whether some conditions of rule ruleMER_criterion_4_swypemersmerfunction_20 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_20_cond(int index) {
        switch (index) {
            case 0: return ruleMER_criterion_4_swypemersmerfunction_20_cond_0();
            case 1: return ruleMER_criterion_4_swypemersmerfunction_20_cond_1();
            case 2: return ruleMER_criterion_4_swypemersmerfunction_20_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_criterion_4_swypemersmerfunction_20 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_criterion_4_swypemersmerfunction_20(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMER_criterion_4_swypemersmerfunction_20_cond_0()) return false;
                if (!ruleMER_criterion_4_swypemersmerfunction_20_cond_1()) return false;
                return true;
            case 1:
                if (!ruleMER_criterion_4_swypemersmerfunction_20_cond_2()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_criterion_4_swypemersmerfunction_20(int declIndex) {
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
     * Executes the action part of the rule ruleMER_criterion_4_swypemersmerfunction_20
     */
    private void ruleMER_criterion_4_swypemersmerfunction_20() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_criterion_4_swypemersmerfunction_2 \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getMerFunction().getId().equals(2L);\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getRemediation().getCriterion().getId().equals(4);\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "!lastAction.getMer().getId().equals(6L);\n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(6L);
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_criterion_4_swypemersmerfunction_2");
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibi��o de MRE 6 - mer 6");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule ruleMER_criterion_4_swypemersmerfunction_21
     */
    private String[] identifiers_ruleMER_criterion_4_swypemersmerfunction_21 = {
        "action",
        "lastAction",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_criterion_4_swypemersmerfunction_21
     *
     * @return the identifiers declared in rule ruleMER_criterion_4_swypemersmerfunction_21
     */
    private String[] getDeclaredIdentifiers_ruleMER_criterion_4_swypemersmerfunction_21() {
         return identifiers_ruleMER_criterion_4_swypemersmerfunction_21;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_criterion_4_swypemersmerfunction_21.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_criterion_4_swypemersmerfunction_21(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.Action";
            case 2: return "module.entity.DBConnect";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_criterion_4_swypemersmerfunction_21.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_criterion_4_swypemersmerfunction_21(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.Action.class;
            case 2: return module.entity.DBConnect.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_criterion_4_swypemersmerfunction_21.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_criterion_4_swypemersmerfunction_21(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_Action_2 = (module.entity.Action) value; break;
            case 2: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_criterion_4_swypemersmerfunction_21.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_criterion_4_swypemersmerfunction_21(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_Action_2;
            case 2: return module_entity_DBConnect_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_criterion_4_swypemersmerfunction_21
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_criterion_4_swypemersmerfunction_21() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_Action_2,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_criterion_4_swypemersmerfunction_21
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_criterion_4_swypemersmerfunction_21(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_Action_2 = (module.entity.Action) objects[1];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMER_criterion_4_swypemersmerfunction_21.<p>
     * The original expression was:<br>
     * <code>action.getMerFunction().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_21_cond_0() {
        return (module_entity_Action_1.getMerFunction().getId().equals(2L));
    }

    /**
     * Condition 1 of rule ruleMER_criterion_4_swypemersmerfunction_21.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_21_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(4L));
    }

    /**
     * Condition 2 of rule ruleMER_criterion_4_swypemersmerfunction_21.<p>
     * The original expression was:<br>
     * <code>!lastAction.getMer().getId().equals(7L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_21_cond_2() {
        return (!module_entity_Action_2.getMer().getId().equals(7L));
    }

    /**
     * Checks whether some conditions of rule ruleMER_criterion_4_swypemersmerfunction_21 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_21_cond(int index) {
        switch (index) {
            case 0: return ruleMER_criterion_4_swypemersmerfunction_21_cond_0();
            case 1: return ruleMER_criterion_4_swypemersmerfunction_21_cond_1();
            case 2: return ruleMER_criterion_4_swypemersmerfunction_21_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_criterion_4_swypemersmerfunction_21 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_criterion_4_swypemersmerfunction_21(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMER_criterion_4_swypemersmerfunction_21_cond_0()) return false;
                if (!ruleMER_criterion_4_swypemersmerfunction_21_cond_1()) return false;
                return true;
            case 1:
                if (!ruleMER_criterion_4_swypemersmerfunction_21_cond_2()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_criterion_4_swypemersmerfunction_21(int declIndex) {
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
     * Executes the action part of the rule ruleMER_criterion_4_swypemersmerfunction_21
     */
    private void ruleMER_criterion_4_swypemersmerfunction_21() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_criterion_4_swypemersmerfunction_2 \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getMerFunction().getId().equals(2L);\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getRemediation().getCriterion().getId().equals(4);\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "!lastAction.getMer().getId().equals(7L);\n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(7L);
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_criterion_4_swypemersmerfunction_2");
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibi��o de MRE 7 - mer 7");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule ruleMER_criterion_4_swypemersmerfunction_22
     */
    private String[] identifiers_ruleMER_criterion_4_swypemersmerfunction_22 = {
        "action",
        "lastAction",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_criterion_4_swypemersmerfunction_22
     *
     * @return the identifiers declared in rule ruleMER_criterion_4_swypemersmerfunction_22
     */
    private String[] getDeclaredIdentifiers_ruleMER_criterion_4_swypemersmerfunction_22() {
         return identifiers_ruleMER_criterion_4_swypemersmerfunction_22;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_criterion_4_swypemersmerfunction_22.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_criterion_4_swypemersmerfunction_22(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.Action";
            case 2: return "module.entity.DBConnect";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_criterion_4_swypemersmerfunction_22.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_criterion_4_swypemersmerfunction_22(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.Action.class;
            case 2: return module.entity.DBConnect.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_criterion_4_swypemersmerfunction_22.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_criterion_4_swypemersmerfunction_22(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_Action_2 = (module.entity.Action) value; break;
            case 2: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_criterion_4_swypemersmerfunction_22.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_criterion_4_swypemersmerfunction_22(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_Action_2;
            case 2: return module_entity_DBConnect_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_criterion_4_swypemersmerfunction_22
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_criterion_4_swypemersmerfunction_22() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_Action_2,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_criterion_4_swypemersmerfunction_22
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_criterion_4_swypemersmerfunction_22(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_Action_2 = (module.entity.Action) objects[1];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMER_criterion_4_swypemersmerfunction_22.<p>
     * The original expression was:<br>
     * <code>action.getMerFunction().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_22_cond_0() {
        return (module_entity_Action_1.getMerFunction().getId().equals(2L));
    }

    /**
     * Condition 1 of rule ruleMER_criterion_4_swypemersmerfunction_22.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_22_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(4L));
    }

    /**
     * Condition 2 of rule ruleMER_criterion_4_swypemersmerfunction_22.<p>
     * The original expression was:<br>
     * <code>!lastAction.getMer().getId().equals(8L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_22_cond_2() {
        return (!module_entity_Action_2.getMer().getId().equals(8L));
    }

    /**
     * Checks whether some conditions of rule ruleMER_criterion_4_swypemersmerfunction_22 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_22_cond(int index) {
        switch (index) {
            case 0: return ruleMER_criterion_4_swypemersmerfunction_22_cond_0();
            case 1: return ruleMER_criterion_4_swypemersmerfunction_22_cond_1();
            case 2: return ruleMER_criterion_4_swypemersmerfunction_22_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_criterion_4_swypemersmerfunction_22 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_criterion_4_swypemersmerfunction_22(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMER_criterion_4_swypemersmerfunction_22_cond_0()) return false;
                if (!ruleMER_criterion_4_swypemersmerfunction_22_cond_1()) return false;
                return true;
            case 1:
                if (!ruleMER_criterion_4_swypemersmerfunction_22_cond_2()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_criterion_4_swypemersmerfunction_22(int declIndex) {
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
     * Executes the action part of the rule ruleMER_criterion_4_swypemersmerfunction_22
     */
    private void ruleMER_criterion_4_swypemersmerfunction_22() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_criterion_4_swypemersmerfunction_2 \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getMerFunction().getId().equals(2L);\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getRemediation().getCriterion().getId().equals(4);\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "!lastAction.getMer().getId().equals(8L);\n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(8L);
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_criterion_4_swypemersmerfunction_2");
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibi��o de MRE 8 - mer 8");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule ruleMER_criterion_4_swypemersmerfunction_23
     */
    private String[] identifiers_ruleMER_criterion_4_swypemersmerfunction_23 = {
        "action",
        "lastAction",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_criterion_4_swypemersmerfunction_23
     *
     * @return the identifiers declared in rule ruleMER_criterion_4_swypemersmerfunction_23
     */
    private String[] getDeclaredIdentifiers_ruleMER_criterion_4_swypemersmerfunction_23() {
         return identifiers_ruleMER_criterion_4_swypemersmerfunction_23;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_criterion_4_swypemersmerfunction_23.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_criterion_4_swypemersmerfunction_23(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.Action";
            case 2: return "module.entity.DBConnect";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_criterion_4_swypemersmerfunction_23.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_criterion_4_swypemersmerfunction_23(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.Action.class;
            case 2: return module.entity.DBConnect.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_criterion_4_swypemersmerfunction_23.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_criterion_4_swypemersmerfunction_23(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_Action_2 = (module.entity.Action) value; break;
            case 2: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_criterion_4_swypemersmerfunction_23.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_criterion_4_swypemersmerfunction_23(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_Action_2;
            case 2: return module_entity_DBConnect_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_criterion_4_swypemersmerfunction_23
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_criterion_4_swypemersmerfunction_23() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_Action_2,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_criterion_4_swypemersmerfunction_23
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_criterion_4_swypemersmerfunction_23(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_Action_2 = (module.entity.Action) objects[1];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMER_criterion_4_swypemersmerfunction_23.<p>
     * The original expression was:<br>
     * <code>action.getMerFunction().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_23_cond_0() {
        return (module_entity_Action_1.getMerFunction().getId().equals(2L));
    }

    /**
     * Condition 1 of rule ruleMER_criterion_4_swypemersmerfunction_23.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_23_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(4L));
    }

    /**
     * Condition 2 of rule ruleMER_criterion_4_swypemersmerfunction_23.<p>
     * The original expression was:<br>
     * <code>!lastAction.getMer().getId().equals(9L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_23_cond_2() {
        return (!module_entity_Action_2.getMer().getId().equals(9L));
    }

    /**
     * Checks whether some conditions of rule ruleMER_criterion_4_swypemersmerfunction_23 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_23_cond(int index) {
        switch (index) {
            case 0: return ruleMER_criterion_4_swypemersmerfunction_23_cond_0();
            case 1: return ruleMER_criterion_4_swypemersmerfunction_23_cond_1();
            case 2: return ruleMER_criterion_4_swypemersmerfunction_23_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_criterion_4_swypemersmerfunction_23 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_criterion_4_swypemersmerfunction_23(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMER_criterion_4_swypemersmerfunction_23_cond_0()) return false;
                if (!ruleMER_criterion_4_swypemersmerfunction_23_cond_1()) return false;
                return true;
            case 1:
                if (!ruleMER_criterion_4_swypemersmerfunction_23_cond_2()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_criterion_4_swypemersmerfunction_23(int declIndex) {
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
     * Executes the action part of the rule ruleMER_criterion_4_swypemersmerfunction_23
     */
    private void ruleMER_criterion_4_swypemersmerfunction_23() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_criterion_4_swypemersmerfunction_2 \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getMerFunction().getId().equals(2L);\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getRemediation().getCriterion().getId().equals(4);\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "!lastAction.getMer().getId().equals(9L);\n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(9L);
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_criterion_4_swypemersmerfunction_2");
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibi��o de MRE 9 - mer 9");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule ruleMER_criterion_4_swypemersmerfunction_24
     */
    private String[] identifiers_ruleMER_criterion_4_swypemersmerfunction_24 = {
        "action",
        "lastAction",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_criterion_4_swypemersmerfunction_24
     *
     * @return the identifiers declared in rule ruleMER_criterion_4_swypemersmerfunction_24
     */
    private String[] getDeclaredIdentifiers_ruleMER_criterion_4_swypemersmerfunction_24() {
         return identifiers_ruleMER_criterion_4_swypemersmerfunction_24;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_criterion_4_swypemersmerfunction_24.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_criterion_4_swypemersmerfunction_24(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.Action";
            case 2: return "module.entity.DBConnect";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_criterion_4_swypemersmerfunction_24.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_criterion_4_swypemersmerfunction_24(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.Action.class;
            case 2: return module.entity.DBConnect.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_criterion_4_swypemersmerfunction_24.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_criterion_4_swypemersmerfunction_24(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_Action_2 = (module.entity.Action) value; break;
            case 2: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_criterion_4_swypemersmerfunction_24.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_criterion_4_swypemersmerfunction_24(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_Action_2;
            case 2: return module_entity_DBConnect_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_criterion_4_swypemersmerfunction_24
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_criterion_4_swypemersmerfunction_24() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_Action_2,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_criterion_4_swypemersmerfunction_24
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_criterion_4_swypemersmerfunction_24(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_Action_2 = (module.entity.Action) objects[1];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMER_criterion_4_swypemersmerfunction_24.<p>
     * The original expression was:<br>
     * <code>action.getMerFunction().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_24_cond_0() {
        return (module_entity_Action_1.getMerFunction().getId().equals(2L));
    }

    /**
     * Condition 1 of rule ruleMER_criterion_4_swypemersmerfunction_24.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_24_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(4L));
    }

    /**
     * Condition 2 of rule ruleMER_criterion_4_swypemersmerfunction_24.<p>
     * The original expression was:<br>
     * <code>!lastAction.getMer().getId().equals(10L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_24_cond_2() {
        return (!module_entity_Action_2.getMer().getId().equals(10L));
    }

    /**
     * Checks whether some conditions of rule ruleMER_criterion_4_swypemersmerfunction_24 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_24_cond(int index) {
        switch (index) {
            case 0: return ruleMER_criterion_4_swypemersmerfunction_24_cond_0();
            case 1: return ruleMER_criterion_4_swypemersmerfunction_24_cond_1();
            case 2: return ruleMER_criterion_4_swypemersmerfunction_24_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_criterion_4_swypemersmerfunction_24 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_criterion_4_swypemersmerfunction_24(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMER_criterion_4_swypemersmerfunction_24_cond_0()) return false;
                if (!ruleMER_criterion_4_swypemersmerfunction_24_cond_1()) return false;
                return true;
            case 1:
                if (!ruleMER_criterion_4_swypemersmerfunction_24_cond_2()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_criterion_4_swypemersmerfunction_24(int declIndex) {
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
     * Executes the action part of the rule ruleMER_criterion_4_swypemersmerfunction_24
     */
    private void ruleMER_criterion_4_swypemersmerfunction_24() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_criterion_4_swypemersmerfunction_2 \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getMerFunction().getId().equals(2L);\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getRemediation().getCriterion().getId().equals(4);\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "!lastAction.getMer().getId().equals(10L);\n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(10L);
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_criterion_4_swypemersmerfunction_2");
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibi��o de MRE 10 - mer 10");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule ruleMER_criterion_4_swypemersmerfunction_25
     */
    private String[] identifiers_ruleMER_criterion_4_swypemersmerfunction_25 = {
        "action",
        "lastAction",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_criterion_4_swypemersmerfunction_25
     *
     * @return the identifiers declared in rule ruleMER_criterion_4_swypemersmerfunction_25
     */
    private String[] getDeclaredIdentifiers_ruleMER_criterion_4_swypemersmerfunction_25() {
         return identifiers_ruleMER_criterion_4_swypemersmerfunction_25;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_criterion_4_swypemersmerfunction_25.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_criterion_4_swypemersmerfunction_25(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.Action";
            case 2: return "module.entity.DBConnect";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_criterion_4_swypemersmerfunction_25.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_criterion_4_swypemersmerfunction_25(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.Action.class;
            case 2: return module.entity.DBConnect.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_criterion_4_swypemersmerfunction_25.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_criterion_4_swypemersmerfunction_25(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_Action_2 = (module.entity.Action) value; break;
            case 2: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_criterion_4_swypemersmerfunction_25.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_criterion_4_swypemersmerfunction_25(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_Action_2;
            case 2: return module_entity_DBConnect_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_criterion_4_swypemersmerfunction_25
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_criterion_4_swypemersmerfunction_25() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_Action_2,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_criterion_4_swypemersmerfunction_25
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_criterion_4_swypemersmerfunction_25(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_Action_2 = (module.entity.Action) objects[1];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMER_criterion_4_swypemersmerfunction_25.<p>
     * The original expression was:<br>
     * <code>action.getMerFunction().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_25_cond_0() {
        return (module_entity_Action_1.getMerFunction().getId().equals(2L));
    }

    /**
     * Condition 1 of rule ruleMER_criterion_4_swypemersmerfunction_25.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_25_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(4L));
    }

    /**
     * Condition 2 of rule ruleMER_criterion_4_swypemersmerfunction_25.<p>
     * The original expression was:<br>
     * <code>!lastAction.getMer().getId().equals(13L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_25_cond_2() {
        return (!module_entity_Action_2.getMer().getId().equals(13L));
    }

    /**
     * Checks whether some conditions of rule ruleMER_criterion_4_swypemersmerfunction_25 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_25_cond(int index) {
        switch (index) {
            case 0: return ruleMER_criterion_4_swypemersmerfunction_25_cond_0();
            case 1: return ruleMER_criterion_4_swypemersmerfunction_25_cond_1();
            case 2: return ruleMER_criterion_4_swypemersmerfunction_25_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_criterion_4_swypemersmerfunction_25 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_criterion_4_swypemersmerfunction_25(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMER_criterion_4_swypemersmerfunction_25_cond_0()) return false;
                if (!ruleMER_criterion_4_swypemersmerfunction_25_cond_1()) return false;
                return true;
            case 1:
                if (!ruleMER_criterion_4_swypemersmerfunction_25_cond_2()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_criterion_4_swypemersmerfunction_25(int declIndex) {
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
     * Executes the action part of the rule ruleMER_criterion_4_swypemersmerfunction_25
     */
    private void ruleMER_criterion_4_swypemersmerfunction_25() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_criterion_4_swypemersmerfunction_2 \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getMerFunction().getId().equals(2L);\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getRemediation().getCriterion().getId().equals(4);\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "!lastAction.getMer().getId().equals(13L);\n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(13L);
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_criterion_4_swypemersmerfunction_2");
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibi��o de MRE 13 - mer 13");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule ruleMER_criterion_4_swypemersmerfunction_26
     */
    private String[] identifiers_ruleMER_criterion_4_swypemersmerfunction_26 = {
        "action",
        "lastAction",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_criterion_4_swypemersmerfunction_26
     *
     * @return the identifiers declared in rule ruleMER_criterion_4_swypemersmerfunction_26
     */
    private String[] getDeclaredIdentifiers_ruleMER_criterion_4_swypemersmerfunction_26() {
         return identifiers_ruleMER_criterion_4_swypemersmerfunction_26;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_criterion_4_swypemersmerfunction_26.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_criterion_4_swypemersmerfunction_26(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.Action";
            case 2: return "module.entity.DBConnect";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_criterion_4_swypemersmerfunction_26.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_criterion_4_swypemersmerfunction_26(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.Action.class;
            case 2: return module.entity.DBConnect.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_criterion_4_swypemersmerfunction_26.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_criterion_4_swypemersmerfunction_26(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_Action_2 = (module.entity.Action) value; break;
            case 2: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_criterion_4_swypemersmerfunction_26.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_criterion_4_swypemersmerfunction_26(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_Action_2;
            case 2: return module_entity_DBConnect_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_criterion_4_swypemersmerfunction_26
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_criterion_4_swypemersmerfunction_26() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_Action_2,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_criterion_4_swypemersmerfunction_26
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_criterion_4_swypemersmerfunction_26(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_Action_2 = (module.entity.Action) objects[1];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMER_criterion_4_swypemersmerfunction_26.<p>
     * The original expression was:<br>
     * <code>action.getMerFunction().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_26_cond_0() {
        return (module_entity_Action_1.getMerFunction().getId().equals(2L));
    }

    /**
     * Condition 1 of rule ruleMER_criterion_4_swypemersmerfunction_26.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_26_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(4L));
    }

    /**
     * Condition 2 of rule ruleMER_criterion_4_swypemersmerfunction_26.<p>
     * The original expression was:<br>
     * <code>!lastAction.getMer().getId().equals(14L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_26_cond_2() {
        return (!module_entity_Action_2.getMer().getId().equals(14L));
    }

    /**
     * Checks whether some conditions of rule ruleMER_criterion_4_swypemersmerfunction_26 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_criterion_4_swypemersmerfunction_26_cond(int index) {
        switch (index) {
            case 0: return ruleMER_criterion_4_swypemersmerfunction_26_cond_0();
            case 1: return ruleMER_criterion_4_swypemersmerfunction_26_cond_1();
            case 2: return ruleMER_criterion_4_swypemersmerfunction_26_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_criterion_4_swypemersmerfunction_26 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_criterion_4_swypemersmerfunction_26(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMER_criterion_4_swypemersmerfunction_26_cond_0()) return false;
                if (!ruleMER_criterion_4_swypemersmerfunction_26_cond_1()) return false;
                return true;
            case 1:
                if (!ruleMER_criterion_4_swypemersmerfunction_26_cond_2()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_criterion_4_swypemersmerfunction_26(int declIndex) {
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
     * Executes the action part of the rule ruleMER_criterion_4_swypemersmerfunction_26
     */
    private void ruleMER_criterion_4_swypemersmerfunction_26() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_criterion_4_swypemersmerfunction_2 \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getMerFunction().getId().equals(2L);\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getRemediation().getCriterion().getId().equals(4);\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "!lastAction.getMer().getId().equals(14L);\n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(14L);
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_criterion_4_swypemersmerfunction_2");
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibi��o de MRE 14 - mer 14");
			flush();

	    }


// -rule-end- 

// end_rules
	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "ruleMER_criterion_4_swypemersmerfunction_20",
        "ruleMER_criterion_4_swypemersmerfunction_21",
        "ruleMER_criterion_4_swypemersmerfunction_22",
        "ruleMER_criterion_4_swypemersmerfunction_23",
        "ruleMER_criterion_4_swypemersmerfunction_24",
        "ruleMER_criterion_4_swypemersmerfunction_25",
        "ruleMER_criterion_4_swypemersmerfunction_26"
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
        3,
        3,
        3,
        3,
        3,
        3,
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
            case 0: return ruleMER_criterion_4_swypemersmerfunction_20_cond(condIndex);
            case 1: return ruleMER_criterion_4_swypemersmerfunction_21_cond(condIndex);
            case 2: return ruleMER_criterion_4_swypemersmerfunction_22_cond(condIndex);
            case 3: return ruleMER_criterion_4_swypemersmerfunction_23_cond(condIndex);
            case 4: return ruleMER_criterion_4_swypemersmerfunction_24_cond(condIndex);
            case 5: return ruleMER_criterion_4_swypemersmerfunction_25_cond(condIndex);
            case 6: return ruleMER_criterion_4_swypemersmerfunction_26_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_ruleMER_criterion_4_swypemersmerfunction_20(declIndex);
            case 1: return checkConditionsOnlyOf_ruleMER_criterion_4_swypemersmerfunction_21(declIndex);
            case 2: return checkConditionsOnlyOf_ruleMER_criterion_4_swypemersmerfunction_22(declIndex);
            case 3: return checkConditionsOnlyOf_ruleMER_criterion_4_swypemersmerfunction_23(declIndex);
            case 4: return checkConditionsOnlyOf_ruleMER_criterion_4_swypemersmerfunction_24(declIndex);
            case 5: return checkConditionsOnlyOf_ruleMER_criterion_4_swypemersmerfunction_25(declIndex);
            case 6: return checkConditionsOnlyOf_ruleMER_criterion_4_swypemersmerfunction_26(declIndex);
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
            case 0: return checkCondForDeclaration_ruleMER_criterion_4_swypemersmerfunction_20(declIndex);
            case 1: return checkCondForDeclaration_ruleMER_criterion_4_swypemersmerfunction_21(declIndex);
            case 2: return checkCondForDeclaration_ruleMER_criterion_4_swypemersmerfunction_22(declIndex);
            case 3: return checkCondForDeclaration_ruleMER_criterion_4_swypemersmerfunction_23(declIndex);
            case 4: return checkCondForDeclaration_ruleMER_criterion_4_swypemersmerfunction_24(declIndex);
            case 5: return checkCondForDeclaration_ruleMER_criterion_4_swypemersmerfunction_25(declIndex);
            case 6: return checkCondForDeclaration_ruleMER_criterion_4_swypemersmerfunction_26(declIndex);
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
            case 0: return getDeclaredClassName_ruleMER_criterion_4_swypemersmerfunction_20(declIndex);
            case 1: return getDeclaredClassName_ruleMER_criterion_4_swypemersmerfunction_21(declIndex);
            case 2: return getDeclaredClassName_ruleMER_criterion_4_swypemersmerfunction_22(declIndex);
            case 3: return getDeclaredClassName_ruleMER_criterion_4_swypemersmerfunction_23(declIndex);
            case 4: return getDeclaredClassName_ruleMER_criterion_4_swypemersmerfunction_24(declIndex);
            case 5: return getDeclaredClassName_ruleMER_criterion_4_swypemersmerfunction_25(declIndex);
            case 6: return getDeclaredClassName_ruleMER_criterion_4_swypemersmerfunction_26(declIndex);
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
            case 0: return getDeclaredClass_ruleMER_criterion_4_swypemersmerfunction_20(declIndex);
            case 1: return getDeclaredClass_ruleMER_criterion_4_swypemersmerfunction_21(declIndex);
            case 2: return getDeclaredClass_ruleMER_criterion_4_swypemersmerfunction_22(declIndex);
            case 3: return getDeclaredClass_ruleMER_criterion_4_swypemersmerfunction_23(declIndex);
            case 4: return getDeclaredClass_ruleMER_criterion_4_swypemersmerfunction_24(declIndex);
            case 5: return getDeclaredClass_ruleMER_criterion_4_swypemersmerfunction_25(declIndex);
            case 6: return getDeclaredClass_ruleMER_criterion_4_swypemersmerfunction_26(declIndex);
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
            case 0: ruleMER_criterion_4_swypemersmerfunction_20(); break;
            case 1: ruleMER_criterion_4_swypemersmerfunction_21(); break;
            case 2: ruleMER_criterion_4_swypemersmerfunction_22(); break;
            case 3: ruleMER_criterion_4_swypemersmerfunction_23(); break;
            case 4: ruleMER_criterion_4_swypemersmerfunction_24(); break;
            case 5: ruleMER_criterion_4_swypemersmerfunction_25(); break;
            case 6: ruleMER_criterion_4_swypemersmerfunction_26(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 7;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_ruleMER_criterion_4_swypemersmerfunction_20();
            case 1: return getDeclaredIdentifiers_ruleMER_criterion_4_swypemersmerfunction_21();
            case 2: return getDeclaredIdentifiers_ruleMER_criterion_4_swypemersmerfunction_22();
            case 3: return getDeclaredIdentifiers_ruleMER_criterion_4_swypemersmerfunction_23();
            case 4: return getDeclaredIdentifiers_ruleMER_criterion_4_swypemersmerfunction_24();
            case 5: return getDeclaredIdentifiers_ruleMER_criterion_4_swypemersmerfunction_25();
            case 6: return getDeclaredIdentifiers_ruleMER_criterion_4_swypemersmerfunction_26();
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
            case 0: setObject_ruleMER_criterion_4_swypemersmerfunction_20(declIndex, value); break;
            case 1: setObject_ruleMER_criterion_4_swypemersmerfunction_21(declIndex, value); break;
            case 2: setObject_ruleMER_criterion_4_swypemersmerfunction_22(declIndex, value); break;
            case 3: setObject_ruleMER_criterion_4_swypemersmerfunction_23(declIndex, value); break;
            case 4: setObject_ruleMER_criterion_4_swypemersmerfunction_24(declIndex, value); break;
            case 5: setObject_ruleMER_criterion_4_swypemersmerfunction_25(declIndex, value); break;
            case 6: setObject_ruleMER_criterion_4_swypemersmerfunction_26(declIndex, value); break;
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
            case 0: return getObject_ruleMER_criterion_4_swypemersmerfunction_20(declIndex);
            case 1: return getObject_ruleMER_criterion_4_swypemersmerfunction_21(declIndex);
            case 2: return getObject_ruleMER_criterion_4_swypemersmerfunction_22(declIndex);
            case 3: return getObject_ruleMER_criterion_4_swypemersmerfunction_23(declIndex);
            case 4: return getObject_ruleMER_criterion_4_swypemersmerfunction_24(declIndex);
            case 5: return getObject_ruleMER_criterion_4_swypemersmerfunction_25(declIndex);
            case 6: return getObject_ruleMER_criterion_4_swypemersmerfunction_26(declIndex);
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
            case 0: return getObjects_ruleMER_criterion_4_swypemersmerfunction_20();
            case 1: return getObjects_ruleMER_criterion_4_swypemersmerfunction_21();
            case 2: return getObjects_ruleMER_criterion_4_swypemersmerfunction_22();
            case 3: return getObjects_ruleMER_criterion_4_swypemersmerfunction_23();
            case 4: return getObjects_ruleMER_criterion_4_swypemersmerfunction_24();
            case 5: return getObjects_ruleMER_criterion_4_swypemersmerfunction_25();
            case 6: return getObjects_ruleMER_criterion_4_swypemersmerfunction_26();
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
            case 0: setObjects_ruleMER_criterion_4_swypemersmerfunction_20(objects); break;
            case 1: setObjects_ruleMER_criterion_4_swypemersmerfunction_21(objects); break;
            case 2: setObjects_ruleMER_criterion_4_swypemersmerfunction_22(objects); break;
            case 3: setObjects_ruleMER_criterion_4_swypemersmerfunction_23(objects); break;
            case 4: setObjects_ruleMER_criterion_4_swypemersmerfunction_24(objects); break;
            case 5: setObjects_ruleMER_criterion_4_swypemersmerfunction_25(objects); break;
            case 6: setObjects_ruleMER_criterion_4_swypemersmerfunction_26(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private module.entity.Action module_entity_Action_1;
    private module.entity.Action module_entity_Action_2;
    private module.entity.DBConnect module_entity_DBConnect_1;
    private module.entity.RuleToHuman module_entity_RuleToHuman_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_MERManagerSwypeMERFunctionKB(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file MERManagerSwypeMERFunctionKB.rules
 *
 * @version 24/04/2015
 */
public class MERManagerSwypeMERFunctionKB extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public MERManagerSwypeMERFunctionKB(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public MERManagerSwypeMERFunctionKB() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_MERManagerSwypeMERFunctionKB(this);
    }

}
