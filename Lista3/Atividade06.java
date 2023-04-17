package Lista3;

import java.util.Arrays;

public class Atividade06 {
	
	public static int[] vetorOrdenado(int[] vetor) {
		
		int[] vetorOrdenado = new int [vetor.length];
		for(int i = 0; i < vetor.length; i++) {
			vetorOrdenado[i] = vetor[i];
		}
		
		for (int i = 0; i < vetorOrdenado.length - 1; i++) {
			for(int j = i + 1; j < vetorOrdenado.length; j++) {
				if(vetorOrdenado[i] > vetorOrdenado[j]) {
					int count = vetorOrdenado[i];
					vetorOrdenado[i] = vetorOrdenado[j];
					vetorOrdenado[j] = count;
				}	
			}
		}
		return vetorOrdenado;
	}

	public static void main(String[] args) {
		int[] vetor = {8,6,4,2};

		int[] arrayOrdenado = vetorOrdenado(vetor);
		System.out.println(Arrays.toString(arrayOrdenado));
	}

}
