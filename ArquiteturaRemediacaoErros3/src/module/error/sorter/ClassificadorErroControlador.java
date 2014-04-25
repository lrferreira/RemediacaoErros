package module.error.sorter;

import entity.WrongAnswer;

public class ClassificadorErroControlador {


	public static void classificarErro(WrongAnswer erro) {
		ErrorSorterKB classificadorErroKB = new ErrorSorterKB();
		classificadorErroKB.tell(erro);
		classificadorErroKB.run();
		
	}
	
}
