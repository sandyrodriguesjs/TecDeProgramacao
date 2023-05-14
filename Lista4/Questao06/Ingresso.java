package Questao06;

public class Ingresso {

	public double valor;


    public Ingresso(double valor) {
        this.valor = valor;
    }

    public Ingresso() {
		// TODO Auto-generated constructor stub
	}

	public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toString() {
        return "Valor do ingresso: R$" + valor;
    }

    public void venderIngresso(int indice) {

        if (indice < 0 || indice >= ingressos.size()) {
            System.out.println("Índice inválido.");
            return;
        }

        Ingresso ingresso = ingressos.get(indice);

        if (ingresso.isVendido()) {
            System.out.println("Ingresso já vendido.");
            return;
        }

        ingresso.setVendido(true);

        System.out.println("Ingresso vendido com sucesso.");
    }

    
   

	
}
