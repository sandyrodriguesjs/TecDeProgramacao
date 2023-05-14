package Questao05;

public class Cliente {

	 private Agenda agenda;

	    public Cliente(Agenda agenda) {
	        this.agenda = agenda;
	    }

	    public void adicionarContato(Contato contato) {
	        agenda.adicionarContato(contato);
	    }

	    public void imprimirContatos() {
	        agenda.imprimirContatos();
	    }
}
