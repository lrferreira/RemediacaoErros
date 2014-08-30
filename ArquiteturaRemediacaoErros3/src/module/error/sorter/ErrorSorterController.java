package module.error.sorter;

import module.entity.Historic;
import module.entity.RuleToHuman;
import module.entity.WrongAnswer;

public class ErrorSorterController {


	public static void classificarErro(Historic h, RuleToHuman ruleToHuman, WrongAnswer erro) {
		ErrorSorterKB classificadorErroKB = new ErrorSorterKB();
		classificadorErroKB.tell(h);
		classificadorErroKB.tell(erro);
		classificadorErroKB.tell(ruleToHuman);
		classificadorErroKB.run();
		
		ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");

	}
	
}
