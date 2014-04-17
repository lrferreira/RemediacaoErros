package modulo.identificador.expressoes;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import modulo.classificador.erro.ClassificadorErroControlador;
import modulo.classificador.funcaomre.ClassificadorFuncaoMREControlador;
import modulo.gerenciador.mre.GerenciadorMREControlador;
import br.ufpr.c3sl.condigital.virtualkeyboard.communication.KeyBoardComunication;
import br.ufpr.c3sl.condigital.virtualkeyboard.formula.ElementOfFormula;
import br.ufpr.c3sl.condigital.virtualkeyboard.main.VirtualKeyBoardMain;
import entidades.Acao;
import entidades.Aluno;
import entidades.FuncaoMRE;
import entidades.Historico;
import entidades.Resposta;
import entidades.RespostaCerta;
import entidades.RespostaErrada;


public class Principal {
	


	public static void main(String[] args) {
		
		
		
		
		ArrayList<RespostaErrada> erros = new ArrayList<RespostaErrada>();
		erros.add(new RespostaErrada("1"));
		erros.add(new RespostaErrada("2"));
		erros.add(new RespostaErrada("3"));
		erros.add(new RespostaErrada("4"));
		erros.add(new RespostaErrada("5"));
		
		ArrayList<RespostaCerta> acertos = new ArrayList<RespostaCerta>();
		acertos.add(new RespostaCerta("6"));
		
		
		Historico historico = new Historico();
		
		historico.setAluno(new Aluno());
		historico.setEtapa(new Acao());
		historico.setNumeroTentativas(1);
		Resposta respostaAluno = new Resposta();

		respostaAluno.setKeyboard(new VirtualKeyBoardMain(true, true));
		respostaAluno.setCommunication(new KeyBoardComunication());
		respostaAluno.getKeyboard().setCommunication(respostaAluno.getCommunication());
		respostaAluno.getCommunication().addObserver(respostaAluno);
		respostaAluno.getKeyboard().setVisible(true);
		
		while (respostaAluno.getKeyboard().isActive()) {
			
		}
		
		historico.setResposta(respostaAluno);
		System.out.println("Resposta do aluno: " + respostaAluno.getDescricao());

		
		RespostaErrada respostaErrada = new RespostaErrada();
		
		IdentificadorExpressaoControlador.identificaExpressao(historico, erros, acertos, respostaErrada);
		
		if (respostaErrada.getDescricao() != null){
		
			ClassificadorErroControlador.classificarErro(historico, respostaErrada);
			
			FuncaoMRE funcaoMRE = new FuncaoMRE();
			ClassificadorFuncaoMREControlador.classificarFuncaoMRE(historico, respostaErrada, funcaoMRE);
			
			GerenciadorMREControlador.aciona(historico, respostaErrada, funcaoMRE);
			
		
		}
		
		System.exit(1);		
	}
	

	
}
