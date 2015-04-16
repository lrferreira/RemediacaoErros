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
     * Identifiers of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0
     */
    private String[] identifiers_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0 = {
        "action",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0
     *
     * @return the identifiers declared in rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0
     */
    private String[] getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0() {
         return identifiers_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[1];
    }

    /**
     * Condition 0 of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 1 of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(1));
    }

    /**
     * Condition 2 of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txt3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txt3"));
    }

    /**
     * Condition 3 of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("+")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0_cond_3() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("+"));
    }

    /**
     * Checks whether some conditions of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0_cond(int index) {
        switch (index) {
            case 0: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0_cond_0();
            case 1: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0_cond_1();
            case 2: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0_cond_2();
            case 3: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0_cond_0()) return false;
                if (!correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0_cond_1()) return false;
                if (!correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0_cond_2()) return false;
                if (!correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0_cond_3()) return false;
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
    private boolean checkCondForDeclaration_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0
     */
    private void correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta correta: correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = +\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Meta n� 1 conclu�da!\n");
			System.out.println("Resposta Correta (1) detectada\n");
			module_entity_Action_1.setCorrect(true);
			module_entity_Action_1.setAnswer(new CorrectAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getGoal().setSatisfied(true);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1
     */
    private String[] identifiers_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1 = {
        "action",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1
     *
     * @return the identifiers declared in rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1
     */
    private String[] getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1() {
         return identifiers_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[1];
    }

    /**
     * Condition 0 of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 1 of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(2)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(2));
    }

    /**
     * Condition 2 of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txt8")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txt8"));
    }

    /**
     * Condition 3 of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1_cond_3() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("6"));
    }

    /**
     * Checks whether some conditions of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1_cond(int index) {
        switch (index) {
            case 0: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1_cond_0();
            case 1: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1_cond_1();
            case 2: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1_cond_2();
            case 3: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1_cond_0()) return false;
                if (!correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1_cond_1()) return false;
                if (!correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1_cond_2()) return false;
                if (!correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1_cond_3()) return false;
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
    private boolean checkCondForDeclaration_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1
     */
    private void correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta correta: correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Meta n� 2 conclu�da!\n");
			System.out.println("Resposta Correta (1) detectada\n");
			module_entity_Action_1.setCorrect(true);
			module_entity_Action_1.setAnswer(new CorrectAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getGoal().setSatisfied(true);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2
     */
    private String[] identifiers_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2 = {
        "action",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2
     *
     * @return the identifiers declared in rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2
     */
    private String[] getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2() {
         return identifiers_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[1];
    }

    /**
     * Condition 0 of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 1 of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(3)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(3));
    }

    /**
     * Condition 2 of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().getName().equalsIgnoreCase("txt7")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().getName().equalsIgnoreCase("txt7"));
    }

    /**
     * Condition 3 of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2_cond_3() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("1"));
    }

    /**
     * Checks whether some conditions of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2_cond(int index) {
        switch (index) {
            case 0: return correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2_cond_0();
            case 1: return correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2_cond_1();
            case 2: return correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2_cond_2();
            case 3: return correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2_cond_0()) return false;
                if (!correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2_cond_1()) return false;
                if (!correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2_cond_2()) return false;
                if (!correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2_cond_3()) return false;
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
    private boolean checkCondForDeclaration_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2
     */
    private void correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta correta: correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Meta n� 3 conclu�da!\n");
			System.out.println("Resposta Correta (1) detectada\n");
			module_entity_Action_1.setCorrect(true);
			module_entity_Action_1.setAnswer(new CorrectAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getGoal().setSatisfied(true);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3
     */
    private String[] identifiers_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3 = {
        "action",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3
     *
     * @return the identifiers declared in rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3
     */
    private String[] getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3() {
         return identifiers_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[1];
    }

    /**
     * Condition 0 of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 1 of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(1));
    }

    /**
     * Condition 2 of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt2")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt2"));
    }

    /**
     * Condition 3 of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("2")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3_cond_3() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("2"));
    }

    /**
     * Checks whether some conditions of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3_cond(int index) {
        switch (index) {
            case 0: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3_cond_0();
            case 1: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3_cond_1();
            case 2: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3_cond_2();
            case 3: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3_cond_0()) return false;
                if (!correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3_cond_1()) return false;
                if (!correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3_cond_2()) return false;
                if (!correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3_cond_3()) return false;
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
    private boolean checkCondForDeclaration_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3
     */
    private void correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta correta: correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = 2\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Meta n� 1 conclu�da!\n");
			System.out.println("Resposta Correta (1) detectada\n");
			module_entity_Action_1.setCorrect(true);
			module_entity_Action_1.setAnswer(new CorrectAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getGoal().setSatisfied(true);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4
     */
    private String[] identifiers_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4 = {
        "action",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4
     *
     * @return the identifiers declared in rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4
     */
    private String[] getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4() {
         return identifiers_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[1];
    }

    /**
     * Condition 0 of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 1 of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(2)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(2));
    }

    /**
     * Condition 2 of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt5")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt5"));
    }

    /**
     * Condition 3 of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4_cond_3() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("3"));
    }

    /**
     * Checks whether some conditions of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4_cond(int index) {
        switch (index) {
            case 0: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4_cond_0();
            case 1: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4_cond_1();
            case 2: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4_cond_2();
            case 3: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4_cond_0()) return false;
                if (!correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4_cond_1()) return false;
                if (!correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4_cond_2()) return false;
                if (!correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4_cond_3()) return false;
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
    private boolean checkCondForDeclaration_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4
     */
    private void correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta correta: correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = 3\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Meta n� 2 conclu�da!\n");
			System.out.println("Resposta Correta (1) detectada\n");
			module_entity_Action_1.setCorrect(true);
			module_entity_Action_1.setAnswer(new CorrectAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getGoal().setSatisfied(true);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5
     */
    private String[] identifiers_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5 = {
        "action",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5
     *
     * @return the identifiers declared in rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5
     */
    private String[] getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5() {
         return identifiers_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[1];
    }

    /**
     * Condition 0 of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 1 of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(3)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(3));
    }

    /**
     * Condition 2 of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt8")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt8"));
    }

    /**
     * Condition 3 of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("5")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5_cond_3() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("5"));
    }

    /**
     * Checks whether some conditions of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5_cond(int index) {
        switch (index) {
            case 0: return correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5_cond_0();
            case 1: return correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5_cond_1();
            case 2: return correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5_cond_2();
            case 3: return correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5_cond_0()) return false;
                if (!correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5_cond_1()) return false;
                if (!correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5_cond_2()) return false;
                if (!correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5_cond_3()) return false;
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
    private boolean checkCondForDeclaration_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5
     */
    private void correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta correta: correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = 5\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Meta n� 3 conclu�da!\n");
			System.out.println("Resposta Correta (1) detectada\n");
			module_entity_Action_1.setCorrect(true);
			module_entity_Action_1.setAnswer(new CorrectAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getGoal().setSatisfied(true);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6
     */
    private String[] identifiers_correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6 = {
        "action",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6
     *
     * @return the identifiers declared in rule correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6
     */
    private String[] getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6() {
         return identifiers_correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[1];
    }

    /**
     * Condition 0 of rule correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 1 of rule correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(4)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(4));
    }

    /**
     * Condition 2 of rule correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt7")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt7"));
    }

    /**
     * Condition 3 of rule correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6_cond_3() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("1"));
    }

    /**
     * Checks whether some conditions of rule correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6_cond(int index) {
        switch (index) {
            case 0: return correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6_cond_0();
            case 1: return correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6_cond_1();
            case 2: return correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6_cond_2();
            case 3: return correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6_cond_0()) return false;
                if (!correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6_cond_1()) return false;
                if (!correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6_cond_2()) return false;
                if (!correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6_cond_3()) return false;
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
    private boolean checkCondForDeclaration_correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6
     */
    private void correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta correta: correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Meta n� 4 conclu�da!\n");
			System.out.println("Resposta Correta (1) detectada\n");
			module_entity_Action_1.setCorrect(true);
			module_entity_Action_1.setAnswer(new CorrectAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getGoal().setSatisfied(true);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7
     */
    private String[] identifiers_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7 = {
        "action",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7
     *
     * @return the identifiers declared in rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7
     */
    private String[] getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7() {
         return identifiers_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[1];
    }

    /**
     * Condition 0 of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 1 of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(1));
    }

    /**
     * Condition 2 of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt2")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt2"));
    }

    /**
     * Condition 3 of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("0")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7_cond_3() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("0"));
    }

    /**
     * Checks whether some conditions of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7_cond(int index) {
        switch (index) {
            case 0: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7_cond_0();
            case 1: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7_cond_1();
            case 2: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7_cond_2();
            case 3: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7_cond_0()) return false;
                if (!correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7_cond_1()) return false;
                if (!correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7_cond_2()) return false;
                if (!correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7_cond_3()) return false;
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
    private boolean checkCondForDeclaration_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7
     */
    private void correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta correta: correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = 0\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Meta n� 1 conclu�da!\n");
			System.out.println("Resposta Correta (1) detectada\n");
			module_entity_Action_1.setCorrect(true);
			module_entity_Action_1.setAnswer(new CorrectAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getGoal().setSatisfied(true);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8
     */
    private String[] identifiers_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8 = {
        "action",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8
     *
     * @return the identifiers declared in rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8
     */
    private String[] getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8() {
         return identifiers_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[1];
    }

    /**
     * Condition 0 of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 1 of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(1));
    }

    /**
     * Condition 2 of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt1"));
    }

    /**
     * Condition 3 of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8_cond_3() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("1"));
    }

    /**
     * Checks whether some conditions of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8_cond(int index) {
        switch (index) {
            case 0: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8_cond_0();
            case 1: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8_cond_1();
            case 2: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8_cond_2();
            case 3: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8_cond_0()) return false;
                if (!correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8_cond_1()) return false;
                if (!correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8_cond_2()) return false;
                if (!correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8_cond_3()) return false;
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
    private boolean checkCondForDeclaration_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8
     */
    private void correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta correta: correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = 1\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Meta n� 1 conclu�da!\n");
			System.out.println("Resposta Correta (1) detectada\n");
			module_entity_Action_1.setCorrect(true);
			module_entity_Action_1.setAnswer(new CorrectAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getGoal().setSatisfied(true);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9
     */
    private String[] identifiers_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9 = {
        "action",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9
     *
     * @return the identifiers declared in rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9
     */
    private String[] getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9() {
         return identifiers_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[1];
    }

    /**
     * Condition 0 of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 1 of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(2)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(2));
    }

    /**
     * Condition 2 of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt5")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt5"));
    }

    /**
     * Condition 3 of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9_cond_3() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("6"));
    }

    /**
     * Checks whether some conditions of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9_cond(int index) {
        switch (index) {
            case 0: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9_cond_0();
            case 1: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9_cond_1();
            case 2: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9_cond_2();
            case 3: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9_cond_0()) return false;
                if (!correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9_cond_1()) return false;
                if (!correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9_cond_2()) return false;
                if (!correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9_cond_3()) return false;
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
    private boolean checkCondForDeclaration_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9
     */
    private void correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta correta: correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Meta n� 2 conclu�da!\n");
			System.out.println("Resposta Correta (1) detectada\n");
			module_entity_Action_1.setCorrect(true);
			module_entity_Action_1.setAnswer(new CorrectAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getGoal().setSatisfied(true);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10
     */
    private String[] identifiers_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10 = {
        "action",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10
     *
     * @return the identifiers declared in rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10
     */
    private String[] getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10() {
         return identifiers_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[1];
    }

    /**
     * Condition 0 of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 1 of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(2)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(2));
    }

    /**
     * Condition 2 of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt5")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt5"));
    }

    /**
     * Condition 3 of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10_cond_3() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("6"));
    }

    /**
     * Checks whether some conditions of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10_cond(int index) {
        switch (index) {
            case 0: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10_cond_0();
            case 1: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10_cond_1();
            case 2: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10_cond_2();
            case 3: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10_cond_0()) return false;
                if (!correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10_cond_1()) return false;
                if (!correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10_cond_2()) return false;
                if (!correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10_cond_3()) return false;
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
    private boolean checkCondForDeclaration_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10
     */
    private void correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta correta: correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Meta n� 2 conclu�da!\n");
			System.out.println("Resposta Correta (1) detectada\n");
			module_entity_Action_1.setCorrect(true);
			module_entity_Action_1.setAnswer(new CorrectAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getGoal().setSatisfied(true);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11
     */
    private String[] identifiers_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11 = {
        "action",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11
     *
     * @return the identifiers declared in rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11
     */
    private String[] getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11() {
         return identifiers_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[1];
    }

    /**
     * Condition 0 of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 1 of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(1));
    }

    /**
     * Condition 2 of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt2")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt2"));
    }

    /**
     * Condition 3 of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("0")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11_cond_3() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("0"));
    }

    /**
     * Checks whether some conditions of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11_cond(int index) {
        switch (index) {
            case 0: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11_cond_0();
            case 1: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11_cond_1();
            case 2: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11_cond_2();
            case 3: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11_cond_0()) return false;
                if (!correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11_cond_1()) return false;
                if (!correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11_cond_2()) return false;
                if (!correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11_cond_3()) return false;
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
    private boolean checkCondForDeclaration_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11
     */
    private void correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta correta: correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = 0\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Meta n� 1 conclu�da!\n");
			System.out.println("Resposta Correta (1) detectada\n");
			module_entity_Action_1.setCorrect(true);
			module_entity_Action_1.setAnswer(new CorrectAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getGoal().setSatisfied(true);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12
     */
    private String[] identifiers_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12 = {
        "action",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12
     *
     * @return the identifiers declared in rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12
     */
    private String[] getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12() {
         return identifiers_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[1];
    }

    /**
     * Condition 0 of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 1 of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(2)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(2));
    }

    /**
     * Condition 2 of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt5")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt5"));
    }

    /**
     * Condition 3 of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("6")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12_cond_3() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("6"));
    }

    /**
     * Checks whether some conditions of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12_cond(int index) {
        switch (index) {
            case 0: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12_cond_0();
            case 1: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12_cond_1();
            case 2: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12_cond_2();
            case 3: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12_cond_0()) return false;
                if (!correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12_cond_1()) return false;
                if (!correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12_cond_2()) return false;
                if (!correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12_cond_3()) return false;
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
    private boolean checkCondForDeclaration_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12
     */
    private void correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta correta: correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = 6\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Meta n� 2 conclu�da!\n");
			System.out.println("Resposta Correta (1) detectada\n");
			module_entity_Action_1.setCorrect(true);
			module_entity_Action_1.setAnswer(new CorrectAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getGoal().setSatisfied(true);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }




	
    /**
     * Identifiers of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13
     */
    private String[] identifiers_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13 = {
        "action",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13
     *
     * @return the identifiers declared in rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13
     */
    private String[] getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13() {
         return identifiers_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13(int index) {
        switch (index) {
            case 0: return "module.entity.Action";
            case 1: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13(int index) {
        switch (index) {
            case 0: return module.entity.Action.class;
            case 1: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_Action_1 = (module.entity.Action) value; break;
            case 1: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13(int index) {
        switch (index) {
            case 0: return module_entity_Action_1;
            case 1: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13() {
        return new Object[] {
                            module_entity_Action_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13(Object[] objects) {
        module_entity_Action_1 = (module.entity.Action) objects[0];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[1];
    }

    /**
     * Condition 0 of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getPath().getId().equals(1)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1));
    }

    /**
     * Condition 1 of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(3)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(3));
    }

    /**
     * Condition 2 of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt3"));
    }

    /**
     * Condition 3 of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13.<p>
     * The original expression was:<br>
     * <code>action.getAnswer().getValue().equalsIgnoreCase("+")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13_cond_3() {
        return (module_entity_Action_1.getAnswer().getValue().equalsIgnoreCase("+"));
    }

    /**
     * Checks whether some conditions of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13_cond(int index) {
        switch (index) {
            case 0: return correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13_cond_0();
            case 1: return correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13_cond_1();
            case 2: return correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13_cond_2();
            case 3: return correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13_cond_3();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13_cond_0()) return false;
                if (!correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13_cond_1()) return false;
                if (!correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13_cond_2()) return false;
                if (!correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13_cond_3()) return false;
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
    private boolean checkCondForDeclaration_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13
     */
    private void correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para resposta correta: correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condi��es:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tResposta = +\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Meta n� 3 conclu�da!\n");
			System.out.println("Resposta Correta (1) detectada\n");
			module_entity_Action_1.setCorrect(true);
			module_entity_Action_1.setAnswer(new CorrectAnswer(module_entity_Action_1.getAnswer().getValue()));
			module_entity_Action_1.getGoal().setSatisfied(true);
			modified(module_entity_Action_1);
			modified(module_entity_RuleToHuman_1);
			flush();

	    }



// end_rules
	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0",
        "correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1",
        "correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2",
        "correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3",
        "correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4",
        "correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5",
        "correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6",
        "correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7",
        "correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8",
        "correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9",
        "correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10",
        "correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11",
        "correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12",
        "correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13"
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
            case 0: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0_cond(condIndex);
            case 1: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1_cond(condIndex);
            case 2: return correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2_cond(condIndex);
            case 3: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3_cond(condIndex);
            case 4: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4_cond(condIndex);
            case 5: return correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5_cond(condIndex);
            case 6: return correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6_cond(condIndex);
            case 7: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7_cond(condIndex);
            case 8: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8_cond(condIndex);
            case 9: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9_cond(condIndex);
            case 10: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10_cond(condIndex);
            case 11: return correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11_cond(condIndex);
            case 12: return correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12_cond(condIndex);
            case 13: return correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0(declIndex);
            case 1: return checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1(declIndex);
            case 2: return checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2(declIndex);
            case 3: return checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3(declIndex);
            case 4: return checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4(declIndex);
            case 5: return checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5(declIndex);
            case 6: return checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6(declIndex);
            case 7: return checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7(declIndex);
            case 8: return checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8(declIndex);
            case 9: return checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9(declIndex);
            case 10: return checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10(declIndex);
            case 11: return checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11(declIndex);
            case 12: return checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12(declIndex);
            case 13: return checkConditionsOnlyOf_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13(declIndex);
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
            case 0: return checkCondForDeclaration_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0(declIndex);
            case 1: return checkCondForDeclaration_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1(declIndex);
            case 2: return checkCondForDeclaration_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2(declIndex);
            case 3: return checkCondForDeclaration_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3(declIndex);
            case 4: return checkCondForDeclaration_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4(declIndex);
            case 5: return checkCondForDeclaration_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5(declIndex);
            case 6: return checkCondForDeclaration_correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6(declIndex);
            case 7: return checkCondForDeclaration_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7(declIndex);
            case 8: return checkCondForDeclaration_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8(declIndex);
            case 9: return checkCondForDeclaration_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9(declIndex);
            case 10: return checkCondForDeclaration_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10(declIndex);
            case 11: return checkCondForDeclaration_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11(declIndex);
            case 12: return checkCondForDeclaration_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12(declIndex);
            case 13: return checkCondForDeclaration_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13(declIndex);
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
            case 0: return getDeclaredClassName_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0(declIndex);
            case 1: return getDeclaredClassName_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1(declIndex);
            case 2: return getDeclaredClassName_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2(declIndex);
            case 3: return getDeclaredClassName_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3(declIndex);
            case 4: return getDeclaredClassName_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4(declIndex);
            case 5: return getDeclaredClassName_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5(declIndex);
            case 6: return getDeclaredClassName_correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6(declIndex);
            case 7: return getDeclaredClassName_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7(declIndex);
            case 8: return getDeclaredClassName_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8(declIndex);
            case 9: return getDeclaredClassName_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9(declIndex);
            case 10: return getDeclaredClassName_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10(declIndex);
            case 11: return getDeclaredClassName_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11(declIndex);
            case 12: return getDeclaredClassName_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12(declIndex);
            case 13: return getDeclaredClassName_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13(declIndex);
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
            case 0: return getDeclaredClass_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0(declIndex);
            case 1: return getDeclaredClass_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1(declIndex);
            case 2: return getDeclaredClass_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2(declIndex);
            case 3: return getDeclaredClass_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3(declIndex);
            case 4: return getDeclaredClass_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4(declIndex);
            case 5: return getDeclaredClass_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5(declIndex);
            case 6: return getDeclaredClass_correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6(declIndex);
            case 7: return getDeclaredClass_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7(declIndex);
            case 8: return getDeclaredClass_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8(declIndex);
            case 9: return getDeclaredClass_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9(declIndex);
            case 10: return getDeclaredClass_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10(declIndex);
            case 11: return getDeclaredClass_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11(declIndex);
            case 12: return getDeclaredClass_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12(declIndex);
            case 13: return getDeclaredClass_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13(declIndex);
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
            case 0: correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0(); break;
            case 1: correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1(); break;
            case 2: correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2(); break;
            case 3: correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3(); break;
            case 4: correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4(); break;
            case 5: correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5(); break;
            case 6: correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6(); break;
            case 7: correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7(); break;
            case 8: correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8(); break;
            case 9: correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9(); break;
            case 10: correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10(); break;
            case 11: correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11(); break;
            case 12: correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12(); break;
            case 13: correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 14;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0();
            case 1: return getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1();
            case 2: return getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2();
            case 3: return getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3();
            case 4: return getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4();
            case 5: return getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5();
            case 6: return getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6();
            case 7: return getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7();
            case 8: return getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8();
            case 9: return getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9();
            case 10: return getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10();
            case 11: return getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11();
            case 12: return getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12();
            case 13: return getDeclaredIdentifiers_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13();
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
            case 0: setObject_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0(declIndex, value); break;
            case 1: setObject_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1(declIndex, value); break;
            case 2: setObject_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2(declIndex, value); break;
            case 3: setObject_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3(declIndex, value); break;
            case 4: setObject_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4(declIndex, value); break;
            case 5: setObject_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5(declIndex, value); break;
            case 6: setObject_correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6(declIndex, value); break;
            case 7: setObject_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7(declIndex, value); break;
            case 8: setObject_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8(declIndex, value); break;
            case 9: setObject_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9(declIndex, value); break;
            case 10: setObject_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10(declIndex, value); break;
            case 11: setObject_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11(declIndex, value); break;
            case 12: setObject_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12(declIndex, value); break;
            case 13: setObject_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13(declIndex, value); break;
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
            case 0: return getObject_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0(declIndex);
            case 1: return getObject_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1(declIndex);
            case 2: return getObject_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2(declIndex);
            case 3: return getObject_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3(declIndex);
            case 4: return getObject_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4(declIndex);
            case 5: return getObject_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5(declIndex);
            case 6: return getObject_correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6(declIndex);
            case 7: return getObject_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7(declIndex);
            case 8: return getObject_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8(declIndex);
            case 9: return getObject_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9(declIndex);
            case 10: return getObject_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10(declIndex);
            case 11: return getObject_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11(declIndex);
            case 12: return getObject_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12(declIndex);
            case 13: return getObject_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13(declIndex);
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
            case 0: return getObjects_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0();
            case 1: return getObjects_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1();
            case 2: return getObjects_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2();
            case 3: return getObjects_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3();
            case 4: return getObjects_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4();
            case 5: return getObjects_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5();
            case 6: return getObjects_correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6();
            case 7: return getObjects_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7();
            case 8: return getObjects_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8();
            case 9: return getObjects_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9();
            case 10: return getObjects_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10();
            case 11: return getObjects_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11();
            case 12: return getObjects_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12();
            case 13: return getObjects_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13();
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
            case 0: setObjects_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0(objects); break;
            case 1: setObjects_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1(objects); break;
            case 2: setObjects_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2(objects); break;
            case 3: setObjects_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_3(objects); break;
            case 4: setObjects_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_4(objects); break;
            case 5: setObjects_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt8_5(objects); break;
            case 6: setObjects_correctAnswer_PATH_1_GOAL_4_COMPONENT_txt7_6(objects); break;
            case 7: setObjects_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_7(objects); break;
            case 8: setObjects_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt1_8(objects); break;
            case 9: setObjects_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_9(objects); break;
            case 10: setObjects_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_10(objects); break;
            case 11: setObjects_correctAnswer_PATH_1_GOAL_1_COMPONENT_txt2_11(objects); break;
            case 12: setObjects_correctAnswer_PATH_1_GOAL_2_COMPONENT_txt5_12(objects); break;
            case 13: setObjects_correctAnswer_PATH_1_GOAL_3_COMPONENT_txt3_13(objects); break;
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
 * @version 16/04/2015
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
