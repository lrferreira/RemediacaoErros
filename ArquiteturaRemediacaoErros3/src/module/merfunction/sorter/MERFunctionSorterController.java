package module.merfunction.sorter;

import module.entity.Action;
import module.entity.DBConnect;
import module.entity.MERFunction;
import module.entity.RuleToHuman;

public class MERFunctionSorterController {

	public static void classificarFuncaoMRE(Action action, RuleToHuman ruleToHuman, DBConnect dbCon) {
		MERFunctionSorterKB classificadorFuncaoMREKB = new MERFunctionSorterKB();
		classificadorFuncaoMREKB.tell(action);
		classificadorFuncaoMREKB.tell(dbCon);
		classificadorFuncaoMREKB.tell(ruleToHuman);
		classificadorFuncaoMREKB.run();
		ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");

	}
}
