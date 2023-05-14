package Questao09;

public class Quadrado extends Forma {
	
	public double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double calcularArea() {
		return lado * lado;
	}

	public void imprimirNome() {
		System.out.println("Quadrado");
	}

}
