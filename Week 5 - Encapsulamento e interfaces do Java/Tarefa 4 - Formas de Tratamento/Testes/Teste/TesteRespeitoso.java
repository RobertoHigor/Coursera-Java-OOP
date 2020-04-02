package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import Classes.Autoridade;

public class TesteRespeitoso {

	@Test
	public void respeitoso() {
		Autoridade at = new Autoridade();
		
		at.setNome("Joseph");
		at.setSobrenome("Joestar");
		at.setGenero('m');
		at.setTitulo("Velhote");
		at.setTratamento("Respeitoso");	
		
		assertEquals(null, "Sr. Joestar", at.getTratamento());
	}
	
	//Confere se o tratamento for diferente, se ele imprime somente o nome
	@Test
	public void naoRespeitoso() {
		Autoridade at = new Autoridade();
		
		at.setNome("Joseph");
		at.setSobrenome("Joestar");
		at.setGenero('m');
		at.setTitulo("Velhote");
		at.setTratamento("ComTitulo");		
		
		assertNotEquals(null, "Sr. Joestar", at.getTratamento());
	}

}
