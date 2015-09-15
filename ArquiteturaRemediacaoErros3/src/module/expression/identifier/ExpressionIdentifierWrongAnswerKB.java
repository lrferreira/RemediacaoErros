package module.expression.identifier;

import javax.swing.JComponent;
import module.entity.Goal;
import module.entity.Exercise;
import module.entity.Question;
import module.entity.Action;
import module.entity.WrongAnswer;
import module.entity.RuleToHuman;
import module.entity.Remediation;
import module.entity.DBConnect;
import java.util.ArrayList;
import module.error.sorter.ErrorSorterController;
import module.entity.DBConnect;


 class Jeops_RuleBase_ExpressionIdentifierWrongAnswerKB extends jeops.AbstractRuleBase {






	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt1"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase(" ")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0_cond_5() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase(" "));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \" \"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_");
			Remediation r = module_entity_DBConnect_1.getRemediation(1L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt1"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("0")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1_cond_5() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("0"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \"0\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_");
			Remediation r = module_entity_DBConnect_1.getRemediation(4L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt1"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2_cond_5() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("6"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \"6\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_");
			Remediation r = module_entity_DBConnect_1.getRemediation(5L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt1"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3.<p>
     * The original expression was:<br>
     * <code>!action.getAnswer().getValue().equalsIgnoreCase("1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3_cond_5() {
        return (!module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("1"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta diferente de \"1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_");
			Remediation r = module_entity_DBConnect_1.getRemediation(15L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(2L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt2")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt2"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase(" ")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4_cond_5() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase(" "));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \" \"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 2\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt2\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_");
			Remediation r = module_entity_DBConnect_1.getRemediation(2L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(2L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt2")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt2"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5_cond_5() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("6"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \"6\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 2\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt2\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_");
			Remediation r = module_entity_DBConnect_1.getRemediation(6L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(2L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt2")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt2"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6.<p>
     * The original expression was:<br>
     * <code>!action.getAnswer().getValue().equalsIgnoreCase("0")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6_cond_5() {
        return (!module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("0"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta diferente de \"0\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 2\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt2\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_");
			Remediation r = module_entity_DBConnect_1.getRemediation(16L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(3L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt5")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt5"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("0")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7_cond_5() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("0"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \"0\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 3\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt5\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_");
			Remediation r = module_entity_DBConnect_1.getRemediation(3L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(3L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt5")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt5"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8_cond_5() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("1"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \"1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 3\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt5\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_");
			Remediation r = module_entity_DBConnect_1.getRemediation(7L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(3L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt5")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt5"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9.<p>
     * The original expression was:<br>
     * <code>!action.getAnswer().getValue().equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9_cond_5() {
        return (!module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("6"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta diferente de \"6\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 3\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt5\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_");
			Remediation r = module_entity_DBConnect_1.getRemediation(17L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(4L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt3"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("-")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10_cond_5() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("-"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \"-\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 4\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt3\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_");
			Remediation r = module_entity_DBConnect_1.getRemediation(8L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(4L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt3"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11.<p>
     * The original expression was:<br>
     * <code>!action.getAnswer().getValue().equalsIgnoreCase("+")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11_cond_5() {
        return (!module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("+"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta diferente de \"+\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 4\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt3\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_");
			Remediation r = module_entity_DBConnect_1.getRemediation(18L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(5L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt8")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt8"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12.<p>
     * The original expression was:<br>
     * <code>!action.getAnswer().getValue().equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12_cond_5() {
        return (!module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("6"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta diferente de \"6\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 5\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt8\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_");
			Remediation r = module_entity_DBConnect_1.getRemediation(25L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(6L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt7")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt7"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase(" ")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13_cond_5() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase(" "));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \" \"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt7\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_");
			Remediation r = module_entity_DBConnect_1.getRemediation(13L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(6L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt7")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt7"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("0")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14_cond_5() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("0"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \"0\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt7\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_");
			Remediation r = module_entity_DBConnect_1.getRemediation(14L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(6L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt7")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt7"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15.<p>
     * The original expression was:<br>
     * <code>!action.getAnswer().getValue().equalsIgnoreCase("1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15_cond_5() {
        return (!module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("1"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta diferente de \"1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt7\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_");
			Remediation r = module_entity_DBConnect_1.getRemediation(20L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt1"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase(" ")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16_cond_5() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase(" "));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \" \"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_");
			Remediation r = module_entity_DBConnect_1.getRemediation(1L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt1"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("0")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17_cond_5() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("0"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \"0\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_");
			Remediation r = module_entity_DBConnect_1.getRemediation(4L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt1"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18_cond_5() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("6"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \"6\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_");
			Remediation r = module_entity_DBConnect_1.getRemediation(5L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt1"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19.<p>
     * The original expression was:<br>
     * <code>!action.getAnswer().getValue().equalsIgnoreCase("1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19_cond_5() {
        return (!module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("1"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta diferente de \"1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_");
			Remediation r = module_entity_DBConnect_1.getRemediation(15L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(2L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt2")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt2"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase(" ")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20_cond_5() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase(" "));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \" \"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 2\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt2\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_");
			Remediation r = module_entity_DBConnect_1.getRemediation(2L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(2L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt2")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt2"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21_cond_5() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("6"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \"6\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 2\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt2\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_");
			Remediation r = module_entity_DBConnect_1.getRemediation(6L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(2L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt2")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt2"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22.<p>
     * The original expression was:<br>
     * <code>!action.getAnswer().getValue().equalsIgnoreCase("0")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22_cond_5() {
        return (!module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("0"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta diferente de \"0\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 2\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt2\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_");
			Remediation r = module_entity_DBConnect_1.getRemediation(16L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(3L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt5")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt5"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("0")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23_cond_5() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("0"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \"0\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 3\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt5\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_");
			Remediation r = module_entity_DBConnect_1.getRemediation(3L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(3L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt5")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt5"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24_cond_5() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("1"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \"1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 3\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt5\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_");
			Remediation r = module_entity_DBConnect_1.getRemediation(7L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(3L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt5")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt5"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25.<p>
     * The original expression was:<br>
     * <code>!action.getAnswer().getValue().equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25_cond_5() {
        return (!module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("6"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta diferente de \"6\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 3\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt5\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_");
			Remediation r = module_entity_DBConnect_1.getRemediation(17L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(4L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt3"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("-")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26_cond_5() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("-"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \"-\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 4\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt3\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_");
			Remediation r = module_entity_DBConnect_1.getRemediation(8L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(4L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt3"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27.<p>
     * The original expression was:<br>
     * <code>!action.getAnswer().getValue().equalsIgnoreCase("+")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27_cond_5() {
        return (!module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("+"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta diferente de \"+\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 4\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt3\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_");
			Remediation r = module_entity_DBConnect_1.getRemediation(18L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(5L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt8")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt8"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28.<p>
     * The original expression was:<br>
     * <code>!action.getAnswer().getValue().equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28_cond_5() {
        return (!module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("6"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta diferente de \"6\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 5\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt8\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_");
			Remediation r = module_entity_DBConnect_1.getRemediation(25L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(6L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt7")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt7"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase(" ")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29_cond_5() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase(" "));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \" \"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt7\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_");
			Remediation r = module_entity_DBConnect_1.getRemediation(13L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(6L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt7")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt7"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("0")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30_cond_5() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("0"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \"0\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt7\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_");
			Remediation r = module_entity_DBConnect_1.getRemediation(14L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31
     */
    private String[] identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31 = {
        "action",
        "dbCon",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31
     *
     * @return the identifiers declared in rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31
     */
    private String[] getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31() {
         return identifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.DBConnect";
            case 2: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.DBConnect.class;
            case 2: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_DBConnect_1 = (module.entity.DBConnect) value; break;
            case 2: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_DBConnect_1;
            case 2: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_DBConnect_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_DBConnect_1 = (module.entity.DBConnect) objects[1];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[2];
    }

    /**
     * Condition 0 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getExercise().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getExercise().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getQuestion().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31_cond_1() {
        return (module_entity_Action_1.getGoal().getPath().getQuestion().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31_cond_2() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 3 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31_cond_3() {
        return (module_entity_Action_1.getGoal().getId().equals(6L));
    }

    /**
     * Condition 4 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt7")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31_cond_4() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt7"));
    }

    /**
     * Condition 5 of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31.<p>
     * The original expression was:<br>
     * <code>!action.getAnswer().getValue().equalsIgnoreCase("1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31_cond_5() {
        return (!module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("1"));
    }

    /**
     * Checks whether some conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31_cond(int index) {
        switch (index) {
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31_cond_0();
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31_cond_1();
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31_cond_2();
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31_cond_3();
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31_cond_4();
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31_cond_5();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31_cond_0()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31_cond_1()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31_cond_2()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31_cond_3()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31_cond_4()) return false;
                if (!respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31_cond_5()) return false;
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
    private boolean checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31(int declIndex) {
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
     * Executes the action part of the rule respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31
     */
    private void respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta diferente de \"1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tExercício = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tQuestão = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt7\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a resposta como errada \n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getRegrasAcionadas().add("respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_");
			Remediation r = module_entity_DBConnect_1.getRemediation(20L);
			module_entity_Action_1.setRemediation(r);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 

// end_rules

// rule necessary by default

	
    /**
     * Identifiers of rule wrongAnswer_default
     */
    private String[] identifiers_wrongAnswer_default = {
        "action",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule wrongAnswer_default
     *
     * @return the identifiers declared in rule wrongAnswer_default
     */
    private String[] getDeclaredIdentifiers_wrongAnswer_default() {
         return identifiers_wrongAnswer_default;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule wrongAnswer_default.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_wrongAnswer_default(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule wrongAnswer_default.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_wrongAnswer_default(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule wrongAnswer_default.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_wrongAnswer_default(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule wrongAnswer_default.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_wrongAnswer_default(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule wrongAnswer_default
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_wrongAnswer_default() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule wrongAnswer_default
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_wrongAnswer_default(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[1];
    }

    /**
     * Condition 0 of rule wrongAnswer_default.<p>
     * The original expression was:<br>
     * <code>action.getCorrect() == null</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_default_cond_0() {
        return (module_entity_Action_1.getCorrect() == null);
    }

    /**
     * Checks whether some conditions of rule wrongAnswer_default is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean wrongAnswer_default_cond(int index) {
        switch (index) {
            case 0: return wrongAnswer_default_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule wrongAnswer_default that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_wrongAnswer_default(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!wrongAnswer_default_cond_0()) return false;
                return true;
            case 1:
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
    private boolean checkCondForDeclaration_wrongAnswer_default(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule wrongAnswer_default
     */
    private void wrongAnswer_default() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta errada: wrongAnswer_default \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condição não prevista no cadastro de erros  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \"" + module_entity_Action_1.getAnswer().getValue() + "\"\n");
			System.out.println("Resposta Errada (1) detectada");
			module_entity_Action_1.setCorrect(false);
			module_entity_Action_1.setAnswer(new WrongAnswer(module_entity_Action_1.getAnswer().getValue()));
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }

	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30",
        "respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31",
        "wrongAnswer_default"
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
        2
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
        6,
        6,
        6,
        6,
        6,
        6,
        6,
        6,
        6,
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
            case 0: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0_cond(condIndex);
            case 1: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1_cond(condIndex);
            case 2: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2_cond(condIndex);
            case 3: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3_cond(condIndex);
            case 4: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4_cond(condIndex);
            case 5: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5_cond(condIndex);
            case 6: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6_cond(condIndex);
            case 7: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7_cond(condIndex);
            case 8: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8_cond(condIndex);
            case 9: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9_cond(condIndex);
            case 10: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10_cond(condIndex);
            case 11: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11_cond(condIndex);
            case 12: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12_cond(condIndex);
            case 13: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13_cond(condIndex);
            case 14: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14_cond(condIndex);
            case 15: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15_cond(condIndex);
            case 16: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16_cond(condIndex);
            case 17: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17_cond(condIndex);
            case 18: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18_cond(condIndex);
            case 19: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19_cond(condIndex);
            case 20: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20_cond(condIndex);
            case 21: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21_cond(condIndex);
            case 22: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22_cond(condIndex);
            case 23: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23_cond(condIndex);
            case 24: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24_cond(condIndex);
            case 25: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25_cond(condIndex);
            case 26: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26_cond(condIndex);
            case 27: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27_cond(condIndex);
            case 28: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28_cond(condIndex);
            case 29: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29_cond(condIndex);
            case 30: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30_cond(condIndex);
            case 31: return respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31_cond(condIndex);
            case 32: return wrongAnswer_default_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0(declIndex);
            case 1: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1(declIndex);
            case 2: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2(declIndex);
            case 3: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3(declIndex);
            case 4: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4(declIndex);
            case 5: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5(declIndex);
            case 6: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6(declIndex);
            case 7: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7(declIndex);
            case 8: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8(declIndex);
            case 9: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9(declIndex);
            case 10: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10(declIndex);
            case 11: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11(declIndex);
            case 12: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12(declIndex);
            case 13: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13(declIndex);
            case 14: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14(declIndex);
            case 15: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15(declIndex);
            case 16: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16(declIndex);
            case 17: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17(declIndex);
            case 18: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18(declIndex);
            case 19: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19(declIndex);
            case 20: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20(declIndex);
            case 21: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21(declIndex);
            case 22: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22(declIndex);
            case 23: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23(declIndex);
            case 24: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24(declIndex);
            case 25: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25(declIndex);
            case 26: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26(declIndex);
            case 27: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27(declIndex);
            case 28: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28(declIndex);
            case 29: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29(declIndex);
            case 30: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30(declIndex);
            case 31: return checkConditionsOnlyOf_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31(declIndex);
            case 32: return checkConditionsOnlyOf_wrongAnswer_default(declIndex);
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
            case 0: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0(declIndex);
            case 1: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1(declIndex);
            case 2: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2(declIndex);
            case 3: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3(declIndex);
            case 4: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4(declIndex);
            case 5: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5(declIndex);
            case 6: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6(declIndex);
            case 7: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7(declIndex);
            case 8: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8(declIndex);
            case 9: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9(declIndex);
            case 10: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10(declIndex);
            case 11: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11(declIndex);
            case 12: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12(declIndex);
            case 13: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13(declIndex);
            case 14: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14(declIndex);
            case 15: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15(declIndex);
            case 16: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16(declIndex);
            case 17: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17(declIndex);
            case 18: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18(declIndex);
            case 19: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19(declIndex);
            case 20: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20(declIndex);
            case 21: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21(declIndex);
            case 22: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22(declIndex);
            case 23: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23(declIndex);
            case 24: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24(declIndex);
            case 25: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25(declIndex);
            case 26: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26(declIndex);
            case 27: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27(declIndex);
            case 28: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28(declIndex);
            case 29: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29(declIndex);
            case 30: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30(declIndex);
            case 31: return checkCondForDeclaration_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31(declIndex);
            case 32: return checkCondForDeclaration_wrongAnswer_default(declIndex);
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
            case 0: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0(declIndex);
            case 1: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1(declIndex);
            case 2: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2(declIndex);
            case 3: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3(declIndex);
            case 4: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4(declIndex);
            case 5: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5(declIndex);
            case 6: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6(declIndex);
            case 7: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7(declIndex);
            case 8: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8(declIndex);
            case 9: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9(declIndex);
            case 10: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10(declIndex);
            case 11: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11(declIndex);
            case 12: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12(declIndex);
            case 13: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13(declIndex);
            case 14: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14(declIndex);
            case 15: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15(declIndex);
            case 16: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16(declIndex);
            case 17: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17(declIndex);
            case 18: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18(declIndex);
            case 19: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19(declIndex);
            case 20: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20(declIndex);
            case 21: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21(declIndex);
            case 22: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22(declIndex);
            case 23: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23(declIndex);
            case 24: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24(declIndex);
            case 25: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25(declIndex);
            case 26: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26(declIndex);
            case 27: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27(declIndex);
            case 28: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28(declIndex);
            case 29: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29(declIndex);
            case 30: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30(declIndex);
            case 31: return getDeclaredClassName_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31(declIndex);
            case 32: return getDeclaredClassName_wrongAnswer_default(declIndex);
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
            case 0: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0(declIndex);
            case 1: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1(declIndex);
            case 2: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2(declIndex);
            case 3: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3(declIndex);
            case 4: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4(declIndex);
            case 5: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5(declIndex);
            case 6: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6(declIndex);
            case 7: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7(declIndex);
            case 8: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8(declIndex);
            case 9: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9(declIndex);
            case 10: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10(declIndex);
            case 11: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11(declIndex);
            case 12: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12(declIndex);
            case 13: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13(declIndex);
            case 14: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14(declIndex);
            case 15: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15(declIndex);
            case 16: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16(declIndex);
            case 17: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17(declIndex);
            case 18: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18(declIndex);
            case 19: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19(declIndex);
            case 20: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20(declIndex);
            case 21: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21(declIndex);
            case 22: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22(declIndex);
            case 23: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23(declIndex);
            case 24: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24(declIndex);
            case 25: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25(declIndex);
            case 26: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26(declIndex);
            case 27: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27(declIndex);
            case 28: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28(declIndex);
            case 29: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29(declIndex);
            case 30: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30(declIndex);
            case 31: return getDeclaredClass_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31(declIndex);
            case 32: return getDeclaredClass_wrongAnswer_default(declIndex);
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
            case 0: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0(); break;
            case 1: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1(); break;
            case 2: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2(); break;
            case 3: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3(); break;
            case 4: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4(); break;
            case 5: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5(); break;
            case 6: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6(); break;
            case 7: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7(); break;
            case 8: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8(); break;
            case 9: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9(); break;
            case 10: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10(); break;
            case 11: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11(); break;
            case 12: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12(); break;
            case 13: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13(); break;
            case 14: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14(); break;
            case 15: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15(); break;
            case 16: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16(); break;
            case 17: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17(); break;
            case 18: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18(); break;
            case 19: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19(); break;
            case 20: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20(); break;
            case 21: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21(); break;
            case 22: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22(); break;
            case 23: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23(); break;
            case 24: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24(); break;
            case 25: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25(); break;
            case 26: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26(); break;
            case 27: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27(); break;
            case 28: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28(); break;
            case 29: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29(); break;
            case 30: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30(); break;
            case 31: respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31(); break;
            case 32: wrongAnswer_default(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 33;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0();
            case 1: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1();
            case 2: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2();
            case 3: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3();
            case 4: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4();
            case 5: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5();
            case 6: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6();
            case 7: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7();
            case 8: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8();
            case 9: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9();
            case 10: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10();
            case 11: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11();
            case 12: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12();
            case 13: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13();
            case 14: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14();
            case 15: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15();
            case 16: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16();
            case 17: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17();
            case 18: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18();
            case 19: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19();
            case 20: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20();
            case 21: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21();
            case 22: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22();
            case 23: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23();
            case 24: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24();
            case 25: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25();
            case 26: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26();
            case 27: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27();
            case 28: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28();
            case 29: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29();
            case 30: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30();
            case 31: return getDeclaredIdentifiers_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31();
            case 32: return getDeclaredIdentifiers_wrongAnswer_default();
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
            case 0: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0(declIndex, value); break;
            case 1: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1(declIndex, value); break;
            case 2: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2(declIndex, value); break;
            case 3: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3(declIndex, value); break;
            case 4: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4(declIndex, value); break;
            case 5: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5(declIndex, value); break;
            case 6: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6(declIndex, value); break;
            case 7: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7(declIndex, value); break;
            case 8: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8(declIndex, value); break;
            case 9: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9(declIndex, value); break;
            case 10: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10(declIndex, value); break;
            case 11: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11(declIndex, value); break;
            case 12: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12(declIndex, value); break;
            case 13: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13(declIndex, value); break;
            case 14: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14(declIndex, value); break;
            case 15: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15(declIndex, value); break;
            case 16: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16(declIndex, value); break;
            case 17: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17(declIndex, value); break;
            case 18: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18(declIndex, value); break;
            case 19: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19(declIndex, value); break;
            case 20: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20(declIndex, value); break;
            case 21: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21(declIndex, value); break;
            case 22: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22(declIndex, value); break;
            case 23: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23(declIndex, value); break;
            case 24: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24(declIndex, value); break;
            case 25: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25(declIndex, value); break;
            case 26: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26(declIndex, value); break;
            case 27: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27(declIndex, value); break;
            case 28: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28(declIndex, value); break;
            case 29: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29(declIndex, value); break;
            case 30: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30(declIndex, value); break;
            case 31: setObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31(declIndex, value); break;
            case 32: setObject_wrongAnswer_default(declIndex, value); break;
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
            case 0: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0(declIndex);
            case 1: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1(declIndex);
            case 2: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2(declIndex);
            case 3: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3(declIndex);
            case 4: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4(declIndex);
            case 5: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5(declIndex);
            case 6: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6(declIndex);
            case 7: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7(declIndex);
            case 8: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8(declIndex);
            case 9: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9(declIndex);
            case 10: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10(declIndex);
            case 11: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11(declIndex);
            case 12: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12(declIndex);
            case 13: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13(declIndex);
            case 14: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14(declIndex);
            case 15: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15(declIndex);
            case 16: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16(declIndex);
            case 17: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17(declIndex);
            case 18: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18(declIndex);
            case 19: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19(declIndex);
            case 20: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20(declIndex);
            case 21: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21(declIndex);
            case 22: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22(declIndex);
            case 23: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23(declIndex);
            case 24: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24(declIndex);
            case 25: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25(declIndex);
            case 26: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26(declIndex);
            case 27: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27(declIndex);
            case 28: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28(declIndex);
            case 29: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29(declIndex);
            case 30: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30(declIndex);
            case 31: return getObject_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31(declIndex);
            case 32: return getObject_wrongAnswer_default(declIndex);
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
            case 0: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0();
            case 1: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1();
            case 2: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2();
            case 3: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3();
            case 4: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4();
            case 5: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5();
            case 6: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6();
            case 7: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7();
            case 8: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8();
            case 9: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9();
            case 10: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10();
            case 11: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11();
            case 12: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12();
            case 13: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13();
            case 14: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14();
            case 15: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15();
            case 16: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16();
            case 17: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17();
            case 18: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18();
            case 19: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19();
            case 20: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20();
            case 21: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21();
            case 22: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22();
            case 23: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23();
            case 24: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24();
            case 25: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25();
            case 26: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26();
            case 27: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27();
            case 28: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28();
            case 29: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29();
            case 30: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30();
            case 31: return getObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31();
            case 32: return getObjects_wrongAnswer_default();
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
            case 0: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_0(objects); break;
            case 1: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_1(objects); break;
            case 2: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_2(objects); break;
            case 3: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_3(objects); break;
            case 4: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_4(objects); break;
            case 5: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_5(objects); break;
            case 6: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_6(objects); break;
            case 7: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_7(objects); break;
            case 8: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_8(objects); break;
            case 9: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_9(objects); break;
            case 10: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_10(objects); break;
            case 11: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_11(objects); break;
            case 12: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_12(objects); break;
            case 13: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_13(objects); break;
            case 14: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_14(objects); break;
            case 15: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_15(objects); break;
            case 16: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_1_indice_16(objects); break;
            case 17: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_4_indice_17(objects); break;
            case 18: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_5_indice_18(objects); break;
            case 19: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_1_COMPONENTE_txt1_REMEDIACAO_15_indice_19(objects); break;
            case 20: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_2_indice_20(objects); break;
            case 21: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_6_indice_21(objects); break;
            case 22: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_2_COMPONENTE_txt2_REMEDIACAO_16_indice_22(objects); break;
            case 23: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_3_indice_23(objects); break;
            case 24: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_7_indice_24(objects); break;
            case 25: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_3_COMPONENTE_txt5_REMEDIACAO_17_indice_25(objects); break;
            case 26: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_8_indice_26(objects); break;
            case 27: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_4_COMPONENTE_txt3_REMEDIACAO_18_indice_27(objects); break;
            case 28: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_5_COMPONENTE_txt8_REMEDIACAO_25_indice_28(objects); break;
            case 29: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_13_indice_29(objects); break;
            case 30: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_14_indice_30(objects); break;
            case 31: setObjects_respostaErrada_EXERCICIO_1_QUESTAO_1_CAMINHO_1_META_6_COMPONENTE_txt7_REMEDIACAO_20_indice_31(objects); break;
            case 32: setObjects_wrongAnswer_default(objects); break;
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
    public Jeops_RuleBase_ExpressionIdentifierWrongAnswerKB(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file ExpressionIdentifierWrongAnswerKB.rules
 *
 * @version 14/09/2015
 */
public class ExpressionIdentifierWrongAnswerKB extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public ExpressionIdentifierWrongAnswerKB(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public ExpressionIdentifierWrongAnswerKB() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_ExpressionIdentifierWrongAnswerKB(this);
    }

}
