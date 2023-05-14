package Questao18;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		int tamanhoArea = 5; // Tamanho da área quadrada em que o robô vai caminhar

        Robo robo = new Robo(tamanhoArea);

        Random random = new Random();
        int moedaX = random.nextInt(tamanhoArea);
        int moedaY = random.nextInt(tamanhoArea);
        robo.colocarMoeda(moedaX, moedaY);

        System.out.println("Posição inicial do robô:");
        robo.exibirArea();

        robo.caminharNorte();
        robo.caminharLeste();
        robo.caminharSul();
        robo.caminharOeste();
        robo.caminharNordeste();
        robo.caminharSudeste();
        robo.caminharSudoeste();
        robo.caminharNoroeste();

        System.out.println("\nPosição atual do robô:");
        robo.exibirArea();
    }

}
