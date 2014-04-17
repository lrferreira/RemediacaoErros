package modulo.classificador.erro;
import modulo.classificador.funcaomre.ClassificadorFuncaoMREControlador;
import entidades.RespostaErrada;
import entidades.Historico;
import util.Constantes;


 class Jeops_RuleBase_ClassificadorErroBaseRegras extends jeops.AbstractRuleBase {
	
	
	
    /**
     * Identifiers of rule interpretacaoEquivocada
     */
    private String[] identifiers_interpretacaoEquivocada = {
        "h",
        "e"
    };

    /**
     * Returns the identifiers declared in rule interpretacaoEquivocada
     *
     * @return the identifiers declared in rule interpretacaoEquivocada
     */
    private String[] getDeclaredIdentifiers_interpretacaoEquivocada() {
         return identifiers_interpretacaoEquivocada;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule interpretacaoEquivocada.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_interpretacaoEquivocada(int index) {
        switch (index) {
            case 0: return "entidades.Historico";
            case 1: return "entidades.RespostaErrada";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule interpretacaoEquivocada.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_interpretacaoEquivocada(int index) {
        switch (index) {
            case 0: return entidades.Historico.class;
            case 1: return entidades.RespostaErrada.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule interpretacaoEquivocada.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_interpretacaoEquivocada(int index, Object value) {
        switch (index) {
            case 0: this.entidades_Historico_1 = (entidades.Historico) value; break;
            case 1: this.entidades_RespostaErrada_1 = (entidades.RespostaErrada) value; break;
        }
    }

    /**
     * Returns an object declared in the rule interpretacaoEquivocada.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_interpretacaoEquivocada(int index) {
        switch (index) {
            case 0: return entidades_Historico_1;
            case 1: return entidades_RespostaErrada_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule interpretacaoEquivocada
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_interpretacaoEquivocada() {
        return new Object[] {
                            entidades_Historico_1,
                            entidades_RespostaErrada_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule interpretacaoEquivocada
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_interpretacaoEquivocada(Object[] objects) {
        entidades_Historico_1 = (entidades.Historico) objects[0];
        entidades_RespostaErrada_1 = (entidades.RespostaErrada) objects[1];
    }

    /**
     * Condition 0 of rule interpretacaoEquivocada.<p>
     * The original expression was:<br>
     * <code>e.getDescricao().equalsIgnoreCase("1")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean interpretacaoEquivocada_cond_0() {
        return (entidades_RespostaErrada_1.getDescricao().equalsIgnoreCase("1"));
    }

    /**
     * Checks whether some conditions of rule interpretacaoEquivocada is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean interpretacaoEquivocada_cond(int index) {
        switch (index) {
            case 0: return interpretacaoEquivocada_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule interpretacaoEquivocada that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_interpretacaoEquivocada(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!interpretacaoEquivocada_cond_0()) return false;
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
    private boolean checkCondForDeclaration_interpretacaoEquivocada(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule interpretacaoEquivocada
     */
    private void interpretacaoEquivocada() {
			System.out.println("Erro classificado como Interpretação Equivocada");
			entidades_RespostaErrada_1.setTipo(Constantes.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA);
			modified(entidades_RespostaErrada_1);
			retract(entidades_Historico_1);
			retract(entidades_RespostaErrada_1);
	    }


	
	
    /**
     * Identifiers of rule diretamenteIdentificavelDeficienciaDominio
     */
    private String[] identifiers_diretamenteIdentificavelDeficienciaDominio = {
        "h",
        "e"
    };

    /**
     * Returns the identifiers declared in rule diretamenteIdentificavelDeficienciaDominio
     *
     * @return the identifiers declared in rule diretamenteIdentificavelDeficienciaDominio
     */
    private String[] getDeclaredIdentifiers_diretamenteIdentificavelDeficienciaDominio() {
         return identifiers_diretamenteIdentificavelDeficienciaDominio;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule diretamenteIdentificavelDeficienciaDominio.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_diretamenteIdentificavelDeficienciaDominio(int index) {
        switch (index) {
            case 0: return "entidades.Historico";
            case 1: return "entidades.RespostaErrada";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule diretamenteIdentificavelDeficienciaDominio.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_diretamenteIdentificavelDeficienciaDominio(int index) {
        switch (index) {
            case 0: return entidades.Historico.class;
            case 1: return entidades.RespostaErrada.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule diretamenteIdentificavelDeficienciaDominio.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_diretamenteIdentificavelDeficienciaDominio(int index, Object value) {
        switch (index) {
            case 0: this.entidades_Historico_1 = (entidades.Historico) value; break;
            case 1: this.entidades_RespostaErrada_1 = (entidades.RespostaErrada) value; break;
        }
    }

    /**
     * Returns an object declared in the rule diretamenteIdentificavelDeficienciaDominio.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_diretamenteIdentificavelDeficienciaDominio(int index) {
        switch (index) {
            case 0: return entidades_Historico_1;
            case 1: return entidades_RespostaErrada_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule diretamenteIdentificavelDeficienciaDominio
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_diretamenteIdentificavelDeficienciaDominio() {
        return new Object[] {
                            entidades_Historico_1,
                            entidades_RespostaErrada_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule diretamenteIdentificavelDeficienciaDominio
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_diretamenteIdentificavelDeficienciaDominio(Object[] objects) {
        entidades_Historico_1 = (entidades.Historico) objects[0];
        entidades_RespostaErrada_1 = (entidades.RespostaErrada) objects[1];
    }

    /**
     * Condition 0 of rule diretamenteIdentificavelDeficienciaDominio.<p>
     * The original expression was:<br>
     * <code>e.getDescricao().equalsIgnoreCase("2")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean diretamenteIdentificavelDeficienciaDominio_cond_0() {
        return (entidades_RespostaErrada_1.getDescricao().equalsIgnoreCase("2"));
    }

    /**
     * Checks whether some conditions of rule diretamenteIdentificavelDeficienciaDominio is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean diretamenteIdentificavelDeficienciaDominio_cond(int index) {
        switch (index) {
            case 0: return diretamenteIdentificavelDeficienciaDominio_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule diretamenteIdentificavelDeficienciaDominio that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_diretamenteIdentificavelDeficienciaDominio(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!diretamenteIdentificavelDeficienciaDominio_cond_0()) return false;
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
    private boolean checkCondForDeclaration_diretamenteIdentificavelDeficienciaDominio(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule diretamenteIdentificavelDeficienciaDominio
     */
    private void diretamenteIdentificavelDeficienciaDominio() {
			System.out.println("Erro classificado como Diretamente Identificável - Deficiência no Domínio");		
			entidades_RespostaErrada_1.setTipo(Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO);
			modified(entidades_RespostaErrada_1);			
			retract(entidades_Historico_1);
			retract(entidades_RespostaErrada_1);	
	    }


	
	
    /**
     * Identifiers of rule diretamenteIdentificavelDeficienciaRegra
     */
    private String[] identifiers_diretamenteIdentificavelDeficienciaRegra = {
        "h",
        "e"
    };

    /**
     * Returns the identifiers declared in rule diretamenteIdentificavelDeficienciaRegra
     *
     * @return the identifiers declared in rule diretamenteIdentificavelDeficienciaRegra
     */
    private String[] getDeclaredIdentifiers_diretamenteIdentificavelDeficienciaRegra() {
         return identifiers_diretamenteIdentificavelDeficienciaRegra;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule diretamenteIdentificavelDeficienciaRegra.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_diretamenteIdentificavelDeficienciaRegra(int index) {
        switch (index) {
            case 0: return "entidades.Historico";
            case 1: return "entidades.RespostaErrada";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule diretamenteIdentificavelDeficienciaRegra.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_diretamenteIdentificavelDeficienciaRegra(int index) {
        switch (index) {
            case 0: return entidades.Historico.class;
            case 1: return entidades.RespostaErrada.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule diretamenteIdentificavelDeficienciaRegra.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_diretamenteIdentificavelDeficienciaRegra(int index, Object value) {
        switch (index) {
            case 0: this.entidades_Historico_1 = (entidades.Historico) value; break;
            case 1: this.entidades_RespostaErrada_1 = (entidades.RespostaErrada) value; break;
        }
    }

    /**
     * Returns an object declared in the rule diretamenteIdentificavelDeficienciaRegra.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_diretamenteIdentificavelDeficienciaRegra(int index) {
        switch (index) {
            case 0: return entidades_Historico_1;
            case 1: return entidades_RespostaErrada_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule diretamenteIdentificavelDeficienciaRegra
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_diretamenteIdentificavelDeficienciaRegra() {
        return new Object[] {
                            entidades_Historico_1,
                            entidades_RespostaErrada_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule diretamenteIdentificavelDeficienciaRegra
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_diretamenteIdentificavelDeficienciaRegra(Object[] objects) {
        entidades_Historico_1 = (entidades.Historico) objects[0];
        entidades_RespostaErrada_1 = (entidades.RespostaErrada) objects[1];
    }

    /**
     * Condition 0 of rule diretamenteIdentificavelDeficienciaRegra.<p>
     * The original expression was:<br>
     * <code>e.getDescricao().equalsIgnoreCase("3")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean diretamenteIdentificavelDeficienciaRegra_cond_0() {
        return (entidades_RespostaErrada_1.getDescricao().equalsIgnoreCase("3"));
    }

    /**
     * Checks whether some conditions of rule diretamenteIdentificavelDeficienciaRegra is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean diretamenteIdentificavelDeficienciaRegra_cond(int index) {
        switch (index) {
            case 0: return diretamenteIdentificavelDeficienciaRegra_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule diretamenteIdentificavelDeficienciaRegra that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_diretamenteIdentificavelDeficienciaRegra(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!diretamenteIdentificavelDeficienciaRegra_cond_0()) return false;
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
    private boolean checkCondForDeclaration_diretamenteIdentificavelDeficienciaRegra(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule diretamenteIdentificavelDeficienciaRegra
     */
    private void diretamenteIdentificavelDeficienciaRegra() {
			System.out.println("Erro classificado como Diretamente Identificável - Deficiência na Regra");		
			entidades_RespostaErrada_1.setTipo(Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_REGRA);
			modified(entidades_RespostaErrada_1);			
			retract(entidades_Historico_1);
			retract(entidades_RespostaErrada_1);	
	    }


	
	
    /**
     * Identifiers of rule diretamenteIdentificavelDeficienciaEscolhaOperador
     */
    private String[] identifiers_diretamenteIdentificavelDeficienciaEscolhaOperador = {
        "h",
        "e"
    };

    /**
     * Returns the identifiers declared in rule diretamenteIdentificavelDeficienciaEscolhaOperador
     *
     * @return the identifiers declared in rule diretamenteIdentificavelDeficienciaEscolhaOperador
     */
    private String[] getDeclaredIdentifiers_diretamenteIdentificavelDeficienciaEscolhaOperador() {
         return identifiers_diretamenteIdentificavelDeficienciaEscolhaOperador;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule diretamenteIdentificavelDeficienciaEscolhaOperador.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_diretamenteIdentificavelDeficienciaEscolhaOperador(int index) {
        switch (index) {
            case 0: return "entidades.Historico";
            case 1: return "entidades.RespostaErrada";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule diretamenteIdentificavelDeficienciaEscolhaOperador.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_diretamenteIdentificavelDeficienciaEscolhaOperador(int index) {
        switch (index) {
            case 0: return entidades.Historico.class;
            case 1: return entidades.RespostaErrada.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule diretamenteIdentificavelDeficienciaEscolhaOperador.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_diretamenteIdentificavelDeficienciaEscolhaOperador(int index, Object value) {
        switch (index) {
            case 0: this.entidades_Historico_1 = (entidades.Historico) value; break;
            case 1: this.entidades_RespostaErrada_1 = (entidades.RespostaErrada) value; break;
        }
    }

    /**
     * Returns an object declared in the rule diretamenteIdentificavelDeficienciaEscolhaOperador.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_diretamenteIdentificavelDeficienciaEscolhaOperador(int index) {
        switch (index) {
            case 0: return entidades_Historico_1;
            case 1: return entidades_RespostaErrada_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule diretamenteIdentificavelDeficienciaEscolhaOperador
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_diretamenteIdentificavelDeficienciaEscolhaOperador() {
        return new Object[] {
                            entidades_Historico_1,
                            entidades_RespostaErrada_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule diretamenteIdentificavelDeficienciaEscolhaOperador
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_diretamenteIdentificavelDeficienciaEscolhaOperador(Object[] objects) {
        entidades_Historico_1 = (entidades.Historico) objects[0];
        entidades_RespostaErrada_1 = (entidades.RespostaErrada) objects[1];
    }

    /**
     * Condition 0 of rule diretamenteIdentificavelDeficienciaEscolhaOperador.<p>
     * The original expression was:<br>
     * <code>e.getDescricao().equalsIgnoreCase("4")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean diretamenteIdentificavelDeficienciaEscolhaOperador_cond_0() {
        return (entidades_RespostaErrada_1.getDescricao().equalsIgnoreCase("4"));
    }

    /**
     * Checks whether some conditions of rule diretamenteIdentificavelDeficienciaEscolhaOperador is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean diretamenteIdentificavelDeficienciaEscolhaOperador_cond(int index) {
        switch (index) {
            case 0: return diretamenteIdentificavelDeficienciaEscolhaOperador_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule diretamenteIdentificavelDeficienciaEscolhaOperador that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_diretamenteIdentificavelDeficienciaEscolhaOperador(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!diretamenteIdentificavelDeficienciaEscolhaOperador_cond_0()) return false;
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
    private boolean checkCondForDeclaration_diretamenteIdentificavelDeficienciaEscolhaOperador(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule diretamenteIdentificavelDeficienciaEscolhaOperador
     */
    private void diretamenteIdentificavelDeficienciaEscolhaOperador() {
			System.out.println("Erro classificado como Diretamente Identificável - Deficiência na Escolha do Operador Correto");
			entidades_RespostaErrada_1.setTipo(Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR);	
			modified(entidades_RespostaErrada_1);
			retract(entidades_Historico_1);
			retract(entidades_RespostaErrada_1);			
	    }


	
	
    /**
     * Identifiers of rule indiretamenteIdentificavel
     */
    private String[] identifiers_indiretamenteIdentificavel = {
        "h",
        "e"
    };

    /**
     * Returns the identifiers declared in rule indiretamenteIdentificavel
     *
     * @return the identifiers declared in rule indiretamenteIdentificavel
     */
    private String[] getDeclaredIdentifiers_indiretamenteIdentificavel() {
         return identifiers_indiretamenteIdentificavel;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule indiretamenteIdentificavel.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_indiretamenteIdentificavel(int index) {
        switch (index) {
            case 0: return "entidades.Historico";
            case 1: return "entidades.RespostaErrada";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule indiretamenteIdentificavel.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_indiretamenteIdentificavel(int index) {
        switch (index) {
            case 0: return entidades.Historico.class;
            case 1: return entidades.RespostaErrada.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule indiretamenteIdentificavel.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_indiretamenteIdentificavel(int index, Object value) {
        switch (index) {
            case 0: this.entidades_Historico_1 = (entidades.Historico) value; break;
            case 1: this.entidades_RespostaErrada_1 = (entidades.RespostaErrada) value; break;
        }
    }

    /**
     * Returns an object declared in the rule indiretamenteIdentificavel.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_indiretamenteIdentificavel(int index) {
        switch (index) {
            case 0: return entidades_Historico_1;
            case 1: return entidades_RespostaErrada_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule indiretamenteIdentificavel
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_indiretamenteIdentificavel() {
        return new Object[] {
                            entidades_Historico_1,
                            entidades_RespostaErrada_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule indiretamenteIdentificavel
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_indiretamenteIdentificavel(Object[] objects) {
        entidades_Historico_1 = (entidades.Historico) objects[0];
        entidades_RespostaErrada_1 = (entidades.RespostaErrada) objects[1];
    }

    /**
     * Condition 0 of rule indiretamenteIdentificavel.<p>
     * The original expression was:<br>
     * <code>e.getDescricao().equalsIgnoreCase("5")</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean indiretamenteIdentificavel_cond_0() {
        return (entidades_RespostaErrada_1.getDescricao().equalsIgnoreCase("5"));
    }

    /**
     * Checks whether some conditions of rule indiretamenteIdentificavel is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean indiretamenteIdentificavel_cond(int index) {
        switch (index) {
            case 0: return indiretamenteIdentificavel_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule indiretamenteIdentificavel that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_indiretamenteIdentificavel(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!indiretamenteIdentificavel_cond_0()) return false;
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
    private boolean checkCondForDeclaration_indiretamenteIdentificavel(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule indiretamenteIdentificavel
     */
    private void indiretamenteIdentificavel() {
			System.out.println("Erro classificado como Indiretamente Identificável");		
			entidades_RespostaErrada_1.setTipo(Constantes.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL);	
			modified(entidades_RespostaErrada_1);
			retract(entidades_Historico_1);
			retract(entidades_RespostaErrada_1);			
	    }


	
	
    /**
     * Identifiers of rule solucaoNaoCategorizavel
     */
    private String[] identifiers_solucaoNaoCategorizavel = {
        "h",
        "e"
    };

    /**
     * Returns the identifiers declared in rule solucaoNaoCategorizavel
     *
     * @return the identifiers declared in rule solucaoNaoCategorizavel
     */
    private String[] getDeclaredIdentifiers_solucaoNaoCategorizavel() {
         return identifiers_solucaoNaoCategorizavel;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule solucaoNaoCategorizavel.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_solucaoNaoCategorizavel(int index) {
        switch (index) {
            case 0: return "entidades.Historico";
            case 1: return "entidades.RespostaErrada";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule solucaoNaoCategorizavel.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_solucaoNaoCategorizavel(int index) {
        switch (index) {
            case 0: return entidades.Historico.class;
            case 1: return entidades.RespostaErrada.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule solucaoNaoCategorizavel.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_solucaoNaoCategorizavel(int index, Object value) {
        switch (index) {
            case 0: this.entidades_Historico_1 = (entidades.Historico) value; break;
            case 1: this.entidades_RespostaErrada_1 = (entidades.RespostaErrada) value; break;
        }
    }

    /**
     * Returns an object declared in the rule solucaoNaoCategorizavel.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_solucaoNaoCategorizavel(int index) {
        switch (index) {
            case 0: return entidades_Historico_1;
            case 1: return entidades_RespostaErrada_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule solucaoNaoCategorizavel
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_solucaoNaoCategorizavel() {
        return new Object[] {
                            entidades_Historico_1,
                            entidades_RespostaErrada_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule solucaoNaoCategorizavel
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_solucaoNaoCategorizavel(Object[] objects) {
        entidades_Historico_1 = (entidades.Historico) objects[0];
        entidades_RespostaErrada_1 = (entidades.RespostaErrada) objects[1];
    }

    /**
     * Checks whether some conditions of rule solucaoNaoCategorizavel is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean solucaoNaoCategorizavel_cond(int index) {
        switch (index) {
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule solucaoNaoCategorizavel that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_solucaoNaoCategorizavel(int declIndex) {
        switch (declIndex) {
            case 0:
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
    private boolean checkCondForDeclaration_solucaoNaoCategorizavel(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule solucaoNaoCategorizavel
     */
    private void solucaoNaoCategorizavel() {
			System.out.println("Resposta Errada classificada como Solução Não Categorizável");		
			entidades_RespostaErrada_1.setTipo(Constantes.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL);	
			modified(entidades_RespostaErrada_1);
			retract(entidades_Historico_1);
			retract(entidades_RespostaErrada_1);			
	    }


	
	

    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "interpretacaoEquivocada",
        "diretamenteIdentificavelDeficienciaDominio",
        "diretamenteIdentificavelDeficienciaRegra",
        "diretamenteIdentificavelDeficienciaEscolhaOperador",
        "indiretamenteIdentificavel",
        "solucaoNaoCategorizavel"
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
        1,
        1,
        1,
        1,
        1,
        0
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
            case 0: return interpretacaoEquivocada_cond(condIndex);
            case 1: return diretamenteIdentificavelDeficienciaDominio_cond(condIndex);
            case 2: return diretamenteIdentificavelDeficienciaRegra_cond(condIndex);
            case 3: return diretamenteIdentificavelDeficienciaEscolhaOperador_cond(condIndex);
            case 4: return indiretamenteIdentificavel_cond(condIndex);
            case 5: return solucaoNaoCategorizavel_cond(condIndex);
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
            case 0: return checkConditionsOnlyOf_interpretacaoEquivocada(declIndex);
            case 1: return checkConditionsOnlyOf_diretamenteIdentificavelDeficienciaDominio(declIndex);
            case 2: return checkConditionsOnlyOf_diretamenteIdentificavelDeficienciaRegra(declIndex);
            case 3: return checkConditionsOnlyOf_diretamenteIdentificavelDeficienciaEscolhaOperador(declIndex);
            case 4: return checkConditionsOnlyOf_indiretamenteIdentificavel(declIndex);
            case 5: return checkConditionsOnlyOf_solucaoNaoCategorizavel(declIndex);
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
            case 0: return checkCondForDeclaration_interpretacaoEquivocada(declIndex);
            case 1: return checkCondForDeclaration_diretamenteIdentificavelDeficienciaDominio(declIndex);
            case 2: return checkCondForDeclaration_diretamenteIdentificavelDeficienciaRegra(declIndex);
            case 3: return checkCondForDeclaration_diretamenteIdentificavelDeficienciaEscolhaOperador(declIndex);
            case 4: return checkCondForDeclaration_indiretamenteIdentificavel(declIndex);
            case 5: return checkCondForDeclaration_solucaoNaoCategorizavel(declIndex);
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
            case 0: return getDeclaredClassName_interpretacaoEquivocada(declIndex);
            case 1: return getDeclaredClassName_diretamenteIdentificavelDeficienciaDominio(declIndex);
            case 2: return getDeclaredClassName_diretamenteIdentificavelDeficienciaRegra(declIndex);
            case 3: return getDeclaredClassName_diretamenteIdentificavelDeficienciaEscolhaOperador(declIndex);
            case 4: return getDeclaredClassName_indiretamenteIdentificavel(declIndex);
            case 5: return getDeclaredClassName_solucaoNaoCategorizavel(declIndex);
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
            case 0: return getDeclaredClass_interpretacaoEquivocada(declIndex);
            case 1: return getDeclaredClass_diretamenteIdentificavelDeficienciaDominio(declIndex);
            case 2: return getDeclaredClass_diretamenteIdentificavelDeficienciaRegra(declIndex);
            case 3: return getDeclaredClass_diretamenteIdentificavelDeficienciaEscolhaOperador(declIndex);
            case 4: return getDeclaredClass_indiretamenteIdentificavel(declIndex);
            case 5: return getDeclaredClass_solucaoNaoCategorizavel(declIndex);
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
            case 0: interpretacaoEquivocada(); break;
            case 1: diretamenteIdentificavelDeficienciaDominio(); break;
            case 2: diretamenteIdentificavelDeficienciaRegra(); break;
            case 3: diretamenteIdentificavelDeficienciaEscolhaOperador(); break;
            case 4: indiretamenteIdentificavel(); break;
            case 5: solucaoNaoCategorizavel(); break;
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
            case 0: return getDeclaredIdentifiers_interpretacaoEquivocada();
            case 1: return getDeclaredIdentifiers_diretamenteIdentificavelDeficienciaDominio();
            case 2: return getDeclaredIdentifiers_diretamenteIdentificavelDeficienciaRegra();
            case 3: return getDeclaredIdentifiers_diretamenteIdentificavelDeficienciaEscolhaOperador();
            case 4: return getDeclaredIdentifiers_indiretamenteIdentificavel();
            case 5: return getDeclaredIdentifiers_solucaoNaoCategorizavel();
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
            case 0: setObject_interpretacaoEquivocada(declIndex, value); break;
            case 1: setObject_diretamenteIdentificavelDeficienciaDominio(declIndex, value); break;
            case 2: setObject_diretamenteIdentificavelDeficienciaRegra(declIndex, value); break;
            case 3: setObject_diretamenteIdentificavelDeficienciaEscolhaOperador(declIndex, value); break;
            case 4: setObject_indiretamenteIdentificavel(declIndex, value); break;
            case 5: setObject_solucaoNaoCategorizavel(declIndex, value); break;
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
            case 0: return getObject_interpretacaoEquivocada(declIndex);
            case 1: return getObject_diretamenteIdentificavelDeficienciaDominio(declIndex);
            case 2: return getObject_diretamenteIdentificavelDeficienciaRegra(declIndex);
            case 3: return getObject_diretamenteIdentificavelDeficienciaEscolhaOperador(declIndex);
            case 4: return getObject_indiretamenteIdentificavel(declIndex);
            case 5: return getObject_solucaoNaoCategorizavel(declIndex);
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
            case 0: return getObjects_interpretacaoEquivocada();
            case 1: return getObjects_diretamenteIdentificavelDeficienciaDominio();
            case 2: return getObjects_diretamenteIdentificavelDeficienciaRegra();
            case 3: return getObjects_diretamenteIdentificavelDeficienciaEscolhaOperador();
            case 4: return getObjects_indiretamenteIdentificavel();
            case 5: return getObjects_solucaoNaoCategorizavel();
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
            case 0: setObjects_interpretacaoEquivocada(objects); break;
            case 1: setObjects_diretamenteIdentificavelDeficienciaDominio(objects); break;
            case 2: setObjects_diretamenteIdentificavelDeficienciaRegra(objects); break;
            case 3: setObjects_diretamenteIdentificavelDeficienciaEscolhaOperador(objects); break;
            case 4: setObjects_indiretamenteIdentificavel(objects); break;
            case 5: setObjects_solucaoNaoCategorizavel(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private entidades.Historico entidades_Historico_1;
    private entidades.RespostaErrada entidades_RespostaErrada_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_ClassificadorErroBaseRegras(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}

/**
 * Knowledge base created by JEOPS from file ClassificadorErroBaseRegras.rules
 *
 * @version 03/04/2014
 */
public class ClassificadorErroBaseRegras extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public ClassificadorErroBaseRegras(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public ClassificadorErroBaseRegras() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_ClassificadorErroBaseRegras(this);
    }

}
