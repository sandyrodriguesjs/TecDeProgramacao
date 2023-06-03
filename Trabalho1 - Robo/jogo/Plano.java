package jogo;

import java.util.ArrayList;
import java.util.List;

public class Plano {

	public ArrayList<Celula> listaCelulas;
	public int tamX;
	public int tamY;
	private int numeroBugs;
	private int numeroAlunos;
	private List<Celula> celulas;
	public List<Robo> listaRobos; // Lista de robôs
	private Robo[] robo;

	public Plano(int tamanho) {
		this.tamX = tamanho;
		this.tamY = tamanho;
		this.numeroAlunos = 0;
		this.numeroBugs = 0;
		robo = new Robo[7];

		listaRobos = new ArrayList<Robo>();
		listaCelulas = new ArrayList<Celula>();

		int contador = 1;
		for (int i = 1; i <= tamanho; i++) {
			for (int j = 1; j <= tamanho; j++) {
				Celula celula = new Celula(contador, i, j);
				listaCelulas.add(celula);
				contador++;
			}
		}

		// Adicione o robô à lista de robôs
		for (int i = 0; i < robo.length; i++) {
			robo[i] = new Robo(i + 1, 'R', 1, 1, this);
			listaRobos.add(robo[i]);
		}
	}

	public boolean ehPosicaoValida(int coordenadaX, int coordenadaY) {
		return coordenadaX >= 1 && coordenadaX <= tamX && coordenadaY >= 1 && coordenadaY <= tamX;
	}

	public void exibirTabuleiro(int tamanho, int numeroAlunos, int numeroBugs, Celula celulaAtual) {

		for (int i = 1; i <= tamanho; i++) {
			System.out.print("----");
		}
		System.out.println();

		for (int i = tamanho; i >= 1; i--) {
			for (int j = 1; j <= tamanho; j++) {
				Celula celula = retornarCelula(i, j);

				if (celula.equals(celulaAtual)) {
					System.out.print("| " + celula.getRobo().getNome() + " ");
				} else if (celula.temAluno()) {
					System.out.print("| A ");
				} else if (celula.temBug()) {
					System.out.print("| B ");
				} else {
					System.out.print("|   ");
				}
			}

			System.out.println("|");

			for (int j = 1; j <= tamanho; j++) {
				System.out.print("----");
			}

			System.out.println();
		}

	}

	public Celula retornarCelula(int x, int y) {
		for (Celula celula : listaCelulas) {
			if (celula.getPosicaoX() == x && celula.getPosicaoY() == y) {
				return celula;
			}
		}
		return null;
	}

	public void adicionarRobo(Robo robo, int x, int y) {
		Celula celula = retornarCelula(x, y);
		if (celula != null) {
			celula.setRobo(robo);
			robo.setPosicaoX(x);
			robo.setPosicaoY(y);
		} else {
			System.out.println("Erro: Célula não encontrada para adicionar o robô.");
		}
	}

	public void adicionarAluno(int x, int y) {
		Celula celula = retornarCelula(x, y);
		if (celula != null && !celula.temRobo() && !celula.temBug()) {
			celula.setAluno(true);
		} else {
			System.out.println("Não é possível adicionar o aluno nessa célula.");
		}
	}

	public void adicionarBug(int x, int y) {
		Celula celula = retornarCelula(x, y);
		if (celula != null && !celula.temRobo() && !celula.temAluno()) {
			celula.setBug(true);
		} else {
			System.out.println("Não é possível adicionar o bug nessa célula.");
		}
	}

	public void verificarSeTemRobo() {
		for (Celula celula : listaCelulas) {
			if (celula.temRobo()) {
				System.out.println("Tem robô " + celula.getRobo().getNome() + " - x: " + celula.getPosicaoX() + " - y: "
						+ celula.getPosicaoY());
			}
		}
	}

	public Celula getCelula(int posicaoX, int posicaoY) {
		for (Celula celula : listaCelulas) {
			if (celula.getPosicaoX() == posicaoX && celula.getPosicaoY() == posicaoY) {
				return celula;
			}
		}
		System.out.println("Erro: Célula não encontrada.");
		return null;
	}

	public List<Celula> getCelulasVazias() {
		List<Celula> celulasVazias = new ArrayList<>();
		for (Celula celula : listaCelulas) {
			if (!celula.temRobo() && !celula.temAluno() && !celula.temBug()) {
				celulasVazias.add(celula);
			}
		}
		return celulasVazias;
	}

	public List<Celula> getCelulas() {
		return listaCelulas;
	}

	public boolean robosAtacados() {
		for (Celula celula : listaCelulas) {
			if (celula.temRobo() && celula.temBug()) {
				return true;
			}
		}
		return false;
	}

	public Robo[] getRobo() {
		return robo;
	}

	public boolean todosAlunosResgatados() {
		for (Celula celula : listaCelulas) {
			if (celula.isAlunoPerdido()) {
				return false;
			}
		}
		return true;
	}

	private int getCelulasComAluno() {
		int count = 0;
		for (Celula celula : listaCelulas) {
			if (celula.isAlunoPerdido()) {
				count++;
			}
		}
		return count;
	}

	private int getCelulasComBug() {
		int count = 0;
		for (Celula celula : listaCelulas) {
			if (celula.isBug()) {
				count++;
			}
		}
		return count;
	}
}
