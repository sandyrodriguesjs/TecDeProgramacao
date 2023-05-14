package Questao07;

public class Vendedor extends Empregado {
	
	private float percentualComissao;

	 public Vendedor(String nome, double salario, float percentualComissao) {
	        setNome(nome);
	        setSalario(salario);
	        this.percentualComissao = percentualComissao;
	    }

	    public float getPercentualComissao() {
	        return percentualComissao;
	    }

	    public void setPercentualComissao(float percentualComissao) {
	        this.percentualComissao = percentualComissao;
	    }
	    
	    public float calcularSalario() {
	        return (float) (getSalario() + (getSalario() * percentualComissao / 100.0));
	    }

	    public String toString() {
	        return "Vendedor [nome=" + getNome() + ", salario sem comissao=" + getSalario() +
	               ", salario com comissao=" + calcularSalario() + ", percentual de comissao=" + percentualComissao + "]";
	    }
}
