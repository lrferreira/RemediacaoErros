package module.mer.manager;

import util.Constants;
import module.entity.Action;
import module.entity.DBConnect;
import module.entity.MultipleExternalRepresentation;
import module.entity.RuleToHuman;

public class MERManagerController {

	public static void aciona(Action action, DBConnect dbCon, RuleToHuman ruleToHuman, MultipleExternalRepresentation mre) {

		if (action.getRemediation() != null && action.getRemediation().getId() != null){
			
			if (action.getRemediation().getCriterion().getId().equals(Constants.CRITERIO_MRE_ESPECIFICA_ERRO)) {
				MERManagerSpecificMERKB gerenciadorMREKB = new MERManagerSpecificMERKB();
				gerenciadorMREKB.tell(action);
				gerenciadorMREKB.tell(dbCon);
				gerenciadorMREKB.tell(mre);
				gerenciadorMREKB.tell(ruleToHuman);
						

				gerenciadorMREKB.run();
				
				ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");

			}
			else if (action.getRemediation().getCriterion().getId().equals(Constants.CRITERIO_NAO_USAR_MRE_ESPECIFICA)) {
				MERManagerNotSpecificMERKB gerenciadorMREKB = new MERManagerNotSpecificMERKB();
				gerenciadorMREKB.tell(action);
				gerenciadorMREKB.tell(dbCon);
				gerenciadorMREKB.tell(mre);
				gerenciadorMREKB.tell(ruleToHuman);
						

				gerenciadorMREKB.run();
				
				ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");				
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
