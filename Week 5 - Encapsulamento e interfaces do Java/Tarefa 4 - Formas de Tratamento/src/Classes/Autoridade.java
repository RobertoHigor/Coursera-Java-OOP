package Classes;

public class Autoridade {

	//Variáveis privadas
	private String nome;
	private String sobrenome;
	private char genero;
	private String titulo;
	private FormatadorNome format;
	private String tratamento;

	//Getters e Setters
	private String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	private char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	private String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}

	//Método que recebe o tipo de tratamento e retorna o método formatar nome da classe com o nome e sobrenome.
	public String getTratamento() {
		if (tratamento.equalsIgnoreCase("comtitulo")) {
			format = new ComTitulo(this.getTitulo());
		} else if (tratamento.equalsIgnoreCase("respeitoso")) {
			format = new Respeitoso(this.getGenero());
		} else if (tratamento.equalsIgnoreCase("informal")) {
			format = new Informal();
		} else {
			return "Tipo de tratamento inválido";
		}
		return format.formatarNome(this.getNome(), this.getSobrenome());
	}
}