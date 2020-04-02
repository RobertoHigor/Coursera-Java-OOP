import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestePizza {
	
	//M�todo para zerar a vari�vel est�tica e o HashMap
	@Before
	public void before(){
		Pizza.zerar();
	}
	
	//Testar se o pre�o de uma pizza com mais de 2 ingredientes � 20 reais
	@Test
	public void testePre�o() {
		Pizza p1 = new Pizza();
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		p1.adicionaIngrediente("CHEDDAR");
		p1.adicionaIngrediente("TOMATE");
		p1.adicionaIngrediente("CALABRESA");
		c1.adicionaPizza(p1);
		
		assertEquals(20, p1.getPre�o());
	}
	
	//Testar a vari�vel est�tica ap�s resetada
	@Test
	public void testeGasto(){
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("CHEDDAR");
		p1.adicionaIngrediente("TOMATE");
		p1.adicionaIngrediente("CALABRESA");				 		
		
		assertEquals(3, Pizza.estaticoIngrediente);
	}
	
	
}
