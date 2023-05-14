package Questao07;

public class Empregado {

	public String nome;
	protected double salario;
	
	public String getNome() {
		return nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	 public String toString() {
	        return "Empregado [nome =" + nome + ", salario =" + salario + "]";
	    }
	 
	 
	
	
}
