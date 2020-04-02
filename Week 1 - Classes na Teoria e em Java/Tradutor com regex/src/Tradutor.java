import java.util.regex.*;

public class Tradutor {
	String traducao;

	public String traduzir(String texto){

		Pattern p = new Pattern();
		//Vogais
		traducao = texto.replace("a", "4");	
		traducao = texto.replace("A", "4");	
			
		traducao = texto.replace("e", "3");
		traducao = texto.replace("E", "3");
		
	
		/*
		traducao += texto.replace("i", "1");		
		traducao += texto.replace("I", "1");	
		
		traducao = texto.replace("o", "0");	
		traducao = texto.replace("O", "0");
		
		//Consoantes				
		traducao += texto.replace("s", "5");	
		traducao += texto.replace("S", "5");	
		*/
		return traducao;
	}
}
