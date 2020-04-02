import static org.junit.Assert.*;

import org.junit.Test;

import embaralhador.EmbaralhaInverso;
import embaralhador.Embaralhador;
import embaralhador.FabricaEmbaralhadora;

public class TesteEmbaralhar {

	// Testando Palavra Inversa
	@Test
	public void embaralharInverso() {
		Embaralhador env = new EmbaralhaInverso();
		String resultado = env.embaralhar("inverso");
		assertEquals("osrevni", resultado);
	}

	// Testando FabricaEmbaralhadora se est� embaralhando  e embaralhador aleat�rio. obs: Como � aleat�rio, a palavra por vir normal (raro)
	@Test
	public void fabricaInversi() {
		FabricaEmbaralhadora fab = new FabricaEmbaralhadora();
		String resultado = fab.embaralhadorAleatorio("teste");
		assertNotEquals("teste", resultado);
	}
}
