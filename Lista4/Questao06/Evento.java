package Questao06;

import java.util.List;
import java.util.ArrayList;

public class Evento {

	private List<Ingresso> ingressos;
	
	Ingresso ingresso = new Ingresso();
	public double venda;

    public Evento() {
        ingressos = new ArrayList<>();
    }

    public void adicionarIngresso(Ingresso ingresso) {
        ingressos.add(ingresso);
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    
	public double venda(Ingresso ingresso) {
		double valor = ingresso.valor;
    	venda += valor;
    	
    	return venda;
	}

}
