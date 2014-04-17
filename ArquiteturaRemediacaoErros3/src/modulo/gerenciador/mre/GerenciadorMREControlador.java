package modulo.gerenciador.mre;

import java.util.ArrayList;

import entidades.FuncaoMRE;
import entidades.Historico;
import entidades.MultiplaRepresentacaoExterna;
import entidades.RespostaErrada;

public class GerenciadorMREControlador {

	public static void aciona(Historico h, RespostaErrada e, FuncaoMRE funcao) {
		GerenciadorMREBaseRegras gerenciadorMREKB = new GerenciadorMREBaseRegras();
		gerenciadorMREKB.tell(h);
		gerenciadorMREKB.tell(funcao);
		gerenciadorMREKB.tell(e);
		
		ArrayList<MultiplaRepresentacaoExterna> representacoes = new ArrayList<MultiplaRepresentacaoExterna>();
		representacoes.add(new MultiplaRepresentacaoExterna(1, "Figura de Pedro e Helena mostrando pontos de interrogação e o esqueleto da operação que se espera do aluno"));
		representacoes.add(new MultiplaRepresentacaoExterna(2, "Figura procurando mostrar que Helena possui mais laranjas que Pedro"));
		representacoes.add(new MultiplaRepresentacaoExterna(3, "Figura apresentando a quantidade de laranjas que cada pessoa possui"));
		representacoes.add(new MultiplaRepresentacaoExterna(4, "Figura destacando que Helena possui mais laranjas que o indicado no cesto"));
		representacoes.add(new MultiplaRepresentacaoExterna(5, "Figura enumerando as laranjas extras que Helena possui, para o aluno poder identificar a quantidade exata de laranjas que ela possui"));
		representacoes.add(new MultiplaRepresentacaoExterna(6, "Texto exibindo os principais conceitos aritméticos para retomar a base conceitual do aprendiz"));
		
		gerenciadorMREKB.tell(representacoes);
		gerenciadorMREKB.run();
	}
	
	public static MultiplaRepresentacaoExterna getMRE(ArrayList representacoes, int indice) {
		return (MultiplaRepresentacaoExterna) representacoes.get(indice - 1);
	}
	
}
