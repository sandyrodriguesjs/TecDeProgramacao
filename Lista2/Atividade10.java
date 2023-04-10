package Lista2;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe o tamanho da matriz");
		int tamanho = scanner.nextInt();
		
		int[][] matriz = new int [tamanho][tamanho];
		
		for (int i = 0; i < tamanho; i++) {
	         for (int j = 0; j <= i; j++) {
	            matriz[i][j] = j;
	         }
	      }

	     for (int i = 0; i < tamanho; i++) {
	    	 for (int j = 0; j < tamanho; j++) {
	            if (j <= i) {
	               System.out.print(matriz[i][j] + " ");
	            } else {
	               System.out.print("  "); 
	            }
	         }
	         System.out.println();
		}
	     
	     // Alternativa B
	     /*for (int i = 0; i < tamanho; i++) {
	            for (int j = 0; j < tamanho; j++) {
	                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
	                char valor = scanner.next().charAt(0);
	                matriz[i][j] = valor;
	            }
	        }

	        for (int i = 0; i < tamanho; i++) {
	            for (int j = 0; j < tamanho; j++) {
	                if ((i + j) % 2 == 0) { 
	                    System.out.print("@ ");
	                } else {
	                    System.out.print("* ");
	                }
	            }
	            System.out.println();
	        }*/
		
		
		scanner.close();
	}

}
