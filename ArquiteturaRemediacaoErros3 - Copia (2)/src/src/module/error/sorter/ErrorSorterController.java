package src.module.error.sorter;

import module.entity.Action;
import module.entity.RuleToHuman;
import module.entity.WrongAnswer;

public class ErrorSorterController {


	public static void classificarErro(Action action, RuleToHuman ruleToHuman) {
		ErrorSorterKB classificadorErroKB = new ErrorSorterKB();
		classificadorErroKB.tell(action);
		classificadorErroKB.tell(ruleToHuman);
		classificadorErroKB.run();
		
		ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");

	}
	
}
