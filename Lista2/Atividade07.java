package Lista2;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe um numero: ");
		int numUsuario = scanner.nextInt();
		
		int i = 0, maiorPrimo = 0;
		while(i < numUsuario) {
			i++;
			if (!(i % 2 == 0) && (i != 9)) {
				maiorPrimo = i;
			}
		}
		System.out.println("O maior primo da sequencia eh: " + maiorPrimo);	
		
		scanner.close();
	}

}
