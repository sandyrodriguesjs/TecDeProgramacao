package Lista2;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Informe o numero: ");
		int numero = scanner.nextInt();
		
		int i = 0, resultado;
		while (i <= 10) {
			resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
			i++;
		}
		
		scanner.close();
	}
}

