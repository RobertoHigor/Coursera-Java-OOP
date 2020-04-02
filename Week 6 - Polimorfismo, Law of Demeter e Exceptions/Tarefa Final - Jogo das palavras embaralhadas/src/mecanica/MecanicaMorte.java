package mecanica;

import embaralhador.FabricaEmbaralhadora;
import principal.BancoDePalavras;

public class MecanicaMorte implements MecanicaDoJogo {

	private boolean continua = true;
	private String palavra;
	private String embaralhada;
	private int pontos;

	//Diz que não pode continuar após perder 1 vez. Soma 10 pontos a cada acerto.
	@Override
	public void mecanicaJogo(String input) {
		if (input.equalsIgnoreCase(this.palavra)) {
			pontos +=10;
			continua = true;
		} else {
			continua = false;
		}
	}

	//Pega uma palavra e retorna embaralhada para o jogador
	@Override
	public String darPalavra() {
		// Pegar Palavra
		BancoDePalavras banco = new BancoDePalavras();
		this.palavra = banco.retornarPalavra();

		// Embaralhar a palavra
		FabricaEmbaralhadora ei = new FabricaEmbaralhadora();
		ei.embaralhadorAleatorio(palavra);
		this.embaralhada = ei.embaralhadorAleatorio(this.palavra);

		return this.embaralhada;
	}

	//Vê se o continua está true para continuar jogando
	@Override
	public boolean isContinua() {
		return continua;
	}

	//Mostra os pontos
	@Override
	public int getPontos() {
		return this.pontos;
	}

}
