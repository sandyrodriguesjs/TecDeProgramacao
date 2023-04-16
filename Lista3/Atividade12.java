package Lista3;

import java.util.Scanner;

public class Atividade12 {
	
	public static void verificarPrimo(int numero) {
	    if (numero <= 1) {
	        System.out.println(numero + " não é primo");
	        return;
	    }

	    for (int i = 2; i <= numero / 2; i++) {
	        if (numero % i == 0) {
	            System.out.println(numero + " não é primo");
	            return;
	        }
	    }

	    System.out.println(numero + " é primo");
	}


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe o numero: ");
		int numero = scanner.nextInt();
        verificarPrimo(numero);
        
        scanner.close();
	}

}
