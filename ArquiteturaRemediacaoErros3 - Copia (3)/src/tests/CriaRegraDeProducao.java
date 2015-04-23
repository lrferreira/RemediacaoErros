package tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import jeops.compiler.Main;
import module.creation.rules.RulesFactory;
import module.entity.CorrectAnswer;
import module.entity.MERFunction;
import module.entity.MultipleExternalRepresentation;
import module.entity.WrongAnswer;
import util.Constants;
import util.StringConstants;

public class CriaRegraDeProducao {

	public static void main(String[] args){
			
			int i = 0;
/*
			RulesFactory.createRules(new CorrectAnswer(new String[]{"6", "10","16"}));
			RulesFactory.createRules(new CorrectAnswer(new String[]{"10", "6","16"}));

			// O aprendiz n�o consegue identificar que Helena possui uma quantidade maior.
			RulesFactory.createRules(
					new WrongAnswer(new String[]{"10","10","16"}, Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO), 
					new MERFunction(), 
					new MultipleExternalRepresentation(++i, "diretamente_identificavel_deficiencia_dominio.png", "Figura de Pedro e Helena mostrando pontos de interroga��o e o esqueleto da opera��o que se espera do aluno"),
					-1);
			RulesFactory.createRules(
					new WrongAnswer(new String[]{"6","6","16"}, Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO), 
					new MERFunction(), 
					new MultipleExternalRepresentation(++i, "diretamente_identificavel_deficiencia_dominio.png", "Figura de Pedro e Helena mostrando pontos de interroga��o e o esqueleto da opera��o que se espera do aluno"),
					-1);
			RulesFactory.createRules(
					new WrongAnswer(new String[]{"10","10",""}, Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO), 
					new MERFunction(), 
					new MultipleExternalRepresentation(++i, "diretamente_identificavel_deficiencia_dominio.png", "Figura de Pedro e Helena mostrando pontos de interroga��o e o esqueleto da opera��o que se espera do aluno"),
					-1);
			RulesFactory.createRules(
					new WrongAnswer(new String[]{"6","6",""}, Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO), 
					new MERFunction(), 
					new MultipleExternalRepresentation(++i, "diretamente_identificavel_deficiencia_dominio.png", "Figura de Pedro e Helena mostrando pontos de interroga��o e o esqueleto da opera��o que se espera do aluno"),
					-1);

	// criar mecanismo neste caso para identificar todas as respostas erradas quando o aluno informa mesmo valor para as parcelas
	// criar mecanismo estilo independente da resposta
			
			
			//A estrat�gia do aprendiz apresenta a seguinte solu��o: 10 - 6 = ?
			RulesFactory.createRules(
					new WrongAnswer(new String[]{"10","6","4"}, Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR), 
					new MERFunction(), 
					new MultipleExternalRepresentation(++i, "diretamente_identificavel_deficiencia_escolha_operador.png", "Figura procurando mostrar que Helena possui mais laranjas que Pedro"),
					-1);

			
			//O aprendiz ainda n�o se apropriou da parte conceitual, quando n�o consegue
			//identificar cada personagem com suas respectivas quantidades.
			RulesFactory.createRules(
					new WrongAnswer(new String[]{"", "", ""}, Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_REGRA), 
					new MERFunction(), 
					new MultipleExternalRepresentation(++i, "diretamente_identificavel_deficiencia_regra.png", "Figura apresentando a quantidade de laranjas que cada pessoa possui"),
					2);

			
			//O aprendiz n�o consegue perceber que a quantidade de laranjas de Helena � maior que a de Pedro.
			RulesFactory.createRules(
					new WrongAnswer(new String[]{"10", "6", "6"}, Constants.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL), 
					new MERFunction(), 
					new MultipleExternalRepresentation(++i, "indiretamente_identificavel.png", "Figura destacando que Helena possui mais laranjas que o indicado no cesto"),
					2);

			
			RulesFactory.createRules(
					new WrongAnswer(new String[]{"", "", ""}, Constants.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA), 
					new MERFunction(), 
					new MultipleExternalRepresentation(++i, "interpretacao_equivocada.png", "Figura enumerando as laranjas extras que Helena possui, para o aluno poder identificar a quantidade exata de laranjas que ela possui"),
					2);

			//Caso o erro cometido n�o esteja contemplado em nenhuma classifica��o acima, o
			//erro ser� inclu�do nesta se��o at� ser analisada a necessidade de uma nova categoria.
			RulesFactory.createRules(
					new WrongAnswer(new String[]{"1", "1", "1"}, Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL), 
					new MERFunction(), 
					new MultipleExternalRepresentation(++i, "compreensao_aprofundada", "Texto exibindo os principais conceitos aritm�ticos para retomar a base conceitual do aprendiz"),
					-1);

			String filePath = new File("").getAbsolutePath();
	        System.out.println (filePath);
	        filePath = filePath.replace("\\bin", "\\src");
	        //filePath = filePath + "\\src"; 
			Main.main(new String[]{filePath+StringConstants.FILE_EXPRESSION_IDENTIFIER_CORRECT_ANSWER_KB});
			Main.main(new String[]{filePath+StringConstants.FILE_EXPRESSION_IDENTIFIER_WRONG_ANSWER_KB});
			Main.main(new String[]{filePath+StringConstants.FILE_ERROR_SORTER_KB});
			Main.main(new String[]{filePath+StringConstants.FILE_MERFUNCTION_SORTER_KB});
			Main.main(new String[]{filePath+StringConstants.FILE_MER_MANAGER_KB});
			

		/*
		RulesFactory.createRules(new CorrectAnswer("16"));
		
		RulesFactory.createRules(
				new WrongAnswer("123", Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_DOMINIO), 
				new MERFunction(), 
				new MultipleExternalRepresentation(1, "diretamente_identificavel_deficiencia_dominio.png", "Figura de Pedro e Helena mostrando pontos de interroga��o e o esqueleto da opera��o que se espera do aluno"));

		RulesFactory.createRules(
				new WrongAnswer("456", Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_ESCOLHA_OPERADOR), 
				new MERFunction(), 
				new MultipleExternalRepresentation(2, "diretamente_identificavel_deficiencia_escolha_operador.png", "Figura procurando mostrar que Helena possui mais laranjas que Pedro"));

		RulesFactory.createRules(
				new WrongAnswer("789", Constants.TIPO_ERRO_DIRETAMENTE_IDENTIFICAVEL_DEFICIENCIA_REGRA), 
				new MERFunction(), 
				new MultipleExternalRepresentation(3, "diretamente_identificavel_deficiencia_regra.png", "Figura apresentando a quantidade de laranjas que cada pessoa possui"));

		RulesFactory.createRules(
				new WrongAnswer("4", Constants.TIPO_ERRO_INDIRETAMENTE_IDENTIFICAVEL), 
				new MERFunction(), 
				new MultipleExternalRepresentation(4, "indiretamente_identificavel.png", "Figura destacando que Helena possui mais laranjas que o indicado no cesto"));

		RulesFactory.createRules(
				new WrongAnswer("3", Constants.TIPO_ERRO_INTERPRETACAO_EQUIVOCADA), 
				new MERFunction(), 
				new MultipleExternalRepresentation(5, "interpretacao_equivocada.png", "Figura enumerando as laranjas extras que Helena possui, para o aluno poder identificar a quantidade exata de laranjas que ela possui"));

		RulesFactory.createRules(
				new WrongAnswer("1", Constants.TIPO_ERRO_SOLUCAO_NAO_CATEGORIZAVEL), 
				new MERFunction(), 
				new MultipleExternalRepresentation(6, "", "Texto exibindo os principais conceitos aritm�ticos para retomar a base conceitual do aprendiz"));

*/
	}
		
	public static void teste(){	
		//Main.main(new String[]{".\\src\\tests\\TesteCriaRegrasBaseRegras.rules"});;
		
		//C�digo para escrever em arquivos: 

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
			

		//	Ler conte�do de arquivos: 
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

			out.write("import module.entity.Historic;\n");
	       out.write("import module.entity.WrongAnswer;\n");
	       out.write("import java.util.ArrayList;\n");
	       out.write("import module.error.sorter.ErrorSorterController;\n");
		   out.write("import module.expression.identifier.ExpressionIdentifierController;\n");
		   

		   out.write("ruleBase TesteCriaRegrasBaseRegras {\n");
*/
		   out.write("rule detectaRespostaErrada_1 {\n");
		   out.write("declarations\n");
		   out.write("Historic historico;\n");
		   out.write("ArrayList erros;\n");
		   out.write("ArrayList acertos;\n");
		   out.write("ExpressionIdentifierController expressaoControlador;\n");
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
