import static org.junit.Assert.*;

import org.junit.Test;

public class TestIMC {

	//Baixo peso muito grave
	@Test
	public void baixoPMG() {
		Paciente p1 = new Paciente(45.0, 1.75);
		p1.resultado(p1.diagnostico());
		assertEquals(15.0, p1.IMC, 0.50);	
	}
	
	//Baixo peso grave
	@Test
	public void baixoPG() {
		Paciente p1 = new Paciente(50.0, 1.75);
		p1.resultado(p1.diagnostico());
		assertEquals(16.0, p1.IMC, 0.50);	
	}
	
	//Baixo peso
	@Test
	public void baixoP() {
		Paciente p1 = new Paciente(54.5, 1.79);
		p1.resultado(p1.diagnostico());
		assertEquals(17.0, p1.IMC, 0.50);	
	}
	
	//Peso Normal
	@Test
	public void normal() {
		Paciente p1 = new Paciente(60.9, 1.81);
		p1.resultado(p1.diagnostico());
		assertEquals(18.5, p1.IMC, 0.50);	
	}

	//SobrePeso
	@Test
	public void sobreP() {
		Paciente p1 = new Paciente(78.0, 1.75);
		p1.resultado(p1.diagnostico());
		assertEquals(25.0, p1.IMC, 0.50);	
	}
	
	//Obesidade grau 1
	@Test
	public void obesidadeGI() {
		Paciente p1 = new Paciente(92.0, 1.75);
		p1.resultado(p1.diagnostico());
		assertEquals(30.0, p1.IMC, 0.50);	
	}
	
	//Obesidade grau 2
	@Test
	public void obesidadeGII() {
		Paciente p1 = new Paciente(108.0, 1.75);
		p1.resultado(p1.diagnostico());
		assertEquals(35.0, p1.IMC, 0.50);	
	}
	
	//Obesidade grau 3
	@Test
	public void obesidadeGIII() {
		Paciente p1 = new Paciente(109.0, 1.65);
		p1.resultado(p1.diagnostico());
		assertEquals(40.0, p1.IMC, 0.50);	
	}
}
