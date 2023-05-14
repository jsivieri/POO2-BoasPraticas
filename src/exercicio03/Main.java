package exercicio03;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Restaurante restaurante = new Restaurante();
		restaurante.adicionarPedido(75.0);
		restaurante.adicionarPedido(67.0);
		restaurante.adicionarPedido(78.0);
		restaurante.adicionarPedido(89.0);
		restaurante.adicionarPedido(125.0);
		restaurante.adicionarPedido(56.0);
		
		restaurante.calcularValorPedido();
		
		restaurante.adicionarMenu("Porção de batata");
		restaurante.adicionarMenu("Coca cola em lata");
		restaurante.adicionarMenu("Espetinho de queijo");
		restaurante.adicionarMenu("Caipirinha");
		restaurante.adicionarMenu("Cerveja 600ml");
		restaurante.adicionarMenu("Suco de laranja");
		
		restaurante.exibirMenu();

	}

}
