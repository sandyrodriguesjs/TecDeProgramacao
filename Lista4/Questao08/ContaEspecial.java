package Questao08;

public class ContaEspecial extends ContaCorrente{
	
	private double limiteCredito;

	public ContaEspecial(String numeroConta, double limiteCredito) {
		super(numeroConta);
		this.limiteCredito = limiteCredito;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}
	
	public void sacar(double valor) {
        double saldoDisponivel = saldo + limiteCredito;
        if (valor <= saldoDisponivel) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
	}
        
	public String toString() {
		return "ContaEspecial [numeroConta=" + numeroConta + ", saldo=" + saldo + ", limiteCredito=" + limiteCredito
				+ "]";
	}

}
