package Lista3;

public class Atividade08 {

	public static int maiorValor(int[] vetor, int k) {
	    int maiorValor = vetor[0];
	    for (int i = 1; i < vetor.length; i++) {
	        if (vetor[i] > maiorValor) {
	            maiorValor = vetor[i];
	        }
	    }
	    return maiorValor;
	}

	public static void main(String[] args) {
	    int[] vetor = {2, 3, 4, 5, 9};
	    int k = 2;
	    if (k > vetor.length || k < 1) {
	        System.out.println("O valor informado não corresponde a alguma posição presente no array");
	    } else {
	        int maiorValor = maiorValor(vetor, k);
	        System.out.println(maiorValor);
	    }
	}


}
