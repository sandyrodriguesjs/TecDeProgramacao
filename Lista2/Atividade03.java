package Lista2;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Adivinhe o numero: ");
		int i, palpite = scan.nextInt();
		
		for(i=0; i<101; i++) {
			if(palpite < 1) {
				System.out.println("O numero eh menor que o numero a ser adivinhado, tente novamente!");
				System.out.print("Adivinhe o numero: ");
				palpite = scan.nextInt();
			} else if(palpite > 100) {
				System.out.println("O numero eh maior que o numero a ser adivinhado, tente novamente!");
				System.out.print("Adivinhe o numero: ");
				palpite = scan.nextInt();
			} else if(palpite == i){
				System.out.println("O numero esta correto, muito bem!");
			}
		}
		
		scan.close();
	}
}