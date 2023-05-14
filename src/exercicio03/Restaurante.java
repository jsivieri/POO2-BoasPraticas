package exercicio03;

import java.util.ArrayList;

public class Restaurante {

	private String nome, endereco, itemMenu;
	private double valorPedido, total;

	ArrayList<String> menu = new ArrayList<String>();
	ArrayList<Double> listaPedidos = new ArrayList<Double>();

	protected Restaurante() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected double getTotal() {
		return total;
	}

	protected void setTotal(double total) {
		this.total = total;
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

	protected String getItemMenu() {
		return itemMenu;
	}

	protected void setItemMenu(String itemMenu) {
		this.itemMenu = itemMenu;
	}

	protected double getValorPedido() {
		return valorPedido;
	}

	protected void setValorPedido(double valorPedido) {
		this.valorPedido = valorPedido;
	}

	protected ArrayList<String> getMenu() {
		return menu;
	}

	protected void setMenu(ArrayList<String> menu) {
		this.menu = menu;
	}

	protected ArrayList<Double> getListaPedidos() {
		return listaPedidos;
	}

	protected void setListaPedidos(ArrayList<Double> listaPedidos) {
		this.listaPedidos = listaPedidos;
	}

	// ----------------

	protected void adicionarPedido(Double valorPedido) {
		listaPedidos.add(valorPedido);

	}

	protected void adicionarMenu(String itemMenu) {
		menu.add(itemMenu);
	}

	protected void calcularValorPedido() {
		for (int i = 0; i < listaPedidos.size(); i++) {
			total += listaPedidos.get(i);

		}
		System.out.println("Valor total dos "+listaPedidos.size()+" pedidos: R$ " + total);
	}

	protected void exibirMenu() {
		for (int i = 0; i < menu.size(); i++) {
			System.out.println("Item "+(i+1)+" "+menu.get(i));
		}

	}

}
