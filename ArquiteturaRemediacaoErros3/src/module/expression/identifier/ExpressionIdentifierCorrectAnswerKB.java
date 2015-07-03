package module.expression.identifier;

import javax.swing.JComponent;
import module.entity.Goal;
import module.entity.Action;
import module.entity.CorrectAnswer;
import module.entity.RuleToHuman;
import java.util.ArrayList;
import module.error.sorter.ErrorSorterController;
import javax.swing.*;


 class Jeops_RuleBase_ExpressionIdentifierCorrectAnswerKB extends jeops.AbstractRuleBase {
	




	
    /**
     * Identifiers of rule respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0
     */
    private String[] identifiers_respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0 = {
        "action",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0
     *
     * @return the identifiers declared in rule respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0
     */
    private String[] getDeclaredIdentifiers_respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0() {
         return identifiers_respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[1];
    }

    /**
     * Condition 0 of rule respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 2 of rule respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt1"));
    }

    /**
     * Condition 3 of rule respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0_cond_3() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("1"));
    }

    /**
     * Checks whether some conditions of rule respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0_cond(int index) {
        switch (index) {
            case 0: return respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0_cond_0();
            case 1: return respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0_cond_1();
            case 2: return respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0_cond_2();
            case 3: return respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0_cond_0()) return false;
                if (!respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0_cond_1()) return false;
                if (!respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0_cond_2()) return false;
                if (!respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0_cond_3()) return false;
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
    private boolean checkCondForDeclaration_respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0
     */
    private void respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta correta: respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \"1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a Meta 1 como satisfeita \n");
			System.out.println("Resposta Correta (1) detectada\n");
			module_entity_Action_1.setCorrect(true);
			module_entity_Action_1.setAnswer(new CorrectAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getGoal().setSatisfied(true);
			module_entity_Action_1.getRegrasAcionadas().add("respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_");
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1
     */
    private String[] identifiers_respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1 = {
        "action",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1
     *
     * @return the identifiers declared in rule respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1
     */
    private String[] getDeclaredIdentifiers_respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1() {
         return identifiers_respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[1];
    }

    /**
     * Condition 0 of rule respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(2L));
    }

    /**
     * Condition 2 of rule respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt2")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt2"));
    }

    /**
     * Condition 3 of rule respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("0")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1_cond_3() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("0"));
    }

    /**
     * Checks whether some conditions of rule respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1_cond(int index) {
        switch (index) {
            case 0: return respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1_cond_0();
            case 1: return respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1_cond_1();
            case 2: return respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1_cond_2();
            case 3: return respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1_cond_0()) return false;
                if (!respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1_cond_1()) return false;
                if (!respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1_cond_2()) return false;
                if (!respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1_cond_3()) return false;
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
    private boolean checkCondForDeclaration_respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1
     */
    private void respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta correta: respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \"0\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 2\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt2\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a Meta 2 como satisfeita \n");
			System.out.println("Resposta Correta (1) detectada\n");
			module_entity_Action_1.setCorrect(true);
			module_entity_Action_1.setAnswer(new CorrectAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getGoal().setSatisfied(true);
			module_entity_Action_1.getRegrasAcionadas().add("respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_");
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2
     */
    private String[] identifiers_respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2 = {
        "action",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2
     *
     * @return the identifiers declared in rule respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2
     */
    private String[] getDeclaredIdentifiers_respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2() {
         return identifiers_respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[1];
    }

    /**
     * Condition 0 of rule respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(3L));
    }

    /**
     * Condition 2 of rule respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt5")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt5"));
    }

    /**
     * Condition 3 of rule respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2_cond_3() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("6"));
    }

    /**
     * Checks whether some conditions of rule respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2_cond(int index) {
        switch (index) {
            case 0: return respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2_cond_0();
            case 1: return respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2_cond_1();
            case 2: return respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2_cond_2();
            case 3: return respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2_cond_0()) return false;
                if (!respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2_cond_1()) return false;
                if (!respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2_cond_2()) return false;
                if (!respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2_cond_3()) return false;
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
    private boolean checkCondForDeclaration_respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2
     */
    private void respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta correta: respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \"6\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 3\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt5\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a Meta 3 como satisfeita \n");
			System.out.println("Resposta Correta (1) detectada\n");
			module_entity_Action_1.setCorrect(true);
			module_entity_Action_1.setAnswer(new CorrectAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getGoal().setSatisfied(true);
			module_entity_Action_1.getRegrasAcionadas().add("respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_");
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3
     */
    private String[] identifiers_respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3 = {
        "action",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3
     *
     * @return the identifiers declared in rule respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3
     */
    private String[] getDeclaredIdentifiers_respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3() {
         return identifiers_respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[1];
    }

    /**
     * Condition 0 of rule respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(4L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(4L));
    }

    /**
     * Condition 2 of rule respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt3"));
    }

    /**
     * Condition 3 of rule respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("+")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3_cond_3() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("+"));
    }

    /**
     * Checks whether some conditions of rule respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3_cond(int index) {
        switch (index) {
            case 0: return respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3_cond_0();
            case 1: return respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3_cond_1();
            case 2: return respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3_cond_2();
            case 3: return respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3_cond_0()) return false;
                if (!respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3_cond_1()) return false;
                if (!respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3_cond_2()) return false;
                if (!respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3_cond_3()) return false;
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
    private boolean checkCondForDeclaration_respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3
     */
    private void respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta correta: respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \"+\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 4\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt3\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a Meta 4 como satisfeita \n");
			System.out.println("Resposta Correta (1) detectada\n");
			module_entity_Action_1.setCorrect(true);
			module_entity_Action_1.setAnswer(new CorrectAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getGoal().setSatisfied(true);
			module_entity_Action_1.getRegrasAcionadas().add("respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_");
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4
     */
    private String[] identifiers_respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4 = {
        "action",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4
     *
     * @return the identifiers declared in rule respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4
     */
    private String[] getDeclaredIdentifiers_respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4() {
         return identifiers_respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[1];
    }

    /**
     * Condition 0 of rule respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(5L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(5L));
    }

    /**
     * Condition 2 of rule respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt8")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt8"));
    }

    /**
     * Condition 3 of rule respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4_cond_3() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("6"));
    }

    /**
     * Checks whether some conditions of rule respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4_cond(int index) {
        switch (index) {
            case 0: return respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4_cond_0();
            case 1: return respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4_cond_1();
            case 2: return respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4_cond_2();
            case 3: return respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4_cond_0()) return false;
                if (!respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4_cond_1()) return false;
                if (!respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4_cond_2()) return false;
                if (!respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4_cond_3()) return false;
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
    private boolean checkCondForDeclaration_respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4
     */
    private void respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta correta: respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \"6\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 5\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt8\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a Meta 5 como satisfeita \n");
			System.out.println("Resposta Correta (1) detectada\n");
			module_entity_Action_1.setCorrect(true);
			module_entity_Action_1.setAnswer(new CorrectAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getGoal().setSatisfied(true);
			module_entity_Action_1.getRegrasAcionadas().add("respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_");
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 


	
    /**
     * Identifiers of rule respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5
     */
    private String[] identifiers_respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5 = {
        "action",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5
     *
     * @return the identifiers declared in rule respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5
     */
    private String[] getDeclaredIdentifiers_respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5() {
         return identifiers_respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[1];
    }

    /**
     * Condition 0 of rule respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 1 of rule respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(6L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(6L));
    }

    /**
     * Condition 2 of rule respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt7")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt7"));
    }

    /**
     * Condition 3 of rule respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5_cond_3() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("1"));
    }

    /**
     * Checks whether some conditions of rule respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5_cond(int index) {
        switch (index) {
            case 0: return respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5_cond_0();
            case 1: return respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5_cond_1();
            case 2: return respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5_cond_2();
            case 3: return respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5_cond_0()) return false;
                if (!respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5_cond_1()) return false;
                if (!respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5_cond_2()) return false;
                if (!respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5_cond_3()) return false;
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
    private boolean checkCondForDeclaration_respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5
     */
    private void respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta correta: respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = \"1\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tCaminho = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tMeta = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tComponente = \"txt7\"\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Ações:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "	Marque a Meta 6 como satisfeita \n");
			System.out.println("Resposta Correta (1) detectada\n");
			module_entity_Action_1.setCorrect(true);
			module_entity_Action_1.setAnswer(new CorrectAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getGoal().setSatisfied(true);
			module_entity_Action_1.getRegrasAcionadas().add("respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_");
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }


// -rule-end- 

// end_rules
	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0",
        "respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1",
        "respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2",
        "respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3",
        "respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4",
        "respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5"
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
        2,
        2,
        2,
        2,
        2,
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
        4,
        4,
        4,
        4,
        4,
        4
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
            case 0: return respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0_cond(condIndex);
            case 1: return respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1_cond(condIndex);
            case 2: return respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2_cond(condIndex);
            case 3: return respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3_cond(condIndex);
            case 4: return respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4_cond(condIndex);
            case 5: return respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0(declIndex);
            case 1: return checkConditionsOnlyOf_respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1(declIndex);
            case 2: return checkConditionsOnlyOf_respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2(declIndex);
            case 3: return checkConditionsOnlyOf_respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3(declIndex);
            case 4: return checkConditionsOnlyOf_respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4(declIndex);
            case 5: return checkConditionsOnlyOf_respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5(declIndex);
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
            case 0: return checkCondForDeclaration_respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0(declIndex);
            case 1: return checkCondForDeclaration_respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1(declIndex);
            case 2: return checkCondForDeclaration_respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2(declIndex);
            case 3: return checkCondForDeclaration_respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3(declIndex);
            case 4: return checkCondForDeclaration_respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4(declIndex);
            case 5: return checkCondForDeclaration_respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5(declIndex);
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
            case 0: return getDeclaredClassName_respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0(declIndex);
            case 1: return getDeclaredClassName_respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1(declIndex);
            case 2: return getDeclaredClassName_respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2(declIndex);
            case 3: return getDeclaredClassName_respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3(declIndex);
            case 4: return getDeclaredClassName_respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4(declIndex);
            case 5: return getDeclaredClassName_respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5(declIndex);
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
            case 0: return getDeclaredClass_respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0(declIndex);
            case 1: return getDeclaredClass_respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1(declIndex);
            case 2: return getDeclaredClass_respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2(declIndex);
            case 3: return getDeclaredClass_respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3(declIndex);
            case 4: return getDeclaredClass_respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4(declIndex);
            case 5: return getDeclaredClass_respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5(declIndex);
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
            case 0: respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0(); break;
            case 1: respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1(); break;
            case 2: respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2(); break;
            case 3: respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3(); break;
            case 4: respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4(); break;
            case 5: respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 6;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0();
            case 1: return getDeclaredIdentifiers_respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1();
            case 2: return getDeclaredIdentifiers_respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2();
            case 3: return getDeclaredIdentifiers_respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3();
            case 4: return getDeclaredIdentifiers_respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4();
            case 5: return getDeclaredIdentifiers_respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5();
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
            case 0: setObject_respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0(declIndex, value); break;
            case 1: setObject_respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1(declIndex, value); break;
            case 2: setObject_respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2(declIndex, value); break;
            case 3: setObject_respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3(declIndex, value); break;
            case 4: setObject_respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4(declIndex, value); break;
            case 5: setObject_respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5(declIndex, value); break;
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
            case 0: return getObject_respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0(declIndex);
            case 1: return getObject_respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1(declIndex);
            case 2: return getObject_respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2(declIndex);
            case 3: return getObject_respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3(declIndex);
            case 4: return getObject_respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4(declIndex);
            case 5: return getObject_respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5(declIndex);
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
            case 0: return getObjects_respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0();
            case 1: return getObjects_respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1();
            case 2: return getObjects_respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2();
            case 3: return getObjects_respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3();
            case 4: return getObjects_respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4();
            case 5: return getObjects_respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5();
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
            case 0: setObjects_respostaCorreta_CAMINHO_1_META_1_COMPONENTE_txt1_0(objects); break;
            case 1: setObjects_respostaCorreta_CAMINHO_1_META_2_COMPONENTE_txt2_1(objects); break;
            case 2: setObjects_respostaCorreta_CAMINHO_1_META_3_COMPONENTE_txt5_2(objects); break;
            case 3: setObjects_respostaCorreta_CAMINHO_1_META_4_COMPONENTE_txt3_3(objects); break;
            case 4: setObjects_respostaCorreta_CAMINHO_1_META_5_COMPONENTE_txt8_4(objects); break;
            case 5: setObjects_respostaCorreta_CAMINHO_1_META_6_COMPONENTE_txt7_5(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private module.entity.Action module_entity_Action_1;
    private module.entity.RuleToHuman module_entity_RuleToHuman_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_ExpressionIdentifierCorrectAnswerKB(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file ExpressionIdentifierCorrectAnswerKB.rules
 *
 * @version 01/07/2015
 */
public class ExpressionIdentifierCorrectAnswerKB extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public ExpressionIdentifierCorrectAnswerKB(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public ExpressionIdentifierCorrectAnswerKB() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_ExpressionIdentifierCorrectAnswerKB(this);
    }

}
