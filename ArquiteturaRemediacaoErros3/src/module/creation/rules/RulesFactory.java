package module.creation.rules;

import java.io.BufferedReader;

import jeops.compiler.Main;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import module.entity.Goal;
import module.entity.MERFunction;
import module.entity.MultipleExternalRepresentation;
import module.entity.Remediation;
import module.entity.RuleInformation;
import module.entity.WrongAnswer;
import util.Constants;
import util.StringConstants;

public class RulesFactory {
	
	public static void compile(String file){
		String filePath = new File("").getAbsolutePath();
        System.out.println (filePath);
        filePath = filePath.replace("\\bin", "\\src");
        //filePath = filePath + "\\src"; 
		Main.main(new String[]{filePath+file});

	}
	
	public static void createRules(Goal goal){
		String filePath = new File("").getAbsolutePath();
        System.out.println (filePath);
        filePath = filePath.replace("\\bin", "\\src");
		editFileRule(filePath+StringConstants.FILE_EXPRESSION_IDENTIFIER_CORRECT_ANSWER_KB, ruleCorrectAnswer(goal));
		
	}
	
	public static void createRules(Remediation remediation, MultipleExternalRepresentation mer) {

		String filePath = new File("").getAbsolutePath();
        System.out.println (filePath);
        filePath = filePath.replace("\\bin", "\\src");
            
		// create rule for Expressions Identifier

		editFileRule(filePath+StringConstants.FILE_EXPRESSION_IDENTIFIER_WRONG_ANSWER_KB, ruleWrongAnswer(remediation));
		//Main.main(new String[]{filePath+StringConstants.FILE_EXPRESSION_IDENTIFIER_WRONG_ANSWER_KB});
		
		// create rules for Error Sorter AND MER Function Sorter

		editFileRule(filePath+StringConstants.FILE_ERROR_SORTER_KB, ruleErrorSorter(remediation));
		editFileRule(filePath+StringConstants.FILE_MERFUNCTION_SORTER_KB, ruleMERFunctionSorter(remediation));
		
		
		// create rule for MER Manager
		editFileRule(filePath+StringConstants.FILE_MER_MANAGER_KB, ruleMERTypeMER(mer));
		//Main.main(new String[]{filePath+StringConstants.FILE_MER_MANAGER_KB});
		
	}

	
	/* Rules for Expression Identifier */
	
	public static RuleInformation ruleWrongAnswer(Remediation remediation) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("wrongAnswer_PATH_"+remediation.getGoal().getPath().getId() +"_GOAL_"+remediation.getGoal().getId()+
						"_COMPONENT_"+remediation.getGoal().getComponent().getName() + "_REMEDIATION_" + remediation.getId() 
						+ "_");
		r.setDeclarations(new ArrayList<String>());
		r.getDeclarations().add("Action action;");
		r.getDeclarations().add("RuleToHuman ruleToHuman;");
		
		ArrayList<String> conditions = new ArrayList<String>();
		ArrayList<String> strCondAux = new ArrayList<String>();
		
		conditions.add("action.getGoal().getPath().getId().equals(" + remediation.getGoal().getPath().getId() + ");");
		conditions.add("action.getGoal().getId().equals(" + remediation.getGoal().getId() + ");");
		conditions.add("action.getGoal().getComponent().getName().equalsIgnoreCase(\"" + remediation.getGoal().getComponent().getName() + "\");");

		if (remediation.getWrongAnswer() != null){
			conditions.add("action.getAnswer().getValue().equalsIgnoreCase(\""+remediation.getWrongAnswer()+"\");");		
			strCondAux.add("\\tResposta campo = " + remediation.getWrongAnswer());
		}
		
		//if (remediation.getAttempts() != null && remediation.getAttempts() > 0) {
			//conditions.add("action.getAttempt() == "+remediation.getAttempts()+";");
		//}
		r.setConditions(conditions);			
		
		r.setActions(new ArrayList<String>());
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Regra acionada para resposta errada: " + r.getRuleName() + " \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" Condi��es:  \\n\");");
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
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" Condi��es:  \\n\");");
		for (String c : strCondAux)
			r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"" + c + "\\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Meta n� " + goal.getId() + " conclu�da!" + "\\n\");");
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

	/* Rule for Error Sorter */

	public static RuleInformation ruleErrorSorter(Remediation remediation) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("errortype_" + remediation.getItemSorter().getErrorType().getDescription() + "_" +
						remediation.getItemSorter().getErrorType().getId() +
						(remediation.getItemSorter().getSubErrorType() != null ? 
								"_suberrortype_" + remediation.getItemSorter().getSubErrorType().getDescription() + "_" + remediation.getItemSorter().getSubErrorType().getId()
								:"") +
						"_PATH_" + remediation.getGoal().getPath().getId() + 
						"_GOAL_" + remediation.getGoal().getId() + 
						"_COMPONENT_" + remediation.getGoal().getComponent().getName() + "_");		
		r.setDeclarations(new ArrayList<String>());
		r.getDeclarations().add("Action action;"); 
		r.getDeclarations().add("RuleToHuman ruleToHuman;");

		ArrayList<String> conditions = new ArrayList<String>();
		ArrayList<String> strCondAux = new ArrayList<String>();

		conditions.add("action.getGoal().getPath().getId().equals(" + remediation.getGoal().getPath().getId() + ");");
		conditions.add("action.getGoal().getId().equals(" + remediation.getGoal().getId() + ");");
		conditions.add("action.getGoal().getComponent().getName().equalsIgnoreCase(\"" + remediation.getGoal().getComponent().getName() + "\");");
	
		if (remediation.getWrongAnswer() != null) {
			conditions.add("action.getAnswer().getValue().equalsIgnoreCase(\""+remediation.getWrongAnswer()+"\");");		
			strCondAux.add("\\tResposta campo = " + remediation.getWrongAnswer());			
		}
		
		r.setConditions(conditions);			

		r.setActions(new ArrayList<String>());
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Regra acionada para classificar o erro: " + r.getRuleName() + " \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" Condi��es:  \\n\");");
		for (String c : strCondAux)
			r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"" + c + "\\n\");");		

		r.getActions().add("System.out.println(\"Erro classificado como " + remediation.getItemSorter().getErrorType().getDescription() +"\");");
		r.getActions().add("((WrongAnswer)action.getAnswer()).setErrorType( new ErrorType("+remediation.getItemSorter().getErrorType().getId()+"," +remediation.getItemSorter().getErrorType()+ ");");

		if (remediation.getItemSorter().getSubErrorType() == null)
			r.getActions().add("((WrongAnswer)action.getAnswer()).getErrorType( new SubErrorType("+remediation.getItemSorter().getSubErrorType().getId()+"," +remediation.getItemSorter().getSubErrorType()+ ");");
		
		r.getActions().add("modified(ruleToHuman);");
		r.getActions().add("flush();");

		
		return r;
	}
	
		
	/* Rule for MER Functions Sorter */
	
	public static RuleInformation ruleMERFunctionSorter(Remediation remediation) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("merfunction_" + remediation.getItemSorter().getMerFunction().getDescription() + "_" +
					remediation.getItemSorter().getMerFunction().getId() + 
					"_PATH_"+remediation.getGoal().getPath().getId()+
					"_GOAL_"+remediation.getGoal().getId()+
					"_COMPONENT_"+remediation.getGoal().getComponent().getName() + "_");
		r.setDeclarations(new ArrayList<String>());
		r.getDeclarations().add("Action action;"); 
		r.getDeclarations().add("MERFunction merFunction;");
		r.getDeclarations().add("RuleToHuman ruleToHuman;");

		r.setConditions(new ArrayList<String>());
		r.getConditions().add("((WrongAnswer)action.getAnswer()).getErrorType().equals("+ remediation.getItemSorter().getErrorType().getId()+");");
		if (remediation.getItemSorter().getSubErrorType() != null)
			r.getConditions().add("((WrongAnswer)action.getAnswer()).getErrorType().getSubErrorType().equals("+ remediation.getItemSorter().getSubErrorType().getId()+");");
		r.getConditions().add("action.getGoal().getPath().getId().equals(" + remediation.getGoal().getPath().getId() + ");");
		r.getConditions().add("action.getGoal().getId().equals(" + remediation.getGoal().getId() + ");");
		r.getConditions().add("action.getGoal().getComponent().getName().equalsIgnoreCase(\"" + remediation.getGoal().getComponent().getName() + "\");");

		
		r.setActions(new ArrayList<String>());
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Regra acionada para classificar a Fun��o da MRE: " + r.getRuleName() + " \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" Condi��es:  \\n\");");
		
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" \\t Tipo de Erro = " + remediation.getItemSorter().getErrorType().getDescription() + " \\n\");");		
		//r.getActions().add("action.setAttempt(action.getAttempt() + 1);");
		//r.getActions().add("modified(action);");
		r.getActions().add("merFunction.setId("+ remediation.getItemSorter().getMerFunction().getId()+");");
		r.getActions().add("merFunction.setDescription("+ remediation.getItemSorter().getMerFunction().getDescription()+");");
		r.getActions().add("modified(merFunction);");
		r.getActions().add("modified(ruleToHuman);");
		r.getActions().add("System.out.println(\"Fun��o MRE: " + remediation.getItemSorter().getMerFunction().getDescription() + "\");");
		r.getActions().add("flush();");
		
		
		return r;
	}	


	
	/* Rules for MER Manager */

	public static RuleInformation ruleMERComplexity(MultipleExternalRepresentation mer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("ruleMER_"+mer.getId() + "_complexity");		
		r.setDeclarations(new ArrayList<String>());
		r.getDeclarations().add("MultipleExternalRepresentation mer;");
		r.getDeclarations().add("RuleToHuman ruleToHuman;");
		
		r.setConditions(new ArrayList<String>());
		ArrayList<String> strCondAux = new ArrayList<String>();
		  
		r.getConditions().add("mer.getComplexity() == " + mer.getComplexity() + ";");
		
		r.setActions(new ArrayList<String>());
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Regra acionada para selecionar a MRE: " + r.getRuleName() + " \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" Condi��es:  \\n\");");
		for (String c : strCondAux)
			r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"" + c + "\\n\");");		
		
		r.getActions().add("mer.setId("+mer.getId()+");");
		r.getActions().add("mer.setDescription(\""+mer.getDescription()+"\");");
		r.getActions().add("mer.setImage("+mer.getImage()+");");
		r.getActions().add("mer.setComplexity("+mer.getComplexity()+");");
		r.getActions().add("mer.setMerFunctions("+mer.getMerFunctions()+");");
		r.getActions().add("mer.setTypeMers("+mer.getTypeMers()+");");
		r.getActions().add("modified(mer);");
		r.getActions().add("modified(ruleToHuman);");
		r.getActions().add("System.out.println(\"Exibi��o de MRE " + mer.getId() + " - " + mer.getDescription() + "\");");		
		r.getActions().add("flush();");
		
		
		return r;
	}	


	public static RuleInformation ruleMERMerFunctions(MultipleExternalRepresentation mer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("ruleMER_"+mer.getId() + "_merfunction");		
		r.setDeclarations(new ArrayList<String>());
		r.getDeclarations().add("MERFunction merFunction;");
		r.getDeclarations().add("MultipleExternalRepresentation mer;");
		r.getDeclarations().add("RuleToHuman ruleToHuman;");
		
		r.setConditions(new ArrayList<String>());
		ArrayList<String> strCondAux = new ArrayList<String>();
		  

		for (int i = 0; i < mer.getMerFunctions().size(); i++){
			String s = "merFunction.getId().equals(" + mer.getMerFunctions().get(i) + ")";
			if (i == mer.getMerFunctions().size()-1)
				s = s + " ; ";
			else
				s = s + " || ";
			r.getConditions().add(s);
				
		}
		
		r.setActions(new ArrayList<String>());
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Regra acionada para selecionar a MRE: " + r.getRuleName() + " \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" Condi��es:  \\n\");");
		for (String c : strCondAux)
			r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"" + c + "\\n\");");		
		
		r.getActions().add("mer.setId("+mer.getId()+");");
		r.getActions().add("mer.setDescription(\""+mer.getDescription()+"\");");
		r.getActions().add("mer.setImage("+mer.getImage()+");");
		r.getActions().add("mer.setComplexity("+mer.getComplexity()+");");
		r.getActions().add("mer.setMerFunctions("+mer.getMerFunctions()+");");
		r.getActions().add("mer.setTypeMers("+mer.getTypeMers()+");");
		r.getActions().add("modified(mer);");
		r.getActions().add("modified(ruleToHuman);");
		r.getActions().add("System.out.println(\"Exibi��o de MRE " + mer.getId() + " - " + mer.getDescription() + "\");");		
		r.getActions().add("flush();");
		
		
		return r;
	}	

	public static RuleInformation ruleMERTypeMER(MultipleExternalRepresentation mer) {
		RuleInformation r = new RuleInformation();
		r.setRuleName("ruleMER_"+mer.getId() + "_typemer");		
		r.setDeclarations(new ArrayList<String>());
		r.getDeclarations().add("TypeMER typeMER;");
		r.getDeclarations().add("MultipleExternalRepresentation mer;");
		r.getDeclarations().add("RuleToHuman ruleToHuman;");
		
		r.setConditions(new ArrayList<String>());
		ArrayList<String> strCondAux = new ArrayList<String>();
		  

		for (int i = 0; i < mer.getTypeMers().size(); i++){
			String s = "typeMER.getId().equals(" + mer.getTypeMers().get(i) + ")";
			if (i == mer.getTypeMers().size()-1)
				s = s + " ; ";
			else
				s = s + " || ";
			r.getConditions().add(s);
				
		}
		
		r.setActions(new ArrayList<String>());
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"Regra acionada para selecionar a MRE: " + r.getRuleName() + " \\n\");");
		r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \" Condi��es:  \\n\");");
		for (String c : strCondAux)
			r.getActions().add("ruleToHuman.setDescription(ruleToHuman.getDescription() + \"" + c + "\\n\");");		
		
		r.getActions().add("mer.setId("+mer.getId()+");");
		r.getActions().add("mer.setDescription(\""+mer.getDescription()+"\");");
		r.getActions().add("mer.setImage("+mer.getImage()+");");
		r.getActions().add("mer.setComplexity("+mer.getComplexity()+");");
		r.getActions().add("mer.setMerFunctions("+mer.getMerFunctions()+");");
		r.getActions().add("mer.setTypeMers("+mer.getTypeMers()+");");
		r.getActions().add("modified(mer);");
		r.getActions().add("modified(ruleToHuman);");
		r.getActions().add("System.out.println(\"Exibi��o de MRE " + mer.getId() + " - " + mer.getDescription() + "\");");		
		r.getActions().add("flush();");
		
		
		return r;
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

}
