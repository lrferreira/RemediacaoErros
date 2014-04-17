package module.expressions.identifier;

import java.util.ArrayList;

import entity.Historic;
import entity.CorrectAnswer;
import entity.WrongAnswer;

public class IdentificadorExpressaoControlador {
	
	public static void identificaExpressao(Historic historico, ArrayList<WrongAnswer> erros, 
			ArrayList<CorrectAnswer> acertos, WrongAnswer respostaErrada) {
		IdentificadorExpressaoControlador controlador  = new IdentificadorExpressaoControlador();
		IdentificadorExpressaoBaseRegras identificadorExpressaoKB = new IdentificadorExpressaoBaseRegras();
		
		identificadorExpressaoKB.tell(erros);
		identificadorExpressaoKB.tell(acertos);
		identificadorExpressaoKB.tell(historico);
		identificadorExpressaoKB.tell(controlador);
		identificadorExpressaoKB.tell(respostaErrada);
		identificadorExpressaoKB.run();
		identificadorExpressaoKB.flush();
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
