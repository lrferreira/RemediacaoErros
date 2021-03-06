package module.author;

import java.io.File;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextPane;

import module.entity.Action;
import module.entity.DBConnect;
import module.entity.MERFunction;
import module.entity.MultipleExternalRepresentation;
import module.entity.RuleToHuman;
import module.entity.WrongAnswer;
import module.error.sorter.ErrorSorterController;
import module.expression.identifier.ExpressionIdentifierController;
import module.mer.manager.MERManagerController;
import module.merfunction.sorter.MERFunctionSorterController;
import util.Constants;
import util.StringConstants;

public class GoalsController {

	public static void run(Action action, JTextPane textPane, JLabel lblImg){
		//action.setAnswer(new Answer(action.getGoal().getComponent()));
		

		System.out.println("Resposta do aluno: " + 
							action.getAnswer().getValue());
		System.out.println("Tentativa n� " + action.getAttempt());
		
		RuleToHuman ruleToHuman = new RuleToHuman();
		ruleToHuman.setDescription("");
		
		DBConnect dbCon = null;
		try {
			dbCon = new DBConnect(StringConstants.FILE_DB);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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
					
					
					
					MultipleExternalRepresentation mer = new MultipleExternalRepresentation();
					MERManagerController.aciona(action, dbCon, ruleToHuman, mer);
					String filePath = new File("").getAbsolutePath();
					
					String imgPath = filePath+File.separator+mer.getImage();
					imgPath = imgPath.replace("bin", "images");
					
					System.out.println("Id = " + mer.getId());
					System.out.println(" Descri��o = " + mer.getDescription());
					System.out.println(" Image name: " + mer.getImage());
					
					lblImg.setIcon(new ImageIcon(mer.getImage()));
					lblImg.repaint();

					textPane.setText(ruleToHuman.getDescription());

					System.out.println("Ap�s rodada: n� tentativas: " + action.getAttempt());
					
					
				}
				
			}
			
		}

	

	}
	
	public void prepareCriterion(Action action, DBConnect dbCon){
		if (action.getRemediation() != null && action.getRemediation().getId() != null){
			
			if (action.getRemediation().getCriterion().getId().equals(Constants.CRITERIO_MRE_ESPECIFICA_ERRO)) {
				
			}
			else if (action.getRemediation().getCriterion().getId().equals(Constants.CRITERIO_NAO_USAR_MRE_ESPECIFICA)) {
				
			}
			else if (action.getRemediation().getCriterion().getId().equals(Constants.CRITERIO_PERSISTENCIA_ERRO)) {
				
			}
			else if (action.getRemediation().getCriterion().getId().equals(Constants.CRITERIO_ALTERNAR_ENTRE_MRE_TIPO_ESPECIFICADO)) {
				
			}		
			else if (action.getRemediation().getCriterion().getId().equals(Constants.CRITERIO_COMPLEXIDADE)) {
				
			}
			else if (action.getRemediation().getCriterion().getId().equals(Constants.CRITERIO_SUCESSOS_ANTERIORES_MRE)) {
				dbCon.getMersBySuccess(action.getMerFunction().getId());
			}
			
		}
	}
}
