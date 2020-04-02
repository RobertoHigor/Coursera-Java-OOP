package embaralhador;

public class FabricaEmbaralhadora {

	//Escolhe randomicamente qual o método de embaralhar será utilizado
	public  String embaralhadorAleatorio(String palavra) {
		if (Math.random() <= 0.5) {
			Embaralhador inve = new EmbaralhaInverso();
			palavra = inve.embaralhar(palavra);
		} else {
			Embaralhador rando = new EmbaralhaRandomico();
			palavra = rando.embaralhar(palavra);
		}
		return palavra;
	}
}
