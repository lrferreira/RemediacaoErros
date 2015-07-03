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
     * Identifiers of rule funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0
     */
    private String[] identifiers_funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0
     *
     * @return the identifiers declared in rule funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0() {
         return identifiers_funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(1L));
    }

    /**
     * Condition 1 of rule funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 2 of rule funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 3 of rule funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt1"));
    }

    /**
     * Condition 4 of rule funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0_cond_4() {
        return (module_entity_Action_1.getRemediation().getId().equals(1L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0_cond_0();
            case 1: return funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0_cond_1();
            case 2: return funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0_cond_2();
            case 3: return funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0_cond_3();
            case 4: return funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0_cond_4();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0_cond_0()) return false;
                if (!funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0_cond_1()) return false;
                if (!funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0_cond_2()) return false;
                if (!funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0_cond_3()) return false;
                if (!funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0_cond_4()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0
     */
    private void funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Interpretação Equivocada\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Papéis Complementares\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(1L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Papéis Complementares");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1
     */
    private String[] identifiers_funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1
     *
     * @return the identifiers declared in rule funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1() {
         return identifiers_funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(1L));
    }

    /**
     * Condition 1 of rule funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 2 of rule funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(2L));
    }

    /**
     * Condition 3 of rule funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt2")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt2"));
    }

    /**
     * Condition 4 of rule funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1_cond_4() {
        return (module_entity_Action_1.getRemediation().getId().equals(2L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1_cond_0();
            case 1: return funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1_cond_1();
            case 2: return funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1_cond_2();
            case 3: return funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1_cond_3();
            case 4: return funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1_cond_4();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1_cond_0()) return false;
                if (!funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1_cond_1()) return false;
                if (!funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1_cond_2()) return false;
                if (!funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1_cond_3()) return false;
                if (!funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1_cond_4()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1
     */
    private void funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Interpretação Equivocada\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 2\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt2\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Papéis Complementares\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(1L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Papéis Complementares");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2
     */
    private String[] identifiers_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2
     *
     * @return the identifiers declared in rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2() {
         return identifiers_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(2L));
    }

    /**
     * Condition 1 of rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2_cond_1() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(1L));
    }

    /**
     * Condition 2 of rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(3L));
    }

    /**
     * Condition 4 of rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt5")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt5"));
    }

    /**
     * Condition 5 of rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2_cond_5() {
        return (module_entity_Action_1.getRemediation().getId().equals(3L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2_cond_0();
            case 1: return funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2_cond_1();
            case 2: return funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2_cond_2();
            case 3: return funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2_cond_3();
            case 4: return funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2_cond_4();
            case 5: return funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2_cond_0()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2_cond_1()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2_cond_2()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2_cond_3()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2_cond_4()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2_cond_5()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2
     */
    private void funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Diretamente Identificáveis\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tSubtipo de Erro = \"Deficiência em relação ao domínio ou uso inadequado de dados\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 3\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt5\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Restrição de Interpretação\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(2L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Restrição de Interpretação");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3
     */
    private String[] identifiers_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3
     *
     * @return the identifiers declared in rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3() {
         return identifiers_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(2L));
    }

    /**
     * Condition 1 of rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3_cond_1() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(1L));
    }

    /**
     * Condition 2 of rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 4 of rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt1"));
    }

    /**
     * Condition 5 of rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3_cond_5() {
        return (module_entity_Action_1.getRemediation().getId().equals(4L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3_cond_0();
            case 1: return funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3_cond_1();
            case 2: return funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3_cond_2();
            case 3: return funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3_cond_3();
            case 4: return funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3_cond_4();
            case 5: return funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3_cond_0()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3_cond_1()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3_cond_2()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3_cond_3()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3_cond_4()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3_cond_5()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3
     */
    private void funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Diretamente Identificáveis\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tSubtipo de Erro = \"Deficiência em relação ao domínio ou uso inadequado de dados\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Restrição de Interpretação\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(2L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Restrição de Interpretação");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4
     */
    private String[] identifiers_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4
     *
     * @return the identifiers declared in rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4() {
         return identifiers_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(2L));
    }

    /**
     * Condition 1 of rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4_cond_1() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(1L));
    }

    /**
     * Condition 2 of rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 4 of rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt1"));
    }

    /**
     * Condition 5 of rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4_cond_5() {
        return (module_entity_Action_1.getRemediation().getId().equals(5L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4_cond_0();
            case 1: return funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4_cond_1();
            case 2: return funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4_cond_2();
            case 3: return funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4_cond_3();
            case 4: return funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4_cond_4();
            case 5: return funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4_cond_0()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4_cond_1()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4_cond_2()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4_cond_3()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4_cond_4()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4_cond_5()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4
     */
    private void funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Diretamente Identificáveis\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tSubtipo de Erro = \"Deficiência em relação ao domínio ou uso inadequado de dados\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Restrição de Interpretação\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(2L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Restrição de Interpretação");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5
     */
    private String[] identifiers_funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5
     *
     * @return the identifiers declared in rule funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5() {
         return identifiers_funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(2L));
    }

    /**
     * Condition 1 of rule funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5_cond_1() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(1L));
    }

    /**
     * Condition 2 of rule funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(2L));
    }

    /**
     * Condition 4 of rule funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt2")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt2"));
    }

    /**
     * Condition 5 of rule funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5_cond_5() {
        return (module_entity_Action_1.getRemediation().getId().equals(6L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5_cond_0();
            case 1: return funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5_cond_1();
            case 2: return funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5_cond_2();
            case 3: return funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5_cond_3();
            case 4: return funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5_cond_4();
            case 5: return funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5_cond_0()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5_cond_1()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5_cond_2()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5_cond_3()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5_cond_4()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5_cond_5()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5
     */
    private void funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Diretamente Identificáveis\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tSubtipo de Erro = \"Deficiência em relação ao domínio ou uso inadequado de dados\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 2\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt2\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Restrição de Interpretação\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(2L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Restrição de Interpretação");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6
     */
    private String[] identifiers_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6
     *
     * @return the identifiers declared in rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6() {
         return identifiers_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(2L));
    }

    /**
     * Condition 1 of rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6_cond_1() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(1L));
    }

    /**
     * Condition 2 of rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(3L));
    }

    /**
     * Condition 4 of rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt5")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt5"));
    }

    /**
     * Condition 5 of rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(7L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6_cond_5() {
        return (module_entity_Action_1.getRemediation().getId().equals(7L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6_cond_0();
            case 1: return funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6_cond_1();
            case 2: return funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6_cond_2();
            case 3: return funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6_cond_3();
            case 4: return funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6_cond_4();
            case 5: return funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6_cond_0()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6_cond_1()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6_cond_2()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6_cond_3()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6_cond_4()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6_cond_5()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6
     */
    private void funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Diretamente Identificáveis\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tSubtipo de Erro = \"Deficiência em relação ao domínio ou uso inadequado de dados\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 3\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt5\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Restrição de Interpretação\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(2L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Restrição de Interpretação");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7
     */
    private String[] identifiers_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7
     *
     * @return the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7() {
         return identifiers_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(2L));
    }

    /**
     * Condition 1 of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7_cond_1() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(3L));
    }

    /**
     * Condition 2 of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(4L));
    }

    /**
     * Condition 4 of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt3"));
    }

    /**
     * Condition 5 of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(8L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7_cond_5() {
        return (module_entity_Action_1.getRemediation().getId().equals(8L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7_cond_0();
            case 1: return funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7_cond_1();
            case 2: return funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7_cond_2();
            case 3: return funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7_cond_3();
            case 4: return funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7_cond_4();
            case 5: return funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7_cond_0()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7_cond_1()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7_cond_2()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7_cond_3()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7_cond_4()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7_cond_5()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7
     */
    private void funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Diretamente Identificáveis\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tSubtipo de Erro = \"Deficiência na escolha do operador correto\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 4\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt3\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Compreensão mais aprofundada\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8
     */
    private String[] identifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8
     *
     * @return the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8() {
         return identifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(2L));
    }

    /**
     * Condition 1 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8_cond_1() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(3L));
    }

    /**
     * Condition 2 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(5L));
    }

    /**
     * Condition 4 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt8")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt8"));
    }

    /**
     * Condition 5 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(9L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8_cond_5() {
        return (module_entity_Action_1.getRemediation().getId().equals(9L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8_cond_0();
            case 1: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8_cond_1();
            case 2: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8_cond_2();
            case 3: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8_cond_3();
            case 4: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8_cond_4();
            case 5: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8_cond_0()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8_cond_1()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8_cond_2()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8_cond_3()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8_cond_4()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8_cond_5()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8
     */
    private void funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Diretamente Identificáveis\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tSubtipo de Erro = \"Deficiência na escolha do operador correto\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 5\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt8\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Compreensão mais aprofundada\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9
     */
    private String[] identifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9
     *
     * @return the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9() {
         return identifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(2L));
    }

    /**
     * Condition 1 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9_cond_1() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(2L));
    }

    /**
     * Condition 2 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(5L));
    }

    /**
     * Condition 4 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt8")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt8"));
    }

    /**
     * Condition 5 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(10L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9_cond_5() {
        return (module_entity_Action_1.getRemediation().getId().equals(10L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9_cond_0();
            case 1: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9_cond_1();
            case 2: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9_cond_2();
            case 3: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9_cond_3();
            case 4: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9_cond_4();
            case 5: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9_cond_0()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9_cond_1()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9_cond_2()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9_cond_3()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9_cond_4()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9_cond_5()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9
     */
    private void funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Diretamente Identificáveis\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tSubtipo de Erro = \"Deficiência de regra, teorema ou definição\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 5\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt8\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Compreensão mais aprofundada\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10
     */
    private String[] identifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10
     *
     * @return the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10() {
         return identifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(2L));
    }

    /**
     * Condition 1 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10_cond_1() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(2L));
    }

    /**
     * Condition 2 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(5L));
    }

    /**
     * Condition 4 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt8")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt8"));
    }

    /**
     * Condition 5 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(11L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10_cond_5() {
        return (module_entity_Action_1.getRemediation().getId().equals(11L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10_cond_0();
            case 1: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10_cond_1();
            case 2: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10_cond_2();
            case 3: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10_cond_3();
            case 4: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10_cond_4();
            case 5: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10_cond_0()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10_cond_1()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10_cond_2()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10_cond_3()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10_cond_4()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10_cond_5()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10
     */
    private void funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Diretamente Identificáveis\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tSubtipo de Erro = \"Deficiência de regra, teorema ou definição\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 5\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt8\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Compreensão mais aprofundada\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11
     */
    private String[] identifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11
     *
     * @return the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11() {
         return identifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(2L));
    }

    /**
     * Condition 1 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11_cond_1() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getSubErrorTypes().get(0).getId().equals(2L));
    }

    /**
     * Condition 2 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(5L));
    }

    /**
     * Condition 4 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt8")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt8"));
    }

    /**
     * Condition 5 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(12L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11_cond_5() {
        return (module_entity_Action_1.getRemediation().getId().equals(12L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11_cond_0();
            case 1: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11_cond_1();
            case 2: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11_cond_2();
            case 3: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11_cond_3();
            case 4: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11_cond_4();
            case 5: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11_cond_0()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11_cond_1()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11_cond_2()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11_cond_3()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11_cond_4()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11_cond_5()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11
     */
    private void funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Diretamente Identificáveis\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tSubtipo de Erro = \"Deficiência de regra, teorema ou definição\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 5\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt8\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Compreensão mais aprofundada\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12
     */
    private String[] identifiers_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12
     *
     * @return the identifiers declared in rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12() {
         return identifiers_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(3L));
    }

    /**
     * Condition 1 of rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 2 of rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(6L));
    }

    /**
     * Condition 3 of rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt7")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt7"));
    }

    /**
     * Condition 4 of rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(13L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12_cond_4() {
        return (module_entity_Action_1.getRemediation().getId().equals(13L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12_cond_0();
            case 1: return funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12_cond_1();
            case 2: return funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12_cond_2();
            case 3: return funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12_cond_3();
            case 4: return funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12_cond_4();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12_cond_0()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12_cond_1()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12_cond_2()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12_cond_3()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12_cond_4()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12
     */
    private void funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Indiretamente identificáveis\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt7\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Restrição de Interpretação\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(2L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Restrição de Interpretação");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13
     */
    private String[] identifiers_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13
     *
     * @return the identifiers declared in rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13() {
         return identifiers_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(3L));
    }

    /**
     * Condition 1 of rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 2 of rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(6L));
    }

    /**
     * Condition 3 of rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt7")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt7"));
    }

    /**
     * Condition 4 of rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(14L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13_cond_4() {
        return (module_entity_Action_1.getRemediation().getId().equals(14L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13_cond_0();
            case 1: return funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13_cond_1();
            case 2: return funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13_cond_2();
            case 3: return funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13_cond_3();
            case 4: return funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13_cond_4();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13_cond_0()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13_cond_1()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13_cond_2()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13_cond_3()) return false;
                if (!funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13_cond_4()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13
     */
    private void funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Indiretamente identificáveis\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt7\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Restrição de Interpretação\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(2L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Restrição de Interpretação");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14
     */
    private String[] identifiers_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14
     *
     * @return the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14() {
         return identifiers_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(4L));
    }

    /**
     * Condition 1 of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 2 of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 3 of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt1"));
    }

    /**
     * Condition 4 of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(15L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14_cond_4() {
        return (module_entity_Action_1.getRemediation().getId().equals(15L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14_cond_0();
            case 1: return funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14_cond_1();
            case 2: return funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14_cond_2();
            case 3: return funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14_cond_3();
            case 4: return funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14_cond_4();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14_cond_0()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14_cond_1()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14_cond_2()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14_cond_3()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14_cond_4()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14
     */
    private void funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Solução não categorizável\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Compreensão mais aprofundada\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15
     */
    private String[] identifiers_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15
     *
     * @return the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15() {
         return identifiers_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(4L));
    }

    /**
     * Condition 1 of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 2 of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 3 of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt1"));
    }

    /**
     * Condition 4 of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(15L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15_cond_4() {
        return (module_entity_Action_1.getRemediation().getId().equals(15L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15_cond_0();
            case 1: return funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15_cond_1();
            case 2: return funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15_cond_2();
            case 3: return funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15_cond_3();
            case 4: return funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15_cond_4();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15_cond_0()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15_cond_1()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15_cond_2()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15_cond_3()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15_cond_4()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15
     */
    private void funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Solução não categorizável\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Compreensão mais aprofundada\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16
     */
    private String[] identifiers_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16
     *
     * @return the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16() {
         return identifiers_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(4L));
    }

    /**
     * Condition 1 of rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 2 of rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(2L));
    }

    /**
     * Condition 3 of rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt2")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt2"));
    }

    /**
     * Condition 4 of rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(16L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16_cond_4() {
        return (module_entity_Action_1.getRemediation().getId().equals(16L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16_cond_0();
            case 1: return funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16_cond_1();
            case 2: return funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16_cond_2();
            case 3: return funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16_cond_3();
            case 4: return funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16_cond_4();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16_cond_0()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16_cond_1()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16_cond_2()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16_cond_3()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16_cond_4()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16
     */
    private void funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Solução não categorizável\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 2\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt2\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Compreensão mais aprofundada\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17
     */
    private String[] identifiers_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17
     *
     * @return the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17() {
         return identifiers_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(4L));
    }

    /**
     * Condition 1 of rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 2 of rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(3L));
    }

    /**
     * Condition 3 of rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt5")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt5"));
    }

    /**
     * Condition 4 of rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(17L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17_cond_4() {
        return (module_entity_Action_1.getRemediation().getId().equals(17L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17_cond_0();
            case 1: return funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17_cond_1();
            case 2: return funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17_cond_2();
            case 3: return funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17_cond_3();
            case 4: return funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17_cond_4();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17_cond_0()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17_cond_1()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17_cond_2()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17_cond_3()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17_cond_4()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17
     */
    private void funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Solução não categorizável\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 3\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt5\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Compreensão mais aprofundada\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18
     */
    private String[] identifiers_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18
     *
     * @return the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18() {
         return identifiers_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(4L));
    }

    /**
     * Condition 1 of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 2 of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(4L));
    }

    /**
     * Condition 3 of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt3"));
    }

    /**
     * Condition 4 of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(18L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18_cond_4() {
        return (module_entity_Action_1.getRemediation().getId().equals(18L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18_cond_0();
            case 1: return funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18_cond_1();
            case 2: return funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18_cond_2();
            case 3: return funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18_cond_3();
            case 4: return funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18_cond_4();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18_cond_0()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18_cond_1()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18_cond_2()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18_cond_3()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18_cond_4()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18
     */
    private void funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Solução não categorizável\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 4\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt3\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Compreensão mais aprofundada\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19
     */
    private String[] identifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19
     *
     * @return the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19() {
         return identifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(4L));
    }

    /**
     * Condition 1 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 2 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(5L));
    }

    /**
     * Condition 3 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt8")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt8"));
    }

    /**
     * Condition 4 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(19L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19_cond_4() {
        return (module_entity_Action_1.getRemediation().getId().equals(19L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19_cond_0();
            case 1: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19_cond_1();
            case 2: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19_cond_2();
            case 3: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19_cond_3();
            case 4: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19_cond_4();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19_cond_0()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19_cond_1()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19_cond_2()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19_cond_3()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19_cond_4()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19
     */
    private void funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Solução não categorizável\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 5\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt8\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Compreensão mais aprofundada\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20
     */
    private String[] identifiers_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20
     *
     * @return the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20() {
         return identifiers_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(4L));
    }

    /**
     * Condition 1 of rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 2 of rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(6L));
    }

    /**
     * Condition 3 of rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt7")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt7"));
    }

    /**
     * Condition 4 of rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(20L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20_cond_4() {
        return (module_entity_Action_1.getRemediation().getId().equals(20L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20_cond_0();
            case 1: return funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20_cond_1();
            case 2: return funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20_cond_2();
            case 3: return funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20_cond_3();
            case 4: return funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20_cond_4();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20_cond_0()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20_cond_1()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20_cond_2()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20_cond_3()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20_cond_4()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20
     */
    private void funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Solução não categorizável\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt7\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Compreensão mais aprofundada\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 

// end_rules


// rule necessary by default

	
    /**
     * Identifiers of rule compreensao_mais_aprofundada
     */
    private String[] identifiers_compreensao_mais_aprofundada = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule compreensao_mais_aprofundada
     *
     * @return the identifiers declared in rule compreensao_mais_aprofundada
     */
    private String[] getDeclaredIdentifiers_compreensao_mais_aprofundada() {
         return identifiers_compreensao_mais_aprofundada;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule compreensao_mais_aprofundada.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_compreensao_mais_aprofundada(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule compreensao_mais_aprofundada.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_compreensao_mais_aprofundada(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule compreensao_mais_aprofundada.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_compreensao_mais_aprofundada(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule compreensao_mais_aprofundada.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_compreensao_mais_aprofundada(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule compreensao_mais_aprofundada
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_compreensao_mais_aprofundada() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule compreensao_mais_aprofundada
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_compreensao_mais_aprofundada(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule compreensao_mais_aprofundada.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean compreensao_mais_aprofundada_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(4L));
    }

    /**
     * Checks whether some conditions of rule compreensao_mais_aprofundada is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean compreensao_mais_aprofundada_cond(int index) {
        switch (index) {
            case 0: return compreensao_mais_aprofundada_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule compreensao_mais_aprofundada that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_compreensao_mais_aprofundada(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!compreensao_mais_aprofundada_cond_0()) return false;
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
    private boolean checkCondForDeclaration_compreensao_mais_aprofundada(int declIndex) {
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
     * Executes the action part of the rule compreensao_mais_aprofundada
     */
    private void compreensao_mais_aprofundada() {
			module_entity_Action_1.getRegrasAcionadas().add("compreensao_mais_aprofundada");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: compreensao_mais_aprofundada \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Solução Não Categorizável\"\n");

			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Compreensão Mais Aprofundada\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(2L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Restrição de Interpretação");
			flush();

	    }


// -rule-end- 



	
    /**
     * Identifiers of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17
     */
    private String[] identifiers_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17
     *
     * @return the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17() {
         return identifiers_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(4L));
    }

    /**
     * Condition 1 of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 2 of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 3 of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt1"));
    }

    /**
     * Condition 4 of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(15L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17_cond_4() {
        return (module_entity_Action_1.getRemediation().getId().equals(15L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17_cond_0();
            case 1: return funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17_cond_1();
            case 2: return funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17_cond_2();
            case 3: return funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17_cond_3();
            case 4: return funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17_cond_4();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17_cond_0()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17_cond_1()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17_cond_2()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17_cond_3()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17_cond_4()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17
     */
    private void funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Solução não categorizável\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Compreensão mais aprofundada\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19
     */
    private String[] identifiers_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19
     *
     * @return the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19() {
         return identifiers_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(4L));
    }

    /**
     * Condition 1 of rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 2 of rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(2L));
    }

    /**
     * Condition 3 of rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt2")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt2"));
    }

    /**
     * Condition 4 of rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(16L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19_cond_4() {
        return (module_entity_Action_1.getRemediation().getId().equals(16L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19_cond_0();
            case 1: return funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19_cond_1();
            case 2: return funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19_cond_2();
            case 3: return funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19_cond_3();
            case 4: return funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19_cond_4();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19_cond_0()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19_cond_1()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19_cond_2()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19_cond_3()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19_cond_4()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19
     */
    private void funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Solução não categorizável\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 2\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt2\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Compreensão mais aprofundada\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21
     */
    private String[] identifiers_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21
     *
     * @return the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21() {
         return identifiers_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(4L));
    }

    /**
     * Condition 1 of rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 2 of rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(3L));
    }

    /**
     * Condition 3 of rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt5")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt5"));
    }

    /**
     * Condition 4 of rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(17L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21_cond_4() {
        return (module_entity_Action_1.getRemediation().getId().equals(17L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21_cond_0();
            case 1: return funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21_cond_1();
            case 2: return funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21_cond_2();
            case 3: return funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21_cond_3();
            case 4: return funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21_cond_4();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21_cond_0()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21_cond_1()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21_cond_2()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21_cond_3()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21_cond_4()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21
     */
    private void funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Solução não categorizável\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 3\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt5\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Compreensão mais aprofundada\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23
     */
    private String[] identifiers_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23
     *
     * @return the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23() {
         return identifiers_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(4L));
    }

    /**
     * Condition 1 of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 2 of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(4L));
    }

    /**
     * Condition 3 of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt3"));
    }

    /**
     * Condition 4 of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(18L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23_cond_4() {
        return (module_entity_Action_1.getRemediation().getId().equals(18L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23_cond_0();
            case 1: return funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23_cond_1();
            case 2: return funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23_cond_2();
            case 3: return funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23_cond_3();
            case 4: return funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23_cond_4();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23_cond_0()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23_cond_1()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23_cond_2()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23_cond_3()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23_cond_4()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23
     */
    private void funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Solução não categorizável\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 4\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt3\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Compreensão mais aprofundada\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25
     */
    private String[] identifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25
     *
     * @return the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25() {
         return identifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(4L));
    }

    /**
     * Condition 1 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 2 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(5L));
    }

    /**
     * Condition 3 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt8")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt8"));
    }

    /**
     * Condition 4 of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(19L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25_cond_4() {
        return (module_entity_Action_1.getRemediation().getId().equals(19L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25_cond_0();
            case 1: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25_cond_1();
            case 2: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25_cond_2();
            case 3: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25_cond_3();
            case 4: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25_cond_4();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25_cond_0()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25_cond_1()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25_cond_2()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25_cond_3()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25_cond_4()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25
     */
    private void funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Solução não categorizável\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 5\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt8\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Compreensão mais aprofundada\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27
     */
    private String[] identifiers_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27
     *
     * @return the identifiers declared in rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27
     */
    private String[] getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27() {
         return identifiers_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27.<p>
     * The original expression was:<br>
     * <code>((WrongAnswer)action.getAnswer()).getErrorType().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27_cond_0() {
        return (((WrongAnswer)module_entity_Action_1.getAnswer()).getErrorType().getId().equals(4L));
    }

    /**
     * Condition 1 of rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 2 of rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27_cond_2() {
        return (module_entity_Action_1.getGoal().getId().equals(6L));
    }

    /**
     * Condition 3 of rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt7")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27_cond_3() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt7"));
    }

    /**
     * Condition 4 of rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27.<p>
     * The original expression was:<br>
     * <code>action.getRemediation().getId().equals(20L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27_cond_4() {
        return (module_entity_Action_1.getRemediation().getId().equals(20L));
    }

    /**
     * Checks whether some conditions of rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27_cond(int index) {
        switch (index) {
            case 0: return funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27_cond_0();
            case 1: return funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27_cond_1();
            case 2: return funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27_cond_2();
            case 3: return funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27_cond_3();
            case 4: return funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27_cond_4();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27_cond_0()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27_cond_1()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27_cond_2()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27_cond_3()) return false;
                if (!funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27_cond_4()) return false;
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
    private boolean checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27(int declIndex) {
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
     * Executes the action part of the rule funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27
     */
    private void funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27() {
			module_entity_Action_1.getRegrasAcionadas().add("funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para classificar a Função da MRE: funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = \"Solução não categorizável\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt7\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Classifique a Função MRE como \"Compreensão mais aprofundada\" \n");
			module_entity_Action_1.setMerFunction( module_entity_DBConnect_1.getMERFunction(3L));
			modified(module_entity_RuleToHuman_1);
			modified(module_entity_Action_1);
			System.out.println("Função MRE: Compreensão mais aprofundada");
			flush();

	    }


// -rule-end- 

// end_rules
	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0",
        "funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1",
        "funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2",
        "funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3",
        "funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4",
        "funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5",
        "funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6",
        "funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7",
        "funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8",
        "funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9",
        "funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10",
        "funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11",
        "funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12",
        "funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13",
        "funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14",
        "funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15",
        "funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16",
        "funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17",
        "funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18",
        "funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19",
        "funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20",
        "compreensao_mais_aprofundada",
        "funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17",
        "funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19",
        "funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21",
        "funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23",
        "funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25",
        "funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27"
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
        5,
        5,
        6,
        6,
        6,
        6,
        6,
        6,
        6,
        6,
        6,
        6,
        5,
        5,
        5,
        5,
        5,
        5,
        5,
        5,
        5,
        1,
        5,
        5,
        5,
        5,
        5,
        5
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
            case 0: return funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0_cond(condIndex);
            case 1: return funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1_cond(condIndex);
            case 2: return funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2_cond(condIndex);
            case 3: return funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3_cond(condIndex);
            case 4: return funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4_cond(condIndex);
            case 5: return funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5_cond(condIndex);
            case 6: return funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6_cond(condIndex);
            case 7: return funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7_cond(condIndex);
            case 8: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8_cond(condIndex);
            case 9: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9_cond(condIndex);
            case 10: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10_cond(condIndex);
            case 11: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11_cond(condIndex);
            case 12: return funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12_cond(condIndex);
            case 13: return funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13_cond(condIndex);
            case 14: return funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14_cond(condIndex);
            case 15: return funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15_cond(condIndex);
            case 16: return funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16_cond(condIndex);
            case 17: return funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17_cond(condIndex);
            case 18: return funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18_cond(condIndex);
            case 19: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19_cond(condIndex);
            case 20: return funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20_cond(condIndex);
            case 21: return compreensao_mais_aprofundada_cond(condIndex);
            case 22: return funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17_cond(condIndex);
            case 23: return funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19_cond(condIndex);
            case 24: return funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21_cond(condIndex);
            case 25: return funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23_cond(condIndex);
            case 26: return funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25_cond(condIndex);
            case 27: return funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0(declIndex);
            case 1: return checkConditionsOnlyOf_funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1(declIndex);
            case 2: return checkConditionsOnlyOf_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2(declIndex);
            case 3: return checkConditionsOnlyOf_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3(declIndex);
            case 4: return checkConditionsOnlyOf_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4(declIndex);
            case 5: return checkConditionsOnlyOf_funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5(declIndex);
            case 6: return checkConditionsOnlyOf_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6(declIndex);
            case 7: return checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7(declIndex);
            case 8: return checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8(declIndex);
            case 9: return checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9(declIndex);
            case 10: return checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10(declIndex);
            case 11: return checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11(declIndex);
            case 12: return checkConditionsOnlyOf_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12(declIndex);
            case 13: return checkConditionsOnlyOf_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13(declIndex);
            case 14: return checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14(declIndex);
            case 15: return checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15(declIndex);
            case 16: return checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16(declIndex);
            case 17: return checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17(declIndex);
            case 18: return checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18(declIndex);
            case 19: return checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19(declIndex);
            case 20: return checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20(declIndex);
            case 21: return checkConditionsOnlyOf_compreensao_mais_aprofundada(declIndex);
            case 22: return checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17(declIndex);
            case 23: return checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19(declIndex);
            case 24: return checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21(declIndex);
            case 25: return checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23(declIndex);
            case 26: return checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25(declIndex);
            case 27: return checkConditionsOnlyOf_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27(declIndex);
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
            case 0: return checkCondForDeclaration_funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0(declIndex);
            case 1: return checkCondForDeclaration_funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1(declIndex);
            case 2: return checkCondForDeclaration_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2(declIndex);
            case 3: return checkCondForDeclaration_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3(declIndex);
            case 4: return checkCondForDeclaration_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4(declIndex);
            case 5: return checkCondForDeclaration_funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5(declIndex);
            case 6: return checkCondForDeclaration_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6(declIndex);
            case 7: return checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7(declIndex);
            case 8: return checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8(declIndex);
            case 9: return checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9(declIndex);
            case 10: return checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10(declIndex);
            case 11: return checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11(declIndex);
            case 12: return checkCondForDeclaration_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12(declIndex);
            case 13: return checkCondForDeclaration_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13(declIndex);
            case 14: return checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14(declIndex);
            case 15: return checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15(declIndex);
            case 16: return checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16(declIndex);
            case 17: return checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17(declIndex);
            case 18: return checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18(declIndex);
            case 19: return checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19(declIndex);
            case 20: return checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20(declIndex);
            case 21: return checkCondForDeclaration_compreensao_mais_aprofundada(declIndex);
            case 22: return checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17(declIndex);
            case 23: return checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19(declIndex);
            case 24: return checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21(declIndex);
            case 25: return checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23(declIndex);
            case 26: return checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25(declIndex);
            case 27: return checkCondForDeclaration_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27(declIndex);
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
            case 0: return getDeclaredClassName_funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0(declIndex);
            case 1: return getDeclaredClassName_funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1(declIndex);
            case 2: return getDeclaredClassName_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2(declIndex);
            case 3: return getDeclaredClassName_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3(declIndex);
            case 4: return getDeclaredClassName_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4(declIndex);
            case 5: return getDeclaredClassName_funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5(declIndex);
            case 6: return getDeclaredClassName_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6(declIndex);
            case 7: return getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7(declIndex);
            case 8: return getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8(declIndex);
            case 9: return getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9(declIndex);
            case 10: return getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10(declIndex);
            case 11: return getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11(declIndex);
            case 12: return getDeclaredClassName_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12(declIndex);
            case 13: return getDeclaredClassName_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13(declIndex);
            case 14: return getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14(declIndex);
            case 15: return getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15(declIndex);
            case 16: return getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16(declIndex);
            case 17: return getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17(declIndex);
            case 18: return getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18(declIndex);
            case 19: return getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19(declIndex);
            case 20: return getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20(declIndex);
            case 21: return getDeclaredClassName_compreensao_mais_aprofundada(declIndex);
            case 22: return getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17(declIndex);
            case 23: return getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19(declIndex);
            case 24: return getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21(declIndex);
            case 25: return getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23(declIndex);
            case 26: return getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25(declIndex);
            case 27: return getDeclaredClassName_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27(declIndex);
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
            case 0: return getDeclaredClass_funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0(declIndex);
            case 1: return getDeclaredClass_funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1(declIndex);
            case 2: return getDeclaredClass_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2(declIndex);
            case 3: return getDeclaredClass_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3(declIndex);
            case 4: return getDeclaredClass_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4(declIndex);
            case 5: return getDeclaredClass_funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5(declIndex);
            case 6: return getDeclaredClass_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6(declIndex);
            case 7: return getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7(declIndex);
            case 8: return getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8(declIndex);
            case 9: return getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9(declIndex);
            case 10: return getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10(declIndex);
            case 11: return getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11(declIndex);
            case 12: return getDeclaredClass_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12(declIndex);
            case 13: return getDeclaredClass_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13(declIndex);
            case 14: return getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14(declIndex);
            case 15: return getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15(declIndex);
            case 16: return getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16(declIndex);
            case 17: return getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17(declIndex);
            case 18: return getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18(declIndex);
            case 19: return getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19(declIndex);
            case 20: return getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20(declIndex);
            case 21: return getDeclaredClass_compreensao_mais_aprofundada(declIndex);
            case 22: return getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17(declIndex);
            case 23: return getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19(declIndex);
            case 24: return getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21(declIndex);
            case 25: return getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23(declIndex);
            case 26: return getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25(declIndex);
            case 27: return getDeclaredClass_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27(declIndex);
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
            case 0: funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0(); break;
            case 1: funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1(); break;
            case 2: funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2(); break;
            case 3: funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3(); break;
            case 4: funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4(); break;
            case 5: funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5(); break;
            case 6: funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6(); break;
            case 7: funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7(); break;
            case 8: funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8(); break;
            case 9: funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9(); break;
            case 10: funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10(); break;
            case 11: funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11(); break;
            case 12: funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12(); break;
            case 13: funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13(); break;
            case 14: funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14(); break;
            case 15: funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15(); break;
            case 16: funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16(); break;
            case 17: funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17(); break;
            case 18: funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18(); break;
            case 19: funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19(); break;
            case 20: funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20(); break;
            case 21: compreensao_mais_aprofundada(); break;
            case 22: funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17(); break;
            case 23: funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19(); break;
            case 24: funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21(); break;
            case 25: funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23(); break;
            case 26: funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25(); break;
            case 27: funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 28;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0();
            case 1: return getDeclaredIdentifiers_funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1();
            case 2: return getDeclaredIdentifiers_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2();
            case 3: return getDeclaredIdentifiers_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3();
            case 4: return getDeclaredIdentifiers_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4();
            case 5: return getDeclaredIdentifiers_funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5();
            case 6: return getDeclaredIdentifiers_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6();
            case 7: return getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7();
            case 8: return getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8();
            case 9: return getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9();
            case 10: return getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10();
            case 11: return getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11();
            case 12: return getDeclaredIdentifiers_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12();
            case 13: return getDeclaredIdentifiers_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13();
            case 14: return getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14();
            case 15: return getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15();
            case 16: return getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16();
            case 17: return getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17();
            case 18: return getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18();
            case 19: return getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19();
            case 20: return getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20();
            case 21: return getDeclaredIdentifiers_compreensao_mais_aprofundada();
            case 22: return getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17();
            case 23: return getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19();
            case 24: return getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21();
            case 25: return getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23();
            case 26: return getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25();
            case 27: return getDeclaredIdentifiers_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27();
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
            case 0: setObject_funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0(declIndex, value); break;
            case 1: setObject_funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1(declIndex, value); break;
            case 2: setObject_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2(declIndex, value); break;
            case 3: setObject_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3(declIndex, value); break;
            case 4: setObject_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4(declIndex, value); break;
            case 5: setObject_funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5(declIndex, value); break;
            case 6: setObject_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6(declIndex, value); break;
            case 7: setObject_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7(declIndex, value); break;
            case 8: setObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8(declIndex, value); break;
            case 9: setObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9(declIndex, value); break;
            case 10: setObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10(declIndex, value); break;
            case 11: setObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11(declIndex, value); break;
            case 12: setObject_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12(declIndex, value); break;
            case 13: setObject_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13(declIndex, value); break;
            case 14: setObject_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14(declIndex, value); break;
            case 15: setObject_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15(declIndex, value); break;
            case 16: setObject_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16(declIndex, value); break;
            case 17: setObject_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17(declIndex, value); break;
            case 18: setObject_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18(declIndex, value); break;
            case 19: setObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19(declIndex, value); break;
            case 20: setObject_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20(declIndex, value); break;
            case 21: setObject_compreensao_mais_aprofundada(declIndex, value); break;
            case 22: setObject_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17(declIndex, value); break;
            case 23: setObject_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19(declIndex, value); break;
            case 24: setObject_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21(declIndex, value); break;
            case 25: setObject_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23(declIndex, value); break;
            case 26: setObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25(declIndex, value); break;
            case 27: setObject_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27(declIndex, value); break;
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
            case 0: return getObject_funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0(declIndex);
            case 1: return getObject_funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1(declIndex);
            case 2: return getObject_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2(declIndex);
            case 3: return getObject_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3(declIndex);
            case 4: return getObject_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4(declIndex);
            case 5: return getObject_funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5(declIndex);
            case 6: return getObject_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6(declIndex);
            case 7: return getObject_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7(declIndex);
            case 8: return getObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8(declIndex);
            case 9: return getObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9(declIndex);
            case 10: return getObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10(declIndex);
            case 11: return getObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11(declIndex);
            case 12: return getObject_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12(declIndex);
            case 13: return getObject_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13(declIndex);
            case 14: return getObject_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14(declIndex);
            case 15: return getObject_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15(declIndex);
            case 16: return getObject_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16(declIndex);
            case 17: return getObject_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17(declIndex);
            case 18: return getObject_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18(declIndex);
            case 19: return getObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19(declIndex);
            case 20: return getObject_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20(declIndex);
            case 21: return getObject_compreensao_mais_aprofundada(declIndex);
            case 22: return getObject_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17(declIndex);
            case 23: return getObject_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19(declIndex);
            case 24: return getObject_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21(declIndex);
            case 25: return getObject_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23(declIndex);
            case 26: return getObject_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25(declIndex);
            case 27: return getObject_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27(declIndex);
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
            case 0: return getObjects_funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0();
            case 1: return getObjects_funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1();
            case 2: return getObjects_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2();
            case 3: return getObjects_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3();
            case 4: return getObjects_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4();
            case 5: return getObjects_funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5();
            case 6: return getObjects_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6();
            case 7: return getObjects_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7();
            case 8: return getObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8();
            case 9: return getObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9();
            case 10: return getObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10();
            case 11: return getObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11();
            case 12: return getObjects_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12();
            case 13: return getObjects_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13();
            case 14: return getObjects_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14();
            case 15: return getObjects_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15();
            case 16: return getObjects_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16();
            case 17: return getObjects_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17();
            case 18: return getObjects_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18();
            case 19: return getObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19();
            case 20: return getObjects_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20();
            case 21: return getObjects_compreensao_mais_aprofundada();
            case 22: return getObjects_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17();
            case 23: return getObjects_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19();
            case 24: return getObjects_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21();
            case 25: return getObjects_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23();
            case 26: return getObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25();
            case 27: return getObjects_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27();
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
            case 0: setObjects_funcaoMRE_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_0(objects); break;
            case 1: setObjects_funcaoMRE_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_1(objects); break;
            case 2: setObjects_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_2(objects); break;
            case 3: setObjects_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_3(objects); break;
            case 4: setObjects_funcaoMRE_2_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_4(objects); break;
            case 5: setObjects_funcaoMRE_2_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_5(objects); break;
            case 6: setObjects_funcaoMRE_2_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_6(objects); break;
            case 7: setObjects_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_7(objects); break;
            case 8: setObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_9_8(objects); break;
            case 9: setObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_10_9(objects); break;
            case 10: setObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_11_10(objects); break;
            case 11: setObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_12_11(objects); break;
            case 12: setObjects_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_12(objects); break;
            case 13: setObjects_funcaoMRE_2_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_13(objects); break;
            case 14: setObjects_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_14(objects); break;
            case 15: setObjects_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15(objects); break;
            case 16: setObjects_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16(objects); break;
            case 17: setObjects_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17(objects); break;
            case 18: setObjects_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18(objects); break;
            case 19: setObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19(objects); break;
            case 20: setObjects_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20(objects); break;
            case 21: setObjects_compreensao_mais_aprofundada(objects); break;
            case 22: setObjects_funcaoMRE_3_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_15indice_17(objects); break;
            case 23: setObjects_funcaoMRE_3_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_16indice_19(objects); break;
            case 24: setObjects_funcaoMRE_3_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_17indice_21(objects); break;
            case 25: setObjects_funcaoMRE_3_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_18indice_23(objects); break;
            case 26: setObjects_funcaoMRE_3_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_19_indice_19indice_25(objects); break;
            case 27: setObjects_funcaoMRE_3_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_20indice_27(objects); break;
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
 * @version 02/07/2015
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
