package Questao07;

public class Gerente extends Empregado{

	private String departamento;
	
	public Gerente(String nome, double salario, String departamento) {
        setNome(nome);
        setSalario(salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String toString() {
        return "Gerente [nome=" + getNome() + ", salario=" + getSalario() + ", departamento=" + departamento + "]";
    }
}
