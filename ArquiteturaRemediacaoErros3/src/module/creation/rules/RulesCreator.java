package module.creation.rules;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import jeops.compiler.Main;
import util.Constantes;
import util.ConstantesString;
import entity.CorrectAnswer;
import entity.MERFunction;
import entity.MultipleExternalRepresentation;
import entity.RuleInformation;
import entity.WrongAnswer;

public class RulesCreator {
	
	public static void createRules(WrongAnswer wrongAnswer, MERFunction merFunction, 
								MultipleExternalRepresentation mer) {
	
		// create for Expressions Identifier

		editFileRule(ConstantesString.FILE_EXPRESSION_IDENTIFIER_WRONG_ANSWER_KB, ruleWrongAnswer(wrongAnswer));
		Main.main(new String[]{ConstantesString.FILE_EXPRESSION_IDENTIFIER_WRONG_ANSWER_KB});
		
		// create for Error Sorter AND create for MER Function Sorter

		switch (wrongAnswer.getTipo()){
			case Constantes.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA:
				editFileRule(ConstantesString.FILE_ERROR_SORTER_KB, ruleMisinterpretation(wrongAnswer));
				editFileRule(ConstantesString.FILE_MERFUNCTION_SORTER_KB, ruleComplementaryRoles(wrongAnswer));
				break;
			case Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO:
				editFileRule(ConstantesString.FILE_ERROR_SORTER_KB, ruleDirectlyIdentifiableDeficiencyDomain(wrongAnswer));				
				editFileRule(ConstantesString.FILE_MERFUNCTION_SORTER_KB, ruleConstrainInterpretation01(wrongAnswer));
				break;
			case Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR:
				editFileRule(ConstantesString.FILE_ERROR_SORTER_KB, ruleDirectlyIdentifiableDeficiencyOperatorChoice(wrongAnswer));								
				editFileRule(ConstantesString.FILE_MERFUNCTION_SORTER_KB, ruleConstructDeeperUndestanding02(wrongAnswer));
				break;
			case Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_REGRA:
				editFileRule(ConstantesString.FILE_ERROR_SORTER_KB, ruleDirectlyIdentifiableDeficiencyRule(wrongAnswer));
				editFileRule(ConstantesString.FILE_MERFUNCTION_SORTER_KB, ruleConstructDeeperUndestanding01(wrongAnswer));
				break;
			case Constantes.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL:
				editFileRule(ConstantesString.FILE_ERROR_SORTER_KB, ruleIndirectlyIdentifiable(wrongAnswer));
				editFileRule(ConstantesString.FILE_MERFUNCTION_SORTER_KB, ruleConstrainInterpretation02(wrongAnswer));
				break;
			case Constantes.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL:
				editFileRule(ConstantesString.FILE_ERROR_SORTER_KB, ruleSolutionNonCategorizable(wrongAnswer));								
				editFileRule(ConstantesString.FILE_MERFUNCTION_SORTER_KB, ruleConstructDeeperUndestanding03(wrongAnswer));
				break;
		}

		Main.main(new String[]{ConstantesString.FILE_ERROR_SORTER_KB});
		Main.main(new String[]{ConstantesString.FILE_MERFUNCTION_SORTER_KB});
		
		
		// create for MER Manager
		
	}

	/**
	 * Edit an existing rule file, putting a new rule in the file end.
	 * @author leandro
	 * @param fileName
	 * @param ruleInformation
	 */
	public static void editFileRule(String fileName, RuleInformation ruleInformation){
		
		try {
			String fileNameTemp = fileName + "_temp";
			BufferedReader in;
			in = new BufferedReader(new FileReader(fileName));
			BufferedWriter out = new BufferedWriter(new FileWriter(fileNameTemp));  
		   
			String str;
			int contRule = 0;
		    	while ((str = in.readLine()) != null) {  
		    		System.out.println(str);  
		    		if (str.contains("rule "))
		    			contRule++;
		    		if (str.equalsIgnoreCase(ConstantesString.END_RULES)) {
		    			ruleInformation.setRuleName(ruleInformation.getRuleName() + contRule);
		    			// insert new rule here
		    			writeFileRule(out, ruleInformation);
		    		}
		    		out.write(str); out.write("\n");
		    	}  
		    
		    in.close();
		   	out.close();
		   
		   	File file = new File(fileName);
		   	File tempFile = new File(fileNameTemp);
		   
		   	if (file.delete()) {
		   		if (tempFile.renameTo(file)) {
		   			tempFile.delete();
		   		}
		   	}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/**
	 * An auxiliary function for editFileRule().
	 * This function appends informations of a new rule in the end of a file.
	 * @author leandro
	 * @param out
	 * @param ruleInformation
	 */
	public static void writeFileRule(BufferedWriter out, RuleInformation ruleInformation){
		
		try {

			out.write("\n\trule "+ ruleInformation.getRuleName()+" {\n\n");
			
			out.write("\t\tdeclarations\n");
			if (ruleInformation.getDeclarations() != null)
				for (String d : ruleInformation.getDeclarations()) {
					out.write("\t\t\t"); out.write(d); out.write("\n");
				}
			out.write("\n");
			
			out.write("\t\tlocaldecl\n");
			if (ruleInformation.getLocaldecl() != null)
				for (String l : ruleInformation.getLocaldecl()) {
					out.write("\t\t\t"); out.write(l); out.write("\n");
				}
			out.write("\n");
			
			out.write("\t\tconditions\n");
			if (ruleInformation.getConditions() != null)
				for (String c : ruleInformation.getConditions()) {
					out.write("\t\t\t"); out.write(c); out.write("\n");
				}
			out.write("\n");
			
			out.write("\t\tactions\n");
			if (ruleInformation.getActions() != null)
				for (String a : ruleInformation.getActions()) {
					out.write("\t\t\t"); out.write(a); out.write("\n");
				}
			out.write("\n");
			
			out.write("\t}\n\n");
		   
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	/* Rules for Expression Identifier */
	
	public static RuleInformation ruleWrongAnswer(WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("wrongAnswer_");
		r.setDeclarations(new String[] {
				"Historic h;", 
				"WrongAnswer wrongAnswer;"
		});
		r.setConditions(new String[] {
				"h.getResposta().getDescricao().equalsIgnoreCase(\""+wrongAnswer.getDescricao()+"\");"		
		});
		r.setActions(new String[] {
				"h.setNumeroTentativas(h.getNumeroTentativas() + 1);",
				"modified(h);",
				"System.out.println(\"Resposta Errada (1) detectada\");",
				"wrongAnswer.setDescricao(h.getResposta().getDescricao());",
				"modified(wrongAnswer);",
				"flush();"
		});
		
		return r;
	}

	public static RuleInformation ruleCorrectAnswer(CorrectAnswer correctAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("correctAnswer_");
		r.setDeclarations(new String[] {
				"Historic h;", 
				"CorrectAnswer correctAnswer;"
		});
		r.setConditions(new String[] {
				"h.getResposta().getDescricao().equalsIgnoreCase(\""+correctAnswer.getDescricao()+"\");"		
		});
		r.setActions(new String[] {
				"System.out.println(\"Resposta Correta (1) detectada\");",
				"correctAnswer.setDescricao(h.getResposta().getDescricao());",
				"modified(correctAnswer);",
				"flush();"
		});
		
		return r;
	}

	/* Rules for Error Sorter */
	
	public static RuleInformation ruleMisinterpretation(WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("misinterpretation_");
		r.setDeclarations(new String[] {
				//"Historic h;", 
				"WrongAnswer wrongAnswer;"
		});
		r.setConditions(new String[] {
				"wrongAnwser.getDescricao().equalsIgnoreCase(\""+wrongAnswer.getDescricao()+"\");"		
		});
		r.setActions(new String[] {
				"System.out.println(\"Erro classificado como Interpretação Equivocada\");",
				"wrongAnswer.setTipo(Constantes.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA);",
				"modified(wrongAnswer);",
				"flush();"
		});
		
		return r;
	}
	
	public static RuleInformation ruleDirectlyIdentifiableDeficiencyDomain(WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("directlyIdentifiableDeficiencyDomain_");
		r.setDeclarations(new String[] {
				//"Historic h;", 
				"WrongAnswer wrongAnswer;"
		});
		r.setConditions(new String[] {
				"wrongAnwser.getDescricao().equalsIgnoreCase(\""+wrongAnswer.getDescricao()+"\");"		
		});
		r.setActions(new String[] {
				"System.out.println(\"Erro classificado como Diretamente Identificável - Deficiência no Domínio\");",		
				"wrongAnswer.setTipo(Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO);",
				"modified(wrongAnswer);",
				"flush();"
		});
		
		return r;
	}
		
	public static RuleInformation ruleDirectlyIdentifiableDeficiencyRule(WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("directlyIdentifiableDeficiencyRule_");
		r.setDeclarations(new String[] {
				//"Historic h;", 
				"WrongAnswer wrongAnswer;"
		});
		r.setConditions(new String[] {
				"wrongAnwser.getDescricao().equalsIgnoreCase(\""+wrongAnswer.getDescricao()+"\");"		
		});
		r.setActions(new String[] {
				"System.out.println(\"Erro classificado como Diretamente Identificável - Deficiência na Regra\");",		
				"wrongAnswer.setTipo(Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_REGRA);",
				"modified(wrongAnswer);",
				"flush();"
		});
		
		return r;
	}

	public static RuleInformation ruleDirectlyIdentifiableDeficiencyOperatorChoice(WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("directlyIdentifiableDeficiencyOperatorChoice_");
		r.setDeclarations(new String[] {
				//"Historic h;", 
				"WrongAnswer wrongAnswer;"
		});
		r.setConditions(new String[] {
				"wrongAnwser.getDescricao().equalsIgnoreCase(\""+wrongAnswer.getDescricao()+"\");"		
		});
		r.setActions(new String[] {
				"System.out.println(\"Erro classificado como Diretamente Identificável - Deficiência na Escolha do Operador\");",		
				"wrongAnswer.setTipo(Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR);",
				"modified(wrongAnswer);",
				"flush();"
		});
		
		return r;
	}

	public static RuleInformation ruleIndirectlyIdentifiable(WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("indirectlyIdentifiable_");
		r.setDeclarations(new String[] {
				//"Historic h;", 
				"WrongAnswer wrongAnswer;"
		});
		r.setConditions(new String[] {
				"wrongAnwser.getDescricao().equalsIgnoreCase(\""+wrongAnswer.getDescricao()+"\");"		
		});
		r.setActions(new String[] {
				"System.out.println(\"Erro classificado como Indiretamente Identificável\");",		
				"wrongAnswer.setTipo(Constantes.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL);",
				"modified(wrongAnswer);",
				"flush();"
		});
		
		return r;
	}

	public static RuleInformation ruleSolutionNonCategorizable(WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("solutionNonCategorizable_");
		r.setDeclarations(new String[] {
				//"Historic h;", 
				"WrongAnswer wrongAnswer;"
		});
		r.setConditions(new String[] {
				"wrongAnwser.getDescricao().equalsIgnoreCase(\""+wrongAnswer.getDescricao()+"\");"		
		});
		r.setActions(new String[] {
				"System.out.println(\"Erro classificado como Solução Não Categorizável\");",		
				"wrongAnswer.setTipo(Constantes.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL);",
				"modified(wrongAnswer);",
				"flush();"
		});
		
		return r;
	}
	
	/* Rules for MER Functions Sorter */

	public static RuleInformation ruleComplementaryRoles(WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("complementaryRoles_");
		r.setDeclarations(new String[] {
				//"Historic h;", 
				"WrongAnswer wrongAnswer;",
				"MERFunction merFunction;"
		});
		r.setConditions(new String[] {
				"wrongAnswer.getTipo() == Constantes.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA;"		
		});
		r.setActions(new String[] {
				"merFunction.setTipo(Constantes.TIPO_FUNCAOMRE_PAPEIS_COMPLEMENTARES);",
				"modified(merFunction);",
				"System.out.println(\"Função MRE: Papéis Complementares\");",
				"flush();"
		});
		
		return r;
	}	
	
	public static RuleInformation ruleConstrainInterpretation01(WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("constrainInterpretation01_");
		r.setDeclarations(new String[] {
				//"Historic h;", 
				"WrongAnswer wrongAnswer;",
				"MERFunction merFunction;"
		});
		r.setConditions(new String[] {
				"wrongAnswer.getTipo() == Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO;"		
		});
		r.setActions(new String[] {
				"merFunction.setTipo(Constantes.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);",
				"modified(merFunction);",
				"System.out.println(\"Função MRE: Restrição Interpretação\");",		
				"flush();"
		});
		
		return r;
	}	

	public static RuleInformation ruleConstrainInterpretation02(WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("constrainInterpretation02_");
		r.setDeclarations(new String[] {
				//"Historic h;", 
				"WrongAnswer wrongAnswer;",
				"MERFunction merFunction;"
		});
		r.setConditions(new String[] {
				"wrongAnswer.getTipo() == Constantes.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL;"		
		});
		r.setActions(new String[] {
				"merFunction.setTipo(Constantes.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);",
				"modified(merFunction);",
				"System.out.println(\"Função MRE: Restrição Interpretação\");",		
				"flush();"
		});
		
		return r;
	}	
	
	public static RuleInformation ruleConstructDeeperUndestanding01(WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("constructDeeperUnderstanding01_");
		r.setDeclarations(new String[] {
				//"Historic h;", 
				"WrongAnswer wrongAnswer;",
				"MERFunction merFunction;"
		});
		r.setConditions(new String[] {
				"wrongAnswer.getTipo() == Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_REGRA;"		
		});
		r.setActions(new String[] {
				"merFunction.setTipo(Constantes.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);",
				"modified(merFunction);",
				"System.out.println(\"Função MRE: Compreensão Mais Aprofundada\");",		
				"flush();"
		});
		
		return r;
	}	

	public static RuleInformation ruleConstructDeeperUndestanding02(WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("constructDeeperUnderstanding02_");
		r.setDeclarations(new String[] {
				//"Historic h;", 
				"WrongAnswer wrongAnswer;",
				"MERFunction merFunction;"
		});
		r.setConditions(new String[] {
				"wrongAnswer.getTipo() == Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR;"		
		});
		r.setActions(new String[] {
				"merFunction.setTipo(Constantes.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);",
				"modified(merFunction);",
				"System.out.println(\"Função MRE: Compreensão Mais Aprofundada\");",		
				"flush();"
		});
		
		return r;
	}	

	public static RuleInformation ruleConstructDeeperUndestanding03(WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("constructDeeperUnderstanding03_");
		r.setDeclarations(new String[] {
				//"Historic h;", 
				"WrongAnswer wrongAnswer;",
				"MERFunction merFunction;"
		});
		r.setConditions(new String[] {
				"wrongAnswer.getTipo() == Constantes.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL;"		
		});
		r.setActions(new String[] {
				"merFunction.setTipo(Constantes.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);",
				"modified(merFunction);",
				"System.out.println(\"Função MRE: Compreensão Mais Aprofundada\");",		
				"flush();"
		});
		
		return r;
	}	
	
	/* Rules for MER Manager */

	public static RuleInformation ruleMER01(WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("ruleMRE01_");
		r.setDeclarations(new String[] {
				//"Historic h;", 
				"WrongAnswer wrongAnswer;",
				"MERFunction merFunction;"
		});
		r.setConditions(new String[] {
				"merFunction.getTipo() == Constantes.TIPO_FUNCAOMRE_PAPEIS_COMPLEMENTARES;"		
		});
		r.setActions(new String[] {
				"System.out.println(\"Exibição de MRE 01\");",		
				"flush();"
		});
		
		return r;
	}	

	public static RuleInformation ruleMER02(WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("ruleMRE02_");
		r.setDeclarations(new String[] {
				//"Historic h;", 
				"WrongAnswer wrongAnswer;",
				"MERFunction merFunction;"
		});
		r.setConditions(new String[] {
				"merFunction.getTipo() == Constantes.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO;",
				"wrongAnswer.getTipo() == Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO;"
		});
		r.setActions(new String[] {
				"System.out.println(\"Exibição de MRE 02\");",		
				"flush();"
		});
		
		return r;
	}	

	public static RuleInformation ruleMER03(WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("ruleMRE03_");
		r.setDeclarations(new String[] {
				//"Historic h;", 
				"WrongAnswer wrongAnswer;",
				"MERFunction merFunction;"
		});
		r.setConditions(new String[] {
				"merFunction.getTipo() == Constantes.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA;",
				"wrongAnswer.getTipo() == Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_REGRA;"
		});
		r.setActions(new String[] {
				"System.out.println(\"Exibição de MRE 03\");",		
				"flush();"
		});
		
		return r;
	}	
	
	public static RuleInformation ruleMER04(WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("ruleMRE04_");
		r.setDeclarations(new String[] {
				//"Historic h;", 
				"WrongAnswer wrongAnswer;",
				"MERFunction merFunction;"
		});
		r.setConditions(new String[] {
				"merFunction.getTipo() == Constantes.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA;",
				"wrongAnswer.getTipo() == Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR;"
		});
		r.setActions(new String[] {
				"System.out.println(\"Exibição de MRE 04\");",		
				"flush();"
		});
		
		return r;
	}	
	
	public static RuleInformation ruleMER05(WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("ruleMRE05_");
		r.setDeclarations(new String[] {
				//"Historic h;", 
				"WrongAnswer wrongAnswer;",
				"MERFunction merFunction;"
		});
		r.setConditions(new String[] {
				"merFunction.getTipo() == Constantes.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO;",
				"wrongAnswer.getTipo() == Constantes.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL;"
		});
		r.setActions(new String[] {
				"System.out.println(\"Exibição de MRE 05\");",		
				"flush();"
		});
		
		return r;
	}	
	
	public static RuleInformation ruleMER06(WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("ruleMRE06_");
		r.setDeclarations(new String[] {
				//"Historic h;", 
				"WrongAnswer wrongAnswer;",
				"MERFunction merFunction;"
		});
		r.setConditions(new String[] {
				"merFunction.getTipo() == Constantes.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA;",
				"wrongAnswer.getTipo() == Constantes.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL;"
		});
		r.setActions(new String[] {
				"System.out.println(\"Exibição de MRE 06\");",		
				"flush();"
		});
		
		return r;
	}	

	
}
