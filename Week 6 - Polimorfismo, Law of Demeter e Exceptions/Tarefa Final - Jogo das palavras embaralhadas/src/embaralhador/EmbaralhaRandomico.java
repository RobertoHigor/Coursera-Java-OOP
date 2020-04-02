package embaralhador;
import java.util.Random;

public class EmbaralhaRandomico implements Embaralhador {

	//Embaralha as letras de forma aleatória, portanto não é possível prever or esultado
	@Override
	public String embaralhar(String palavra) {
		Random random = new Random();
		// Converter a string para char
		char arrayChar[] = palavra.toCharArray();
		// Embaralhar as letras
		for (int i = 0; i < arrayChar.length - 1; i++) {
			int j = random.nextInt(arrayChar.length - 1);
			// Trocar letras
			char temporario = arrayChar[i];
			arrayChar[i] = arrayChar[j];
			arrayChar[j] = temporario;
		}
		return new String(arrayChar);
	}

}
