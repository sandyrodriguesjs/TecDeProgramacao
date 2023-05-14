package Questao14;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);

        LocalDate dataAtual = LocalDate.now();
        int diaAtual = dataAtual.getDayOfMonth();
        int mesAtual = dataAtual.getMonthValue();
        int anoAtual = dataAtual.getYear();

        einstein.calculaIdade(diaAtual, mesAtual, anoAtual);
        newton.calculaIdade(diaAtual, mesAtual, anoAtual);

        System.out.println("Idade de Einstein: " + einstein.informaIdade());
        System.out.println("Idade de Newton: " + newton.informaIdade());
}
}
