package module.merfunction.sorter;

import module.entity.Historic;
import module.entity.MERFunction;
import module.entity.RuleToHuman;
import module.entity.WrongAnswer;

public class MERFunctionSorterController {

	public static void classificarFuncaoMRE(Historic h, RuleToHuman ruleToHuman, WrongAnswer erro, MERFunction funcaoMRE) {
		MERFunctionSorterKB classificadorFuncaoMREKB = new MERFunctionSorterKB();
		classificadorFuncaoMREKB.tell(h);
		classificadorFuncaoMREKB.tell(erro);
		classificadorFuncaoMREKB.tell(funcaoMRE);
		classificadorFuncaoMREKB.tell(ruleToHuman);
		classificadorFuncaoMREKB.run();
		ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");

	}
}
