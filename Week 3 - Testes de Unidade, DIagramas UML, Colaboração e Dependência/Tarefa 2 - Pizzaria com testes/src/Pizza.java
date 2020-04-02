import java.util.ArrayList;
import java.util.HashMap;

public class Pizza {
	public  int totalIngrediente = 0;	
	public static HashMap<String, Integer> ingredienteGasto = new HashMap <String, Integer>();
	public ArrayList<String> ingrediente = new ArrayList<String>();
	public static int estaticoIngrediente;
	
	
	//Adicionar ingrediente na pizza
	public void adicionaIngrediente(String ig){
		ingrediente.add(ig);	 	 
		contabilizaIngrediente(ig);	
		totalIngrediente++;	
		estaticoIngrediente++;
	}
	
	//Pegar o preço da pizza
	public int getPreço(){			 
		if (ingrediente.size() <= 2){
			return 15;
		}else if (ingrediente.size() >= 3 && ingrediente.size() <= 5){
			return 20;
		}else{
			return 23;
		}
		
	}
	
	//Nomear e somar o ingrediente a variável estática
	public static void contabilizaIngrediente(String ig){
		ig = ig.toUpperCase();
		Integer id = ingredienteGasto.get(ig);
		
		if(id == null){			
			ingredienteGasto.put(ig, 1);			
			
		}else {
			id++;
			ingredienteGasto.put(ig, id);
		}
	}
	//Zerar a hashmap de ingrediente gasto no total		
	public static void zerar(){
		ingredienteGasto.clear();
		estaticoIngrediente = 0;
	}
			
	
}
