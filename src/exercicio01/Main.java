package exercicio01;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


		ContaBancaria c1 = new ContaBancaria(3351,5000);
		ContaBancaria c2 = new ContaBancaria(2345,10000);
		
		c1.depositar(3000);
		c1.exibirSaldo();
		c1.sacar(300);
		c1.exibirSaldo();
		c1.exibirHistorico();
		
		c2.depositar(7000);
		c2.exibirSaldo();
		c2.sacar(50);
		c2.exibirSaldo();
		c2.exibirHistorico();
		
		
		
		
	}

}
