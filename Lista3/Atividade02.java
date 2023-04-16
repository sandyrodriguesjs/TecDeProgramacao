package Lista3;

public class Atividade02 {
	
	public static int mediaUm(int[] vetorUm) {
		int soma = 0, mediaUm = 0;
		for (int i=0; i < vetorUm.length; i++) {
			soma += vetorUm[i];
			
			 mediaUm = soma / vetorUm.length;
		}
		
		System.out.println("A média do primeiro vetor eh: " + mediaUm);
		
		return mediaUm;
		
	}
	
	public static int mediaDois(int[] vetorDois) {
		int soma = 0, mediaDois = 0;
		 for (int i=0; i < vetorDois.length; i++) {
				soma += vetorDois[i];
				
				 mediaDois = soma / vetorDois.length;
			}
		 System.out.println("A média do segundo vetor eh: " + mediaDois);
		 
		 return mediaDois;
	}

	public static void main(String[] args) {
		int[] vetorUm = {2,4};
		int[] vetorDois = {6,8};
		
		 mediaUm(vetorUm);
		 mediaDois(vetorDois);

	}

}
