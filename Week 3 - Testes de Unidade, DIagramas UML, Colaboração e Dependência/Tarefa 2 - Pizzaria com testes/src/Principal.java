public class Principal {

	public static void main(String[] args) {
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		//Criando o objeto Pizza 1, adicionando 3 ingredientes e colocando no carrinho.
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("CHEDDAR");
		p1.adicionaIngrediente("BACON");
		p1.adicionaIngrediente("FRANGO");		
		
		c1.adicionaPizza(p1);
		
		
		
		//Criando o objeto pizza 2, adicionando 1 ingrediente e colocando no carrinho.
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("BACON");
		c1.adicionaPizza(p2);
	
		
		//Criando o objeto pizza 3, adicinhando 2 ingredientes e colocando no carrinho.
		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("CHEDDAR");
		p3.adicionaIngrediente("BACON");
		c1.adicionaPizza(p3);		
							
		
		//Imprimir pizzas no carrinho
		System.out.println("Total de Pizzas no carrinho: " +c1.totalPizza.size());	
		
		//Imprimir preço do carrinho
		System.out.println("Preço total: " +c1.pagar());
		
		//Imprimir variável estática de ingredientes
		System.out.println("Total de ingrediente gasto: " +Pizza.estaticoIngrediente);
			
	
		//Imprimir quantidade de cada ingrediente gasta			
		
		for(String key : Pizza.ingredienteGasto.keySet())
		{
		     System.out.println("Ingrediente: "+ key + " - " + "Quantidade gasta: " +Pizza.ingredienteGasto.get(key));
		}
		
		/*
		for (HashMap.Entry<String,Integer> ing :Pizza.ingredienteGasto.entrySet()) {
		    System.out.print("Ingrediente:"+ing.getKey());
		    System.out.println(" - Quantidade:"+ing.getValue());
		}*/
	}
}

