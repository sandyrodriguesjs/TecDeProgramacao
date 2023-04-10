package Lista2;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		int soma = 0;
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Informe o numero desejado: ");
		int numero1 = scanner.nextInt();
		scanner.nextLine();
		
		while (numero1 > 0)  {
			
			soma += numero1;
			System.out.print("Informe outro numero desejado: ");
			numero1 = scanner.nextInt();
			scanner.nextLine();
		} 
		System.out.println("A soma dos numeros informados eh: " + soma);
		
		scanner.close();
	}
}

