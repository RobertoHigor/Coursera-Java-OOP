package principal;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TesteCarrinhoDeCompras {

	static Produto p;
	static Produto p2;
	static Produto p3;
	static CarrinhoDeCompras c;

	@BeforeClass
	public static void before() {
		// O programa assimila o código ao preço, não é possivel colocar um
		// produto do mesmo código com preços diferentes.
		p = new Produto();
		p.nome = "CAMISA";
		p.codigo = 1;
		p.preco = 15;

		p2 = new Produto();
		p2.nome = "CAMISA";
		p2.codigo = 1;
		p.preco = 15;

		p3 = new Produto();
		p3.nome = "CASACO";
		p3.codigo = 3;
		p3.preco = 30;

		c = new CarrinhoDeCompras();
		c.adicionaProduto(p, 1);
		c.adicionaProduto(p2, 2);
		c.adicionaProduto(p3, 5);
	}

	// Adicionar um produto no carrinho
	@Test
	public void adicionarCarrinho() {
		assertEquals(8, c.totalCarrinho());
	}

	// Remover um produto do carrinho
	@Test
	public void removerCarrinho() {
		c.removeProduto(p2, 2);
		assertEquals(6, c.totalCarrinho());
	}

	// Quantos produtos do p3 foram gastos
	@Test
	public void produtoGasto() {
		int totalp3 = c.carrinho.get(p3);
		assertEquals(5, totalp3);
	}

	// Conferir o preço do carrinho
	@Test
	public void precoProduto() {
		assertEquals(195, c.getValor());
	}

}
