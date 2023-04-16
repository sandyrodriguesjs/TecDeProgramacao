package Lista3;

import java.util.Arrays;

public class Atividade05 {

	public static int[] copia(int[] vetor) {
		
		int[] copia = new int [vetor.length];
		
		for (int i = 0; i < vetor.length; i++) {
			copia[i] = vetor[i];
		}
			return copia;
	}
	
	
	
	public static void main(String[] args) {
		int[] vetor = {1,2,6};
		
		int[] copia = copia(vetor);
		System.out.println("vetor original: " + Arrays.toString(vetor));
		System.out.println("cópia do vetor: " + Arrays.toString(copia));
	}

}
