import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.Test;

import principal.BancoDePalavras;

public class TesteArquivo {

	// Testar se o banco existe
	@Test
	public void temArquivo() {
		try {
			BufferedReader arquivo = new BufferedReader(new FileReader("src\\banco.txt"));
		} catch (FileNotFoundException e) {
			fail();
			System.out.println("Arquivo não eoncontrado");
			e.printStackTrace();
		}
	}

	// Testar se vai dar erro se não tiver arquivo
	@Test(expected = FileNotFoundException.class)
	public void naoTemArquivo() throws FileNotFoundException {
		BufferedReader arquivo = new BufferedReader(new FileReader("arquivoFalso.txt"));
	}

	// Testar se tem palavras no banco
	@Test
	public void temPalavra() {
		BancoDePalavras banco = new BancoDePalavras();
		assertNotEquals(null, banco.retornarPalavra());
	}
}
