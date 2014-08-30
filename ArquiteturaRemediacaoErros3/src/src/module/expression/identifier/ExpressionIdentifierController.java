package module.expression.identifier;

import module.entity.Action;
import module.entity.CorrectAnswer;
import module.entity.RuleToHuman;
import module.entity.WrongAnswer;

public class ExpressionIdentifierController {
	
	public static void identificaExpressao(Action action, RuleToHuman ruleToHuman) {
		
		ExpressionIdentifierCorrectAnswerKB kb1 = new ExpressionIdentifierCorrectAnswerKB();
		ExpressionIdentifierWrongAnswerKB kb2 = new ExpressionIdentifierWrongAnswerKB();
		
		kb1.tell(action);
		kb1.tell(ruleToHuman);
		kb1.run();
		
		kb2.tell(action);
		kb2.tell(ruleToHuman);
		kb2.run();
		
		ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");

	}

	
}
