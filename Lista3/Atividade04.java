package Lista3;

public class Atividade04 {

	public static int contarElemento(int[] vetor1, int[] vetor2, int elemento) {
	    int contador = 0;
	    
	    for (int i = 0; i < vetor1.length; i++) {
	        if (vetor1[i] == elemento) {
	            contador++;
	        }
	    }
	    
	    for (int i = 0; i < vetor2.length; i++) {
	        if (vetor2[i] == elemento) {
	            contador++;
	        }
	    }
	    
	    return contador;
	}

	public static void main(String[] args) {
		int[] vetor1 = {1, 2, 3, 4, 5};
		int[] vetor2 = {3, 4, 5, 6, 7};
		int elemento = 3;

		int quantidade = contarElemento(vetor1, vetor2, elemento);
		System.out.println("O elemento " + elemento + " aparece " + quantidade + " vezes nos vetores.");
}
	}