package util;

public class StringConstants {

	public static final String IMPORT_HISTORICO = "import module.entity.Historic";
	public static final String IMPORT_ACTION = "import module.entity.Action";
	public static final String IMPORT_STUDENT = "import module.entity.Student";
	public static final String IMPORT_MER = "import module.entity.MultipleExternalRepresentation";
	public static final String IMPORT_ANSWER = "import module.entity.Answer";
	public static final String IMPORT_CORECTANSWER = "import module.entity.CorrectAnswer";
	public static final String IMPORT_WRONGANSWER = "import module.entity.WrongAnswer";
	public static final String IMPORT_ARRAYLIST = "import java.util.ArrayList";
	public static final String IMPORT_CLASSIFICADORERROCONTROLADOR =" import module.error.sorter.ErrorSorterController";
	public static final String IMPORT_IDENTIFICADOREXPRESSAOCONTROLADOR = "import module.expression.identifier.ExpressionIdentifierController";

	public static final String END_RULES = "// end_rules"; 
	//public static final String RULE_INIT = "// -rule-init-";
	public static final String RULE_END = "// -rule-end-"; 
	
	public static final String FILE_GOALS_KB = "\\module\\author\\GoalsKB.rules";
	public static final String FILE_EXPRESSION_IDENTIFIER_CORRECT_ANSWER_KB = "\\module\\expression\\identifier\\ExpressionIdentifierCorrectAnswerKB.rules";
	public static final String FILE_EXPRESSION_IDENTIFIER_WRONG_ANSWER_KB = "\\module\\expression\\identifier\\ExpressionIdentifierWrongAnswerKB.rules";
	public static final String FILE_ERROR_SORTER_KB = "\\module\\error\\sorter\\ErrorSorterKB.rules";
	public static final String FILE_MERFUNCTION_SORTER_KB = "\\module\\merfunction\\sorter\\MERFunctionSorterKB.rules";
	public static final String FILE_MER_MANAGER_KB = "\\module\\mer\\manager\\MERManagerKB.rules";
	public static final String FILE_MER_MANAGER_SPECIFIC_MER_KB = "\\module\\mer\\manager\\MERManagerSpecificMERKB.rules";
	public static final String FILE_MER_MANAGER_NOT_SPECIFIC_MER_KB = "\\module\\mer\\manager\\MERManagerNotSpecificMERKB.rules";
	public static final String FILE_MER_MANAGER_SWYPE_MERFUNCTION_KB = "\\module\\mer\\manager\\MERManagerSwypeMERFunctionKB.rules";
	public static final String FILE_MER_MANAGER_COMPLEXITY_KB = "\\module\\mer\\manager\\MERManagerComplexityKB.rules";
	public static final String FILE_MER_MANAGER_ERROR_PERSIST_KB = "\\module\\mer\\manager\\MERManagerErrorPersistKB.rules";
	
	
	public static final String CRITERION_MER_SPECIFIC_FOR_ERROR = "MRE específica para o erro";
	public static final String CRITERION_SUCCESS_MER_FUNCTION_PRIOR = "Sucesso na Função da MRE anterior";
	public static final String CRITERION_ALTERNATE_AMONG_MER_FUNCTIONS = "Alternar entre funções das MREs";
	public static final String CRITERION_ALTERNATE_AMONG_MERS = "Alternar entre as MREs da mesma função";
	public static final String CRITERION_SUCCESS_MER_PRIOR = "Sucesso da MRE anterior";
	public static final String CRITERION_ALTERNATE_TYPE_MER = "Alternar entre os tipos das MREs";
	public static final String CRITERION_COMPLEXITY = "Alternar entre complexidades das MREs";
	
	public static final String FILE_DB = "C:\\users\\leandro2\\git\\RemediacaoErros\\ArquiteturaRemediacaoErros3\\db\\remediacao.sqlite";
	public static final String DIR_LOG_RULES = "C:\\users\\leandro2\\git\\RemediacaoErros\\ArquiteturaRemediacaoErros3\\db\\log\\";
	//public static final String FILE_DB = "C:\\users\\UFPR\\git\\RemediacaoErros\\ArquiteturaRemediacaoErros3\\db\\remediacao.sqlite";
	
}
