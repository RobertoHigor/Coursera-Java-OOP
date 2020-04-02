package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import Classes.Autoridade;

public class TesteComTitulo {

	@Test
	public void comTitulo() {
		Autoridade at = new Autoridade();

		at.setNome("Joseph");
		at.setSobrenome("Joestar");
		at.setGenero('m');
		at.setTitulo("Velhote");
		at.setTratamento("ComTitulo");

		assertEquals(null, "Velhote Joseph Joestar", at.getTratamento());
	}

	@Test
	public void semTitulo() {

		Autoridade at = new Autoridade();

		at.setNome("Joseph");
		at.setSobrenome("Joestar");
		at.setGenero('m');
		at.setTitulo("Velhote");
		at.setTratamento("Informal");

		assertNotEquals(null, "Velhote Joseph Joestar", at.getTratamento());
	}

}
