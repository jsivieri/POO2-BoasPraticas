package exercicio04;

import java.util.ArrayList;

public class LojaVirtual {

	private String nome, endereco;
	ArrayList<String> catalogo = new ArrayList<String>();
	ArrayList<String> vendas = new ArrayList<String>();

		
	protected LojaVirtual() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

	protected String getNome() {
		return nome;
	}



	protected void setNome(String nome) {
		this.nome = nome;
	}



	protected String getEndereco() {
		return endereco;
	}



	protected void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	protected ArrayList<String> getCatalogo() {
		return catalogo;
	}



	protected void setCatalogo(ArrayList<String> catalogo) {
		this.catalogo = catalogo;
	}



	protected ArrayList<String> getVendas() {
		return vendas;
	}



	 void setVendas(ArrayList<String> vendas) {
		this.vendas = vendas;
	}



	 protected void adicionarProdutos(String produto) {
		catalogo.add(produto);
		
	}
	
	 protected void registrarVenda(String venda) {
		vendas.add(venda);
		
	}
	
	protected void listarCatalogo() {
		for (int i = 0; i < catalogo.size(); i++) {
			System.out.println("Item "+(i+1)+" "+catalogo.get(i));
		}
	}
	
	protected void listarVendas() {
		for (int i = 0; i < vendas.size(); i++) {
			System.out.println(vendas.get(i));
		}
	}
	
	
	
}
