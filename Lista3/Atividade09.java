package Lista3;

public class Atividade09 {

	public static int menorValor(int[] vetor, int k) {
	    int menorValor = vetor[0];
	    for (int i = 1; i < vetor.length; i++) {
	        if (vetor[i] < menorValor) {
	            menorValor = vetor[i];
	        }
	    }
	    return menorValor;
	}

	public static void main(String[] args) {
	    int[] vetor = {2, 3, 4, 5, 9};
	    int k = 2;
	    if (k > vetor.length || k < 1) {
	        System.out.println("O valor informado não corresponde a alguma posição presente no array");
	    } else {
	        int menorValor = menorValor(vetor, k);
	        System.out.println(menorValor);
	    }
	}

}
