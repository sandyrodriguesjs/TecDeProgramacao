package Questao05;

import java.util.List;

public class Agenda {

	private List<Contato> contatos;
	private String nomeAgenda;
	private String descricao;

	public Agenda(String nomeAgenda, String descricao) {
		this.nomeAgenda = nomeAgenda;
		this.descricao = descricao;
		this.contatos = new List<Contato>();
	}

	public void adicionarContato(Contato contato) {
		contatos.add(contato);
	}

	public void imprimirContatos() {
		System.out.println("Contatos da agenda " + nomeAgenda + ":");
		for (Contato contato : contatos) {
			contato.imprimirDados();
		}
	}
}
