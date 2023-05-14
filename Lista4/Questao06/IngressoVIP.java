package Questao06;

public class IngressoVIP extends Ingresso {

	private double adicional;
	
	public IngressoVIP(double valor, double adicional){
		super(valor);
		this.adicional = adicional;
	}
	
	public double getAdicional() {
		return adicional;
	}
	
	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	public String toString() {
        return "Valor do Ingresso VIP: R$" + (getValor() + adicional);
    }
}
