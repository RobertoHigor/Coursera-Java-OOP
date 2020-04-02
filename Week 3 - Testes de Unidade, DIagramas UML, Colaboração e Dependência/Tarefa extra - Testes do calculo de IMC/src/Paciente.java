
public class Paciente {
	double peso;
	double altura;
	double IMC;
	String diagnostico;

	public Paciente(Double peso, Double altura){
		this.peso = peso;
		this.altura = altura;
	}
	
	public double calcularIMC(Double peso, Double altura){
		IMC = peso / (altura * altura);
		return IMC;
	}
	
	public void resultado(String diagnostico){
		System.out.println(this.diagnostico() + " Com o IMC de: " + this.IMC);
	}
	
	public String diagnostico(){
		Double IMC = calcularIMC(this.peso, this.altura);		
		if (IMC < 16){
			return "Baixo peso muito grave";
		}else if (IMC < 16.99){
			return "Baixo peso grave";
		}else if (IMC < 18.49){
			return "Baixo peso";
		}else if (IMC < 24.99){
			return "Peso normal";
		}else if (IMC < 29.99){
			return "Sobrepeso"; 
		}else if (IMC < 34.99){
			return "Obesidade grau I";
		}else if (IMC < 39.99){
			return "Obesidade grau II";
		}else {
			return "Obesidade grau III (obesidade mórbida)";
		}

	}
}
