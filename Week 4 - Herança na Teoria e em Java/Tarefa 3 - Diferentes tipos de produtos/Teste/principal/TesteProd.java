package principal;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TesteProd {
	static Produto p;
	static Produto p2;
	static Produto p3;
	static CarrinhoDeCompras c;

	@BeforeClass
	public static void before() {
		// Instanciando produtos e dando código igual para 2
		p = new Produto();
		p.nome = "CAMISA";
		p.codigo = 1;
		p2 = new Produto();
		p2.nome = "CAMISA";
		p2.codigo = 1;
		p3 = new Produto();
		p3.nome = "CASACO";
		p3.codigo = 3;

		// Instanciando carrinho e adicionando os produtos
		c = new CarrinhoDeCompras();
		c.adicionaProduto(p, 1);
		c.adicionaProduto(p2, 2);
		c.adicionaProduto(p3, 5);
	}

	// Vendo quantos produtos diferentes foram adicionados (CODIGO 1 E 2 = 2
	// PRODUTOS DIFERENTES)
	@Test
	public void produtoDiferente() {
		assertEquals(2, c.produtosDiferentes());
	}

	// Testando se o p é igual ao p2
	@Test
	public void produtoIgual() {
		assertEquals(p, p2);
	}

}
