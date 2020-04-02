import static org.junit.Assert.*;

import org.junit.Test;

public class TesteRegistroDePontos {

	@Test
	public void pontosCriarTopico() {
		Usuario u = new Usuario();
		u.nome = "Lixo";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistoPontos rp = new RegistoPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 5);
	}

	@Test
	public void pontosVip(){
		Usuario u = new Usuario();
		u.nome = "Lixo";
		u.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistoPontos rp = new RegistoPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 25);
	}
	
	@Test
	public void bonusDoDia() {
		Usuario u = new Usuario();
		u.nome = "Lixo";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistoPontos rp = new RegistoPontos(cb);
		cb.bonusDoDia = 3;
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 15);
	}
	
	@Test
	public void bonusDoDiaVia() {
		Usuario u = new Usuario();
		u.nome = "Lixo";
		u.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistoPontos rp = new RegistoPontos(cb);
		cb.bonusDoDia = 2;
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 50);
	}
}
