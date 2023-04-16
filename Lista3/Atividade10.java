package Lista3;

public class Atividade10 {
	
	public static boolean iguais(int[] vetor1, int[] vetor2) {
	    if (vetor1.length != vetor2.length) {
	        return false;
	    }
	    for (int i = 0; i < vetor1.length; i++) {
	        if (vetor1[i] != vetor2[i]) {
	            return false;
	        }
	    }
	    return true;
	}
	public static void main(String[] args) {
		 int[] vetor1 = { 2, 4, 6, 8, 10};
		 int[] vetor2 = { 1, 3, 5, 7, 11};
		 
		 boolean iguais = iguais(vetor1, vetor2);
		    if (iguais) {
		        System.out.println("Os vetores são iguais");
		    } else {
		        System.out.println("Os vetores são diferentes");
		    }
	}

}
