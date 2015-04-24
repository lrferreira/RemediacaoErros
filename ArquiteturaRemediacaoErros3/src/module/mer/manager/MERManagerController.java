package module.mer.manager;

import java.util.ArrayList;

import jeops.conflict.OneShotConflictSet;
import module.entity.Action;
import module.entity.DBConnect;
import module.entity.RuleToHuman;
import util.Constants;

public class MERManagerController {

	public static void aciona(Action action, ArrayList<Action> historic, DBConnect dbCon, RuleToHuman ruleToHuman) {

		if (action.getRemediation() != null && action.getRemediation().getId() != null){
			
			if (action.getRemediation().getCriterion().getId().equals(Constants.CRITERIO_MRE_ESPECIFICA_ERRO)) {
				MERManagerSpecificMERKB gerenciadorMREKB = new MERManagerSpecificMERKB();
				gerenciadorMREKB.tell(action);
				gerenciadorMREKB.tell(dbCon);
				gerenciadorMREKB.tell(ruleToHuman);
						

				gerenciadorMREKB.run();
				
				ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");

			}
			else if (action.getRemediation().getCriterion().getId().equals(Constants.CRITERIO_NAO_USAR_MRE_ESPECIFICA)) {
				MERManagerNotSpecificMERKB gerenciadorMREKB = new MERManagerNotSpecificMERKB(new OneShotConflictSet());
				gerenciadorMREKB.tell(action);
				gerenciadorMREKB.tell(dbCon);
				gerenciadorMREKB.tell(ruleToHuman);
						

				gerenciadorMREKB.run();
				
				ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");				
			}
			else if (action.getRemediation().getCriterion().getId().equals(Constants.CRITERIO_PERSISTENCIA_ERRO)) {
				MERManagerErrorPersistKB gerenciadorMREKB = new MERManagerErrorPersistKB(new OneShotConflictSet());
				gerenciadorMREKB.tell(action);
				gerenciadorMREKB.tell(dbCon);
				gerenciadorMREKB.tell(ruleToHuman);
						

				gerenciadorMREKB.run();
				
				ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");				
			}
			else if (action.getRemediation().getCriterion().getId().equals(Constants.CRITERIO_ALTERNAR_ENTRE_MRE_TIPO_ESPECIFICADO)) {
				MERManagerSwypeMERFunctionKB gerenciadorMREKB = new MERManagerSwypeMERFunctionKB(new OneShotConflictSet());
				gerenciadorMREKB.tell(action);
				gerenciadorMREKB.tell(historic.get(historic.size() - 1));
				gerenciadorMREKB.tell(dbCon);
				gerenciadorMREKB.tell(ruleToHuman);
						

				gerenciadorMREKB.run();
				
				ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");				
			}		
			else if (action.getRemediation().getCriterion().getId().equals(Constants.CRITERIO_COMPLEXIDADE)) {
				
			}
			else if (action.getRemediation().getCriterion().getId().equals(Constants.CRITERIO_SUCESSOS_ANTERIORES_MRE)) {
				dbCon.getMersBySuccess(action.getMerFunction().getId());
			}

			/*
		MERManagerKB gerenciadorMREKB = new MERManagerKB();
		gerenciadorMREKB.tell(action);
		gerenciadorMREKB.tell(dbCon);
		gerenciadorMREKB.tell(mre);
		gerenciadorMREKB.tell(ruleToHuman);
				

		gerenciadorMREKB.run();
		
		ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");
*/
		}
	}
	
}
