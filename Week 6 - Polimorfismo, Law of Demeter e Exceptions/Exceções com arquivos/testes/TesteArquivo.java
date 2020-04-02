import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class TesteArquivo {

	// Testa chave e valor.  Ele compara a chava "idade" e vê se é realmente 35 (igual no arquivo)
	@Test
	public void testeValorChave() throws LeituraArquivoException {
		Map<String, String> mapa = ProcessadorArquivo.processar("src\\arquivo.txt");
		Map.Entry<String, String> resultado;	
		assertEquals("35", mapa.get("idade"));
		assertEquals("Eduardo", mapa.get("nome"));
		assertEquals("Guerra", mapa.get("sobrenome"));		
	}

	// Testando se vai encontrar o arquivo e não dar erro
	@Test
	public void arquivoEncontrado() throws LeituraArquivoException {
		ProcessadorArquivo.processar("src\\arquivo.txt");
	}

	// Testar se vai dar o exception se não tiver arquivo
	@Test(expected = LeituraArquivoException.class)
	public void testeSemArquivo() throws LeituraArquivoException {
		ProcessadorArquivo.processar("arquivofalso.txt");
	}

	// Testar se o arquivo está vazio
	@Test
	public void testeArquivoVazio() {
		try {
			ProcessadorArquivo.processar("src\\arquivoVazio.txt");
			fail();
		} catch (LeituraArquivoException e) {
			assertEquals(e.getMensagem(), "Arquivo Vazio");
		}
	}

	// Testando se aceita arquivo com a formatação errada
	@Test
	public void testeArquivoPadraoErrado() {
		try {
			ProcessadorArquivo.processar("src\\arquivoErrado.txt");
			fail();
		} catch (LeituraArquivoException e) {
			assertEquals("Formatação dos dados inválidas", e.getMensagem());
		}
	}

}
