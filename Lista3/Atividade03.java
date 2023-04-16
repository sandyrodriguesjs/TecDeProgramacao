package Lista3;

public class Atividade03 {
	
	/*public static int mediaPonderada(int[] vetorNota, int[] vetorPeso) {
		for (int i = 0; i < vetorNota.length; i++) {
			for(int j = 0; j < vetorPeso.length; j++) {
				
			}
		}
		
		return mediaPonderada;
	})*/
	
public static double calcularMediaPonderada(double[] notas, double[] pesos) {
	    double somaNotasPesos = 0;
	    double somaPesos = 0;
	    for (int i = 0; i < notas.length; i++) {
	        somaNotasPesos += notas[i] * pesos[i];
	        somaPesos += pesos[i];
	    }
	    return somaNotasPesos / somaPesos;
	}


	public static void main(String[] args) {
		    double[] notas = {7.5, 8.0, 9.5};
		    double[] pesos = {2.0, 3.0, 1.0};
		    double mediaPonderada = calcularMediaPonderada(notas, pesos);
		    System.out.println("Média ponderada: " + mediaPonderada);
		}

	}


