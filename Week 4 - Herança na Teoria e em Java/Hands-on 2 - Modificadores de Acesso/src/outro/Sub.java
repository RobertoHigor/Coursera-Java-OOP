package outro;

import pacote1.Referencia;

public class Sub extends Referencia{

	public void testeAcesso(){
	
		//modificadorDefault = 0;
		modificadorPublic = 0;
		modificadorProtected = 0; // Protected é igual o default mas aceita subclasse
		//modificadorPrivate = 0;
	}
}
