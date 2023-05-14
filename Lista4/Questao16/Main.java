package Questao16;

public class Main {

	public static void main(String[] args) {
		
		Elevador elevador = new Elevador();
		elevador.inicializa(5, 20);
		
		elevador.entra();
		elevador.sobe();
		elevador.entra();
		elevador.sobe();
		elevador.sai();
		
		System.out.println("Andar Atual: " + elevador.getAndarAtual());
        System.out.println("Total de Andares: " + elevador.getTotalAndares());
        System.out.println("Capacidade: " + elevador.getCapacidade()); 
	}

}
