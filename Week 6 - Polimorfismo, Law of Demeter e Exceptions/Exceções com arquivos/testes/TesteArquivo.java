import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class TesteArquivo {

	// Testa chave e valor.  Ele compara a chava "idade" e v� se � realmente 35 (igual no arquivo)
	@Test
	public void testeValorChave() throws LeituraArquivoException {
		Map<String, String> mapa = ProcessadorArquivo.processar("src\\arquivo.txt");
		Map.Entry<String, String> resultado;	
		assertEquals("35", mapa.get("idade"));
		assertEquals("Eduardo", mapa.get("nome"));
		assertEquals("Guerra", mapa.get("sobrenome"));		
	}

	// Testando se vai encontrar o arquivo e n�o dar erro
	@Test
	public void arquivoEncontrado() throws LeituraArquivoException {
		ProcessadorArquivo.processar("src\\arquivo.txt");
	}

	// Testar se vai dar o exception se n�o tiver arquivo
	@Test(expected = LeituraArquivoException.class)
	public void testeSemArquivo() throws LeituraArquivoException {
		ProcessadorArquivo.processar("arquivofalso.txt");
	}

	// Testar se o arquivo est� vazio
	@Test
	public void testeArquivoVazio() {
		try {
			ProcessadorArquivo.processar("src\\arquivoVazio.txt");
			fail();
		} catch (LeituraArquivoException e) {
			assertEquals(e.getMensagem(), "Arquivo Vazio");
		}
	}

	// Testando se aceita arquivo com a formata��o errada
	@Test
	public void testeArquivoPadraoErrado() {
		try {
			ProcessadorArquivo.processar("src\\arquivoErrado.txt");
			fail();
		} catch (LeituraArquivoException e) {
			assertEquals("Formata��o dos dados inv�lidas", e.getMensagem());
		}
	}

}
