package Questao14;

public class Pessoa {

	 private String nome;
	    private int diaDoNascimento;
	    private int mesDoNascimento;
	    private int anoDoNascimento;
	    private int idade;

	    public Pessoa(String nome, int diaDoNascimento, int mesDoNascimento, int anoDoNascimento) {
	        this.nome = nome;
	        this.diaDoNascimento = diaDoNascimento;
	        this.mesDoNascimento = mesDoNascimento;
	        this.anoDoNascimento = anoDoNascimento;
	    }

	    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
	        int idadeAnos = anoAtual - anoDoNascimento;
	        if (mesAtual < mesDoNascimento || (mesAtual == mesDoNascimento && diaAtual < diaDoNascimento)) {
	            idadeAnos--;
	        }

	        idade = idadeAnos;
	    }

	    public int informaIdade() {
	        return idade;
	    }

	    public void ajustaDataDeNascimento(int diaDoNascimento, int mesDoNascimento, int anoDoNascimento) {
	        this.diaDoNascimento = diaDoNascimento;
	        this.mesDoNascimento = mesDoNascimento;
	        this.anoDoNascimento = anoDoNascimento;
	    }
	    
	    public String informaNome() {
	        return nome;
	    }
	}
