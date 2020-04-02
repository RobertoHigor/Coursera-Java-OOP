
public class LoginException extends Exception {

	private String login;

	public LoginException(String message, String login) {
		super("Erro ao abrir o arquivo "+message);
		this.login = login;
	}

	public String getLogin() {
		return login;
	}

}
