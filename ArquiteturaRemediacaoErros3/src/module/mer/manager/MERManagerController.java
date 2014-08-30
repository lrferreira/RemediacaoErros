package module.mer.manager;

import java.util.ArrayList;

import module.entity.MERFunction;
import module.entity.MultipleExternalRepresentation;
import module.entity.RuleToHuman;
import module.entity.WrongAnswer;

public class MERManagerController {

	public static void aciona(WrongAnswer e, RuleToHuman ruleToHuman, MERFunction funcao, MultipleExternalRepresentation mre) {
		MERManagerKB gerenciadorMREKB = new MERManagerKB();
		gerenciadorMREKB.tell(e);
		gerenciadorMREKB.tell(funcao);
		gerenciadorMREKB.tell(mre);
		gerenciadorMREKB.tell(ruleToHuman);
				

		gerenciadorMREKB.run();
		
		ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");

	}
	
}
