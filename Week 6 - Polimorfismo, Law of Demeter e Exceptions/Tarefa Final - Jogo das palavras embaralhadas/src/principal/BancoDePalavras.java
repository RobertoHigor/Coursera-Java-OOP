package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BancoDePalavras {
	private List<String> palavra = new ArrayList<String>();

	public String retornarPalavra() {
		// Tentar ler o arquivo com as palavras e separar por enter e espaço

		BufferedReader arquivo;
		try {
			arquivo = new BufferedReader(new FileReader(
					"src\\banco.txt"));

			// Adicionar as palavra na lista de Array
			while (true) {
				String linha = arquivo.readLine();
				if (linha.equalsIgnoreCase("*FINAL*")) {
					break;
				}
				palavra.add(linha);
			}
			
			//Embaralha a ordem das palavras
			Collections.shuffle(palavra);
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
			e.printStackTrace();
		} catch (IOException e) {		
			e.printStackTrace();
		}

		//Retorna a palavra do indice 0 (Como o índice está embaralhado, é uma palavra aleatória)
		return palavra.get(0).toUpperCase();
	}
}
