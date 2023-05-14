package Questao06;

public class Main {

	public static void main( String[] args) {
		Evento evento = new Evento();
		Ingresso ingresso = new Ingresso();
		
		
		evento.adicionarIngresso(new Ingresso(20));
		
		evento.venda(ingresso.valor);
	}

}
