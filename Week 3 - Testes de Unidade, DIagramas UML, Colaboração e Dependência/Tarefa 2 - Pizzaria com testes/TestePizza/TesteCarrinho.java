import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarrinho {

	//Testar se aceita pizza sem ingrediente
		@Test
		public void semIngrediente(){
			CarrinhoDeCompras c1 = new CarrinhoDeCompras();
			
			Pizza p1 = new Pizza();
			p1.adicionaIngrediente("BACON");
			
			Pizza p2 = new Pizza();
			
			c1.adicionaPizza(p1);
			c1.adicionaPizza(p2);
			
			assertEquals(1, c1.totalPizza.size());
		}
		
		//Testar se o preço da pizza é somado corretamente
		@Test
		public void preçoPizza(){
			CarrinhoDeCompras c1 = new CarrinhoDeCompras();
			//3 ingredientes = 20 reais.
			Pizza p1 = new Pizza();
			p1.adicionaIngrediente("CHOCOLATE");
			p1.adicionaIngrediente("BANANA");
			p1.adicionaIngrediente("CANELA");
			
			//2 ingredientes = 15 reais
			Pizza p2 = new Pizza();
			p2.adicionaIngrediente("MUSSARELA");
			p2.adicionaIngrediente("CALABRESA");
			
			c1.adicionaPizza(p1);
			c1.adicionaPizza(p2);
			
			// 20 + 15 = 35
			assertEquals(35, c1.pagar());
		}
}
