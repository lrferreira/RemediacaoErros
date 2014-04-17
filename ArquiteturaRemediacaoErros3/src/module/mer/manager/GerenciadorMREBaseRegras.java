package module.mer.manager;
import util.Constantes;
import entity.MERFunction;
import entity.Historic;
import entity.WrongAnswer;

import java.util.ArrayList;

 class Jeops_RuleBase_GerenciadorMREBaseRegras extends jeops.AbstractRuleBase {
	
	
	
    /**
     * Identifiers of rule MRE1
     */
    private String[] identifiers_MRE1 = {
        "h",
        "funcaoMRE",
        "e",
        "representacoes"
    };

    /**
     * Returns the identifiers declared in rule MRE1
     *
     * @return the identifiers declared in rule MRE1
     */
    private String[] getDeclaredIdentifiers_MRE1() {
         return identifiers_MRE1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule MRE1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_MRE1(int index) {
        switch (index) {
            case 0: return "entity.Historic";
            case 1: return "entity.MERFunction";
            case 2: return "entity.WrongAnswer";
            case 3: return "java.util.ArrayList";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule MRE1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_MRE1(int index) {
        switch (index) {
            case 0: return entity.Historic.class;
            case 1: return entity.MERFunction.class;
            case 2: return entity.WrongAnswer.class;
            case 3: return java.util.ArrayList.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule MRE1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_MRE1(int index, Object value) {
        switch (index) {
            case 0: this.entidades_Historico_1 = (entity.Historic) value; break;
            case 1: this.entidades_FuncaoMRE_1 = (entity.MERFunction) value; break;
            case 2: this.entidades_RespostaErrada_1 = (entity.WrongAnswer) value; break;
            case 3: this.java_util_ArrayList_1 = (java.util.ArrayList) value; break;
        }
    }

    /**
     * Returns an object declared in the rule MRE1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_MRE1(int index) {
        switch (index) {
            case 0: return entidades_Historico_1;
            case 1: return entidades_FuncaoMRE_1;
            case 2: return entidades_RespostaErrada_1;
            case 3: return java_util_ArrayList_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule MRE1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_MRE1() {
        return new Object[] {
                            entidades_Historico_1,
                            entidades_FuncaoMRE_1,
                            entidades_RespostaErrada_1,
                            java_util_ArrayList_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule MRE1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_MRE1(Object[] objects) {
        entidades_Historico_1 = (entity.Historic) objects[0];
        entidades_FuncaoMRE_1 = (entity.MERFunction) objects[1];
        entidades_RespostaErrada_1 = (entity.WrongAnswer) objects[2];
        java_util_ArrayList_1 = (java.util.ArrayList) objects[3];
    }

    /**
     * Condition 0 of rule MRE1.<p>
     * The original expression was:<br>
     * <code>funcaoMRE.getTipo() == Constantes.TIPO_FUNCAOMRE_PAPEIS_COMPLEMENTARES</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean MRE1_cond_0() {
        return (entidades_FuncaoMRE_1.getTipo() == Constantes.TIPO_FUNCAOMRE_PAPEIS_COMPLEMENTARES);
    }

    /**
     * Checks whether some conditions of rule MRE1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean MRE1_cond(int index) {
        switch (index) {
            case 0: return MRE1_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule MRE1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_MRE1(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!MRE1_cond_0()) return false;
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
    private boolean checkCondForDeclaration_MRE1(int declIndex) {
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
     * Executes the action part of the rule MRE1
     */
    private void MRE1() {
			System.out.println("Exibição de MRE 1");	
			System.out.println(GerenciadorMREControlador.getMRE(java_util_ArrayList_1, 1).getId() + " - " + GerenciadorMREControlador.getMRE(java_util_ArrayList_1, 1).getDescricao());	
			retract(entidades_Historico_1);
			retract(entidades_FuncaoMRE_1);		
			retract(entidades_RespostaErrada_1);
			retract(java_util_ArrayList_1);	
	    }



	
    /**
     * Identifiers of rule MRE2
     */
    private String[] identifiers_MRE2 = {
        "h",
        "funcaoMRE",
        "e",
        "representacoes"
    };

    /**
     * Returns the identifiers declared in rule MRE2
     *
     * @return the identifiers declared in rule MRE2
     */
    private String[] getDeclaredIdentifiers_MRE2() {
         return identifiers_MRE2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule MRE2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_MRE2(int index) {
        switch (index) {
            case 0: return "entity.Historic";
            case 1: return "entity.MERFunction";
            case 2: return "entity.WrongAnswer";
            case 3: return "java.util.ArrayList";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule MRE2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_MRE2(int index) {
        switch (index) {
            case 0: return entity.Historic.class;
            case 1: return entity.MERFunction.class;
            case 2: return entity.WrongAnswer.class;
            case 3: return java.util.ArrayList.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule MRE2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_MRE2(int index, Object value) {
        switch (index) {
            case 0: this.entidades_Historico_1 = (entity.Historic) value; break;
            case 1: this.entidades_FuncaoMRE_1 = (entity.MERFunction) value; break;
            case 2: this.entidades_RespostaErrada_1 = (entity.WrongAnswer) value; break;
            case 3: this.java_util_ArrayList_1 = (java.util.ArrayList) value; break;
        }
    }

    /**
     * Returns an object declared in the rule MRE2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_MRE2(int index) {
        switch (index) {
            case 0: return entidades_Historico_1;
            case 1: return entidades_FuncaoMRE_1;
            case 2: return entidades_RespostaErrada_1;
            case 3: return java_util_ArrayList_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule MRE2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_MRE2() {
        return new Object[] {
                            entidades_Historico_1,
                            entidades_FuncaoMRE_1,
                            entidades_RespostaErrada_1,
                            java_util_ArrayList_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule MRE2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_MRE2(Object[] objects) {
        entidades_Historico_1 = (entity.Historic) objects[0];
        entidades_FuncaoMRE_1 = (entity.MERFunction) objects[1];
        entidades_RespostaErrada_1 = (entity.WrongAnswer) objects[2];
        java_util_ArrayList_1 = (java.util.ArrayList) objects[3];
    }

    /**
     * Condition 0 of rule MRE2.<p>
     * The original expression was:<br>
     * <code>funcaoMRE.getTipo() == Constantes.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean MRE2_cond_0() {
        return (entidades_FuncaoMRE_1.getTipo() == Constantes.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
    }

    /**
     * Condition 1 of rule MRE2.<p>
     * The original expression was:<br>
     * <code>e.getTipo() == Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean MRE2_cond_1() {
        return (entidades_RespostaErrada_1.getTipo() == Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO);
    }

    /**
     * Checks whether some conditions of rule MRE2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean MRE2_cond(int index) {
        switch (index) {
            case 0: return MRE2_cond_0();
            case 1: return MRE2_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule MRE2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_MRE2(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!MRE2_cond_0()) return false;
                return true;
            case 2:
                if (!MRE2_cond_1()) return false;
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
    private boolean checkCondForDeclaration_MRE2(int declIndex) {
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
     * Executes the action part of the rule MRE2
     */
    private void MRE2() {
			System.out.println("Exibição de MRE 2");
			System.out.println(GerenciadorMREControlador.getMRE(java_util_ArrayList_1, 2).getId() + " - " + GerenciadorMREControlador.getMRE(java_util_ArrayList_1, 2).getDescricao());								
			retract(entidades_Historico_1);
			retract(entidades_FuncaoMRE_1);			
			retract(entidades_RespostaErrada_1);
			retract(java_util_ArrayList_1);
	    }

	
	
	
    /**
     * Identifiers of rule MRE3
     */
    private String[] identifiers_MRE3 = {
        "h",
        "funcaoMRE",
        "e",
        "representacoes"
    };

    /**
     * Returns the identifiers declared in rule MRE3
     *
     * @return the identifiers declared in rule MRE3
     */
    private String[] getDeclaredIdentifiers_MRE3() {
         return identifiers_MRE3;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule MRE3.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_MRE3(int index) {
        switch (index) {
            case 0: return "entity.Historic";
            case 1: return "entity.MERFunction";
            case 2: return "entity.WrongAnswer";
            case 3: return "java.util.ArrayList";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule MRE3.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_MRE3(int index) {
        switch (index) {
            case 0: return entity.Historic.class;
            case 1: return entity.MERFunction.class;
            case 2: return entity.WrongAnswer.class;
            case 3: return java.util.ArrayList.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule MRE3.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_MRE3(int index, Object value) {
        switch (index) {
            case 0: this.entidades_Historico_1 = (entity.Historic) value; break;
            case 1: this.entidades_FuncaoMRE_1 = (entity.MERFunction) value; break;
            case 2: this.entidades_RespostaErrada_1 = (entity.WrongAnswer) value; break;
            case 3: this.java_util_ArrayList_1 = (java.util.ArrayList) value; break;
        }
    }

    /**
     * Returns an object declared in the rule MRE3.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_MRE3(int index) {
        switch (index) {
            case 0: return entidades_Historico_1;
            case 1: return entidades_FuncaoMRE_1;
            case 2: return entidades_RespostaErrada_1;
            case 3: return java_util_ArrayList_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule MRE3
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_MRE3() {
        return new Object[] {
                            entidades_Historico_1,
                            entidades_FuncaoMRE_1,
                            entidades_RespostaErrada_1,
                            java_util_ArrayList_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule MRE3
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_MRE3(Object[] objects) {
        entidades_Historico_1 = (entity.Historic) objects[0];
        entidades_FuncaoMRE_1 = (entity.MERFunction) objects[1];
        entidades_RespostaErrada_1 = (entity.WrongAnswer) objects[2];
        java_util_ArrayList_1 = (java.util.ArrayList) objects[3];
    }

    /**
     * Condition 0 of rule MRE3.<p>
     * The original expression was:<br>
     * <code>funcaoMRE.getTipo() == Constantes.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean MRE3_cond_0() {
        return (entidades_FuncaoMRE_1.getTipo() == Constantes.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
    }

    /**
     * Condition 1 of rule MRE3.<p>
     * The original expression was:<br>
     * <code>e.getTipo() == Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_REGRA</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean MRE3_cond_1() {
        return (entidades_RespostaErrada_1.getTipo() == Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_REGRA);
    }

    /**
     * Checks whether some conditions of rule MRE3 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean MRE3_cond(int index) {
        switch (index) {
            case 0: return MRE3_cond_0();
            case 1: return MRE3_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule MRE3 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_MRE3(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!MRE3_cond_0()) return false;
                return true;
            case 2:
                if (!MRE3_cond_1()) return false;
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
    private boolean checkCondForDeclaration_MRE3(int declIndex) {
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
     * Executes the action part of the rule MRE3
     */
    private void MRE3() {
			System.out.println("Exibição de MRE 3");
			System.out.println(GerenciadorMREControlador.getMRE(java_util_ArrayList_1, 3).getId() + " - " + GerenciadorMREControlador.getMRE(java_util_ArrayList_1, 3).getDescricao());	
			retract(entidades_Historico_1);
			retract(entidades_FuncaoMRE_1);			
			retract(entidades_RespostaErrada_1);
			retract(java_util_ArrayList_1);
	    }

	
		
	
    /**
     * Identifiers of rule MRE4
     */
    private String[] identifiers_MRE4 = {
        "h",
        "funcaoMRE",
        "e",
        "representacoes"
    };

    /**
     * Returns the identifiers declared in rule MRE4
     *
     * @return the identifiers declared in rule MRE4
     */
    private String[] getDeclaredIdentifiers_MRE4() {
         return identifiers_MRE4;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule MRE4.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_MRE4(int index) {
        switch (index) {
            case 0: return "entity.Historic";
            case 1: return "entity.MERFunction";
            case 2: return "entity.WrongAnswer";
            case 3: return "java.util.ArrayList";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule MRE4.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_MRE4(int index) {
        switch (index) {
            case 0: return entity.Historic.class;
            case 1: return entity.MERFunction.class;
            case 2: return entity.WrongAnswer.class;
            case 3: return java.util.ArrayList.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule MRE4.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_MRE4(int index, Object value) {
        switch (index) {
            case 0: this.entidades_Historico_1 = (entity.Historic) value; break;
            case 1: this.entidades_FuncaoMRE_1 = (entity.MERFunction) value; break;
            case 2: this.entidades_RespostaErrada_1 = (entity.WrongAnswer) value; break;
            case 3: this.java_util_ArrayList_1 = (java.util.ArrayList) value; break;
        }
    }

    /**
     * Returns an object declared in the rule MRE4.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_MRE4(int index) {
        switch (index) {
            case 0: return entidades_Historico_1;
            case 1: return entidades_FuncaoMRE_1;
            case 2: return entidades_RespostaErrada_1;
            case 3: return java_util_ArrayList_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule MRE4
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_MRE4() {
        return new Object[] {
                            entidades_Historico_1,
                            entidades_FuncaoMRE_1,
                            entidades_RespostaErrada_1,
                            java_util_ArrayList_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule MRE4
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_MRE4(Object[] objects) {
        entidades_Historico_1 = (entity.Historic) objects[0];
        entidades_FuncaoMRE_1 = (entity.MERFunction) objects[1];
        entidades_RespostaErrada_1 = (entity.WrongAnswer) objects[2];
        java_util_ArrayList_1 = (java.util.ArrayList) objects[3];
    }

    /**
     * Condition 0 of rule MRE4.<p>
     * The original expression was:<br>
     * <code>funcaoMRE.getTipo() == Constantes.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean MRE4_cond_0() {
        return (entidades_FuncaoMRE_1.getTipo() == Constantes.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
    }

    /**
     * Condition 1 of rule MRE4.<p>
     * The original expression was:<br>
     * <code>e.getTipo() == Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean MRE4_cond_1() {
        return (entidades_RespostaErrada_1.getTipo() == Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR);
    }

    /**
     * Checks whether some conditions of rule MRE4 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean MRE4_cond(int index) {
        switch (index) {
            case 0: return MRE4_cond_0();
            case 1: return MRE4_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule MRE4 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_MRE4(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!MRE4_cond_0()) return false;
                return true;
            case 2:
                if (!MRE4_cond_1()) return false;
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
    private boolean checkCondForDeclaration_MRE4(int declIndex) {
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
     * Executes the action part of the rule MRE4
     */
    private void MRE4() {
			System.out.println("Exibição de MRE 4");
			System.out.println(GerenciadorMREControlador.getMRE(java_util_ArrayList_1, 4).getId() + " - " + GerenciadorMREControlador.getMRE(java_util_ArrayList_1, 4).getDescricao());	
			retract(entidades_Historico_1);
			retract(entidades_FuncaoMRE_1);
			retract(entidades_RespostaErrada_1);
			retract(java_util_ArrayList_1);
	    }


				
	
    /**
     * Identifiers of rule MRE5
     */
    private String[] identifiers_MRE5 = {
        "h",
        "funcaoMRE",
        "e",
        "representacoes"
    };

    /**
     * Returns the identifiers declared in rule MRE5
     *
     * @return the identifiers declared in rule MRE5
     */
    private String[] getDeclaredIdentifiers_MRE5() {
         return identifiers_MRE5;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule MRE5.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_MRE5(int index) {
        switch (index) {
            case 0: return "entity.Historic";
            case 1: return "entity.MERFunction";
            case 2: return "entity.WrongAnswer";
            case 3: return "java.util.ArrayList";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule MRE5.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_MRE5(int index) {
        switch (index) {
            case 0: return entity.Historic.class;
            case 1: return entity.MERFunction.class;
            case 2: return entity.WrongAnswer.class;
            case 3: return java.util.ArrayList.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule MRE5.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_MRE5(int index, Object value) {
        switch (index) {
            case 0: this.entidades_Historico_1 = (entity.Historic) value; break;
            case 1: this.entidades_FuncaoMRE_1 = (entity.MERFunction) value; break;
            case 2: this.entidades_RespostaErrada_1 = (entity.WrongAnswer) value; break;
            case 3: this.java_util_ArrayList_1 = (java.util.ArrayList) value; break;
        }
    }

    /**
     * Returns an object declared in the rule MRE5.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_MRE5(int index) {
        switch (index) {
            case 0: return entidades_Historico_1;
            case 1: return entidades_FuncaoMRE_1;
            case 2: return entidades_RespostaErrada_1;
            case 3: return java_util_ArrayList_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule MRE5
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_MRE5() {
        return new Object[] {
                            entidades_Historico_1,
                            entidades_FuncaoMRE_1,
                            entidades_RespostaErrada_1,
                            java_util_ArrayList_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule MRE5
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_MRE5(Object[] objects) {
        entidades_Historico_1 = (entity.Historic) objects[0];
        entidades_FuncaoMRE_1 = (entity.MERFunction) objects[1];
        entidades_RespostaErrada_1 = (entity.WrongAnswer) objects[2];
        java_util_ArrayList_1 = (java.util.ArrayList) objects[3];
    }

    /**
     * Condition 0 of rule MRE5.<p>
     * The original expression was:<br>
     * <code>funcaoMRE.getTipo() == Constantes.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean MRE5_cond_0() {
        return (entidades_FuncaoMRE_1.getTipo() == Constantes.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
    }

    /**
     * Condition 1 of rule MRE5.<p>
     * The original expression was:<br>
     * <code>e.getTipo() == Constantes.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean MRE5_cond_1() {
        return (entidades_RespostaErrada_1.getTipo() == Constantes.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL);
    }

    /**
     * Checks whether some conditions of rule MRE5 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean MRE5_cond(int index) {
        switch (index) {
            case 0: return MRE5_cond_0();
            case 1: return MRE5_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule MRE5 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_MRE5(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!MRE5_cond_0()) return false;
                return true;
            case 2:
                if (!MRE5_cond_1()) return false;
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
    private boolean checkCondForDeclaration_MRE5(int declIndex) {
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
     * Executes the action part of the rule MRE5
     */
    private void MRE5() {
			System.out.println("Exibição de MRE 5");
			System.out.println(GerenciadorMREControlador.getMRE(java_util_ArrayList_1, 5).getId() + " - " + GerenciadorMREControlador.getMRE(java_util_ArrayList_1, 5).getDescricao());	
			retract(entidades_Historico_1);
			retract(entidades_FuncaoMRE_1);
			retract(entidades_RespostaErrada_1);
			retract(java_util_ArrayList_1);
	    }

	
	
			
	
    /**
     * Identifiers of rule MRE6
     */
    private String[] identifiers_MRE6 = {
        "h",
        "funcaoMRE",
        "e",
        "representacoes"
    };

    /**
     * Returns the identifiers declared in rule MRE6
     *
     * @return the identifiers declared in rule MRE6
     */
    private String[] getDeclaredIdentifiers_MRE6() {
         return identifiers_MRE6;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule MRE6.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_MRE6(int index) {
        switch (index) {
            case 0: return "entity.Historic";
            case 1: return "entity.MERFunction";
            case 2: return "entity.WrongAnswer";
            case 3: return "java.util.ArrayList";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule MRE6.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_MRE6(int index) {
        switch (index) {
            case 0: return entity.Historic.class;
            case 1: return entity.MERFunction.class;
            case 2: return entity.WrongAnswer.class;
            case 3: return java.util.ArrayList.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule MRE6.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_MRE6(int index, Object value) {
        switch (index) {
            case 0: this.entidades_Historico_1 = (entity.Historic) value; break;
            case 1: this.entidades_FuncaoMRE_1 = (entity.MERFunction) value; break;
            case 2: this.entidades_RespostaErrada_1 = (entity.WrongAnswer) value; break;
            case 3: this.java_util_ArrayList_1 = (java.util.ArrayList) value; break;
        }
    }

    /**
     * Returns an object declared in the rule MRE6.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_MRE6(int index) {
        switch (index) {
            case 0: return entidades_Historico_1;
            case 1: return entidades_FuncaoMRE_1;
            case 2: return entidades_RespostaErrada_1;
            case 3: return java_util_ArrayList_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule MRE6
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_MRE6() {
        return new Object[] {
                            entidades_Historico_1,
                            entidades_FuncaoMRE_1,
                            entidades_RespostaErrada_1,
                            java_util_ArrayList_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule MRE6
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_MRE6(Object[] objects) {
        entidades_Historico_1 = (entity.Historic) objects[0];
        entidades_FuncaoMRE_1 = (entity.MERFunction) objects[1];
        entidades_RespostaErrada_1 = (entity.WrongAnswer) objects[2];
        java_util_ArrayList_1 = (java.util.ArrayList) objects[3];
    }

    /**
     * Condition 0 of rule MRE6.<p>
     * The original expression was:<br>
     * <code>funcaoMRE.getTipo() == Constantes.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean MRE6_cond_0() {
        return (entidades_FuncaoMRE_1.getTipo() == Constantes.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
    }

    /**
     * Condition 1 of rule MRE6.<p>
     * The original expression was:<br>
     * <code>e.getTipo() == Constantes.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean MRE6_cond_1() {
        return (entidades_RespostaErrada_1.getTipo() == Constantes.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL);
    }

    /**
     * Checks whether some conditions of rule MRE6 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean MRE6_cond(int index) {
        switch (index) {
            case 0: return MRE6_cond_0();
            case 1: return MRE6_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule MRE6 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_MRE6(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!MRE6_cond_0()) return false;
                return true;
            case 2:
                if (!MRE6_cond_1()) return false;
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
    private boolean checkCondForDeclaration_MRE6(int declIndex) {
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
     * Executes the action part of the rule MRE6
     */
    private void MRE6() {
			System.out.println("Exibição de MRE 6");
			System.out.println(GerenciadorMREControlador.getMRE(java_util_ArrayList_1, 6).getId() + " - " + GerenciadorMREControlador.getMRE(java_util_ArrayList_1, 6).getDescricao());	
			retract(entidades_Historico_1);
			retract(entidades_FuncaoMRE_1);
			retract(entidades_RespostaErrada_1);
			retract(java_util_ArrayList_1);						
	    }

	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "MRE1",
        "MRE2",
        "MRE3",
        "MRE4",
        "MRE5",
        "MRE6"
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
            case 0: return MRE1_cond(condIndex);
            case 1: return MRE2_cond(condIndex);
            case 2: return MRE3_cond(condIndex);
            case 3: return MRE4_cond(condIndex);
            case 4: return MRE5_cond(condIndex);
            case 5: return MRE6_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_MRE1(declIndex);
            case 1: return checkConditionsOnlyOf_MRE2(declIndex);
            case 2: return checkConditionsOnlyOf_MRE3(declIndex);
            case 3: return checkConditionsOnlyOf_MRE4(declIndex);
            case 4: return checkConditionsOnlyOf_MRE5(declIndex);
            case 5: return checkConditionsOnlyOf_MRE6(declIndex);
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
            case 0: return checkCondForDeclaration_MRE1(declIndex);
            case 1: return checkCondForDeclaration_MRE2(declIndex);
            case 2: return checkCondForDeclaration_MRE3(declIndex);
            case 3: return checkCondForDeclaration_MRE4(declIndex);
            case 4: return checkCondForDeclaration_MRE5(declIndex);
            case 5: return checkCondForDeclaration_MRE6(declIndex);
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
            case 0: return getDeclaredClassName_MRE1(declIndex);
            case 1: return getDeclaredClassName_MRE2(declIndex);
            case 2: return getDeclaredClassName_MRE3(declIndex);
            case 3: return getDeclaredClassName_MRE4(declIndex);
            case 4: return getDeclaredClassName_MRE5(declIndex);
            case 5: return getDeclaredClassName_MRE6(declIndex);
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
            case 0: return getDeclaredClass_MRE1(declIndex);
            case 1: return getDeclaredClass_MRE2(declIndex);
            case 2: return getDeclaredClass_MRE3(declIndex);
            case 3: return getDeclaredClass_MRE4(declIndex);
            case 4: return getDeclaredClass_MRE5(declIndex);
            case 5: return getDeclaredClass_MRE6(declIndex);
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
            case 0: MRE1(); break;
            case 1: MRE2(); break;
            case 2: MRE3(); break;
            case 3: MRE4(); break;
            case 4: MRE5(); break;
            case 5: MRE6(); break;
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
            case 0: return getDeclaredIdentifiers_MRE1();
            case 1: return getDeclaredIdentifiers_MRE2();
            case 2: return getDeclaredIdentifiers_MRE3();
            case 3: return getDeclaredIdentifiers_MRE4();
            case 4: return getDeclaredIdentifiers_MRE5();
            case 5: return getDeclaredIdentifiers_MRE6();
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
            case 0: setObject_MRE1(declIndex, value); break;
            case 1: setObject_MRE2(declIndex, value); break;
            case 2: setObject_MRE3(declIndex, value); break;
            case 3: setObject_MRE4(declIndex, value); break;
            case 4: setObject_MRE5(declIndex, value); break;
            case 5: setObject_MRE6(declIndex, value); break;
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
            case 0: return getObject_MRE1(declIndex);
            case 1: return getObject_MRE2(declIndex);
            case 2: return getObject_MRE3(declIndex);
            case 3: return getObject_MRE4(declIndex);
            case 4: return getObject_MRE5(declIndex);
            case 5: return getObject_MRE6(declIndex);
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
            case 0: return getObjects_MRE1();
            case 1: return getObjects_MRE2();
            case 2: return getObjects_MRE3();
            case 3: return getObjects_MRE4();
            case 4: return getObjects_MRE5();
            case 5: return getObjects_MRE6();
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
            case 0: setObjects_MRE1(objects); break;
            case 1: setObjects_MRE2(objects); break;
            case 2: setObjects_MRE3(objects); break;
            case 3: setObjects_MRE4(objects); break;
            case 4: setObjects_MRE5(objects); break;
            case 5: setObjects_MRE6(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private entity.Historic entidades_Historico_1;
    private entity.MERFunction entidades_FuncaoMRE_1;
    private entity.WrongAnswer entidades_RespostaErrada_1;
    private java.util.ArrayList java_util_ArrayList_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_GerenciadorMREBaseRegras(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file GerenciadorMREBaseRegras.rules
 *
 * @version 27/03/2014
 */
public class GerenciadorMREBaseRegras extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public GerenciadorMREBaseRegras(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public GerenciadorMREBaseRegras() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_GerenciadorMREBaseRegras(this);
    }

}
