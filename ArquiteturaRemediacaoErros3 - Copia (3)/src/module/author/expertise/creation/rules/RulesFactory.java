package module.author.expertise.creation.rules;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JComponent;

import module.entity.Action;
import module.entity.CorrectAnswer;
import module.entity.Goal;
import module.entity.MERFunction;
import module.entity.MultipleExternalRepresentation;
import module.entity.RuleInformation;
import module.entity.WrongAnswer;
import util.Constants;
import util.StringConstants;

public class RulesFactory {
	
	/*
	public static void createRules(Goal goal){
		String filePath = new File("").getAbsolutePath();
        System.out.println (filePath);
        filePath = filePath.replace("\\bin", "\\src");
        //filePath = filePath + "\\src"; 
		editFileRule(filePath+StringConstants.FILE_GOALS_KB, ruleGoal(goal));
		
	}
	*/
	public static void createRules(Goal goal){
		String filePath = new File("").getAbsolutePath();
        System.out.println (filePath);
        filePath = filePath.replace("\\bin", "\\src");
		editFileRule(filePath+StringConstants.FILE_EXPRESSION_IDENTIFIER_CORRECT_ANSWER_KB, ruleCorrectAnswer(goal));
		
	}
	
	public static void createRules(Goal goal, WrongAnswer wrongAnswer, MERFunction merFunction, 
								MultipleExternalRepresentation mer, Integer attempts) {

		String filePath = new File("").getAbsolutePath();
        System.out.println (filePath);
        filePath = filePath.replace("\\bin", "\\src");
        //filePath = filePath + "\\src";         
        
		// create rule for Expressions Identifier

		editFileRule(filePath+StringConstants.FILE_EXPRESSION_IDENTIFIER_WRONG_ANSWER_KB, ruleWrongAnswer(goal, wrongAnswer, attempts));
		//Main.main(new String[]{filePath+StringConstants.FILE_EXPRESSION_IDENTIFIER_WRONG_ANSWER_KB});
		
		// create rules for Error Sorter AND MER Function Sorter

		switch (wrongAnswer.getType()){
			case Constants.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA:
				editFileRule(filePath+StringConstants.FILE_ERROR_SORTER_KB, ruleMisinterpretation(goal, wrongAnswer));
				editFileRule(filePath+StringConstants.FILE_MERFUNCTION_SORTER_KB, ruleComplementaryRoles(goal));
				merFunction.setType(Constants.TIPO_FUNCAOMRE_PAPEIS_COMPLEMENTARES);
				break;
			case Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO:
				editFileRule(filePath+StringConstants.FILE_ERROR_SORTER_KB, ruleDirectlyIdentifiableDeficiencyDomain(goal, wrongAnswer));				
				editFileRule(filePath+StringConstants.FILE_MERFUNCTION_SORTER_KB, ruleConstrainInterpretation01(goal));
				merFunction.setType(Constants.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
				break;
			case Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR:
				editFileRule(filePath+StringConstants.FILE_ERROR_SORTER_KB, ruleDirectlyIdentifiableDeficiencyOperatorChoice(goal, wrongAnswer));								
				editFileRule(filePath+StringConstants.FILE_MERFUNCTION_SORTER_KB, ruleConstructDeeperUndestanding02(goal));
				merFunction.setType(Constants.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
				break;
			case Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_REGRA:
				editFileRule(filePath+StringConstants.FILE_ERROR_SORTER_KB, ruleDirectlyIdentifiableDeficiencyRule(goal, wrongAnswer));
				editFileRule(filePath+StringConstants.FILE_MERFUNCTION_SORTER_KB, ruleConstructDeeperUndestanding01(goal));
				merFunction.setType(Constants.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
				break;
			case Constants.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL:
				editFileRule(filePath+StringConstants.FILE_ERROR_SORTER_KB, ruleIndirectlyIdentifiable(goal, wrongAnswer));
				editFileRule(filePath+StringConstants.FILE_MERFUNCTION_SORTER_KB, ruleConstrainInterpretation02(goal, wrongAnswer));
				merFunction.setType(Constants.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);
				break;
			case Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL:
				editFileRule(filePath+StringConstants.FILE_ERROR_SORTER_KB, ruleSolutionNonCategorizable(goal, wrongAnswer));								
				editFileRule(filePath+StringConstants.FILE_MERFUNCTION_SORTER_KB, ruleConstructDeeperUndestanding03(goal));
				merFunction.setType(Constants.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);
				break;
		}

		//Main.main(new String[]{filePath+StringConstants.FILE_ERROR_SORTER_KB});
		//Main.main(new String[]{filePath+StringConstants.FILE_MERFUNCTION_SORTER_KB});
		
		
		// create rule for MER Manager
		editFileRule(filePath+StringConstants.FILE_MER_MANAGER_KB, ruleMER(goal, wrongAnswer, merFunction, mer));
		//Main.main(new String[]{filePath+StringConstants.FILE_MER_MANAGER_KB});
		
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
		    		if (str.equalsIgnoreCase(StringConstants.END_RULES)) {
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
	
	public static RuleInformation ruleWrongAnswer(Goal goal, WrongAnswer wrongAnswer, Integer attempts) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("wrongAnswer_PATH_"+goal.getPath().getId()+"_GOAL_"+goal.getId()+"_COMPONENT_"+goal.getComponent().getName() + "_");
		r.setDeclarations(new ArrayList<String>());
		r.getDeclarations().add("Action action;");
		r.getDeclarations().add("RuleToHuman ruleToHuman;");
		
		ArrayList<String> conditions = new ArrayList<String>();
		ArrayList<String> strCondAux = new ArrayList<String>();
		
		conditions.add("action.getGoal().getPath().getId().equals(" + goal.getPath().getId() + ");");
		conditions.add("action.getGoal().getId().equals(" + goal.getId() + ");");
		conditions.add("action.getGoal().getComponent().getName().equalsIgnoreCase(\"" + goal.getComponent().getName() + "\");");

		conditions.add("action.getAnswer().getValue().equalsIgnoreCase(\""+wrongAnswer.getValue()+"\");");		
		strCondAux.add("\\tResposta campo = " + wrongAnswer.getValue());
		
		if (attempts > 0) {
			conditions.add("action.getAttempt() >= "+attempts+";");
		}
		r.setConditions(conditions);			
		
		r.setActions(new ArrayList<String>());
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Regra acionada para resposta errada: " + r.getRuleName() + " \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" Condições:  \\n\");");
		for (String c : strCondAux)
			r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"" + c + "\\n\");");
		r.getActions().add("System.out.println(\"Resposta Errada (1) detectada\");");
		r.getActions().add("action.setCorrect(false);");
		r.getActions().add("action.setAnswer(new WrongAnswer(action.getAnswer().getValue()));");
		r.getActions().add("modified(action);");
		r.getActions().add("modified(ruleToHuman);");
		r.getActions().add("flush();");
		
		return r;
	}


	public static RuleInformation ruleGoal(Goal goal) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("goal_");
		r.setDeclarations(new ArrayList<String>());
		r.getDeclarations().add("Goal goal;"); 
		r.getDeclarations().add("RuleToHuman ruleToHuman;");
		
		return null;

	}
	public static RuleInformation ruleCorrectAnswer(Goal goal) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("correctAnswer_PATH_"+goal.getPath().getId()+"_GOAL_"+goal.getId()+"_COMPONENT_"+goal.getComponent().getName() + "_");
		r.setDeclarations(new ArrayList<String>());
		r.getDeclarations().add("Action action;");
		r.getDeclarations().add("RuleToHuman ruleToHuman;");


		//int numberConditions = correctAnswer.getValue().length;
		ArrayList<String> conditions = new ArrayList<String>();
		conditions.add("action.getGoal().getPath().getId().equals(" + goal.getPath().getId() + ");");
		conditions.add("action.getGoal().getId().equals(" + goal.getId() + ");");
		conditions.add("action.getGoal().getComponent().getName().equalsIgnoreCase(\"" + goal.getComponent().getName() + "\");");
	
		ArrayList<String> strCondAux = new ArrayList<String>();
		conditions.add("action.getAnswer().getValue().equalsIgnoreCase(\"" + goal.getAnswer().getValue()+"\");");
		strCondAux.add("\\tResposta = " + goal.getAnswer().getValue());
	
		r.setConditions(conditions);			

		r.setActions(new ArrayList<String>());
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Regra acionada para resposta correta: " + r.getRuleName() + " \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" Condições:  \\n\");");
		for (String c : strCondAux)
			r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"" + c + "\\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Meta nº " + goal.getId() + " concluída!" + "\\n\");");
		//r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"\");");
		r.getActions().add("System.out.println(\"Resposta Correta (1) detectada\\n\");");
		r.getActions().add("action.setCorrect(true);");
		r.getActions().add("action.setAnswer(new CorrectAnswer(action.getAnswer().getValue()));");
		r.getActions().add("action.getGoal().setSatisfied(true);");
		r.getActions().add("modified(action);");
		r.getActions().add("modified(ruleToHuman);");
		r.getActions().add("flush();");
		
		return r;
	}

	/* Rules for Error Sorter */
	
	public static RuleInformation ruleMisinterpretation(Goal goal, WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("misinterpretation_PATH_"+goal.getPath().getId()+"_GOAL_"+goal.getId()+"_COMPONENT_"+goal.getComponent().getName() + "_");		
		r.setDeclarations(new ArrayList<String>());
		r.getDeclarations().add("Action action;"); 
		r.getDeclarations().add("RuleToHuman ruleToHuman;");

		ArrayList<String> conditions = new ArrayList<String>();
		ArrayList<String> strCondAux = new ArrayList<String>();

		conditions.add("action.getGoal().getPath().getId().equals(" + goal.getPath().getId() + ");");
		conditions.add("action.getGoal().getId().equals(" + goal.getId() + ");");
		conditions.add("action.getGoal().getComponent().getName().equalsIgnoreCase(\"" + goal.getComponent().getName() + "\");");
	
		conditions.add("action.getAnswer().getValue().equalsIgnoreCase(\""+wrongAnswer.getValue()+"\");");		
		strCondAux.add("\\tResposta campo = " + wrongAnswer.getValue());
		
		r.setConditions(conditions);			

		r.setActions(new ArrayList<String>());
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Regra acionada para classificar o erro: " + r.getRuleName() + " \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" Condições:  \\n\");");
		for (String c : strCondAux)
			r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"" + c + "\\n\");");		
		//r.getActions().add("action.setAttempt(action.getAttempt() + 1);");
		//r.getActions().add("modified(action);");
		r.getActions().add("System.out.println(\"Erro classificado como Interpretação Equivocada\");");
		r.getActions().add("((WrongAnswer)action.getAnswer()).setType(Constants.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA);");
		r.getActions().add("modified(ruleToHuman);");
		r.getActions().add("flush();");

		
		return r;
	}
	
	public static RuleInformation ruleDirectlyIdentifiableDeficiencyDomain(Goal goal, WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("directlyIdentifiableDeficiencyDomain_PATH_"+goal.getPath().getId()+"_GOAL_"+goal.getId()+"_COMPONENT_"+goal.getComponent().getName() + "_");
		r.setDeclarations(new ArrayList<String>());
		r.getDeclarations().add("Action action;"); 
		r.getDeclarations().add("RuleToHuman ruleToHuman;");


		//int numberConditions = wrongAnswer.getValue().length;
		ArrayList<String> conditions = new ArrayList<String>();
		ArrayList<String> strCondAux = new ArrayList<String>();

		conditions.add("action.getGoal().getPath().getId().equals(" + goal.getPath().getId() + ");");
		conditions.add("action.getGoal().getId().equals(" + goal.getId() + ");");
		conditions.add("action.getGoal().getComponent().getName().equalsIgnoreCase(\"" + goal.getComponent().getName() + "\");");

		conditions.add("action.getAnswer().getValue().equalsIgnoreCase(\""+wrongAnswer.getValue()+"\");");
		strCondAux.add("\\tResposta campo = " + wrongAnswer.getValue());
		
		r.setConditions(conditions);			

		r.setActions(new ArrayList<String>());
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Regra acionada para classificar o erro: " + r.getRuleName() + " \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" Condições:  \\n\");");
		for (String c : strCondAux)
			r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"" + c + "\\n\");");		
		//r.getActions().add("action.setAttempt(action.getAttempt() + 1);");
		//r.getActions().add("modified(action);");
		r.getActions().add("System.out.println(\"Erro classificado como Diretamente Identificável - Deficiência no Domínio\");");		
		r.getActions().add("((WrongAnswer)action.getAnswer()).setType(Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO);");
		r.getActions().add("modified(ruleToHuman);");
		r.getActions().add("flush();");

		
		return r;
	}
		
	public static RuleInformation ruleDirectlyIdentifiableDeficiencyRule(Goal goal, WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("directlyIdentifiableDeficiencyRule_PATH_"+goal.getPath().getId()+"_GOAL_"+goal.getId()+"_COMPONENT_"+goal.getComponent().getName() + "_");		
		r.setDeclarations(new ArrayList<String>());
		r.getDeclarations().add("Action action;"); 
		r.getDeclarations().add("RuleToHuman ruleToHuman;");


		//int numberConditions = wrongAnswer.getValue().length;
		ArrayList<String> conditions = new ArrayList<String>();
		ArrayList<String> strCondAux = new ArrayList<String>();
	
		conditions.add("action.getGoal().getPath().getId().equals(" + goal.getPath().getId() + ");");
		conditions.add("action.getGoal().getId().equals(" + goal.getId() + ");");
		conditions.add("action.getGoal().getComponent().getName().equalsIgnoreCase(\"" + goal.getComponent().getName() + "\");");

		conditions.add("action.getAnswer().getValue().equalsIgnoreCase(\""+wrongAnswer.getValue()+"\");");		
		strCondAux.add("\\tResposta campo = " + wrongAnswer.getValue());
		
		r.setConditions(conditions);			

		r.setActions(new ArrayList<String>());
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Regra acionada para classificar o erro: " + r.getRuleName() + " \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" Condições:  \\n\");");
		for (String c : strCondAux)
			r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"" + c + "\\n\");");		
		//r.getActions().add("action.setAttempt(action.getAttempt() + 1);");
		//r.getActions().add("modified(action);");
		r.getActions().add("System.out.println(\"Erro classificado como Diretamente Identificável - Deficiência na Regra\");");		
		r.getActions().add("((WrongAnswer)action.getAnswer()).setType(Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_REGRA);");
		r.getActions().add("modified(ruleToHuman);");
		r.getActions().add("flush();");
		
		return r;
	}

	public static RuleInformation ruleDirectlyIdentifiableDeficiencyOperatorChoice(Goal goal, WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("directlyIdentifiableDeficiencyOperatorChoice_PATH_"+goal.getPath().getId()+"_GOAL_"+goal.getId()+"_COMPONENT_"+goal.getComponent().getName() + "_");
		r.setDeclarations(new ArrayList<String>());
		r.getDeclarations().add("Action action;"); 
		r.getDeclarations().add("RuleToHuman ruleToHuman;");


		//int numberConditions = wrongAnswer.getValue().length;
		ArrayList<String> conditions = new ArrayList<String>();
		ArrayList<String> strCondAux = new ArrayList<String>();
	
		conditions.add("action.getGoal().getPath().getId().equals(" + goal.getPath().getId() + ");");
		conditions.add("action.getGoal().getId().equals(" + goal.getId() + ");");
		conditions.add("action.getGoal().getComponent().getName().equalsIgnoreCase(\"" + goal.getComponent().getName() + "\");");

		conditions.add("action.getAnswer().getValue().equalsIgnoreCase(\""+wrongAnswer.getValue()+"\");");		
		strCondAux.add("\\tResposta campo = " + wrongAnswer.getValue());

		r.setConditions(conditions);			

		r.setActions(new ArrayList<String>());
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Regra acionada para classificar o erro: " + r.getRuleName() + " \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" Condições:  \\n\");");
		for (String c : strCondAux)
			r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"" + c + "\\n\");");		
		//r.getActions().add("action.setAttempt(action.getAttempt() + 1);");
		//r.getActions().add("modified(action);");
		r.getActions().add("System.out.println(\"Erro classificado como Diretamente Identificável - Deficiência na Escolha do Operador\");");		
		r.getActions().add("((WrongAnswer)action.getAnswer()).setType(Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR);");
		r.getActions().add("modified(ruleToHuman);");
		r.getActions().add("flush();");

		
		return r;
	}

	public static RuleInformation ruleIndirectlyIdentifiable(Goal goal, WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("indirectlyIdentifiable_PATH_"+goal.getPath().getId()+"_GOAL_"+goal.getId()+"_COMPONENT_"+goal.getComponent().getName() + "_");		
		r.setDeclarations(new ArrayList<String>());
		r.getDeclarations().add("Action action;"); 
		r.getDeclarations().add("RuleToHuman ruleToHuman;");


		//int numberConditions = wrongAnswer.getValue().length;
		ArrayList<String> conditions = new ArrayList<String>();
		ArrayList<String> strCondAux = new ArrayList<String>();
	
		conditions.add("action.getGoal().getPath().getId().equals(" + goal.getPath().getId() + ");");
		conditions.add("action.getGoal().getId().equals(" + goal.getId() + ");");
		conditions.add("action.getGoal().getComponent().getName().equalsIgnoreCase(\"" + goal.getComponent().getName() + "\");");

		conditions.add("action.getAnswer().getValue().equalsIgnoreCase(\""+wrongAnswer.getValue()+"\");");		
		strCondAux.add("\\tResposta campo = " + wrongAnswer.getValue());
		
		r.setConditions(conditions);			

		r.setActions(new ArrayList<String>());
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Regra acionada para classificar o erro: " + r.getRuleName() + " \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" Condições:  \\n\");");
		for (String c : strCondAux)
			r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"" + c + "\\n\");");		
		//r.getActions().add("action.setAttempt(action.getAttempt() + 1);");
		//r.getActions().add("modified(action);");
		r.getActions().add("System.out.println(\"Erro classificado como Indiretamente Identificável\");");		
		r.getActions().add("((WrongAnswer)action.getAnswer()).setType(Constants.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL);");
		r.getActions().add("modified(ruleToHuman);");
		r.getActions().add("flush();");
		
		
		return r;
	}

	public static RuleInformation ruleSolutionNonCategorizable(Goal goal, WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("solutionNonCategorizable_PATH_"+goal.getPath().getId()+"_GOAL_"+goal.getId()+"_COMPONENT_"+goal.getComponent().getName() + "_");		
		r.setDeclarations(new ArrayList<String>());
		r.getDeclarations().add("Action action;"); 
		r.getDeclarations().add("RuleToHuman ruleToHuman;");


		//int numberConditions = wrongAnswer.getValue().length;
		ArrayList<String> conditions = new ArrayList<String>();
		ArrayList<String> strCondAux = new ArrayList<String>();
	
		conditions.add("action.getGoal().getPath().getId().equals(" + goal.getPath().getId() + ");");
		conditions.add("action.getGoal().getId().equals(" + goal.getId() + ");");
		conditions.add("action.getGoal().getComponent().getName().equalsIgnoreCase(\"" + goal.getComponent().getName() + "\");");

		conditions.add("action.getAnswer().getValue().equalsIgnoreCase(\""+wrongAnswer.getValue()+"\");");		
		strCondAux.add("\\tResposta campo = " + wrongAnswer.getValue());

		r.setConditions(conditions);			

		r.setActions(new ArrayList<String>());
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Regra acionada para classificar o erro: " + r.getRuleName() + " \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" Condições:  \\n\");");
		for (String c : strCondAux)
			r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"" + c + "\\n\");");		
		//r.getActions().add("action.setAttempt(action.getAttempt() + 1);");
		//r.getActions().add("modified(action);");
		r.getActions().add("System.out.println(\"Erro classificado como Solução Não Categorizável\");");		
		r.getActions().add("((WrongAnswer)action.getAnswer()).setType(Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL);");
		r.getActions().add("modified(ruleToHuman);");
		r.getActions().add("flush();");

		
		return r;
	}
	
	/* Rules for MER Functions Sorter */

	public static RuleInformation ruleComplementaryRoles(Goal goal) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("complementaryRoles_PATH_"+goal.getPath().getId()+"_GOAL_"+goal.getId()+"_COMPONENT_"+goal.getComponent().getName() + "_");
		r.setDeclarations(new ArrayList<String>());
		r.getDeclarations().add("Action action;"); 
		r.getDeclarations().add("MERFunction merFunction;");
		r.getDeclarations().add("RuleToHuman ruleToHuman;");

		r.setConditions(new ArrayList<String>());
		r.getConditions().add("((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA;");
		r.getConditions().add("action.getGoal().getPath().getId().equals(" + goal.getPath().getId() + ");");
		r.getConditions().add("action.getGoal().getId().equals(" + goal.getId() + ");");
		r.getConditions().add("action.getGoal().getComponent().getName().equalsIgnoreCase(\"" + goal.getComponent().getName() + "\");");

		
		r.setActions(new ArrayList<String>());
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Regra acionada para classificar a Função da MRE: " + r.getRuleName() + " \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" Condições:  \\n\");");
		
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" \\t Tipo de Erro = Interpretação Equivocada \\n\");");		
		//r.getActions().add("action.setAttempt(action.getAttempt() + 1);");
		//r.getActions().add("modified(action);");
		r.getActions().add("merFunction.setType(Constants.TIPO_FUNCAOMRE_PAPEIS_COMPLEMENTARES);");
		r.getActions().add("modified(merFunction);");
		r.getActions().add("modified(ruleToHuman);");
		r.getActions().add("System.out.println(\"Função MRE: Papéis Complementares\");");
		r.getActions().add("flush();");
		
		
		return r;
	}	
	
	public static RuleInformation ruleConstrainInterpretation01(Goal goal) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("constrainInterpretation01_PATH_"+goal.getPath().getId()+"_GOAL_"+goal.getId()+"_COMPONENT_"+goal.getComponent().getName() + "_");
		r.setDeclarations(new ArrayList<String>());
		r.getDeclarations().add("Action action;"); 
		r.getDeclarations().add("MERFunction merFunction;");
		r.getDeclarations().add("RuleToHuman ruleToHuman;");
		
		r.setConditions(new ArrayList<String>());
		r.getConditions().add("((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO;");		
		r.getConditions().add("action.getGoal().getPath().getId().equals(" + goal.getPath().getId() + ");");
		r.getConditions().add("action.getGoal().getId().equals(" + goal.getId() + ");");
		r.getConditions().add("action.getGoal().getComponent().getName().equalsIgnoreCase(\"" + goal.getComponent().getName() + "\");");
		
		r.setActions(new ArrayList<String>());
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Regra acionada para classificar a Função da MRE: " + r.getRuleName() + " \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" Condições:  \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" \\t Tipo de Erro = Diretamente Identificável - Deficiência no Domínio \\n\");");			
		//r.getActions().add("action.setAttempt(action.getAttempt() + 1);");
		//r.getActions().add("modified(action);");
		r.getActions().add("merFunction.setType(Constants.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);");
		r.getActions().add("modified(merFunction);");
		r.getActions().add("modified(ruleToHuman);");
		r.getActions().add("System.out.println(\"Função MRE: Restrição Interpretação\");");		
		r.getActions().add("flush();");
		
		
		return r;
	}	

	public static RuleInformation ruleConstrainInterpretation02(Goal goal, WrongAnswer wrongAnswer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("constrainInterpretation02_PATH_"+goal.getPath().getId()+"_GOAL_"+goal.getId()+"_COMPONENT_"+goal.getComponent().getName() + "_");
		r.setDeclarations(new ArrayList<String>());
		r.getDeclarations().add("Action action;"); 
		r.getDeclarations().add("MERFunction merFunction;");
		r.getDeclarations().add("RuleToHuman ruleToHuman;");
		
		r.setConditions(new ArrayList<String>());
		r.getConditions().add("((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL;");		
		r.getConditions().add("action.getGoal().getPath().getId().equals(" + goal.getPath().getId() + ");");
		r.getConditions().add("action.getGoal().getId().equals(" + goal.getId() + ");");
		r.getConditions().add("action.getGoal().getComponent().getName().equalsIgnoreCase(\"" + goal.getComponent().getName() + "\");");
		
		r.setActions(new ArrayList<String>());
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Regra acionada para classificar a Função da MRE: " + r.getRuleName() + " \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" Condições:  \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" \\t Tipo de Erro = Indiretamente Identificável \\n\");");				
		//r.getActions().add("action.setAttempt(action.getAttempt() + 1);");
		//r.getActions().add("modified(action);");
		r.getActions().add("merFunction.setType(Constants.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO);");
		r.getActions().add("modified(merFunction);");
		r.getActions().add("modified(ruleToHuman);");
		r.getActions().add("System.out.println(\"Função MRE: Restrição Interpretação\");");		
		r.getActions().add("flush();");
		
		return r;
	}	
	
	public static RuleInformation ruleConstructDeeperUndestanding01(Goal goal) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("constructDeeperUnderstanding01_PATH_"+goal.getPath().getId()+"_GOAL_"+goal.getId()+"_COMPONENT_"+goal.getComponent().getName() + "_");
		r.setDeclarations(new ArrayList<String>());
		r.getDeclarations().add("Action action;"); 
		r.getDeclarations().add("MERFunction merFunction;");
		r.getDeclarations().add("RuleToHuman ruleToHuman;");
		
		r.setConditions(new ArrayList<String>());
		r.getConditions().add("((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_REGRA;");		
		r.getConditions().add("action.getGoal().getPath().getId().equals(" + goal.getPath().getId() + ");");
		r.getConditions().add("action.getGoal().getId().equals(" + goal.getId() + ");");
		r.getConditions().add("action.getGoal().getComponent().getName().equalsIgnoreCase(\"" + goal.getComponent().getName() + "\");");
		
		r.setActions(new ArrayList<String>());
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Regra acionada para classificar a Função da MRE: " + r.getRuleName() + " \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" Condições:  \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" \\t Tipo de Erro = Diretamente Identificável - Deficiência na Regra \\n\");");				
		//r.getActions().add("action.setAttempt(action.getAttempt() + 1);");
		//r.getActions().add("modified(action);");
		r.getActions().add("merFunction.setType(Constants.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);");
		r.getActions().add("modified(merFunction);");
		r.getActions().add("modified(ruleToHuman);");
		r.getActions().add("System.out.println(\"Função MRE: Compreensão Mais Aprofundada\");");		
		r.getActions().add("flush();");
		
		return r;
	}	

	public static RuleInformation ruleConstructDeeperUndestanding02(Goal goal) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("constructDeeperUnderstanding02_PATH_"+goal.getPath().getId()+"_GOAL_"+goal.getId()+"_COMPONENT_"+goal.getComponent().getName() + "_");		r.setDeclarations(new ArrayList<String>());
		r.getDeclarations().add("Action action;"); 
		r.getDeclarations().add("MERFunction merFunction;");
		r.getDeclarations().add("RuleToHuman ruleToHuman;");
		
		r.setConditions(new ArrayList<String>());
		r.getConditions().add("((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR;");		
		r.getConditions().add("action.getGoal().getPath().getId().equals(" + goal.getPath().getId() + ");");
		r.getConditions().add("action.getGoal().getId().equals(" + goal.getId() + ");");
		r.getConditions().add("action.getGoal().getComponent().getName().equalsIgnoreCase(\"" + goal.getComponent().getName() + "\");");
		
		r.setActions(new ArrayList<String>());
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Regra acionada para classificar a Função da MRE: " + r.getRuleName() + " \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" Condições:  \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" \\t Tipo de Erro = Diretamente Identificável - Deficiência na Escolha do Operador \\n\");");				
		//r.getActions().add("action.setAttempt(action.getAttempt() + 1);");
		//r.getActions().add("modified(action);");
		r.getActions().add("merFunction.setType(Constants.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);");
		r.getActions().add("modified(merFunction);");
		r.getActions().add("modified(ruleToHuman);");
		r.getActions().add("System.out.println(\"Função MRE: Compreensão Mais Aprofundada\");");		
		r.getActions().add("flush();");
		
		return r;
	}	

	public static RuleInformation ruleConstructDeeperUndestanding03(Goal goal) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("constructDeeperUnderstanding03_PATH_"+goal.getPath().getId()+"_GOAL_"+goal.getId()+"_COMPONENT_"+goal.getComponent().getName() + "_");
		r.setDeclarations(new ArrayList<String>());
		r.getDeclarations().add("Action action;"); 
		r.getDeclarations().add("MERFunction merFunction;");
		r.getDeclarations().add("RuleToHuman ruleToHuman;");
		
		r.setConditions(new ArrayList<String>());
		r.getConditions().add("((WrongAnswer)action.getAnswer()).getType() == Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL;");
		r.getConditions().add("action.getGoal().getPath().getId().equals(" + goal.getPath().getId() + ");");
		r.getConditions().add("action.getGoal().getId().equals(" + goal.getId() + ");");
		r.getConditions().add("action.getGoal().getComponent().getName().equalsIgnoreCase(\"" + goal.getComponent().getName() + "\");");
		
		r.setActions(new ArrayList<String>());
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Regra acionada para classificar a Função da MRE: " + r.getRuleName() + " \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" Condições:  \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" \\t Tipo de Erro = Solução Não Categorizável \\n\");");			
		//r.getActions().add("action.setAttempt(action.getAttempt() + 1);");
		//r.getActions().add("modified(action);");
		r.getActions().add("merFunction.setType(Constants.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA);");
		r.getActions().add("modified(merFunction);");
		r.getActions().add("modified(ruleToHuman);");
		r.getActions().add("System.out.println(\"Função MRE: Compreensão Mais Aprofundada\");");		
		r.getActions().add("flush();");
		
		return r;
	}	
	
	/* Rules for MER Manager */

	public static RuleInformation ruleMER(Goal goal, WrongAnswer wrongAnswer, MERFunction merFunction, MultipleExternalRepresentation mer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("ruleMER_PATH_"+goal.getPath().getId()+"_GOAL_"+goal.getId()+"_COMPONENT_"+goal.getComponent().getName() + "_");		r.setDeclarations(new ArrayList<String>());
		r.getDeclarations().add("Action action;"); 
		r.getDeclarations().add("MERFunction merFunction;");
		r.getDeclarations().add("MultipleExternalRepresentation mer;");
		r.getDeclarations().add("RuleToHuman ruleToHuman;");
		
		r.setConditions(new ArrayList<String>());
		ArrayList<String> strCondAux = new ArrayList<String>();
		r.getConditions().add("merFunction.getType() == " + merFunction.getType() + ";"); //Constants.TIPO_FUNCAOMRE_PAPEIS_COMPLEMENTARES;"
		r.getConditions().add("action.getGoal().getPath().getId().equals(" + goal.getPath().getId() + ");");
		r.getConditions().add("action.getGoal().getId().equals(" + goal.getId() + ");");
		r.getConditions().add("action.getGoal().getComponent().getName().equalsIgnoreCase(\"" + goal.getComponent().getName() + "\");");
		
		switch(merFunction.getType()){
			case Constants.TIPO_FUNCAOMRE_COMPREENSAO_MAIS_APROFUNDADA:
				strCondAux.add("\\tTipo de Função de MRE = Compreensão Mais Aprofundada");
				break;
			case Constants.TIPO_FUNCAOMRE_PAPEIS_COMPLEMENTARES:
				strCondAux.add("\\tTipo de Função de MRE = Papéis Complementares");
				break;
			case Constants.TIPO_FUNCAOMRE_RESTRICAO_INTERPRETACAO:	
				strCondAux.add("\\tTipo de Função de MRE = Restrição de Interpretação");
				break;
		}
		
		r.getConditions().add("((WrongAnswer)action.getAnswer()).getType() == " + wrongAnswer.getType() + ";");
		
		switch(wrongAnswer.getType()){
			case Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO:
				strCondAux.add("\\tTipo de Erro = Diretamente Identificável - Deficiência no Domínio");
				break;
			case Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR:
				strCondAux.add("\\tTipo de Erro = Diretamente Identificável - Deficiência na Escolha do Operador");
				break;
			case Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_REGRA:
				strCondAux.add("\\tTipo de Erro = Diretamente Identificável - Deficiência na Regra");
				break;
			case Constants.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL:
				strCondAux.add("\\tTipo de Erro = Indiretamente Identificável");
				break;
			case Constants.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA:
				strCondAux.add("\\tTipo de Erro = Interpretação Equivocada");
				break;
			case Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL:
				strCondAux.add("\\tTipo de Erro = Solução Não Categorizável");
				break;
		}
		
		r.setActions(new ArrayList<String>());
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Regra acionada para selecionar a MRE: " + r.getRuleName() + " \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" Condições:  \\n\");");
		for (String c : strCondAux)
			r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"" + c + "\\n\");");		
		
		r.getActions().add("mer.setId("+mer.getId()+");");
		r.getActions().add("mer.setDescricao(\""+mer.getDescricao()+"\");");
		r.getActions().add("mer.setImageName(\""+mer.getImageName()+"\");");
		r.getActions().add("modified(mer);");
		r.getActions().add("modified(ruleToHuman);");
		r.getActions().add("System.out.println(\"Exibição de MRE " + mer.getId() + " - " + mer.getDescricao() + "\");");		
		r.getActions().add("flush();");
		
		
		return r;
	}	

}
