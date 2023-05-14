package Questao18;

import java.util.Random;

public class Robo {

	int[][] area;
    private int posX;
    private int posY;
    private int norte;
    private int sul;
    private int leste;
    private int oeste;
    private int nordeste;
    private int sudeste;
    private int sudoeste;
    private int noroeste;

    public Robo(int tamanho) {
        if (tamanho % 2 == 0) {
            tamanho++; // Garante um tamanho ímpar para o quadrado da área
        }
        area = new int[tamanho][tamanho];
        posX = posY = tamanho / 2; // Inicializa o robô no meio da área
        norte = sul = leste = oeste = nordeste = sudeste = sudoeste = noroeste = 0;
    }

    public void caminharNorte() {
        if (posY > 0) {
            posY--;
            norte++;
            verificarMoeda();
        }
    }

    public void caminharSul() {
        if (posY < area.length - 1) {
            posY++;
            sul++;
            verificarMoeda();
        }
    }

    public void caminharLeste() {
        if (posX < area.length - 1) {
            posX++;
            leste++;
            verificarMoeda();
        }
    }

    public void caminharOeste() {
        if (posX > 0) {
            posX--;
            oeste++;
            verificarMoeda();
        }
    }

    public void caminharNordeste() {
        if (posY > 0 && posX < area.length - 1) {
            posY--;
            posX++;
            nordeste++;
            verificarMoeda();
        }
    }

    public void caminharSudeste() {
        if (posY < area.length - 1 && posX < area.length - 1) {
            posY++;
            posX++;
            sudeste++;
            verificarMoeda();
        }
    }

    public void caminharSudoeste() {
        if (posY < area.length - 1 && posX > 0) {
            posY++;
            posX--;
            sudoeste++;
            verificarMoeda();
        }
    }

    public void caminharNoroeste() {
        if (posY > 0 && posX > 0) {
            posY--;
            posX--;
            noroeste++;
            verificarMoeda();
        }
    }

    public void verificarMoeda() {
        if (area[posY][posX] == 1) {
            System.out.println("Moeda encontrada!");
            area[posY][posX] = 0;
        }
    }

    public void colocarMoeda(int posX, int posY) {
        area[posY][posX] = 1;
    }

    public void exibirArea() {
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[i].length; j++) {
                if (i == posY && j == posX) {
                    System.out.print("R "); // Representa a posição atual do robô
                } else if (area[i][j] == 1) {
                    System.out.print("$ "); // Representa a moeda
                } else {
                    System.out.print("- "); // Representa uma casa vazia
                }
            }
            System.out.println();
        }
    }
}
