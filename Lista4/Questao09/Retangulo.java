package Questao09;

public class Retangulo extends Forma {

	public double largura;
	public double altura;

	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularArea() {
		return largura * altura;
	}

	public void imprimirNome() {
		System.out.println("Retângulo");
	}
}
