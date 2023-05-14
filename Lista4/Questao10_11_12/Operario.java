package Questao10_11_12;

public class Operario extends Empregado{
	
	private double valorProducao;
	private double comissao;

	public Operario(String nome, int diaNascimento, int mesNascimento, int anoNascimento, int codigoSetor,
			double salarioBase, double imposto, double valorProducao, double comissao) {
		super(nome, diaNascimento, mesNascimento, anoNascimento, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double calcularSalario() {
		double salarioBase = getSalarioBase();
		double salarioComComissao = salarioBase + (valorProducao * comissao / 100);
		double salarioLiquido = salarioComComissao - (salarioComComissao * getImposto() / 100);
		return salarioLiquido;
	}


}
