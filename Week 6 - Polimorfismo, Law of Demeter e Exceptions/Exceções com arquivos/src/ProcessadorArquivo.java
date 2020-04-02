import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessadorArquivo {

	public static Map<String, String> processar(String arquivo) throws LeituraArquivoException {

		Scanner sc = null;
		File file = new File(arquivo);
		Map<String, String> mapa = new HashMap<String, String>();
		try {
			sc = new Scanner(file);
			//Dá arquivo não encontrado caso for utilizada a FileNotFoundException
		} catch (IOException e) {
			throw new LeituraArquivoException("Arquivo não encontrado", arquivo);
		}

		//Se o arquivo não tiver linhas, ele dá como vazio
		if (sc.hasNextLine() == false) {
			throw new LeituraArquivoException("Arquivo Vazio", arquivo);
		}
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			//Parte a string a cada "->"
			String[] dados = s.split("->");
			//Se o indice de dados for diferente de 2, ele irá dar erro.
			if (s.indexOf("->") == -1 || dados.length != 2) {
				throw new LeituraArquivoException("Formatação dos dados inválidas", arquivo);
			} else {
				//Se não tiver erro, ele coloca a key e value com as 2 partes divididas. Ex: o nome "idade" e o valor dela
				//Como foi dividido, ele está no próximo índice.
				mapa.put(dados[0], dados[1]);
			}
		}
		return mapa;

	}
}
