package Classes;

public class ComTitulo  implements FormatadorNome{
    private String titulo;
    
    //Construtor recebendo titulo
	public ComTitulo(String titulo){		
		this.titulo = titulo;
	}
	
	//Getters e Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	//Retorna título + nome + sobrenome
	@Override
	public String formatarNome(String nome, String sobrenome) {
		return titulo + " " + nome + " " + sobrenome;		
	}
}
