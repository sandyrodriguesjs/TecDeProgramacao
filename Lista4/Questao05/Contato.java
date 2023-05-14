package Questao05;

import java.util.List;

public class Contato {

	private int codigo;
	private String nome;
	private String endereco;
	private String email;
	private String telefone;
	private String observacao;

	public Contato(int codigo) {
		this.codigo = codigo;
	}

	public Contato(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public Contato(int codigo, String nome, String email) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
	}

	public Contato(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void imprimirDados() {
		System.out.println("Código: " + codigo);
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + endereco);
		System.out.println("E-mail: " + email);
		System.out.println("Telefone: " + telefone);
		System.out.println("Observação: " + observacao);
		System.out.println();
	}
	
	public Contato duplicarContato() {
		Contato novoContato = new Contato(codigo, nome);
		novoContato.endereco = endereco;
		novoContato.email = email;
		novoContato.telefone = telefone;
		novoContato.observacao = observacao;
		return novoContato;
	}

	public boolean isContatoPreenchido() {
		return (codigo != 0 && nome != null && endereco != null && email != null && telefone != null
				&& observacao != null);
	}

}
