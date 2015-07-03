package module.mer.manager;

import javax.swing.JComponent;
import module.entity.Goal;
import module.entity.Action;
import module.entity.WrongAnswer;
import util.Constants;
import module.entity.MultipleExternalRepresentation;
import module.entity.RuleToHuman;
import module.entity.TypeMER;
import module.entity.DBConnect;
import java.util.ArrayList;

 class Jeops_RuleBase_MERManagerSpecificMERKB extends jeops.AbstractRuleBase {






	
    /**
     * Identifiers of rule regraMRE_1_REMEDIACAO_1_criterion_1_0
     */
    private String[] identifiers_regraMRE_1_REMEDIACAO_1_criterion_1_0 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_1_REMEDIACAO_1_criterion_1_0
     *
     * @return the identifiers declared in rule regraMRE_1_REMEDIACAO_1_criterion_1_0
     */
    private String[] getDeclaredIdentifiers_regraMRE_1_REMEDIACAO_1_criterion_1_0() {
         return identifiers_regraMRE_1_REMEDIACAO_1_criterion_1_0;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_1_REMEDIACAO_1_criterion_1_0.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_1_REMEDIACAO_1_criterion_1_0(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_1_REMEDIACAO_1_criterion_1_0.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_1_REMEDIACAO_1_criterion_1_0(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_1_REMEDIACAO_1_criterion_1_0.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_1_REMEDIACAO_1_criterion_1_0(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_1_REMEDIACAO_1_criterion_1_0.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_1_REMEDIACAO_1_criterion_1_0(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_1_REMEDIACAO_1_criterion_1_0
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_1_REMEDIACAO_1_criterion_1_0() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_1_REMEDIACAO_1_criterion_1_0
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_1_REMEDIACAO_1_criterion_1_0(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_1_REMEDIACAO_1_criterion_1_0.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_1_criterion_1_0_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(1L));
    }

    /**
     * Condition 1 of rule regraMRE_1_REMEDIACAO_1_criterion_1_0.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_1_criterion_1_0_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_1_REMEDIACAO_1_criterion_1_0 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_1_criterion_1_0_cond(int index) {
        switch (index) {
            case 0: return regraMRE_1_REMEDIACAO_1_criterion_1_0_cond_0();
            case 1: return regraMRE_1_REMEDIACAO_1_criterion_1_0_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_1_REMEDIACAO_1_criterion_1_0 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_1_REMEDIACAO_1_criterion_1_0(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_1_REMEDIACAO_1_criterion_1_0_cond_0()) return false;
                if (!regraMRE_1_REMEDIACAO_1_criterion_1_0_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_1_REMEDIACAO_1_criterion_1_0(int declIndex) {
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
     * Executes the action part of the rule regraMRE_1_REMEDIACAO_1_criterion_1_0
     */
    private void regraMRE_1_REMEDIACAO_1_criterion_1_0() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_1_REMEDIACAO_1_criterion_1_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_1_REMEDIACAO_1_criterion_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"MRE específica para o erro\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(1L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 1\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_1_REMEDIACAO_1_criterion_1_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 1 - MRE 1");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_1_REMEDIACAO_2_criterion_1_1
     */
    private String[] identifiers_regraMRE_1_REMEDIACAO_2_criterion_1_1 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_1_REMEDIACAO_2_criterion_1_1
     *
     * @return the identifiers declared in rule regraMRE_1_REMEDIACAO_2_criterion_1_1
     */
    private String[] getDeclaredIdentifiers_regraMRE_1_REMEDIACAO_2_criterion_1_1() {
         return identifiers_regraMRE_1_REMEDIACAO_2_criterion_1_1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_1_REMEDIACAO_2_criterion_1_1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_1_REMEDIACAO_2_criterion_1_1(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_1_REMEDIACAO_2_criterion_1_1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_1_REMEDIACAO_2_criterion_1_1(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_1_REMEDIACAO_2_criterion_1_1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_1_REMEDIACAO_2_criterion_1_1(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_1_REMEDIACAO_2_criterion_1_1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_1_REMEDIACAO_2_criterion_1_1(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_1_REMEDIACAO_2_criterion_1_1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_1_REMEDIACAO_2_criterion_1_1() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_1_REMEDIACAO_2_criterion_1_1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_1_REMEDIACAO_2_criterion_1_1(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_1_REMEDIACAO_2_criterion_1_1.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_2_criterion_1_1_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(1L));
    }

    /**
     * Condition 1 of rule regraMRE_1_REMEDIACAO_2_criterion_1_1.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_2_criterion_1_1_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_1_REMEDIACAO_2_criterion_1_1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_2_criterion_1_1_cond(int index) {
        switch (index) {
            case 0: return regraMRE_1_REMEDIACAO_2_criterion_1_1_cond_0();
            case 1: return regraMRE_1_REMEDIACAO_2_criterion_1_1_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_1_REMEDIACAO_2_criterion_1_1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_1_REMEDIACAO_2_criterion_1_1(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_1_REMEDIACAO_2_criterion_1_1_cond_0()) return false;
                if (!regraMRE_1_REMEDIACAO_2_criterion_1_1_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_1_REMEDIACAO_2_criterion_1_1(int declIndex) {
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
     * Executes the action part of the rule regraMRE_1_REMEDIACAO_2_criterion_1_1
     */
    private void regraMRE_1_REMEDIACAO_2_criterion_1_1() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_1_REMEDIACAO_2_criterion_1_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_1_REMEDIACAO_2_criterion_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"MRE específica para o erro\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(1L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 1\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_1_REMEDIACAO_2_criterion_1_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 1 - MRE 1");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_2_REMEDIACAO_3_criterion_1_2
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_3_criterion_1_2 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_3_criterion_1_2
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_3_criterion_1_2
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_3_criterion_1_2() {
         return identifiers_regraMRE_2_REMEDIACAO_3_criterion_1_2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_3_criterion_1_2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_3_criterion_1_2(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_3_criterion_1_2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_3_criterion_1_2(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_3_criterion_1_2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_3_criterion_1_2(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_3_criterion_1_2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_3_criterion_1_2(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_3_criterion_1_2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_3_criterion_1_2() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_3_criterion_1_2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_3_criterion_1_2(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_3_criterion_1_2.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_3_criterion_1_2_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_3_criterion_1_2.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_3_criterion_1_2_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_3_criterion_1_2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_3_criterion_1_2_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_3_criterion_1_2_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_3_criterion_1_2_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_3_criterion_1_2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_3_criterion_1_2(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_3_criterion_1_2_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_3_criterion_1_2_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_3_criterion_1_2(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_3_criterion_1_2
     */
    private void regraMRE_2_REMEDIACAO_3_criterion_1_2() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_2_REMEDIACAO_3_criterion_1_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_2_REMEDIACAO_3_criterion_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 2\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"MRE específica para o erro\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(2L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 2\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_2_REMEDIACAO_3_criterion_1_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 2 - MRE 2");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_2_REMEDIACAO_4_criterion_1_3
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_4_criterion_1_3 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_4_criterion_1_3
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_4_criterion_1_3
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_4_criterion_1_3() {
         return identifiers_regraMRE_2_REMEDIACAO_4_criterion_1_3;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_4_criterion_1_3.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_4_criterion_1_3(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_4_criterion_1_3.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_4_criterion_1_3(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_4_criterion_1_3.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_4_criterion_1_3(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_4_criterion_1_3.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_4_criterion_1_3(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_4_criterion_1_3
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_4_criterion_1_3() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_4_criterion_1_3
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_4_criterion_1_3(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_4_criterion_1_3.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_4_criterion_1_3_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_4_criterion_1_3.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_4_criterion_1_3_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_4_criterion_1_3 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_4_criterion_1_3_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_4_criterion_1_3_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_4_criterion_1_3_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_4_criterion_1_3 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_4_criterion_1_3(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_4_criterion_1_3_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_4_criterion_1_3_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_4_criterion_1_3(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_4_criterion_1_3
     */
    private void regraMRE_2_REMEDIACAO_4_criterion_1_3() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_2_REMEDIACAO_4_criterion_1_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_2_REMEDIACAO_4_criterion_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 2\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"MRE específica para o erro\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(2L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 2\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_2_REMEDIACAO_4_criterion_1_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 2 - MRE 2");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_2_REMEDIACAO_5_criterion_1_4
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_5_criterion_1_4 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_5_criterion_1_4
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_5_criterion_1_4
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_5_criterion_1_4() {
         return identifiers_regraMRE_2_REMEDIACAO_5_criterion_1_4;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_5_criterion_1_4.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_5_criterion_1_4(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_5_criterion_1_4.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_5_criterion_1_4(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_5_criterion_1_4.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_5_criterion_1_4(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_5_criterion_1_4.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_5_criterion_1_4(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_5_criterion_1_4
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_5_criterion_1_4() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_5_criterion_1_4
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_5_criterion_1_4(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_5_criterion_1_4.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_5_criterion_1_4_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_5_criterion_1_4.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_5_criterion_1_4_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_5_criterion_1_4 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_5_criterion_1_4_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_5_criterion_1_4_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_5_criterion_1_4_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_5_criterion_1_4 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_5_criterion_1_4(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_5_criterion_1_4_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_5_criterion_1_4_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_5_criterion_1_4(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_5_criterion_1_4
     */
    private void regraMRE_2_REMEDIACAO_5_criterion_1_4() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_2_REMEDIACAO_5_criterion_1_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_2_REMEDIACAO_5_criterion_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 2\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"MRE específica para o erro\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(2L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 2\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_2_REMEDIACAO_5_criterion_1_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 2 - MRE 2");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_2_REMEDIACAO_6_criterion_1_5
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_6_criterion_1_5 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_6_criterion_1_5
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_6_criterion_1_5
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_6_criterion_1_5() {
         return identifiers_regraMRE_2_REMEDIACAO_6_criterion_1_5;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_6_criterion_1_5.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_6_criterion_1_5(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_6_criterion_1_5.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_6_criterion_1_5(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_6_criterion_1_5.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_6_criterion_1_5(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_6_criterion_1_5.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_6_criterion_1_5(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_6_criterion_1_5
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_6_criterion_1_5() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_6_criterion_1_5
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_6_criterion_1_5(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_6_criterion_1_5.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_6_criterion_1_5_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_6_criterion_1_5.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_6_criterion_1_5_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_6_criterion_1_5 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_6_criterion_1_5_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_6_criterion_1_5_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_6_criterion_1_5_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_6_criterion_1_5 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_6_criterion_1_5(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_6_criterion_1_5_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_6_criterion_1_5_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_6_criterion_1_5(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_6_criterion_1_5
     */
    private void regraMRE_2_REMEDIACAO_6_criterion_1_5() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_2_REMEDIACAO_6_criterion_1_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_2_REMEDIACAO_6_criterion_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 2\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"MRE específica para o erro\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(2L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 2\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_2_REMEDIACAO_6_criterion_1_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 2 - MRE 2");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_2_REMEDIACAO_7_criterion_1_6
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_7_criterion_1_6 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_7_criterion_1_6
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_7_criterion_1_6
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_7_criterion_1_6() {
         return identifiers_regraMRE_2_REMEDIACAO_7_criterion_1_6;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_7_criterion_1_6.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_7_criterion_1_6(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_7_criterion_1_6.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_7_criterion_1_6(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_7_criterion_1_6.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_7_criterion_1_6(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_7_criterion_1_6.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_7_criterion_1_6(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_7_criterion_1_6
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_7_criterion_1_6() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_7_criterion_1_6
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_7_criterion_1_6(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_7_criterion_1_6.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_7_criterion_1_6_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_7_criterion_1_6.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_7_criterion_1_6_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_7_criterion_1_6 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_7_criterion_1_6_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_7_criterion_1_6_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_7_criterion_1_6_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_7_criterion_1_6 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_7_criterion_1_6(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_7_criterion_1_6_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_7_criterion_1_6_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_7_criterion_1_6(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_7_criterion_1_6
     */
    private void regraMRE_2_REMEDIACAO_7_criterion_1_6() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_2_REMEDIACAO_7_criterion_1_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_2_REMEDIACAO_7_criterion_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 2\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"MRE específica para o erro\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(2L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 2\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_2_REMEDIACAO_7_criterion_1_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 2 - MRE 2");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_4_REMEDIACAO_8_criterion_1_7
     */
    private String[] identifiers_regraMRE_4_REMEDIACAO_8_criterion_1_7 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_4_REMEDIACAO_8_criterion_1_7
     *
     * @return the identifiers declared in rule regraMRE_4_REMEDIACAO_8_criterion_1_7
     */
    private String[] getDeclaredIdentifiers_regraMRE_4_REMEDIACAO_8_criterion_1_7() {
         return identifiers_regraMRE_4_REMEDIACAO_8_criterion_1_7;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_4_REMEDIACAO_8_criterion_1_7.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_4_REMEDIACAO_8_criterion_1_7(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_4_REMEDIACAO_8_criterion_1_7.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_4_REMEDIACAO_8_criterion_1_7(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_4_REMEDIACAO_8_criterion_1_7.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_4_REMEDIACAO_8_criterion_1_7(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_4_REMEDIACAO_8_criterion_1_7.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_4_REMEDIACAO_8_criterion_1_7(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_4_REMEDIACAO_8_criterion_1_7
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_4_REMEDIACAO_8_criterion_1_7() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_4_REMEDIACAO_8_criterion_1_7
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_4_REMEDIACAO_8_criterion_1_7(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_4_REMEDIACAO_8_criterion_1_7.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_4_REMEDIACAO_8_criterion_1_7_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(4L));
    }

    /**
     * Condition 1 of rule regraMRE_4_REMEDIACAO_8_criterion_1_7.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_4_REMEDIACAO_8_criterion_1_7_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_4_REMEDIACAO_8_criterion_1_7 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_4_REMEDIACAO_8_criterion_1_7_cond(int index) {
        switch (index) {
            case 0: return regraMRE_4_REMEDIACAO_8_criterion_1_7_cond_0();
            case 1: return regraMRE_4_REMEDIACAO_8_criterion_1_7_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_4_REMEDIACAO_8_criterion_1_7 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_4_REMEDIACAO_8_criterion_1_7(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_4_REMEDIACAO_8_criterion_1_7_cond_0()) return false;
                if (!regraMRE_4_REMEDIACAO_8_criterion_1_7_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_4_REMEDIACAO_8_criterion_1_7(int declIndex) {
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
     * Executes the action part of the rule regraMRE_4_REMEDIACAO_8_criterion_1_7
     */
    private void regraMRE_4_REMEDIACAO_8_criterion_1_7() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_4_REMEDIACAO_8_criterion_1_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_4_REMEDIACAO_8_criterion_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 4\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"MRE específica para o erro\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(4L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 4\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_4_REMEDIACAO_8_criterion_1_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 4 - MRE 4");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_4_REMEDIACAO_9_criterion_1_8
     */
    private String[] identifiers_regraMRE_4_REMEDIACAO_9_criterion_1_8 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_4_REMEDIACAO_9_criterion_1_8
     *
     * @return the identifiers declared in rule regraMRE_4_REMEDIACAO_9_criterion_1_8
     */
    private String[] getDeclaredIdentifiers_regraMRE_4_REMEDIACAO_9_criterion_1_8() {
         return identifiers_regraMRE_4_REMEDIACAO_9_criterion_1_8;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_4_REMEDIACAO_9_criterion_1_8.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_4_REMEDIACAO_9_criterion_1_8(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_4_REMEDIACAO_9_criterion_1_8.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_4_REMEDIACAO_9_criterion_1_8(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_4_REMEDIACAO_9_criterion_1_8.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_4_REMEDIACAO_9_criterion_1_8(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_4_REMEDIACAO_9_criterion_1_8.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_4_REMEDIACAO_9_criterion_1_8(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_4_REMEDIACAO_9_criterion_1_8
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_4_REMEDIACAO_9_criterion_1_8() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_4_REMEDIACAO_9_criterion_1_8
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_4_REMEDIACAO_9_criterion_1_8(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_4_REMEDIACAO_9_criterion_1_8.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_4_REMEDIACAO_9_criterion_1_8_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(4L));
    }

    /**
     * Condition 1 of rule regraMRE_4_REMEDIACAO_9_criterion_1_8.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_4_REMEDIACAO_9_criterion_1_8_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_4_REMEDIACAO_9_criterion_1_8 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_4_REMEDIACAO_9_criterion_1_8_cond(int index) {
        switch (index) {
            case 0: return regraMRE_4_REMEDIACAO_9_criterion_1_8_cond_0();
            case 1: return regraMRE_4_REMEDIACAO_9_criterion_1_8_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_4_REMEDIACAO_9_criterion_1_8 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_4_REMEDIACAO_9_criterion_1_8(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_4_REMEDIACAO_9_criterion_1_8_cond_0()) return false;
                if (!regraMRE_4_REMEDIACAO_9_criterion_1_8_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_4_REMEDIACAO_9_criterion_1_8(int declIndex) {
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
     * Executes the action part of the rule regraMRE_4_REMEDIACAO_9_criterion_1_8
     */
    private void regraMRE_4_REMEDIACAO_9_criterion_1_8() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_4_REMEDIACAO_9_criterion_1_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_4_REMEDIACAO_9_criterion_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 4\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"MRE específica para o erro\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(4L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 4\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_4_REMEDIACAO_9_criterion_1_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 4 - MRE 4");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_3_REMEDIACAO_10_criterion_1_9
     */
    private String[] identifiers_regraMRE_3_REMEDIACAO_10_criterion_1_9 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_3_REMEDIACAO_10_criterion_1_9
     *
     * @return the identifiers declared in rule regraMRE_3_REMEDIACAO_10_criterion_1_9
     */
    private String[] getDeclaredIdentifiers_regraMRE_3_REMEDIACAO_10_criterion_1_9() {
         return identifiers_regraMRE_3_REMEDIACAO_10_criterion_1_9;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_3_REMEDIACAO_10_criterion_1_9.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_3_REMEDIACAO_10_criterion_1_9(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_3_REMEDIACAO_10_criterion_1_9.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_3_REMEDIACAO_10_criterion_1_9(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_3_REMEDIACAO_10_criterion_1_9.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_3_REMEDIACAO_10_criterion_1_9(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_3_REMEDIACAO_10_criterion_1_9.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_3_REMEDIACAO_10_criterion_1_9(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_3_REMEDIACAO_10_criterion_1_9
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_3_REMEDIACAO_10_criterion_1_9() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_3_REMEDIACAO_10_criterion_1_9
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_3_REMEDIACAO_10_criterion_1_9(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_3_REMEDIACAO_10_criterion_1_9.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_3_REMEDIACAO_10_criterion_1_9_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(3L));
    }

    /**
     * Condition 1 of rule regraMRE_3_REMEDIACAO_10_criterion_1_9.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_3_REMEDIACAO_10_criterion_1_9_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_3_REMEDIACAO_10_criterion_1_9 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_3_REMEDIACAO_10_criterion_1_9_cond(int index) {
        switch (index) {
            case 0: return regraMRE_3_REMEDIACAO_10_criterion_1_9_cond_0();
            case 1: return regraMRE_3_REMEDIACAO_10_criterion_1_9_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_3_REMEDIACAO_10_criterion_1_9 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_3_REMEDIACAO_10_criterion_1_9(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_3_REMEDIACAO_10_criterion_1_9_cond_0()) return false;
                if (!regraMRE_3_REMEDIACAO_10_criterion_1_9_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_3_REMEDIACAO_10_criterion_1_9(int declIndex) {
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
     * Executes the action part of the rule regraMRE_3_REMEDIACAO_10_criterion_1_9
     */
    private void regraMRE_3_REMEDIACAO_10_criterion_1_9() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_3_REMEDIACAO_10_criterion_1_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_3_REMEDIACAO_10_criterion_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 3\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"MRE específica para o erro\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(3L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 3\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_3_REMEDIACAO_10_criterion_1_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 3 - MRE 3");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_3_REMEDIACAO_11_criterion_1_10
     */
    private String[] identifiers_regraMRE_3_REMEDIACAO_11_criterion_1_10 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_3_REMEDIACAO_11_criterion_1_10
     *
     * @return the identifiers declared in rule regraMRE_3_REMEDIACAO_11_criterion_1_10
     */
    private String[] getDeclaredIdentifiers_regraMRE_3_REMEDIACAO_11_criterion_1_10() {
         return identifiers_regraMRE_3_REMEDIACAO_11_criterion_1_10;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_3_REMEDIACAO_11_criterion_1_10.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_3_REMEDIACAO_11_criterion_1_10(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_3_REMEDIACAO_11_criterion_1_10.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_3_REMEDIACAO_11_criterion_1_10(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_3_REMEDIACAO_11_criterion_1_10.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_3_REMEDIACAO_11_criterion_1_10(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_3_REMEDIACAO_11_criterion_1_10.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_3_REMEDIACAO_11_criterion_1_10(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_3_REMEDIACAO_11_criterion_1_10
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_3_REMEDIACAO_11_criterion_1_10() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_3_REMEDIACAO_11_criterion_1_10
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_3_REMEDIACAO_11_criterion_1_10(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_3_REMEDIACAO_11_criterion_1_10.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_3_REMEDIACAO_11_criterion_1_10_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(3L));
    }

    /**
     * Condition 1 of rule regraMRE_3_REMEDIACAO_11_criterion_1_10.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_3_REMEDIACAO_11_criterion_1_10_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_3_REMEDIACAO_11_criterion_1_10 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_3_REMEDIACAO_11_criterion_1_10_cond(int index) {
        switch (index) {
            case 0: return regraMRE_3_REMEDIACAO_11_criterion_1_10_cond_0();
            case 1: return regraMRE_3_REMEDIACAO_11_criterion_1_10_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_3_REMEDIACAO_11_criterion_1_10 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_3_REMEDIACAO_11_criterion_1_10(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_3_REMEDIACAO_11_criterion_1_10_cond_0()) return false;
                if (!regraMRE_3_REMEDIACAO_11_criterion_1_10_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_3_REMEDIACAO_11_criterion_1_10(int declIndex) {
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
     * Executes the action part of the rule regraMRE_3_REMEDIACAO_11_criterion_1_10
     */
    private void regraMRE_3_REMEDIACAO_11_criterion_1_10() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_3_REMEDIACAO_11_criterion_1_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_3_REMEDIACAO_11_criterion_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 3\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"MRE específica para o erro\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(3L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 3\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_3_REMEDIACAO_11_criterion_1_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 3 - MRE 3");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_3_REMEDIACAO_12_criterion_1_11
     */
    private String[] identifiers_regraMRE_3_REMEDIACAO_12_criterion_1_11 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_3_REMEDIACAO_12_criterion_1_11
     *
     * @return the identifiers declared in rule regraMRE_3_REMEDIACAO_12_criterion_1_11
     */
    private String[] getDeclaredIdentifiers_regraMRE_3_REMEDIACAO_12_criterion_1_11() {
         return identifiers_regraMRE_3_REMEDIACAO_12_criterion_1_11;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_3_REMEDIACAO_12_criterion_1_11.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_3_REMEDIACAO_12_criterion_1_11(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_3_REMEDIACAO_12_criterion_1_11.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_3_REMEDIACAO_12_criterion_1_11(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_3_REMEDIACAO_12_criterion_1_11.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_3_REMEDIACAO_12_criterion_1_11(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_3_REMEDIACAO_12_criterion_1_11.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_3_REMEDIACAO_12_criterion_1_11(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_3_REMEDIACAO_12_criterion_1_11
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_3_REMEDIACAO_12_criterion_1_11() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_3_REMEDIACAO_12_criterion_1_11
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_3_REMEDIACAO_12_criterion_1_11(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_3_REMEDIACAO_12_criterion_1_11.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_3_REMEDIACAO_12_criterion_1_11_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(3L));
    }

    /**
     * Condition 1 of rule regraMRE_3_REMEDIACAO_12_criterion_1_11.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_3_REMEDIACAO_12_criterion_1_11_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_3_REMEDIACAO_12_criterion_1_11 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_3_REMEDIACAO_12_criterion_1_11_cond(int index) {
        switch (index) {
            case 0: return regraMRE_3_REMEDIACAO_12_criterion_1_11_cond_0();
            case 1: return regraMRE_3_REMEDIACAO_12_criterion_1_11_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_3_REMEDIACAO_12_criterion_1_11 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_3_REMEDIACAO_12_criterion_1_11(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_3_REMEDIACAO_12_criterion_1_11_cond_0()) return false;
                if (!regraMRE_3_REMEDIACAO_12_criterion_1_11_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_3_REMEDIACAO_12_criterion_1_11(int declIndex) {
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
     * Executes the action part of the rule regraMRE_3_REMEDIACAO_12_criterion_1_11
     */
    private void regraMRE_3_REMEDIACAO_12_criterion_1_11() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_3_REMEDIACAO_12_criterion_1_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_3_REMEDIACAO_12_criterion_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 3\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"MRE específica para o erro\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(3L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 3\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_3_REMEDIACAO_12_criterion_1_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 3 - MRE 3");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_5_REMEDIACAO_13_criterion_1_12
     */
    private String[] identifiers_regraMRE_5_REMEDIACAO_13_criterion_1_12 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_5_REMEDIACAO_13_criterion_1_12
     *
     * @return the identifiers declared in rule regraMRE_5_REMEDIACAO_13_criterion_1_12
     */
    private String[] getDeclaredIdentifiers_regraMRE_5_REMEDIACAO_13_criterion_1_12() {
         return identifiers_regraMRE_5_REMEDIACAO_13_criterion_1_12;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_5_REMEDIACAO_13_criterion_1_12.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_5_REMEDIACAO_13_criterion_1_12(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_5_REMEDIACAO_13_criterion_1_12.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_5_REMEDIACAO_13_criterion_1_12(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_5_REMEDIACAO_13_criterion_1_12.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_5_REMEDIACAO_13_criterion_1_12(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_5_REMEDIACAO_13_criterion_1_12.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_5_REMEDIACAO_13_criterion_1_12(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_5_REMEDIACAO_13_criterion_1_12
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_5_REMEDIACAO_13_criterion_1_12() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_5_REMEDIACAO_13_criterion_1_12
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_5_REMEDIACAO_13_criterion_1_12(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_5_REMEDIACAO_13_criterion_1_12.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_13_criterion_1_12_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(5L));
    }

    /**
     * Condition 1 of rule regraMRE_5_REMEDIACAO_13_criterion_1_12.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_13_criterion_1_12_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_5_REMEDIACAO_13_criterion_1_12 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_13_criterion_1_12_cond(int index) {
        switch (index) {
            case 0: return regraMRE_5_REMEDIACAO_13_criterion_1_12_cond_0();
            case 1: return regraMRE_5_REMEDIACAO_13_criterion_1_12_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_5_REMEDIACAO_13_criterion_1_12 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_5_REMEDIACAO_13_criterion_1_12(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_5_REMEDIACAO_13_criterion_1_12_cond_0()) return false;
                if (!regraMRE_5_REMEDIACAO_13_criterion_1_12_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_5_REMEDIACAO_13_criterion_1_12(int declIndex) {
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
     * Executes the action part of the rule regraMRE_5_REMEDIACAO_13_criterion_1_12
     */
    private void regraMRE_5_REMEDIACAO_13_criterion_1_12() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_5_REMEDIACAO_13_criterion_1_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_5_REMEDIACAO_13_criterion_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 5\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"MRE específica para o erro\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(5L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 5\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_5_REMEDIACAO_13_criterion_1_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 5 - MRE 5");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_5_REMEDIACAO_14_criterion_1_13
     */
    private String[] identifiers_regraMRE_5_REMEDIACAO_14_criterion_1_13 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_5_REMEDIACAO_14_criterion_1_13
     *
     * @return the identifiers declared in rule regraMRE_5_REMEDIACAO_14_criterion_1_13
     */
    private String[] getDeclaredIdentifiers_regraMRE_5_REMEDIACAO_14_criterion_1_13() {
         return identifiers_regraMRE_5_REMEDIACAO_14_criterion_1_13;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_5_REMEDIACAO_14_criterion_1_13.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_5_REMEDIACAO_14_criterion_1_13(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_5_REMEDIACAO_14_criterion_1_13.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_5_REMEDIACAO_14_criterion_1_13(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_5_REMEDIACAO_14_criterion_1_13.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_5_REMEDIACAO_14_criterion_1_13(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_5_REMEDIACAO_14_criterion_1_13.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_5_REMEDIACAO_14_criterion_1_13(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_5_REMEDIACAO_14_criterion_1_13
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_5_REMEDIACAO_14_criterion_1_13() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_5_REMEDIACAO_14_criterion_1_13
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_5_REMEDIACAO_14_criterion_1_13(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_5_REMEDIACAO_14_criterion_1_13.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_14_criterion_1_13_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(5L));
    }

    /**
     * Condition 1 of rule regraMRE_5_REMEDIACAO_14_criterion_1_13.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_14_criterion_1_13_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_5_REMEDIACAO_14_criterion_1_13 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_14_criterion_1_13_cond(int index) {
        switch (index) {
            case 0: return regraMRE_5_REMEDIACAO_14_criterion_1_13_cond_0();
            case 1: return regraMRE_5_REMEDIACAO_14_criterion_1_13_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_5_REMEDIACAO_14_criterion_1_13 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_5_REMEDIACAO_14_criterion_1_13(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_5_REMEDIACAO_14_criterion_1_13_cond_0()) return false;
                if (!regraMRE_5_REMEDIACAO_14_criterion_1_13_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_5_REMEDIACAO_14_criterion_1_13(int declIndex) {
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
     * Executes the action part of the rule regraMRE_5_REMEDIACAO_14_criterion_1_13
     */
    private void regraMRE_5_REMEDIACAO_14_criterion_1_13() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_5_REMEDIACAO_14_criterion_1_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_5_REMEDIACAO_14_criterion_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 5\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"MRE específica para o erro\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(5L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 5\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_5_REMEDIACAO_14_criterion_1_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 5 - MRE 5");
			flush();

	    }


// -rule-end- 



	
    /**
     * Identifiers of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_14
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_15_criterion_1_indice_14 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_14
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_14
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_15_criterion_1_indice_14() {
         return identifiers_regraMRE_6_REMEDIACAO_15_criterion_1_indice_14;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_14.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_15_criterion_1_indice_14(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_14.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_15_criterion_1_indice_14(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_14.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_15_criterion_1_indice_14(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_14.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_15_criterion_1_indice_14(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_14
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_15_criterion_1_indice_14() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_14
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_15_criterion_1_indice_14(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_14.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_15_criterion_1_indice_14_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_14.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_15_criterion_1_indice_14_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_14 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_15_criterion_1_indice_14_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_15_criterion_1_indice_14_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_15_criterion_1_indice_14_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_14 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_15_criterion_1_indice_14(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_15_criterion_1_indice_14_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_15_criterion_1_indice_14_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_15_criterion_1_indice_14(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_14
     */
    private void regraMRE_6_REMEDIACAO_15_criterion_1_indice_14() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_6_REMEDIACAO_15_criterion_1_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_6_REMEDIACAO_15_criterion_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 6\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"MRE específica para o erro\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(6L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 6\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_6_REMEDIACAO_15_criterion_1_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 6 - MRE 6");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_15
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_16_criterion_1_indice_15 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_15
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_15
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_16_criterion_1_indice_15() {
         return identifiers_regraMRE_6_REMEDIACAO_16_criterion_1_indice_15;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_15.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_16_criterion_1_indice_15(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_15.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_16_criterion_1_indice_15(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_15.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_16_criterion_1_indice_15(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_15.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_16_criterion_1_indice_15(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_15
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_16_criterion_1_indice_15() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_15
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_16_criterion_1_indice_15(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_15.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_16_criterion_1_indice_15_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_15.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_16_criterion_1_indice_15_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_15 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_16_criterion_1_indice_15_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_16_criterion_1_indice_15_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_16_criterion_1_indice_15_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_15 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_16_criterion_1_indice_15(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_16_criterion_1_indice_15_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_16_criterion_1_indice_15_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_16_criterion_1_indice_15(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_15
     */
    private void regraMRE_6_REMEDIACAO_16_criterion_1_indice_15() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_6_REMEDIACAO_16_criterion_1_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_6_REMEDIACAO_16_criterion_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 6\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"MRE específica para o erro\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(6L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 6\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_6_REMEDIACAO_16_criterion_1_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 6 - MRE 6");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_16
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_17_criterion_1_indice_16 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_16
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_16
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_17_criterion_1_indice_16() {
         return identifiers_regraMRE_6_REMEDIACAO_17_criterion_1_indice_16;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_16.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_17_criterion_1_indice_16(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_16.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_17_criterion_1_indice_16(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_16.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_17_criterion_1_indice_16(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_16.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_17_criterion_1_indice_16(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_16
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_17_criterion_1_indice_16() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_16
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_17_criterion_1_indice_16(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_16.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_17_criterion_1_indice_16_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_16.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_17_criterion_1_indice_16_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_16 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_17_criterion_1_indice_16_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_17_criterion_1_indice_16_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_17_criterion_1_indice_16_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_16 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_17_criterion_1_indice_16(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_17_criterion_1_indice_16_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_17_criterion_1_indice_16_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_17_criterion_1_indice_16(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_16
     */
    private void regraMRE_6_REMEDIACAO_17_criterion_1_indice_16() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_6_REMEDIACAO_17_criterion_1_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_6_REMEDIACAO_17_criterion_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 6\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"MRE específica para o erro\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(6L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 6\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_6_REMEDIACAO_17_criterion_1_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 6 - MRE 6");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_17
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_18_criterion_1_indice_17 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_17
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_17
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_18_criterion_1_indice_17() {
         return identifiers_regraMRE_6_REMEDIACAO_18_criterion_1_indice_17;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_17.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_18_criterion_1_indice_17(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_17.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_18_criterion_1_indice_17(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_17.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_18_criterion_1_indice_17(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_17.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_18_criterion_1_indice_17(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_17
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_18_criterion_1_indice_17() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_17
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_18_criterion_1_indice_17(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_17.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_18_criterion_1_indice_17_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_17.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_18_criterion_1_indice_17_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_17 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_18_criterion_1_indice_17_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_18_criterion_1_indice_17_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_18_criterion_1_indice_17_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_17 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_18_criterion_1_indice_17(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_18_criterion_1_indice_17_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_18_criterion_1_indice_17_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_18_criterion_1_indice_17(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_17
     */
    private void regraMRE_6_REMEDIACAO_18_criterion_1_indice_17() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_6_REMEDIACAO_18_criterion_1_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_6_REMEDIACAO_18_criterion_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 6\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"MRE específica para o erro\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(6L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 6\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_6_REMEDIACAO_18_criterion_1_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 6 - MRE 6");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_6_REMEDIACAO_19_criterion_1_indice_18
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_19_criterion_1_indice_18 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_19_criterion_1_indice_18
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_19_criterion_1_indice_18
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_19_criterion_1_indice_18() {
         return identifiers_regraMRE_6_REMEDIACAO_19_criterion_1_indice_18;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_19_criterion_1_indice_18.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_19_criterion_1_indice_18(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_19_criterion_1_indice_18.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_19_criterion_1_indice_18(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_19_criterion_1_indice_18.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_19_criterion_1_indice_18(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_19_criterion_1_indice_18.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_19_criterion_1_indice_18(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_19_criterion_1_indice_18
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_19_criterion_1_indice_18() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_19_criterion_1_indice_18
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_19_criterion_1_indice_18(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_19_criterion_1_indice_18.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_19_criterion_1_indice_18_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_19_criterion_1_indice_18.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_19_criterion_1_indice_18_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_19_criterion_1_indice_18 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_19_criterion_1_indice_18_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_19_criterion_1_indice_18_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_19_criterion_1_indice_18_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_19_criterion_1_indice_18 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_19_criterion_1_indice_18(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_19_criterion_1_indice_18_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_19_criterion_1_indice_18_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_19_criterion_1_indice_18(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_19_criterion_1_indice_18
     */
    private void regraMRE_6_REMEDIACAO_19_criterion_1_indice_18() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_6_REMEDIACAO_19_criterion_1_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_6_REMEDIACAO_19_criterion_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 6\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"MRE específica para o erro\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(6L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 6\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_6_REMEDIACAO_19_criterion_1_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 6 - MRE 6");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_19
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_20_criterion_1_indice_19 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_19
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_19
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_20_criterion_1_indice_19() {
         return identifiers_regraMRE_6_REMEDIACAO_20_criterion_1_indice_19;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_19.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_20_criterion_1_indice_19(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_19.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_20_criterion_1_indice_19(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_19.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_20_criterion_1_indice_19(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_19.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_20_criterion_1_indice_19(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_19
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_20_criterion_1_indice_19() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_19
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_20_criterion_1_indice_19(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_19.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_20_criterion_1_indice_19_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_19.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_20_criterion_1_indice_19_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_19 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_20_criterion_1_indice_19_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_20_criterion_1_indice_19_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_20_criterion_1_indice_19_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_19 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_20_criterion_1_indice_19(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_20_criterion_1_indice_19_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_20_criterion_1_indice_19_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_20_criterion_1_indice_19(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_19
     */
    private void regraMRE_6_REMEDIACAO_20_criterion_1_indice_19() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_6_REMEDIACAO_20_criterion_1_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_6_REMEDIACAO_20_criterion_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 6\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"MRE específica para o erro\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(6L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 6\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_6_REMEDIACAO_20_criterion_1_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 6 - MRE 6");
			flush();

	    }


// -rule-end- 

// end_rules
	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "regraMRE_1_REMEDIACAO_1_criterion_1_0",
        "regraMRE_1_REMEDIACAO_2_criterion_1_1",
        "regraMRE_2_REMEDIACAO_3_criterion_1_2",
        "regraMRE_2_REMEDIACAO_4_criterion_1_3",
        "regraMRE_2_REMEDIACAO_5_criterion_1_4",
        "regraMRE_2_REMEDIACAO_6_criterion_1_5",
        "regraMRE_2_REMEDIACAO_7_criterion_1_6",
        "regraMRE_4_REMEDIACAO_8_criterion_1_7",
        "regraMRE_4_REMEDIACAO_9_criterion_1_8",
        "regraMRE_3_REMEDIACAO_10_criterion_1_9",
        "regraMRE_3_REMEDIACAO_11_criterion_1_10",
        "regraMRE_3_REMEDIACAO_12_criterion_1_11",
        "regraMRE_5_REMEDIACAO_13_criterion_1_12",
        "regraMRE_5_REMEDIACAO_14_criterion_1_13",
        "regraMRE_6_REMEDIACAO_15_criterion_1_indice_14",
        "regraMRE_6_REMEDIACAO_16_criterion_1_indice_15",
        "regraMRE_6_REMEDIACAO_17_criterion_1_indice_16",
        "regraMRE_6_REMEDIACAO_18_criterion_1_indice_17",
        "regraMRE_6_REMEDIACAO_19_criterion_1_indice_18",
        "regraMRE_6_REMEDIACAO_20_criterion_1_indice_19"
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
        2,
        2,
        2,
        2,
        2,
        2,
        2,
        2,
        2,
        2,
        2,
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
            case 0: return regraMRE_1_REMEDIACAO_1_criterion_1_0_cond(condIndex);
            case 1: return regraMRE_1_REMEDIACAO_2_criterion_1_1_cond(condIndex);
            case 2: return regraMRE_2_REMEDIACAO_3_criterion_1_2_cond(condIndex);
            case 3: return regraMRE_2_REMEDIACAO_4_criterion_1_3_cond(condIndex);
            case 4: return regraMRE_2_REMEDIACAO_5_criterion_1_4_cond(condIndex);
            case 5: return regraMRE_2_REMEDIACAO_6_criterion_1_5_cond(condIndex);
            case 6: return regraMRE_2_REMEDIACAO_7_criterion_1_6_cond(condIndex);
            case 7: return regraMRE_4_REMEDIACAO_8_criterion_1_7_cond(condIndex);
            case 8: return regraMRE_4_REMEDIACAO_9_criterion_1_8_cond(condIndex);
            case 9: return regraMRE_3_REMEDIACAO_10_criterion_1_9_cond(condIndex);
            case 10: return regraMRE_3_REMEDIACAO_11_criterion_1_10_cond(condIndex);
            case 11: return regraMRE_3_REMEDIACAO_12_criterion_1_11_cond(condIndex);
            case 12: return regraMRE_5_REMEDIACAO_13_criterion_1_12_cond(condIndex);
            case 13: return regraMRE_5_REMEDIACAO_14_criterion_1_13_cond(condIndex);
            case 14: return regraMRE_6_REMEDIACAO_15_criterion_1_indice_14_cond(condIndex);
            case 15: return regraMRE_6_REMEDIACAO_16_criterion_1_indice_15_cond(condIndex);
            case 16: return regraMRE_6_REMEDIACAO_17_criterion_1_indice_16_cond(condIndex);
            case 17: return regraMRE_6_REMEDIACAO_18_criterion_1_indice_17_cond(condIndex);
            case 18: return regraMRE_6_REMEDIACAO_19_criterion_1_indice_18_cond(condIndex);
            case 19: return regraMRE_6_REMEDIACAO_20_criterion_1_indice_19_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_regraMRE_1_REMEDIACAO_1_criterion_1_0(declIndex);
            case 1: return checkConditionsOnlyOf_regraMRE_1_REMEDIACAO_2_criterion_1_1(declIndex);
            case 2: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_3_criterion_1_2(declIndex);
            case 3: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_4_criterion_1_3(declIndex);
            case 4: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_5_criterion_1_4(declIndex);
            case 5: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_6_criterion_1_5(declIndex);
            case 6: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_7_criterion_1_6(declIndex);
            case 7: return checkConditionsOnlyOf_regraMRE_4_REMEDIACAO_8_criterion_1_7(declIndex);
            case 8: return checkConditionsOnlyOf_regraMRE_4_REMEDIACAO_9_criterion_1_8(declIndex);
            case 9: return checkConditionsOnlyOf_regraMRE_3_REMEDIACAO_10_criterion_1_9(declIndex);
            case 10: return checkConditionsOnlyOf_regraMRE_3_REMEDIACAO_11_criterion_1_10(declIndex);
            case 11: return checkConditionsOnlyOf_regraMRE_3_REMEDIACAO_12_criterion_1_11(declIndex);
            case 12: return checkConditionsOnlyOf_regraMRE_5_REMEDIACAO_13_criterion_1_12(declIndex);
            case 13: return checkConditionsOnlyOf_regraMRE_5_REMEDIACAO_14_criterion_1_13(declIndex);
            case 14: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_15_criterion_1_indice_14(declIndex);
            case 15: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_16_criterion_1_indice_15(declIndex);
            case 16: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_17_criterion_1_indice_16(declIndex);
            case 17: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_18_criterion_1_indice_17(declIndex);
            case 18: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_19_criterion_1_indice_18(declIndex);
            case 19: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_20_criterion_1_indice_19(declIndex);
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
            case 0: return checkCondForDeclaration_regraMRE_1_REMEDIACAO_1_criterion_1_0(declIndex);
            case 1: return checkCondForDeclaration_regraMRE_1_REMEDIACAO_2_criterion_1_1(declIndex);
            case 2: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_3_criterion_1_2(declIndex);
            case 3: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_4_criterion_1_3(declIndex);
            case 4: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_5_criterion_1_4(declIndex);
            case 5: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_6_criterion_1_5(declIndex);
            case 6: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_7_criterion_1_6(declIndex);
            case 7: return checkCondForDeclaration_regraMRE_4_REMEDIACAO_8_criterion_1_7(declIndex);
            case 8: return checkCondForDeclaration_regraMRE_4_REMEDIACAO_9_criterion_1_8(declIndex);
            case 9: return checkCondForDeclaration_regraMRE_3_REMEDIACAO_10_criterion_1_9(declIndex);
            case 10: return checkCondForDeclaration_regraMRE_3_REMEDIACAO_11_criterion_1_10(declIndex);
            case 11: return checkCondForDeclaration_regraMRE_3_REMEDIACAO_12_criterion_1_11(declIndex);
            case 12: return checkCondForDeclaration_regraMRE_5_REMEDIACAO_13_criterion_1_12(declIndex);
            case 13: return checkCondForDeclaration_regraMRE_5_REMEDIACAO_14_criterion_1_13(declIndex);
            case 14: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_15_criterion_1_indice_14(declIndex);
            case 15: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_16_criterion_1_indice_15(declIndex);
            case 16: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_17_criterion_1_indice_16(declIndex);
            case 17: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_18_criterion_1_indice_17(declIndex);
            case 18: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_19_criterion_1_indice_18(declIndex);
            case 19: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_20_criterion_1_indice_19(declIndex);
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
            case 0: return getDeclaredClassName_regraMRE_1_REMEDIACAO_1_criterion_1_0(declIndex);
            case 1: return getDeclaredClassName_regraMRE_1_REMEDIACAO_2_criterion_1_1(declIndex);
            case 2: return getDeclaredClassName_regraMRE_2_REMEDIACAO_3_criterion_1_2(declIndex);
            case 3: return getDeclaredClassName_regraMRE_2_REMEDIACAO_4_criterion_1_3(declIndex);
            case 4: return getDeclaredClassName_regraMRE_2_REMEDIACAO_5_criterion_1_4(declIndex);
            case 5: return getDeclaredClassName_regraMRE_2_REMEDIACAO_6_criterion_1_5(declIndex);
            case 6: return getDeclaredClassName_regraMRE_2_REMEDIACAO_7_criterion_1_6(declIndex);
            case 7: return getDeclaredClassName_regraMRE_4_REMEDIACAO_8_criterion_1_7(declIndex);
            case 8: return getDeclaredClassName_regraMRE_4_REMEDIACAO_9_criterion_1_8(declIndex);
            case 9: return getDeclaredClassName_regraMRE_3_REMEDIACAO_10_criterion_1_9(declIndex);
            case 10: return getDeclaredClassName_regraMRE_3_REMEDIACAO_11_criterion_1_10(declIndex);
            case 11: return getDeclaredClassName_regraMRE_3_REMEDIACAO_12_criterion_1_11(declIndex);
            case 12: return getDeclaredClassName_regraMRE_5_REMEDIACAO_13_criterion_1_12(declIndex);
            case 13: return getDeclaredClassName_regraMRE_5_REMEDIACAO_14_criterion_1_13(declIndex);
            case 14: return getDeclaredClassName_regraMRE_6_REMEDIACAO_15_criterion_1_indice_14(declIndex);
            case 15: return getDeclaredClassName_regraMRE_6_REMEDIACAO_16_criterion_1_indice_15(declIndex);
            case 16: return getDeclaredClassName_regraMRE_6_REMEDIACAO_17_criterion_1_indice_16(declIndex);
            case 17: return getDeclaredClassName_regraMRE_6_REMEDIACAO_18_criterion_1_indice_17(declIndex);
            case 18: return getDeclaredClassName_regraMRE_6_REMEDIACAO_19_criterion_1_indice_18(declIndex);
            case 19: return getDeclaredClassName_regraMRE_6_REMEDIACAO_20_criterion_1_indice_19(declIndex);
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
            case 0: return getDeclaredClass_regraMRE_1_REMEDIACAO_1_criterion_1_0(declIndex);
            case 1: return getDeclaredClass_regraMRE_1_REMEDIACAO_2_criterion_1_1(declIndex);
            case 2: return getDeclaredClass_regraMRE_2_REMEDIACAO_3_criterion_1_2(declIndex);
            case 3: return getDeclaredClass_regraMRE_2_REMEDIACAO_4_criterion_1_3(declIndex);
            case 4: return getDeclaredClass_regraMRE_2_REMEDIACAO_5_criterion_1_4(declIndex);
            case 5: return getDeclaredClass_regraMRE_2_REMEDIACAO_6_criterion_1_5(declIndex);
            case 6: return getDeclaredClass_regraMRE_2_REMEDIACAO_7_criterion_1_6(declIndex);
            case 7: return getDeclaredClass_regraMRE_4_REMEDIACAO_8_criterion_1_7(declIndex);
            case 8: return getDeclaredClass_regraMRE_4_REMEDIACAO_9_criterion_1_8(declIndex);
            case 9: return getDeclaredClass_regraMRE_3_REMEDIACAO_10_criterion_1_9(declIndex);
            case 10: return getDeclaredClass_regraMRE_3_REMEDIACAO_11_criterion_1_10(declIndex);
            case 11: return getDeclaredClass_regraMRE_3_REMEDIACAO_12_criterion_1_11(declIndex);
            case 12: return getDeclaredClass_regraMRE_5_REMEDIACAO_13_criterion_1_12(declIndex);
            case 13: return getDeclaredClass_regraMRE_5_REMEDIACAO_14_criterion_1_13(declIndex);
            case 14: return getDeclaredClass_regraMRE_6_REMEDIACAO_15_criterion_1_indice_14(declIndex);
            case 15: return getDeclaredClass_regraMRE_6_REMEDIACAO_16_criterion_1_indice_15(declIndex);
            case 16: return getDeclaredClass_regraMRE_6_REMEDIACAO_17_criterion_1_indice_16(declIndex);
            case 17: return getDeclaredClass_regraMRE_6_REMEDIACAO_18_criterion_1_indice_17(declIndex);
            case 18: return getDeclaredClass_regraMRE_6_REMEDIACAO_19_criterion_1_indice_18(declIndex);
            case 19: return getDeclaredClass_regraMRE_6_REMEDIACAO_20_criterion_1_indice_19(declIndex);
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
            case 0: regraMRE_1_REMEDIACAO_1_criterion_1_0(); break;
            case 1: regraMRE_1_REMEDIACAO_2_criterion_1_1(); break;
            case 2: regraMRE_2_REMEDIACAO_3_criterion_1_2(); break;
            case 3: regraMRE_2_REMEDIACAO_4_criterion_1_3(); break;
            case 4: regraMRE_2_REMEDIACAO_5_criterion_1_4(); break;
            case 5: regraMRE_2_REMEDIACAO_6_criterion_1_5(); break;
            case 6: regraMRE_2_REMEDIACAO_7_criterion_1_6(); break;
            case 7: regraMRE_4_REMEDIACAO_8_criterion_1_7(); break;
            case 8: regraMRE_4_REMEDIACAO_9_criterion_1_8(); break;
            case 9: regraMRE_3_REMEDIACAO_10_criterion_1_9(); break;
            case 10: regraMRE_3_REMEDIACAO_11_criterion_1_10(); break;
            case 11: regraMRE_3_REMEDIACAO_12_criterion_1_11(); break;
            case 12: regraMRE_5_REMEDIACAO_13_criterion_1_12(); break;
            case 13: regraMRE_5_REMEDIACAO_14_criterion_1_13(); break;
            case 14: regraMRE_6_REMEDIACAO_15_criterion_1_indice_14(); break;
            case 15: regraMRE_6_REMEDIACAO_16_criterion_1_indice_15(); break;
            case 16: regraMRE_6_REMEDIACAO_17_criterion_1_indice_16(); break;
            case 17: regraMRE_6_REMEDIACAO_18_criterion_1_indice_17(); break;
            case 18: regraMRE_6_REMEDIACAO_19_criterion_1_indice_18(); break;
            case 19: regraMRE_6_REMEDIACAO_20_criterion_1_indice_19(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 20;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_regraMRE_1_REMEDIACAO_1_criterion_1_0();
            case 1: return getDeclaredIdentifiers_regraMRE_1_REMEDIACAO_2_criterion_1_1();
            case 2: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_3_criterion_1_2();
            case 3: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_4_criterion_1_3();
            case 4: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_5_criterion_1_4();
            case 5: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_6_criterion_1_5();
            case 6: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_7_criterion_1_6();
            case 7: return getDeclaredIdentifiers_regraMRE_4_REMEDIACAO_8_criterion_1_7();
            case 8: return getDeclaredIdentifiers_regraMRE_4_REMEDIACAO_9_criterion_1_8();
            case 9: return getDeclaredIdentifiers_regraMRE_3_REMEDIACAO_10_criterion_1_9();
            case 10: return getDeclaredIdentifiers_regraMRE_3_REMEDIACAO_11_criterion_1_10();
            case 11: return getDeclaredIdentifiers_regraMRE_3_REMEDIACAO_12_criterion_1_11();
            case 12: return getDeclaredIdentifiers_regraMRE_5_REMEDIACAO_13_criterion_1_12();
            case 13: return getDeclaredIdentifiers_regraMRE_5_REMEDIACAO_14_criterion_1_13();
            case 14: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_15_criterion_1_indice_14();
            case 15: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_16_criterion_1_indice_15();
            case 16: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_17_criterion_1_indice_16();
            case 17: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_18_criterion_1_indice_17();
            case 18: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_19_criterion_1_indice_18();
            case 19: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_20_criterion_1_indice_19();
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
            case 0: setObject_regraMRE_1_REMEDIACAO_1_criterion_1_0(declIndex, value); break;
            case 1: setObject_regraMRE_1_REMEDIACAO_2_criterion_1_1(declIndex, value); break;
            case 2: setObject_regraMRE_2_REMEDIACAO_3_criterion_1_2(declIndex, value); break;
            case 3: setObject_regraMRE_2_REMEDIACAO_4_criterion_1_3(declIndex, value); break;
            case 4: setObject_regraMRE_2_REMEDIACAO_5_criterion_1_4(declIndex, value); break;
            case 5: setObject_regraMRE_2_REMEDIACAO_6_criterion_1_5(declIndex, value); break;
            case 6: setObject_regraMRE_2_REMEDIACAO_7_criterion_1_6(declIndex, value); break;
            case 7: setObject_regraMRE_4_REMEDIACAO_8_criterion_1_7(declIndex, value); break;
            case 8: setObject_regraMRE_4_REMEDIACAO_9_criterion_1_8(declIndex, value); break;
            case 9: setObject_regraMRE_3_REMEDIACAO_10_criterion_1_9(declIndex, value); break;
            case 10: setObject_regraMRE_3_REMEDIACAO_11_criterion_1_10(declIndex, value); break;
            case 11: setObject_regraMRE_3_REMEDIACAO_12_criterion_1_11(declIndex, value); break;
            case 12: setObject_regraMRE_5_REMEDIACAO_13_criterion_1_12(declIndex, value); break;
            case 13: setObject_regraMRE_5_REMEDIACAO_14_criterion_1_13(declIndex, value); break;
            case 14: setObject_regraMRE_6_REMEDIACAO_15_criterion_1_indice_14(declIndex, value); break;
            case 15: setObject_regraMRE_6_REMEDIACAO_16_criterion_1_indice_15(declIndex, value); break;
            case 16: setObject_regraMRE_6_REMEDIACAO_17_criterion_1_indice_16(declIndex, value); break;
            case 17: setObject_regraMRE_6_REMEDIACAO_18_criterion_1_indice_17(declIndex, value); break;
            case 18: setObject_regraMRE_6_REMEDIACAO_19_criterion_1_indice_18(declIndex, value); break;
            case 19: setObject_regraMRE_6_REMEDIACAO_20_criterion_1_indice_19(declIndex, value); break;
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
            case 0: return getObject_regraMRE_1_REMEDIACAO_1_criterion_1_0(declIndex);
            case 1: return getObject_regraMRE_1_REMEDIACAO_2_criterion_1_1(declIndex);
            case 2: return getObject_regraMRE_2_REMEDIACAO_3_criterion_1_2(declIndex);
            case 3: return getObject_regraMRE_2_REMEDIACAO_4_criterion_1_3(declIndex);
            case 4: return getObject_regraMRE_2_REMEDIACAO_5_criterion_1_4(declIndex);
            case 5: return getObject_regraMRE_2_REMEDIACAO_6_criterion_1_5(declIndex);
            case 6: return getObject_regraMRE_2_REMEDIACAO_7_criterion_1_6(declIndex);
            case 7: return getObject_regraMRE_4_REMEDIACAO_8_criterion_1_7(declIndex);
            case 8: return getObject_regraMRE_4_REMEDIACAO_9_criterion_1_8(declIndex);
            case 9: return getObject_regraMRE_3_REMEDIACAO_10_criterion_1_9(declIndex);
            case 10: return getObject_regraMRE_3_REMEDIACAO_11_criterion_1_10(declIndex);
            case 11: return getObject_regraMRE_3_REMEDIACAO_12_criterion_1_11(declIndex);
            case 12: return getObject_regraMRE_5_REMEDIACAO_13_criterion_1_12(declIndex);
            case 13: return getObject_regraMRE_5_REMEDIACAO_14_criterion_1_13(declIndex);
            case 14: return getObject_regraMRE_6_REMEDIACAO_15_criterion_1_indice_14(declIndex);
            case 15: return getObject_regraMRE_6_REMEDIACAO_16_criterion_1_indice_15(declIndex);
            case 16: return getObject_regraMRE_6_REMEDIACAO_17_criterion_1_indice_16(declIndex);
            case 17: return getObject_regraMRE_6_REMEDIACAO_18_criterion_1_indice_17(declIndex);
            case 18: return getObject_regraMRE_6_REMEDIACAO_19_criterion_1_indice_18(declIndex);
            case 19: return getObject_regraMRE_6_REMEDIACAO_20_criterion_1_indice_19(declIndex);
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
            case 0: return getObjects_regraMRE_1_REMEDIACAO_1_criterion_1_0();
            case 1: return getObjects_regraMRE_1_REMEDIACAO_2_criterion_1_1();
            case 2: return getObjects_regraMRE_2_REMEDIACAO_3_criterion_1_2();
            case 3: return getObjects_regraMRE_2_REMEDIACAO_4_criterion_1_3();
            case 4: return getObjects_regraMRE_2_REMEDIACAO_5_criterion_1_4();
            case 5: return getObjects_regraMRE_2_REMEDIACAO_6_criterion_1_5();
            case 6: return getObjects_regraMRE_2_REMEDIACAO_7_criterion_1_6();
            case 7: return getObjects_regraMRE_4_REMEDIACAO_8_criterion_1_7();
            case 8: return getObjects_regraMRE_4_REMEDIACAO_9_criterion_1_8();
            case 9: return getObjects_regraMRE_3_REMEDIACAO_10_criterion_1_9();
            case 10: return getObjects_regraMRE_3_REMEDIACAO_11_criterion_1_10();
            case 11: return getObjects_regraMRE_3_REMEDIACAO_12_criterion_1_11();
            case 12: return getObjects_regraMRE_5_REMEDIACAO_13_criterion_1_12();
            case 13: return getObjects_regraMRE_5_REMEDIACAO_14_criterion_1_13();
            case 14: return getObjects_regraMRE_6_REMEDIACAO_15_criterion_1_indice_14();
            case 15: return getObjects_regraMRE_6_REMEDIACAO_16_criterion_1_indice_15();
            case 16: return getObjects_regraMRE_6_REMEDIACAO_17_criterion_1_indice_16();
            case 17: return getObjects_regraMRE_6_REMEDIACAO_18_criterion_1_indice_17();
            case 18: return getObjects_regraMRE_6_REMEDIACAO_19_criterion_1_indice_18();
            case 19: return getObjects_regraMRE_6_REMEDIACAO_20_criterion_1_indice_19();
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
            case 0: setObjects_regraMRE_1_REMEDIACAO_1_criterion_1_0(objects); break;
            case 1: setObjects_regraMRE_1_REMEDIACAO_2_criterion_1_1(objects); break;
            case 2: setObjects_regraMRE_2_REMEDIACAO_3_criterion_1_2(objects); break;
            case 3: setObjects_regraMRE_2_REMEDIACAO_4_criterion_1_3(objects); break;
            case 4: setObjects_regraMRE_2_REMEDIACAO_5_criterion_1_4(objects); break;
            case 5: setObjects_regraMRE_2_REMEDIACAO_6_criterion_1_5(objects); break;
            case 6: setObjects_regraMRE_2_REMEDIACAO_7_criterion_1_6(objects); break;
            case 7: setObjects_regraMRE_4_REMEDIACAO_8_criterion_1_7(objects); break;
            case 8: setObjects_regraMRE_4_REMEDIACAO_9_criterion_1_8(objects); break;
            case 9: setObjects_regraMRE_3_REMEDIACAO_10_criterion_1_9(objects); break;
            case 10: setObjects_regraMRE_3_REMEDIACAO_11_criterion_1_10(objects); break;
            case 11: setObjects_regraMRE_3_REMEDIACAO_12_criterion_1_11(objects); break;
            case 12: setObjects_regraMRE_5_REMEDIACAO_13_criterion_1_12(objects); break;
            case 13: setObjects_regraMRE_5_REMEDIACAO_14_criterion_1_13(objects); break;
            case 14: setObjects_regraMRE_6_REMEDIACAO_15_criterion_1_indice_14(objects); break;
            case 15: setObjects_regraMRE_6_REMEDIACAO_16_criterion_1_indice_15(objects); break;
            case 16: setObjects_regraMRE_6_REMEDIACAO_17_criterion_1_indice_16(objects); break;
            case 17: setObjects_regraMRE_6_REMEDIACAO_18_criterion_1_indice_17(objects); break;
            case 18: setObjects_regraMRE_6_REMEDIACAO_19_criterion_1_indice_18(objects); break;
            case 19: setObjects_regraMRE_6_REMEDIACAO_20_criterion_1_indice_19(objects); break;
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
    public Jeops_RuleBase_MERManagerSpecificMERKB(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file MERManagerSpecificMERKB.rules
 *
 * @version 02/07/2015
 */
public class MERManagerSpecificMERKB extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public MERManagerSpecificMERKB(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public MERManagerSpecificMERKB() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_MERManagerSpecificMERKB(this);
    }

}
