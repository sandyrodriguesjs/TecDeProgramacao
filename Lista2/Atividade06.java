package Lista2;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Informe a quantidade de linhas: ");
		int linha = scanner.nextInt();
		System.out.print("Informe a quantidade de colunas: ");
		int coluna = scanner.nextInt();
		
		if (coluna == linha) {
			System.out.println("A matriz eh simetrica");
		}else { 
			System.out.println("A matriz nao eh simetrica");
		}
		scanner.close();

	}

}
