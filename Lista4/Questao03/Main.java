package Questao03;

public class Main {

	public static void main(String[] args) {
		
		Fatura fatura = new Fatura(21,"mouse",11,10);
		
		if(fatura.quantidade<0) {
			fatura.quantidade = 0;
		}
		
		if (fatura.precoUnitario<0) {
			fatura.precoUnitario = 0.0;
		}
		
		System.out.println("Id:" + fatura.getNumeroItem());
		System.out.println("Descrição:" + fatura.getDescricao());
		System.out.println("Quantidade:" + fatura.getQuantidade());
		System.out.println("Preço:" + fatura.getPrecoUnitario());
		
		
		System.out.println("Preço da fatura:" + fatura.getValorFatura(fatura.quantidade, fatura.precoUnitario));
		
	}

}
