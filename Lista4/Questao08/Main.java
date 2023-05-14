package Questao08;

public class Main {

	public static void main(String[] args) {
	
		ContaCorrente conta1 = new ContaCorrente("123");
        conta1.depositar(1000.0);
        conta1.sacar(500.0);
        System.out.println(conta1.toString());

        ContaEspecial conta2 = new ContaEspecial("456", 1000.0);
        conta2.depositar(2000.0);
        conta2.sacar(3000.0);
        System.out.println(conta2.toString());
    }
}
