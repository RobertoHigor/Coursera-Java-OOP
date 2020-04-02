package Classes;

public class Informal implements FormatadorNome{
	//Retornar apenas o nome
	@Override
	public String formatarNome(String nome, String sobrenome){
		return nome;
	}

}
