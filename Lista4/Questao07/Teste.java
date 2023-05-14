package Questao07;

public class Teste {

	public static void main(String[] args) {
		
		 Empregado empregado = new Empregado();
	     empregado.setNome("João");
	     empregado.setSalario(2500.0);
	     System.out.println(empregado.toString());

	        // Criando um objeto da classe Gerente
	     Gerente gerente = new Gerente("Maria", 5000.0, "RH");
	     System.out.println(gerente.toString());

	        // Criando um objeto da classe Vendedor
	     Vendedor vendedor = new Vendedor("Pedro", 3000.0, 10);
	     System.out.println(vendedor.toString());
	    }

	}

