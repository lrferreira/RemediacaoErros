package module.expression.identifier;

import java.util.ArrayList;

import entity.CorrectAnswer;
import entity.Historic;
import entity.WrongAnswer;

public class IdentificadorExpressaoControlador {
	
	public static void identificaExpressao(Historic historico, CorrectAnswer correctAnswer, WrongAnswer wrongAnswer) {
		
		ExpressionIdentifierCorrectAnswerKB kb1 = new ExpressionIdentifierCorrectAnswerKB();
		ExpressionIdentifierWrongAnswerKB kb2 = new ExpressionIdentifierWrongAnswerKB();
		
		kb1.tell(historico);
		kb1.tell(correctAnswer);
		kb1.run();
		
		kb2.tell(historico);
		kb2.tell(wrongAnswer);
		kb2.run();
		
	}

	public boolean temRespostaErrada(Historic h, ArrayList<WrongAnswer> erros) {
		for (WrongAnswer e: erros) {
			if (h.getResposta().getDescricao().equalsIgnoreCase(e.getDescricao()))
				return true;
		}
		return false;
	}
	
	public boolean temRespostaCerta(Historic h, ArrayList<CorrectAnswer> acertos) {
		for (CorrectAnswer a : acertos) {
			if (h.getResposta().getDescricao().equalsIgnoreCase(a.getDescricao()))
				return true;
		}
		return false;
	}
	
}
