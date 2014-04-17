package modulo.identificador.expressoes;

import java.util.ArrayList;

import entidades.Historico;
import entidades.RespostaCerta;
import entidades.RespostaErrada;

public class IdentificadorExpressaoControlador {
	
	public static void identificaExpressao(Historico historico, ArrayList<RespostaErrada> erros, 
			ArrayList<RespostaCerta> acertos, RespostaErrada respostaErrada) {
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

	public boolean temRespostaErrada(Historico h, ArrayList<RespostaErrada> erros) {
		for (RespostaErrada e: erros) {
			if (h.getResposta().getDescricao().equalsIgnoreCase(e.getDescricao()))
				return true;
		}
		return false;
	}
	
	public boolean temRespostaCerta(Historico h, ArrayList<RespostaCerta> acertos) {
		for (RespostaCerta a : acertos) {
			if (h.getResposta().getDescricao().equalsIgnoreCase(a.getDescricao()))
				return true;
		}
		return false;
	}
	
}
