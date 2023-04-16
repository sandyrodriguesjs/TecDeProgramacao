package Lista3;

import java.util.Scanner;

public class Atividade19 {
	
	public static boolean numPerfeito(int num) {
	    int sum = 0;
	    for (int i = 1; i < num; i++) {
	        if (num % i == 0) {
	            sum += i;
	        }
	    }
	    return sum == num;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe o numero: ");
		int num = scanner.nextInt();
		boolean numPerfeito = numPerfeito(num);
		System.out.println(num + " é um número perfeito?\n" + numPerfeito);
		
		scanner.close();

	}

}
