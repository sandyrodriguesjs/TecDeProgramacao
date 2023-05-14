package Questao08;

public class ContaCorrente {

	public String numeroConta;
    public double saldo;

    public ContaCorrente(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }
    
    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }
    
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public String toString() {
        return "ContaCorrente [numeroConta =" + numeroConta + ", saldo =" + saldo + "]";
    }
}
