package module.author;

import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import module.entity.Action;
import module.entity.Answer;
import module.entity.CorrectAnswer;
import module.entity.MERFunction;
import module.entity.MultipleExternalRepresentation;
import module.entity.RuleToHuman;
import module.entity.WrongAnswer;
import module.error.sorter.ErrorSorterController;
import module.expression.identifier.ExpressionIdentifierController;
import module.mer.manager.MERManagerController;
import module.merfunction.sorter.MERFunctionSorterController;

public class GoalsController {

	public static void run(Action action, JTextPane textPane, JLabel lblImg){
		action.setAnswer(new Answer(((JTextField)action.getGoal().getComponent()).getText()));
		

		System.out.println("Resposta do aluno: " + 
							action.getAnswer().getValue());
		System.out.println("Tentativa nº " + action.getAttempt());
		
		RuleToHuman ruleToHuman = new RuleToHuman();
		ruleToHuman.setDescription("");
		
		
		ExpressionIdentifierController.identificaExpressao(action, ruleToHuman);
		
		if (action.getCorrect() != null && action.isCorrect()) {
			textPane.setText(ruleToHuman.getDescription());
			if (action.getGoal().getSubGoal() != null){
				System.out.println("componente próxima meta: " + action.getGoal().getSubGoal().getComponent().getName());
				action.getGoal().getSubGoal().getComponent().setEnabled(true);
				action.getGoal().getSubGoal().getComponent().requestFocusInWindow();
			}
			System.out.println("Resposta Correta! Fim!");
			//System.exit(1);
		}
		
		else{

			ErrorSorterController.classificarErro(action, ruleToHuman);
			
			if ( ((WrongAnswer)action.getAnswer()).getType() > 0){
				MERFunction funcaoMRE = new MERFunction();
				MERFunctionSorterController.classificarFuncaoMRE(action, ruleToHuman, funcaoMRE);
				
				if (funcaoMRE.getType() > 0){
					MultipleExternalRepresentation mer = new MultipleExternalRepresentation();
					MERManagerController.aciona(action, ruleToHuman, funcaoMRE, mer);
					String filePath = new File("").getAbsolutePath();
					String imgPath = filePath+File.separator+mer.getImageName();
					imgPath = imgPath.replace("bin", "images");
					System.out.println("Id = " + mer.getId());
					System.out.println(" Descrição = " + mer.getDescricao());
					System.out.println(" Image name: " + mer.getImageName());
					lblImg.setIcon(new ImageIcon(mer.getImageName()));
					lblImg.repaint();

					textPane.setText(ruleToHuman.getDescription());

					System.out.println("Após rodada: nº tentativas: " + action.getAttempt());
					
				}
				
			}
			
		}

	

	}
}
