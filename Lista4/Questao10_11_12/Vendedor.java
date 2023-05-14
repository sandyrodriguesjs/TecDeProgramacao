package Questao10_11_12;

public class Vendedor extends Empregado {

	private double valorVendas;
	private double comissao;

	public Vendedor(String nome, int diaNascimento, int mesNascimento, int anoNascimento, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, diaNascimento, mesNascimento, anoNascimento, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }


	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double calcularSalario() {
		double salarioBase = getSalarioBase();
		double salarioComComissao = salarioBase + (valorVendas * comissao / 100);
		double salarioLiquido = salarioComComissao - (salarioComComissao * getImposto() / 100);
		return salarioLiquido;
	}

}
