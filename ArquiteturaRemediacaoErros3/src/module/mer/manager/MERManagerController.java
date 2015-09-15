package module.mer.manager;

import java.util.ArrayList;

import jeops.conflict.DefaultConflictSet;
import module.entity.Action;
import module.entity.DBConnect;
import module.entity.MultipleExternalRepresentation;
import module.entity.RuleToHuman;
import util.Constants;
import util.RandomConflictSet;

public class MERManagerController {
	
	private static Integer complexity = 1;
	private static MERManagerNotSpecificMERKB merManagerNotSpecificMERKB = new MERManagerNotSpecificMERKB(new RandomConflictSet());
	private static MERManagerSpecificMERKB merManagerSpecificMERKB = new MERManagerSpecificMERKB(new RandomConflictSet());
	private static MERManagerSwypeMERFunctionKB merManagerSwypeMERFunctionKB = new MERManagerSwypeMERFunctionKB(new RandomConflictSet());
	
	public static void aciona(Action action, ArrayList<Action> historic, DBConnect dbCon, RuleToHuman ruleToHuman) {

		if (action.getRemediation() != null && action.getRemediation().getId() != null){
			
			if (action.getRemediation().getCriterion().getId().equals(Constants.CRITERIO_MRE_ESPECIFICA_ERRO)) {
				//MERManagerSpecificMERKB gerenciadorMREKB = new MERManagerSpecificMERKB();
				merManagerSpecificMERKB.tell(action);
				merManagerSpecificMERKB.tell(dbCon);
				merManagerSpecificMERKB.tell(ruleToHuman);
						

				merManagerSpecificMERKB.run();
				
				ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");

			}
			else if (action.getRemediation().getCriterion().getId().equals(Constants.CRITERIO_NAO_USAR_MRE_ESPECIFICA)) {
				//gerenciadorMREKB = new MERManagerNotSpecificMERKB(new DefaultConflictSet());
				//MERManagerNotSpecificMERKB merManagerNotSpecificMERKB = new MERManagerNotSpecificMERKB();
				merManagerNotSpecificMERKB.tell(action);
				merManagerNotSpecificMERKB.tell(dbCon);
				merManagerNotSpecificMERKB.tell(ruleToHuman);
						

				merManagerNotSpecificMERKB.run();
				
				ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");				
			}
			else if (action.getRemediation().getCriterion().getId().equals(Constants.CRITERIO_PERSISTENCIA_ERRO)) {
				MERManagerErrorPersistKB gerenciadorMREKB = new MERManagerErrorPersistKB(new RandomConflictSet());
				gerenciadorMREKB.tell(action);
				gerenciadorMREKB.tell(dbCon);
				gerenciadorMREKB.tell(ruleToHuman);
						

				gerenciadorMREKB.run();
				
				ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");				
			}
			else if (action.getRemediation().getCriterion().getId().equals(Constants.CRITERIO_ALTERNAR_ENTRE_MRE_TIPO_ESPECIFICADO)) {
				//MERManagerSwypeMERFunctionKB gerenciadorMREKB = new MERManagerSwypeMERFunctionKB(new RandomConflictSet());
				//merManagerSwypeMERFunctionKB = new MERManagerSwypeMERFunctionKB(new RandomTestConflictSet());
				merManagerSwypeMERFunctionKB.tell(action);
				merManagerSwypeMERFunctionKB.tell(dbCon.getLastAction(action.getRemediation().getItemSorter().getMerFunction().getId()));
				merManagerSwypeMERFunctionKB.tell(dbCon);
				merManagerSwypeMERFunctionKB.tell(ruleToHuman);
						

				merManagerSwypeMERFunctionKB.run();
				
				ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");
				merManagerSwypeMERFunctionKB.flush();
			}		
			else if (action.getRemediation().getCriterion().getId().equals(Constants.CRITERIO_COMPLEXIDADE)) {
				if (action.getAttempt() == 1)
					complexity = 1;
				else
					complexity = complexity % Constants.QUANT_COMPLEXIDADE + 1;
				MERManagerComplexityKB gerenciadorMREKB = new MERManagerComplexityKB(new RandomConflictSet());
				gerenciadorMREKB.tell(action);
				gerenciadorMREKB.tell(complexity);
				gerenciadorMREKB.tell(dbCon);
				gerenciadorMREKB.tell(ruleToHuman);
						

				gerenciadorMREKB.run();
				
				ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");				
				
			}
			else if (action.getRemediation().getCriterion().getId().equals(Constants.CRITERIO_SUCESSOS_ANTERIORES_MRE)) {
				ArrayList<MultipleExternalRepresentation> mers = dbCon.getMersBySuccess(action.getMerFunction().getId());
				if(mers != null) 
					action.setMer(mers.get(0));
				MERManagerKB gerenciadorMREKB = new MERManagerKB(new RandomConflictSet());
				gerenciadorMREKB.tell(action);
				gerenciadorMREKB.tell(dbCon);
				gerenciadorMREKB.tell(ruleToHuman);
						

				gerenciadorMREKB.run();
				
				ruleToHuman.setDescription(ruleToHuman.getDescription() + "\n\n");				

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
