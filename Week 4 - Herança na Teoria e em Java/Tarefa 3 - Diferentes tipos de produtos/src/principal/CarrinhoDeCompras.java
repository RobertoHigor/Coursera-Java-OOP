package principal;

import java.util.HashMap;

public class CarrinhoDeCompras {

	public  HashMap<Produto, Integer> carrinho = new HashMap<>();
	static int total;

	// Método para adicionar produto no carrinho e conferir se é igual
	public void adicionaProduto(Produto p, int quantidade) {
		if (carrinho.containsKey(p)) {
			carrinho.put(p, carrinho.get(p) + quantidade);
		} else {
			carrinho.put(p, quantidade);
		}
		total += quantidade;
	}

	// Método para remover produto do carrinho
	public void removeProduto(Produto p, int quantidade) {
		if (carrinho.containsKey(p)) {

			carrinho.put(p, carrinho.get(p) - quantidade);

			if (carrinho.get(p) <= 0) {
				carrinho.remove(p);
			}
		}
		total -= quantidade;
	}

	// Receber o valor do carrinho
	public int getValor() {
		int valor = 0;
		for (Produto p : carrinho.keySet()) {
			int quantidade = carrinho.get(p);
			valor += p.getPreco() * quantidade;
		}
		return valor;
	}

	// Total de produtos no carrinho
	public int totalCarrinho() {
		return total;
	}

	// Quantos produtos diferentes foram colocados
	public int produtosDiferentes() {
		return carrinho.size();
	}

	// Quanto foi gasto de um produto
	public void produtoGasto() {
		for (Produto p : carrinho.keySet()) {
			System.out.println("Produto: " + p + " - " + "Quantidade gasta: " + carrinho.get(p));
		}

	}
}
