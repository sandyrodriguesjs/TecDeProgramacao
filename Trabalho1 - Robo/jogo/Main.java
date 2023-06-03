package jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		List<Robo> listaRobos = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bem-vindo ao Jogo!");

		// Obter as informações do jogo
		System.out.print("Informe o número de células do plano: ");
		int numeroCelulas = scanner.nextInt();

		System.out.print("Informe o número de alunos perdidos: ");
		int numeroAlunos = scanner.nextInt();

		System.out.print("Informe o número de bugs: ");
		int numeroBugs = scanner.nextInt();

		// Criar o plano
		Plano p = new Plano(numeroCelulas);

		Robo robo = new Robo(1, 'R', 1, 1, p);

		listaRobos.add(robo);

		// Sortear as coordenadas dos alunos
		List<Celula> celulasVazias = p.getCelulasVazias();
		List<Celula> alunos = sortearCoordenadas(celulasVazias, numeroAlunos);

		// Colocar os alunos no plano
		for (Celula aluno : alunos) {
			aluno.setAlunoPerdido(true);
		}

		// Sortear as coordenadas dos bugs
		List<Celula> celulasVaziasRestantes = p.getCelulasVazias();
		celulasVaziasRestantes.removeAll(alunos);
		List<Celula> bugs = sortearCoordenadas(celulasVaziasRestantes, numeroBugs);

		// Colocar os bugs no plano
		for (Celula bug : bugs) {
			bug.setBug(true);
		}

		// Imprimir o plano inicial
		System.out.println("Plano inicial:");

		// Exibir o tabuleiro
		p.exibirTabuleiro(numeroCelulas, numeroAlunos, numeroBugs, robo.getCelulaAtual());

		iniciarRodadas(scanner, p, numeroCelulas, numeroAlunos, numeroBugs);

	}

	private static void iniciarRodadas(Scanner scanner, Plano p, int numeroCelulas, int numeroAlunos, int numeroBugs) {
		boolean jogoContinua = true;

		while (jogoContinua) {
			System.out.println("----- Nova Rodada -----");

			if (p.getRobo() == null || p.getRobo().length == 0) {
				
				// Exibir mensagem de erro ou retornar, pois não há robôs no plano
				System.out.println("Não há robôs no plano!");
				return;
			}
			for (Robo robo : p.getRobo()) {
	            System.out.print("Ação (mover/resgatar): ");
	            String acao = scanner.next();

	            if (acao.equalsIgnoreCase("mover")) {
	                System.out.print("Número de células para mover: ");
	                int quantidadeCelulas = scanner.nextInt();
	                if (robo != null) {
	                    if (robo.moverRobo(robo, quantidadeCelulas, p)) {
	                        System.out.println("Robô movido para a nova posição.");
	                    } else {
	                        System.out.println("Movimento inválido. O robô permaneceu na mesma posição.");
	                    }
	                }
	            } else if (acao.equals("resgatar")) {
	                resgatarAluno(robo, p);
	            }

	            System.out.println("Plano atual:");
	            p.exibirTabuleiro(numeroCelulas, numeroAlunos, numeroBugs, robo.getCelulaAtual());
	        }

	        // Verificar se o jogo terminou
	        if (p.todosAlunosResgatados()) {
	            System.out.println("Parabéns! Todos os alunos foram resgatados. Você venceu o jogo!");
	            jogoContinua = false;
	            break;
	        }

	        if (p.robosAtacados()) {
	            System.out.println("Um ou mais robôs foram atacados por bugs. Você perdeu o jogo.");
	            jogoContinua = false;
	            break;
	        }

			System.out.print("Deseja continuar jogando? (s/n): ");
			String resposta = scanner.next();
			if (resposta.equalsIgnoreCase("n")) {
				jogoContinua = false;
			}
		}

		System.out.println("Obrigado por jogar o Jogo!");
	}

	private static void resgatarAluno(Robo robo, Plano plano) {
	    Celula celulaAtual = plano.getCelula(robo.getCoordenadaX(), robo.getCoordenadaY());
	    if (celulaAtual != null && celulaAtual.isAlunoPerdido()) {
	        celulaAtual.setAlunoPerdido(false);
	        robo.incrementarAlunosResgatados();
	        System.out.println("Aluno resgatado!");
	    } else {
	        System.out.println("Não há aluno perdido nesta célula.");
	    }
	}

	private static List<Celula> sortearCoordenadas(List<Celula> celulasVazias, int quantidade) {
		Random random = new Random();
		List<Celula> coordenadasSorteadas = new ArrayList<>();

		for (int i = 0; i < quantidade; i++) {
			int indiceSorteado = random.nextInt(celulasVazias.size());
			Celula celulaSorteada = celulasVazias.get(indiceSorteado);
			coordenadasSorteadas.add(celulaSorteada);
			celulasVazias.remove(indiceSorteado);
		}

		return coordenadasSorteadas;
	}
}
