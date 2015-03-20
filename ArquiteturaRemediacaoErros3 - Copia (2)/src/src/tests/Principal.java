package src.tests;

import module.entity.Action;
import module.entity.Answer;
import module.entity.CorrectAnswer;
import module.entity.Historic;
import module.entity.MERFunction;
import module.entity.MultipleExternalRepresentation;
import module.entity.Student;
import module.entity.WrongAnswer;
import module.error.sorter.ErrorSorterController;
import module.expression.identifier.ExpressionIdentifierController;
import module.mer.manager.MERManagerController;
import module.merfunction.sorter.MERFunctionSorterController;
import br.ufpr.c3sl.condigital.virtualkeyboard.communication.KeyBoardComunication;
import br.ufpr.c3sl.condigital.virtualkeyboard.main.VirtualKeyBoardMain;


public class Principal {
	


	public static void main(String[] args) {
		
		
	/*	
		
		
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
		
		ExpressionIdentifierController.identificaExpressao(historico, respostaCerta, respostaErrada);
		
		if (respostaCerta.getDescricao() != null) {
			System.out.println("Resposta Correta! Fim!");
			System.exit(1);
		}
		
		else{
		
			ErrorSorterController.classificarErro(respostaErrada);
			
			MERFunction funcaoMRE = new MERFunction();
			MERFunctionSorterController.classificarFuncaoMRE(respostaErrada, funcaoMRE);
			
			MultipleExternalRepresentation mer = null;
			MERManagerController.aciona(respostaErrada, funcaoMRE, mer);
			
		
		}
		
		System.exit(1);		
	 */
	}
	

}
