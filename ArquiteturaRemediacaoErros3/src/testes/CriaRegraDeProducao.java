package testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import jeops.compiler.Main;

public class CriaRegraDeProducao {

	public static void main(String[] args){
		
		//TesteCriaRegrasBaseRegras testeKB = new TesteCriaRegrasBaseRegras();
		//testeKB.createRuleBase();
		
		Main.main(new String[]{".\\src\\testes\\TesteCriaRegrasBaseRegras.rules"});;
		
		//Código para escrever em arquivos: 

			try {  
			       BufferedWriter out = new BufferedWriter(new FileWriter("outfilename"));  
			       out.write("aString");  
			       out.close();  
			   } catch (IOException e) {  
			   }  


		//	Ler conteúdo de arquivos: 

			try {  
			    BufferedReader in = new BufferedReader(new FileReader("infilename"));  
			    String str;  
			    while ((str = in.readLine()) != null) {  
			        //process(str);  
			    }  
			    in.close();  
			} catch (IOException e) {  
			}  

		
	}
}
