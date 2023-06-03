package jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Robo {

	protected int id;
	protected char nome;
	protected Plano plano;
	protected int pontuacao;
	private int alunosResgatados;
	public Celula celulaAtual;
	private int coordenadaX;
	private int coordenadaY;
	private int bugsEncontrados;
	private Celula celulaInicial;
	private int posicaoY;
	private int posicaoX;
	private List<Celula> celulas;
	private List<Celula> celulasVisitadas;
	private int y;
	private int x;

	public Robo(int id, char nome, int posicaox, int posicaoy, Plano p) {
		this.id = id;
		this.nome = nome;
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		this.plano = p;
		this.pontuacao = 0;
		this.celulasVisitadas = new ArrayList<>();

		this.celulaAtual = p.getCelula(posicaox, posicaoy);

		Celula aux = null;
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			aux = plano.listaCelulas.get(i);
			if (aux.posicaoX == posicaoX && aux.posicaoY == posicaoY) {
				aux.robo = this;
			}
		}
	}

	public boolean moverRobo(Robo robo, int quantidadeCelulas, Plano plano) {
		int novaCoordenadaX = coordenadaX + quantidadeCelulas;
		int novaCoordenadaY = coordenadaY + quantidadeCelulas;

		if (plano.ehPosicaoValida(novaCoordenadaX, novaCoordenadaY)) {
			Celula celulaAtual = plano.retornarCelula(coordenadaX, coordenadaY);
			Celula novaCelula = plano.retornarCelula(novaCoordenadaX, novaCoordenadaY);

			if (celulaAtual != null) {
				celulaAtual.removerRobo();
			}

			coordenadaX = novaCoordenadaX;
			coordenadaY = novaCoordenadaY;

			celulaAtual = novaCelula;
			if (celulaAtual != null) {
				celulaAtual.setRobo(robo);
				robo.adicionarCelulaVisitada(celulaAtual);
			}
			return true;
		}

		return false;
	}

	public Celula getCelulaAtual() {
		return plano.getCelula(coordenadaX, coordenadaY);
	}

	public void adicionarCelulaVisitada(Celula celula) {
		celulasVisitadas.add(celula);
	}

	public Robo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void moverParaCima(int quantidade) {
		y -= quantidade;
	}

	public void moverParaBaixo(int quantidade) {
		y += quantidade;
	}

	public void moverParaDireita(int quantidade) {
		x += quantidade;
	}

	public void moverParaEsquerda(int quantidade) {
		x -= quantidade;
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setPosicaoY(int y) {
		this.posicaoY = y;
	}

	public void setPosicaoX(int x) {
		this.posicaoX = x;
	}

	public int getId() {
		return id;
	}

	public char getNome() {
		return nome;
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void resgatarAluno() {
		pontuacao += 10;
		alunosResgatados++;
	}

	public void encontrarBug() {
		pontuacao -= 15;
		bugsEncontrados++;
	}

	public void setCelulaAtual(Celula celulaAtual) {
		this.celulaAtual = celulaAtual;
	}

	public void setCelula(Celula celulaDestino) {
		this.celulaAtual = celulaDestino;
	}

	public Celula[] getCelulasVisitadas() {
		List<Celula> celulasVisitadas = new ArrayList<>();

		for (Celula celula : plano.listaCelulas) {
			if (celula.isVisitada()) {
				celulasVisitadas.add(celula);
			}
		}

		return celulasVisitadas.toArray(new Celula[0]);
	}

	public int getAlunosResgatados() {
		return alunosResgatados;
	}

	public int getBugsEncontrados() {
		return bugsEncontrados;
	}

	public void incrementarAlunosResgatados() {
		alunosResgatados++;

	}

	public Celula getCelula() {
		return celulaAtual;
	}

	public void setPosicao(int x, int y) {
		this.coordenadaX = x;
		this.coordenadaY = y;
	}

}
