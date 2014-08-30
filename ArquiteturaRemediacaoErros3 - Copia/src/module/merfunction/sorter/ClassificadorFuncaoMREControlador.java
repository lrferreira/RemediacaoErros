package module.merfunction.sorter;

import entity.MERFunction;
import entity.Historic;
import entity.WrongAnswer;

public class ClassificadorFuncaoMREControlador {

	public static void classificarFuncaoMRE(WrongAnswer erro, MERFunction funcaoMRE) {
		MERFunctionSorterKB classificadorFuncaoMREKB = new MERFunctionSorterKB();
		classificadorFuncaoMREKB.tell(erro);
		classificadorFuncaoMREKB.tell(funcaoMRE);
		classificadorFuncaoMREKB.run();
	}
}
