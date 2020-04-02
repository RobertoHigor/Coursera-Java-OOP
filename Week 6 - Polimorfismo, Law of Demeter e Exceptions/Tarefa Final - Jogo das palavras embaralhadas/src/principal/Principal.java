package principal;

import java.util.Scanner;

import mecanica.FabricaMecanicaDoJogo;
import mecanica.MecanicaDoJogo;

public class Principal {

	private static Scanner sc;

	public static void main(String[] args) {	
		//Instanciando Scanner
		sc = new Scanner(System.in);
		
		System.out.println("--------------------INICIO--------------------\n");

		// Instanciando FabricaMecanicaDoJogo e escolhendo o modo de jogo
		FabricaMecanicaDoJogo fmj = new FabricaMecanicaDoJogo();
		System.out.println("Você irá jogar em qual modo? : 1 = Challenge ou 2 = Pontos");		
		fmj.setMecanicaJogo(sc.nextInt());
		sc.nextLine();
		MecanicaDoJogo mdj = fmj.mecanicaUtilizada();

		while (mdj.isContinua()) {
			// Dar a palavra			
			System.out.println("\nA palavra é: " + mdj.darPalavra());			
			mdj.mecanicaJogo(sc.nextLine().toUpperCase());
		}
		System.out.println("Você fez: "+mdj.getPontos()+" Pontos");
		System.out.println("\n--------------------FIM--------------------");
	}
}
