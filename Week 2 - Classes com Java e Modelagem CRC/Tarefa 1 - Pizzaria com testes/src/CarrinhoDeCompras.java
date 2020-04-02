import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	List<Pizza> totalPizza = new ArrayList<Pizza>();	
	Pizza piz = new Pizza();
	
	//Adicionar pizza no carrinho
	public  void adicionaPizza(Pizza pz){	
		if (pz.totalIngrediente == 0){
			System.out.println("Pizza sem ingrediente");
		} else {
			 totalPizza.add(pz);	
		}		
	}
	
	//Preço total do carrinho
	public int pagar(){		
		int total = 0;
		for(Pizza piz:totalPizza ){
			total += piz.getPreço();
		}
		return total;
	}
	
	//Total de pizza no carrinho
	public int totalCarrinho(){
		return totalPizza.size();
	}
}
