
public class Principal {

	public static void main(String[] args) {
		Paciente p1 = new Paciente(60.5, 1.75);
		Paciente p2 = new Paciente(70.0, 1.6);
		Paciente p3 = new Paciente(120.0, 1.9);
		
		p1.resultado(p1.diagnostico());
		p2.resultado(p2.diagnostico());
		p3.resultado(p3.diagnostico());
	}

}
