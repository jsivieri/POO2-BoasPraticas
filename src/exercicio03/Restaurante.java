package exercicio03;

import java.util.ArrayList;

public class Restaurante {

		
	private String nome,endereco;
	
	
	
	public Restaurante(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;

	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	ArrayList<String> menu = new ArrayList<String>();
	ArrayList<String> listaPedidos = new ArrayList<String>();
	
	public void adicionarPedido(int quantidade, String item) {
		listaPedido.add();
		
	}
	
	public void adicionarMenu() {
		
	}

}
