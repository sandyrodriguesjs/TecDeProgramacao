package Lista3;

import java.util.Scanner;

public class Atividade16 {

	public static boolean primo(int numero) {
	    if (numero <= 1) {
	        return false;
	    }
	    
	    for (int i = 2; i < numero; i++) {
	        if (numero % i == 0) {
	            return false;
	        }
	    }
	    
	    return true;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		 System.out.print("Digite um número: ");
		   int numero = scanner.nextInt();
		   boolean resultado = primo(numero);
		   System.out.println(resultado);
		   
		   scanner.close();
	}

}
