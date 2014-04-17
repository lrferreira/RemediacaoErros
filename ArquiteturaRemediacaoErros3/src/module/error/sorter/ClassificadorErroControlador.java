package module.error.sorter;

import entity.Historic;
import entity.WrongAnswer;

public class ClassificadorErroControlador {


	public static void classificarErro(Historic historico, WrongAnswer erro) {
		ClassificadorErroBaseRegras classificadorErroKB = new ClassificadorErroBaseRegras();
		classificadorErroKB.tell(historico);
		classificadorErroKB.tell(erro);
		classificadorErroKB.run();
		
	}
	
}
