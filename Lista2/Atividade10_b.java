package Lista2;

import java.util.Scanner;

public class Atividade10_b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de linhas e colunas da matriz: ");
        int tamanho = input.nextInt();

        char[][] matriz = new char[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                char valor = input.next().charAt(0);
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
        }
        input.close();
    }

}
