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
     * Identifiers of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_0
     */
    private String[] identifiers_regraMRE_1_REMEDIACAO_1_criterion_1_indice_0 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_0
     *
     * @return the identifiers declared in rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_0
     */
    private String[] getDeclaredIdentifiers_regraMRE_1_REMEDIACAO_1_criterion_1_indice_0() {
         return identifiers_regraMRE_1_REMEDIACAO_1_criterion_1_indice_0;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_0.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_1_REMEDIACAO_1_criterion_1_indice_0(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_0.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_1_REMEDIACAO_1_criterion_1_indice_0(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_0.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_1_REMEDIACAO_1_criterion_1_indice_0(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_0.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_1_REMEDIACAO_1_criterion_1_indice_0(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_0
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_1_REMEDIACAO_1_criterion_1_indice_0() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_0
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_1_REMEDIACAO_1_criterion_1_indice_0(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_0.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_1_criterion_1_indice_0_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(1L));
    }

    /**
     * Condition 1 of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_0.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_1_criterion_1_indice_0_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_0 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_1_criterion_1_indice_0_cond(int index) {
        switch (index) {
            case 0: return regraMRE_1_REMEDIACAO_1_criterion_1_indice_0_cond_0();
            case 1: return regraMRE_1_REMEDIACAO_1_criterion_1_indice_0_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_0 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_1_REMEDIACAO_1_criterion_1_indice_0(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_1_REMEDIACAO_1_criterion_1_indice_0_cond_0()) return false;
                if (!regraMRE_1_REMEDIACAO_1_criterion_1_indice_0_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_1_REMEDIACAO_1_criterion_1_indice_0(int declIndex) {
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
     * Executes the action part of the rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_0
     */
    private void regraMRE_1_REMEDIACAO_1_criterion_1_indice_0() {
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
     * Identifiers of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_1
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_4_criterion_1_indice_1 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_1
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_1
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_4_criterion_1_indice_1() {
         return identifiers_regraMRE_2_REMEDIACAO_4_criterion_1_indice_1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_4_criterion_1_indice_1(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_4_criterion_1_indice_1(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_4_criterion_1_indice_1(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_4_criterion_1_indice_1(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_4_criterion_1_indice_1() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_4_criterion_1_indice_1(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_1.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_4_criterion_1_indice_1_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_1.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_4_criterion_1_indice_1_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_4_criterion_1_indice_1_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_4_criterion_1_indice_1_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_4_criterion_1_indice_1_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_4_criterion_1_indice_1(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_4_criterion_1_indice_1_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_4_criterion_1_indice_1_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_4_criterion_1_indice_1(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_1
     */
    private void regraMRE_2_REMEDIACAO_4_criterion_1_indice_1() {
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
     * Identifiers of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_2
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_5_criterion_1_indice_2 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_2
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_2
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_5_criterion_1_indice_2() {
         return identifiers_regraMRE_2_REMEDIACAO_5_criterion_1_indice_2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_5_criterion_1_indice_2(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_5_criterion_1_indice_2(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_5_criterion_1_indice_2(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_5_criterion_1_indice_2(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_5_criterion_1_indice_2() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_5_criterion_1_indice_2(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_2.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_5_criterion_1_indice_2_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_2.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_5_criterion_1_indice_2_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_5_criterion_1_indice_2_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_5_criterion_1_indice_2_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_5_criterion_1_indice_2_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_5_criterion_1_indice_2(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_5_criterion_1_indice_2_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_5_criterion_1_indice_2_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_5_criterion_1_indice_2(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_2
     */
    private void regraMRE_2_REMEDIACAO_5_criterion_1_indice_2() {
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
     * Identifiers of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_3
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_15_criterion_1_indice_3 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_3
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_3
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_15_criterion_1_indice_3() {
         return identifiers_regraMRE_6_REMEDIACAO_15_criterion_1_indice_3;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_3.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_15_criterion_1_indice_3(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_3.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_15_criterion_1_indice_3(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_3.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_15_criterion_1_indice_3(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_3.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_15_criterion_1_indice_3(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_3
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_15_criterion_1_indice_3() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_3
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_15_criterion_1_indice_3(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_3.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_15_criterion_1_indice_3_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_3.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_15_criterion_1_indice_3_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_3 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_15_criterion_1_indice_3_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_15_criterion_1_indice_3_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_15_criterion_1_indice_3_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_3 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_15_criterion_1_indice_3(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_15_criterion_1_indice_3_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_15_criterion_1_indice_3_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_15_criterion_1_indice_3(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_3
     */
    private void regraMRE_6_REMEDIACAO_15_criterion_1_indice_3() {
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
     * Identifiers of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_4
     */
    private String[] identifiers_regraMRE_1_REMEDIACAO_2_criterion_1_indice_4 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_4
     *
     * @return the identifiers declared in rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_4
     */
    private String[] getDeclaredIdentifiers_regraMRE_1_REMEDIACAO_2_criterion_1_indice_4() {
         return identifiers_regraMRE_1_REMEDIACAO_2_criterion_1_indice_4;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_4.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_1_REMEDIACAO_2_criterion_1_indice_4(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_4.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_1_REMEDIACAO_2_criterion_1_indice_4(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_4.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_1_REMEDIACAO_2_criterion_1_indice_4(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_4.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_1_REMEDIACAO_2_criterion_1_indice_4(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_4
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_1_REMEDIACAO_2_criterion_1_indice_4() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_4
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_1_REMEDIACAO_2_criterion_1_indice_4(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_4.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_2_criterion_1_indice_4_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(1L));
    }

    /**
     * Condition 1 of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_4.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_2_criterion_1_indice_4_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_4 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_2_criterion_1_indice_4_cond(int index) {
        switch (index) {
            case 0: return regraMRE_1_REMEDIACAO_2_criterion_1_indice_4_cond_0();
            case 1: return regraMRE_1_REMEDIACAO_2_criterion_1_indice_4_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_4 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_1_REMEDIACAO_2_criterion_1_indice_4(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_1_REMEDIACAO_2_criterion_1_indice_4_cond_0()) return false;
                if (!regraMRE_1_REMEDIACAO_2_criterion_1_indice_4_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_1_REMEDIACAO_2_criterion_1_indice_4(int declIndex) {
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
     * Executes the action part of the rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_4
     */
    private void regraMRE_1_REMEDIACAO_2_criterion_1_indice_4() {
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
     * Identifiers of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_5
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_6_criterion_1_indice_5 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_5
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_5
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_6_criterion_1_indice_5() {
         return identifiers_regraMRE_2_REMEDIACAO_6_criterion_1_indice_5;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_5.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_6_criterion_1_indice_5(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_5.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_6_criterion_1_indice_5(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_5.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_6_criterion_1_indice_5(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_5.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_6_criterion_1_indice_5(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_5
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_6_criterion_1_indice_5() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_5
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_6_criterion_1_indice_5(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_5.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_6_criterion_1_indice_5_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_5.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_6_criterion_1_indice_5_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_5 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_6_criterion_1_indice_5_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_6_criterion_1_indice_5_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_6_criterion_1_indice_5_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_5 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_6_criterion_1_indice_5(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_6_criterion_1_indice_5_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_6_criterion_1_indice_5_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_6_criterion_1_indice_5(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_5
     */
    private void regraMRE_2_REMEDIACAO_6_criterion_1_indice_5() {
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
     * Identifiers of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_6
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_16_criterion_1_indice_6 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_6
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_6
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_16_criterion_1_indice_6() {
         return identifiers_regraMRE_6_REMEDIACAO_16_criterion_1_indice_6;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_6.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_16_criterion_1_indice_6(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_6.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_16_criterion_1_indice_6(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_6.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_16_criterion_1_indice_6(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_6.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_16_criterion_1_indice_6(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_6
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_16_criterion_1_indice_6() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_6
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_16_criterion_1_indice_6(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_6.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_16_criterion_1_indice_6_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_6.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_16_criterion_1_indice_6_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_6 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_16_criterion_1_indice_6_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_16_criterion_1_indice_6_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_16_criterion_1_indice_6_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_6 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_16_criterion_1_indice_6(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_16_criterion_1_indice_6_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_16_criterion_1_indice_6_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_16_criterion_1_indice_6(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_6
     */
    private void regraMRE_6_REMEDIACAO_16_criterion_1_indice_6() {
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
     * Identifiers of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_7
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_3_criterion_1_indice_7 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_7
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_7
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_3_criterion_1_indice_7() {
         return identifiers_regraMRE_2_REMEDIACAO_3_criterion_1_indice_7;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_7.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_3_criterion_1_indice_7(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_7.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_3_criterion_1_indice_7(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_7.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_3_criterion_1_indice_7(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_7.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_3_criterion_1_indice_7(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_7
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_3_criterion_1_indice_7() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_7
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_3_criterion_1_indice_7(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_7.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_3_criterion_1_indice_7_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_7.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_3_criterion_1_indice_7_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_7 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_3_criterion_1_indice_7_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_3_criterion_1_indice_7_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_3_criterion_1_indice_7_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_7 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_3_criterion_1_indice_7(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_3_criterion_1_indice_7_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_3_criterion_1_indice_7_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_3_criterion_1_indice_7(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_7
     */
    private void regraMRE_2_REMEDIACAO_3_criterion_1_indice_7() {
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
     * Identifiers of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_8
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_7_criterion_1_indice_8 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_8
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_8
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_7_criterion_1_indice_8() {
         return identifiers_regraMRE_2_REMEDIACAO_7_criterion_1_indice_8;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_8.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_7_criterion_1_indice_8(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_8.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_7_criterion_1_indice_8(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_8.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_7_criterion_1_indice_8(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_8.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_7_criterion_1_indice_8(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_8
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_7_criterion_1_indice_8() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_8
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_7_criterion_1_indice_8(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_8.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_7_criterion_1_indice_8_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_8.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_7_criterion_1_indice_8_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_8 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_7_criterion_1_indice_8_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_7_criterion_1_indice_8_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_7_criterion_1_indice_8_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_8 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_7_criterion_1_indice_8(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_7_criterion_1_indice_8_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_7_criterion_1_indice_8_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_7_criterion_1_indice_8(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_8
     */
    private void regraMRE_2_REMEDIACAO_7_criterion_1_indice_8() {
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
     * Identifiers of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_9
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_17_criterion_1_indice_9 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_9
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_9
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_17_criterion_1_indice_9() {
         return identifiers_regraMRE_6_REMEDIACAO_17_criterion_1_indice_9;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_9.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_17_criterion_1_indice_9(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_9.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_17_criterion_1_indice_9(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_9.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_17_criterion_1_indice_9(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_9.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_17_criterion_1_indice_9(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_9
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_17_criterion_1_indice_9() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_9
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_17_criterion_1_indice_9(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_9.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_17_criterion_1_indice_9_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_9.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_17_criterion_1_indice_9_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_9 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_17_criterion_1_indice_9_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_17_criterion_1_indice_9_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_17_criterion_1_indice_9_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_9 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_17_criterion_1_indice_9(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_17_criterion_1_indice_9_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_17_criterion_1_indice_9_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_17_criterion_1_indice_9(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_9
     */
    private void regraMRE_6_REMEDIACAO_17_criterion_1_indice_9() {
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
     * Identifiers of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_10
     */
    private String[] identifiers_regraMRE_4_REMEDIACAO_8_criterion_1_indice_10 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_10
     *
     * @return the identifiers declared in rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_10
     */
    private String[] getDeclaredIdentifiers_regraMRE_4_REMEDIACAO_8_criterion_1_indice_10() {
         return identifiers_regraMRE_4_REMEDIACAO_8_criterion_1_indice_10;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_10.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_4_REMEDIACAO_8_criterion_1_indice_10(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_10.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_4_REMEDIACAO_8_criterion_1_indice_10(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_10.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_4_REMEDIACAO_8_criterion_1_indice_10(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_10.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_4_REMEDIACAO_8_criterion_1_indice_10(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_10
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_4_REMEDIACAO_8_criterion_1_indice_10() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_10
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_4_REMEDIACAO_8_criterion_1_indice_10(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_10.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_4_REMEDIACAO_8_criterion_1_indice_10_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(4L));
    }

    /**
     * Condition 1 of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_10.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_4_REMEDIACAO_8_criterion_1_indice_10_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_10 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_4_REMEDIACAO_8_criterion_1_indice_10_cond(int index) {
        switch (index) {
            case 0: return regraMRE_4_REMEDIACAO_8_criterion_1_indice_10_cond_0();
            case 1: return regraMRE_4_REMEDIACAO_8_criterion_1_indice_10_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_10 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_4_REMEDIACAO_8_criterion_1_indice_10(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_4_REMEDIACAO_8_criterion_1_indice_10_cond_0()) return false;
                if (!regraMRE_4_REMEDIACAO_8_criterion_1_indice_10_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_4_REMEDIACAO_8_criterion_1_indice_10(int declIndex) {
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
     * Executes the action part of the rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_10
     */
    private void regraMRE_4_REMEDIACAO_8_criterion_1_indice_10() {
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
     * Identifiers of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_11
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_18_criterion_1_indice_11 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_11
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_11
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_18_criterion_1_indice_11() {
         return identifiers_regraMRE_6_REMEDIACAO_18_criterion_1_indice_11;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_11.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_18_criterion_1_indice_11(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_11.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_18_criterion_1_indice_11(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_11.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_18_criterion_1_indice_11(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_11.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_18_criterion_1_indice_11(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_11
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_18_criterion_1_indice_11() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_11
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_18_criterion_1_indice_11(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_11.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_18_criterion_1_indice_11_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_11.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_18_criterion_1_indice_11_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_11 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_18_criterion_1_indice_11_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_18_criterion_1_indice_11_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_18_criterion_1_indice_11_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_11 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_18_criterion_1_indice_11(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_18_criterion_1_indice_11_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_18_criterion_1_indice_11_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_18_criterion_1_indice_11(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_11
     */
    private void regraMRE_6_REMEDIACAO_18_criterion_1_indice_11() {
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
     * Identifiers of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_12
     */
    private String[] identifiers_regraMRE_5_REMEDIACAO_13_criterion_1_indice_12 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_12
     *
     * @return the identifiers declared in rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_12
     */
    private String[] getDeclaredIdentifiers_regraMRE_5_REMEDIACAO_13_criterion_1_indice_12() {
         return identifiers_regraMRE_5_REMEDIACAO_13_criterion_1_indice_12;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_12.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_5_REMEDIACAO_13_criterion_1_indice_12(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_12.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_5_REMEDIACAO_13_criterion_1_indice_12(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_12.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_5_REMEDIACAO_13_criterion_1_indice_12(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_12.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_5_REMEDIACAO_13_criterion_1_indice_12(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_12
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_5_REMEDIACAO_13_criterion_1_indice_12() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_12
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_5_REMEDIACAO_13_criterion_1_indice_12(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_12.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_13_criterion_1_indice_12_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(5L));
    }

    /**
     * Condition 1 of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_12.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_13_criterion_1_indice_12_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_12 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_13_criterion_1_indice_12_cond(int index) {
        switch (index) {
            case 0: return regraMRE_5_REMEDIACAO_13_criterion_1_indice_12_cond_0();
            case 1: return regraMRE_5_REMEDIACAO_13_criterion_1_indice_12_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_12 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_5_REMEDIACAO_13_criterion_1_indice_12(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_5_REMEDIACAO_13_criterion_1_indice_12_cond_0()) return false;
                if (!regraMRE_5_REMEDIACAO_13_criterion_1_indice_12_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_5_REMEDIACAO_13_criterion_1_indice_12(int declIndex) {
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
     * Executes the action part of the rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_12
     */
    private void regraMRE_5_REMEDIACAO_13_criterion_1_indice_12() {
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
     * Identifiers of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_13
     */
    private String[] identifiers_regraMRE_5_REMEDIACAO_14_criterion_1_indice_13 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_13
     *
     * @return the identifiers declared in rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_13
     */
    private String[] getDeclaredIdentifiers_regraMRE_5_REMEDIACAO_14_criterion_1_indice_13() {
         return identifiers_regraMRE_5_REMEDIACAO_14_criterion_1_indice_13;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_13.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_5_REMEDIACAO_14_criterion_1_indice_13(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_13.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_5_REMEDIACAO_14_criterion_1_indice_13(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_13.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_5_REMEDIACAO_14_criterion_1_indice_13(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_13.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_5_REMEDIACAO_14_criterion_1_indice_13(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_13
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_5_REMEDIACAO_14_criterion_1_indice_13() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_13
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_5_REMEDIACAO_14_criterion_1_indice_13(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_13.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_14_criterion_1_indice_13_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(5L));
    }

    /**
     * Condition 1 of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_13.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_14_criterion_1_indice_13_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_13 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_14_criterion_1_indice_13_cond(int index) {
        switch (index) {
            case 0: return regraMRE_5_REMEDIACAO_14_criterion_1_indice_13_cond_0();
            case 1: return regraMRE_5_REMEDIACAO_14_criterion_1_indice_13_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_13 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_5_REMEDIACAO_14_criterion_1_indice_13(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_5_REMEDIACAO_14_criterion_1_indice_13_cond_0()) return false;
                if (!regraMRE_5_REMEDIACAO_14_criterion_1_indice_13_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_5_REMEDIACAO_14_criterion_1_indice_13(int declIndex) {
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
     * Executes the action part of the rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_13
     */
    private void regraMRE_5_REMEDIACAO_14_criterion_1_indice_13() {
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
     * Identifiers of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_14
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_20_criterion_1_indice_14 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_14
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_14
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_20_criterion_1_indice_14() {
         return identifiers_regraMRE_6_REMEDIACAO_20_criterion_1_indice_14;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_14.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_20_criterion_1_indice_14(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_14.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_20_criterion_1_indice_14(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_14.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_20_criterion_1_indice_14(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_14.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_20_criterion_1_indice_14(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_14
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_20_criterion_1_indice_14() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_14
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_20_criterion_1_indice_14(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_14.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_20_criterion_1_indice_14_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_14.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_20_criterion_1_indice_14_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_14 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_20_criterion_1_indice_14_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_20_criterion_1_indice_14_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_20_criterion_1_indice_14_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_14 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_20_criterion_1_indice_14(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_20_criterion_1_indice_14_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_20_criterion_1_indice_14_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_20_criterion_1_indice_14(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_14
     */
    private void regraMRE_6_REMEDIACAO_20_criterion_1_indice_14() {
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


	
    /**
     * Identifiers of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_15
     */
    private String[] identifiers_regraMRE_1_REMEDIACAO_1_criterion_1_indice_15 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_15
     *
     * @return the identifiers declared in rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_15
     */
    private String[] getDeclaredIdentifiers_regraMRE_1_REMEDIACAO_1_criterion_1_indice_15() {
         return identifiers_regraMRE_1_REMEDIACAO_1_criterion_1_indice_15;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_15.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_1_REMEDIACAO_1_criterion_1_indice_15(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_15.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_1_REMEDIACAO_1_criterion_1_indice_15(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_15.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_1_REMEDIACAO_1_criterion_1_indice_15(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_15.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_1_REMEDIACAO_1_criterion_1_indice_15(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_15
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_1_REMEDIACAO_1_criterion_1_indice_15() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_15
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_1_REMEDIACAO_1_criterion_1_indice_15(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_15.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_1_criterion_1_indice_15_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(1L));
    }

    /**
     * Condition 1 of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_15.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_1_criterion_1_indice_15_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_15 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_1_criterion_1_indice_15_cond(int index) {
        switch (index) {
            case 0: return regraMRE_1_REMEDIACAO_1_criterion_1_indice_15_cond_0();
            case 1: return regraMRE_1_REMEDIACAO_1_criterion_1_indice_15_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_15 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_1_REMEDIACAO_1_criterion_1_indice_15(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_1_REMEDIACAO_1_criterion_1_indice_15_cond_0()) return false;
                if (!regraMRE_1_REMEDIACAO_1_criterion_1_indice_15_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_1_REMEDIACAO_1_criterion_1_indice_15(int declIndex) {
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
     * Executes the action part of the rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_15
     */
    private void regraMRE_1_REMEDIACAO_1_criterion_1_indice_15() {
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
     * Identifiers of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_16
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_4_criterion_1_indice_16 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_16
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_16
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_4_criterion_1_indice_16() {
         return identifiers_regraMRE_2_REMEDIACAO_4_criterion_1_indice_16;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_16.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_4_criterion_1_indice_16(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_16.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_4_criterion_1_indice_16(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_16.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_4_criterion_1_indice_16(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_16.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_4_criterion_1_indice_16(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_16
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_4_criterion_1_indice_16() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_16
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_4_criterion_1_indice_16(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_16.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_4_criterion_1_indice_16_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_16.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_4_criterion_1_indice_16_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_16 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_4_criterion_1_indice_16_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_4_criterion_1_indice_16_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_4_criterion_1_indice_16_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_16 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_4_criterion_1_indice_16(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_4_criterion_1_indice_16_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_4_criterion_1_indice_16_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_4_criterion_1_indice_16(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_16
     */
    private void regraMRE_2_REMEDIACAO_4_criterion_1_indice_16() {
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
     * Identifiers of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_17
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_5_criterion_1_indice_17 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_17
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_17
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_5_criterion_1_indice_17() {
         return identifiers_regraMRE_2_REMEDIACAO_5_criterion_1_indice_17;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_17.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_5_criterion_1_indice_17(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_17.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_5_criterion_1_indice_17(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_17.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_5_criterion_1_indice_17(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_17.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_5_criterion_1_indice_17(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_17
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_5_criterion_1_indice_17() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_17
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_5_criterion_1_indice_17(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_17.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_5_criterion_1_indice_17_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_17.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_5_criterion_1_indice_17_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_17 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_5_criterion_1_indice_17_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_5_criterion_1_indice_17_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_5_criterion_1_indice_17_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_17 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_5_criterion_1_indice_17(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_5_criterion_1_indice_17_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_5_criterion_1_indice_17_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_5_criterion_1_indice_17(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_17
     */
    private void regraMRE_2_REMEDIACAO_5_criterion_1_indice_17() {
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
     * Identifiers of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_18
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_15_criterion_1_indice_18 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_18
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_18
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_15_criterion_1_indice_18() {
         return identifiers_regraMRE_6_REMEDIACAO_15_criterion_1_indice_18;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_18.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_15_criterion_1_indice_18(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_18.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_15_criterion_1_indice_18(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_18.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_15_criterion_1_indice_18(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_18.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_15_criterion_1_indice_18(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_18
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_15_criterion_1_indice_18() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_18
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_15_criterion_1_indice_18(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_18.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_15_criterion_1_indice_18_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_18.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_15_criterion_1_indice_18_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_18 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_15_criterion_1_indice_18_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_15_criterion_1_indice_18_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_15_criterion_1_indice_18_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_18 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_15_criterion_1_indice_18(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_15_criterion_1_indice_18_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_15_criterion_1_indice_18_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_15_criterion_1_indice_18(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_18
     */
    private void regraMRE_6_REMEDIACAO_15_criterion_1_indice_18() {
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
     * Identifiers of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_19
     */
    private String[] identifiers_regraMRE_1_REMEDIACAO_2_criterion_1_indice_19 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_19
     *
     * @return the identifiers declared in rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_19
     */
    private String[] getDeclaredIdentifiers_regraMRE_1_REMEDIACAO_2_criterion_1_indice_19() {
         return identifiers_regraMRE_1_REMEDIACAO_2_criterion_1_indice_19;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_19.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_1_REMEDIACAO_2_criterion_1_indice_19(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_19.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_1_REMEDIACAO_2_criterion_1_indice_19(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_19.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_1_REMEDIACAO_2_criterion_1_indice_19(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_19.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_1_REMEDIACAO_2_criterion_1_indice_19(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_19
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_1_REMEDIACAO_2_criterion_1_indice_19() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_19
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_1_REMEDIACAO_2_criterion_1_indice_19(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_19.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_2_criterion_1_indice_19_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(1L));
    }

    /**
     * Condition 1 of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_19.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_2_criterion_1_indice_19_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_19 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_2_criterion_1_indice_19_cond(int index) {
        switch (index) {
            case 0: return regraMRE_1_REMEDIACAO_2_criterion_1_indice_19_cond_0();
            case 1: return regraMRE_1_REMEDIACAO_2_criterion_1_indice_19_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_19 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_1_REMEDIACAO_2_criterion_1_indice_19(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_1_REMEDIACAO_2_criterion_1_indice_19_cond_0()) return false;
                if (!regraMRE_1_REMEDIACAO_2_criterion_1_indice_19_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_1_REMEDIACAO_2_criterion_1_indice_19(int declIndex) {
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
     * Executes the action part of the rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_19
     */
    private void regraMRE_1_REMEDIACAO_2_criterion_1_indice_19() {
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
     * Identifiers of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_20
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_6_criterion_1_indice_20 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_20
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_20
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_6_criterion_1_indice_20() {
         return identifiers_regraMRE_2_REMEDIACAO_6_criterion_1_indice_20;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_20.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_6_criterion_1_indice_20(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_20.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_6_criterion_1_indice_20(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_20.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_6_criterion_1_indice_20(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_20.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_6_criterion_1_indice_20(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_20
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_6_criterion_1_indice_20() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_20
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_6_criterion_1_indice_20(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_20.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_6_criterion_1_indice_20_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_20.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_6_criterion_1_indice_20_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_20 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_6_criterion_1_indice_20_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_6_criterion_1_indice_20_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_6_criterion_1_indice_20_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_20 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_6_criterion_1_indice_20(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_6_criterion_1_indice_20_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_6_criterion_1_indice_20_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_6_criterion_1_indice_20(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_20
     */
    private void regraMRE_2_REMEDIACAO_6_criterion_1_indice_20() {
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
     * Identifiers of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_21
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_16_criterion_1_indice_21 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_21
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_21
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_16_criterion_1_indice_21() {
         return identifiers_regraMRE_6_REMEDIACAO_16_criterion_1_indice_21;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_21.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_16_criterion_1_indice_21(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_21.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_16_criterion_1_indice_21(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_21.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_16_criterion_1_indice_21(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_21.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_16_criterion_1_indice_21(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_21
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_16_criterion_1_indice_21() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_21
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_16_criterion_1_indice_21(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_21.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_16_criterion_1_indice_21_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_21.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_16_criterion_1_indice_21_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_21 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_16_criterion_1_indice_21_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_16_criterion_1_indice_21_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_16_criterion_1_indice_21_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_21 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_16_criterion_1_indice_21(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_16_criterion_1_indice_21_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_16_criterion_1_indice_21_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_16_criterion_1_indice_21(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_21
     */
    private void regraMRE_6_REMEDIACAO_16_criterion_1_indice_21() {
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
     * Identifiers of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_22
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_3_criterion_1_indice_22 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_22
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_22
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_3_criterion_1_indice_22() {
         return identifiers_regraMRE_2_REMEDIACAO_3_criterion_1_indice_22;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_22.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_3_criterion_1_indice_22(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_22.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_3_criterion_1_indice_22(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_22.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_3_criterion_1_indice_22(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_22.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_3_criterion_1_indice_22(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_22
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_3_criterion_1_indice_22() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_22
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_3_criterion_1_indice_22(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_22.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_3_criterion_1_indice_22_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_22.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_3_criterion_1_indice_22_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_22 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_3_criterion_1_indice_22_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_3_criterion_1_indice_22_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_3_criterion_1_indice_22_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_22 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_3_criterion_1_indice_22(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_3_criterion_1_indice_22_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_3_criterion_1_indice_22_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_3_criterion_1_indice_22(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_22
     */
    private void regraMRE_2_REMEDIACAO_3_criterion_1_indice_22() {
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
     * Identifiers of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_23
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_7_criterion_1_indice_23 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_23
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_23
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_7_criterion_1_indice_23() {
         return identifiers_regraMRE_2_REMEDIACAO_7_criterion_1_indice_23;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_23.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_7_criterion_1_indice_23(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_23.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_7_criterion_1_indice_23(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_23.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_7_criterion_1_indice_23(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_23.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_7_criterion_1_indice_23(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_23
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_7_criterion_1_indice_23() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_23
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_7_criterion_1_indice_23(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_23.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_7_criterion_1_indice_23_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_23.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_7_criterion_1_indice_23_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_23 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_7_criterion_1_indice_23_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_7_criterion_1_indice_23_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_7_criterion_1_indice_23_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_23 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_7_criterion_1_indice_23(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_7_criterion_1_indice_23_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_7_criterion_1_indice_23_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_7_criterion_1_indice_23(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_23
     */
    private void regraMRE_2_REMEDIACAO_7_criterion_1_indice_23() {
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
     * Identifiers of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_24
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_17_criterion_1_indice_24 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_24
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_24
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_17_criterion_1_indice_24() {
         return identifiers_regraMRE_6_REMEDIACAO_17_criterion_1_indice_24;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_24.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_17_criterion_1_indice_24(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_24.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_17_criterion_1_indice_24(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_24.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_17_criterion_1_indice_24(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_24.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_17_criterion_1_indice_24(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_24
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_17_criterion_1_indice_24() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_24
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_17_criterion_1_indice_24(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_24.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_17_criterion_1_indice_24_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_24.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_17_criterion_1_indice_24_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_24 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_17_criterion_1_indice_24_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_17_criterion_1_indice_24_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_17_criterion_1_indice_24_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_24 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_17_criterion_1_indice_24(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_17_criterion_1_indice_24_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_17_criterion_1_indice_24_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_17_criterion_1_indice_24(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_24
     */
    private void regraMRE_6_REMEDIACAO_17_criterion_1_indice_24() {
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
     * Identifiers of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_25
     */
    private String[] identifiers_regraMRE_4_REMEDIACAO_8_criterion_1_indice_25 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_25
     *
     * @return the identifiers declared in rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_25
     */
    private String[] getDeclaredIdentifiers_regraMRE_4_REMEDIACAO_8_criterion_1_indice_25() {
         return identifiers_regraMRE_4_REMEDIACAO_8_criterion_1_indice_25;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_25.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_4_REMEDIACAO_8_criterion_1_indice_25(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_25.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_4_REMEDIACAO_8_criterion_1_indice_25(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_25.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_4_REMEDIACAO_8_criterion_1_indice_25(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_25.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_4_REMEDIACAO_8_criterion_1_indice_25(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_25
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_4_REMEDIACAO_8_criterion_1_indice_25() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_25
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_4_REMEDIACAO_8_criterion_1_indice_25(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_25.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_4_REMEDIACAO_8_criterion_1_indice_25_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(4L));
    }

    /**
     * Condition 1 of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_25.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_4_REMEDIACAO_8_criterion_1_indice_25_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_25 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_4_REMEDIACAO_8_criterion_1_indice_25_cond(int index) {
        switch (index) {
            case 0: return regraMRE_4_REMEDIACAO_8_criterion_1_indice_25_cond_0();
            case 1: return regraMRE_4_REMEDIACAO_8_criterion_1_indice_25_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_25 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_4_REMEDIACAO_8_criterion_1_indice_25(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_4_REMEDIACAO_8_criterion_1_indice_25_cond_0()) return false;
                if (!regraMRE_4_REMEDIACAO_8_criterion_1_indice_25_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_4_REMEDIACAO_8_criterion_1_indice_25(int declIndex) {
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
     * Executes the action part of the rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_25
     */
    private void regraMRE_4_REMEDIACAO_8_criterion_1_indice_25() {
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
     * Identifiers of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_26
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_18_criterion_1_indice_26 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_26
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_26
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_18_criterion_1_indice_26() {
         return identifiers_regraMRE_6_REMEDIACAO_18_criterion_1_indice_26;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_26.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_18_criterion_1_indice_26(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_26.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_18_criterion_1_indice_26(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_26.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_18_criterion_1_indice_26(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_26.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_18_criterion_1_indice_26(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_26
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_18_criterion_1_indice_26() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_26
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_18_criterion_1_indice_26(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_26.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_18_criterion_1_indice_26_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_26.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_18_criterion_1_indice_26_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_26 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_18_criterion_1_indice_26_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_18_criterion_1_indice_26_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_18_criterion_1_indice_26_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_26 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_18_criterion_1_indice_26(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_18_criterion_1_indice_26_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_18_criterion_1_indice_26_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_18_criterion_1_indice_26(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_26
     */
    private void regraMRE_6_REMEDIACAO_18_criterion_1_indice_26() {
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
     * Identifiers of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_27
     */
    private String[] identifiers_regraMRE_5_REMEDIACAO_13_criterion_1_indice_27 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_27
     *
     * @return the identifiers declared in rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_27
     */
    private String[] getDeclaredIdentifiers_regraMRE_5_REMEDIACAO_13_criterion_1_indice_27() {
         return identifiers_regraMRE_5_REMEDIACAO_13_criterion_1_indice_27;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_27.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_5_REMEDIACAO_13_criterion_1_indice_27(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_27.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_5_REMEDIACAO_13_criterion_1_indice_27(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_27.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_5_REMEDIACAO_13_criterion_1_indice_27(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_27.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_5_REMEDIACAO_13_criterion_1_indice_27(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_27
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_5_REMEDIACAO_13_criterion_1_indice_27() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_27
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_5_REMEDIACAO_13_criterion_1_indice_27(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_27.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_13_criterion_1_indice_27_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(5L));
    }

    /**
     * Condition 1 of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_27.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_13_criterion_1_indice_27_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_27 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_13_criterion_1_indice_27_cond(int index) {
        switch (index) {
            case 0: return regraMRE_5_REMEDIACAO_13_criterion_1_indice_27_cond_0();
            case 1: return regraMRE_5_REMEDIACAO_13_criterion_1_indice_27_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_27 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_5_REMEDIACAO_13_criterion_1_indice_27(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_5_REMEDIACAO_13_criterion_1_indice_27_cond_0()) return false;
                if (!regraMRE_5_REMEDIACAO_13_criterion_1_indice_27_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_5_REMEDIACAO_13_criterion_1_indice_27(int declIndex) {
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
     * Executes the action part of the rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_27
     */
    private void regraMRE_5_REMEDIACAO_13_criterion_1_indice_27() {
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
     * Identifiers of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_28
     */
    private String[] identifiers_regraMRE_5_REMEDIACAO_14_criterion_1_indice_28 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_28
     *
     * @return the identifiers declared in rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_28
     */
    private String[] getDeclaredIdentifiers_regraMRE_5_REMEDIACAO_14_criterion_1_indice_28() {
         return identifiers_regraMRE_5_REMEDIACAO_14_criterion_1_indice_28;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_28.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_5_REMEDIACAO_14_criterion_1_indice_28(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_28.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_5_REMEDIACAO_14_criterion_1_indice_28(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_28.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_5_REMEDIACAO_14_criterion_1_indice_28(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_28.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_5_REMEDIACAO_14_criterion_1_indice_28(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_28
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_5_REMEDIACAO_14_criterion_1_indice_28() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_28
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_5_REMEDIACAO_14_criterion_1_indice_28(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_28.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_14_criterion_1_indice_28_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(5L));
    }

    /**
     * Condition 1 of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_28.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_14_criterion_1_indice_28_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_28 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_14_criterion_1_indice_28_cond(int index) {
        switch (index) {
            case 0: return regraMRE_5_REMEDIACAO_14_criterion_1_indice_28_cond_0();
            case 1: return regraMRE_5_REMEDIACAO_14_criterion_1_indice_28_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_28 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_5_REMEDIACAO_14_criterion_1_indice_28(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_5_REMEDIACAO_14_criterion_1_indice_28_cond_0()) return false;
                if (!regraMRE_5_REMEDIACAO_14_criterion_1_indice_28_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_5_REMEDIACAO_14_criterion_1_indice_28(int declIndex) {
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
     * Executes the action part of the rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_28
     */
    private void regraMRE_5_REMEDIACAO_14_criterion_1_indice_28() {
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
     * Identifiers of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_29
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_20_criterion_1_indice_29 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_29
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_29
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_20_criterion_1_indice_29() {
         return identifiers_regraMRE_6_REMEDIACAO_20_criterion_1_indice_29;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_29.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_20_criterion_1_indice_29(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_29.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_20_criterion_1_indice_29(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_29.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_20_criterion_1_indice_29(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_29.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_20_criterion_1_indice_29(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_29
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_20_criterion_1_indice_29() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_29
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_20_criterion_1_indice_29(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_29.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_20_criterion_1_indice_29_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_29.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_20_criterion_1_indice_29_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_29 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_20_criterion_1_indice_29_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_20_criterion_1_indice_29_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_20_criterion_1_indice_29_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_29 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_20_criterion_1_indice_29(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_20_criterion_1_indice_29_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_20_criterion_1_indice_29_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_20_criterion_1_indice_29(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_29
     */
    private void regraMRE_6_REMEDIACAO_20_criterion_1_indice_29() {
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


	
    /**
     * Identifiers of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_30
     */
    private String[] identifiers_regraMRE_1_REMEDIACAO_1_criterion_1_indice_30 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_30
     *
     * @return the identifiers declared in rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_30
     */
    private String[] getDeclaredIdentifiers_regraMRE_1_REMEDIACAO_1_criterion_1_indice_30() {
         return identifiers_regraMRE_1_REMEDIACAO_1_criterion_1_indice_30;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_30.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_1_REMEDIACAO_1_criterion_1_indice_30(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_30.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_1_REMEDIACAO_1_criterion_1_indice_30(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_30.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_1_REMEDIACAO_1_criterion_1_indice_30(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_30.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_1_REMEDIACAO_1_criterion_1_indice_30(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_30
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_1_REMEDIACAO_1_criterion_1_indice_30() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_30
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_1_REMEDIACAO_1_criterion_1_indice_30(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_30.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_1_criterion_1_indice_30_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(1L));
    }

    /**
     * Condition 1 of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_30.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_1_criterion_1_indice_30_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_30 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_1_criterion_1_indice_30_cond(int index) {
        switch (index) {
            case 0: return regraMRE_1_REMEDIACAO_1_criterion_1_indice_30_cond_0();
            case 1: return regraMRE_1_REMEDIACAO_1_criterion_1_indice_30_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_30 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_1_REMEDIACAO_1_criterion_1_indice_30(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_1_REMEDIACAO_1_criterion_1_indice_30_cond_0()) return false;
                if (!regraMRE_1_REMEDIACAO_1_criterion_1_indice_30_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_1_REMEDIACAO_1_criterion_1_indice_30(int declIndex) {
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
     * Executes the action part of the rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_30
     */
    private void regraMRE_1_REMEDIACAO_1_criterion_1_indice_30() {
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
			System.out.println("Exibição de MRE 1 - MRE 1");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_31
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_4_criterion_1_indice_31 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_31
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_31
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_4_criterion_1_indice_31() {
         return identifiers_regraMRE_2_REMEDIACAO_4_criterion_1_indice_31;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_31.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_4_criterion_1_indice_31(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_31.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_4_criterion_1_indice_31(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_31.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_4_criterion_1_indice_31(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_31.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_4_criterion_1_indice_31(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_31
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_4_criterion_1_indice_31() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_31
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_4_criterion_1_indice_31(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_31.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_4_criterion_1_indice_31_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_31.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_4_criterion_1_indice_31_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_31 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_4_criterion_1_indice_31_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_4_criterion_1_indice_31_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_4_criterion_1_indice_31_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_31 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_4_criterion_1_indice_31(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_4_criterion_1_indice_31_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_4_criterion_1_indice_31_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_4_criterion_1_indice_31(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_31
     */
    private void regraMRE_2_REMEDIACAO_4_criterion_1_indice_31() {
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
			System.out.println("Exibição de MRE 2 - MRE 2");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_32
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_5_criterion_1_indice_32 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_32
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_32
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_5_criterion_1_indice_32() {
         return identifiers_regraMRE_2_REMEDIACAO_5_criterion_1_indice_32;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_32.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_5_criterion_1_indice_32(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_32.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_5_criterion_1_indice_32(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_32.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_5_criterion_1_indice_32(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_32.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_5_criterion_1_indice_32(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_32
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_5_criterion_1_indice_32() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_32
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_5_criterion_1_indice_32(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_32.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_5_criterion_1_indice_32_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_32.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_5_criterion_1_indice_32_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_32 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_5_criterion_1_indice_32_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_5_criterion_1_indice_32_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_5_criterion_1_indice_32_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_32 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_5_criterion_1_indice_32(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_5_criterion_1_indice_32_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_5_criterion_1_indice_32_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_5_criterion_1_indice_32(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_32
     */
    private void regraMRE_2_REMEDIACAO_5_criterion_1_indice_32() {
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
			System.out.println("Exibição de MRE 2 - MRE 2");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_33
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_15_criterion_1_indice_33 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_33
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_33
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_15_criterion_1_indice_33() {
         return identifiers_regraMRE_6_REMEDIACAO_15_criterion_1_indice_33;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_33.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_15_criterion_1_indice_33(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_33.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_15_criterion_1_indice_33(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_33.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_15_criterion_1_indice_33(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_33.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_15_criterion_1_indice_33(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_33
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_15_criterion_1_indice_33() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_33
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_15_criterion_1_indice_33(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_33.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_15_criterion_1_indice_33_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_33.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_15_criterion_1_indice_33_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_33 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_15_criterion_1_indice_33_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_15_criterion_1_indice_33_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_15_criterion_1_indice_33_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_33 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_15_criterion_1_indice_33(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_15_criterion_1_indice_33_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_15_criterion_1_indice_33_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_15_criterion_1_indice_33(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_33
     */
    private void regraMRE_6_REMEDIACAO_15_criterion_1_indice_33() {
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
			System.out.println("Exibição de MRE 6 - MRE 6");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_34
     */
    private String[] identifiers_regraMRE_1_REMEDIACAO_2_criterion_1_indice_34 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_34
     *
     * @return the identifiers declared in rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_34
     */
    private String[] getDeclaredIdentifiers_regraMRE_1_REMEDIACAO_2_criterion_1_indice_34() {
         return identifiers_regraMRE_1_REMEDIACAO_2_criterion_1_indice_34;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_34.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_1_REMEDIACAO_2_criterion_1_indice_34(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_34.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_1_REMEDIACAO_2_criterion_1_indice_34(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_34.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_1_REMEDIACAO_2_criterion_1_indice_34(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_34.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_1_REMEDIACAO_2_criterion_1_indice_34(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_34
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_1_REMEDIACAO_2_criterion_1_indice_34() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_34
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_1_REMEDIACAO_2_criterion_1_indice_34(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_34.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_2_criterion_1_indice_34_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(1L));
    }

    /**
     * Condition 1 of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_34.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_2_criterion_1_indice_34_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_34 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_2_criterion_1_indice_34_cond(int index) {
        switch (index) {
            case 0: return regraMRE_1_REMEDIACAO_2_criterion_1_indice_34_cond_0();
            case 1: return regraMRE_1_REMEDIACAO_2_criterion_1_indice_34_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_34 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_1_REMEDIACAO_2_criterion_1_indice_34(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_1_REMEDIACAO_2_criterion_1_indice_34_cond_0()) return false;
                if (!regraMRE_1_REMEDIACAO_2_criterion_1_indice_34_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_1_REMEDIACAO_2_criterion_1_indice_34(int declIndex) {
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
     * Executes the action part of the rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_34
     */
    private void regraMRE_1_REMEDIACAO_2_criterion_1_indice_34() {
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
			System.out.println("Exibição de MRE 1 - MRE 1");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_35
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_6_criterion_1_indice_35 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_35
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_35
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_6_criterion_1_indice_35() {
         return identifiers_regraMRE_2_REMEDIACAO_6_criterion_1_indice_35;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_35.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_6_criterion_1_indice_35(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_35.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_6_criterion_1_indice_35(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_35.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_6_criterion_1_indice_35(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_35.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_6_criterion_1_indice_35(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_35
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_6_criterion_1_indice_35() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_35
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_6_criterion_1_indice_35(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_35.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_6_criterion_1_indice_35_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_35.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_6_criterion_1_indice_35_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_35 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_6_criterion_1_indice_35_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_6_criterion_1_indice_35_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_6_criterion_1_indice_35_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_35 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_6_criterion_1_indice_35(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_6_criterion_1_indice_35_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_6_criterion_1_indice_35_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_6_criterion_1_indice_35(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_35
     */
    private void regraMRE_2_REMEDIACAO_6_criterion_1_indice_35() {
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
			System.out.println("Exibição de MRE 2 - MRE 2");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_36
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_16_criterion_1_indice_36 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_36
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_36
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_16_criterion_1_indice_36() {
         return identifiers_regraMRE_6_REMEDIACAO_16_criterion_1_indice_36;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_36.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_16_criterion_1_indice_36(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_36.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_16_criterion_1_indice_36(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_36.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_16_criterion_1_indice_36(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_36.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_16_criterion_1_indice_36(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_36
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_16_criterion_1_indice_36() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_36
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_16_criterion_1_indice_36(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_36.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_16_criterion_1_indice_36_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_36.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_16_criterion_1_indice_36_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_36 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_16_criterion_1_indice_36_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_16_criterion_1_indice_36_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_16_criterion_1_indice_36_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_36 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_16_criterion_1_indice_36(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_16_criterion_1_indice_36_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_16_criterion_1_indice_36_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_16_criterion_1_indice_36(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_36
     */
    private void regraMRE_6_REMEDIACAO_16_criterion_1_indice_36() {
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
			System.out.println("Exibição de MRE 6 - MRE 6");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_37
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_3_criterion_1_indice_37 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_37
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_37
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_3_criterion_1_indice_37() {
         return identifiers_regraMRE_2_REMEDIACAO_3_criterion_1_indice_37;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_37.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_3_criterion_1_indice_37(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_37.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_3_criterion_1_indice_37(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_37.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_3_criterion_1_indice_37(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_37.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_3_criterion_1_indice_37(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_37
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_3_criterion_1_indice_37() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_37
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_3_criterion_1_indice_37(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_37.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_3_criterion_1_indice_37_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_37.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_3_criterion_1_indice_37_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_37 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_3_criterion_1_indice_37_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_3_criterion_1_indice_37_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_3_criterion_1_indice_37_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_37 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_3_criterion_1_indice_37(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_3_criterion_1_indice_37_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_3_criterion_1_indice_37_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_3_criterion_1_indice_37(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_37
     */
    private void regraMRE_2_REMEDIACAO_3_criterion_1_indice_37() {
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
			System.out.println("Exibição de MRE 2 - MRE 2");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_38
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_7_criterion_1_indice_38 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_38
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_38
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_7_criterion_1_indice_38() {
         return identifiers_regraMRE_2_REMEDIACAO_7_criterion_1_indice_38;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_38.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_7_criterion_1_indice_38(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_38.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_7_criterion_1_indice_38(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_38.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_7_criterion_1_indice_38(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_38.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_7_criterion_1_indice_38(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_38
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_7_criterion_1_indice_38() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_38
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_7_criterion_1_indice_38(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_38.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_7_criterion_1_indice_38_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_38.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_7_criterion_1_indice_38_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_38 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_7_criterion_1_indice_38_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_7_criterion_1_indice_38_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_7_criterion_1_indice_38_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_38 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_7_criterion_1_indice_38(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_7_criterion_1_indice_38_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_7_criterion_1_indice_38_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_7_criterion_1_indice_38(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_38
     */
    private void regraMRE_2_REMEDIACAO_7_criterion_1_indice_38() {
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
			System.out.println("Exibição de MRE 2 - MRE 2");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_39
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_17_criterion_1_indice_39 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_39
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_39
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_17_criterion_1_indice_39() {
         return identifiers_regraMRE_6_REMEDIACAO_17_criterion_1_indice_39;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_39.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_17_criterion_1_indice_39(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_39.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_17_criterion_1_indice_39(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_39.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_17_criterion_1_indice_39(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_39.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_17_criterion_1_indice_39(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_39
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_17_criterion_1_indice_39() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_39
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_17_criterion_1_indice_39(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_39.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_17_criterion_1_indice_39_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_39.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_17_criterion_1_indice_39_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_39 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_17_criterion_1_indice_39_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_17_criterion_1_indice_39_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_17_criterion_1_indice_39_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_39 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_17_criterion_1_indice_39(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_17_criterion_1_indice_39_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_17_criterion_1_indice_39_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_17_criterion_1_indice_39(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_39
     */
    private void regraMRE_6_REMEDIACAO_17_criterion_1_indice_39() {
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
			System.out.println("Exibição de MRE 6 - MRE 6");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_40
     */
    private String[] identifiers_regraMRE_4_REMEDIACAO_8_criterion_1_indice_40 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_40
     *
     * @return the identifiers declared in rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_40
     */
    private String[] getDeclaredIdentifiers_regraMRE_4_REMEDIACAO_8_criterion_1_indice_40() {
         return identifiers_regraMRE_4_REMEDIACAO_8_criterion_1_indice_40;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_40.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_4_REMEDIACAO_8_criterion_1_indice_40(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_40.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_4_REMEDIACAO_8_criterion_1_indice_40(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_40.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_4_REMEDIACAO_8_criterion_1_indice_40(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_40.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_4_REMEDIACAO_8_criterion_1_indice_40(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_40
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_4_REMEDIACAO_8_criterion_1_indice_40() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_40
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_4_REMEDIACAO_8_criterion_1_indice_40(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_40.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_4_REMEDIACAO_8_criterion_1_indice_40_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(4L));
    }

    /**
     * Condition 1 of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_40.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_4_REMEDIACAO_8_criterion_1_indice_40_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_40 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_4_REMEDIACAO_8_criterion_1_indice_40_cond(int index) {
        switch (index) {
            case 0: return regraMRE_4_REMEDIACAO_8_criterion_1_indice_40_cond_0();
            case 1: return regraMRE_4_REMEDIACAO_8_criterion_1_indice_40_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_40 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_4_REMEDIACAO_8_criterion_1_indice_40(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_4_REMEDIACAO_8_criterion_1_indice_40_cond_0()) return false;
                if (!regraMRE_4_REMEDIACAO_8_criterion_1_indice_40_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_4_REMEDIACAO_8_criterion_1_indice_40(int declIndex) {
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
     * Executes the action part of the rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_40
     */
    private void regraMRE_4_REMEDIACAO_8_criterion_1_indice_40() {
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
			System.out.println("Exibição de MRE 4 - MRE 4");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_41
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_18_criterion_1_indice_41 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_41
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_41
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_18_criterion_1_indice_41() {
         return identifiers_regraMRE_6_REMEDIACAO_18_criterion_1_indice_41;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_41.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_18_criterion_1_indice_41(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_41.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_18_criterion_1_indice_41(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_41.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_18_criterion_1_indice_41(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_41.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_18_criterion_1_indice_41(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_41
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_18_criterion_1_indice_41() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_41
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_18_criterion_1_indice_41(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_41.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_18_criterion_1_indice_41_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_41.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_18_criterion_1_indice_41_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_41 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_18_criterion_1_indice_41_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_18_criterion_1_indice_41_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_18_criterion_1_indice_41_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_41 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_18_criterion_1_indice_41(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_18_criterion_1_indice_41_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_18_criterion_1_indice_41_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_18_criterion_1_indice_41(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_41
     */
    private void regraMRE_6_REMEDIACAO_18_criterion_1_indice_41() {
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
			System.out.println("Exibição de MRE 6 - MRE 6");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_42
     */
    private String[] identifiers_regraMRE_5_REMEDIACAO_13_criterion_1_indice_42 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_42
     *
     * @return the identifiers declared in rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_42
     */
    private String[] getDeclaredIdentifiers_regraMRE_5_REMEDIACAO_13_criterion_1_indice_42() {
         return identifiers_regraMRE_5_REMEDIACAO_13_criterion_1_indice_42;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_42.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_5_REMEDIACAO_13_criterion_1_indice_42(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_42.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_5_REMEDIACAO_13_criterion_1_indice_42(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_42.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_5_REMEDIACAO_13_criterion_1_indice_42(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_42.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_5_REMEDIACAO_13_criterion_1_indice_42(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_42
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_5_REMEDIACAO_13_criterion_1_indice_42() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_42
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_5_REMEDIACAO_13_criterion_1_indice_42(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_42.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_13_criterion_1_indice_42_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(5L));
    }

    /**
     * Condition 1 of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_42.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_13_criterion_1_indice_42_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_42 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_13_criterion_1_indice_42_cond(int index) {
        switch (index) {
            case 0: return regraMRE_5_REMEDIACAO_13_criterion_1_indice_42_cond_0();
            case 1: return regraMRE_5_REMEDIACAO_13_criterion_1_indice_42_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_42 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_5_REMEDIACAO_13_criterion_1_indice_42(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_5_REMEDIACAO_13_criterion_1_indice_42_cond_0()) return false;
                if (!regraMRE_5_REMEDIACAO_13_criterion_1_indice_42_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_5_REMEDIACAO_13_criterion_1_indice_42(int declIndex) {
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
     * Executes the action part of the rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_42
     */
    private void regraMRE_5_REMEDIACAO_13_criterion_1_indice_42() {
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
			System.out.println("Exibição de MRE 5 - MRE 5");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_43
     */
    private String[] identifiers_regraMRE_5_REMEDIACAO_14_criterion_1_indice_43 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_43
     *
     * @return the identifiers declared in rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_43
     */
    private String[] getDeclaredIdentifiers_regraMRE_5_REMEDIACAO_14_criterion_1_indice_43() {
         return identifiers_regraMRE_5_REMEDIACAO_14_criterion_1_indice_43;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_43.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_5_REMEDIACAO_14_criterion_1_indice_43(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_43.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_5_REMEDIACAO_14_criterion_1_indice_43(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_43.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_5_REMEDIACAO_14_criterion_1_indice_43(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_43.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_5_REMEDIACAO_14_criterion_1_indice_43(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_43
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_5_REMEDIACAO_14_criterion_1_indice_43() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_43
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_5_REMEDIACAO_14_criterion_1_indice_43(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_43.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_14_criterion_1_indice_43_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(5L));
    }

    /**
     * Condition 1 of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_43.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_14_criterion_1_indice_43_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_43 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_14_criterion_1_indice_43_cond(int index) {
        switch (index) {
            case 0: return regraMRE_5_REMEDIACAO_14_criterion_1_indice_43_cond_0();
            case 1: return regraMRE_5_REMEDIACAO_14_criterion_1_indice_43_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_43 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_5_REMEDIACAO_14_criterion_1_indice_43(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_5_REMEDIACAO_14_criterion_1_indice_43_cond_0()) return false;
                if (!regraMRE_5_REMEDIACAO_14_criterion_1_indice_43_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_5_REMEDIACAO_14_criterion_1_indice_43(int declIndex) {
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
     * Executes the action part of the rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_43
     */
    private void regraMRE_5_REMEDIACAO_14_criterion_1_indice_43() {
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
			System.out.println("Exibição de MRE 5 - MRE 5");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_44
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_20_criterion_1_indice_44 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_44
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_44
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_20_criterion_1_indice_44() {
         return identifiers_regraMRE_6_REMEDIACAO_20_criterion_1_indice_44;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_44.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_20_criterion_1_indice_44(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_44.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_20_criterion_1_indice_44(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_44.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_20_criterion_1_indice_44(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_44.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_20_criterion_1_indice_44(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_44
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_20_criterion_1_indice_44() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_44
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_20_criterion_1_indice_44(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_44.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_20_criterion_1_indice_44_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_44.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_20_criterion_1_indice_44_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_44 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_20_criterion_1_indice_44_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_20_criterion_1_indice_44_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_20_criterion_1_indice_44_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_44 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_20_criterion_1_indice_44(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_20_criterion_1_indice_44_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_20_criterion_1_indice_44_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_20_criterion_1_indice_44(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_44
     */
    private void regraMRE_6_REMEDIACAO_20_criterion_1_indice_44() {
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
			System.out.println("Exibição de MRE 6 - MRE 6");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_45
     */
    private String[] identifiers_regraMRE_1_REMEDIACAO_1_criterion_1_indice_45 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_45
     *
     * @return the identifiers declared in rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_45
     */
    private String[] getDeclaredIdentifiers_regraMRE_1_REMEDIACAO_1_criterion_1_indice_45() {
         return identifiers_regraMRE_1_REMEDIACAO_1_criterion_1_indice_45;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_45.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_1_REMEDIACAO_1_criterion_1_indice_45(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_45.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_1_REMEDIACAO_1_criterion_1_indice_45(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_45.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_1_REMEDIACAO_1_criterion_1_indice_45(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_45.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_1_REMEDIACAO_1_criterion_1_indice_45(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_45
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_1_REMEDIACAO_1_criterion_1_indice_45() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_45
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_1_REMEDIACAO_1_criterion_1_indice_45(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_45.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_1_criterion_1_indice_45_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(1L));
    }

    /**
     * Condition 1 of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_45.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_1_criterion_1_indice_45_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_45 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_1_criterion_1_indice_45_cond(int index) {
        switch (index) {
            case 0: return regraMRE_1_REMEDIACAO_1_criterion_1_indice_45_cond_0();
            case 1: return regraMRE_1_REMEDIACAO_1_criterion_1_indice_45_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_45 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_1_REMEDIACAO_1_criterion_1_indice_45(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_1_REMEDIACAO_1_criterion_1_indice_45_cond_0()) return false;
                if (!regraMRE_1_REMEDIACAO_1_criterion_1_indice_45_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_1_REMEDIACAO_1_criterion_1_indice_45(int declIndex) {
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
     * Executes the action part of the rule regraMRE_1_REMEDIACAO_1_criterion_1_indice_45
     */
    private void regraMRE_1_REMEDIACAO_1_criterion_1_indice_45() {
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
			System.out.println("Exibição de MRE 1 - MRE 1");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_46
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_4_criterion_1_indice_46 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_46
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_46
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_4_criterion_1_indice_46() {
         return identifiers_regraMRE_2_REMEDIACAO_4_criterion_1_indice_46;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_46.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_4_criterion_1_indice_46(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_46.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_4_criterion_1_indice_46(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_46.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_4_criterion_1_indice_46(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_46.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_4_criterion_1_indice_46(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_46
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_4_criterion_1_indice_46() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_46
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_4_criterion_1_indice_46(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_46.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_4_criterion_1_indice_46_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_46.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_4_criterion_1_indice_46_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_46 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_4_criterion_1_indice_46_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_4_criterion_1_indice_46_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_4_criterion_1_indice_46_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_46 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_4_criterion_1_indice_46(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_4_criterion_1_indice_46_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_4_criterion_1_indice_46_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_4_criterion_1_indice_46(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_4_criterion_1_indice_46
     */
    private void regraMRE_2_REMEDIACAO_4_criterion_1_indice_46() {
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
			System.out.println("Exibição de MRE 2 - MRE 2");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_47
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_5_criterion_1_indice_47 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_47
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_47
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_5_criterion_1_indice_47() {
         return identifiers_regraMRE_2_REMEDIACAO_5_criterion_1_indice_47;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_47.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_5_criterion_1_indice_47(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_47.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_5_criterion_1_indice_47(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_47.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_5_criterion_1_indice_47(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_47.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_5_criterion_1_indice_47(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_47
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_5_criterion_1_indice_47() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_47
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_5_criterion_1_indice_47(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_47.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_5_criterion_1_indice_47_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_47.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_5_criterion_1_indice_47_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_47 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_5_criterion_1_indice_47_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_5_criterion_1_indice_47_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_5_criterion_1_indice_47_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_47 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_5_criterion_1_indice_47(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_5_criterion_1_indice_47_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_5_criterion_1_indice_47_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_5_criterion_1_indice_47(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_5_criterion_1_indice_47
     */
    private void regraMRE_2_REMEDIACAO_5_criterion_1_indice_47() {
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
			System.out.println("Exibição de MRE 2 - MRE 2");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_48
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_15_criterion_1_indice_48 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_48
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_48
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_15_criterion_1_indice_48() {
         return identifiers_regraMRE_6_REMEDIACAO_15_criterion_1_indice_48;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_48.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_15_criterion_1_indice_48(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_48.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_15_criterion_1_indice_48(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_48.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_15_criterion_1_indice_48(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_48.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_15_criterion_1_indice_48(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_48
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_15_criterion_1_indice_48() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_48
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_15_criterion_1_indice_48(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_48.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_15_criterion_1_indice_48_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_48.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_15_criterion_1_indice_48_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_48 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_15_criterion_1_indice_48_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_15_criterion_1_indice_48_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_15_criterion_1_indice_48_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_48 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_15_criterion_1_indice_48(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_15_criterion_1_indice_48_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_15_criterion_1_indice_48_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_15_criterion_1_indice_48(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_15_criterion_1_indice_48
     */
    private void regraMRE_6_REMEDIACAO_15_criterion_1_indice_48() {
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
			System.out.println("Exibição de MRE 6 - MRE 6");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_49
     */
    private String[] identifiers_regraMRE_1_REMEDIACAO_2_criterion_1_indice_49 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_49
     *
     * @return the identifiers declared in rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_49
     */
    private String[] getDeclaredIdentifiers_regraMRE_1_REMEDIACAO_2_criterion_1_indice_49() {
         return identifiers_regraMRE_1_REMEDIACAO_2_criterion_1_indice_49;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_49.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_1_REMEDIACAO_2_criterion_1_indice_49(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_49.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_1_REMEDIACAO_2_criterion_1_indice_49(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_49.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_1_REMEDIACAO_2_criterion_1_indice_49(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_49.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_1_REMEDIACAO_2_criterion_1_indice_49(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_49
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_1_REMEDIACAO_2_criterion_1_indice_49() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_49
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_1_REMEDIACAO_2_criterion_1_indice_49(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_49.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_2_criterion_1_indice_49_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(1L));
    }

    /**
     * Condition 1 of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_49.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_2_criterion_1_indice_49_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_49 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_1_REMEDIACAO_2_criterion_1_indice_49_cond(int index) {
        switch (index) {
            case 0: return regraMRE_1_REMEDIACAO_2_criterion_1_indice_49_cond_0();
            case 1: return regraMRE_1_REMEDIACAO_2_criterion_1_indice_49_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_49 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_1_REMEDIACAO_2_criterion_1_indice_49(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_1_REMEDIACAO_2_criterion_1_indice_49_cond_0()) return false;
                if (!regraMRE_1_REMEDIACAO_2_criterion_1_indice_49_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_1_REMEDIACAO_2_criterion_1_indice_49(int declIndex) {
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
     * Executes the action part of the rule regraMRE_1_REMEDIACAO_2_criterion_1_indice_49
     */
    private void regraMRE_1_REMEDIACAO_2_criterion_1_indice_49() {
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
			System.out.println("Exibição de MRE 1 - MRE 1");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_50
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_6_criterion_1_indice_50 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_50
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_50
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_6_criterion_1_indice_50() {
         return identifiers_regraMRE_2_REMEDIACAO_6_criterion_1_indice_50;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_50.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_6_criterion_1_indice_50(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_50.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_6_criterion_1_indice_50(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_50.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_6_criterion_1_indice_50(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_50.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_6_criterion_1_indice_50(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_50
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_6_criterion_1_indice_50() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_50
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_6_criterion_1_indice_50(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_50.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_6_criterion_1_indice_50_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_50.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_6_criterion_1_indice_50_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_50 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_6_criterion_1_indice_50_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_6_criterion_1_indice_50_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_6_criterion_1_indice_50_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_50 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_6_criterion_1_indice_50(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_6_criterion_1_indice_50_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_6_criterion_1_indice_50_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_6_criterion_1_indice_50(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_6_criterion_1_indice_50
     */
    private void regraMRE_2_REMEDIACAO_6_criterion_1_indice_50() {
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
			System.out.println("Exibição de MRE 2 - MRE 2");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_51
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_16_criterion_1_indice_51 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_51
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_51
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_16_criterion_1_indice_51() {
         return identifiers_regraMRE_6_REMEDIACAO_16_criterion_1_indice_51;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_51.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_16_criterion_1_indice_51(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_51.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_16_criterion_1_indice_51(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_51.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_16_criterion_1_indice_51(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_51.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_16_criterion_1_indice_51(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_51
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_16_criterion_1_indice_51() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_51
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_16_criterion_1_indice_51(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_51.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_16_criterion_1_indice_51_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_51.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_16_criterion_1_indice_51_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_51 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_16_criterion_1_indice_51_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_16_criterion_1_indice_51_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_16_criterion_1_indice_51_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_51 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_16_criterion_1_indice_51(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_16_criterion_1_indice_51_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_16_criterion_1_indice_51_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_16_criterion_1_indice_51(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_16_criterion_1_indice_51
     */
    private void regraMRE_6_REMEDIACAO_16_criterion_1_indice_51() {
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
			System.out.println("Exibição de MRE 6 - MRE 6");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_52
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_3_criterion_1_indice_52 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_52
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_52
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_3_criterion_1_indice_52() {
         return identifiers_regraMRE_2_REMEDIACAO_3_criterion_1_indice_52;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_52.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_3_criterion_1_indice_52(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_52.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_3_criterion_1_indice_52(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_52.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_3_criterion_1_indice_52(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_52.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_3_criterion_1_indice_52(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_52
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_3_criterion_1_indice_52() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_52
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_3_criterion_1_indice_52(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_52.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_3_criterion_1_indice_52_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_52.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_3_criterion_1_indice_52_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_52 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_3_criterion_1_indice_52_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_3_criterion_1_indice_52_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_3_criterion_1_indice_52_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_52 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_3_criterion_1_indice_52(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_3_criterion_1_indice_52_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_3_criterion_1_indice_52_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_3_criterion_1_indice_52(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_3_criterion_1_indice_52
     */
    private void regraMRE_2_REMEDIACAO_3_criterion_1_indice_52() {
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
			System.out.println("Exibição de MRE 2 - MRE 2");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_53
     */
    private String[] identifiers_regraMRE_2_REMEDIACAO_7_criterion_1_indice_53 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_53
     *
     * @return the identifiers declared in rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_53
     */
    private String[] getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_7_criterion_1_indice_53() {
         return identifiers_regraMRE_2_REMEDIACAO_7_criterion_1_indice_53;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_53.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_2_REMEDIACAO_7_criterion_1_indice_53(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_53.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_2_REMEDIACAO_7_criterion_1_indice_53(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_53.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_2_REMEDIACAO_7_criterion_1_indice_53(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_53.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_2_REMEDIACAO_7_criterion_1_indice_53(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_53
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_2_REMEDIACAO_7_criterion_1_indice_53() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_53
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_2_REMEDIACAO_7_criterion_1_indice_53(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_53.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_7_criterion_1_indice_53_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(2L));
    }

    /**
     * Condition 1 of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_53.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_7_criterion_1_indice_53_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_53 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_2_REMEDIACAO_7_criterion_1_indice_53_cond(int index) {
        switch (index) {
            case 0: return regraMRE_2_REMEDIACAO_7_criterion_1_indice_53_cond_0();
            case 1: return regraMRE_2_REMEDIACAO_7_criterion_1_indice_53_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_53 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_7_criterion_1_indice_53(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_2_REMEDIACAO_7_criterion_1_indice_53_cond_0()) return false;
                if (!regraMRE_2_REMEDIACAO_7_criterion_1_indice_53_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_2_REMEDIACAO_7_criterion_1_indice_53(int declIndex) {
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
     * Executes the action part of the rule regraMRE_2_REMEDIACAO_7_criterion_1_indice_53
     */
    private void regraMRE_2_REMEDIACAO_7_criterion_1_indice_53() {
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
			System.out.println("Exibição de MRE 2 - MRE 2");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_54
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_17_criterion_1_indice_54 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_54
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_54
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_17_criterion_1_indice_54() {
         return identifiers_regraMRE_6_REMEDIACAO_17_criterion_1_indice_54;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_54.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_17_criterion_1_indice_54(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_54.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_17_criterion_1_indice_54(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_54.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_17_criterion_1_indice_54(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_54.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_17_criterion_1_indice_54(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_54
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_17_criterion_1_indice_54() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_54
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_17_criterion_1_indice_54(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_54.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_17_criterion_1_indice_54_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_54.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_17_criterion_1_indice_54_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_54 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_17_criterion_1_indice_54_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_17_criterion_1_indice_54_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_17_criterion_1_indice_54_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_54 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_17_criterion_1_indice_54(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_17_criterion_1_indice_54_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_17_criterion_1_indice_54_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_17_criterion_1_indice_54(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_17_criterion_1_indice_54
     */
    private void regraMRE_6_REMEDIACAO_17_criterion_1_indice_54() {
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
			System.out.println("Exibição de MRE 6 - MRE 6");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_55
     */
    private String[] identifiers_regraMRE_4_REMEDIACAO_8_criterion_1_indice_55 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_55
     *
     * @return the identifiers declared in rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_55
     */
    private String[] getDeclaredIdentifiers_regraMRE_4_REMEDIACAO_8_criterion_1_indice_55() {
         return identifiers_regraMRE_4_REMEDIACAO_8_criterion_1_indice_55;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_55.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_4_REMEDIACAO_8_criterion_1_indice_55(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_55.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_4_REMEDIACAO_8_criterion_1_indice_55(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_55.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_4_REMEDIACAO_8_criterion_1_indice_55(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_55.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_4_REMEDIACAO_8_criterion_1_indice_55(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_55
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_4_REMEDIACAO_8_criterion_1_indice_55() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_55
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_4_REMEDIACAO_8_criterion_1_indice_55(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_55.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_4_REMEDIACAO_8_criterion_1_indice_55_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(4L));
    }

    /**
     * Condition 1 of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_55.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_4_REMEDIACAO_8_criterion_1_indice_55_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_55 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_4_REMEDIACAO_8_criterion_1_indice_55_cond(int index) {
        switch (index) {
            case 0: return regraMRE_4_REMEDIACAO_8_criterion_1_indice_55_cond_0();
            case 1: return regraMRE_4_REMEDIACAO_8_criterion_1_indice_55_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_55 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_4_REMEDIACAO_8_criterion_1_indice_55(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_4_REMEDIACAO_8_criterion_1_indice_55_cond_0()) return false;
                if (!regraMRE_4_REMEDIACAO_8_criterion_1_indice_55_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_4_REMEDIACAO_8_criterion_1_indice_55(int declIndex) {
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
     * Executes the action part of the rule regraMRE_4_REMEDIACAO_8_criterion_1_indice_55
     */
    private void regraMRE_4_REMEDIACAO_8_criterion_1_indice_55() {
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
			System.out.println("Exibição de MRE 4 - MRE 4");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_56
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_18_criterion_1_indice_56 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_56
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_56
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_18_criterion_1_indice_56() {
         return identifiers_regraMRE_6_REMEDIACAO_18_criterion_1_indice_56;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_56.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_18_criterion_1_indice_56(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_56.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_18_criterion_1_indice_56(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_56.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_18_criterion_1_indice_56(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_56.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_18_criterion_1_indice_56(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_56
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_18_criterion_1_indice_56() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_56
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_18_criterion_1_indice_56(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_56.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_18_criterion_1_indice_56_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_56.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_18_criterion_1_indice_56_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_56 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_18_criterion_1_indice_56_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_18_criterion_1_indice_56_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_18_criterion_1_indice_56_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_56 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_18_criterion_1_indice_56(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_18_criterion_1_indice_56_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_18_criterion_1_indice_56_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_18_criterion_1_indice_56(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_18_criterion_1_indice_56
     */
    private void regraMRE_6_REMEDIACAO_18_criterion_1_indice_56() {
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
			System.out.println("Exibição de MRE 6 - MRE 6");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_57
     */
    private String[] identifiers_regraMRE_5_REMEDIACAO_13_criterion_1_indice_57 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_57
     *
     * @return the identifiers declared in rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_57
     */
    private String[] getDeclaredIdentifiers_regraMRE_5_REMEDIACAO_13_criterion_1_indice_57() {
         return identifiers_regraMRE_5_REMEDIACAO_13_criterion_1_indice_57;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_57.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_5_REMEDIACAO_13_criterion_1_indice_57(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_57.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_5_REMEDIACAO_13_criterion_1_indice_57(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_57.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_5_REMEDIACAO_13_criterion_1_indice_57(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_57.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_5_REMEDIACAO_13_criterion_1_indice_57(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_57
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_5_REMEDIACAO_13_criterion_1_indice_57() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_57
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_5_REMEDIACAO_13_criterion_1_indice_57(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_57.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_13_criterion_1_indice_57_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(5L));
    }

    /**
     * Condition 1 of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_57.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_13_criterion_1_indice_57_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_57 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_13_criterion_1_indice_57_cond(int index) {
        switch (index) {
            case 0: return regraMRE_5_REMEDIACAO_13_criterion_1_indice_57_cond_0();
            case 1: return regraMRE_5_REMEDIACAO_13_criterion_1_indice_57_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_57 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_5_REMEDIACAO_13_criterion_1_indice_57(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_5_REMEDIACAO_13_criterion_1_indice_57_cond_0()) return false;
                if (!regraMRE_5_REMEDIACAO_13_criterion_1_indice_57_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_5_REMEDIACAO_13_criterion_1_indice_57(int declIndex) {
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
     * Executes the action part of the rule regraMRE_5_REMEDIACAO_13_criterion_1_indice_57
     */
    private void regraMRE_5_REMEDIACAO_13_criterion_1_indice_57() {
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
			System.out.println("Exibição de MRE 5 - MRE 5");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_58
     */
    private String[] identifiers_regraMRE_5_REMEDIACAO_14_criterion_1_indice_58 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_58
     *
     * @return the identifiers declared in rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_58
     */
    private String[] getDeclaredIdentifiers_regraMRE_5_REMEDIACAO_14_criterion_1_indice_58() {
         return identifiers_regraMRE_5_REMEDIACAO_14_criterion_1_indice_58;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_58.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_5_REMEDIACAO_14_criterion_1_indice_58(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_58.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_5_REMEDIACAO_14_criterion_1_indice_58(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_58.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_5_REMEDIACAO_14_criterion_1_indice_58(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_58.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_5_REMEDIACAO_14_criterion_1_indice_58(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_58
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_5_REMEDIACAO_14_criterion_1_indice_58() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_58
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_5_REMEDIACAO_14_criterion_1_indice_58(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_58.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_14_criterion_1_indice_58_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(5L));
    }

    /**
     * Condition 1 of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_58.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_14_criterion_1_indice_58_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_58 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_5_REMEDIACAO_14_criterion_1_indice_58_cond(int index) {
        switch (index) {
            case 0: return regraMRE_5_REMEDIACAO_14_criterion_1_indice_58_cond_0();
            case 1: return regraMRE_5_REMEDIACAO_14_criterion_1_indice_58_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_58 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_5_REMEDIACAO_14_criterion_1_indice_58(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_5_REMEDIACAO_14_criterion_1_indice_58_cond_0()) return false;
                if (!regraMRE_5_REMEDIACAO_14_criterion_1_indice_58_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_5_REMEDIACAO_14_criterion_1_indice_58(int declIndex) {
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
     * Executes the action part of the rule regraMRE_5_REMEDIACAO_14_criterion_1_indice_58
     */
    private void regraMRE_5_REMEDIACAO_14_criterion_1_indice_58() {
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
			System.out.println("Exibição de MRE 5 - MRE 5");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_59
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_20_criterion_1_indice_59 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_59
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_59
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_20_criterion_1_indice_59() {
         return identifiers_regraMRE_6_REMEDIACAO_20_criterion_1_indice_59;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_59.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_20_criterion_1_indice_59(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_59.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_20_criterion_1_indice_59(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_59.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_20_criterion_1_indice_59(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_59.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_20_criterion_1_indice_59(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_59
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_20_criterion_1_indice_59() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_59
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_20_criterion_1_indice_59(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_59.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_20_criterion_1_indice_59_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_59.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_20_criterion_1_indice_59_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_59 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_20_criterion_1_indice_59_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_20_criterion_1_indice_59_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_20_criterion_1_indice_59_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_59 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_20_criterion_1_indice_59(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_20_criterion_1_indice_59_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_20_criterion_1_indice_59_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_20_criterion_1_indice_59(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_20_criterion_1_indice_59
     */
    private void regraMRE_6_REMEDIACAO_20_criterion_1_indice_59() {
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
			System.out.println("Exibição de MRE 6 - MRE 6");
			flush();

	    }


// -rule-end- 

// end_rules
	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "regraMRE_1_REMEDIACAO_1_criterion_1_indice_0",
        "regraMRE_2_REMEDIACAO_4_criterion_1_indice_1",
        "regraMRE_2_REMEDIACAO_5_criterion_1_indice_2",
        "regraMRE_6_REMEDIACAO_15_criterion_1_indice_3",
        "regraMRE_1_REMEDIACAO_2_criterion_1_indice_4",
        "regraMRE_2_REMEDIACAO_6_criterion_1_indice_5",
        "regraMRE_6_REMEDIACAO_16_criterion_1_indice_6",
        "regraMRE_2_REMEDIACAO_3_criterion_1_indice_7",
        "regraMRE_2_REMEDIACAO_7_criterion_1_indice_8",
        "regraMRE_6_REMEDIACAO_17_criterion_1_indice_9",
        "regraMRE_4_REMEDIACAO_8_criterion_1_indice_10",
        "regraMRE_6_REMEDIACAO_18_criterion_1_indice_11",
        "regraMRE_5_REMEDIACAO_13_criterion_1_indice_12",
        "regraMRE_5_REMEDIACAO_14_criterion_1_indice_13",
        "regraMRE_6_REMEDIACAO_20_criterion_1_indice_14",
        "regraMRE_1_REMEDIACAO_1_criterion_1_indice_15",
        "regraMRE_2_REMEDIACAO_4_criterion_1_indice_16",
        "regraMRE_2_REMEDIACAO_5_criterion_1_indice_17",
        "regraMRE_6_REMEDIACAO_15_criterion_1_indice_18",
        "regraMRE_1_REMEDIACAO_2_criterion_1_indice_19",
        "regraMRE_2_REMEDIACAO_6_criterion_1_indice_20",
        "regraMRE_6_REMEDIACAO_16_criterion_1_indice_21",
        "regraMRE_2_REMEDIACAO_3_criterion_1_indice_22",
        "regraMRE_2_REMEDIACAO_7_criterion_1_indice_23",
        "regraMRE_6_REMEDIACAO_17_criterion_1_indice_24",
        "regraMRE_4_REMEDIACAO_8_criterion_1_indice_25",
        "regraMRE_6_REMEDIACAO_18_criterion_1_indice_26",
        "regraMRE_5_REMEDIACAO_13_criterion_1_indice_27",
        "regraMRE_5_REMEDIACAO_14_criterion_1_indice_28",
        "regraMRE_6_REMEDIACAO_20_criterion_1_indice_29",
        "regraMRE_1_REMEDIACAO_1_criterion_1_indice_30",
        "regraMRE_2_REMEDIACAO_4_criterion_1_indice_31",
        "regraMRE_2_REMEDIACAO_5_criterion_1_indice_32",
        "regraMRE_6_REMEDIACAO_15_criterion_1_indice_33",
        "regraMRE_1_REMEDIACAO_2_criterion_1_indice_34",
        "regraMRE_2_REMEDIACAO_6_criterion_1_indice_35",
        "regraMRE_6_REMEDIACAO_16_criterion_1_indice_36",
        "regraMRE_2_REMEDIACAO_3_criterion_1_indice_37",
        "regraMRE_2_REMEDIACAO_7_criterion_1_indice_38",
        "regraMRE_6_REMEDIACAO_17_criterion_1_indice_39",
        "regraMRE_4_REMEDIACAO_8_criterion_1_indice_40",
        "regraMRE_6_REMEDIACAO_18_criterion_1_indice_41",
        "regraMRE_5_REMEDIACAO_13_criterion_1_indice_42",
        "regraMRE_5_REMEDIACAO_14_criterion_1_indice_43",
        "regraMRE_6_REMEDIACAO_20_criterion_1_indice_44",
        "regraMRE_1_REMEDIACAO_1_criterion_1_indice_45",
        "regraMRE_2_REMEDIACAO_4_criterion_1_indice_46",
        "regraMRE_2_REMEDIACAO_5_criterion_1_indice_47",
        "regraMRE_6_REMEDIACAO_15_criterion_1_indice_48",
        "regraMRE_1_REMEDIACAO_2_criterion_1_indice_49",
        "regraMRE_2_REMEDIACAO_6_criterion_1_indice_50",
        "regraMRE_6_REMEDIACAO_16_criterion_1_indice_51",
        "regraMRE_2_REMEDIACAO_3_criterion_1_indice_52",
        "regraMRE_2_REMEDIACAO_7_criterion_1_indice_53",
        "regraMRE_6_REMEDIACAO_17_criterion_1_indice_54",
        "regraMRE_4_REMEDIACAO_8_criterion_1_indice_55",
        "regraMRE_6_REMEDIACAO_18_criterion_1_indice_56",
        "regraMRE_5_REMEDIACAO_13_criterion_1_indice_57",
        "regraMRE_5_REMEDIACAO_14_criterion_1_indice_58",
        "regraMRE_6_REMEDIACAO_20_criterion_1_indice_59"
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
            case 0: return regraMRE_1_REMEDIACAO_1_criterion_1_indice_0_cond(condIndex);
            case 1: return regraMRE_2_REMEDIACAO_4_criterion_1_indice_1_cond(condIndex);
            case 2: return regraMRE_2_REMEDIACAO_5_criterion_1_indice_2_cond(condIndex);
            case 3: return regraMRE_6_REMEDIACAO_15_criterion_1_indice_3_cond(condIndex);
            case 4: return regraMRE_1_REMEDIACAO_2_criterion_1_indice_4_cond(condIndex);
            case 5: return regraMRE_2_REMEDIACAO_6_criterion_1_indice_5_cond(condIndex);
            case 6: return regraMRE_6_REMEDIACAO_16_criterion_1_indice_6_cond(condIndex);
            case 7: return regraMRE_2_REMEDIACAO_3_criterion_1_indice_7_cond(condIndex);
            case 8: return regraMRE_2_REMEDIACAO_7_criterion_1_indice_8_cond(condIndex);
            case 9: return regraMRE_6_REMEDIACAO_17_criterion_1_indice_9_cond(condIndex);
            case 10: return regraMRE_4_REMEDIACAO_8_criterion_1_indice_10_cond(condIndex);
            case 11: return regraMRE_6_REMEDIACAO_18_criterion_1_indice_11_cond(condIndex);
            case 12: return regraMRE_5_REMEDIACAO_13_criterion_1_indice_12_cond(condIndex);
            case 13: return regraMRE_5_REMEDIACAO_14_criterion_1_indice_13_cond(condIndex);
            case 14: return regraMRE_6_REMEDIACAO_20_criterion_1_indice_14_cond(condIndex);
            case 15: return regraMRE_1_REMEDIACAO_1_criterion_1_indice_15_cond(condIndex);
            case 16: return regraMRE_2_REMEDIACAO_4_criterion_1_indice_16_cond(condIndex);
            case 17: return regraMRE_2_REMEDIACAO_5_criterion_1_indice_17_cond(condIndex);
            case 18: return regraMRE_6_REMEDIACAO_15_criterion_1_indice_18_cond(condIndex);
            case 19: return regraMRE_1_REMEDIACAO_2_criterion_1_indice_19_cond(condIndex);
            case 20: return regraMRE_2_REMEDIACAO_6_criterion_1_indice_20_cond(condIndex);
            case 21: return regraMRE_6_REMEDIACAO_16_criterion_1_indice_21_cond(condIndex);
            case 22: return regraMRE_2_REMEDIACAO_3_criterion_1_indice_22_cond(condIndex);
            case 23: return regraMRE_2_REMEDIACAO_7_criterion_1_indice_23_cond(condIndex);
            case 24: return regraMRE_6_REMEDIACAO_17_criterion_1_indice_24_cond(condIndex);
            case 25: return regraMRE_4_REMEDIACAO_8_criterion_1_indice_25_cond(condIndex);
            case 26: return regraMRE_6_REMEDIACAO_18_criterion_1_indice_26_cond(condIndex);
            case 27: return regraMRE_5_REMEDIACAO_13_criterion_1_indice_27_cond(condIndex);
            case 28: return regraMRE_5_REMEDIACAO_14_criterion_1_indice_28_cond(condIndex);
            case 29: return regraMRE_6_REMEDIACAO_20_criterion_1_indice_29_cond(condIndex);
            case 30: return regraMRE_1_REMEDIACAO_1_criterion_1_indice_30_cond(condIndex);
            case 31: return regraMRE_2_REMEDIACAO_4_criterion_1_indice_31_cond(condIndex);
            case 32: return regraMRE_2_REMEDIACAO_5_criterion_1_indice_32_cond(condIndex);
            case 33: return regraMRE_6_REMEDIACAO_15_criterion_1_indice_33_cond(condIndex);
            case 34: return regraMRE_1_REMEDIACAO_2_criterion_1_indice_34_cond(condIndex);
            case 35: return regraMRE_2_REMEDIACAO_6_criterion_1_indice_35_cond(condIndex);
            case 36: return regraMRE_6_REMEDIACAO_16_criterion_1_indice_36_cond(condIndex);
            case 37: return regraMRE_2_REMEDIACAO_3_criterion_1_indice_37_cond(condIndex);
            case 38: return regraMRE_2_REMEDIACAO_7_criterion_1_indice_38_cond(condIndex);
            case 39: return regraMRE_6_REMEDIACAO_17_criterion_1_indice_39_cond(condIndex);
            case 40: return regraMRE_4_REMEDIACAO_8_criterion_1_indice_40_cond(condIndex);
            case 41: return regraMRE_6_REMEDIACAO_18_criterion_1_indice_41_cond(condIndex);
            case 42: return regraMRE_5_REMEDIACAO_13_criterion_1_indice_42_cond(condIndex);
            case 43: return regraMRE_5_REMEDIACAO_14_criterion_1_indice_43_cond(condIndex);
            case 44: return regraMRE_6_REMEDIACAO_20_criterion_1_indice_44_cond(condIndex);
            case 45: return regraMRE_1_REMEDIACAO_1_criterion_1_indice_45_cond(condIndex);
            case 46: return regraMRE_2_REMEDIACAO_4_criterion_1_indice_46_cond(condIndex);
            case 47: return regraMRE_2_REMEDIACAO_5_criterion_1_indice_47_cond(condIndex);
            case 48: return regraMRE_6_REMEDIACAO_15_criterion_1_indice_48_cond(condIndex);
            case 49: return regraMRE_1_REMEDIACAO_2_criterion_1_indice_49_cond(condIndex);
            case 50: return regraMRE_2_REMEDIACAO_6_criterion_1_indice_50_cond(condIndex);
            case 51: return regraMRE_6_REMEDIACAO_16_criterion_1_indice_51_cond(condIndex);
            case 52: return regraMRE_2_REMEDIACAO_3_criterion_1_indice_52_cond(condIndex);
            case 53: return regraMRE_2_REMEDIACAO_7_criterion_1_indice_53_cond(condIndex);
            case 54: return regraMRE_6_REMEDIACAO_17_criterion_1_indice_54_cond(condIndex);
            case 55: return regraMRE_4_REMEDIACAO_8_criterion_1_indice_55_cond(condIndex);
            case 56: return regraMRE_6_REMEDIACAO_18_criterion_1_indice_56_cond(condIndex);
            case 57: return regraMRE_5_REMEDIACAO_13_criterion_1_indice_57_cond(condIndex);
            case 58: return regraMRE_5_REMEDIACAO_14_criterion_1_indice_58_cond(condIndex);
            case 59: return regraMRE_6_REMEDIACAO_20_criterion_1_indice_59_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_regraMRE_1_REMEDIACAO_1_criterion_1_indice_0(declIndex);
            case 1: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_4_criterion_1_indice_1(declIndex);
            case 2: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_5_criterion_1_indice_2(declIndex);
            case 3: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_15_criterion_1_indice_3(declIndex);
            case 4: return checkConditionsOnlyOf_regraMRE_1_REMEDIACAO_2_criterion_1_indice_4(declIndex);
            case 5: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_6_criterion_1_indice_5(declIndex);
            case 6: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_16_criterion_1_indice_6(declIndex);
            case 7: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_3_criterion_1_indice_7(declIndex);
            case 8: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_7_criterion_1_indice_8(declIndex);
            case 9: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_17_criterion_1_indice_9(declIndex);
            case 10: return checkConditionsOnlyOf_regraMRE_4_REMEDIACAO_8_criterion_1_indice_10(declIndex);
            case 11: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_18_criterion_1_indice_11(declIndex);
            case 12: return checkConditionsOnlyOf_regraMRE_5_REMEDIACAO_13_criterion_1_indice_12(declIndex);
            case 13: return checkConditionsOnlyOf_regraMRE_5_REMEDIACAO_14_criterion_1_indice_13(declIndex);
            case 14: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_20_criterion_1_indice_14(declIndex);
            case 15: return checkConditionsOnlyOf_regraMRE_1_REMEDIACAO_1_criterion_1_indice_15(declIndex);
            case 16: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_4_criterion_1_indice_16(declIndex);
            case 17: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_5_criterion_1_indice_17(declIndex);
            case 18: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_15_criterion_1_indice_18(declIndex);
            case 19: return checkConditionsOnlyOf_regraMRE_1_REMEDIACAO_2_criterion_1_indice_19(declIndex);
            case 20: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_6_criterion_1_indice_20(declIndex);
            case 21: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_16_criterion_1_indice_21(declIndex);
            case 22: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_3_criterion_1_indice_22(declIndex);
            case 23: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_7_criterion_1_indice_23(declIndex);
            case 24: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_17_criterion_1_indice_24(declIndex);
            case 25: return checkConditionsOnlyOf_regraMRE_4_REMEDIACAO_8_criterion_1_indice_25(declIndex);
            case 26: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_18_criterion_1_indice_26(declIndex);
            case 27: return checkConditionsOnlyOf_regraMRE_5_REMEDIACAO_13_criterion_1_indice_27(declIndex);
            case 28: return checkConditionsOnlyOf_regraMRE_5_REMEDIACAO_14_criterion_1_indice_28(declIndex);
            case 29: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_20_criterion_1_indice_29(declIndex);
            case 30: return checkConditionsOnlyOf_regraMRE_1_REMEDIACAO_1_criterion_1_indice_30(declIndex);
            case 31: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_4_criterion_1_indice_31(declIndex);
            case 32: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_5_criterion_1_indice_32(declIndex);
            case 33: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_15_criterion_1_indice_33(declIndex);
            case 34: return checkConditionsOnlyOf_regraMRE_1_REMEDIACAO_2_criterion_1_indice_34(declIndex);
            case 35: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_6_criterion_1_indice_35(declIndex);
            case 36: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_16_criterion_1_indice_36(declIndex);
            case 37: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_3_criterion_1_indice_37(declIndex);
            case 38: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_7_criterion_1_indice_38(declIndex);
            case 39: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_17_criterion_1_indice_39(declIndex);
            case 40: return checkConditionsOnlyOf_regraMRE_4_REMEDIACAO_8_criterion_1_indice_40(declIndex);
            case 41: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_18_criterion_1_indice_41(declIndex);
            case 42: return checkConditionsOnlyOf_regraMRE_5_REMEDIACAO_13_criterion_1_indice_42(declIndex);
            case 43: return checkConditionsOnlyOf_regraMRE_5_REMEDIACAO_14_criterion_1_indice_43(declIndex);
            case 44: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_20_criterion_1_indice_44(declIndex);
            case 45: return checkConditionsOnlyOf_regraMRE_1_REMEDIACAO_1_criterion_1_indice_45(declIndex);
            case 46: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_4_criterion_1_indice_46(declIndex);
            case 47: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_5_criterion_1_indice_47(declIndex);
            case 48: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_15_criterion_1_indice_48(declIndex);
            case 49: return checkConditionsOnlyOf_regraMRE_1_REMEDIACAO_2_criterion_1_indice_49(declIndex);
            case 50: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_6_criterion_1_indice_50(declIndex);
            case 51: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_16_criterion_1_indice_51(declIndex);
            case 52: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_3_criterion_1_indice_52(declIndex);
            case 53: return checkConditionsOnlyOf_regraMRE_2_REMEDIACAO_7_criterion_1_indice_53(declIndex);
            case 54: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_17_criterion_1_indice_54(declIndex);
            case 55: return checkConditionsOnlyOf_regraMRE_4_REMEDIACAO_8_criterion_1_indice_55(declIndex);
            case 56: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_18_criterion_1_indice_56(declIndex);
            case 57: return checkConditionsOnlyOf_regraMRE_5_REMEDIACAO_13_criterion_1_indice_57(declIndex);
            case 58: return checkConditionsOnlyOf_regraMRE_5_REMEDIACAO_14_criterion_1_indice_58(declIndex);
            case 59: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_20_criterion_1_indice_59(declIndex);
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
            case 0: return checkCondForDeclaration_regraMRE_1_REMEDIACAO_1_criterion_1_indice_0(declIndex);
            case 1: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_4_criterion_1_indice_1(declIndex);
            case 2: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_5_criterion_1_indice_2(declIndex);
            case 3: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_15_criterion_1_indice_3(declIndex);
            case 4: return checkCondForDeclaration_regraMRE_1_REMEDIACAO_2_criterion_1_indice_4(declIndex);
            case 5: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_6_criterion_1_indice_5(declIndex);
            case 6: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_16_criterion_1_indice_6(declIndex);
            case 7: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_3_criterion_1_indice_7(declIndex);
            case 8: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_7_criterion_1_indice_8(declIndex);
            case 9: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_17_criterion_1_indice_9(declIndex);
            case 10: return checkCondForDeclaration_regraMRE_4_REMEDIACAO_8_criterion_1_indice_10(declIndex);
            case 11: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_18_criterion_1_indice_11(declIndex);
            case 12: return checkCondForDeclaration_regraMRE_5_REMEDIACAO_13_criterion_1_indice_12(declIndex);
            case 13: return checkCondForDeclaration_regraMRE_5_REMEDIACAO_14_criterion_1_indice_13(declIndex);
            case 14: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_20_criterion_1_indice_14(declIndex);
            case 15: return checkCondForDeclaration_regraMRE_1_REMEDIACAO_1_criterion_1_indice_15(declIndex);
            case 16: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_4_criterion_1_indice_16(declIndex);
            case 17: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_5_criterion_1_indice_17(declIndex);
            case 18: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_15_criterion_1_indice_18(declIndex);
            case 19: return checkCondForDeclaration_regraMRE_1_REMEDIACAO_2_criterion_1_indice_19(declIndex);
            case 20: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_6_criterion_1_indice_20(declIndex);
            case 21: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_16_criterion_1_indice_21(declIndex);
            case 22: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_3_criterion_1_indice_22(declIndex);
            case 23: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_7_criterion_1_indice_23(declIndex);
            case 24: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_17_criterion_1_indice_24(declIndex);
            case 25: return checkCondForDeclaration_regraMRE_4_REMEDIACAO_8_criterion_1_indice_25(declIndex);
            case 26: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_18_criterion_1_indice_26(declIndex);
            case 27: return checkCondForDeclaration_regraMRE_5_REMEDIACAO_13_criterion_1_indice_27(declIndex);
            case 28: return checkCondForDeclaration_regraMRE_5_REMEDIACAO_14_criterion_1_indice_28(declIndex);
            case 29: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_20_criterion_1_indice_29(declIndex);
            case 30: return checkCondForDeclaration_regraMRE_1_REMEDIACAO_1_criterion_1_indice_30(declIndex);
            case 31: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_4_criterion_1_indice_31(declIndex);
            case 32: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_5_criterion_1_indice_32(declIndex);
            case 33: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_15_criterion_1_indice_33(declIndex);
            case 34: return checkCondForDeclaration_regraMRE_1_REMEDIACAO_2_criterion_1_indice_34(declIndex);
            case 35: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_6_criterion_1_indice_35(declIndex);
            case 36: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_16_criterion_1_indice_36(declIndex);
            case 37: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_3_criterion_1_indice_37(declIndex);
            case 38: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_7_criterion_1_indice_38(declIndex);
            case 39: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_17_criterion_1_indice_39(declIndex);
            case 40: return checkCondForDeclaration_regraMRE_4_REMEDIACAO_8_criterion_1_indice_40(declIndex);
            case 41: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_18_criterion_1_indice_41(declIndex);
            case 42: return checkCondForDeclaration_regraMRE_5_REMEDIACAO_13_criterion_1_indice_42(declIndex);
            case 43: return checkCondForDeclaration_regraMRE_5_REMEDIACAO_14_criterion_1_indice_43(declIndex);
            case 44: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_20_criterion_1_indice_44(declIndex);
            case 45: return checkCondForDeclaration_regraMRE_1_REMEDIACAO_1_criterion_1_indice_45(declIndex);
            case 46: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_4_criterion_1_indice_46(declIndex);
            case 47: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_5_criterion_1_indice_47(declIndex);
            case 48: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_15_criterion_1_indice_48(declIndex);
            case 49: return checkCondForDeclaration_regraMRE_1_REMEDIACAO_2_criterion_1_indice_49(declIndex);
            case 50: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_6_criterion_1_indice_50(declIndex);
            case 51: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_16_criterion_1_indice_51(declIndex);
            case 52: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_3_criterion_1_indice_52(declIndex);
            case 53: return checkCondForDeclaration_regraMRE_2_REMEDIACAO_7_criterion_1_indice_53(declIndex);
            case 54: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_17_criterion_1_indice_54(declIndex);
            case 55: return checkCondForDeclaration_regraMRE_4_REMEDIACAO_8_criterion_1_indice_55(declIndex);
            case 56: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_18_criterion_1_indice_56(declIndex);
            case 57: return checkCondForDeclaration_regraMRE_5_REMEDIACAO_13_criterion_1_indice_57(declIndex);
            case 58: return checkCondForDeclaration_regraMRE_5_REMEDIACAO_14_criterion_1_indice_58(declIndex);
            case 59: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_20_criterion_1_indice_59(declIndex);
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
            case 0: return getDeclaredClassName_regraMRE_1_REMEDIACAO_1_criterion_1_indice_0(declIndex);
            case 1: return getDeclaredClassName_regraMRE_2_REMEDIACAO_4_criterion_1_indice_1(declIndex);
            case 2: return getDeclaredClassName_regraMRE_2_REMEDIACAO_5_criterion_1_indice_2(declIndex);
            case 3: return getDeclaredClassName_regraMRE_6_REMEDIACAO_15_criterion_1_indice_3(declIndex);
            case 4: return getDeclaredClassName_regraMRE_1_REMEDIACAO_2_criterion_1_indice_4(declIndex);
            case 5: return getDeclaredClassName_regraMRE_2_REMEDIACAO_6_criterion_1_indice_5(declIndex);
            case 6: return getDeclaredClassName_regraMRE_6_REMEDIACAO_16_criterion_1_indice_6(declIndex);
            case 7: return getDeclaredClassName_regraMRE_2_REMEDIACAO_3_criterion_1_indice_7(declIndex);
            case 8: return getDeclaredClassName_regraMRE_2_REMEDIACAO_7_criterion_1_indice_8(declIndex);
            case 9: return getDeclaredClassName_regraMRE_6_REMEDIACAO_17_criterion_1_indice_9(declIndex);
            case 10: return getDeclaredClassName_regraMRE_4_REMEDIACAO_8_criterion_1_indice_10(declIndex);
            case 11: return getDeclaredClassName_regraMRE_6_REMEDIACAO_18_criterion_1_indice_11(declIndex);
            case 12: return getDeclaredClassName_regraMRE_5_REMEDIACAO_13_criterion_1_indice_12(declIndex);
            case 13: return getDeclaredClassName_regraMRE_5_REMEDIACAO_14_criterion_1_indice_13(declIndex);
            case 14: return getDeclaredClassName_regraMRE_6_REMEDIACAO_20_criterion_1_indice_14(declIndex);
            case 15: return getDeclaredClassName_regraMRE_1_REMEDIACAO_1_criterion_1_indice_15(declIndex);
            case 16: return getDeclaredClassName_regraMRE_2_REMEDIACAO_4_criterion_1_indice_16(declIndex);
            case 17: return getDeclaredClassName_regraMRE_2_REMEDIACAO_5_criterion_1_indice_17(declIndex);
            case 18: return getDeclaredClassName_regraMRE_6_REMEDIACAO_15_criterion_1_indice_18(declIndex);
            case 19: return getDeclaredClassName_regraMRE_1_REMEDIACAO_2_criterion_1_indice_19(declIndex);
            case 20: return getDeclaredClassName_regraMRE_2_REMEDIACAO_6_criterion_1_indice_20(declIndex);
            case 21: return getDeclaredClassName_regraMRE_6_REMEDIACAO_16_criterion_1_indice_21(declIndex);
            case 22: return getDeclaredClassName_regraMRE_2_REMEDIACAO_3_criterion_1_indice_22(declIndex);
            case 23: return getDeclaredClassName_regraMRE_2_REMEDIACAO_7_criterion_1_indice_23(declIndex);
            case 24: return getDeclaredClassName_regraMRE_6_REMEDIACAO_17_criterion_1_indice_24(declIndex);
            case 25: return getDeclaredClassName_regraMRE_4_REMEDIACAO_8_criterion_1_indice_25(declIndex);
            case 26: return getDeclaredClassName_regraMRE_6_REMEDIACAO_18_criterion_1_indice_26(declIndex);
            case 27: return getDeclaredClassName_regraMRE_5_REMEDIACAO_13_criterion_1_indice_27(declIndex);
            case 28: return getDeclaredClassName_regraMRE_5_REMEDIACAO_14_criterion_1_indice_28(declIndex);
            case 29: return getDeclaredClassName_regraMRE_6_REMEDIACAO_20_criterion_1_indice_29(declIndex);
            case 30: return getDeclaredClassName_regraMRE_1_REMEDIACAO_1_criterion_1_indice_30(declIndex);
            case 31: return getDeclaredClassName_regraMRE_2_REMEDIACAO_4_criterion_1_indice_31(declIndex);
            case 32: return getDeclaredClassName_regraMRE_2_REMEDIACAO_5_criterion_1_indice_32(declIndex);
            case 33: return getDeclaredClassName_regraMRE_6_REMEDIACAO_15_criterion_1_indice_33(declIndex);
            case 34: return getDeclaredClassName_regraMRE_1_REMEDIACAO_2_criterion_1_indice_34(declIndex);
            case 35: return getDeclaredClassName_regraMRE_2_REMEDIACAO_6_criterion_1_indice_35(declIndex);
            case 36: return getDeclaredClassName_regraMRE_6_REMEDIACAO_16_criterion_1_indice_36(declIndex);
            case 37: return getDeclaredClassName_regraMRE_2_REMEDIACAO_3_criterion_1_indice_37(declIndex);
            case 38: return getDeclaredClassName_regraMRE_2_REMEDIACAO_7_criterion_1_indice_38(declIndex);
            case 39: return getDeclaredClassName_regraMRE_6_REMEDIACAO_17_criterion_1_indice_39(declIndex);
            case 40: return getDeclaredClassName_regraMRE_4_REMEDIACAO_8_criterion_1_indice_40(declIndex);
            case 41: return getDeclaredClassName_regraMRE_6_REMEDIACAO_18_criterion_1_indice_41(declIndex);
            case 42: return getDeclaredClassName_regraMRE_5_REMEDIACAO_13_criterion_1_indice_42(declIndex);
            case 43: return getDeclaredClassName_regraMRE_5_REMEDIACAO_14_criterion_1_indice_43(declIndex);
            case 44: return getDeclaredClassName_regraMRE_6_REMEDIACAO_20_criterion_1_indice_44(declIndex);
            case 45: return getDeclaredClassName_regraMRE_1_REMEDIACAO_1_criterion_1_indice_45(declIndex);
            case 46: return getDeclaredClassName_regraMRE_2_REMEDIACAO_4_criterion_1_indice_46(declIndex);
            case 47: return getDeclaredClassName_regraMRE_2_REMEDIACAO_5_criterion_1_indice_47(declIndex);
            case 48: return getDeclaredClassName_regraMRE_6_REMEDIACAO_15_criterion_1_indice_48(declIndex);
            case 49: return getDeclaredClassName_regraMRE_1_REMEDIACAO_2_criterion_1_indice_49(declIndex);
            case 50: return getDeclaredClassName_regraMRE_2_REMEDIACAO_6_criterion_1_indice_50(declIndex);
            case 51: return getDeclaredClassName_regraMRE_6_REMEDIACAO_16_criterion_1_indice_51(declIndex);
            case 52: return getDeclaredClassName_regraMRE_2_REMEDIACAO_3_criterion_1_indice_52(declIndex);
            case 53: return getDeclaredClassName_regraMRE_2_REMEDIACAO_7_criterion_1_indice_53(declIndex);
            case 54: return getDeclaredClassName_regraMRE_6_REMEDIACAO_17_criterion_1_indice_54(declIndex);
            case 55: return getDeclaredClassName_regraMRE_4_REMEDIACAO_8_criterion_1_indice_55(declIndex);
            case 56: return getDeclaredClassName_regraMRE_6_REMEDIACAO_18_criterion_1_indice_56(declIndex);
            case 57: return getDeclaredClassName_regraMRE_5_REMEDIACAO_13_criterion_1_indice_57(declIndex);
            case 58: return getDeclaredClassName_regraMRE_5_REMEDIACAO_14_criterion_1_indice_58(declIndex);
            case 59: return getDeclaredClassName_regraMRE_6_REMEDIACAO_20_criterion_1_indice_59(declIndex);
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
            case 0: return getDeclaredClass_regraMRE_1_REMEDIACAO_1_criterion_1_indice_0(declIndex);
            case 1: return getDeclaredClass_regraMRE_2_REMEDIACAO_4_criterion_1_indice_1(declIndex);
            case 2: return getDeclaredClass_regraMRE_2_REMEDIACAO_5_criterion_1_indice_2(declIndex);
            case 3: return getDeclaredClass_regraMRE_6_REMEDIACAO_15_criterion_1_indice_3(declIndex);
            case 4: return getDeclaredClass_regraMRE_1_REMEDIACAO_2_criterion_1_indice_4(declIndex);
            case 5: return getDeclaredClass_regraMRE_2_REMEDIACAO_6_criterion_1_indice_5(declIndex);
            case 6: return getDeclaredClass_regraMRE_6_REMEDIACAO_16_criterion_1_indice_6(declIndex);
            case 7: return getDeclaredClass_regraMRE_2_REMEDIACAO_3_criterion_1_indice_7(declIndex);
            case 8: return getDeclaredClass_regraMRE_2_REMEDIACAO_7_criterion_1_indice_8(declIndex);
            case 9: return getDeclaredClass_regraMRE_6_REMEDIACAO_17_criterion_1_indice_9(declIndex);
            case 10: return getDeclaredClass_regraMRE_4_REMEDIACAO_8_criterion_1_indice_10(declIndex);
            case 11: return getDeclaredClass_regraMRE_6_REMEDIACAO_18_criterion_1_indice_11(declIndex);
            case 12: return getDeclaredClass_regraMRE_5_REMEDIACAO_13_criterion_1_indice_12(declIndex);
            case 13: return getDeclaredClass_regraMRE_5_REMEDIACAO_14_criterion_1_indice_13(declIndex);
            case 14: return getDeclaredClass_regraMRE_6_REMEDIACAO_20_criterion_1_indice_14(declIndex);
            case 15: return getDeclaredClass_regraMRE_1_REMEDIACAO_1_criterion_1_indice_15(declIndex);
            case 16: return getDeclaredClass_regraMRE_2_REMEDIACAO_4_criterion_1_indice_16(declIndex);
            case 17: return getDeclaredClass_regraMRE_2_REMEDIACAO_5_criterion_1_indice_17(declIndex);
            case 18: return getDeclaredClass_regraMRE_6_REMEDIACAO_15_criterion_1_indice_18(declIndex);
            case 19: return getDeclaredClass_regraMRE_1_REMEDIACAO_2_criterion_1_indice_19(declIndex);
            case 20: return getDeclaredClass_regraMRE_2_REMEDIACAO_6_criterion_1_indice_20(declIndex);
            case 21: return getDeclaredClass_regraMRE_6_REMEDIACAO_16_criterion_1_indice_21(declIndex);
            case 22: return getDeclaredClass_regraMRE_2_REMEDIACAO_3_criterion_1_indice_22(declIndex);
            case 23: return getDeclaredClass_regraMRE_2_REMEDIACAO_7_criterion_1_indice_23(declIndex);
            case 24: return getDeclaredClass_regraMRE_6_REMEDIACAO_17_criterion_1_indice_24(declIndex);
            case 25: return getDeclaredClass_regraMRE_4_REMEDIACAO_8_criterion_1_indice_25(declIndex);
            case 26: return getDeclaredClass_regraMRE_6_REMEDIACAO_18_criterion_1_indice_26(declIndex);
            case 27: return getDeclaredClass_regraMRE_5_REMEDIACAO_13_criterion_1_indice_27(declIndex);
            case 28: return getDeclaredClass_regraMRE_5_REMEDIACAO_14_criterion_1_indice_28(declIndex);
            case 29: return getDeclaredClass_regraMRE_6_REMEDIACAO_20_criterion_1_indice_29(declIndex);
            case 30: return getDeclaredClass_regraMRE_1_REMEDIACAO_1_criterion_1_indice_30(declIndex);
            case 31: return getDeclaredClass_regraMRE_2_REMEDIACAO_4_criterion_1_indice_31(declIndex);
            case 32: return getDeclaredClass_regraMRE_2_REMEDIACAO_5_criterion_1_indice_32(declIndex);
            case 33: return getDeclaredClass_regraMRE_6_REMEDIACAO_15_criterion_1_indice_33(declIndex);
            case 34: return getDeclaredClass_regraMRE_1_REMEDIACAO_2_criterion_1_indice_34(declIndex);
            case 35: return getDeclaredClass_regraMRE_2_REMEDIACAO_6_criterion_1_indice_35(declIndex);
            case 36: return getDeclaredClass_regraMRE_6_REMEDIACAO_16_criterion_1_indice_36(declIndex);
            case 37: return getDeclaredClass_regraMRE_2_REMEDIACAO_3_criterion_1_indice_37(declIndex);
            case 38: return getDeclaredClass_regraMRE_2_REMEDIACAO_7_criterion_1_indice_38(declIndex);
            case 39: return getDeclaredClass_regraMRE_6_REMEDIACAO_17_criterion_1_indice_39(declIndex);
            case 40: return getDeclaredClass_regraMRE_4_REMEDIACAO_8_criterion_1_indice_40(declIndex);
            case 41: return getDeclaredClass_regraMRE_6_REMEDIACAO_18_criterion_1_indice_41(declIndex);
            case 42: return getDeclaredClass_regraMRE_5_REMEDIACAO_13_criterion_1_indice_42(declIndex);
            case 43: return getDeclaredClass_regraMRE_5_REMEDIACAO_14_criterion_1_indice_43(declIndex);
            case 44: return getDeclaredClass_regraMRE_6_REMEDIACAO_20_criterion_1_indice_44(declIndex);
            case 45: return getDeclaredClass_regraMRE_1_REMEDIACAO_1_criterion_1_indice_45(declIndex);
            case 46: return getDeclaredClass_regraMRE_2_REMEDIACAO_4_criterion_1_indice_46(declIndex);
            case 47: return getDeclaredClass_regraMRE_2_REMEDIACAO_5_criterion_1_indice_47(declIndex);
            case 48: return getDeclaredClass_regraMRE_6_REMEDIACAO_15_criterion_1_indice_48(declIndex);
            case 49: return getDeclaredClass_regraMRE_1_REMEDIACAO_2_criterion_1_indice_49(declIndex);
            case 50: return getDeclaredClass_regraMRE_2_REMEDIACAO_6_criterion_1_indice_50(declIndex);
            case 51: return getDeclaredClass_regraMRE_6_REMEDIACAO_16_criterion_1_indice_51(declIndex);
            case 52: return getDeclaredClass_regraMRE_2_REMEDIACAO_3_criterion_1_indice_52(declIndex);
            case 53: return getDeclaredClass_regraMRE_2_REMEDIACAO_7_criterion_1_indice_53(declIndex);
            case 54: return getDeclaredClass_regraMRE_6_REMEDIACAO_17_criterion_1_indice_54(declIndex);
            case 55: return getDeclaredClass_regraMRE_4_REMEDIACAO_8_criterion_1_indice_55(declIndex);
            case 56: return getDeclaredClass_regraMRE_6_REMEDIACAO_18_criterion_1_indice_56(declIndex);
            case 57: return getDeclaredClass_regraMRE_5_REMEDIACAO_13_criterion_1_indice_57(declIndex);
            case 58: return getDeclaredClass_regraMRE_5_REMEDIACAO_14_criterion_1_indice_58(declIndex);
            case 59: return getDeclaredClass_regraMRE_6_REMEDIACAO_20_criterion_1_indice_59(declIndex);
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
            case 0: regraMRE_1_REMEDIACAO_1_criterion_1_indice_0(); break;
            case 1: regraMRE_2_REMEDIACAO_4_criterion_1_indice_1(); break;
            case 2: regraMRE_2_REMEDIACAO_5_criterion_1_indice_2(); break;
            case 3: regraMRE_6_REMEDIACAO_15_criterion_1_indice_3(); break;
            case 4: regraMRE_1_REMEDIACAO_2_criterion_1_indice_4(); break;
            case 5: regraMRE_2_REMEDIACAO_6_criterion_1_indice_5(); break;
            case 6: regraMRE_6_REMEDIACAO_16_criterion_1_indice_6(); break;
            case 7: regraMRE_2_REMEDIACAO_3_criterion_1_indice_7(); break;
            case 8: regraMRE_2_REMEDIACAO_7_criterion_1_indice_8(); break;
            case 9: regraMRE_6_REMEDIACAO_17_criterion_1_indice_9(); break;
            case 10: regraMRE_4_REMEDIACAO_8_criterion_1_indice_10(); break;
            case 11: regraMRE_6_REMEDIACAO_18_criterion_1_indice_11(); break;
            case 12: regraMRE_5_REMEDIACAO_13_criterion_1_indice_12(); break;
            case 13: regraMRE_5_REMEDIACAO_14_criterion_1_indice_13(); break;
            case 14: regraMRE_6_REMEDIACAO_20_criterion_1_indice_14(); break;
            case 15: regraMRE_1_REMEDIACAO_1_criterion_1_indice_15(); break;
            case 16: regraMRE_2_REMEDIACAO_4_criterion_1_indice_16(); break;
            case 17: regraMRE_2_REMEDIACAO_5_criterion_1_indice_17(); break;
            case 18: regraMRE_6_REMEDIACAO_15_criterion_1_indice_18(); break;
            case 19: regraMRE_1_REMEDIACAO_2_criterion_1_indice_19(); break;
            case 20: regraMRE_2_REMEDIACAO_6_criterion_1_indice_20(); break;
            case 21: regraMRE_6_REMEDIACAO_16_criterion_1_indice_21(); break;
            case 22: regraMRE_2_REMEDIACAO_3_criterion_1_indice_22(); break;
            case 23: regraMRE_2_REMEDIACAO_7_criterion_1_indice_23(); break;
            case 24: regraMRE_6_REMEDIACAO_17_criterion_1_indice_24(); break;
            case 25: regraMRE_4_REMEDIACAO_8_criterion_1_indice_25(); break;
            case 26: regraMRE_6_REMEDIACAO_18_criterion_1_indice_26(); break;
            case 27: regraMRE_5_REMEDIACAO_13_criterion_1_indice_27(); break;
            case 28: regraMRE_5_REMEDIACAO_14_criterion_1_indice_28(); break;
            case 29: regraMRE_6_REMEDIACAO_20_criterion_1_indice_29(); break;
            case 30: regraMRE_1_REMEDIACAO_1_criterion_1_indice_30(); break;
            case 31: regraMRE_2_REMEDIACAO_4_criterion_1_indice_31(); break;
            case 32: regraMRE_2_REMEDIACAO_5_criterion_1_indice_32(); break;
            case 33: regraMRE_6_REMEDIACAO_15_criterion_1_indice_33(); break;
            case 34: regraMRE_1_REMEDIACAO_2_criterion_1_indice_34(); break;
            case 35: regraMRE_2_REMEDIACAO_6_criterion_1_indice_35(); break;
            case 36: regraMRE_6_REMEDIACAO_16_criterion_1_indice_36(); break;
            case 37: regraMRE_2_REMEDIACAO_3_criterion_1_indice_37(); break;
            case 38: regraMRE_2_REMEDIACAO_7_criterion_1_indice_38(); break;
            case 39: regraMRE_6_REMEDIACAO_17_criterion_1_indice_39(); break;
            case 40: regraMRE_4_REMEDIACAO_8_criterion_1_indice_40(); break;
            case 41: regraMRE_6_REMEDIACAO_18_criterion_1_indice_41(); break;
            case 42: regraMRE_5_REMEDIACAO_13_criterion_1_indice_42(); break;
            case 43: regraMRE_5_REMEDIACAO_14_criterion_1_indice_43(); break;
            case 44: regraMRE_6_REMEDIACAO_20_criterion_1_indice_44(); break;
            case 45: regraMRE_1_REMEDIACAO_1_criterion_1_indice_45(); break;
            case 46: regraMRE_2_REMEDIACAO_4_criterion_1_indice_46(); break;
            case 47: regraMRE_2_REMEDIACAO_5_criterion_1_indice_47(); break;
            case 48: regraMRE_6_REMEDIACAO_15_criterion_1_indice_48(); break;
            case 49: regraMRE_1_REMEDIACAO_2_criterion_1_indice_49(); break;
            case 50: regraMRE_2_REMEDIACAO_6_criterion_1_indice_50(); break;
            case 51: regraMRE_6_REMEDIACAO_16_criterion_1_indice_51(); break;
            case 52: regraMRE_2_REMEDIACAO_3_criterion_1_indice_52(); break;
            case 53: regraMRE_2_REMEDIACAO_7_criterion_1_indice_53(); break;
            case 54: regraMRE_6_REMEDIACAO_17_criterion_1_indice_54(); break;
            case 55: regraMRE_4_REMEDIACAO_8_criterion_1_indice_55(); break;
            case 56: regraMRE_6_REMEDIACAO_18_criterion_1_indice_56(); break;
            case 57: regraMRE_5_REMEDIACAO_13_criterion_1_indice_57(); break;
            case 58: regraMRE_5_REMEDIACAO_14_criterion_1_indice_58(); break;
            case 59: regraMRE_6_REMEDIACAO_20_criterion_1_indice_59(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 60;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_regraMRE_1_REMEDIACAO_1_criterion_1_indice_0();
            case 1: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_4_criterion_1_indice_1();
            case 2: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_5_criterion_1_indice_2();
            case 3: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_15_criterion_1_indice_3();
            case 4: return getDeclaredIdentifiers_regraMRE_1_REMEDIACAO_2_criterion_1_indice_4();
            case 5: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_6_criterion_1_indice_5();
            case 6: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_16_criterion_1_indice_6();
            case 7: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_3_criterion_1_indice_7();
            case 8: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_7_criterion_1_indice_8();
            case 9: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_17_criterion_1_indice_9();
            case 10: return getDeclaredIdentifiers_regraMRE_4_REMEDIACAO_8_criterion_1_indice_10();
            case 11: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_18_criterion_1_indice_11();
            case 12: return getDeclaredIdentifiers_regraMRE_5_REMEDIACAO_13_criterion_1_indice_12();
            case 13: return getDeclaredIdentifiers_regraMRE_5_REMEDIACAO_14_criterion_1_indice_13();
            case 14: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_20_criterion_1_indice_14();
            case 15: return getDeclaredIdentifiers_regraMRE_1_REMEDIACAO_1_criterion_1_indice_15();
            case 16: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_4_criterion_1_indice_16();
            case 17: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_5_criterion_1_indice_17();
            case 18: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_15_criterion_1_indice_18();
            case 19: return getDeclaredIdentifiers_regraMRE_1_REMEDIACAO_2_criterion_1_indice_19();
            case 20: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_6_criterion_1_indice_20();
            case 21: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_16_criterion_1_indice_21();
            case 22: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_3_criterion_1_indice_22();
            case 23: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_7_criterion_1_indice_23();
            case 24: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_17_criterion_1_indice_24();
            case 25: return getDeclaredIdentifiers_regraMRE_4_REMEDIACAO_8_criterion_1_indice_25();
            case 26: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_18_criterion_1_indice_26();
            case 27: return getDeclaredIdentifiers_regraMRE_5_REMEDIACAO_13_criterion_1_indice_27();
            case 28: return getDeclaredIdentifiers_regraMRE_5_REMEDIACAO_14_criterion_1_indice_28();
            case 29: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_20_criterion_1_indice_29();
            case 30: return getDeclaredIdentifiers_regraMRE_1_REMEDIACAO_1_criterion_1_indice_30();
            case 31: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_4_criterion_1_indice_31();
            case 32: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_5_criterion_1_indice_32();
            case 33: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_15_criterion_1_indice_33();
            case 34: return getDeclaredIdentifiers_regraMRE_1_REMEDIACAO_2_criterion_1_indice_34();
            case 35: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_6_criterion_1_indice_35();
            case 36: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_16_criterion_1_indice_36();
            case 37: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_3_criterion_1_indice_37();
            case 38: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_7_criterion_1_indice_38();
            case 39: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_17_criterion_1_indice_39();
            case 40: return getDeclaredIdentifiers_regraMRE_4_REMEDIACAO_8_criterion_1_indice_40();
            case 41: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_18_criterion_1_indice_41();
            case 42: return getDeclaredIdentifiers_regraMRE_5_REMEDIACAO_13_criterion_1_indice_42();
            case 43: return getDeclaredIdentifiers_regraMRE_5_REMEDIACAO_14_criterion_1_indice_43();
            case 44: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_20_criterion_1_indice_44();
            case 45: return getDeclaredIdentifiers_regraMRE_1_REMEDIACAO_1_criterion_1_indice_45();
            case 46: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_4_criterion_1_indice_46();
            case 47: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_5_criterion_1_indice_47();
            case 48: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_15_criterion_1_indice_48();
            case 49: return getDeclaredIdentifiers_regraMRE_1_REMEDIACAO_2_criterion_1_indice_49();
            case 50: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_6_criterion_1_indice_50();
            case 51: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_16_criterion_1_indice_51();
            case 52: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_3_criterion_1_indice_52();
            case 53: return getDeclaredIdentifiers_regraMRE_2_REMEDIACAO_7_criterion_1_indice_53();
            case 54: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_17_criterion_1_indice_54();
            case 55: return getDeclaredIdentifiers_regraMRE_4_REMEDIACAO_8_criterion_1_indice_55();
            case 56: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_18_criterion_1_indice_56();
            case 57: return getDeclaredIdentifiers_regraMRE_5_REMEDIACAO_13_criterion_1_indice_57();
            case 58: return getDeclaredIdentifiers_regraMRE_5_REMEDIACAO_14_criterion_1_indice_58();
            case 59: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_20_criterion_1_indice_59();
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
            case 0: setObject_regraMRE_1_REMEDIACAO_1_criterion_1_indice_0(declIndex, value); break;
            case 1: setObject_regraMRE_2_REMEDIACAO_4_criterion_1_indice_1(declIndex, value); break;
            case 2: setObject_regraMRE_2_REMEDIACAO_5_criterion_1_indice_2(declIndex, value); break;
            case 3: setObject_regraMRE_6_REMEDIACAO_15_criterion_1_indice_3(declIndex, value); break;
            case 4: setObject_regraMRE_1_REMEDIACAO_2_criterion_1_indice_4(declIndex, value); break;
            case 5: setObject_regraMRE_2_REMEDIACAO_6_criterion_1_indice_5(declIndex, value); break;
            case 6: setObject_regraMRE_6_REMEDIACAO_16_criterion_1_indice_6(declIndex, value); break;
            case 7: setObject_regraMRE_2_REMEDIACAO_3_criterion_1_indice_7(declIndex, value); break;
            case 8: setObject_regraMRE_2_REMEDIACAO_7_criterion_1_indice_8(declIndex, value); break;
            case 9: setObject_regraMRE_6_REMEDIACAO_17_criterion_1_indice_9(declIndex, value); break;
            case 10: setObject_regraMRE_4_REMEDIACAO_8_criterion_1_indice_10(declIndex, value); break;
            case 11: setObject_regraMRE_6_REMEDIACAO_18_criterion_1_indice_11(declIndex, value); break;
            case 12: setObject_regraMRE_5_REMEDIACAO_13_criterion_1_indice_12(declIndex, value); break;
            case 13: setObject_regraMRE_5_REMEDIACAO_14_criterion_1_indice_13(declIndex, value); break;
            case 14: setObject_regraMRE_6_REMEDIACAO_20_criterion_1_indice_14(declIndex, value); break;
            case 15: setObject_regraMRE_1_REMEDIACAO_1_criterion_1_indice_15(declIndex, value); break;
            case 16: setObject_regraMRE_2_REMEDIACAO_4_criterion_1_indice_16(declIndex, value); break;
            case 17: setObject_regraMRE_2_REMEDIACAO_5_criterion_1_indice_17(declIndex, value); break;
            case 18: setObject_regraMRE_6_REMEDIACAO_15_criterion_1_indice_18(declIndex, value); break;
            case 19: setObject_regraMRE_1_REMEDIACAO_2_criterion_1_indice_19(declIndex, value); break;
            case 20: setObject_regraMRE_2_REMEDIACAO_6_criterion_1_indice_20(declIndex, value); break;
            case 21: setObject_regraMRE_6_REMEDIACAO_16_criterion_1_indice_21(declIndex, value); break;
            case 22: setObject_regraMRE_2_REMEDIACAO_3_criterion_1_indice_22(declIndex, value); break;
            case 23: setObject_regraMRE_2_REMEDIACAO_7_criterion_1_indice_23(declIndex, value); break;
            case 24: setObject_regraMRE_6_REMEDIACAO_17_criterion_1_indice_24(declIndex, value); break;
            case 25: setObject_regraMRE_4_REMEDIACAO_8_criterion_1_indice_25(declIndex, value); break;
            case 26: setObject_regraMRE_6_REMEDIACAO_18_criterion_1_indice_26(declIndex, value); break;
            case 27: setObject_regraMRE_5_REMEDIACAO_13_criterion_1_indice_27(declIndex, value); break;
            case 28: setObject_regraMRE_5_REMEDIACAO_14_criterion_1_indice_28(declIndex, value); break;
            case 29: setObject_regraMRE_6_REMEDIACAO_20_criterion_1_indice_29(declIndex, value); break;
            case 30: setObject_regraMRE_1_REMEDIACAO_1_criterion_1_indice_30(declIndex, value); break;
            case 31: setObject_regraMRE_2_REMEDIACAO_4_criterion_1_indice_31(declIndex, value); break;
            case 32: setObject_regraMRE_2_REMEDIACAO_5_criterion_1_indice_32(declIndex, value); break;
            case 33: setObject_regraMRE_6_REMEDIACAO_15_criterion_1_indice_33(declIndex, value); break;
            case 34: setObject_regraMRE_1_REMEDIACAO_2_criterion_1_indice_34(declIndex, value); break;
            case 35: setObject_regraMRE_2_REMEDIACAO_6_criterion_1_indice_35(declIndex, value); break;
            case 36: setObject_regraMRE_6_REMEDIACAO_16_criterion_1_indice_36(declIndex, value); break;
            case 37: setObject_regraMRE_2_REMEDIACAO_3_criterion_1_indice_37(declIndex, value); break;
            case 38: setObject_regraMRE_2_REMEDIACAO_7_criterion_1_indice_38(declIndex, value); break;
            case 39: setObject_regraMRE_6_REMEDIACAO_17_criterion_1_indice_39(declIndex, value); break;
            case 40: setObject_regraMRE_4_REMEDIACAO_8_criterion_1_indice_40(declIndex, value); break;
            case 41: setObject_regraMRE_6_REMEDIACAO_18_criterion_1_indice_41(declIndex, value); break;
            case 42: setObject_regraMRE_5_REMEDIACAO_13_criterion_1_indice_42(declIndex, value); break;
            case 43: setObject_regraMRE_5_REMEDIACAO_14_criterion_1_indice_43(declIndex, value); break;
            case 44: setObject_regraMRE_6_REMEDIACAO_20_criterion_1_indice_44(declIndex, value); break;
            case 45: setObject_regraMRE_1_REMEDIACAO_1_criterion_1_indice_45(declIndex, value); break;
            case 46: setObject_regraMRE_2_REMEDIACAO_4_criterion_1_indice_46(declIndex, value); break;
            case 47: setObject_regraMRE_2_REMEDIACAO_5_criterion_1_indice_47(declIndex, value); break;
            case 48: setObject_regraMRE_6_REMEDIACAO_15_criterion_1_indice_48(declIndex, value); break;
            case 49: setObject_regraMRE_1_REMEDIACAO_2_criterion_1_indice_49(declIndex, value); break;
            case 50: setObject_regraMRE_2_REMEDIACAO_6_criterion_1_indice_50(declIndex, value); break;
            case 51: setObject_regraMRE_6_REMEDIACAO_16_criterion_1_indice_51(declIndex, value); break;
            case 52: setObject_regraMRE_2_REMEDIACAO_3_criterion_1_indice_52(declIndex, value); break;
            case 53: setObject_regraMRE_2_REMEDIACAO_7_criterion_1_indice_53(declIndex, value); break;
            case 54: setObject_regraMRE_6_REMEDIACAO_17_criterion_1_indice_54(declIndex, value); break;
            case 55: setObject_regraMRE_4_REMEDIACAO_8_criterion_1_indice_55(declIndex, value); break;
            case 56: setObject_regraMRE_6_REMEDIACAO_18_criterion_1_indice_56(declIndex, value); break;
            case 57: setObject_regraMRE_5_REMEDIACAO_13_criterion_1_indice_57(declIndex, value); break;
            case 58: setObject_regraMRE_5_REMEDIACAO_14_criterion_1_indice_58(declIndex, value); break;
            case 59: setObject_regraMRE_6_REMEDIACAO_20_criterion_1_indice_59(declIndex, value); break;
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
            case 0: return getObject_regraMRE_1_REMEDIACAO_1_criterion_1_indice_0(declIndex);
            case 1: return getObject_regraMRE_2_REMEDIACAO_4_criterion_1_indice_1(declIndex);
            case 2: return getObject_regraMRE_2_REMEDIACAO_5_criterion_1_indice_2(declIndex);
            case 3: return getObject_regraMRE_6_REMEDIACAO_15_criterion_1_indice_3(declIndex);
            case 4: return getObject_regraMRE_1_REMEDIACAO_2_criterion_1_indice_4(declIndex);
            case 5: return getObject_regraMRE_2_REMEDIACAO_6_criterion_1_indice_5(declIndex);
            case 6: return getObject_regraMRE_6_REMEDIACAO_16_criterion_1_indice_6(declIndex);
            case 7: return getObject_regraMRE_2_REMEDIACAO_3_criterion_1_indice_7(declIndex);
            case 8: return getObject_regraMRE_2_REMEDIACAO_7_criterion_1_indice_8(declIndex);
            case 9: return getObject_regraMRE_6_REMEDIACAO_17_criterion_1_indice_9(declIndex);
            case 10: return getObject_regraMRE_4_REMEDIACAO_8_criterion_1_indice_10(declIndex);
            case 11: return getObject_regraMRE_6_REMEDIACAO_18_criterion_1_indice_11(declIndex);
            case 12: return getObject_regraMRE_5_REMEDIACAO_13_criterion_1_indice_12(declIndex);
            case 13: return getObject_regraMRE_5_REMEDIACAO_14_criterion_1_indice_13(declIndex);
            case 14: return getObject_regraMRE_6_REMEDIACAO_20_criterion_1_indice_14(declIndex);
            case 15: return getObject_regraMRE_1_REMEDIACAO_1_criterion_1_indice_15(declIndex);
            case 16: return getObject_regraMRE_2_REMEDIACAO_4_criterion_1_indice_16(declIndex);
            case 17: return getObject_regraMRE_2_REMEDIACAO_5_criterion_1_indice_17(declIndex);
            case 18: return getObject_regraMRE_6_REMEDIACAO_15_criterion_1_indice_18(declIndex);
            case 19: return getObject_regraMRE_1_REMEDIACAO_2_criterion_1_indice_19(declIndex);
            case 20: return getObject_regraMRE_2_REMEDIACAO_6_criterion_1_indice_20(declIndex);
            case 21: return getObject_regraMRE_6_REMEDIACAO_16_criterion_1_indice_21(declIndex);
            case 22: return getObject_regraMRE_2_REMEDIACAO_3_criterion_1_indice_22(declIndex);
            case 23: return getObject_regraMRE_2_REMEDIACAO_7_criterion_1_indice_23(declIndex);
            case 24: return getObject_regraMRE_6_REMEDIACAO_17_criterion_1_indice_24(declIndex);
            case 25: return getObject_regraMRE_4_REMEDIACAO_8_criterion_1_indice_25(declIndex);
            case 26: return getObject_regraMRE_6_REMEDIACAO_18_criterion_1_indice_26(declIndex);
            case 27: return getObject_regraMRE_5_REMEDIACAO_13_criterion_1_indice_27(declIndex);
            case 28: return getObject_regraMRE_5_REMEDIACAO_14_criterion_1_indice_28(declIndex);
            case 29: return getObject_regraMRE_6_REMEDIACAO_20_criterion_1_indice_29(declIndex);
            case 30: return getObject_regraMRE_1_REMEDIACAO_1_criterion_1_indice_30(declIndex);
            case 31: return getObject_regraMRE_2_REMEDIACAO_4_criterion_1_indice_31(declIndex);
            case 32: return getObject_regraMRE_2_REMEDIACAO_5_criterion_1_indice_32(declIndex);
            case 33: return getObject_regraMRE_6_REMEDIACAO_15_criterion_1_indice_33(declIndex);
            case 34: return getObject_regraMRE_1_REMEDIACAO_2_criterion_1_indice_34(declIndex);
            case 35: return getObject_regraMRE_2_REMEDIACAO_6_criterion_1_indice_35(declIndex);
            case 36: return getObject_regraMRE_6_REMEDIACAO_16_criterion_1_indice_36(declIndex);
            case 37: return getObject_regraMRE_2_REMEDIACAO_3_criterion_1_indice_37(declIndex);
            case 38: return getObject_regraMRE_2_REMEDIACAO_7_criterion_1_indice_38(declIndex);
            case 39: return getObject_regraMRE_6_REMEDIACAO_17_criterion_1_indice_39(declIndex);
            case 40: return getObject_regraMRE_4_REMEDIACAO_8_criterion_1_indice_40(declIndex);
            case 41: return getObject_regraMRE_6_REMEDIACAO_18_criterion_1_indice_41(declIndex);
            case 42: return getObject_regraMRE_5_REMEDIACAO_13_criterion_1_indice_42(declIndex);
            case 43: return getObject_regraMRE_5_REMEDIACAO_14_criterion_1_indice_43(declIndex);
            case 44: return getObject_regraMRE_6_REMEDIACAO_20_criterion_1_indice_44(declIndex);
            case 45: return getObject_regraMRE_1_REMEDIACAO_1_criterion_1_indice_45(declIndex);
            case 46: return getObject_regraMRE_2_REMEDIACAO_4_criterion_1_indice_46(declIndex);
            case 47: return getObject_regraMRE_2_REMEDIACAO_5_criterion_1_indice_47(declIndex);
            case 48: return getObject_regraMRE_6_REMEDIACAO_15_criterion_1_indice_48(declIndex);
            case 49: return getObject_regraMRE_1_REMEDIACAO_2_criterion_1_indice_49(declIndex);
            case 50: return getObject_regraMRE_2_REMEDIACAO_6_criterion_1_indice_50(declIndex);
            case 51: return getObject_regraMRE_6_REMEDIACAO_16_criterion_1_indice_51(declIndex);
            case 52: return getObject_regraMRE_2_REMEDIACAO_3_criterion_1_indice_52(declIndex);
            case 53: return getObject_regraMRE_2_REMEDIACAO_7_criterion_1_indice_53(declIndex);
            case 54: return getObject_regraMRE_6_REMEDIACAO_17_criterion_1_indice_54(declIndex);
            case 55: return getObject_regraMRE_4_REMEDIACAO_8_criterion_1_indice_55(declIndex);
            case 56: return getObject_regraMRE_6_REMEDIACAO_18_criterion_1_indice_56(declIndex);
            case 57: return getObject_regraMRE_5_REMEDIACAO_13_criterion_1_indice_57(declIndex);
            case 58: return getObject_regraMRE_5_REMEDIACAO_14_criterion_1_indice_58(declIndex);
            case 59: return getObject_regraMRE_6_REMEDIACAO_20_criterion_1_indice_59(declIndex);
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
            case 0: return getObjects_regraMRE_1_REMEDIACAO_1_criterion_1_indice_0();
            case 1: return getObjects_regraMRE_2_REMEDIACAO_4_criterion_1_indice_1();
            case 2: return getObjects_regraMRE_2_REMEDIACAO_5_criterion_1_indice_2();
            case 3: return getObjects_regraMRE_6_REMEDIACAO_15_criterion_1_indice_3();
            case 4: return getObjects_regraMRE_1_REMEDIACAO_2_criterion_1_indice_4();
            case 5: return getObjects_regraMRE_2_REMEDIACAO_6_criterion_1_indice_5();
            case 6: return getObjects_regraMRE_6_REMEDIACAO_16_criterion_1_indice_6();
            case 7: return getObjects_regraMRE_2_REMEDIACAO_3_criterion_1_indice_7();
            case 8: return getObjects_regraMRE_2_REMEDIACAO_7_criterion_1_indice_8();
            case 9: return getObjects_regraMRE_6_REMEDIACAO_17_criterion_1_indice_9();
            case 10: return getObjects_regraMRE_4_REMEDIACAO_8_criterion_1_indice_10();
            case 11: return getObjects_regraMRE_6_REMEDIACAO_18_criterion_1_indice_11();
            case 12: return getObjects_regraMRE_5_REMEDIACAO_13_criterion_1_indice_12();
            case 13: return getObjects_regraMRE_5_REMEDIACAO_14_criterion_1_indice_13();
            case 14: return getObjects_regraMRE_6_REMEDIACAO_20_criterion_1_indice_14();
            case 15: return getObjects_regraMRE_1_REMEDIACAO_1_criterion_1_indice_15();
            case 16: return getObjects_regraMRE_2_REMEDIACAO_4_criterion_1_indice_16();
            case 17: return getObjects_regraMRE_2_REMEDIACAO_5_criterion_1_indice_17();
            case 18: return getObjects_regraMRE_6_REMEDIACAO_15_criterion_1_indice_18();
            case 19: return getObjects_regraMRE_1_REMEDIACAO_2_criterion_1_indice_19();
            case 20: return getObjects_regraMRE_2_REMEDIACAO_6_criterion_1_indice_20();
            case 21: return getObjects_regraMRE_6_REMEDIACAO_16_criterion_1_indice_21();
            case 22: return getObjects_regraMRE_2_REMEDIACAO_3_criterion_1_indice_22();
            case 23: return getObjects_regraMRE_2_REMEDIACAO_7_criterion_1_indice_23();
            case 24: return getObjects_regraMRE_6_REMEDIACAO_17_criterion_1_indice_24();
            case 25: return getObjects_regraMRE_4_REMEDIACAO_8_criterion_1_indice_25();
            case 26: return getObjects_regraMRE_6_REMEDIACAO_18_criterion_1_indice_26();
            case 27: return getObjects_regraMRE_5_REMEDIACAO_13_criterion_1_indice_27();
            case 28: return getObjects_regraMRE_5_REMEDIACAO_14_criterion_1_indice_28();
            case 29: return getObjects_regraMRE_6_REMEDIACAO_20_criterion_1_indice_29();
            case 30: return getObjects_regraMRE_1_REMEDIACAO_1_criterion_1_indice_30();
            case 31: return getObjects_regraMRE_2_REMEDIACAO_4_criterion_1_indice_31();
            case 32: return getObjects_regraMRE_2_REMEDIACAO_5_criterion_1_indice_32();
            case 33: return getObjects_regraMRE_6_REMEDIACAO_15_criterion_1_indice_33();
            case 34: return getObjects_regraMRE_1_REMEDIACAO_2_criterion_1_indice_34();
            case 35: return getObjects_regraMRE_2_REMEDIACAO_6_criterion_1_indice_35();
            case 36: return getObjects_regraMRE_6_REMEDIACAO_16_criterion_1_indice_36();
            case 37: return getObjects_regraMRE_2_REMEDIACAO_3_criterion_1_indice_37();
            case 38: return getObjects_regraMRE_2_REMEDIACAO_7_criterion_1_indice_38();
            case 39: return getObjects_regraMRE_6_REMEDIACAO_17_criterion_1_indice_39();
            case 40: return getObjects_regraMRE_4_REMEDIACAO_8_criterion_1_indice_40();
            case 41: return getObjects_regraMRE_6_REMEDIACAO_18_criterion_1_indice_41();
            case 42: return getObjects_regraMRE_5_REMEDIACAO_13_criterion_1_indice_42();
            case 43: return getObjects_regraMRE_5_REMEDIACAO_14_criterion_1_indice_43();
            case 44: return getObjects_regraMRE_6_REMEDIACAO_20_criterion_1_indice_44();
            case 45: return getObjects_regraMRE_1_REMEDIACAO_1_criterion_1_indice_45();
            case 46: return getObjects_regraMRE_2_REMEDIACAO_4_criterion_1_indice_46();
            case 47: return getObjects_regraMRE_2_REMEDIACAO_5_criterion_1_indice_47();
            case 48: return getObjects_regraMRE_6_REMEDIACAO_15_criterion_1_indice_48();
            case 49: return getObjects_regraMRE_1_REMEDIACAO_2_criterion_1_indice_49();
            case 50: return getObjects_regraMRE_2_REMEDIACAO_6_criterion_1_indice_50();
            case 51: return getObjects_regraMRE_6_REMEDIACAO_16_criterion_1_indice_51();
            case 52: return getObjects_regraMRE_2_REMEDIACAO_3_criterion_1_indice_52();
            case 53: return getObjects_regraMRE_2_REMEDIACAO_7_criterion_1_indice_53();
            case 54: return getObjects_regraMRE_6_REMEDIACAO_17_criterion_1_indice_54();
            case 55: return getObjects_regraMRE_4_REMEDIACAO_8_criterion_1_indice_55();
            case 56: return getObjects_regraMRE_6_REMEDIACAO_18_criterion_1_indice_56();
            case 57: return getObjects_regraMRE_5_REMEDIACAO_13_criterion_1_indice_57();
            case 58: return getObjects_regraMRE_5_REMEDIACAO_14_criterion_1_indice_58();
            case 59: return getObjects_regraMRE_6_REMEDIACAO_20_criterion_1_indice_59();
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
            case 0: setObjects_regraMRE_1_REMEDIACAO_1_criterion_1_indice_0(objects); break;
            case 1: setObjects_regraMRE_2_REMEDIACAO_4_criterion_1_indice_1(objects); break;
            case 2: setObjects_regraMRE_2_REMEDIACAO_5_criterion_1_indice_2(objects); break;
            case 3: setObjects_regraMRE_6_REMEDIACAO_15_criterion_1_indice_3(objects); break;
            case 4: setObjects_regraMRE_1_REMEDIACAO_2_criterion_1_indice_4(objects); break;
            case 5: setObjects_regraMRE_2_REMEDIACAO_6_criterion_1_indice_5(objects); break;
            case 6: setObjects_regraMRE_6_REMEDIACAO_16_criterion_1_indice_6(objects); break;
            case 7: setObjects_regraMRE_2_REMEDIACAO_3_criterion_1_indice_7(objects); break;
            case 8: setObjects_regraMRE_2_REMEDIACAO_7_criterion_1_indice_8(objects); break;
            case 9: setObjects_regraMRE_6_REMEDIACAO_17_criterion_1_indice_9(objects); break;
            case 10: setObjects_regraMRE_4_REMEDIACAO_8_criterion_1_indice_10(objects); break;
            case 11: setObjects_regraMRE_6_REMEDIACAO_18_criterion_1_indice_11(objects); break;
            case 12: setObjects_regraMRE_5_REMEDIACAO_13_criterion_1_indice_12(objects); break;
            case 13: setObjects_regraMRE_5_REMEDIACAO_14_criterion_1_indice_13(objects); break;
            case 14: setObjects_regraMRE_6_REMEDIACAO_20_criterion_1_indice_14(objects); break;
            case 15: setObjects_regraMRE_1_REMEDIACAO_1_criterion_1_indice_15(objects); break;
            case 16: setObjects_regraMRE_2_REMEDIACAO_4_criterion_1_indice_16(objects); break;
            case 17: setObjects_regraMRE_2_REMEDIACAO_5_criterion_1_indice_17(objects); break;
            case 18: setObjects_regraMRE_6_REMEDIACAO_15_criterion_1_indice_18(objects); break;
            case 19: setObjects_regraMRE_1_REMEDIACAO_2_criterion_1_indice_19(objects); break;
            case 20: setObjects_regraMRE_2_REMEDIACAO_6_criterion_1_indice_20(objects); break;
            case 21: setObjects_regraMRE_6_REMEDIACAO_16_criterion_1_indice_21(objects); break;
            case 22: setObjects_regraMRE_2_REMEDIACAO_3_criterion_1_indice_22(objects); break;
            case 23: setObjects_regraMRE_2_REMEDIACAO_7_criterion_1_indice_23(objects); break;
            case 24: setObjects_regraMRE_6_REMEDIACAO_17_criterion_1_indice_24(objects); break;
            case 25: setObjects_regraMRE_4_REMEDIACAO_8_criterion_1_indice_25(objects); break;
            case 26: setObjects_regraMRE_6_REMEDIACAO_18_criterion_1_indice_26(objects); break;
            case 27: setObjects_regraMRE_5_REMEDIACAO_13_criterion_1_indice_27(objects); break;
            case 28: setObjects_regraMRE_5_REMEDIACAO_14_criterion_1_indice_28(objects); break;
            case 29: setObjects_regraMRE_6_REMEDIACAO_20_criterion_1_indice_29(objects); break;
            case 30: setObjects_regraMRE_1_REMEDIACAO_1_criterion_1_indice_30(objects); break;
            case 31: setObjects_regraMRE_2_REMEDIACAO_4_criterion_1_indice_31(objects); break;
            case 32: setObjects_regraMRE_2_REMEDIACAO_5_criterion_1_indice_32(objects); break;
            case 33: setObjects_regraMRE_6_REMEDIACAO_15_criterion_1_indice_33(objects); break;
            case 34: setObjects_regraMRE_1_REMEDIACAO_2_criterion_1_indice_34(objects); break;
            case 35: setObjects_regraMRE_2_REMEDIACAO_6_criterion_1_indice_35(objects); break;
            case 36: setObjects_regraMRE_6_REMEDIACAO_16_criterion_1_indice_36(objects); break;
            case 37: setObjects_regraMRE_2_REMEDIACAO_3_criterion_1_indice_37(objects); break;
            case 38: setObjects_regraMRE_2_REMEDIACAO_7_criterion_1_indice_38(objects); break;
            case 39: setObjects_regraMRE_6_REMEDIACAO_17_criterion_1_indice_39(objects); break;
            case 40: setObjects_regraMRE_4_REMEDIACAO_8_criterion_1_indice_40(objects); break;
            case 41: setObjects_regraMRE_6_REMEDIACAO_18_criterion_1_indice_41(objects); break;
            case 42: setObjects_regraMRE_5_REMEDIACAO_13_criterion_1_indice_42(objects); break;
            case 43: setObjects_regraMRE_5_REMEDIACAO_14_criterion_1_indice_43(objects); break;
            case 44: setObjects_regraMRE_6_REMEDIACAO_20_criterion_1_indice_44(objects); break;
            case 45: setObjects_regraMRE_1_REMEDIACAO_1_criterion_1_indice_45(objects); break;
            case 46: setObjects_regraMRE_2_REMEDIACAO_4_criterion_1_indice_46(objects); break;
            case 47: setObjects_regraMRE_2_REMEDIACAO_5_criterion_1_indice_47(objects); break;
            case 48: setObjects_regraMRE_6_REMEDIACAO_15_criterion_1_indice_48(objects); break;
            case 49: setObjects_regraMRE_1_REMEDIACAO_2_criterion_1_indice_49(objects); break;
            case 50: setObjects_regraMRE_2_REMEDIACAO_6_criterion_1_indice_50(objects); break;
            case 51: setObjects_regraMRE_6_REMEDIACAO_16_criterion_1_indice_51(objects); break;
            case 52: setObjects_regraMRE_2_REMEDIACAO_3_criterion_1_indice_52(objects); break;
            case 53: setObjects_regraMRE_2_REMEDIACAO_7_criterion_1_indice_53(objects); break;
            case 54: setObjects_regraMRE_6_REMEDIACAO_17_criterion_1_indice_54(objects); break;
            case 55: setObjects_regraMRE_4_REMEDIACAO_8_criterion_1_indice_55(objects); break;
            case 56: setObjects_regraMRE_6_REMEDIACAO_18_criterion_1_indice_56(objects); break;
            case 57: setObjects_regraMRE_5_REMEDIACAO_13_criterion_1_indice_57(objects); break;
            case 58: setObjects_regraMRE_5_REMEDIACAO_14_criterion_1_indice_58(objects); break;
            case 59: setObjects_regraMRE_6_REMEDIACAO_20_criterion_1_indice_59(objects); break;
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
 * @version 10/09/2015
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
