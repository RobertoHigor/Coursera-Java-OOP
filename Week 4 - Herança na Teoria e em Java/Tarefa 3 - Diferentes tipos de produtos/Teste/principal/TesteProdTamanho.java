package principal;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TesteProdTamanho {

	static ProdutoComTamanho p;
	static ProdutoComTamanho p2;
	static ProdutoComTamanho p3;
	static ProdutoComTamanho p4;
	static CarrinhoDeCompras c;

	@BeforeClass
	public static void before() {
		// instanciando produtos com tamanho diferente
		p = new ProdutoComTamanho();
		p.nome = "CAMISA";
		p.codigo = 1;
		p.tamanho = "G";

		p2 = new ProdutoComTamanho();
		p2.nome = "CAMISA";
		p2.codigo = 1;
		p2.tamanho = "M";

		p3 = new ProdutoComTamanho();
		p3.nome = "CASACO";
		p3.codigo = 3;
		p3.tamanho = "P";
		// Repetindo tamanho e código para verificar se computou como diferente
		p4 = new ProdutoComTamanho();
		p4.nome = "CASACO";
		p4.codigo = 3;
		p4.tamanho = "P";

		// Instanciando carrinho e adicionando produtos
		c = new CarrinhoDeCompras();
		c.adicionaProduto(p, 1);
		c.adicionaProduto(p2, 2);
		c.adicionaProduto(p3, 5);
		c.adicionaProduto(p4, 1);
	}

	@Test
	public void produtoDiferente() {
		// Conferindo se a quantidade de produtos diferentes deu 3
		assertEquals(3, c.produtosDiferentes());
	}
	
	//Testando se o p3 é igual ao p4
	@Test
	public void produtoIgual(){
		assertEquals(p3, p4);
	}
	
	@Test
	public void produtosDiferentes(){
		assertNotEquals(p, p3);
	}

}
