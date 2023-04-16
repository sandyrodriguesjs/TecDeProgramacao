package Lista3;

import java.util.Scanner;

public class Atividade18 {
	
	public static double jurosCompostos(double valorInicial,double taxa, int periodo){
		double montante = valorInicial * Math.pow(1 + taxa, periodo);
		 double juros = montante - valorInicial;
		
		return juros;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.println("informe o valor inicial: ");
		double valorInicial = scanner.nextDouble();
		
		System.out.println("informe a taxa: ");
		double taxa = scanner.nextDouble();
		
		System.out.println("informe o periodo: ");
		int periodo = scanner.nextInt();
		
		double juros = jurosCompostos(valorInicial, taxa, periodo);
	    System.out.println(juros);
	    
	    scanner.close();
	}

}
