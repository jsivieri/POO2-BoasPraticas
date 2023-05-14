package exercicio04;

import java.util.ArrayList;


public class Cliente extends LojaVirtual{
	
	


	private String produto;
	private double valor, total;

	
	ArrayList<Double> carrinho = new ArrayList<Double>();
	ArrayList<String> historico = new ArrayList<String>();
	
	

	protected String getProduto() {
		return produto;
	}



	protected void setProduto(String produto) {
		this.produto = produto;
	}



	protected double getValor() {
		return valor;
	}



	protected void setValor(double valor) {
		this.valor = valor;
	}



	protected ArrayList<Double> getCarrinho() {
		return carrinho;
	}



	protected void setCarrinho(ArrayList<Double> carrinho) {
		this.carrinho = carrinho;
	}



	protected ArrayList<String> getHistorico() {
		return historico;
	}



	protected void setHistorico(ArrayList<String> historico) {
		this.historico = historico;
	}


	protected Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	// ------------------
	
	protected void inserirCarrinho(Double valor) {
		carrinho.add(valor);
	}
	
	protected void finalizarCompra() {
		
		for (int i = 0; i < carrinho.size(); i++) {
			total += carrinho.get(i);
	}
		System.out.println("Valor total da compra: "+total);

}
}
