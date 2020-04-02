package mecanica;

public class FabricaMecanicaDoJogo {

	//Valor do modo de jogo
	private int mecanicaJogo;
	
	//Se o atributo for 1, ele irá iniciar o modo "Challenge" e se for 2, irá iniciar o modo "Pontos"
	public MecanicaDoJogo mecanicaUtilizada() {
		if (this.mecanicaJogo == 1) {
			return new MecanicaMorte();
		} else {
			return new MecanicaPontos();
		}		
	}

	//Seta o valor do modo de jogo. Se não for nem 1 e nem 2, dá mensagem de erro.
	public void setMecanicaJogo(int mecanicaJogo) {
		if (mecanicaJogo >= 1 && mecanicaJogo <= 2){
		this.mecanicaJogo = mecanicaJogo;
		} else{
			System.out.println("Modo de jogo inválido");
		}
	}

}
