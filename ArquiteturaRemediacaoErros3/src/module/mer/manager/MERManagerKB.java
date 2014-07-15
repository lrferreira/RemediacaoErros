package module.mer.manager;
import module.entity.Historic;
import module.entity.WrongAnswer;
import util.Constants;
import module.entity.MERFunction;
import module.entity.MultipleExternalRepresentation;
import module.entity.RuleToHuman;
import java.util.ArrayList;

 class Jeops_RuleBase_MERManagerKB extends jeops.AbstractRuleBase {



	
    /**
     * Identifiers of rule ruleMRE_0
     */
    private String[] identifiers_ruleMRE_0 = {
        "wrongAnswer",
        "merFunction",
        "mer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMRE_0
     *
     * @return the identifiers declared in rule ruleMRE_0
     */
    private String[] getDeclaredIdentifiers_ruleMRE_0() {
         return identifiers_ruleMRE_0;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMRE_0.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMRE_0(int index) {
        switch (index) {
            case 0: return "module.entity.WrongAnswer";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.MultipleExternalRepresentation";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMRE_0.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMRE_0(int index) {
        switch (index) {
            case 0: return module.entity.WrongAnswer.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.MultipleExternalRepresentation.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMRE_0.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMRE_0(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMRE_0.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMRE_0(int index) {
        switch (index) {
            case 0: return module_entity_WrongAnswer_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_MultipleExternalRepresentation_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMRE_0
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMRE_0() {
        return new Object[] {
                            module_entity_WrongAnswer_1,
                            module_entity_MERFunction_1,
                            module_entity_MultipleExternalRepresentation_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMRE_0
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMRE_0(Object[] objects) {
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMRE_0.<p>
     * The original expression was:<br>
     * <code>merFunction.getType() == 12</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_0_cond_0() {
        return (module_entity_MERFunction_1.getType() == 12);
    }

    /**
     * Condition 1 of rule ruleMRE_0.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getType() == 2</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_0_cond_1() {
        return (module_entity_WrongAnswer_1.getType() == 2);
    }

    /**
     * Checks whether some conditions of rule ruleMRE_0 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_0_cond(int index) {
        switch (index) {
            case 0: return ruleMRE_0_cond_0();
            case 1: return ruleMRE_0_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMRE_0 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMRE_0(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMRE_0_cond_1()) return false;
                return true;
            case 1:
                if (!ruleMRE_0_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMRE_0(int declIndex) {
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
     * Executes the action part of the rule ruleMRE_0
     */
    private void ruleMRE_0() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMRE_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Função de MRE = Restrição de Interpretação\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = Diretamente Identificável - Deficiência no Domínio\n");
			module_entity_MultipleExternalRepresentation_1.setId(1);
			module_entity_MultipleExternalRepresentation_1.setDescricao("Figura de Pedro e Helena mostrando pontos de interrogação e o esqueleto da operação que se espera do aluno");
			module_entity_MultipleExternalRepresentation_1.setImageName("diretamente_identificavel_deficiencia_dominio.png");
			modified(module_entity_MultipleExternalRepresentation_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibição de MRE 1 - Figura de Pedro e Helena mostrando pontos de interrogação e o esqueleto da operação que se espera do aluno");
			flush();

	    }




	
    /**
     * Identifiers of rule ruleMRE_1
     */
    private String[] identifiers_ruleMRE_1 = {
        "wrongAnswer",
        "merFunction",
        "mer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMRE_1
     *
     * @return the identifiers declared in rule ruleMRE_1
     */
    private String[] getDeclaredIdentifiers_ruleMRE_1() {
         return identifiers_ruleMRE_1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMRE_1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMRE_1(int index) {
        switch (index) {
            case 0: return "module.entity.WrongAnswer";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.MultipleExternalRepresentation";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMRE_1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMRE_1(int index) {
        switch (index) {
            case 0: return module.entity.WrongAnswer.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.MultipleExternalRepresentation.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMRE_1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMRE_1(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMRE_1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMRE_1(int index) {
        switch (index) {
            case 0: return module_entity_WrongAnswer_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_MultipleExternalRepresentation_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMRE_1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMRE_1() {
        return new Object[] {
                            module_entity_WrongAnswer_1,
                            module_entity_MERFunction_1,
                            module_entity_MultipleExternalRepresentation_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMRE_1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMRE_1(Object[] objects) {
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMRE_1.<p>
     * The original expression was:<br>
     * <code>merFunction.getType() == 12</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_1_cond_0() {
        return (module_entity_MERFunction_1.getType() == 12);
    }

    /**
     * Condition 1 of rule ruleMRE_1.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getType() == 2</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_1_cond_1() {
        return (module_entity_WrongAnswer_1.getType() == 2);
    }

    /**
     * Checks whether some conditions of rule ruleMRE_1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_1_cond(int index) {
        switch (index) {
            case 0: return ruleMRE_1_cond_0();
            case 1: return ruleMRE_1_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMRE_1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMRE_1(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMRE_1_cond_1()) return false;
                return true;
            case 1:
                if (!ruleMRE_1_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMRE_1(int declIndex) {
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
     * Executes the action part of the rule ruleMRE_1
     */
    private void ruleMRE_1() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMRE_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Função de MRE = Restrição de Interpretação\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = Diretamente Identificável - Deficiência no Domínio\n");
			module_entity_MultipleExternalRepresentation_1.setId(2);
			module_entity_MultipleExternalRepresentation_1.setDescricao("Figura de Pedro e Helena mostrando pontos de interrogação e o esqueleto da operação que se espera do aluno");
			module_entity_MultipleExternalRepresentation_1.setImageName("diretamente_identificavel_deficiencia_dominio.png");
			modified(module_entity_MultipleExternalRepresentation_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibição de MRE 2 - Figura de Pedro e Helena mostrando pontos de interrogação e o esqueleto da operação que se espera do aluno");
			flush();

	    }




	
    /**
     * Identifiers of rule ruleMRE_2
     */
    private String[] identifiers_ruleMRE_2 = {
        "wrongAnswer",
        "merFunction",
        "mer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMRE_2
     *
     * @return the identifiers declared in rule ruleMRE_2
     */
    private String[] getDeclaredIdentifiers_ruleMRE_2() {
         return identifiers_ruleMRE_2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMRE_2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMRE_2(int index) {
        switch (index) {
            case 0: return "module.entity.WrongAnswer";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.MultipleExternalRepresentation";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMRE_2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMRE_2(int index) {
        switch (index) {
            case 0: return module.entity.WrongAnswer.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.MultipleExternalRepresentation.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMRE_2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMRE_2(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMRE_2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMRE_2(int index) {
        switch (index) {
            case 0: return module_entity_WrongAnswer_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_MultipleExternalRepresentation_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMRE_2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMRE_2() {
        return new Object[] {
                            module_entity_WrongAnswer_1,
                            module_entity_MERFunction_1,
                            module_entity_MultipleExternalRepresentation_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMRE_2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMRE_2(Object[] objects) {
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMRE_2.<p>
     * The original expression was:<br>
     * <code>merFunction.getType() == 12</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_2_cond_0() {
        return (module_entity_MERFunction_1.getType() == 12);
    }

    /**
     * Condition 1 of rule ruleMRE_2.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getType() == 2</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_2_cond_1() {
        return (module_entity_WrongAnswer_1.getType() == 2);
    }

    /**
     * Checks whether some conditions of rule ruleMRE_2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_2_cond(int index) {
        switch (index) {
            case 0: return ruleMRE_2_cond_0();
            case 1: return ruleMRE_2_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMRE_2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMRE_2(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMRE_2_cond_1()) return false;
                return true;
            case 1:
                if (!ruleMRE_2_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMRE_2(int declIndex) {
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
     * Executes the action part of the rule ruleMRE_2
     */
    private void ruleMRE_2() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMRE_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Função de MRE = Restrição de Interpretação\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = Diretamente Identificável - Deficiência no Domínio\n");
			module_entity_MultipleExternalRepresentation_1.setId(3);
			module_entity_MultipleExternalRepresentation_1.setDescricao("Figura de Pedro e Helena mostrando pontos de interrogação e o esqueleto da operação que se espera do aluno");
			module_entity_MultipleExternalRepresentation_1.setImageName("diretamente_identificavel_deficiencia_dominio.png");
			modified(module_entity_MultipleExternalRepresentation_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibição de MRE 3 - Figura de Pedro e Helena mostrando pontos de interrogação e o esqueleto da operação que se espera do aluno");
			flush();

	    }




	
    /**
     * Identifiers of rule ruleMRE_3
     */
    private String[] identifiers_ruleMRE_3 = {
        "wrongAnswer",
        "merFunction",
        "mer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMRE_3
     *
     * @return the identifiers declared in rule ruleMRE_3
     */
    private String[] getDeclaredIdentifiers_ruleMRE_3() {
         return identifiers_ruleMRE_3;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMRE_3.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMRE_3(int index) {
        switch (index) {
            case 0: return "module.entity.WrongAnswer";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.MultipleExternalRepresentation";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMRE_3.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMRE_3(int index) {
        switch (index) {
            case 0: return module.entity.WrongAnswer.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.MultipleExternalRepresentation.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMRE_3.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMRE_3(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMRE_3.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMRE_3(int index) {
        switch (index) {
            case 0: return module_entity_WrongAnswer_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_MultipleExternalRepresentation_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMRE_3
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMRE_3() {
        return new Object[] {
                            module_entity_WrongAnswer_1,
                            module_entity_MERFunction_1,
                            module_entity_MultipleExternalRepresentation_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMRE_3
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMRE_3(Object[] objects) {
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMRE_3.<p>
     * The original expression was:<br>
     * <code>merFunction.getType() == 12</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_3_cond_0() {
        return (module_entity_MERFunction_1.getType() == 12);
    }

    /**
     * Condition 1 of rule ruleMRE_3.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getType() == 2</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_3_cond_1() {
        return (module_entity_WrongAnswer_1.getType() == 2);
    }

    /**
     * Checks whether some conditions of rule ruleMRE_3 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_3_cond(int index) {
        switch (index) {
            case 0: return ruleMRE_3_cond_0();
            case 1: return ruleMRE_3_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMRE_3 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMRE_3(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMRE_3_cond_1()) return false;
                return true;
            case 1:
                if (!ruleMRE_3_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMRE_3(int declIndex) {
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
     * Executes the action part of the rule ruleMRE_3
     */
    private void ruleMRE_3() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMRE_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Função de MRE = Restrição de Interpretação\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = Diretamente Identificável - Deficiência no Domínio\n");
			module_entity_MultipleExternalRepresentation_1.setId(4);
			module_entity_MultipleExternalRepresentation_1.setDescricao("Figura de Pedro e Helena mostrando pontos de interrogação e o esqueleto da operação que se espera do aluno");
			module_entity_MultipleExternalRepresentation_1.setImageName("diretamente_identificavel_deficiencia_dominio.png");
			modified(module_entity_MultipleExternalRepresentation_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibição de MRE 4 - Figura de Pedro e Helena mostrando pontos de interrogação e o esqueleto da operação que se espera do aluno");
			flush();

	    }




	
    /**
     * Identifiers of rule ruleMRE_4
     */
    private String[] identifiers_ruleMRE_4 = {
        "wrongAnswer",
        "merFunction",
        "mer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMRE_4
     *
     * @return the identifiers declared in rule ruleMRE_4
     */
    private String[] getDeclaredIdentifiers_ruleMRE_4() {
         return identifiers_ruleMRE_4;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMRE_4.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMRE_4(int index) {
        switch (index) {
            case 0: return "module.entity.WrongAnswer";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.MultipleExternalRepresentation";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMRE_4.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMRE_4(int index) {
        switch (index) {
            case 0: return module.entity.WrongAnswer.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.MultipleExternalRepresentation.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMRE_4.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMRE_4(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMRE_4.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMRE_4(int index) {
        switch (index) {
            case 0: return module_entity_WrongAnswer_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_MultipleExternalRepresentation_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMRE_4
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMRE_4() {
        return new Object[] {
                            module_entity_WrongAnswer_1,
                            module_entity_MERFunction_1,
                            module_entity_MultipleExternalRepresentation_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMRE_4
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMRE_4(Object[] objects) {
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMRE_4.<p>
     * The original expression was:<br>
     * <code>merFunction.getType() == 13</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_4_cond_0() {
        return (module_entity_MERFunction_1.getType() == 13);
    }

    /**
     * Condition 1 of rule ruleMRE_4.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getType() == 4</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_4_cond_1() {
        return (module_entity_WrongAnswer_1.getType() == 4);
    }

    /**
     * Checks whether some conditions of rule ruleMRE_4 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_4_cond(int index) {
        switch (index) {
            case 0: return ruleMRE_4_cond_0();
            case 1: return ruleMRE_4_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMRE_4 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMRE_4(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMRE_4_cond_1()) return false;
                return true;
            case 1:
                if (!ruleMRE_4_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMRE_4(int declIndex) {
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
     * Executes the action part of the rule ruleMRE_4
     */
    private void ruleMRE_4() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMRE_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Função de MRE = Compreensão Mais Aprofundada\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = Diretamente Identificável - Deficiência na Escolha do Operador\n");
			module_entity_MultipleExternalRepresentation_1.setId(5);
			module_entity_MultipleExternalRepresentation_1.setDescricao("Figura procurando mostrar que Helena possui mais laranjas que Pedro");
			module_entity_MultipleExternalRepresentation_1.setImageName("diretamente_identificavel_deficiencia_escolha_operador.png");
			modified(module_entity_MultipleExternalRepresentation_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibição de MRE 5 - Figura procurando mostrar que Helena possui mais laranjas que Pedro");
			flush();

	    }




	
    /**
     * Identifiers of rule ruleMRE_5
     */
    private String[] identifiers_ruleMRE_5 = {
        "wrongAnswer",
        "merFunction",
        "mer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMRE_5
     *
     * @return the identifiers declared in rule ruleMRE_5
     */
    private String[] getDeclaredIdentifiers_ruleMRE_5() {
         return identifiers_ruleMRE_5;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMRE_5.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMRE_5(int index) {
        switch (index) {
            case 0: return "module.entity.WrongAnswer";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.MultipleExternalRepresentation";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMRE_5.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMRE_5(int index) {
        switch (index) {
            case 0: return module.entity.WrongAnswer.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.MultipleExternalRepresentation.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMRE_5.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMRE_5(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMRE_5.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMRE_5(int index) {
        switch (index) {
            case 0: return module_entity_WrongAnswer_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_MultipleExternalRepresentation_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMRE_5
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMRE_5() {
        return new Object[] {
                            module_entity_WrongAnswer_1,
                            module_entity_MERFunction_1,
                            module_entity_MultipleExternalRepresentation_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMRE_5
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMRE_5(Object[] objects) {
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMRE_5.<p>
     * The original expression was:<br>
     * <code>merFunction.getType() == 13</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_5_cond_0() {
        return (module_entity_MERFunction_1.getType() == 13);
    }

    /**
     * Condition 1 of rule ruleMRE_5.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getType() == 3</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_5_cond_1() {
        return (module_entity_WrongAnswer_1.getType() == 3);
    }

    /**
     * Checks whether some conditions of rule ruleMRE_5 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_5_cond(int index) {
        switch (index) {
            case 0: return ruleMRE_5_cond_0();
            case 1: return ruleMRE_5_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMRE_5 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMRE_5(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMRE_5_cond_1()) return false;
                return true;
            case 1:
                if (!ruleMRE_5_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMRE_5(int declIndex) {
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
     * Executes the action part of the rule ruleMRE_5
     */
    private void ruleMRE_5() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMRE_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Função de MRE = Compreensão Mais Aprofundada\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = Diretamente Identificável - Deficiência na Regra\n");
			module_entity_MultipleExternalRepresentation_1.setId(6);
			module_entity_MultipleExternalRepresentation_1.setDescricao("Figura apresentando a quantidade de laranjas que cada pessoa possui");
			module_entity_MultipleExternalRepresentation_1.setImageName("diretamente_identificavel_deficiencia_regra.png");
			modified(module_entity_MultipleExternalRepresentation_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibição de MRE 6 - Figura apresentando a quantidade de laranjas que cada pessoa possui");
			flush();

	    }




	
    /**
     * Identifiers of rule ruleMRE_6
     */
    private String[] identifiers_ruleMRE_6 = {
        "wrongAnswer",
        "merFunction",
        "mer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMRE_6
     *
     * @return the identifiers declared in rule ruleMRE_6
     */
    private String[] getDeclaredIdentifiers_ruleMRE_6() {
         return identifiers_ruleMRE_6;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMRE_6.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMRE_6(int index) {
        switch (index) {
            case 0: return "module.entity.WrongAnswer";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.MultipleExternalRepresentation";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMRE_6.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMRE_6(int index) {
        switch (index) {
            case 0: return module.entity.WrongAnswer.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.MultipleExternalRepresentation.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMRE_6.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMRE_6(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMRE_6.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMRE_6(int index) {
        switch (index) {
            case 0: return module_entity_WrongAnswer_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_MultipleExternalRepresentation_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMRE_6
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMRE_6() {
        return new Object[] {
                            module_entity_WrongAnswer_1,
                            module_entity_MERFunction_1,
                            module_entity_MultipleExternalRepresentation_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMRE_6
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMRE_6(Object[] objects) {
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMRE_6.<p>
     * The original expression was:<br>
     * <code>merFunction.getType() == 12</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_6_cond_0() {
        return (module_entity_MERFunction_1.getType() == 12);
    }

    /**
     * Condition 1 of rule ruleMRE_6.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getType() == 5</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_6_cond_1() {
        return (module_entity_WrongAnswer_1.getType() == 5);
    }

    /**
     * Checks whether some conditions of rule ruleMRE_6 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_6_cond(int index) {
        switch (index) {
            case 0: return ruleMRE_6_cond_0();
            case 1: return ruleMRE_6_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMRE_6 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMRE_6(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMRE_6_cond_1()) return false;
                return true;
            case 1:
                if (!ruleMRE_6_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMRE_6(int declIndex) {
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
     * Executes the action part of the rule ruleMRE_6
     */
    private void ruleMRE_6() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMRE_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Função de MRE = Restrição de Interpretação\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = Indiretamente Identificável\n");
			module_entity_MultipleExternalRepresentation_1.setId(7);
			module_entity_MultipleExternalRepresentation_1.setDescricao("Figura destacando que Helena possui mais laranjas que o indicado no cesto");
			module_entity_MultipleExternalRepresentation_1.setImageName("indiretamente_identificavel.png");
			modified(module_entity_MultipleExternalRepresentation_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibição de MRE 7 - Figura destacando que Helena possui mais laranjas que o indicado no cesto");
			flush();

	    }




	
    /**
     * Identifiers of rule ruleMRE_7
     */
    private String[] identifiers_ruleMRE_7 = {
        "wrongAnswer",
        "merFunction",
        "mer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMRE_7
     *
     * @return the identifiers declared in rule ruleMRE_7
     */
    private String[] getDeclaredIdentifiers_ruleMRE_7() {
         return identifiers_ruleMRE_7;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMRE_7.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMRE_7(int index) {
        switch (index) {
            case 0: return "module.entity.WrongAnswer";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.MultipleExternalRepresentation";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMRE_7.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMRE_7(int index) {
        switch (index) {
            case 0: return module.entity.WrongAnswer.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.MultipleExternalRepresentation.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMRE_7.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMRE_7(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMRE_7.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMRE_7(int index) {
        switch (index) {
            case 0: return module_entity_WrongAnswer_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_MultipleExternalRepresentation_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMRE_7
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMRE_7() {
        return new Object[] {
                            module_entity_WrongAnswer_1,
                            module_entity_MERFunction_1,
                            module_entity_MultipleExternalRepresentation_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMRE_7
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMRE_7(Object[] objects) {
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMRE_7.<p>
     * The original expression was:<br>
     * <code>merFunction.getType() == 11</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_7_cond_0() {
        return (module_entity_MERFunction_1.getType() == 11);
    }

    /**
     * Condition 1 of rule ruleMRE_7.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getType() == 1</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_7_cond_1() {
        return (module_entity_WrongAnswer_1.getType() == 1);
    }

    /**
     * Checks whether some conditions of rule ruleMRE_7 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_7_cond(int index) {
        switch (index) {
            case 0: return ruleMRE_7_cond_0();
            case 1: return ruleMRE_7_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMRE_7 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMRE_7(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMRE_7_cond_1()) return false;
                return true;
            case 1:
                if (!ruleMRE_7_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMRE_7(int declIndex) {
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
     * Executes the action part of the rule ruleMRE_7
     */
    private void ruleMRE_7() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMRE_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Função de MRE = Papéis Complementares\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = Interpretação Equivocada\n");
			module_entity_MultipleExternalRepresentation_1.setId(8);
			module_entity_MultipleExternalRepresentation_1.setDescricao("Figura enumerando as laranjas extras que Helena possui, para o aluno poder identificar a quantidade exata de laranjas que ela possui");
			module_entity_MultipleExternalRepresentation_1.setImageName("interpretacao_equivocada.png");
			modified(module_entity_MultipleExternalRepresentation_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibição de MRE 8 - Figura enumerando as laranjas extras que Helena possui, para o aluno poder identificar a quantidade exata de laranjas que ela possui");
			flush();

	    }




	
    /**
     * Identifiers of rule ruleMRE_8
     */
    private String[] identifiers_ruleMRE_8 = {
        "wrongAnswer",
        "merFunction",
        "mer",
        "ruleToHuman"
    };

    /**
     * Returns the identifiers declared in rule ruleMRE_8
     *
     * @return the identifiers declared in rule ruleMRE_8
     */
    private String[] getDeclaredIdentifiers_ruleMRE_8() {
         return identifiers_ruleMRE_8;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule ruleMRE_8.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_ruleMRE_8(int index) {
        switch (index) {
            case 0: return "module.entity.WrongAnswer";
            case 1: return "module.entity.MERFunction";
            case 2: return "module.entity.MultipleExternalRepresentation";
            case 3: return "module.entity.RuleToHuman";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule ruleMRE_8.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_ruleMRE_8(int index) {
        switch (index) {
            case 0: return module.entity.WrongAnswer.class;
            case 1: return module.entity.MERFunction.class;
            case 2: return module.entity.MultipleExternalRepresentation.class;
            case 3: return module.entity.RuleToHuman.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule ruleMRE_8.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_ruleMRE_8(int index, Object value) {
        switch (index) {
            case 0: this.module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) value; break;
            case 1: this.module_entity_MERFunction_1 = (module.entity.MERFunction) value; break;
            case 2: this.module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) value; break;
            case 3: this.module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) value; break;
        }
    }

    /**
     * Returns an object declared in the rule ruleMRE_8.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_ruleMRE_8(int index) {
        switch (index) {
            case 0: return module_entity_WrongAnswer_1;
            case 1: return module_entity_MERFunction_1;
            case 2: return module_entity_MultipleExternalRepresentation_1;
            case 3: return module_entity_RuleToHuman_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule ruleMRE_8
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_ruleMRE_8() {
        return new Object[] {
                            module_entity_WrongAnswer_1,
                            module_entity_MERFunction_1,
                            module_entity_MultipleExternalRepresentation_1,
                            module_entity_RuleToHuman_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule ruleMRE_8
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_ruleMRE_8(Object[] objects) {
        module_entity_WrongAnswer_1 = (module.entity.WrongAnswer) objects[0];
        module_entity_MERFunction_1 = (module.entity.MERFunction) objects[1];
        module_entity_MultipleExternalRepresentation_1 = (module.entity.MultipleExternalRepresentation) objects[2];
        module_entity_RuleToHuman_1 = (module.entity.RuleToHuman) objects[3];
    }

    /**
     * Condition 0 of rule ruleMRE_8.<p>
     * The original expression was:<br>
     * <code>merFunction.getType() == 13</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_8_cond_0() {
        return (module_entity_MERFunction_1.getType() == 13);
    }

    /**
     * Condition 1 of rule ruleMRE_8.<p>
     * The original expression was:<br>
     * <code>wrongAnswer.getType() == 6</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_8_cond_1() {
        return (module_entity_WrongAnswer_1.getType() == 6);
    }

    /**
     * Checks whether some conditions of rule ruleMRE_8 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean ruleMRE_8_cond(int index) {
        switch (index) {
            case 0: return ruleMRE_8_cond_0();
            case 1: return ruleMRE_8_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule ruleMRE_8 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_ruleMRE_8(int declIndex) {
        switch (declIndex) {
            case 0:
                if (!ruleMRE_8_cond_1()) return false;
                return true;
            case 1:
                if (!ruleMRE_8_cond_0()) return false;
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
    private boolean checkCondForDeclaration_ruleMRE_8(int declIndex) {
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
     * Executes the action part of the rule ruleMRE_8
     */
    private void ruleMRE_8() {
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "Regra acionada para selecionar a MRE: ruleMRE_ \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + " Condições:  \n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Função de MRE = Compreensão Mais Aprofundada\n");
			module_entity_RuleToHuman_1.setDescription(module_entity_RuleToHuman_1.getDescription() + "\tTipo de Erro = Solução Não Categorizável\n");
			module_entity_MultipleExternalRepresentation_1.setId(9);
			module_entity_MultipleExternalRepresentation_1.setDescricao("Texto exibindo os principais conceitos aritméticos para retomar a base conceitual do aprendiz");
			module_entity_MultipleExternalRepresentation_1.setImageName("compreensao_aprofundada.png");
			modified(module_entity_MultipleExternalRepresentation_1);
			modified(module_entity_RuleToHuman_1);
			System.out.println("Exibição de MRE 9 - Texto exibindo os principais conceitos aritméticos para retomar a base conceitual do aprendiz");
			flush();

	    }



// end_rules
	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "ruleMRE_0",
        "ruleMRE_1",
        "ruleMRE_2",
        "ruleMRE_3",
        "ruleMRE_4",
        "ruleMRE_5",
        "ruleMRE_6",
        "ruleMRE_7",
        "ruleMRE_8"
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
            case 0: return ruleMRE_0_cond(condIndex);
            case 1: return ruleMRE_1_cond(condIndex);
            case 2: return ruleMRE_2_cond(condIndex);
            case 3: return ruleMRE_3_cond(condIndex);
            case 4: return ruleMRE_4_cond(condIndex);
            case 5: return ruleMRE_5_cond(condIndex);
            case 6: return ruleMRE_6_cond(condIndex);
            case 7: return ruleMRE_7_cond(condIndex);
            case 8: return ruleMRE_8_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_ruleMRE_0(declIndex);
            case 1: return checkConditionsOnlyOf_ruleMRE_1(declIndex);
            case 2: return checkConditionsOnlyOf_ruleMRE_2(declIndex);
            case 3: return checkConditionsOnlyOf_ruleMRE_3(declIndex);
            case 4: return checkConditionsOnlyOf_ruleMRE_4(declIndex);
            case 5: return checkConditionsOnlyOf_ruleMRE_5(declIndex);
            case 6: return checkConditionsOnlyOf_ruleMRE_6(declIndex);
            case 7: return checkConditionsOnlyOf_ruleMRE_7(declIndex);
            case 8: return checkConditionsOnlyOf_ruleMRE_8(declIndex);
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
            case 0: return checkCondForDeclaration_ruleMRE_0(declIndex);
            case 1: return checkCondForDeclaration_ruleMRE_1(declIndex);
            case 2: return checkCondForDeclaration_ruleMRE_2(declIndex);
            case 3: return checkCondForDeclaration_ruleMRE_3(declIndex);
            case 4: return checkCondForDeclaration_ruleMRE_4(declIndex);
            case 5: return checkCondForDeclaration_ruleMRE_5(declIndex);
            case 6: return checkCondForDeclaration_ruleMRE_6(declIndex);
            case 7: return checkCondForDeclaration_ruleMRE_7(declIndex);
            case 8: return checkCondForDeclaration_ruleMRE_8(declIndex);
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
            case 0: return getDeclaredClassName_ruleMRE_0(declIndex);
            case 1: return getDeclaredClassName_ruleMRE_1(declIndex);
            case 2: return getDeclaredClassName_ruleMRE_2(declIndex);
            case 3: return getDeclaredClassName_ruleMRE_3(declIndex);
            case 4: return getDeclaredClassName_ruleMRE_4(declIndex);
            case 5: return getDeclaredClassName_ruleMRE_5(declIndex);
            case 6: return getDeclaredClassName_ruleMRE_6(declIndex);
            case 7: return getDeclaredClassName_ruleMRE_7(declIndex);
            case 8: return getDeclaredClassName_ruleMRE_8(declIndex);
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
            case 0: return getDeclaredClass_ruleMRE_0(declIndex);
            case 1: return getDeclaredClass_ruleMRE_1(declIndex);
            case 2: return getDeclaredClass_ruleMRE_2(declIndex);
            case 3: return getDeclaredClass_ruleMRE_3(declIndex);
            case 4: return getDeclaredClass_ruleMRE_4(declIndex);
            case 5: return getDeclaredClass_ruleMRE_5(declIndex);
            case 6: return getDeclaredClass_ruleMRE_6(declIndex);
            case 7: return getDeclaredClass_ruleMRE_7(declIndex);
            case 8: return getDeclaredClass_ruleMRE_8(declIndex);
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
            case 0: ruleMRE_0(); break;
            case 1: ruleMRE_1(); break;
            case 2: ruleMRE_2(); break;
            case 3: ruleMRE_3(); break;
            case 4: ruleMRE_4(); break;
            case 5: ruleMRE_5(); break;
            case 6: ruleMRE_6(); break;
            case 7: ruleMRE_7(); break;
            case 8: ruleMRE_8(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 9;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_ruleMRE_0();
            case 1: return getDeclaredIdentifiers_ruleMRE_1();
            case 2: return getDeclaredIdentifiers_ruleMRE_2();
            case 3: return getDeclaredIdentifiers_ruleMRE_3();
            case 4: return getDeclaredIdentifiers_ruleMRE_4();
            case 5: return getDeclaredIdentifiers_ruleMRE_5();
            case 6: return getDeclaredIdentifiers_ruleMRE_6();
            case 7: return getDeclaredIdentifiers_ruleMRE_7();
            case 8: return getDeclaredIdentifiers_ruleMRE_8();
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
            case 0: setObject_ruleMRE_0(declIndex, value); break;
            case 1: setObject_ruleMRE_1(declIndex, value); break;
            case 2: setObject_ruleMRE_2(declIndex, value); break;
            case 3: setObject_ruleMRE_3(declIndex, value); break;
            case 4: setObject_ruleMRE_4(declIndex, value); break;
            case 5: setObject_ruleMRE_5(declIndex, value); break;
            case 6: setObject_ruleMRE_6(declIndex, value); break;
            case 7: setObject_ruleMRE_7(declIndex, value); break;
            case 8: setObject_ruleMRE_8(declIndex, value); break;
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
            case 0: return getObject_ruleMRE_0(declIndex);
            case 1: return getObject_ruleMRE_1(declIndex);
            case 2: return getObject_ruleMRE_2(declIndex);
            case 3: return getObject_ruleMRE_3(declIndex);
            case 4: return getObject_ruleMRE_4(declIndex);
            case 5: return getObject_ruleMRE_5(declIndex);
            case 6: return getObject_ruleMRE_6(declIndex);
            case 7: return getObject_ruleMRE_7(declIndex);
            case 8: return getObject_ruleMRE_8(declIndex);
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
            case 0: return getObjects_ruleMRE_0();
            case 1: return getObjects_ruleMRE_1();
            case 2: return getObjects_ruleMRE_2();
            case 3: return getObjects_ruleMRE_3();
            case 4: return getObjects_ruleMRE_4();
            case 5: return getObjects_ruleMRE_5();
            case 6: return getObjects_ruleMRE_6();
            case 7: return getObjects_ruleMRE_7();
            case 8: return getObjects_ruleMRE_8();
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
            case 0: setObjects_ruleMRE_0(objects); break;
            case 1: setObjects_ruleMRE_1(objects); break;
            case 2: setObjects_ruleMRE_2(objects); break;
            case 3: setObjects_ruleMRE_3(objects); break;
            case 4: setObjects_ruleMRE_4(objects); break;
            case 5: setObjects_ruleMRE_5(objects); break;
            case 6: setObjects_ruleMRE_6(objects); break;
            case 7: setObjects_ruleMRE_7(objects); break;
            case 8: setObjects_ruleMRE_8(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private module.entity.WrongAnswer module_entity_WrongAnswer_1;
    private module.entity.MERFunction module_entity_MERFunction_1;
    private module.entity.MultipleExternalRepresentation module_entity_MultipleExternalRepresentation_1;
    private module.entity.RuleToHuman module_entity_RuleToHuman_1;

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
 * @version 15/07/2014
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
