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
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 1 of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(1L));
    }

    /**
     * Condition 2 of rule correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt3"));
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


// -rule-end- 


	
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
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 1 of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(2L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(2L));
    }

    /**
     * Condition 2 of rule correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt8")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt8"));
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


// -rule-end- 


	
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
     * <code>action.getGoal().getPath().getId().equals(1L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2_cond_0() {
        return (module_entity_Action_1.getGoal().getPath().getId().equals(1L));
    }

    /**
     * Condition 1 of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getId().equals(3L)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2_cond_1() {
        return (module_entity_Action_1.getGoal().getId().equals(3L));
    }

    /**
     * Condition 2 of rule correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2.<p>
     * The original expression was:<br>
     * <code>action.getGoal().getComponent().equalsIgnoreCase("txt7")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2_cond_2() {
        return (module_entity_Action_1.getGoal().getComponent().equalsIgnoreCase("txt7"));
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


// -rule-end- 

// end_rules
	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "correctAnswer_PATH_1_GOAL_1_COMPONENT_txt3_0",
        "correctAnswer_PATH_1_GOAL_2_COMPONENT_txt8_1",
        "correctAnswer_PATH_1_GOAL_3_COMPONENT_txt7_2"
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
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 3;
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
 * @version 19/04/2015
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
