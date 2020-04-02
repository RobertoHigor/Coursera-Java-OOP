import static org.junit.Assert.*;

import org.junit.Test;

public class TesteAutenticador {

	@Test
	public void loginComSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("sora", "sou");
		assertEquals("sora", u.getLogin());
	}
	
	//Testando exceção esperada.
	@Test(expected = LoginException.class)
	public void loginFalho() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("sora", "errada");		
	}

	@Test
	public void infrmacaoDoErro() {
		Autenticador a = new Autenticador();
		try {
			//Se não der a exceção, é pro teste falhar.
			Usuario u = a.logar("sora", "soau");
			fail();
		} catch (LoginException e) {	
			assertEquals("sora", e.getLogin());
		}
		
	}
	
}
