package testes;

import entidades.Historico;
import entidades.RespostaErrada;
import java.util.ArrayList;
import modulo.classificador.erro.ClassificadorErroControlador;
import modulo.identificador.expressoes.IdentificadorExpressaoControlador;


 class Jeops_RuleBase_TesteCriaRegrasBaseRegras extends jeops.AbstractRuleBase {

	
    /**
     * Identifiers of rule detectaRespostaErrada_1
     */
    private String[] identifiers_detectaRespostaErrada_1 = {
        "historico",
        "erros",
        "acertos",
        "expressaoControlador",
        "respostaErrada"
    };

    /**
     * Returns the identifiers declared in rule detectaRespostaErrada_1
     *
     * @return the identifiers declared in rule detectaRespostaErrada_1
     */
    private String[] getDeclaredIdentifiers_detectaRespostaErrada_1() {
         return identifiers_detectaRespostaErrada_1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule detectaRespostaErrada_1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_detectaRespostaErrada_1(int index) {
        switch (index) {
            case 0: return "entidades.Historico";
            case 1: return "java.util.ArrayList";
            case 2: return "java.util.ArrayList";
            case 3: return "modulo.identificador.expressoes.IdentificadorExpressaoControlador";
            case 4: return "entidades.RespostaErrada";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule detectaRespostaErrada_1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_detectaRespostaErrada_1(int index) {
        switch (index) {
            case 0: return entidades.Historico.class;
            case 1: return java.util.ArrayList.class;
            case 2: return java.util.ArrayList.class;
            case 3: return modulo.identificador.expressoes.IdentificadorExpressaoControlador.class;
            case 4: return entidades.RespostaErrada.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule detectaRespostaErrada_1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_detectaRespostaErrada_1(int index, Object value) {
        switch (index) {
            case 0: this.entidades_Historico_1 = (entidades.Historico) value; break;
            case 1: this.java_util_ArrayList_1 = (java.util.ArrayList) value; break;
            case 2: this.java_util_ArrayList_2 = (java.util.ArrayList) value; break;
            case 3: this.modulo_identificador_expressoes_IdentificadorExpressaoControlador_1 = (modulo.identificador.expressoes.IdentificadorExpressaoControlador) value; break;
            case 4: this.entidades_RespostaErrada_1 = (entidades.RespostaErrada) value; break;
        }
    }

    /**
     * Returns an object declared in the rule detectaRespostaErrada_1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_detectaRespostaErrada_1(int index) {
        switch (index) {
            case 0: return entidades_Historico_1;
            case 1: return java_util_ArrayList_1;
            case 2: return java_util_ArrayList_2;
            case 3: return modulo_identificador_expressoes_IdentificadorExpressaoControlador_1;
            case 4: return entidades_RespostaErrada_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule detectaRespostaErrada_1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_detectaRespostaErrada_1() {
        return new Object[] {
                            entidades_Historico_1,
                            java_util_ArrayList_1,
                            java_util_ArrayList_2,
                            modulo_identificador_expressoes_IdentificadorExpressaoControlador_1,
                            entidades_RespostaErrada_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule detectaRespostaErrada_1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_detectaRespostaErrada_1(Object[] objects) {
        entidades_Historico_1 = (entidades.Historico) objects[0];
        java_util_ArrayList_1 = (java.util.ArrayList) objects[1];
        java_util_ArrayList_2 = (java.util.ArrayList) objects[2];
        modulo_identificador_expressoes_IdentificadorExpressaoControlador_1 = (modulo.identificador.expressoes.IdentificadorExpressaoControlador) objects[3];
        entidades_RespostaErrada_1 = (entidades.RespostaErrada) objects[4];
    }

    /**
     * Condition 0 of rule detectaRespostaErrada_1.<p>
     * The original expression was:<br>
     * <code>expressaoControlador.temRespostaErrada(historico, erros)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean detectaRespostaErrada_1_cond_0() {
        return (modulo_identificador_expressoes_IdentificadorExpressaoControlador_1.temRespostaErrada(entidades_Historico_1, java_util_ArrayList_1));
    }

    /**
     * Checks whether some conditions of rule detectaRespostaErrada_1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean detectaRespostaErrada_1_cond(int index) {
        switch (index) {
            case 0: return detectaRespostaErrada_1_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule detectaRespostaErrada_1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_detectaRespostaErrada_1(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
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
    private boolean checkCondForDeclaration_detectaRespostaErrada_1(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                if (!detectaRespostaErrada_1_cond_0()) return false;
                return true;
            case 4:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule detectaRespostaErrada_1
     */
    private void detectaRespostaErrada_1() {
			entidades_Historico_1.setNumeroTentativas(entidades_Historico_1.getNumeroTentativas() + 1);
			modified(entidades_Historico_1);
			System.out.println("Resposta Errada (1) detectada");
			entidades_RespostaErrada_1.setDescricao(entidades_Historico_1.getResposta().getDescricao());
			modified(entidades_RespostaErrada_1);
			retract(entidades_Historico_1);
			retract(java_util_ArrayList_1);
			retract(java_util_ArrayList_2);
			retract(modulo_identificador_expressoes_IdentificadorExpressaoControlador_1);
			retract(entidades_RespostaErrada_1);
	    }




	
    /**
     * Identifiers of rule detectaRespostaErrada_2
     */
    private String[] identifiers_detectaRespostaErrada_2 = {
        "historico",
        "erros",
        "acertos",
        "expressaoControlador",
        "respostaErrada"
    };

    /**
     * Returns the identifiers declared in rule detectaRespostaErrada_2
     *
     * @return the identifiers declared in rule detectaRespostaErrada_2
     */
    private String[] getDeclaredIdentifiers_detectaRespostaErrada_2() {
         return identifiers_detectaRespostaErrada_2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule detectaRespostaErrada_2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_detectaRespostaErrada_2(int index) {
        switch (index) {
            case 0: return "entidades.Historico";
            case 1: return "java.util.ArrayList";
            case 2: return "java.util.ArrayList";
            case 3: return "modulo.identificador.expressoes.IdentificadorExpressaoControlador";
            case 4: return "entidades.RespostaErrada";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule detectaRespostaErrada_2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_detectaRespostaErrada_2(int index) {
        switch (index) {
            case 0: return entidades.Historico.class;
            case 1: return java.util.ArrayList.class;
            case 2: return java.util.ArrayList.class;
            case 3: return modulo.identificador.expressoes.IdentificadorExpressaoControlador.class;
            case 4: return entidades.RespostaErrada.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule detectaRespostaErrada_2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_detectaRespostaErrada_2(int index, Object value) {
        switch (index) {
            case 0: this.entidades_Historico_1 = (entidades.Historico) value; break;
            case 1: this.java_util_ArrayList_1 = (java.util.ArrayList) value; break;
            case 2: this.java_util_ArrayList_2 = (java.util.ArrayList) value; break;
            case 3: this.modulo_identificador_expressoes_IdentificadorExpressaoControlador_1 = (modulo.identificador.expressoes.IdentificadorExpressaoControlador) value; break;
            case 4: this.entidades_RespostaErrada_1 = (entidades.RespostaErrada) value; break;
        }
    }

    /**
     * Returns an object declared in the rule detectaRespostaErrada_2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_detectaRespostaErrada_2(int index) {
        switch (index) {
            case 0: return entidades_Historico_1;
            case 1: return java_util_ArrayList_1;
            case 2: return java_util_ArrayList_2;
            case 3: return modulo_identificador_expressoes_IdentificadorExpressaoControlador_1;
            case 4: return entidades_RespostaErrada_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule detectaRespostaErrada_2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_detectaRespostaErrada_2() {
        return new Object[] {
                            entidades_Historico_1,
                            java_util_ArrayList_1,
                            java_util_ArrayList_2,
                            modulo_identificador_expressoes_IdentificadorExpressaoControlador_1,
                            entidades_RespostaErrada_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule detectaRespostaErrada_2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_detectaRespostaErrada_2(Object[] objects) {
        entidades_Historico_1 = (entidades.Historico) objects[0];
        java_util_ArrayList_1 = (java.util.ArrayList) objects[1];
        java_util_ArrayList_2 = (java.util.ArrayList) objects[2];
        modulo_identificador_expressoes_IdentificadorExpressaoControlador_1 = (modulo.identificador.expressoes.IdentificadorExpressaoControlador) objects[3];
        entidades_RespostaErrada_1 = (entidades.RespostaErrada) objects[4];
    }

    /**
     * Condition 0 of rule detectaRespostaErrada_2.<p>
     * The original expression was:<br>
     * <code>!expressaoControlador.temRespostaCerta(historico, acertos)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean detectaRespostaErrada_2_cond_0() {
        return (!modulo_identificador_expressoes_IdentificadorExpressaoControlador_1.temRespostaCerta(entidades_Historico_1, java_util_ArrayList_2));
    }

    /**
     * Checks whether some conditions of rule detectaRespostaErrada_2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean detectaRespostaErrada_2_cond(int index) {
        switch (index) {
            case 0: return detectaRespostaErrada_2_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule detectaRespostaErrada_2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_detectaRespostaErrada_2(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
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
    private boolean checkCondForDeclaration_detectaRespostaErrada_2(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                if (!detectaRespostaErrada_2_cond_0()) return false;
                return true;
            case 4:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule detectaRespostaErrada_2
     */
    private void detectaRespostaErrada_2() {
			entidades_Historico_1.setNumeroTentativas(entidades_Historico_1.getNumeroTentativas() + 1);
			modified(entidades_Historico_1);
			entidades_RespostaErrada_1.setDescricao(entidades_Historico_1.getResposta().getDescricao());
			modified(entidades_RespostaErrada_1);
			
			System.out.println("Resposta Errada (2) detectada. Redirecionando para o classificador do erro");
			retract(entidades_Historico_1);
			retract(java_util_ArrayList_1);
			retract(java_util_ArrayList_2);
			retract(modulo_identificador_expressoes_IdentificadorExpressaoControlador_1);
			retract(entidades_RespostaErrada_1);
	    }


	
	
    /**
     * Identifiers of rule detectaRespostaCerta
     */
    private String[] identifiers_detectaRespostaCerta = {
        "historico",
        "erros",
        "acertos",
        "c",
        "r"
    };

    /**
     * Returns the identifiers declared in rule detectaRespostaCerta
     *
     * @return the identifiers declared in rule detectaRespostaCerta
     */
    private String[] getDeclaredIdentifiers_detectaRespostaCerta() {
         return identifiers_detectaRespostaCerta;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule detectaRespostaCerta.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_detectaRespostaCerta(int index) {
        switch (index) {
            case 0: return "entidades.Historico";
            case 1: return "java.util.ArrayList";
            case 2: return "java.util.ArrayList";
            case 3: return "modulo.identificador.expressoes.IdentificadorExpressaoControlador";
            case 4: return "entidades.RespostaErrada";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule detectaRespostaCerta.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_detectaRespostaCerta(int index) {
        switch (index) {
            case 0: return entidades.Historico.class;
            case 1: return java.util.ArrayList.class;
            case 2: return java.util.ArrayList.class;
            case 3: return modulo.identificador.expressoes.IdentificadorExpressaoControlador.class;
            case 4: return entidades.RespostaErrada.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule detectaRespostaCerta.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_detectaRespostaCerta(int index, Object value) {
        switch (index) {
            case 0: this.entidades_Historico_1 = (entidades.Historico) value; break;
            case 1: this.java_util_ArrayList_1 = (java.util.ArrayList) value; break;
            case 2: this.java_util_ArrayList_2 = (java.util.ArrayList) value; break;
            case 3: this.modulo_identificador_expressoes_IdentificadorExpressaoControlador_1 = (modulo.identificador.expressoes.IdentificadorExpressaoControlador) value; break;
            case 4: this.entidades_RespostaErrada_1 = (entidades.RespostaErrada) value; break;
        }
    }

    /**
     * Returns an object declared in the rule detectaRespostaCerta.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_detectaRespostaCerta(int index) {
        switch (index) {
            case 0: return entidades_Historico_1;
            case 1: return java_util_ArrayList_1;
            case 2: return java_util_ArrayList_2;
            case 3: return modulo_identificador_expressoes_IdentificadorExpressaoControlador_1;
            case 4: return entidades_RespostaErrada_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule detectaRespostaCerta
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_detectaRespostaCerta() {
        return new Object[] {
                            entidades_Historico_1,
                            java_util_ArrayList_1,
                            java_util_ArrayList_2,
                            modulo_identificador_expressoes_IdentificadorExpressaoControlador_1,
                            entidades_RespostaErrada_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule detectaRespostaCerta
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_detectaRespostaCerta(Object[] objects) {
        entidades_Historico_1 = (entidades.Historico) objects[0];
        java_util_ArrayList_1 = (java.util.ArrayList) objects[1];
        java_util_ArrayList_2 = (java.util.ArrayList) objects[2];
        modulo_identificador_expressoes_IdentificadorExpressaoControlador_1 = (modulo.identificador.expressoes.IdentificadorExpressaoControlador) objects[3];
        entidades_RespostaErrada_1 = (entidades.RespostaErrada) objects[4];
    }

    /**
     * Condition 0 of rule detectaRespostaCerta.<p>
     * The original expression was:<br>
     * <code>c.temRespostaCerta(historico, acertos)</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean detectaRespostaCerta_cond_0() {
        return (modulo_identificador_expressoes_IdentificadorExpressaoControlador_1.temRespostaCerta(entidades_Historico_1, java_util_ArrayList_2));
    }

    /**
     * Checks whether some conditions of rule detectaRespostaCerta is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean detectaRespostaCerta_cond(int index) {
        switch (index) {
            case 0: return detectaRespostaCerta_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule detectaRespostaCerta that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_detectaRespostaCerta(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
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
    private boolean checkCondForDeclaration_detectaRespostaCerta(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                if (!detectaRespostaCerta_cond_0()) return false;
                return true;
            case 4:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule detectaRespostaCerta
     */
    private void detectaRespostaCerta() {
			System.out.println("N�o h� erros");
			retract(entidades_Historico_1);
			retract(java_util_ArrayList_1);
			retract(java_util_ArrayList_2);
			retract(modulo_identificador_expressoes_IdentificadorExpressaoControlador_1);		
			retract(entidades_RespostaErrada_1);	
			
	    }


	
	
	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "detectaRespostaErrada_1",
        "detectaRespostaErrada_2",
        "detectaRespostaCerta"
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
        5,
        5,
        5
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
            case 0: return detectaRespostaErrada_1_cond(condIndex);
            case 1: return detectaRespostaErrada_2_cond(condIndex);
            case 2: return detectaRespostaCerta_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_detectaRespostaErrada_1(declIndex);
            case 1: return checkConditionsOnlyOf_detectaRespostaErrada_2(declIndex);
            case 2: return checkConditionsOnlyOf_detectaRespostaCerta(declIndex);
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
            case 0: return checkCondForDeclaration_detectaRespostaErrada_1(declIndex);
            case 1: return checkCondForDeclaration_detectaRespostaErrada_2(declIndex);
            case 2: return checkCondForDeclaration_detectaRespostaCerta(declIndex);
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
            case 0: return getDeclaredClassName_detectaRespostaErrada_1(declIndex);
            case 1: return getDeclaredClassName_detectaRespostaErrada_2(declIndex);
            case 2: return getDeclaredClassName_detectaRespostaCerta(declIndex);
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
            case 0: return getDeclaredClass_detectaRespostaErrada_1(declIndex);
            case 1: return getDeclaredClass_detectaRespostaErrada_2(declIndex);
            case 2: return getDeclaredClass_detectaRespostaCerta(declIndex);
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
            case 0: detectaRespostaErrada_1(); break;
            case 1: detectaRespostaErrada_2(); break;
            case 2: detectaRespostaCerta(); break;
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
            case 0: return getDeclaredIdentifiers_detectaRespostaErrada_1();
            case 1: return getDeclaredIdentifiers_detectaRespostaErrada_2();
            case 2: return getDeclaredIdentifiers_detectaRespostaCerta();
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
            case 0: setObject_detectaRespostaErrada_1(declIndex, value); break;
            case 1: setObject_detectaRespostaErrada_2(declIndex, value); break;
            case 2: setObject_detectaRespostaCerta(declIndex, value); break;
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
            case 0: return getObject_detectaRespostaErrada_1(declIndex);
            case 1: return getObject_detectaRespostaErrada_2(declIndex);
            case 2: return getObject_detectaRespostaCerta(declIndex);
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
            case 0: return getObjects_detectaRespostaErrada_1();
            case 1: return getObjects_detectaRespostaErrada_2();
            case 2: return getObjects_detectaRespostaCerta();
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
            case 0: setObjects_detectaRespostaErrada_1(objects); break;
            case 1: setObjects_detectaRespostaErrada_2(objects); break;
            case 2: setObjects_detectaRespostaCerta(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private entidades.Historico entidades_Historico_1;
    private java.util.ArrayList java_util_ArrayList_1;
    private java.util.ArrayList java_util_ArrayList_2;
    private modulo.identificador.expressoes.IdentificadorExpressaoControlador modulo_identificador_expressoes_IdentificadorExpressaoControlador_1;
    private entidades.RespostaErrada entidades_RespostaErrada_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_TesteCriaRegrasBaseRegras(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file TesteCriaRegrasBaseRegras.rules
 *
 * @version 11/04/2014
 */
public class TesteCriaRegrasBaseRegras extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public TesteCriaRegrasBaseRegras(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public TesteCriaRegrasBaseRegras() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_TesteCriaRegrasBaseRegras(this);
    }

}
