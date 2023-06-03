package jogo;

public class Celula {

	public int posicaoX;
	public int posicaoY;
	public int id;
	private boolean aluno;
	private boolean bug;
	private boolean visitada;
	private boolean alunoPerdido;
	public Robo robo;

	public Celula(int id, int posicaoX, int posicaoY) {
		this.id = id;
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
	}

	public int getId() {
		return id;
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public Robo getRobo() {
		return robo;
	}

	public void setRobo(Robo robo) {
		this.robo = robo;
	}

	public boolean temRobo() {
		return robo != null;
	}

	public boolean temAluno() {
		return alunoPerdido;
	}

	public void setAluno(boolean aluno) {
		this.aluno = aluno;
	}

	public boolean temBug() {
		return bug;
	}

	public void setBug(boolean bug) {
		this.bug = bug;
	}

	public String imprimir() {
		return "Celula:  " + id + " x: " + posicaoX + " y: " + posicaoY;
	}

	public void removerRobo() {
		this.robo = null;
	}

	public void setAlunoPerdido(boolean alunoPerdido) {
		this.alunoPerdido = alunoPerdido;
	}

	public boolean isVisitada() {
		return visitada;
	}

	public void setVisitada(boolean visitada) {
		this.visitada = visitada;
	}

	public boolean isAlunoPerdido() {
		return alunoPerdido;
	}

	public int getCoordenadaX() {
		return posicaoX;
	}

	public int getCoordenadaY() {
		return posicaoY;

	}

	public boolean isBug() {
		return bug;
	}
}
