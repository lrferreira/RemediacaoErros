package module.merfunction.sorter;

import javax.swing.JComponent;

import module.entity.Action;
import module.entity.MERFunction;
import module.entity.RuleToHuman;
import module.entity.WrongAnswer;

public class MERFunctionSorterController {

	public static void classificarFuncaoMRE(Action action, RuleToHuman ruleToHuman, MERFunction funcaoMRE) {
		MERFunctionSorterKB classificadorFuncaoMREKB = new MERFunctionSorterKB();
		classificadorFuncaoMREKB.tell(action);
		classificadorFuncaoMREKB.tell(funcaoMRE);
		classificadorFuncaoMREKB.tell(ruleToHuman);
		classificadorFuncaoMREKB.run();
		ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");

	}
}
