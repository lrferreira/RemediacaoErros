package module.expression.identifier;

import module.entity.CorrectAnswer;
import module.entity.Historic;
import module.entity.RuleToHuman;
import module.entity.WrongAnswer;

public class ExpressionIdentifierController {
	
	public static void identificaExpressao(Historic historico, RuleToHuman ruleToHuman, CorrectAnswer correctAnswer, WrongAnswer wrongAnswer) {
		
		ExpressionIdentifierCorrectAnswerKB kb1 = new ExpressionIdentifierCorrectAnswerKB();
		ExpressionIdentifierWrongAnswerKB kb2 = new ExpressionIdentifierWrongAnswerKB();
		
		kb1.tell(historico);
		kb1.tell(correctAnswer);
		kb1.tell(ruleToHuman);
		kb1.run();
		
		kb2.tell(historico);
		kb2.tell(wrongAnswer);
		kb2.tell(ruleToHuman);
		kb2.run();
		
		ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");

	}

	
}
