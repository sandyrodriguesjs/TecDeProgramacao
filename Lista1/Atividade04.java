package Lista1;

public class Atividade04 {

	public static void main(String[] args) {
        int a = 5, b= 5, soma;
        soma = a+b;
        
        if (a > 10 || soma == 20) {
            System.out.println("Numero Valido");
        }else if (a == b) {
            System.out.println("A eh igual B");
            System.out.println("A e B sao diferentes de 10");
            System.out.println("A eh menor que 10");
        } else {
            System.out.println("Numero nao valido");
        }
	}

}
