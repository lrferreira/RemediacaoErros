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

 class Jeops_RuleBase_MERManagerComplexityKB extends jeops.AbstractRuleBase {





	
    /**
     * Identifiers of rule ruleMER_1_complexity_1_0
     */
    private String[] identifiers_ruleMER_1_complexity_1_0 = {
        "action",
        "complexity",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_1_complexity_1_0
     *
     * @return the identifiers declared in rule ruleMER_1_complexity_1_0
     */
    private String[] getDeclaredIdentifiers_ruleMER_1_complexity_1_0() {
         return identifiers_ruleMER_1_complexity_1_0;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_1_complexity_1_0.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_1_complexity_1_0(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "java.lang.Integer";
            case 2: return "module.entity.DBConnect";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_1_complexity_1_0.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_1_complexity_1_0(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return java.lang.Integer.class;
            case 2: return module.entity.DBConnect.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_1_complexity_1_0.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_1_complexity_1_0(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.java_lang_Integer_1 = (java.lang.Integer) value; break;
            case 2: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_1_complexity_1_0.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_1_complexity_1_0(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return java_lang_Integer_1;
            case 2: return module_entity_DBConnect_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_1_complexity_1_0
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_1_complexity_1_0() {
        return new Object[] {
                            module_entity_Action_1,
                            java_lang_Integer_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_1_complexity_1_0
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_1_complexity_1_0(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        java_lang_Integer_1 = (java.lang.Integer) objects[1];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMER_1_complexity_1_0.<p>
     * The original expression was:<br>
     * <code>complexity == 1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_1_complexity_1_0_cond_0() {
        return (java_lang_Integer_1 == 1);
    }

    /**
     * Checks whether some conditions of rule ruleMER_1_complexity_1_0 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_1_complexity_1_0_cond(int index) {
        switch (index) {
            case 0: return ruleMER_1_complexity_1_0_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_1_complexity_1_0 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_1_complexity_1_0(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!ruleMER_1_complexity_1_0_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_1_complexity_1_0(int declIndex) {
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
     * Executes the action part of the rule ruleMER_1_complexity_1_0
     */
    private void ruleMER_1_complexity_1_0() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_1_complexity_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "complexity == 1;\n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(1L);
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_1_complexity_1_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 1 - mer 1");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule ruleMER_2_complexity_2_1
     */
    private String[] identifiers_ruleMER_2_complexity_2_1 = {
        "action",
        "complexity",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_2_complexity_2_1
     *
     * @return the identifiers declared in rule ruleMER_2_complexity_2_1
     */
    private String[] getDeclaredIdentifiers_ruleMER_2_complexity_2_1() {
         return identifiers_ruleMER_2_complexity_2_1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_2_complexity_2_1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_2_complexity_2_1(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "java.lang.Integer";
            case 2: return "module.entity.DBConnect";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_2_complexity_2_1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_2_complexity_2_1(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return java.lang.Integer.class;
            case 2: return module.entity.DBConnect.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_2_complexity_2_1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_2_complexity_2_1(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.java_lang_Integer_1 = (java.lang.Integer) value; break;
            case 2: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_2_complexity_2_1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_2_complexity_2_1(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return java_lang_Integer_1;
            case 2: return module_entity_DBConnect_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_2_complexity_2_1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_2_complexity_2_1() {
        return new Object[] {
                            module_entity_Action_1,
                            java_lang_Integer_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_2_complexity_2_1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_2_complexity_2_1(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        java_lang_Integer_1 = (java.lang.Integer) objects[1];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMER_2_complexity_2_1.<p>
     * The original expression was:<br>
     * <code>complexity == 2</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_2_complexity_2_1_cond_0() {
        return (java_lang_Integer_1 == 2);
    }

    /**
     * Checks whether some conditions of rule ruleMER_2_complexity_2_1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_2_complexity_2_1_cond(int index) {
        switch (index) {
            case 0: return ruleMER_2_complexity_2_1_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_2_complexity_2_1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_2_complexity_2_1(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!ruleMER_2_complexity_2_1_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_2_complexity_2_1(int declIndex) {
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
     * Executes the action part of the rule ruleMER_2_complexity_2_1
     */
    private void ruleMER_2_complexity_2_1() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_2_complexity_2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "complexity == 2;\n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(2L);
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_2_complexity_2_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 2 - mer 2");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule ruleMER_3_complexity_3_2
     */
    private String[] identifiers_ruleMER_3_complexity_3_2 = {
        "action",
        "complexity",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_3_complexity_3_2
     *
     * @return the identifiers declared in rule ruleMER_3_complexity_3_2
     */
    private String[] getDeclaredIdentifiers_ruleMER_3_complexity_3_2() {
         return identifiers_ruleMER_3_complexity_3_2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_3_complexity_3_2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_3_complexity_3_2(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "java.lang.Integer";
            case 2: return "module.entity.DBConnect";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_3_complexity_3_2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_3_complexity_3_2(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return java.lang.Integer.class;
            case 2: return module.entity.DBConnect.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_3_complexity_3_2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_3_complexity_3_2(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.java_lang_Integer_1 = (java.lang.Integer) value; break;
            case 2: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_3_complexity_3_2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_3_complexity_3_2(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return java_lang_Integer_1;
            case 2: return module_entity_DBConnect_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_3_complexity_3_2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_3_complexity_3_2() {
        return new Object[] {
                            module_entity_Action_1,
                            java_lang_Integer_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_3_complexity_3_2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_3_complexity_3_2(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        java_lang_Integer_1 = (java.lang.Integer) objects[1];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMER_3_complexity_3_2.<p>
     * The original expression was:<br>
     * <code>complexity == 3</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_3_complexity_3_2_cond_0() {
        return (java_lang_Integer_1 == 3);
    }

    /**
     * Checks whether some conditions of rule ruleMER_3_complexity_3_2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_3_complexity_3_2_cond(int index) {
        switch (index) {
            case 0: return ruleMER_3_complexity_3_2_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_3_complexity_3_2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_3_complexity_3_2(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!ruleMER_3_complexity_3_2_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_3_complexity_3_2(int declIndex) {
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
     * Executes the action part of the rule ruleMER_3_complexity_3_2
     */
    private void ruleMER_3_complexity_3_2() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_3_complexity_3_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "complexity == 3;\n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(3L);
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_3_complexity_3_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 3 - mer 3");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule ruleMER_4_complexity_4_3
     */
    private String[] identifiers_ruleMER_4_complexity_4_3 = {
        "action",
        "complexity",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_4_complexity_4_3
     *
     * @return the identifiers declared in rule ruleMER_4_complexity_4_3
     */
    private String[] getDeclaredIdentifiers_ruleMER_4_complexity_4_3() {
         return identifiers_ruleMER_4_complexity_4_3;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_4_complexity_4_3.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_4_complexity_4_3(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "java.lang.Integer";
            case 2: return "module.entity.DBConnect";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_4_complexity_4_3.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_4_complexity_4_3(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return java.lang.Integer.class;
            case 2: return module.entity.DBConnect.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_4_complexity_4_3.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_4_complexity_4_3(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.java_lang_Integer_1 = (java.lang.Integer) value; break;
            case 2: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_4_complexity_4_3.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_4_complexity_4_3(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return java_lang_Integer_1;
            case 2: return module_entity_DBConnect_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_4_complexity_4_3
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_4_complexity_4_3() {
        return new Object[] {
                            module_entity_Action_1,
                            java_lang_Integer_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_4_complexity_4_3
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_4_complexity_4_3(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        java_lang_Integer_1 = (java.lang.Integer) objects[1];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMER_4_complexity_4_3.<p>
     * The original expression was:<br>
     * <code>complexity == 4</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_4_complexity_4_3_cond_0() {
        return (java_lang_Integer_1 == 4);
    }

    /**
     * Checks whether some conditions of rule ruleMER_4_complexity_4_3 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_4_complexity_4_3_cond(int index) {
        switch (index) {
            case 0: return ruleMER_4_complexity_4_3_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_4_complexity_4_3 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_4_complexity_4_3(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!ruleMER_4_complexity_4_3_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_4_complexity_4_3(int declIndex) {
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
     * Executes the action part of the rule ruleMER_4_complexity_4_3
     */
    private void ruleMER_4_complexity_4_3() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_4_complexity_4_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "complexity == 4;\n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(4L);
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_4_complexity_4_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 4 - mer 4");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule ruleMER_5_complexity_5_4
     */
    private String[] identifiers_ruleMER_5_complexity_5_4 = {
        "action",
        "complexity",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_5_complexity_5_4
     *
     * @return the identifiers declared in rule ruleMER_5_complexity_5_4
     */
    private String[] getDeclaredIdentifiers_ruleMER_5_complexity_5_4() {
         return identifiers_ruleMER_5_complexity_5_4;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_5_complexity_5_4.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_5_complexity_5_4(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "java.lang.Integer";
            case 2: return "module.entity.DBConnect";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_5_complexity_5_4.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_5_complexity_5_4(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return java.lang.Integer.class;
            case 2: return module.entity.DBConnect.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_5_complexity_5_4.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_5_complexity_5_4(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.java_lang_Integer_1 = (java.lang.Integer) value; break;
            case 2: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_5_complexity_5_4.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_5_complexity_5_4(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return java_lang_Integer_1;
            case 2: return module_entity_DBConnect_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_5_complexity_5_4
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_5_complexity_5_4() {
        return new Object[] {
                            module_entity_Action_1,
                            java_lang_Integer_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_5_complexity_5_4
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_5_complexity_5_4(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        java_lang_Integer_1 = (java.lang.Integer) objects[1];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMER_5_complexity_5_4.<p>
     * The original expression was:<br>
     * <code>complexity == 5</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_5_complexity_5_4_cond_0() {
        return (java_lang_Integer_1 == 5);
    }

    /**
     * Checks whether some conditions of rule ruleMER_5_complexity_5_4 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_5_complexity_5_4_cond(int index) {
        switch (index) {
            case 0: return ruleMER_5_complexity_5_4_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_5_complexity_5_4 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_5_complexity_5_4(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!ruleMER_5_complexity_5_4_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_5_complexity_5_4(int declIndex) {
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
     * Executes the action part of the rule ruleMER_5_complexity_5_4
     */
    private void ruleMER_5_complexity_5_4() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_5_complexity_5_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "complexity == 5;\n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(5L);
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_5_complexity_5_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 5 - mer 5");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule ruleMER_8_complexity_3_5
     */
    private String[] identifiers_ruleMER_8_complexity_3_5 = {
        "action",
        "complexity",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_8_complexity_3_5
     *
     * @return the identifiers declared in rule ruleMER_8_complexity_3_5
     */
    private String[] getDeclaredIdentifiers_ruleMER_8_complexity_3_5() {
         return identifiers_ruleMER_8_complexity_3_5;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_8_complexity_3_5.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_8_complexity_3_5(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "java.lang.Integer";
            case 2: return "module.entity.DBConnect";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_8_complexity_3_5.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_8_complexity_3_5(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return java.lang.Integer.class;
            case 2: return module.entity.DBConnect.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_8_complexity_3_5.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_8_complexity_3_5(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.java_lang_Integer_1 = (java.lang.Integer) value; break;
            case 2: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_8_complexity_3_5.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_8_complexity_3_5(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return java_lang_Integer_1;
            case 2: return module_entity_DBConnect_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_8_complexity_3_5
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_8_complexity_3_5() {
        return new Object[] {
                            module_entity_Action_1,
                            java_lang_Integer_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_8_complexity_3_5
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_8_complexity_3_5(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        java_lang_Integer_1 = (java.lang.Integer) objects[1];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMER_8_complexity_3_5.<p>
     * The original expression was:<br>
     * <code>complexity == 3</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_8_complexity_3_5_cond_0() {
        return (java_lang_Integer_1 == 3);
    }

    /**
     * Checks whether some conditions of rule ruleMER_8_complexity_3_5 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_8_complexity_3_5_cond(int index) {
        switch (index) {
            case 0: return ruleMER_8_complexity_3_5_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_8_complexity_3_5 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_8_complexity_3_5(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!ruleMER_8_complexity_3_5_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_8_complexity_3_5(int declIndex) {
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
     * Executes the action part of the rule ruleMER_8_complexity_3_5
     */
    private void ruleMER_8_complexity_3_5() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_8_complexity_3_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "complexity == 3;\n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(8L);
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_8_complexity_3_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 8 - mer 8");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule ruleMER_9_complexity_4_6
     */
    private String[] identifiers_ruleMER_9_complexity_4_6 = {
        "action",
        "complexity",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_9_complexity_4_6
     *
     * @return the identifiers declared in rule ruleMER_9_complexity_4_6
     */
    private String[] getDeclaredIdentifiers_ruleMER_9_complexity_4_6() {
         return identifiers_ruleMER_9_complexity_4_6;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_9_complexity_4_6.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_9_complexity_4_6(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "java.lang.Integer";
            case 2: return "module.entity.DBConnect";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_9_complexity_4_6.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_9_complexity_4_6(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return java.lang.Integer.class;
            case 2: return module.entity.DBConnect.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_9_complexity_4_6.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_9_complexity_4_6(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.java_lang_Integer_1 = (java.lang.Integer) value; break;
            case 2: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_9_complexity_4_6.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_9_complexity_4_6(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return java_lang_Integer_1;
            case 2: return module_entity_DBConnect_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_9_complexity_4_6
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_9_complexity_4_6() {
        return new Object[] {
                            module_entity_Action_1,
                            java_lang_Integer_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_9_complexity_4_6
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_9_complexity_4_6(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        java_lang_Integer_1 = (java.lang.Integer) objects[1];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMER_9_complexity_4_6.<p>
     * The original expression was:<br>
     * <code>complexity == 4</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_9_complexity_4_6_cond_0() {
        return (java_lang_Integer_1 == 4);
    }

    /**
     * Checks whether some conditions of rule ruleMER_9_complexity_4_6 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_9_complexity_4_6_cond(int index) {
        switch (index) {
            case 0: return ruleMER_9_complexity_4_6_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_9_complexity_4_6 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_9_complexity_4_6(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!ruleMER_9_complexity_4_6_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_9_complexity_4_6(int declIndex) {
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
     * Executes the action part of the rule ruleMER_9_complexity_4_6
     */
    private void ruleMER_9_complexity_4_6() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_9_complexity_4_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "complexity == 4;\n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(9L);
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_9_complexity_4_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 9 - mer 9");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule ruleMER_11_complexity_5_7
     */
    private String[] identifiers_ruleMER_11_complexity_5_7 = {
        "action",
        "complexity",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_11_complexity_5_7
     *
     * @return the identifiers declared in rule ruleMER_11_complexity_5_7
     */
    private String[] getDeclaredIdentifiers_ruleMER_11_complexity_5_7() {
         return identifiers_ruleMER_11_complexity_5_7;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_11_complexity_5_7.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_11_complexity_5_7(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "java.lang.Integer";
            case 2: return "module.entity.DBConnect";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_11_complexity_5_7.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_11_complexity_5_7(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return java.lang.Integer.class;
            case 2: return module.entity.DBConnect.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_11_complexity_5_7.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_11_complexity_5_7(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.java_lang_Integer_1 = (java.lang.Integer) value; break;
            case 2: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_11_complexity_5_7.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_11_complexity_5_7(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return java_lang_Integer_1;
            case 2: return module_entity_DBConnect_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_11_complexity_5_7
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_11_complexity_5_7() {
        return new Object[] {
                            module_entity_Action_1,
                            java_lang_Integer_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_11_complexity_5_7
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_11_complexity_5_7(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        java_lang_Integer_1 = (java.lang.Integer) objects[1];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMER_11_complexity_5_7.<p>
     * The original expression was:<br>
     * <code>complexity == 5</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_11_complexity_5_7_cond_0() {
        return (java_lang_Integer_1 == 5);
    }

    /**
     * Checks whether some conditions of rule ruleMER_11_complexity_5_7 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_11_complexity_5_7_cond(int index) {
        switch (index) {
            case 0: return ruleMER_11_complexity_5_7_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_11_complexity_5_7 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_11_complexity_5_7(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!ruleMER_11_complexity_5_7_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_11_complexity_5_7(int declIndex) {
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
     * Executes the action part of the rule ruleMER_11_complexity_5_7
     */
    private void ruleMER_11_complexity_5_7() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_11_complexity_5_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "complexity == 5;\n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(11L);
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_11_complexity_5_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 11 - mer 11");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule ruleMER_12_complexity_3_8
     */
    private String[] identifiers_ruleMER_12_complexity_3_8 = {
        "action",
        "complexity",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_12_complexity_3_8
     *
     * @return the identifiers declared in rule ruleMER_12_complexity_3_8
     */
    private String[] getDeclaredIdentifiers_ruleMER_12_complexity_3_8() {
         return identifiers_ruleMER_12_complexity_3_8;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_12_complexity_3_8.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_12_complexity_3_8(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "java.lang.Integer";
            case 2: return "module.entity.DBConnect";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_12_complexity_3_8.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_12_complexity_3_8(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return java.lang.Integer.class;
            case 2: return module.entity.DBConnect.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_12_complexity_3_8.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_12_complexity_3_8(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.java_lang_Integer_1 = (java.lang.Integer) value; break;
            case 2: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_12_complexity_3_8.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_12_complexity_3_8(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return java_lang_Integer_1;
            case 2: return module_entity_DBConnect_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_12_complexity_3_8
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_12_complexity_3_8() {
        return new Object[] {
                            module_entity_Action_1,
                            java_lang_Integer_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_12_complexity_3_8
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_12_complexity_3_8(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        java_lang_Integer_1 = (java.lang.Integer) objects[1];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMER_12_complexity_3_8.<p>
     * The original expression was:<br>
     * <code>complexity == 3</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_12_complexity_3_8_cond_0() {
        return (java_lang_Integer_1 == 3);
    }

    /**
     * Checks whether some conditions of rule ruleMER_12_complexity_3_8 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_12_complexity_3_8_cond(int index) {
        switch (index) {
            case 0: return ruleMER_12_complexity_3_8_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_12_complexity_3_8 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_12_complexity_3_8(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!ruleMER_12_complexity_3_8_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_12_complexity_3_8(int declIndex) {
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
     * Executes the action part of the rule ruleMER_12_complexity_3_8
     */
    private void ruleMER_12_complexity_3_8() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_12_complexity_3_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "complexity == 3;\n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(12L);
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_12_complexity_3_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 12 - mer 12");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule ruleMER_13_complexity_3_9
     */
    private String[] identifiers_ruleMER_13_complexity_3_9 = {
        "action",
        "complexity",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMER_13_complexity_3_9
     *
     * @return the identifiers declared in rule ruleMER_13_complexity_3_9
     */
    private String[] getDeclaredIdentifiers_ruleMER_13_complexity_3_9() {
         return identifiers_ruleMER_13_complexity_3_9;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMER_13_complexity_3_9.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMER_13_complexity_3_9(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "java.lang.Integer";
            case 2: return "module.entity.DBConnect";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMER_13_complexity_3_9.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMER_13_complexity_3_9(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return java.lang.Integer.class;
            case 2: return module.entity.DBConnect.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMER_13_complexity_3_9.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMER_13_complexity_3_9(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.java_lang_Integer_1 = (java.lang.Integer) value; break;
            case 2: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMER_13_complexity_3_9.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMER_13_complexity_3_9(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return java_lang_Integer_1;
            case 2: return module_entity_DBConnect_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMER_13_complexity_3_9
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMER_13_complexity_3_9() {
        return new Object[] {
                            module_entity_Action_1,
                            java_lang_Integer_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMER_13_complexity_3_9
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMER_13_complexity_3_9(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        java_lang_Integer_1 = (java.lang.Integer) objects[1];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMER_13_complexity_3_9.<p>
     * The original expression was:<br>
     * <code>complexity == 3</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_13_complexity_3_9_cond_0() {
        return (java_lang_Integer_1 == 3);
    }

    /**
     * Checks whether some conditions of rule ruleMER_13_complexity_3_9 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMER_13_complexity_3_9_cond(int index) {
        switch (index) {
            case 0: return ruleMER_13_complexity_3_9_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMER_13_complexity_3_9 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMER_13_complexity_3_9(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!ruleMER_13_complexity_3_9_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMER_13_complexity_3_9(int declIndex) {
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
     * Executes the action part of the rule ruleMER_13_complexity_3_9
     */
    private void ruleMER_13_complexity_3_9() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMER_13_complexity_3_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "complexity == 3;\n");
			MultipleExternalRepresentation m = module_entity_DBConnect_1.getMER(13L);
			module_entity_Action_1.setMer(m);
			module_entity_Action_1.getRegrasAcionadas().add("ruleMER_13_complexity_3_");
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Exibi��o de MRE 13 - mer 13");
			flush();

	    }


// -rule-end- 

// end_rules
	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "ruleMER_1_complexity_1_0",
        "ruleMER_2_complexity_2_1",
        "ruleMER_3_complexity_3_2",
        "ruleMER_4_complexity_4_3",
        "ruleMER_5_complexity_5_4",
        "ruleMER_8_complexity_3_5",
        "ruleMER_9_complexity_4_6",
        "ruleMER_11_complexity_5_7",
        "ruleMER_12_complexity_3_8",
        "ruleMER_13_complexity_3_9"
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
        1,
        1,
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
            case 0: return ruleMER_1_complexity_1_0_cond(condIndex);
            case 1: return ruleMER_2_complexity_2_1_cond(condIndex);
            case 2: return ruleMER_3_complexity_3_2_cond(condIndex);
            case 3: return ruleMER_4_complexity_4_3_cond(condIndex);
            case 4: return ruleMER_5_complexity_5_4_cond(condIndex);
            case 5: return ruleMER_8_complexity_3_5_cond(condIndex);
            case 6: return ruleMER_9_complexity_4_6_cond(condIndex);
            case 7: return ruleMER_11_complexity_5_7_cond(condIndex);
            case 8: return ruleMER_12_complexity_3_8_cond(condIndex);
            case 9: return ruleMER_13_complexity_3_9_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_ruleMER_1_complexity_1_0(declIndex);
            case 1: return checkConditionsOnlyOf_ruleMER_2_complexity_2_1(declIndex);
            case 2: return checkConditionsOnlyOf_ruleMER_3_complexity_3_2(declIndex);
            case 3: return checkConditionsOnlyOf_ruleMER_4_complexity_4_3(declIndex);
            case 4: return checkConditionsOnlyOf_ruleMER_5_complexity_5_4(declIndex);
            case 5: return checkConditionsOnlyOf_ruleMER_8_complexity_3_5(declIndex);
            case 6: return checkConditionsOnlyOf_ruleMER_9_complexity_4_6(declIndex);
            case 7: return checkConditionsOnlyOf_ruleMER_11_complexity_5_7(declIndex);
            case 8: return checkConditionsOnlyOf_ruleMER_12_complexity_3_8(declIndex);
            case 9: return checkConditionsOnlyOf_ruleMER_13_complexity_3_9(declIndex);
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
            case 0: return checkCondForDeclaration_ruleMER_1_complexity_1_0(declIndex);
            case 1: return checkCondForDeclaration_ruleMER_2_complexity_2_1(declIndex);
            case 2: return checkCondForDeclaration_ruleMER_3_complexity_3_2(declIndex);
            case 3: return checkCondForDeclaration_ruleMER_4_complexity_4_3(declIndex);
            case 4: return checkCondForDeclaration_ruleMER_5_complexity_5_4(declIndex);
            case 5: return checkCondForDeclaration_ruleMER_8_complexity_3_5(declIndex);
            case 6: return checkCondForDeclaration_ruleMER_9_complexity_4_6(declIndex);
            case 7: return checkCondForDeclaration_ruleMER_11_complexity_5_7(declIndex);
            case 8: return checkCondForDeclaration_ruleMER_12_complexity_3_8(declIndex);
            case 9: return checkCondForDeclaration_ruleMER_13_complexity_3_9(declIndex);
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
            case 0: return getDeclaredClassName_ruleMER_1_complexity_1_0(declIndex);
            case 1: return getDeclaredClassName_ruleMER_2_complexity_2_1(declIndex);
            case 2: return getDeclaredClassName_ruleMER_3_complexity_3_2(declIndex);
            case 3: return getDeclaredClassName_ruleMER_4_complexity_4_3(declIndex);
            case 4: return getDeclaredClassName_ruleMER_5_complexity_5_4(declIndex);
            case 5: return getDeclaredClassName_ruleMER_8_complexity_3_5(declIndex);
            case 6: return getDeclaredClassName_ruleMER_9_complexity_4_6(declIndex);
            case 7: return getDeclaredClassName_ruleMER_11_complexity_5_7(declIndex);
            case 8: return getDeclaredClassName_ruleMER_12_complexity_3_8(declIndex);
            case 9: return getDeclaredClassName_ruleMER_13_complexity_3_9(declIndex);
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
            case 0: return getDeclaredClass_ruleMER_1_complexity_1_0(declIndex);
            case 1: return getDeclaredClass_ruleMER_2_complexity_2_1(declIndex);
            case 2: return getDeclaredClass_ruleMER_3_complexity_3_2(declIndex);
            case 3: return getDeclaredClass_ruleMER_4_complexity_4_3(declIndex);
            case 4: return getDeclaredClass_ruleMER_5_complexity_5_4(declIndex);
            case 5: return getDeclaredClass_ruleMER_8_complexity_3_5(declIndex);
            case 6: return getDeclaredClass_ruleMER_9_complexity_4_6(declIndex);
            case 7: return getDeclaredClass_ruleMER_11_complexity_5_7(declIndex);
            case 8: return getDeclaredClass_ruleMER_12_complexity_3_8(declIndex);
            case 9: return getDeclaredClass_ruleMER_13_complexity_3_9(declIndex);
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
            case 0: ruleMER_1_complexity_1_0(); break;
            case 1: ruleMER_2_complexity_2_1(); break;
            case 2: ruleMER_3_complexity_3_2(); break;
            case 3: ruleMER_4_complexity_4_3(); break;
            case 4: ruleMER_5_complexity_5_4(); break;
            case 5: ruleMER_8_complexity_3_5(); break;
            case 6: ruleMER_9_complexity_4_6(); break;
            case 7: ruleMER_11_complexity_5_7(); break;
            case 8: ruleMER_12_complexity_3_8(); break;
            case 9: ruleMER_13_complexity_3_9(); break;
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
            case 0: return getDeclaredIdentifiers_ruleMER_1_complexity_1_0();
            case 1: return getDeclaredIdentifiers_ruleMER_2_complexity_2_1();
            case 2: return getDeclaredIdentifiers_ruleMER_3_complexity_3_2();
            case 3: return getDeclaredIdentifiers_ruleMER_4_complexity_4_3();
            case 4: return getDeclaredIdentifiers_ruleMER_5_complexity_5_4();
            case 5: return getDeclaredIdentifiers_ruleMER_8_complexity_3_5();
            case 6: return getDeclaredIdentifiers_ruleMER_9_complexity_4_6();
            case 7: return getDeclaredIdentifiers_ruleMER_11_complexity_5_7();
            case 8: return getDeclaredIdentifiers_ruleMER_12_complexity_3_8();
            case 9: return getDeclaredIdentifiers_ruleMER_13_complexity_3_9();
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
            case 0: setObject_ruleMER_1_complexity_1_0(declIndex, value); break;
            case 1: setObject_ruleMER_2_complexity_2_1(declIndex, value); break;
            case 2: setObject_ruleMER_3_complexity_3_2(declIndex, value); break;
            case 3: setObject_ruleMER_4_complexity_4_3(declIndex, value); break;
            case 4: setObject_ruleMER_5_complexity_5_4(declIndex, value); break;
            case 5: setObject_ruleMER_8_complexity_3_5(declIndex, value); break;
            case 6: setObject_ruleMER_9_complexity_4_6(declIndex, value); break;
            case 7: setObject_ruleMER_11_complexity_5_7(declIndex, value); break;
            case 8: setObject_ruleMER_12_complexity_3_8(declIndex, value); break;
            case 9: setObject_ruleMER_13_complexity_3_9(declIndex, value); break;
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
            case 0: return getObject_ruleMER_1_complexity_1_0(declIndex);
            case 1: return getObject_ruleMER_2_complexity_2_1(declIndex);
            case 2: return getObject_ruleMER_3_complexity_3_2(declIndex);
            case 3: return getObject_ruleMER_4_complexity_4_3(declIndex);
            case 4: return getObject_ruleMER_5_complexity_5_4(declIndex);
            case 5: return getObject_ruleMER_8_complexity_3_5(declIndex);
            case 6: return getObject_ruleMER_9_complexity_4_6(declIndex);
            case 7: return getObject_ruleMER_11_complexity_5_7(declIndex);
            case 8: return getObject_ruleMER_12_complexity_3_8(declIndex);
            case 9: return getObject_ruleMER_13_complexity_3_9(declIndex);
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
            case 0: return getObjects_ruleMER_1_complexity_1_0();
            case 1: return getObjects_ruleMER_2_complexity_2_1();
            case 2: return getObjects_ruleMER_3_complexity_3_2();
            case 3: return getObjects_ruleMER_4_complexity_4_3();
            case 4: return getObjects_ruleMER_5_complexity_5_4();
            case 5: return getObjects_ruleMER_8_complexity_3_5();
            case 6: return getObjects_ruleMER_9_complexity_4_6();
            case 7: return getObjects_ruleMER_11_complexity_5_7();
            case 8: return getObjects_ruleMER_12_complexity_3_8();
            case 9: return getObjects_ruleMER_13_complexity_3_9();
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
            case 0: setObjects_ruleMER_1_complexity_1_0(objects); break;
            case 1: setObjects_ruleMER_2_complexity_2_1(objects); break;
            case 2: setObjects_ruleMER_3_complexity_3_2(objects); break;
            case 3: setObjects_ruleMER_4_complexity_4_3(objects); break;
            case 4: setObjects_ruleMER_5_complexity_5_4(objects); break;
            case 5: setObjects_ruleMER_8_complexity_3_5(objects); break;
            case 6: setObjects_ruleMER_9_complexity_4_6(objects); break;
            case 7: setObjects_ruleMER_11_complexity_5_7(objects); break;
            case 8: setObjects_ruleMER_12_complexity_3_8(objects); break;
            case 9: setObjects_ruleMER_13_complexity_3_9(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private module.entity.Action module_entity_Action_1;
    private java.lang.Integer java_lang_Integer_1;
    private module.entity.DBConnect module_entity_DBConnect_1;
    private module.entity.RuleToHuman module_entity_RuleToHuman_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_MERManagerComplexityKB(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file MERManagerComplexityKB.rules
 *
 * @version 24/04/2015
 */
public class MERManagerComplexityKB extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public MERManagerComplexityKB(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public MERManagerComplexityKB() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_MERManagerComplexityKB(this);
    }

}
