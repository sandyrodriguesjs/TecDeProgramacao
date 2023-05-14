package Questao17;

import java.util.Scanner;

public class JogodaVelha {

	private String[][] grade;
	public int jogador;

	public JogodaVelha() {
		grade = new String[3][3];
		jogador = 1;
		DesenharTabuleiro();
	}

	public void DesenharTabuleiro() {
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				grade[l][c] = " ";
			}
		}
	}

	public void Interface() {
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(grade[l][c]);
				if (c < 2) {
					System.out.print(" | ");
				}
			}
			System.out.println();
			if (l < 2) {
				System.out.println("---------");
			}
		}

	}

	public void Jogar(int linha, int coluna) {

		if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
			System.out.println("Posição inválida");
		}

		if (grade[linha][coluna] != " ") {
			System.out.println("Essa posição já está ocupada.");
		}

		if (jogador == 1) {
			grade[linha][coluna] = "X";
			jogador = 2;
		} else {
			grade[linha][coluna] = "O";
			jogador = 1;
		}
	}

	public int getjogador() {
		return jogador;
	}

	public boolean verificarVitoria() {

		// linhas
		for (int i = 0; i < 3; i++) {
			if ((!(grade[i][0] == " ") && grade[i][0] == grade[i][1] && grade[i][0] == grade[i][2])
					|| (!(grade[0][i] == " ") && grade[0][i] == grade[1][i] && grade[0][i] == grade[2][i])) {
				return true;
			}
		}
		// diagonais
		if ((!(grade[0][0] == " ") && grade[0][0] == grade[1][1] && grade[0][0] == grade[2][2])
				|| (!(grade[0][2] == " ") && grade[0][2] == grade[1][1] && grade[0][2] == grade[2][0])) {
			return true;
		}

		return false;

	}

	public boolean Empate() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (grade[i][j] == " ") {
					return false;
				}
			}
		}
		System.out.println("O jogo deu empate!");
		return false;
	}

	public void ExecutarJogo() {
		JogodaVelha jogo = new JogodaVelha();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("Jogador" + jogo.jogador);
			jogo.Interface();
			System.out.println("Informe a linha: ");
			int linha = scan.nextInt();
			System.out.println("Digite a coluna: ");
			int coluna = scan.nextInt();

			jogo.Jogar(linha, coluna);

			if (jogo.verificarVitoria()) {
				System.out.println("Jogador " + jogo.getjogador() + " venceu!");
				break;
			} else if (jogo.Empate()) {
				System.out.println("O jogo terminou em empate!");
				break;
			}
		}
		jogo.Interface();
		scan.close();

	}
	
}
	
		
		

