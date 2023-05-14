package Questao03;

public class Fatura {

	public int numeroItem;
	public String descricao;
	public int quantidade;
	public double precoUnitario;
	public double precoTotal;
	public double valorFatura;

	public Fatura(int numeroItem, String descricao, int quantidade, double precoUnitario) {
		super();
		this.numeroItem = numeroItem;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
	}

	public int getNumeroItem() {

		return numeroItem;
	}

	public void setNumeroItem(int numeroItem) {

		this.numeroItem = numeroItem;
	}

	public String getDescricao() {

		return descricao;
	}

	public void setDescricao(String descricao) {

		this.descricao = descricao;
	}

	public int getQuantidade() {

		return quantidade;
	}

	public void setQuantidade(int quantidade) {

		this.quantidade = quantidade;
	}

	public double getPrecoUnitario() {

		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {

		if (precoUnitario < 0) {
			this.precoUnitario = 0.0;
		} else {
			this.precoUnitario = precoUnitario;
		}
	}

	public double getValorFatura(int quantidade, double precoUnitario) {
		double valorFatura = quantidade * precoUnitario;

		return valorFatura;
	}

}
