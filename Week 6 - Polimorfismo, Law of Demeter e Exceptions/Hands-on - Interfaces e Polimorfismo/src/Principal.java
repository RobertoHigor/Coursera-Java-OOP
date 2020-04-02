
public class Principal {

	public static void main(String[] args) {
		Barulhento[] barulhento = new Barulhento[10];
		
		barulhento[0] = new Cachorro();
		barulhento[1] = new Carro();
		barulhento[2] = new Cachorro();
		barulhento[3] = new Cachorro();
		barulhento[4] = new Bateria();
		barulhento[5] = new Vuvuzela();
		barulhento[6] = new Vuvuzela();
		barulhento[7] = new Carro();
		barulhento[8] = new Bateria();
		barulhento[9] = new Cachorro();
		
		sons(barulhento);
		
	}

	public static void sons(Barulhento[] barulhento){
		for(Barulhento b: barulhento){
			System.out.println(b.fazerBarulho());
		}
	}
}
