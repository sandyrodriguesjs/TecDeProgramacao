package Questao10_11_12;

public class Main {

	public static void main(String[] args) {

		Empregado empregado = new Empregado("João", 15, 5, 1990, 123, 5000.0, 10.0);
        Operario operario = new Operario("Rita", 15, 8, 1995, 2, 1500, 5, 5000, 2);
        Vendedor vendedor = new Vendedor("Mikael", 20, 3, 1992, 3, 1800, 8, 10000, 3);

        System.out.println("Dados do empregado:");
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Data de Nascimento: " + empregado.getDataNascimento());
        System.out.println("Código Setor: " + empregado.getCodigoSetor());
        System.out.println("Salário Base: " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto());
        System.out.println("Salário Líquido: " + empregado.calcularSalario());

        System.out.println();

        System.out.println("Dados do operário:");
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Data de Nascimento: " + operario.getDataNascimento());
        System.out.println("Código Setor: " + operario.getCodigoSetor());
        System.out.println("Salário Base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto());
        System.out.println("Valor de Produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao());
        System.out.println("Salário Líquido: " + operario.calcularSalario());

        System.out.println();

        System.out.println("Dados do vendedor:");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Data de Nascimento: " + vendedor.getDataNascimento());
        System.out.println("Código Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto());
        System.out.println("Valor de Vendas: " + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao());
        System.out.println("Salário Líquido: " + vendedor.calcularSalario());
    }
}
