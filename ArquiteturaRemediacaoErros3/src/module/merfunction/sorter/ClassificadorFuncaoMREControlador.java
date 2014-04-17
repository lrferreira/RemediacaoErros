package module.merfunction.sorter;

import entity.MERFunction;
import entity.Historic;
import entity.WrongAnswer;

public class ClassificadorFuncaoMREControlador {

	public static void classificarFuncaoMRE(Historic historico, WrongAnswer erro, MERFunction funcaoMRE) {
		ClassificadorFuncaoMREBaseRegras classificadorFuncaoMREKB = new ClassificadorFuncaoMREBaseRegras();
		classificadorFuncaoMREKB.tell(historico);
		classificadorFuncaoMREKB.tell(erro);
		classificadorFuncaoMREKB.tell(funcaoMRE);
		classificadorFuncaoMREKB.run();
	}
}
