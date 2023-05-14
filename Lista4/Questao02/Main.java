package Questao02;

public class Main {

	public static void main(String[] args) {
	
		Empregado empregado1 = new Empregado("João", "Silva", 1.212);
		
		System.out.println("Salário anual do empregado: " + empregado1.getSalarioAnual());
		empregado1.setSalarioMensal(empregado1.getSalarioMensal() * 1.1);
		System.out.println("Salário anual do empregado após aumento: " + empregado1.getSalarioAnual());
}
}
