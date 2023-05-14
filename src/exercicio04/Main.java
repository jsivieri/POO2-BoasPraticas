package exercicio04;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		LojaVirtual loja = cliente;

		
		cliente.inserirCarrinho(1200.0);
		cliente.inserirCarrinho(800.0);
		cliente.inserirCarrinho(300.0);
		cliente.inserirCarrinho(700.0);
		cliente.inserirCarrinho(1000.0);
		
		cliente.finalizarCompra();
		
		loja.adicionarProdutos("Geladeira");
		loja.adicionarProdutos("Fogao");
		loja.adicionarProdutos("Microondas");
		
		loja.registrarVenda("venda1");
		loja.registrarVenda("venda2");
		loja.registrarVenda("venda3");
		
		loja.listarCatalogo();
		loja.listarVendas();
		
	}

}
