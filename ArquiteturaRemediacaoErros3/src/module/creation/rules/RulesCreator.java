package module.creation.rules;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import jeops.compiler.Main;
import util.ConstantesString;
import entity.CorrectAnswer;
import entity.MultipleExternalRepresentation;
import entity.RuleInformation;
import entity.WrongAnswer;

public class RulesCreator {
	
	public static void createRules(WrongAnswer wrongAnswer, MultipleExternalRepresentation mer) {
	
		// create for Expressions Identifier

		editFileRule(ConstantesString.FILE_EXPRESSION_IDENTIFIER_WRONG_ANSWER_KB, ruleWrongAnswer(wrongAnswer));
		Main.main(new String[]{ConstantesString.FILE_EXPRESSION_IDENTIFIER_WRONG_ANSWER_KB});
		
		// create for Error Sorter
		
		// create for MER Function Sorter
		
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

}
