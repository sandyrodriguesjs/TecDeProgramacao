package Lista3;

public class Atividade07 {

	
public static boolean vetorOrdenado(int[] vetor) {
		
    	for (int i = 0; i < vetor.length - 1; i++) {
    		if (vetor[i] > vetor[i + 1]) {
    			return false;
    		}
    	}
    		return true;
}

	public static void main(String[] args) {
		
		int[] vetor = { 1, 2, 3, 4, 5 };
	    boolean ordenado = vetorOrdenado(vetor);
	    if (ordenado) {
	        System.out.println(true);
	    } else {
	    	System.out.println(false);
	    }
}
}
