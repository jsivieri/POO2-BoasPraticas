package exercicio01;

import java.util.ArrayList;

public class ContaBancaria {

	private int conta;
	private double saldo;

	ArrayList<String> historico = new ArrayList<String>();

	protected ContaBancaria(int conta, double saldo) {
		super();
		this.conta = conta;
		this.saldo = saldo;

	}

	protected int getConta() {
		return conta;
	}

	protected void setConta(int conta) {
		this.conta = conta;
	}

	protected double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	protected ArrayList<String> getHistorico() {
		return historico;
	}

	protected void setHistorico(ArrayList<String> historico) {
		this.historico = historico;
	}

	// ----------------

	protected void depositar(double deposito) {
		setSaldo(getSaldo() + deposito);
		historico.add("Depósito de: R$ " + deposito);

	}

	protected void sacar(double saque) {
		if (saque <= getSaldo()) {
			setSaldo(getSaldo() - saque);
			historico.add("Saque de: R$ " + saque);

		} else {
			System.out.println("Saldo insuficiente");
			historico.add("Tentativa de saque frustrada. Saldo atual: R$" + getSaldo());
		}
	}

	protected void exibirSaldo() {
		System.out.println("Saldo atual: R$ " + getSaldo());

	}

	protected void exibirHistorico() {
		System.out.println(historico);
	}

}
