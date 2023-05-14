package Questao09;

public class Circulo extends Forma {
	public double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double calcularArea() {
		return Math.PI * raio * raio;
	}

	public void imprimirNome() {
		System.out.println("Círculo");
	}
	

}
