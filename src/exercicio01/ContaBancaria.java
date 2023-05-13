package exercicio01;

import java.util.ArrayList;

public class ContaBancaria {

	private int conta;
	private double saldo;

	ArrayList<String> historico = new ArrayList<String>();

	public ContaBancaria(int conta, double saldo) {
		super();
		this.conta = conta;
		this.saldo = saldo;

	}
	
	

	public int getConta() {
		return conta;
	}



	public void setConta(int conta) {
		this.conta = conta;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public ArrayList<String> getHistorico() {
		return historico;
	}



	public void setHistorico(ArrayList<String> historico) {
		this.historico = historico;
	}



	public void depositar(double deposito) {
		setSaldo(getSaldo()+deposito);	
		historico.add("Depósito de: R$ "+deposito);
		 
		}

	public void sacar(double saque) {
		if (saque <= getSaldo()) {
			setSaldo(getSaldo()-saque);
			historico.add("Saque de: R$ "+saque);
			
		} else {
			System.out.println("Saldo insuficiente");
			historico.add("Tentativa de saque frustrada. Saldo atual: R$"+getSaldo());
		}
	}

	public void exibirSaldo() {
		System.out.println("Saldo atual: R$ "+getSaldo());

	}
	
	public void exibirHistorico() {
		System.out.println(historico);
	}

}
