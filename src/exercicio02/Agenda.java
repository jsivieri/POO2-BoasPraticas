package exercicio02;

import java.util.ArrayList;

public class Agenda {

	private String nome, telefone, email;
	
	ArrayList<String> contatos = new ArrayList<String>();



	protected Agenda() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected String getTelefone() {
		return telefone;
	}

	protected void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}
	
	// ----------------

	
	protected void adicionarContato(String nome, String telefone, String email) {
		contatos.add(nome+" "+telefone+" "+email);
		
	}
	
	protected void excluirContato(String nome) {
		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).contains(nome)) {
				contatos.remove(i);
				
			} else {
				System.out.println("Nome não encontrado");
			}
			
			
		}
		
	}
	
	protected void buscarContato(String nome) {
		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).contains(nome)) {
				System.out.println(contatos.get(i));
				
			} else {
								
			}
			
			
		}
		
	}
	
	protected void atualizarContato(String nome, String novoNome, String novoTelefone, String novoEmail) {
		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).contains(nome)) {
				contatos.set(i, novoNome+" "+novoTelefone+" "+novoEmail);
				}
			
			
		}
		
	}
	
	protected void exibirContatos() {
		System.out.println(contatos);
	}
	
}
