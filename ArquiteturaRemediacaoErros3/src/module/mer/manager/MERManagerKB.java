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

 class Jeops_RuleBase_MERManagerKB extends jeops.AbstractRuleBase {




	
    /**
     * Identifiers of rule ruleMER_1_0
     */
    private String[] identifiers_ruleMER_1_0 = {
        "mer",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_1_0
     *
     * @return the identifiers declared in rule ruleMER_1_0
     */
    private String[] getDeclaredIdentifiers_ruleMER_1_0() {
         return identifiers_ruleMER_1_0;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_1_0.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_1_0(int index) {
        switch (index) {
            case 0: return "module.entity.MultipleExternalRepresentation";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_1_0.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_1_0(int index) {
        switch (index) {
            case 0: return module.entity.MultipleExternalRepresentation.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_1_0.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_1_0(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_1_0.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_1_0(int index) {
        switch (index) {
            case 0: return module_entity_MultipleExternalRepresentation_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_1_0
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_1_0() {
        return new Object[] {
                            module_entity_MultipleExternalRepresentation_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_1_0
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_1_0(Object[] objects) {
        module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule ruleMER_1_0.<p>
     * The original expression was:<br>
     * <code>mer.getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_1_0_cond_0() {
        return (module_entity_MultipleExternalRepresentation_1.getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule ruleMER_1_0 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_1_0_cond(int index) {
        switch (index) {
            case 0: return ruleMER_1_0_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_1_0 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_1_0(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMER_1_0_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_1_0(int declIndex) {
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
     * Executes the action part of the rule ruleMER_1_0
     */
    private void ruleMER_1_0() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_MultipleExternalRepresentation_1 = module_entity_DBConnect_1.getMER(1L);
			modified(module_entity_MultipleExternalRepresentation_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibi��o de MRE 1 - mer 1");
			flush();

	    }




	
    /**
     * Identifiers of rule ruleMER_1_complexity_1_1
     */
    private String[] identifiers_ruleMER_1_complexity_1_1 = {
        "mer",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_1_complexity_1_1
     *
     * @return the identifiers declared in rule ruleMER_1_complexity_1_1
     */
    private String[] getDeclaredIdentifiers_ruleMER_1_complexity_1_1() {
         return identifiers_ruleMER_1_complexity_1_1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_1_complexity_1_1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_1_complexity_1_1(int index) {
        switch (index) {
            case 0: return "module.entity.MultipleExternalRepresentation";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_1_complexity_1_1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_1_complexity_1_1(int index) {
        switch (index) {
            case 0: return module.entity.MultipleExternalRepresentation.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_1_complexity_1_1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_1_complexity_1_1(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_1_complexity_1_1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_1_complexity_1_1(int index) {
        switch (index) {
            case 0: return module_entity_MultipleExternalRepresentation_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_1_complexity_1_1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_1_complexity_1_1() {
        return new Object[] {
                            module_entity_MultipleExternalRepresentation_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_1_complexity_1_1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_1_complexity_1_1(Object[] objects) {
        module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule ruleMER_1_complexity_1_1.<p>
     * The original expression was:<br>
     * <code>mer.getComplexity() == 1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_1_complexity_1_1_cond_0() {
        return (module_entity_MultipleExternalRepresentation_1.getComplexity() == 1);
    }

    /**
     * Checks whether some conditions of rule ruleMER_1_complexity_1_1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_1_complexity_1_1_cond(int index) {
        switch (index) {
            case 0: return ruleMER_1_complexity_1_1_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_1_complexity_1_1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_1_complexity_1_1(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMER_1_complexity_1_1_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_1_complexity_1_1(int declIndex) {
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
     * Executes the action part of the rule ruleMER_1_complexity_1_1
     */
    private void ruleMER_1_complexity_1_1() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_1_complexity_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_MultipleExternalRepresentation_1 = module_entity_DBConnect_1.getMER(1L);
			modified(module_entity_MultipleExternalRepresentation_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibi��o de MRE 1 - mer 1");
			flush();

	    }




	
    /**
     * Identifiers of rule ruleMER_1_merfunction_1_2
     */
    private String[] identifiers_ruleMER_1_merfunction_1_2 = {
        "merFunction",
        "mer",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_1_merfunction_1_2
     *
     * @return the identifiers declared in rule ruleMER_1_merfunction_1_2
     */
    private String[] getDeclaredIdentifiers_ruleMER_1_merfunction_1_2() {
         return identifiers_ruleMER_1_merfunction_1_2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_1_merfunction_1_2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_1_merfunction_1_2(int index) {
        switch (index) {
            case 0: return "module.entity.MERFunction";
            case 1: return "module.entity.MultipleExternalRepresentation";
            case 2: return "module.entity.DBConnect";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_1_merfunction_1_2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_1_merfunction_1_2(int index) {
        switch (index) {
            case 0: return module.entity.MERFunction.class;
            case 1: return module.entity.MultipleExternalRepresentation.class;
            case 2: return module.entity.DBConnect.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_1_merfunction_1_2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_1_merfunction_1_2(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 1: this.module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) value; break;
            case 2: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_1_merfunction_1_2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_1_merfunction_1_2(int index) {
        switch (index) {
            case 0: return module_entity_MERFunction_1;
            case 1: return module_entity_MultipleExternalRepresentation_1;
            case 2: return module_entity_DBConnect_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_1_merfunction_1_2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_1_merfunction_1_2() {
        return new Object[] {
                            module_entity_MERFunction_1,
                            module_entity_MultipleExternalRepresentation_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_1_merfunction_1_2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_1_merfunction_1_2(Object[] objects) {
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[0];
        module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) objects[1];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMER_1_merfunction_1_2.<p>
     * The original expression was:<br>
     * <code>merFunction.getId().equals(1) </code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_1_merfunction_1_2_cond_0() {
        return (module_entity_MERFunction_1.getId().equals(1) );
    }

    /**
     * Checks whether some conditions of rule ruleMER_1_merfunction_1_2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_1_merfunction_1_2_cond(int index) {
        switch (index) {
            case 0: return ruleMER_1_merfunction_1_2_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_1_merfunction_1_2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_1_merfunction_1_2(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMER_1_merfunction_1_2_cond_0()) return false;
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
     * Checks whether all the conditions of a rule which
     * reference some declared element of the declarations are
     * true.
     *
     * @param declIndex the index of the declared element.
     * @return <code>true</code> if the conditions that reference
     *          up to the given declaration are true;
     *          <code>false</code> otherwise.
     */
    private boolean checkCondForDeclaration_ruleMER_1_merfunction_1_2(int declIndex) {
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
     * Executes the action part of the rule ruleMER_1_merfunction_1_2
     */
    private void ruleMER_1_merfunction_1_2() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_1_merfunction_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_MultipleExternalRepresentation_1 = module_entity_DBConnect_1.getMER(1L);
			modified(module_entity_MultipleExternalRepresentation_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibi��o de MRE 1 - mer 1");
			flush();

	    }




	
    /**
     * Identifiers of rule ruleMER_1_typemer1_3
     */
    private String[] identifiers_ruleMER_1_typemer1_3 = {
        "typeMER",
        "mer",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_1_typemer1_3
     *
     * @return the identifiers declared in rule ruleMER_1_typemer1_3
     */
    private String[] getDeclaredIdentifiers_ruleMER_1_typemer1_3() {
         return identifiers_ruleMER_1_typemer1_3;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_1_typemer1_3.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_1_typemer1_3(int index) {
        switch (index) {
            case 0: return "module.entity.TypeMER";
            case 1: return "module.entity.MultipleExternalRepresentation";
            case 2: return "module.entity.DBConnect";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_1_typemer1_3.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_1_typemer1_3(int index) {
        switch (index) {
            case 0: return module.entity.TypeMER.class;
            case 1: return module.entity.MultipleExternalRepresentation.class;
            case 2: return module.entity.DBConnect.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_1_typemer1_3.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_1_typemer1_3(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_TypeMER_1 = (module.entity.TypeMER) value; break;
            case 1: this.module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) value; break;
            case 2: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_1_typemer1_3.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_1_typemer1_3(int index) {
        switch (index) {
            case 0: return module_entity_TypeMER_1;
            case 1: return module_entity_MultipleExternalRepresentation_1;
            case 2: return module_entity_DBConnect_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_1_typemer1_3
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_1_typemer1_3() {
        return new Object[] {
                            module_entity_TypeMER_1,
                            module_entity_MultipleExternalRepresentation_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_1_typemer1_3
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_1_typemer1_3(Object[] objects) {
        module_entity_TypeMER_1 = (module.entity.TypeMER) objects[0];
        module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) objects[1];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMER_1_typemer1_3.<p>
     * The original expression was:<br>
     * <code>typeMER.getId().equals(1) </code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_1_typemer1_3_cond_0() {
        return (module_entity_TypeMER_1.getId().equals(1) );
    }

    /**
     * Checks whether some conditions of rule ruleMER_1_typemer1_3 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_1_typemer1_3_cond(int index) {
        switch (index) {
            case 0: return ruleMER_1_typemer1_3_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_1_typemer1_3 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_1_typemer1_3(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMER_1_typemer1_3_cond_0()) return false;
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
     * Checks whether all the conditions of a rule which
     * reference some declared element of the declarations are
     * true.
     *
     * @param declIndex the index of the declared element.
     * @return <code>true</code> if the conditions that reference
     *          up to the given declaration are true;
     *          <code>false</code> otherwise.
     */
    private boolean checkCondForDeclaration_ruleMER_1_typemer1_3(int declIndex) {
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
     * Executes the action part of the rule ruleMER_1_typemer1_3
     */
    private void ruleMER_1_typemer1_3() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_1_typemer1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_MultipleExternalRepresentation_1 = module_entity_DBConnect_1.getMER(1L);
			modified(module_entity_MultipleExternalRepresentation_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibi��o de MRE 1 - mer 1");
			flush();

	    }




	
    /**
     * Identifiers of rule ruleMER_2_4
     */
    private String[] identifiers_ruleMER_2_4 = {
        "mer",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_2_4
     *
     * @return the identifiers declared in rule ruleMER_2_4
     */
    private String[] getDeclaredIdentifiers_ruleMER_2_4() {
         return identifiers_ruleMER_2_4;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_2_4.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_2_4(int index) {
        switch (index) {
            case 0: return "module.entity.MultipleExternalRepresentation";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_2_4.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_2_4(int index) {
        switch (index) {
            case 0: return module.entity.MultipleExternalRepresentation.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_2_4.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_2_4(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_2_4.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_2_4(int index) {
        switch (index) {
            case 0: return module_entity_MultipleExternalRepresentation_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_2_4
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_2_4() {
        return new Object[] {
                            module_entity_MultipleExternalRepresentation_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_2_4
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_2_4(Object[] objects) {
        module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule ruleMER_2_4.<p>
     * The original expression was:<br>
     * <code>mer.getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_2_4_cond_0() {
        return (module_entity_MultipleExternalRepresentation_1.getId().equals(2L));
    }

    /**
     * Checks whether some conditions of rule ruleMER_2_4 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_2_4_cond(int index) {
        switch (index) {
            case 0: return ruleMER_2_4_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_2_4 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_2_4(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMER_2_4_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_2_4(int declIndex) {
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
     * Executes the action part of the rule ruleMER_2_4
     */
    private void ruleMER_2_4() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_MultipleExternalRepresentation_1 = module_entity_DBConnect_1.getMER(2L);
			modified(module_entity_MultipleExternalRepresentation_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibi��o de MRE 2 - mer 2");
			flush();

	    }




	
    /**
     * Identifiers of rule ruleMER_2_complexity_2_5
     */
    private String[] identifiers_ruleMER_2_complexity_2_5 = {
        "mer",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_2_complexity_2_5
     *
     * @return the identifiers declared in rule ruleMER_2_complexity_2_5
     */
    private String[] getDeclaredIdentifiers_ruleMER_2_complexity_2_5() {
         return identifiers_ruleMER_2_complexity_2_5;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_2_complexity_2_5.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_2_complexity_2_5(int index) {
        switch (index) {
            case 0: return "module.entity.MultipleExternalRepresentation";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_2_complexity_2_5.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_2_complexity_2_5(int index) {
        switch (index) {
            case 0: return module.entity.MultipleExternalRepresentation.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_2_complexity_2_5.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_2_complexity_2_5(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_2_complexity_2_5.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_2_complexity_2_5(int index) {
        switch (index) {
            case 0: return module_entity_MultipleExternalRepresentation_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_2_complexity_2_5
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_2_complexity_2_5() {
        return new Object[] {
                            module_entity_MultipleExternalRepresentation_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_2_complexity_2_5
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_2_complexity_2_5(Object[] objects) {
        module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule ruleMER_2_complexity_2_5.<p>
     * The original expression was:<br>
     * <code>mer.getComplexity() == 2</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_2_complexity_2_5_cond_0() {
        return (module_entity_MultipleExternalRepresentation_1.getComplexity() == 2);
    }

    /**
     * Checks whether some conditions of rule ruleMER_2_complexity_2_5 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_2_complexity_2_5_cond(int index) {
        switch (index) {
            case 0: return ruleMER_2_complexity_2_5_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_2_complexity_2_5 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_2_complexity_2_5(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMER_2_complexity_2_5_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_2_complexity_2_5(int declIndex) {
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
     * Executes the action part of the rule ruleMER_2_complexity_2_5
     */
    private void ruleMER_2_complexity_2_5() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_2_complexity_2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_MultipleExternalRepresentation_1 = module_entity_DBConnect_1.getMER(2L);
			modified(module_entity_MultipleExternalRepresentation_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibi��o de MRE 2 - mer 2");
			flush();

	    }




	
    /**
     * Identifiers of rule ruleMER_2_merfunction_1_2_6
     */
    private String[] identifiers_ruleMER_2_merfunction_1_2_6 = {
        "merFunction",
        "mer",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_2_merfunction_1_2_6
     *
     * @return the identifiers declared in rule ruleMER_2_merfunction_1_2_6
     */
    private String[] getDeclaredIdentifiers_ruleMER_2_merfunction_1_2_6() {
         return identifiers_ruleMER_2_merfunction_1_2_6;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_2_merfunction_1_2_6.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_2_merfunction_1_2_6(int index) {
        switch (index) {
            case 0: return "module.entity.MERFunction";
            case 1: return "module.entity.MultipleExternalRepresentation";
            case 2: return "module.entity.DBConnect";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_2_merfunction_1_2_6.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_2_merfunction_1_2_6(int index) {
        switch (index) {
            case 0: return module.entity.MERFunction.class;
            case 1: return module.entity.MultipleExternalRepresentation.class;
            case 2: return module.entity.DBConnect.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_2_merfunction_1_2_6.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_2_merfunction_1_2_6(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 1: this.module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) value; break;
            case 2: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_2_merfunction_1_2_6.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_2_merfunction_1_2_6(int index) {
        switch (index) {
            case 0: return module_entity_MERFunction_1;
            case 1: return module_entity_MultipleExternalRepresentation_1;
            case 2: return module_entity_DBConnect_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_2_merfunction_1_2_6
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_2_merfunction_1_2_6() {
        return new Object[] {
                            module_entity_MERFunction_1,
                            module_entity_MultipleExternalRepresentation_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_2_merfunction_1_2_6
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_2_merfunction_1_2_6(Object[] objects) {
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[0];
        module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) objects[1];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMER_2_merfunction_1_2_6.<p>
     * The original expression was:<br>
     * <code>merFunction.getId().equals(1) || 
			merFunction.getId().equals(2) </code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_2_merfunction_1_2_6_cond_0() {
        return (module_entity_MERFunction_1.getId().equals(1) || 
			module_entity_MERFunction_1.getId().equals(2) );
    }

    /**
     * Checks whether some conditions of rule ruleMER_2_merfunction_1_2_6 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_2_merfunction_1_2_6_cond(int index) {
        switch (index) {
            case 0: return ruleMER_2_merfunction_1_2_6_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_2_merfunction_1_2_6 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_2_merfunction_1_2_6(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMER_2_merfunction_1_2_6_cond_0()) return false;
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
     * Checks whether all the conditions of a rule which
     * reference some declared element of the declarations are
     * true.
     *
     * @param declIndex the index of the declared element.
     * @return <code>true</code> if the conditions that reference
     *          up to the given declaration are true;
     *          <code>false</code> otherwise.
     */
    private boolean checkCondForDeclaration_ruleMER_2_merfunction_1_2_6(int declIndex) {
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
     * Executes the action part of the rule ruleMER_2_merfunction_1_2_6
     */
    private void ruleMER_2_merfunction_1_2_6() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_2_merfunction_1_2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_MultipleExternalRepresentation_1 = module_entity_DBConnect_1.getMER(2L);
			modified(module_entity_MultipleExternalRepresentation_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibi��o de MRE 2 - mer 2");
			flush();

	    }




	
    /**
     * Identifiers of rule ruleMER_2_typemer1_2_7
     */
    private String[] identifiers_ruleMER_2_typemer1_2_7 = {
        "typeMER",
        "mer",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_2_typemer1_2_7
     *
     * @return the identifiers declared in rule ruleMER_2_typemer1_2_7
     */
    private String[] getDeclaredIdentifiers_ruleMER_2_typemer1_2_7() {
         return identifiers_ruleMER_2_typemer1_2_7;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_2_typemer1_2_7.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_2_typemer1_2_7(int index) {
        switch (index) {
            case 0: return "module.entity.TypeMER";
            case 1: return "module.entity.MultipleExternalRepresentation";
            case 2: return "module.entity.DBConnect";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_2_typemer1_2_7.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_2_typemer1_2_7(int index) {
        switch (index) {
            case 0: return module.entity.TypeMER.class;
            case 1: return module.entity.MultipleExternalRepresentation.class;
            case 2: return module.entity.DBConnect.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_2_typemer1_2_7.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_2_typemer1_2_7(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_TypeMER_1 = (module.entity.TypeMER) value; break;
            case 1: this.module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) value; break;
            case 2: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_2_typemer1_2_7.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_2_typemer1_2_7(int index) {
        switch (index) {
            case 0: return module_entity_TypeMER_1;
            case 1: return module_entity_MultipleExternalRepresentation_1;
            case 2: return module_entity_DBConnect_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_2_typemer1_2_7
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_2_typemer1_2_7() {
        return new Object[] {
                            module_entity_TypeMER_1,
                            module_entity_MultipleExternalRepresentation_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_2_typemer1_2_7
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_2_typemer1_2_7(Object[] objects) {
        module_entity_TypeMER_1 = (module.entity.TypeMER) objects[0];
        module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) objects[1];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMER_2_typemer1_2_7.<p>
     * The original expression was:<br>
     * <code>typeMER.getId().equals(1) || 
			typeMER.getId().equals(2) </code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_2_typemer1_2_7_cond_0() {
        return (module_entity_TypeMER_1.getId().equals(1) || 
			module_entity_TypeMER_1.getId().equals(2) );
    }

    /**
     * Checks whether some conditions of rule ruleMER_2_typemer1_2_7 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_2_typemer1_2_7_cond(int index) {
        switch (index) {
            case 0: return ruleMER_2_typemer1_2_7_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_2_typemer1_2_7 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_2_typemer1_2_7(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMER_2_typemer1_2_7_cond_0()) return false;
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
     * Checks whether all the conditions of a rule which
     * reference some declared element of the declarations are
     * true.
     *
     * @param declIndex the index of the declared element.
     * @return <code>true</code> if the conditions that reference
     *          up to the given declaration are true;
     *          <code>false</code> otherwise.
     */
    private boolean checkCondForDeclaration_ruleMER_2_typemer1_2_7(int declIndex) {
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
     * Executes the action part of the rule ruleMER_2_typemer1_2_7
     */
    private void ruleMER_2_typemer1_2_7() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_2_typemer1_2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_MultipleExternalRepresentation_1 = module_entity_DBConnect_1.getMER(2L);
			modified(module_entity_MultipleExternalRepresentation_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibi��o de MRE 2 - mer 2");
			flush();

	    }



// end_rules
	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "ruleMER_1_0",
        "ruleMER_1_complexity_1_1",
        "ruleMER_1_merfunction_1_2",
        "ruleMER_1_typemer1_3",
        "ruleMER_2_4",
        "ruleMER_2_complexity_2_5",
        "ruleMER_2_merfunction_1_2_6",
        "ruleMER_2_typemer1_2_7"
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
        4,
        4,
        3,
        3,
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
            case 0: return ruleMER_1_0_cond(condIndex);
            case 1: return ruleMER_1_complexity_1_1_cond(condIndex);
            case 2: return ruleMER_1_merfunction_1_2_cond(condIndex);
            case 3: return ruleMER_1_typemer1_3_cond(condIndex);
            case 4: return ruleMER_2_4_cond(condIndex);
            case 5: return ruleMER_2_complexity_2_5_cond(condIndex);
            case 6: return ruleMER_2_merfunction_1_2_6_cond(condIndex);
            case 7: return ruleMER_2_typemer1_2_7_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_ruleMER_1_0(declIndex);
            case 1: return checkConditionsOnlyOf_ruleMER_1_complexity_1_1(declIndex);
            case 2: return checkConditionsOnlyOf_ruleMER_1_merfunction_1_2(declIndex);
            case 3: return checkConditionsOnlyOf_ruleMER_1_typemer1_3(declIndex);
            case 4: return checkConditionsOnlyOf_ruleMER_2_4(declIndex);
            case 5: return checkConditionsOnlyOf_ruleMER_2_complexity_2_5(declIndex);
            case 6: return checkConditionsOnlyOf_ruleMER_2_merfunction_1_2_6(declIndex);
            case 7: return checkConditionsOnlyOf_ruleMER_2_typemer1_2_7(declIndex);
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
            case 0: return checkCondForDeclaration_ruleMER_1_0(declIndex);
            case 1: return checkCondForDeclaration_ruleMER_1_complexity_1_1(declIndex);
            case 2: return checkCondForDeclaration_ruleMER_1_merfunction_1_2(declIndex);
            case 3: return checkCondForDeclaration_ruleMER_1_typemer1_3(declIndex);
            case 4: return checkCondForDeclaration_ruleMER_2_4(declIndex);
            case 5: return checkCondForDeclaration_ruleMER_2_complexity_2_5(declIndex);
            case 6: return checkCondForDeclaration_ruleMER_2_merfunction_1_2_6(declIndex);
            case 7: return checkCondForDeclaration_ruleMER_2_typemer1_2_7(declIndex);
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
            case 0: return getDeclaredClassName_ruleMER_1_0(declIndex);
            case 1: return getDeclaredClassName_ruleMER_1_complexity_1_1(declIndex);
            case 2: return getDeclaredClassName_ruleMER_1_merfunction_1_2(declIndex);
            case 3: return getDeclaredClassName_ruleMER_1_typemer1_3(declIndex);
            case 4: return getDeclaredClassName_ruleMER_2_4(declIndex);
            case 5: return getDeclaredClassName_ruleMER_2_complexity_2_5(declIndex);
            case 6: return getDeclaredClassName_ruleMER_2_merfunction_1_2_6(declIndex);
            case 7: return getDeclaredClassName_ruleMER_2_typemer1_2_7(declIndex);
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
            case 0: return getDeclaredClass_ruleMER_1_0(declIndex);
            case 1: return getDeclaredClass_ruleMER_1_complexity_1_1(declIndex);
            case 2: return getDeclaredClass_ruleMER_1_merfunction_1_2(declIndex);
            case 3: return getDeclaredClass_ruleMER_1_typemer1_3(declIndex);
            case 4: return getDeclaredClass_ruleMER_2_4(declIndex);
            case 5: return getDeclaredClass_ruleMER_2_complexity_2_5(declIndex);
            case 6: return getDeclaredClass_ruleMER_2_merfunction_1_2_6(declIndex);
            case 7: return getDeclaredClass_ruleMER_2_typemer1_2_7(declIndex);
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
            case 0: ruleMER_1_0(); break;
            case 1: ruleMER_1_complexity_1_1(); break;
            case 2: ruleMER_1_merfunction_1_2(); break;
            case 3: ruleMER_1_typemer1_3(); break;
            case 4: ruleMER_2_4(); break;
            case 5: ruleMER_2_complexity_2_5(); break;
            case 6: ruleMER_2_merfunction_1_2_6(); break;
            case 7: ruleMER_2_typemer1_2_7(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 8;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_ruleMER_1_0();
            case 1: return getDeclaredIdentifiers_ruleMER_1_complexity_1_1();
            case 2: return getDeclaredIdentifiers_ruleMER_1_merfunction_1_2();
            case 3: return getDeclaredIdentifiers_ruleMER_1_typemer1_3();
            case 4: return getDeclaredIdentifiers_ruleMER_2_4();
            case 5: return getDeclaredIdentifiers_ruleMER_2_complexity_2_5();
            case 6: return getDeclaredIdentifiers_ruleMER_2_merfunction_1_2_6();
            case 7: return getDeclaredIdentifiers_ruleMER_2_typemer1_2_7();
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
            case 0: setObject_ruleMER_1_0(declIndex, value); break;
            case 1: setObject_ruleMER_1_complexity_1_1(declIndex, value); break;
            case 2: setObject_ruleMER_1_merfunction_1_2(declIndex, value); break;
            case 3: setObject_ruleMER_1_typemer1_3(declIndex, value); break;
            case 4: setObject_ruleMER_2_4(declIndex, value); break;
            case 5: setObject_ruleMER_2_complexity_2_5(declIndex, value); break;
            case 6: setObject_ruleMER_2_merfunction_1_2_6(declIndex, value); break;
            case 7: setObject_ruleMER_2_typemer1_2_7(declIndex, value); break;
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
            case 0: return getObject_ruleMER_1_0(declIndex);
            case 1: return getObject_ruleMER_1_complexity_1_1(declIndex);
            case 2: return getObject_ruleMER_1_merfunction_1_2(declIndex);
            case 3: return getObject_ruleMER_1_typemer1_3(declIndex);
            case 4: return getObject_ruleMER_2_4(declIndex);
            case 5: return getObject_ruleMER_2_complexity_2_5(declIndex);
            case 6: return getObject_ruleMER_2_merfunction_1_2_6(declIndex);
            case 7: return getObject_ruleMER_2_typemer1_2_7(declIndex);
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
            case 0: return getObjects_ruleMER_1_0();
            case 1: return getObjects_ruleMER_1_complexity_1_1();
            case 2: return getObjects_ruleMER_1_merfunction_1_2();
            case 3: return getObjects_ruleMER_1_typemer1_3();
            case 4: return getObjects_ruleMER_2_4();
            case 5: return getObjects_ruleMER_2_complexity_2_5();
            case 6: return getObjects_ruleMER_2_merfunction_1_2_6();
            case 7: return getObjects_ruleMER_2_typemer1_2_7();
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
            case 0: setObjects_ruleMER_1_0(objects); break;
            case 1: setObjects_ruleMER_1_complexity_1_1(objects); break;
            case 2: setObjects_ruleMER_1_merfunction_1_2(objects); break;
            case 3: setObjects_ruleMER_1_typemer1_3(objects); break;
            case 4: setObjects_ruleMER_2_4(objects); break;
            case 5: setObjects_ruleMER_2_complexity_2_5(objects); break;
            case 6: setObjects_ruleMER_2_merfunction_1_2_6(objects); break;
            case 7: setObjects_ruleMER_2_typemer1_2_7(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private module.entity.MultipleExternalRepresentation module_entity_MultipleExternalRepresentation_1;
    private module.entity.DBConnect module_entity_DBConnect_1;
    private module.entity.RuleToHuman module_entity_RuleToHuman_1;
    private module.entity.MERFunction module_entity_MERFunction_1;
    private module.entity.TypeMER module_entity_TypeMER_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_MERManagerKB(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file MERManagerKB.rules
 *
 * @version 19/04/2015
 */
public class MERManagerKB extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public MERManagerKB(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public MERManagerKB() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_MERManagerKB(this);
    }

}
