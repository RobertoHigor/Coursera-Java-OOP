package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import Classes.Autoridade;

public class TesteInformal {

	//Confere se ele está imprimindo apenas o nome
	@Test
	public void informal() {
		Autoridade at = new Autoridade();

		at.setNome("Joseph");
		at.setSobrenome("Joestar");
		at.setGenero('m');
		at.setTitulo("Velhote");
		at.setTratamento("Informal");	
			
		assertEquals(null, "Joseph", at.getTratamento());
	}

	//Confere se o tratamento for diferente, se ele imprime somente o nome
	@Test
	public void naoInformal() {
		Autoridade at = new Autoridade();
		
		at.setNome("Joseph");
		at.setSobrenome("Joestar");
		at.setGenero('m');
		at.setTitulo("Velhote");
		at.setTratamento("Respeitoso");	
		
		assertNotEquals(null, "Joseph", at.getTratamento());
	}
}
