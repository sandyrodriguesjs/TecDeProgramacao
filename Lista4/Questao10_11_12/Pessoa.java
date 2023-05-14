package Questao10_11_12;

public class Pessoa {

	private String nome;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;

	public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento) {
		this.nome = nome;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public String getDataNascimento() {
		return diaNascimento + "/" + mesNascimento + "/" + anoNascimento;
	}

}
