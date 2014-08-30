package module.mer.manager;

import java.util.ArrayList;

import entity.MERFunction;
import entity.Historic;
import entity.MultipleExternalRepresentation;
import entity.WrongAnswer;

public class GerenciadorMREControlador {

	public static void aciona(WrongAnswer e, MERFunction funcao) {
		MERManagerKB gerenciadorMREKB = new MERManagerKB();
		gerenciadorMREKB.tell(e);
		gerenciadorMREKB.tell(funcao);
				

		gerenciadorMREKB.run();
	}
	
	public static MultipleExternalRepresentation getMRE(ArrayList representacoes, int indice) {
		return (MultipleExternalRepresentation) representacoes.get(indice - 1);
	}
	
}
