package tests;

import module.error.sorter.ClassificadorErroControlador;
import module.expression.identifier.IdentificadorExpressaoControlador;
import module.mer.manager.GerenciadorMREControlador;
import module.merfunction.sorter.ClassificadorFuncaoMREControlador;
import br.ufpr.c3sl.condigital.virtualkeyboard.communication.KeyBoardComunication;
import br.ufpr.c3sl.condigital.virtualkeyboard.main.VirtualKeyBoardMain;
import entity.Action;
import entity.Answer;
import entity.CorrectAnswer;
import entity.Historic;
import entity.MERFunction;
import entity.Student;
import entity.WrongAnswer;


public class Principal {
	


	public static void main(String[] args) {
		
		
		
		
		
		Historic historico = new Historic();
		
		historico.setAluno(new Student());
		historico.setEtapa(new Action());
		historico.setNumeroTentativas(1);
		Answer respostaAluno = new Answer();

		respostaAluno.setKeyboard(new VirtualKeyBoardMain(true, true));
		respostaAluno.setCommunication(new KeyBoardComunication());
		respostaAluno.getKeyboard().setCommunication(respostaAluno.getCommunication());
		respostaAluno.getCommunication().addObserver(respostaAluno);
		respostaAluno.getKeyboard().setVisible(true);
		
		while (respostaAluno.getKeyboard().isActive()) {
			
		}
		
		historico.setResposta(respostaAluno);
		System.out.println("Resposta do aluno: " + respostaAluno.getDescricao());

		
		WrongAnswer respostaErrada = new WrongAnswer();
		CorrectAnswer respostaCerta = new CorrectAnswer();
		
		IdentificadorExpressaoControlador.identificaExpressao(historico, respostaCerta, respostaErrada);
		
		if (respostaCerta.getDescricao() != null) {
			System.out.println("Resposta Correta! Fim!");
			System.exit(1);
		}
		
		else{
		
			ClassificadorErroControlador.classificarErro(respostaErrada);
			
			MERFunction funcaoMRE = new MERFunction();
			ClassificadorFuncaoMREControlador.classificarFuncaoMRE(respostaErrada, funcaoMRE);
			
			GerenciadorMREControlador.aciona(respostaErrada, funcaoMRE);
			
		
		}
		
		System.exit(1);		
	}
	

	
}
