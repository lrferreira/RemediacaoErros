package module.mer.manager;

import module.entity.Action;
import module.entity.DBConnect;
import module.entity.MERFunction;
import module.entity.MultipleExternalRepresentation;
import module.entity.RuleToHuman;

public class MERManagerController {

	public static void aciona(Action action, DBConnect dbCon, RuleToHuman ruleToHuman, MultipleExternalRepresentation mre) {
		MERManagerKB gerenciadorMREKB = new MERManagerKB();
		gerenciadorMREKB.tell(action);
		gerenciadorMREKB.tell(dbCon);
		gerenciadorMREKB.tell(mre);
		gerenciadorMREKB.tell(ruleToHuman);
				

		gerenciadorMREKB.run();
		
		ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");

	}
	
}
