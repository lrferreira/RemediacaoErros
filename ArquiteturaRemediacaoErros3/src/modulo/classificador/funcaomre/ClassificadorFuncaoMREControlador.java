package modulo.classificador.funcaomre;

import entidades.FuncaoMRE;
import entidades.Historico;
import entidades.RespostaErrada;

public class ClassificadorFuncaoMREControlador {

	public static void classificarFuncaoMRE(Historico historico, RespostaErrada erro, FuncaoMRE funcaoMRE) {
		ClassificadorFuncaoMREBaseRegras classificadorFuncaoMREKB = new ClassificadorFuncaoMREBaseRegras();
		classificadorFuncaoMREKB.tell(historico);
		classificadorFuncaoMREKB.tell(erro);
		classificadorFuncaoMREKB.tell(funcaoMRE);
		classificadorFuncaoMREKB.run();
	}
}
