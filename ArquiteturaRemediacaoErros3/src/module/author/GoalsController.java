package module.author;

import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextPane;

import module.entity.Action;
import module.entity.DBConnect;
import module.entity.Goal;
import module.entity.RuleToHuman;
import module.entity.WrongAnswer;
import module.error.sorter.ErrorSorterController;
import module.expression.identifier.ExpressionIdentifierController;
import module.mer.manager.MERManagerController;
import module.merfunction.sorter.MERFunctionSorterController;
import util.Constants;
import util.StringConstants;

public class GoalsController {

	public static ArrayList<Action> historicActions = new ArrayList<Action>();
	
	public static void run(Action action, JTextPane textPane, JLabel lblImg, DBConnect dbCon){
		//action.setAnswer(new Answer(action.getGoal().getComponent()));
		

		System.out.println("Resposta do aluno: " + 
							action.getAnswer().getValue());
		System.out.println("Tentativa n� " + action.getAttempt());
		
		RuleToHuman ruleToHuman = new RuleToHuman();
		ruleToHuman.setDescription("");
		
		
		
		
		ExpressionIdentifierController.identificaExpressao(action, dbCon, ruleToHuman);
		
		if (action.getCorrect() != null && action.isCorrect()) {
			textPane.setText(ruleToHuman.getDescription());
			if (action.getGoal().getSubGoal() != null){
				System.out.println("componente pr�xima meta: " + action.getGoal().getSubGoal().getComponent());
			}
			System.out.println("Resposta Correta! Fim!");
			//System.exit(1);
		}
		
		else{

			ErrorSorterController.classificarErro(action, dbCon, ruleToHuman);
			
			if ( ((WrongAnswer)action.getAnswer()).getErrorType() != null){
				MERFunctionSorterController.classificarFuncaoMRE(action, ruleToHuman, dbCon);
				
				if (action.getMerFunction().getId() != null){
					
					
					
					MERManagerController.aciona(action, historicActions, dbCon, ruleToHuman);
					String filePath = new File("").getAbsolutePath();
					
					if (action.getMer() != null) {
						
						String imgPath = filePath+File.separator+action.getMer().getImage();
						imgPath = imgPath.replace("bin", "images");
						
						System.out.println("Id = " + action.getMer().getId());
						System.out.println(" Descri��o = " + action.getMer().getDescription());
						System.out.println(" Image name: " + action.getMer().getImage());
						
						lblImg.setIcon(new ImageIcon(action.getMer().getImage()));
						lblImg.repaint();
						
					}

					textPane.setText(ruleToHuman.getDescription());
					
					System.out.println("Ap�s rodada: n� tentativas: " + action.getAttempt());
					
					
				}
				
			}
			
		}

	dbCon.save(action);
	historicActions.add(action);

	}
	

}
