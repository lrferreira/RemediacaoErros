package module.expression.identifier;

import module.entity.Action;
import module.entity.DBConnect;
import module.entity.Remediation;
import module.entity.RuleToHuman;

public class ExpressionIdentifierController {
	
	public static void identificaExpressao(Action action, DBConnect dbCon, RuleToHuman ruleToHuman) {
		
		ExpressionIdentifierCorrectAnswerKB kb1 = new ExpressionIdentifierCorrectAnswerKB();
		ExpressionIdentifierWrongAnswerKB kb2 = new ExpressionIdentifierWrongAnswerKB();
		
		kb1.tell(action);
		kb1.tell(ruleToHuman);
		kb1.run();
		
		kb2.tell(action);
		kb2.tell(dbCon);
		kb2.tell(ruleToHuman);
		kb2.run();
		
		ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");

	}

	
}
