package cursojava.classesauxiliares;

import cursojava.classes.Diretor;
import cursojava.interfaces.PermitirAcesso;

public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar () {
		return permitirAcesso.autenticar();
		
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

	public FuncaoAutenticacao(Diretor diretor) {
		
	}

}
