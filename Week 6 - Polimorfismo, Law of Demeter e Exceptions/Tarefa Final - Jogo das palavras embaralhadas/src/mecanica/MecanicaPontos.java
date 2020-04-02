package mecanica;

import embaralhador.FabricaEmbaralhadora;
import principal.BancoDePalavras;

public class MecanicaPontos implements MecanicaDoJogo {

	private boolean continua = true;
	private String palavra;
	private String embaralhada;
	private int pontos;
	private int contador = 0;

	//Vai somando pontos e dando palavras até atingir o contador
	@Override
	public void mecanicaJogo(String input) {		
		if (input.equalsIgnoreCase(this.palavra)) {
			contador++;
			this.pontos +=10;
			continua = true;
		} else {		
			contador++;			
		}	
		
		if (contador > 5){
			continua = false;
		}
	}

	//Pega uma palavra do banco e mostra para o jogador embaralhada
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

	//Vê se o continua está true para continuar o jogo
	@Override
	public boolean isContinua() {
		return continua;
	}

	//Retorna os pontos
	@Override
	public int getPontos() {		
		return this.pontos;
	}
}
