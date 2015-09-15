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
     * Identifiers of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0() {
         return identifiers_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(2L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0
     */
    private void regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 6\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"NÃO utilizar MRE específica\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(3L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 3\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibição de MRE 3 - MRE 3");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1() {
         return identifiers_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(2L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1
     */
    private void regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 6\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"NÃO utilizar MRE específica\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(4L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 4\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibição de MRE 4 - MRE 4");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2() {
         return identifiers_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(2L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2
     */
    private void regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 6\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"NÃO utilizar MRE específica\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(3L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 3\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibição de MRE 3 - MRE 3");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3
     */
    private String[] identifiers_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3
     *
     * @return the identifiers declared in rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3
     */
    private String[] getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3() {
         return identifiers_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getMer().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3_cond_0() {
        return (module_entity_Action_1.getRemediation().getMer().getId().equals(6L));
    }

    /**
     * Condition 1 of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getCriterion().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3_cond_1() {
        return (module_entity_Action_1.getRemediation().getCriterion().getId().equals(2L));
    }

    /**
     * Checks whether some conditions of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3_cond(int index) {
        switch (index) {
            case 0: return regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3_cond_0();
            case 1: return regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3_cond_0()) return false;
                if (!regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3_cond_1()) return false;
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
    private boolean checkCondForDeclaration_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3(int declIndex) {
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
     * Executes the action part of the rule regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3
     */
    private void regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3() {
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMRE = \"MRE 6\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCritério = \"NÃO utilizar MRE específica\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(4L);
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Exiba a MRE \"MRE 4\" \n");
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibição de MRE 4 - MRE 4");
			flush();

	    }


// -rule-end- 

// end_rules
	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0",
        "regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1",
        "regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2",
        "regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3"
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
            case 0: return regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0_cond(condIndex);
            case 1: return regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1_cond(condIndex);
            case 2: return regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2_cond(condIndex);
            case 3: return regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0(declIndex);
            case 1: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1(declIndex);
            case 2: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2(declIndex);
            case 3: return checkConditionsOnlyOf_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3(declIndex);
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
            case 0: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0(declIndex);
            case 1: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1(declIndex);
            case 2: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2(declIndex);
            case 3: return checkCondForDeclaration_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3(declIndex);
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
            case 0: return getDeclaredClassName_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0(declIndex);
            case 1: return getDeclaredClassName_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1(declIndex);
            case 2: return getDeclaredClassName_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2(declIndex);
            case 3: return getDeclaredClassName_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3(declIndex);
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
            case 0: return getDeclaredClass_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0(declIndex);
            case 1: return getDeclaredClass_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1(declIndex);
            case 2: return getDeclaredClass_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2(declIndex);
            case 3: return getDeclaredClass_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3(declIndex);
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
            case 0: regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0(); break;
            case 1: regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1(); break;
            case 2: regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2(); break;
            case 3: regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3(); break;
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
            case 0: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0();
            case 1: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1();
            case 2: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2();
            case 3: return getDeclaredIdentifiers_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3();
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
            case 0: setObject_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0(declIndex, value); break;
            case 1: setObject_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1(declIndex, value); break;
            case 2: setObject_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2(declIndex, value); break;
            case 3: setObject_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3(declIndex, value); break;
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
            case 0: return getObject_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0(declIndex);
            case 1: return getObject_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1(declIndex);
            case 2: return getObject_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2(declIndex);
            case 3: return getObject_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3(declIndex);
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
            case 0: return getObjects_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0();
            case 1: return getObjects_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1();
            case 2: return getObjects_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2();
            case 3: return getObjects_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3();
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
            case 0: setObjects_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_0(objects); break;
            case 1: setObjects_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_1(objects); break;
            case 2: setObjects_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_2(objects); break;
            case 3: setObjects_regraMRE_6_REMEDIACAO_22_criterioMRENaoEspecifica_2_indice_3(objects); break;
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
 * @version 14/09/2015
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
