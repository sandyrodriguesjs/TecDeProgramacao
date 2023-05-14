package Questao13;

public class Main {

	public static void main(String[] args) {
		
		ControleRemoto controle = new ControleRemoto();
		
		controle.ligar();
		controle.aumentarVolume();
		controle.aumentarVolume();
		controle.aumentarCanal();
		controle.trocarCanal(10);
		
	}

}
