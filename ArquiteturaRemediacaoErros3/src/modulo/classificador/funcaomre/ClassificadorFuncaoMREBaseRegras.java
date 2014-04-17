package modulo.classificador.funcaomre;
import entidades.Historico;
import entidades.RespostaErrada;
import util.Constantes;
import entidades.FuncaoMRE;
import modulo.gerenciador.mre.GerenciadorMREControlador;


 class Jeops_RuleBase_ClassificadorFuncaoMREBaseRegras extends jeops.AbstractRuleBase {
	
	//PAGINA 55 tese Maici
	
	
    /**
     * Identifiers of rule papeisComplementares
     */
    private String[] identifiers_papeisComplementares = {
        "h",
        "e",
        "funcaoMRE"
    };

    /**
     * Returns the identifiers declared in rule papeisComplementares
     *
     * @return the identifiers declared in rule papeisComplementares
     */
    private String[] getDeclaredIdentifiers_papeisComplementares() {
         return identifiers_papeisComplementares;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule papeisComplementares.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_papeisComplementares(int index) {
        switch (index) {
            case 0: return "entidades.Historico";
            case 1: return "entidades.RespostaErrada";
            case 2: return "entidades.FuncaoMRE";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule papeisComplementares.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_papeisComplementares(int index) {
        switch (index) {
            case 0: return entidades.Historico.class;
            case 1: return entidades.RespostaErrada.class;
            case 2: return entidades.FuncaoMRE.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule papeisComplementares.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_papeisComplementares(int index, Object value) {
        switch (index) {
            case 0: this.entidades_Historico_1 = (entidades.Historico) value; break;
            case 1: this.entidades_RespostaErrada_1 = (entidades.RespostaErrada) value; break;
            case 2: this.entidades_FuncaoMRE_1 = (entidades.FuncaoMRE) value; break;
        }
    }

    /**
     * Returns an object declared in the rule papeisComplementares.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_papeisComplementares(int index) {
        switch (index) {
            case 0: return entidades_Historico_1;
            case 1: return entidades_RespostaErrada_1;
            case 2: return entidades_FuncaoMRE_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule papeisComplementares
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_papeisComplementares() {
        return new Object[] {
                            entidades_Historico_1,
                            entidades_RespostaErrada_1,
                            entidades_FuncaoMRE_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule papeisComplementares
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_papeisComplementares(Object[] objects) {
        entidades_Historico_1 = (entidades.Historico) objects[0];
        entidades_RespostaErrada_1 = (entidades.RespostaErrada) objects[1];
        entidades_FuncaoMRE_1 = (entidades.FuncaoMRE) objects[2];
    }

    /**
     * Condition 0 of rule papeisComplementares.<p>
     * The original expression was:<br>
     * <code>e.getTipo() == Constantes.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean papeisComplementares_cond_0() {
        return (entidades_RespostaErrada_1.getTipo() == Constantes.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA);
    }

    /**
     * Checks whether some conditions of rule papeisComplementares is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean papeisComplementares_cond(int index) {
        switch (index) {
            case 0: return papeisComplementares_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule papeisComplementares that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_papeisComplementares(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!papeisComplementares_cond_0()) return false;
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
    private boolean checkCondForDeclaration_papeisComplementares(int declIndex) {
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
     * Executes the action part of the rule papeisComplementares
     */
    private void papeisComplementares() {
			entidades_FuncaoMRE_1.setTipo(Constantes.TIPO_FUNCAOMRE_PAPEIS_COMPLEMENTARES);
			modified(entidades_FuncaoMRE_1);
			System.out.println("Função MRE: Papéis Complementares");

			retract(entidades_Historico_1);
			retract(entidades_RespostaErrada_1);
			retract(entidades_FuncaoMRE_1);	
	    }


	
	
    /**
     * Identifiers of rule restricaoInterpretacao1
     */
    private String[] identifiers_restricaoInterpretacao1 = {
        "h",
        "e",
        "funcaoMRE"
    };

    /**
     * Returns the identifiers declared in rule restricaoInterpretacao1
     *
     * @return the identifiers declared in rule restricaoInterpretacao1
     */
    private String[] getDeclaredIdentifiers_restricaoInterpretacao1() {
         return identifiers_restricaoInterpretacao1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule restricaoInterpretacao1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_restricaoInterpretacao1(int index) {
        switch (index) {
            case 0: return "entidades.Historico";
            case 1: return "entidades.RespostaErrada";
            case 2: return "entidades.FuncaoMRE";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule restricaoInterpretacao1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_restricaoInterpretacao1(int index) {
        switch (index) {
            case 0: return entidades.Historico.class;
            case 1: return entidades.RespostaErrada.class;
            case 2: return entidades.FuncaoMRE.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule restricaoInterpretacao1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_restricaoInterpretacao1(int index, Object value) {
        switch (index) {
            case 0: this.entidades_Historico_1 = (entidades.Historico) value; break;
            case 1: this.entidades_RespostaErrada_1 = (entidades.RespostaErrada) value; break;
            case 2: this.entidades_FuncaoMRE_1 = (entidades.FuncaoMRE) value; break;
        }
    }

    /**
     * Returns an object declared in the rule restricaoInterpretacao1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_restricaoInterpretacao1(int index) {
        switch (index) {
            case 0: return entidades_Historico_1;
            case 1: return entidades_RespostaErrada_1;
            case 2: return entidades_FuncaoMRE_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule restricaoInterpretacao1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_restricaoInterpretacao1() {
        return new Object[] {
                            entidades_Historico_1,
                            entidades_RespostaErrada_1,
                            entidades_FuncaoMRE_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule restricaoInterpretacao1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_restricaoInterpretacao1(Object[] objects) {
        entidades_Historico_1 = (entidades.Historico) objects[0];
        entidades_RespostaErrada_1 = (entidades.RespostaErrada) objects[1];
        entidades_FuncaoMRE_1 = (entidades.FuncaoMRE) objects[2];
    }

    /**
     * Condition 0 of rule restricaoInterpretacao1.<p>
     * The original expression was:<br>
     * <code>e.getTipo() == Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean restricaoInterpretacao1_cond_0() {
        return (entidades_RespostaErrada_1.getTipo() == Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO);
    }

    /**
     * Checks whether some conditions of rule restricaoInterpretacao1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean restricaoInterpretacao1_cond(int index) {
        switch (index) {
            case 0: return restricaoInterpretacao1_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule restricaoInterpretacao1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_restricaoInterpretacao1(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!restricaoInterpretacao1_cond_0()) return false;
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
    private boolean checkCondForDeclaration_restricaoInterpretacao1(int declIndex) {
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
     * Executes the action part of the rule restricaoInterpretacao1
     */
    private void restricaoInterpretacao1() {
			entidades_FuncaoMRE_1.setTipo(Constantes.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
			modified(entidades_FuncaoMRE_1);
			System.out.println("Função MRE: Restrição Interpretação");		
			retract(entidades_Historico_1);
			retract(entidades_RespostaErrada_1);
			retract(entidades_FuncaoMRE_1);	
	    }



	
    /**
     * Identifiers of rule restricaoInterpretacao2
     */
    private String[] identifiers_restricaoInterpretacao2 = {
        "h",
        "e",
        "funcaoMRE"
    };

    /**
     * Returns the identifiers declared in rule restricaoInterpretacao2
     *
     * @return the identifiers declared in rule restricaoInterpretacao2
     */
    private String[] getDeclaredIdentifiers_restricaoInterpretacao2() {
         return identifiers_restricaoInterpretacao2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule restricaoInterpretacao2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_restricaoInterpretacao2(int index) {
        switch (index) {
            case 0: return "entidades.Historico";
            case 1: return "entidades.RespostaErrada";
            case 2: return "entidades.FuncaoMRE";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule restricaoInterpretacao2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_restricaoInterpretacao2(int index) {
        switch (index) {
            case 0: return entidades.Historico.class;
            case 1: return entidades.RespostaErrada.class;
            case 2: return entidades.FuncaoMRE.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule restricaoInterpretacao2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_restricaoInterpretacao2(int index, Object value) {
        switch (index) {
            case 0: this.entidades_Historico_1 = (entidades.Historico) value; break;
            case 1: this.entidades_RespostaErrada_1 = (entidades.RespostaErrada) value; break;
            case 2: this.entidades_FuncaoMRE_1 = (entidades.FuncaoMRE) value; break;
        }
    }

    /**
     * Returns an object declared in the rule restricaoInterpretacao2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_restricaoInterpretacao2(int index) {
        switch (index) {
            case 0: return entidades_Historico_1;
            case 1: return entidades_RespostaErrada_1;
            case 2: return entidades_FuncaoMRE_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule restricaoInterpretacao2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_restricaoInterpretacao2() {
        return new Object[] {
                            entidades_Historico_1,
                            entidades_RespostaErrada_1,
                            entidades_FuncaoMRE_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule restricaoInterpretacao2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_restricaoInterpretacao2(Object[] objects) {
        entidades_Historico_1 = (entidades.Historico) objects[0];
        entidades_RespostaErrada_1 = (entidades.RespostaErrada) objects[1];
        entidades_FuncaoMRE_1 = (entidades.FuncaoMRE) objects[2];
    }

    /**
     * Condition 0 of rule restricaoInterpretacao2.<p>
     * The original expression was:<br>
     * <code>e.getTipo() == Constantes.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean restricaoInterpretacao2_cond_0() {
        return (entidades_RespostaErrada_1.getTipo() == Constantes.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL);
    }

    /**
     * Checks whether some conditions of rule restricaoInterpretacao2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean restricaoInterpretacao2_cond(int index) {
        switch (index) {
            case 0: return restricaoInterpretacao2_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule restricaoInterpretacao2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_restricaoInterpretacao2(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!restricaoInterpretacao2_cond_0()) return false;
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
    private boolean checkCondForDeclaration_restricaoInterpretacao2(int declIndex) {
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
     * Executes the action part of the rule restricaoInterpretacao2
     */
    private void restricaoInterpretacao2() {
			entidades_FuncaoMRE_1.setTipo(Constantes.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
			modified(entidades_FuncaoMRE_1);
			System.out.println("Função MRE: Restrição Interpretação");
			retract(entidades_Historico_1);
			retract(entidades_RespostaErrada_1);
			retract(entidades_FuncaoMRE_1);	
	    }


	
	
    /**
     * Identifiers of rule compreensaoMaisAprofundada1
     */
    private String[] identifiers_compreensaoMaisAprofundada1 = {
        "h",
        "e",
        "funcaoMRE"
    };

    /**
     * Returns the identifiers declared in rule compreensaoMaisAprofundada1
     *
     * @return the identifiers declared in rule compreensaoMaisAprofundada1
     */
    private String[] getDeclaredIdentifiers_compreensaoMaisAprofundada1() {
         return identifiers_compreensaoMaisAprofundada1;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule compreensaoMaisAprofundada1.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_compreensaoMaisAprofundada1(int index) {
        switch (index) {
            case 0: return "entidades.Historico";
            case 1: return "entidades.RespostaErrada";
            case 2: return "entidades.FuncaoMRE";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule compreensaoMaisAprofundada1.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_compreensaoMaisAprofundada1(int index) {
        switch (index) {
            case 0: return entidades.Historico.class;
            case 1: return entidades.RespostaErrada.class;
            case 2: return entidades.FuncaoMRE.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule compreensaoMaisAprofundada1.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_compreensaoMaisAprofundada1(int index, Object value) {
        switch (index) {
            case 0: this.entidades_Historico_1 = (entidades.Historico) value; break;
            case 1: this.entidades_RespostaErrada_1 = (entidades.RespostaErrada) value; break;
            case 2: this.entidades_FuncaoMRE_1 = (entidades.FuncaoMRE) value; break;
        }
    }

    /**
     * Returns an object declared in the rule compreensaoMaisAprofundada1.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_compreensaoMaisAprofundada1(int index) {
        switch (index) {
            case 0: return entidades_Historico_1;
            case 1: return entidades_RespostaErrada_1;
            case 2: return entidades_FuncaoMRE_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule compreensaoMaisAprofundada1
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_compreensaoMaisAprofundada1() {
        return new Object[] {
                            entidades_Historico_1,
                            entidades_RespostaErrada_1,
                            entidades_FuncaoMRE_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule compreensaoMaisAprofundada1
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_compreensaoMaisAprofundada1(Object[] objects) {
        entidades_Historico_1 = (entidades.Historico) objects[0];
        entidades_RespostaErrada_1 = (entidades.RespostaErrada) objects[1];
        entidades_FuncaoMRE_1 = (entidades.FuncaoMRE) objects[2];
    }

    /**
     * Condition 0 of rule compreensaoMaisAprofundada1.<p>
     * The original expression was:<br>
     * <code>e.getTipo() == Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_REGRA</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean compreensaoMaisAprofundada1_cond_0() {
        return (entidades_RespostaErrada_1.getTipo() == Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_REGRA);
    }

    /**
     * Checks whether some conditions of rule compreensaoMaisAprofundada1 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean compreensaoMaisAprofundada1_cond(int index) {
        switch (index) {
            case 0: return compreensaoMaisAprofundada1_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule compreensaoMaisAprofundada1 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_compreensaoMaisAprofundada1(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!compreensaoMaisAprofundada1_cond_0()) return false;
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
    private boolean checkCondForDeclaration_compreensaoMaisAprofundada1(int declIndex) {
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
     * Executes the action part of the rule compreensaoMaisAprofundada1
     */
    private void compreensaoMaisAprofundada1() {
			entidades_FuncaoMRE_1.setTipo(Constantes.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
			modified(entidades_FuncaoMRE_1);
			System.out.println("Função MRE: Compreensão Mais Aprofundada");
			retract(entidades_Historico_1);
			retract(entidades_RespostaErrada_1);
			retract(entidades_FuncaoMRE_1);	
	    }


	
	
    /**
     * Identifiers of rule compreensaoMaisAprofundada2
     */
    private String[] identifiers_compreensaoMaisAprofundada2 = {
        "h",
        "e",
        "funcaoMRE"
    };

    /**
     * Returns the identifiers declared in rule compreensaoMaisAprofundada2
     *
     * @return the identifiers declared in rule compreensaoMaisAprofundada2
     */
    private String[] getDeclaredIdentifiers_compreensaoMaisAprofundada2() {
         return identifiers_compreensaoMaisAprofundada2;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule compreensaoMaisAprofundada2.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_compreensaoMaisAprofundada2(int index) {
        switch (index) {
            case 0: return "entidades.Historico";
            case 1: return "entidades.RespostaErrada";
            case 2: return "entidades.FuncaoMRE";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule compreensaoMaisAprofundada2.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_compreensaoMaisAprofundada2(int index) {
        switch (index) {
            case 0: return entidades.Historico.class;
            case 1: return entidades.RespostaErrada.class;
            case 2: return entidades.FuncaoMRE.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule compreensaoMaisAprofundada2.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_compreensaoMaisAprofundada2(int index, Object value) {
        switch (index) {
            case 0: this.entidades_Historico_1 = (entidades.Historico) value; break;
            case 1: this.entidades_RespostaErrada_1 = (entidades.RespostaErrada) value; break;
            case 2: this.entidades_FuncaoMRE_1 = (entidades.FuncaoMRE) value; break;
        }
    }

    /**
     * Returns an object declared in the rule compreensaoMaisAprofundada2.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_compreensaoMaisAprofundada2(int index) {
        switch (index) {
            case 0: return entidades_Historico_1;
            case 1: return entidades_RespostaErrada_1;
            case 2: return entidades_FuncaoMRE_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule compreensaoMaisAprofundada2
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_compreensaoMaisAprofundada2() {
        return new Object[] {
                            entidades_Historico_1,
                            entidades_RespostaErrada_1,
                            entidades_FuncaoMRE_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule compreensaoMaisAprofundada2
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_compreensaoMaisAprofundada2(Object[] objects) {
        entidades_Historico_1 = (entidades.Historico) objects[0];
        entidades_RespostaErrada_1 = (entidades.RespostaErrada) objects[1];
        entidades_FuncaoMRE_1 = (entidades.FuncaoMRE) objects[2];
    }

    /**
     * Condition 0 of rule compreensaoMaisAprofundada2.<p>
     * The original expression was:<br>
     * <code>e.getTipo() == Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean compreensaoMaisAprofundada2_cond_0() {
        return (entidades_RespostaErrada_1.getTipo() == Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR);
    }

    /**
     * Checks whether some conditions of rule compreensaoMaisAprofundada2 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean compreensaoMaisAprofundada2_cond(int index) {
        switch (index) {
            case 0: return compreensaoMaisAprofundada2_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule compreensaoMaisAprofundada2 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_compreensaoMaisAprofundada2(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!compreensaoMaisAprofundada2_cond_0()) return false;
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
    private boolean checkCondForDeclaration_compreensaoMaisAprofundada2(int declIndex) {
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
     * Executes the action part of the rule compreensaoMaisAprofundada2
     */
    private void compreensaoMaisAprofundada2() {
			entidades_FuncaoMRE_1.setTipo(Constantes.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
			modified(entidades_FuncaoMRE_1);
			System.out.println("Função MRE: Compreensão Mais Aprofundada");
			retract(entidades_Historico_1);
			retract(entidades_RespostaErrada_1);
			retract(entidades_FuncaoMRE_1);	
	    }


	
	
    /**
     * Identifiers of rule compreensaoMaisAprofundada3
     */
    private String[] identifiers_compreensaoMaisAprofundada3 = {
        "h",
        "e",
        "funcaoMRE"
    };

    /**
     * Returns the identifiers declared in rule compreensaoMaisAprofundada3
     *
     * @return the identifiers declared in rule compreensaoMaisAprofundada3
     */
    private String[] getDeclaredIdentifiers_compreensaoMaisAprofundada3() {
         return identifiers_compreensaoMaisAprofundada3;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule compreensaoMaisAprofundada3.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_compreensaoMaisAprofundada3(int index) {
        switch (index) {
            case 0: return "entidades.Historico";
            case 1: return "entidades.RespostaErrada";
            case 2: return "entidades.FuncaoMRE";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule compreensaoMaisAprofundada3.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_compreensaoMaisAprofundada3(int index) {
        switch (index) {
            case 0: return entidades.Historico.class;
            case 1: return entidades.RespostaErrada.class;
            case 2: return entidades.FuncaoMRE.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule compreensaoMaisAprofundada3.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_compreensaoMaisAprofundada3(int index, Object value) {
        switch (index) {
            case 0: this.entidades_Historico_1 = (entidades.Historico) value; break;
            case 1: this.entidades_RespostaErrada_1 = (entidades.RespostaErrada) value; break;
            case 2: this.entidades_FuncaoMRE_1 = (entidades.FuncaoMRE) value; break;
        }
    }

    /**
     * Returns an object declared in the rule compreensaoMaisAprofundada3.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_compreensaoMaisAprofundada3(int index) {
        switch (index) {
            case 0: return entidades_Historico_1;
            case 1: return entidades_RespostaErrada_1;
            case 2: return entidades_FuncaoMRE_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule compreensaoMaisAprofundada3
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_compreensaoMaisAprofundada3() {
        return new Object[] {
                            entidades_Historico_1,
                            entidades_RespostaErrada_1,
                            entidades_FuncaoMRE_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule compreensaoMaisAprofundada3
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_compreensaoMaisAprofundada3(Object[] objects) {
        entidades_Historico_1 = (entidades.Historico) objects[0];
        entidades_RespostaErrada_1 = (entidades.RespostaErrada) objects[1];
        entidades_FuncaoMRE_1 = (entidades.FuncaoMRE) objects[2];
    }

    /**
     * Condition 0 of rule compreensaoMaisAprofundada3.<p>
     * The original expression was:<br>
     * <code>e.getTipo() == Constantes.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean compreensaoMaisAprofundada3_cond_0() {
        return (entidades_RespostaErrada_1.getTipo() == Constantes.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL);
    }

    /**
     * Checks whether some conditions of rule compreensaoMaisAprofundada3 is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean compreensaoMaisAprofundada3_cond(int index) {
        switch (index) {
            case 0: return compreensaoMaisAprofundada3_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule compreensaoMaisAprofundada3 that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_compreensaoMaisAprofundada3(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!compreensaoMaisAprofundada3_cond_0()) return false;
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
    private boolean checkCondForDeclaration_compreensaoMaisAprofundada3(int declIndex) {
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
     * Executes the action part of the rule compreensaoMaisAprofundada3
     */
    private void compreensaoMaisAprofundada3() {
			entidades_FuncaoMRE_1.setTipo(Constantes.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
			modified(entidades_FuncaoMRE_1);
			System.out.println("Função MRE: Compreensão Mais Aprofundada");
			retract(entidades_Historico_1);
			retract(entidades_RespostaErrada_1);
			retract(entidades_FuncaoMRE_1);	
	    }



    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "papeisComplementares",
        "restricaoInterpretacao1",
        "restricaoInterpretacao2",
        "compreensaoMaisAprofundada1",
        "compreensaoMaisAprofundada2",
        "compreensaoMaisAprofundada3"
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
            case 0: return papeisComplementares_cond(condIndex);
            case 1: return restricaoInterpretacao1_cond(condIndex);
            case 2: return restricaoInterpretacao2_cond(condIndex);
            case 3: return compreensaoMaisAprofundada1_cond(condIndex);
            case 4: return compreensaoMaisAprofundada2_cond(condIndex);
            case 5: return compreensaoMaisAprofundada3_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_papeisComplementares(declIndex);
            case 1: return checkConditionsOnlyOf_restricaoInterpretacao1(declIndex);
            case 2: return checkConditionsOnlyOf_restricaoInterpretacao2(declIndex);
            case 3: return checkConditionsOnlyOf_compreensaoMaisAprofundada1(declIndex);
            case 4: return checkConditionsOnlyOf_compreensaoMaisAprofundada2(declIndex);
            case 5: return checkConditionsOnlyOf_compreensaoMaisAprofundada3(declIndex);
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
            case 0: return checkCondForDeclaration_papeisComplementares(declIndex);
            case 1: return checkCondForDeclaration_restricaoInterpretacao1(declIndex);
            case 2: return checkCondForDeclaration_restricaoInterpretacao2(declIndex);
            case 3: return checkCondForDeclaration_compreensaoMaisAprofundada1(declIndex);
            case 4: return checkCondForDeclaration_compreensaoMaisAprofundada2(declIndex);
            case 5: return checkCondForDeclaration_compreensaoMaisAprofundada3(declIndex);
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
            case 0: return getDeclaredClassName_papeisComplementares(declIndex);
            case 1: return getDeclaredClassName_restricaoInterpretacao1(declIndex);
            case 2: return getDeclaredClassName_restricaoInterpretacao2(declIndex);
            case 3: return getDeclaredClassName_compreensaoMaisAprofundada1(declIndex);
            case 4: return getDeclaredClassName_compreensaoMaisAprofundada2(declIndex);
            case 5: return getDeclaredClassName_compreensaoMaisAprofundada3(declIndex);
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
            case 0: return getDeclaredClass_papeisComplementares(declIndex);
            case 1: return getDeclaredClass_restricaoInterpretacao1(declIndex);
            case 2: return getDeclaredClass_restricaoInterpretacao2(declIndex);
            case 3: return getDeclaredClass_compreensaoMaisAprofundada1(declIndex);
            case 4: return getDeclaredClass_compreensaoMaisAprofundada2(declIndex);
            case 5: return getDeclaredClass_compreensaoMaisAprofundada3(declIndex);
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
            case 0: papeisComplementares(); break;
            case 1: restricaoInterpretacao1(); break;
            case 2: restricaoInterpretacao2(); break;
            case 3: compreensaoMaisAprofundada1(); break;
            case 4: compreensaoMaisAprofundada2(); break;
            case 5: compreensaoMaisAprofundada3(); break;
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
            case 0: return getDeclaredIdentifiers_papeisComplementares();
            case 1: return getDeclaredIdentifiers_restricaoInterpretacao1();
            case 2: return getDeclaredIdentifiers_restricaoInterpretacao2();
            case 3: return getDeclaredIdentifiers_compreensaoMaisAprofundada1();
            case 4: return getDeclaredIdentifiers_compreensaoMaisAprofundada2();
            case 5: return getDeclaredIdentifiers_compreensaoMaisAprofundada3();
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
            case 0: setObject_papeisComplementares(declIndex, value); break;
            case 1: setObject_restricaoInterpretacao1(declIndex, value); break;
            case 2: setObject_restricaoInterpretacao2(declIndex, value); break;
            case 3: setObject_compreensaoMaisAprofundada1(declIndex, value); break;
            case 4: setObject_compreensaoMaisAprofundada2(declIndex, value); break;
            case 5: setObject_compreensaoMaisAprofundada3(declIndex, value); break;
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
            case 0: return getObject_papeisComplementares(declIndex);
            case 1: return getObject_restricaoInterpretacao1(declIndex);
            case 2: return getObject_restricaoInterpretacao2(declIndex);
            case 3: return getObject_compreensaoMaisAprofundada1(declIndex);
            case 4: return getObject_compreensaoMaisAprofundada2(declIndex);
            case 5: return getObject_compreensaoMaisAprofundada3(declIndex);
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
            case 0: return getObjects_papeisComplementares();
            case 1: return getObjects_restricaoInterpretacao1();
            case 2: return getObjects_restricaoInterpretacao2();
            case 3: return getObjects_compreensaoMaisAprofundada1();
            case 4: return getObjects_compreensaoMaisAprofundada2();
            case 5: return getObjects_compreensaoMaisAprofundada3();
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
            case 0: setObjects_papeisComplementares(objects); break;
            case 1: setObjects_restricaoInterpretacao1(objects); break;
            case 2: setObjects_restricaoInterpretacao2(objects); break;
            case 3: setObjects_compreensaoMaisAprofundada1(objects); break;
            case 4: setObjects_compreensaoMaisAprofundada2(objects); break;
            case 5: setObjects_compreensaoMaisAprofundada3(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private entidades.Historico entidades_Historico_1;
    private entidades.RespostaErrada entidades_RespostaErrada_1;
    private entidades.FuncaoMRE entidades_FuncaoMRE_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_ClassificadorFuncaoMREBaseRegras(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file ClassificadorFuncaoMREBaseRegras.rules
 *
 * @version 03/04/2014
 */
public class ClassificadorFuncaoMREBaseRegras extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public ClassificadorFuncaoMREBaseRegras(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public ClassificadorFuncaoMREBaseRegras() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_ClassificadorFuncaoMREBaseRegras(this);
    }

}
