package tests;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import module.error.sorter.ClassificadorErroControlador;
import module.expressions.identifier.IdentificadorExpressaoControlador;
import module.mer.manager.GerenciadorMREControlador;
import module.merfunction.sorter.ClassificadorFuncaoMREControlador;
import br.ufpr.c3sl.condigital.virtualkeyboard.communication.KeyBoardComunication;
import br.ufpr.c3sl.condigital.virtualkeyboard.formula.ElementOfFormula;
import br.ufpr.c3sl.condigital.virtualkeyboard.main.VirtualKeyBoardMain;
import entity.Action;
import entity.Student;
import entity.MERFunction;
import entity.Historic;
import entity.Answer;
import entity.CorrectAnswer;
import entity.WrongAnswer;


public class Principal {
	


	public static void main(String[] args) {
		
		
		
		
		ArrayList<WrongAnswer> erros = new ArrayList<WrongAnswer>();
		erros.add(new WrongAnswer("1"));
		erros.add(new WrongAnswer("2"));
		erros.add(new WrongAnswer("3"));
		erros.add(new WrongAnswer("4"));
		erros.add(new WrongAnswer("5"));
		
		ArrayList<CorrectAnswer> acertos = new ArrayList<CorrectAnswer>();
		acertos.add(new CorrectAnswer("6"));
		
		
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
		System.out.println("Answer do aluno: " + respostaAluno.getDescricao());

		
		WrongAnswer respostaErrada = new WrongAnswer();
		
		IdentificadorExpressaoControlador.identificaExpressao(historico, erros, acertos, respostaErrada);
		
		if (respostaErrada.getDescricao() != null){
		
			ClassificadorErroControlador.classificarErro(historico, respostaErrada);
			
			MERFunction funcaoMRE = new MERFunction();
			ClassificadorFuncaoMREControlador.classificarFuncaoMRE(historico, respostaErrada, funcaoMRE);
			
			GerenciadorMREControlador.aciona(historico, respostaErrada, funcaoMRE);
			
		
		}
		
		System.exit(1);		
	}
	

	
}
