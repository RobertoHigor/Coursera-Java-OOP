package mecanica;

public class FabricaMecanicaDoJogo {

	//Valor do modo de jogo
	private int mecanicaJogo;
	
	//Se o atributo for 1, ele ir� iniciar o modo "Challenge" e se for 2, ir� iniciar o modo "Pontos"
	public MecanicaDoJogo mecanicaUtilizada() {
		if (this.mecanicaJogo == 1) {
			return new MecanicaMorte();
		} else {
			return new MecanicaPontos();
		}		
	}

	//Seta o valor do modo de jogo. Se n�o for nem 1 e nem 2, d� mensagem de erro.
	public void setMecanicaJogo(int mecanicaJogo) {
		if (mecanicaJogo >= 1 && mecanicaJogo <= 2){
		this.mecanicaJogo = mecanicaJogo;
		} else{
			System.out.println("Modo de jogo inv�lido");
		}
	}

}
