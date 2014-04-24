package tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import util.Constantes;
import jeops.compiler.Main;
import module.creation.rules.RulesCreator;
import entity.MERFunction;
import entity.MultipleExternalRepresentation;
import entity.WrongAnswer;

public class CriaRegraDeProducao {

	public static void main(String[] args){
		RulesCreator.createRules(
				new WrongAnswer("123", Constantes.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO), 
				new MERFunction(), 
				new MultipleExternalRepresentation(1, "representação teste"));
	}
		
	public static void teste(){	
		//Main.main(new String[]{".\\src\\tests\\TesteCriaRegrasBaseRegras.rules"});;
		
		//Código para escrever em arquivos: 

			try {  
				   String fileName = ".\\src\\tests\\TesteCriaRegrasBaseRegras.rules";
				   String fileNameNew = ".\\src\\tests\\TesteCriaRegrasBaseRegras_novo.rules";
				   
				   BufferedReader in = new BufferedReader(new FileReader(fileName));
				   BufferedWriter out = new BufferedWriter(new FileWriter(fileNameNew));  
				   
				   String str;
				    while ((str = in.readLine()) != null) {  
				        System.out.println(str);  
				        if (str.equalsIgnoreCase("// fim_regras")) {
				        	// inserir nova regra aqui
				        	writeRule(out);
				        }
				        out.write(str); out.write("\n");
				    }  
				    
				   in.close();
				   out.close();
				   
				   File oldFile = new File(fileName);
				   File newFile = new File(fileNameNew);
				   
				   if (oldFile.delete()) {
					   if (newFile.renameTo(oldFile)) {
						   newFile.delete();
					   }
				   }

					Main.main(new String[]{".\\src\\tests\\TesteCriaRegrasBaseRegras.rules"});;

				   System.exit(1);

				   
			   

			       
			   } catch (IOException e) { 
				   e.printStackTrace();
			   }  

			Main.main(new String[]{".\\src\\tests\\TesteCriaRegrasBaseRegras.rules"});;
			

		//	Ler conteúdo de arquivos: 
/*
			try {  
			    BufferedReader in = new BufferedReader(new FileReader("infilename"));  
			    String str;  
			    while ((str = in.readLine()) != null) {  
			        //process(str);  
			    }  
			    in.close();  
			} catch (IOException e) {  
			}  
*/
		
	}
	
	public static void writeRule(BufferedWriter out){
		try {
/*
			out.write("package tests;\n");

			out.write("import entity.Historic;\n");
	       out.write("import entity.WrongAnswer;\n");
	       out.write("import java.util.ArrayList;\n");
	       out.write("import module.error.sorter.ClassificadorErroControlador;\n");
		   out.write("import module.expression.identifier.IdentificadorExpressaoControlador;\n");
		   

		   out.write("ruleBase TesteCriaRegrasBaseRegras {\n");
*/
		   out.write("rule detectaRespostaErrada_1 {\n");
		   out.write("declarations\n");
		   out.write("Historic historico;\n");
		   out.write("ArrayList erros;\n");
		   out.write("ArrayList acertos;\n");
		   out.write("IdentificadorExpressaoControlador expressaoControlador;\n");
		   out.write("WrongAnswer respostaErrada;\n");
		   out.write("localdecl\n");
						
		   out.write("conditions\n");
		   out.write("expressaoControlador.temRespostaErrada(historico, erros);\n");
		   out.write("actions\n");
		   out.write("historico.setNumeroTentativas(historico.getNumeroTentativas() + 1);\n");
		   out.write("modified(historico);\n");
		   out.write("System.out.println(\"Resposta Errada (1) detectada\");\n");
		   out.write("respostaErrada.setDescricao(historico.getResposta().getDescricao());\n");
		   out.write("modified(respostaErrada);\n");
		   out.write("retract(historico);\n");
		   out.write("retract(erros);\n");
		   out.write("retract(acertos);\n");
		   out.write("retract(expressaoControlador);\n");
		   out.write("retract(respostaErrada);\n");
		   out.write("}\n");
		   
//		   out.write("}\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
