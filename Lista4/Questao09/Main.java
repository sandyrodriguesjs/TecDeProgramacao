package Questao09;

public class Main {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo(5.0);
		System.out.println("Área do círculo: " + circulo.calcularArea());
		circulo.imprimirNome();

		Retangulo retangulo = new Retangulo(4.0, 6.0);
		System.out.println("Área do retângulo: " + retangulo.calcularArea());
		retangulo.imprimirNome();

		Quadrado quadrado = new Quadrado(3.0);
		System.out.println("Área do quadrado: " + quadrado.calcularArea());
		quadrado.imprimirNome();

		Triangulo triangulo = new Triangulo(8.0, 5.0);
		System.out.println("Área do triângulo: " + triangulo.calcularArea());
		triangulo.imprimirNome();
	    }
	}

