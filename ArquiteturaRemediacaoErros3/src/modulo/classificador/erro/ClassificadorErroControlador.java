package modulo.classificador.erro;

import entidades.RespostaErrada;
import entidades.Historico;

public class ClassificadorErroControlador {


	public static void classificarErro(Historico historico, RespostaErrada erro) {
		ClassificadorErroBaseRegras classificadorErroKB = new ClassificadorErroBaseRegras();
		classificadorErroKB.tell(historico);
		classificadorErroKB.tell(erro);
		classificadorErroKB.run();
		
	}
	
}
