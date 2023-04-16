package Lista3;

public class Atividade01 {
	
	public static int functionSomatorio(int[] vetSoma) {
		int soma = 0;
		for(int i = 2; i < vetSoma.length - 2 ;i++) {
			soma += vetSoma[i];
		}
		
		return soma;
	}
	
	public static void main(String[] args) {
		int[] vetSoma = {2,4,6,8,10,12,14,16,18};

		int somatorio = functionSomatorio(vetSoma);
		System.out.println(somatorio);
	}

}
