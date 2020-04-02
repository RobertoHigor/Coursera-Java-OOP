package embaralhador;

public class EmbaralhaInverso implements Embaralhador {

	//Inverte a palavra
	@Override
	public String embaralhar(String palavra) {
		String inverso = "";
		char arrayChar[] = palavra.toCharArray();
		for (int i = arrayChar.length - 1; i >= 0; i--) {
			inverso += String.valueOf(arrayChar[i]);			
		}
		return inverso;
	}
}
