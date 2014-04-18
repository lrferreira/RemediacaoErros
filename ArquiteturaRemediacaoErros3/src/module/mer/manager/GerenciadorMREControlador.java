package module.mer.manager;

import java.util.ArrayList;

import entity.MERFunction;
import entity.Historic;
import entity.MultipleExternalRepresentation;
import entity.WrongAnswer;

public class GerenciadorMREControlador {

	public static void aciona(Historic h, WrongAnswer e, MERFunction funcao) {
		GerenciadorMREBaseRegras gerenciadorMREKB = new GerenciadorMREBaseRegras();
		gerenciadorMREKB.tell(h);
		gerenciadorMREKB.tell(funcao);
		gerenciadorMREKB.tell(e);
		
		ArrayList<MultipleExternalRepresentation> representacoes = new ArrayList<MultipleExternalRepresentation>();
		representacoes.add(new MultipleExternalRepresentation(1, "Figura de Pedro e Helena mostrando pontos de interrogação e o esqueleto da operação que se espera do aluno"));
		representacoes.add(new MultipleExternalRepresentation(2, "Figura procurando mostrar que Helena possui mais laranjas que Pedro"));
		representacoes.add(new MultipleExternalRepresentation(3, "Figura apresentando a quantidade de laranjas que cada pessoa possui"));
		representacoes.add(new MultipleExternalRepresentation(4, "Figura destacando que Helena possui mais laranjas que o indicado no cesto"));
		representacoes.add(new MultipleExternalRepresentation(5, "Figura enumerando as laranjas extras que Helena possui, para o aluno poder identificar a quantidade exata de laranjas que ela possui"));
		representacoes.add(new MultipleExternalRepresentation(6, "Texto exibindo os principais conceitos aritméticos para retomar a base conceitual do aprendiz"));
		
		gerenciadorMREKB.tell(representacoes);
		gerenciadorMREKB.run();
	}
	
	public static MultipleExternalRepresentation getMRE(ArrayList representacoes, int indice) {
		return (MultipleExternalRepresentation) representacoes.get(indice - 1);
	}
	
}
