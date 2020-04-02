import java.io.IOException;

public class LeituraArquivoException extends IOException {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public String arquivo;
private final String mensagem;

public LeituraArquivoException(String mensagem, String arquivo) {
	super(mensagem);
	this.arquivo = arquivo;
	this.mensagem = mensagem;	
}

public String getMensagem() {
	return mensagem;
}
 

}
