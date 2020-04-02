package Classes;

public class Respeitoso implements FormatadorNome{
	
	private char genero;
	
	//Construtor recebendo genero
	public Respeitoso(char genero){
		this.genero = genero;
	}

	//Retornar Sr ou Sra dependendo do gênero + o sobrenome
	@Override
	public String formatarNome(String nome, String sobrenome){
		if (genero == 'm'){
			return "Sr. " + sobrenome;
		}else{
			return "Sra. " + sobrenome;
		}
	}

}
