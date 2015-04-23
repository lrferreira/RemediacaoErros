package module.error.sorter;

import module.entity.Action;
import module.entity.DBConnect;
import module.entity.RuleToHuman;

public class ErrorSorterController {


	public static void classificarErro(Action action, DBConnect dbCon, RuleToHuman ruleToHuman) {
		ErrorSorterKB classificadorErroKB = new ErrorSorterKB();
		classificadorErroKB.tell(action);
		classificadorErroKB.tell(dbCon);
		classificadorErroKB.tell(ruleToHuman);
		classificadorErroKB.run();
		
		ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");

	}
	
}
