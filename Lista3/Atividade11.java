package Lista3;

import java.util.Scanner;

public class Atividade11 {

	    public static double potencia(double base, double expoente) {
	        double resultado = Math.pow(base, expoente);
	        
	        return resultado;
	    }
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("informe a base: ");
		double base = scanner.nextDouble();
		
		System.out.println("informe o expoente: ");
		double expoente = scanner.nextDouble();
		
		double resultado = potencia(base,expoente);
	    System.out.println(resultado);
	    
	    scanner.close();

	}

}
