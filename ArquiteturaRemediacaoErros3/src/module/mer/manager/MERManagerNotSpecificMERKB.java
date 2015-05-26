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

 class Jeops_RuleBase_MERManagerNotSpecificMERKB extends jeops.AbstractRuleBase {





	
    /**
     * Identifiers of rule ruleMER_10_remediation_2_criterionnotspecific_2_0
     */
    private String[] identifiers_ruleMER_10_remediation_2_criterionnotspecific_2_0 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_10_remediation_2_criterionnotspecific_2_0
     *
     * @return the identifiers declared in rule ruleMER_10_remediation_2_criterionnotspecific_2_0
     */
    private String[] getDeclaredIdentifiers_ruleMER_10_remediation_2_criterionnotspecific_2_0() {
         return identifiers_ruleMER_10_remediation_2_criterionnotspecific_2_0;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_10_remediation_2_criterionnotspecific_2_0.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_10_remediation_2_criterionnotspecific_2_0(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_10_remediation_2_criterionnotspecific_2_0.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_10_remediation_2_criterionnotspecific_2_0(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_10_remediation_2_criterionnotspecific_2_0.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_10_remediation_2_criterionnotspecific_2_0(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_10_remediation_2_criterionnotspecific_2_0.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_10_remediation_2_criterionnotspecific_2_0(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_10_remediation_2_criterionnotspecific_2_0
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_10_remediation_2_criterionnotspecific_2_0() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_10_remediation_2_criterionnotspecific_2_0
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_10_remediation_2_criterionnotspecific_2_0(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule ruleMER_10_remediation_2_criterionnotspecific_2_0.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(10L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_10_remediation_2_criterionnotspecific_2_0_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(10L));
    }

    /**
     * Condition 1 of rule ruleMER_10_remediation_2_criterionnotspecific_2_0.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_10_remediation_2_criterionnotspecific_2_0_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(2L));
    }

    /**
     * Checks whether some conditions of rule ruleMER_10_remediation_2_criterionnotspecific_2_0 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_10_remediation_2_criterionnotspecific_2_0_cond(int index) {
        switch (index) {
            case 0: return ruleMER_10_remediation_2_criterionnotspecific_2_0_cond_0();
            case 1: return ruleMER_10_remediation_2_criterionnotspecific_2_0_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_10_remediation_2_criterionnotspecific_2_0 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_10_remediation_2_criterionnotspecific_2_0(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMER_10_remediation_2_criterionnotspecific_2_0_cond_0()) return false;
                if (!ruleMER_10_remediation_2_criterionnotspecific_2_0_cond_1()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_10_remediation_2_criterionnotspecific_2_0(int declIndex) {
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
     * Executes the action part of the rule ruleMER_10_remediation_2_criterionnotspecific_2_0
     */
    private void ruleMER_10_remediation_2_criterionnotspecific_2_0() {
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_10_remediation_2_criterionnotspecific_2_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_10_remediation_2_criterionnotspecific_2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getRemediation().getMer().getId().equals(10L);\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getRemediation().getCriterion().getId().equals(2L);\n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(11L);
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_10_remediation_2_criterionnotspecific_2_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 11 - mer 11");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule ruleMER_10_remediation_2_criterionnotspecific_2_1
     */
    private String[] identifiers_ruleMER_10_remediation_2_criterionnotspecific_2_1 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_10_remediation_2_criterionnotspecific_2_1
     *
     * @return the identifiers declared in rule ruleMER_10_remediation_2_criterionnotspecific_2_1
     */
    private String[] getDeclaredIdentifiers_ruleMER_10_remediation_2_criterionnotspecific_2_1() {
         return identifiers_ruleMER_10_remediation_2_criterionnotspecific_2_1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_10_remediation_2_criterionnotspecific_2_1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_10_remediation_2_criterionnotspecific_2_1(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_10_remediation_2_criterionnotspecific_2_1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_10_remediation_2_criterionnotspecific_2_1(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_10_remediation_2_criterionnotspecific_2_1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_10_remediation_2_criterionnotspecific_2_1(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_10_remediation_2_criterionnotspecific_2_1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_10_remediation_2_criterionnotspecific_2_1(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_10_remediation_2_criterionnotspecific_2_1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_10_remediation_2_criterionnotspecific_2_1() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_10_remediation_2_criterionnotspecific_2_1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_10_remediation_2_criterionnotspecific_2_1(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule ruleMER_10_remediation_2_criterionnotspecific_2_1.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(10L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_10_remediation_2_criterionnotspecific_2_1_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(10L));
    }

    /**
     * Condition 1 of rule ruleMER_10_remediation_2_criterionnotspecific_2_1.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_10_remediation_2_criterionnotspecific_2_1_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(2L));
    }

    /**
     * Checks whether some conditions of rule ruleMER_10_remediation_2_criterionnotspecific_2_1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_10_remediation_2_criterionnotspecific_2_1_cond(int index) {
        switch (index) {
            case 0: return ruleMER_10_remediation_2_criterionnotspecific_2_1_cond_0();
            case 1: return ruleMER_10_remediation_2_criterionnotspecific_2_1_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_10_remediation_2_criterionnotspecific_2_1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_10_remediation_2_criterionnotspecific_2_1(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMER_10_remediation_2_criterionnotspecific_2_1_cond_0()) return false;
                if (!ruleMER_10_remediation_2_criterionnotspecific_2_1_cond_1()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_10_remediation_2_criterionnotspecific_2_1(int declIndex) {
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
     * Executes the action part of the rule ruleMER_10_remediation_2_criterionnotspecific_2_1
     */
    private void ruleMER_10_remediation_2_criterionnotspecific_2_1() {
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_10_remediation_2_criterionnotspecific_2_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_10_remediation_2_criterionnotspecific_2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getRemediation().getMer().getId().equals(10L);\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getRemediation().getCriterion().getId().equals(2L);\n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(12L);
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_10_remediation_2_criterionnotspecific_2_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 12 - mer 12");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule ruleMER_10_remediation_2_criterionnotspecific_2_2
     */
    private String[] identifiers_ruleMER_10_remediation_2_criterionnotspecific_2_2 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_10_remediation_2_criterionnotspecific_2_2
     *
     * @return the identifiers declared in rule ruleMER_10_remediation_2_criterionnotspecific_2_2
     */
    private String[] getDeclaredIdentifiers_ruleMER_10_remediation_2_criterionnotspecific_2_2() {
         return identifiers_ruleMER_10_remediation_2_criterionnotspecific_2_2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_10_remediation_2_criterionnotspecific_2_2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_10_remediation_2_criterionnotspecific_2_2(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_10_remediation_2_criterionnotspecific_2_2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_10_remediation_2_criterionnotspecific_2_2(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_10_remediation_2_criterionnotspecific_2_2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_10_remediation_2_criterionnotspecific_2_2(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_10_remediation_2_criterionnotspecific_2_2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_10_remediation_2_criterionnotspecific_2_2(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_10_remediation_2_criterionnotspecific_2_2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_10_remediation_2_criterionnotspecific_2_2() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_10_remediation_2_criterionnotspecific_2_2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_10_remediation_2_criterionnotspecific_2_2(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule ruleMER_10_remediation_2_criterionnotspecific_2_2.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(10L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_10_remediation_2_criterionnotspecific_2_2_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(10L));
    }

    /**
     * Condition 1 of rule ruleMER_10_remediation_2_criterionnotspecific_2_2.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_10_remediation_2_criterionnotspecific_2_2_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(2L));
    }

    /**
     * Checks whether some conditions of rule ruleMER_10_remediation_2_criterionnotspecific_2_2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_10_remediation_2_criterionnotspecific_2_2_cond(int index) {
        switch (index) {
            case 0: return ruleMER_10_remediation_2_criterionnotspecific_2_2_cond_0();
            case 1: return ruleMER_10_remediation_2_criterionnotspecific_2_2_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_10_remediation_2_criterionnotspecific_2_2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_10_remediation_2_criterionnotspecific_2_2(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMER_10_remediation_2_criterionnotspecific_2_2_cond_0()) return false;
                if (!ruleMER_10_remediation_2_criterionnotspecific_2_2_cond_1()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_10_remediation_2_criterionnotspecific_2_2(int declIndex) {
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
     * Executes the action part of the rule ruleMER_10_remediation_2_criterionnotspecific_2_2
     */
    private void ruleMER_10_remediation_2_criterionnotspecific_2_2() {
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_10_remediation_2_criterionnotspecific_2_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_10_remediation_2_criterionnotspecific_2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getRemediation().getMer().getId().equals(10L);\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getRemediation().getCriterion().getId().equals(2L);\n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(13L);
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_10_remediation_2_criterionnotspecific_2_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 13 - mer 13");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule ruleMER_10_remediation_2_criterionnotspecific_2_3
     */
    private String[] identifiers_ruleMER_10_remediation_2_criterionnotspecific_2_3 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_10_remediation_2_criterionnotspecific_2_3
     *
     * @return the identifiers declared in rule ruleMER_10_remediation_2_criterionnotspecific_2_3
     */
    private String[] getDeclaredIdentifiers_ruleMER_10_remediation_2_criterionnotspecific_2_3() {
         return identifiers_ruleMER_10_remediation_2_criterionnotspecific_2_3;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_10_remediation_2_criterionnotspecific_2_3.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_10_remediation_2_criterionnotspecific_2_3(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_10_remediation_2_criterionnotspecific_2_3.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_10_remediation_2_criterionnotspecific_2_3(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_10_remediation_2_criterionnotspecific_2_3.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_10_remediation_2_criterionnotspecific_2_3(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_10_remediation_2_criterionnotspecific_2_3.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_10_remediation_2_criterionnotspecific_2_3(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_10_remediation_2_criterionnotspecific_2_3
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_10_remediation_2_criterionnotspecific_2_3() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_10_remediation_2_criterionnotspecific_2_3
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_10_remediation_2_criterionnotspecific_2_3(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule ruleMER_10_remediation_2_criterionnotspecific_2_3.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(10L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_10_remediation_2_criterionnotspecific_2_3_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(10L));
    }

    /**
     * Condition 1 of rule ruleMER_10_remediation_2_criterionnotspecific_2_3.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_10_remediation_2_criterionnotspecific_2_3_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(2L));
    }

    /**
     * Checks whether some conditions of rule ruleMER_10_remediation_2_criterionnotspecific_2_3 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_10_remediation_2_criterionnotspecific_2_3_cond(int index) {
        switch (index) {
            case 0: return ruleMER_10_remediation_2_criterionnotspecific_2_3_cond_0();
            case 1: return ruleMER_10_remediation_2_criterionnotspecific_2_3_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_10_remediation_2_criterionnotspecific_2_3 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_10_remediation_2_criterionnotspecific_2_3(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMER_10_remediation_2_criterionnotspecific_2_3_cond_0()) return false;
                if (!ruleMER_10_remediation_2_criterionnotspecific_2_3_cond_1()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_10_remediation_2_criterionnotspecific_2_3(int declIndex) {
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
     * Executes the action part of the rule ruleMER_10_remediation_2_criterionnotspecific_2_3
     */
    private void ruleMER_10_remediation_2_criterionnotspecific_2_3() {
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_10_remediation_2_criterionnotspecific_2_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_10_remediation_2_criterionnotspecific_2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getRemediation().getMer().getId().equals(10L);\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getRemediation().getCriterion().getId().equals(2L);\n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(14L);
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_10_remediation_2_criterionnotspecific_2_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 14 - mer 14");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule ruleMER_10_remediation_2_criterionnotspecific_2_4
     */
    private String[] identifiers_ruleMER_10_remediation_2_criterionnotspecific_2_4 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_10_remediation_2_criterionnotspecific_2_4
     *
     * @return the identifiers declared in rule ruleMER_10_remediation_2_criterionnotspecific_2_4
     */
    private String[] getDeclaredIdentifiers_ruleMER_10_remediation_2_criterionnotspecific_2_4() {
         return identifiers_ruleMER_10_remediation_2_criterionnotspecific_2_4;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_10_remediation_2_criterionnotspecific_2_4.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_10_remediation_2_criterionnotspecific_2_4(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_10_remediation_2_criterionnotspecific_2_4.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_10_remediation_2_criterionnotspecific_2_4(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_10_remediation_2_criterionnotspecific_2_4.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_10_remediation_2_criterionnotspecific_2_4(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_10_remediation_2_criterionnotspecific_2_4.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_10_remediation_2_criterionnotspecific_2_4(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_10_remediation_2_criterionnotspecific_2_4
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_10_remediation_2_criterionnotspecific_2_4() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_10_remediation_2_criterionnotspecific_2_4
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_10_remediation_2_criterionnotspecific_2_4(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule ruleMER_10_remediation_2_criterionnotspecific_2_4.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(10L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_10_remediation_2_criterionnotspecific_2_4_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(10L));
    }

    /**
     * Condition 1 of rule ruleMER_10_remediation_2_criterionnotspecific_2_4.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_10_remediation_2_criterionnotspecific_2_4_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(2L));
    }

    /**
     * Checks whether some conditions of rule ruleMER_10_remediation_2_criterionnotspecific_2_4 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_10_remediation_2_criterionnotspecific_2_4_cond(int index) {
        switch (index) {
            case 0: return ruleMER_10_remediation_2_criterionnotspecific_2_4_cond_0();
            case 1: return ruleMER_10_remediation_2_criterionnotspecific_2_4_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_10_remediation_2_criterionnotspecific_2_4 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_10_remediation_2_criterionnotspecific_2_4(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMER_10_remediation_2_criterionnotspecific_2_4_cond_0()) return false;
                if (!ruleMER_10_remediation_2_criterionnotspecific_2_4_cond_1()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_10_remediation_2_criterionnotspecific_2_4(int declIndex) {
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
     * Executes the action part of the rule ruleMER_10_remediation_2_criterionnotspecific_2_4
     */
    private void ruleMER_10_remediation_2_criterionnotspecific_2_4() {
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_10_remediation_2_criterionnotspecific_2_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_10_remediation_2_criterionnotspecific_2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getRemediation().getMer().getId().equals(10L);\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "action.getRemediation().getCriterion().getId().equals(2L);\n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(15L);
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_10_remediation_2_criterionnotspecific_2_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 15 - mer 15");
			flush();

	    }


// -rule-end- 

// end_rules
	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "ruleMER_10_remediation_2_criterionnotspecific_2_0",
        "ruleMER_10_remediation_2_criterionnotspecific_2_1",
        "ruleMER_10_remediation_2_criterionnotspecific_2_2",
        "ruleMER_10_remediation_2_criterionnotspecific_2_3",
        "ruleMER_10_remediation_2_criterionnotspecific_2_4"
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
        2,
        2,
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
            case 0: return ruleMER_10_remediation_2_criterionnotspecific_2_0_cond(condIndex);
            case 1: return ruleMER_10_remediation_2_criterionnotspecific_2_1_cond(condIndex);
            case 2: return ruleMER_10_remediation_2_criterionnotspecific_2_2_cond(condIndex);
            case 3: return ruleMER_10_remediation_2_criterionnotspecific_2_3_cond(condIndex);
            case 4: return ruleMER_10_remediation_2_criterionnotspecific_2_4_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_ruleMER_10_remediation_2_criterionnotspecific_2_0(declIndex);
            case 1: return checkConditionsOnlyOf_ruleMER_10_remediation_2_criterionnotspecific_2_1(declIndex);
            case 2: return checkConditionsOnlyOf_ruleMER_10_remediation_2_criterionnotspecific_2_2(declIndex);
            case 3: return checkConditionsOnlyOf_ruleMER_10_remediation_2_criterionnotspecific_2_3(declIndex);
            case 4: return checkConditionsOnlyOf_ruleMER_10_remediation_2_criterionnotspecific_2_4(declIndex);
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
            case 0: return checkCondForDeclaration_ruleMER_10_remediation_2_criterionnotspecific_2_0(declIndex);
            case 1: return checkCondForDeclaration_ruleMER_10_remediation_2_criterionnotspecific_2_1(declIndex);
            case 2: return checkCondForDeclaration_ruleMER_10_remediation_2_criterionnotspecific_2_2(declIndex);
            case 3: return checkCondForDeclaration_ruleMER_10_remediation_2_criterionnotspecific_2_3(declIndex);
            case 4: return checkCondForDeclaration_ruleMER_10_remediation_2_criterionnotspecific_2_4(declIndex);
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
            case 0: return getDeclaredClassName_ruleMER_10_remediation_2_criterionnotspecific_2_0(declIndex);
            case 1: return getDeclaredClassName_ruleMER_10_remediation_2_criterionnotspecific_2_1(declIndex);
            case 2: return getDeclaredClassName_ruleMER_10_remediation_2_criterionnotspecific_2_2(declIndex);
            case 3: return getDeclaredClassName_ruleMER_10_remediation_2_criterionnotspecific_2_3(declIndex);
            case 4: return getDeclaredClassName_ruleMER_10_remediation_2_criterionnotspecific_2_4(declIndex);
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
            case 0: return getDeclaredClass_ruleMER_10_remediation_2_criterionnotspecific_2_0(declIndex);
            case 1: return getDeclaredClass_ruleMER_10_remediation_2_criterionnotspecific_2_1(declIndex);
            case 2: return getDeclaredClass_ruleMER_10_remediation_2_criterionnotspecific_2_2(declIndex);
            case 3: return getDeclaredClass_ruleMER_10_remediation_2_criterionnotspecific_2_3(declIndex);
            case 4: return getDeclaredClass_ruleMER_10_remediation_2_criterionnotspecific_2_4(declIndex);
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
            case 0: ruleMER_10_remediation_2_criterionnotspecific_2_0(); break;
            case 1: ruleMER_10_remediation_2_criterionnotspecific_2_1(); break;
            case 2: ruleMER_10_remediation_2_criterionnotspecific_2_2(); break;
            case 3: ruleMER_10_remediation_2_criterionnotspecific_2_3(); break;
            case 4: ruleMER_10_remediation_2_criterionnotspecific_2_4(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 5;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_ruleMER_10_remediation_2_criterionnotspecific_2_0();
            case 1: return getDeclaredIdentifiers_ruleMER_10_remediation_2_criterionnotspecific_2_1();
            case 2: return getDeclaredIdentifiers_ruleMER_10_remediation_2_criterionnotspecific_2_2();
            case 3: return getDeclaredIdentifiers_ruleMER_10_remediation_2_criterionnotspecific_2_3();
            case 4: return getDeclaredIdentifiers_ruleMER_10_remediation_2_criterionnotspecific_2_4();
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
            case 0: setObject_ruleMER_10_remediation_2_criterionnotspecific_2_0(declIndex, value); break;
            case 1: setObject_ruleMER_10_remediation_2_criterionnotspecific_2_1(declIndex, value); break;
            case 2: setObject_ruleMER_10_remediation_2_criterionnotspecific_2_2(declIndex, value); break;
            case 3: setObject_ruleMER_10_remediation_2_criterionnotspecific_2_3(declIndex, value); break;
            case 4: setObject_ruleMER_10_remediation_2_criterionnotspecific_2_4(declIndex, value); break;
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
            case 0: return getObject_ruleMER_10_remediation_2_criterionnotspecific_2_0(declIndex);
            case 1: return getObject_ruleMER_10_remediation_2_criterionnotspecific_2_1(declIndex);
            case 2: return getObject_ruleMER_10_remediation_2_criterionnotspecific_2_2(declIndex);
            case 3: return getObject_ruleMER_10_remediation_2_criterionnotspecific_2_3(declIndex);
            case 4: return getObject_ruleMER_10_remediation_2_criterionnotspecific_2_4(declIndex);
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
            case 0: return getObjects_ruleMER_10_remediation_2_criterionnotspecific_2_0();
            case 1: return getObjects_ruleMER_10_remediation_2_criterionnotspecific_2_1();
            case 2: return getObjects_ruleMER_10_remediation_2_criterionnotspecific_2_2();
            case 3: return getObjects_ruleMER_10_remediation_2_criterionnotspecific_2_3();
            case 4: return getObjects_ruleMER_10_remediation_2_criterionnotspecific_2_4();
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
            case 0: setObjects_ruleMER_10_remediation_2_criterionnotspecific_2_0(objects); break;
            case 1: setObjects_ruleMER_10_remediation_2_criterionnotspecific_2_1(objects); break;
            case 2: setObjects_ruleMER_10_remediation_2_criterionnotspecific_2_2(objects); break;
            case 3: setObjects_ruleMER_10_remediation_2_criterionnotspecific_2_3(objects); break;
            case 4: setObjects_ruleMER_10_remediation_2_criterionnotspecific_2_4(objects); break;
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
    public Jeops_RuleBase_MERManagerNotSpecificMERKB(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file MERManagerNotSpecificMERKB.rules
 *
 * @version 25/05/2015
 */
public class MERManagerNotSpecificMERKB extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public MERManagerNotSpecificMERKB(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public MERManagerNotSpecificMERKB() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_MERManagerNotSpecificMERKB(this);
    }

}
