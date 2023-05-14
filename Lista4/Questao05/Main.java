package Questao05;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Contato contato1 = new Contato(1001, "João");
		Contato contato2 = new Contato(1002, "Maria", "maria@example.com");

		List<Contato> c = new ArrayList<Contato>();

		Agenda agenda = new Agenda("Agenda Principal", "Minha agenda pessoal");
		agenda.adicionarContato(contato1);

		Cliente cliente = new Cliente(agenda);
        cliente.imprimirContatos();
    }

}
