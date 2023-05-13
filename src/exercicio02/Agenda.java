package exercicio02;

import java.util.ArrayList;

public class Agenda {

	private String nome, telefone, email;
	
	ArrayList<String> contatos = new ArrayList<String>();



	public Agenda() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public void adicionarContato(String nome, String telefone, String email) {
		contatos.add(nome+" "+telefone+" "+email);
		
	}
	
	public void excluirContato(String nome) {
		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).contains(nome)) {
				contatos.remove(i);
				
			} else {
				System.out.println("Nome não encontrado");
			}
			
			
		}
		
	}
	
	public void buscarContato(String nome) {
		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).contains(nome)) {
				System.out.println(contatos.get(i));
				
			} else {
								
			}
			
			
		}
		
	}
	
	public void atualizarContato(String nome, String novoNome, String novoTelefone, String novoEmail) {
		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).contains(nome)) {
				contatos.set(i, novoNome+" "+novoTelefone+" "+novoEmail);
				}
			
			
		}
		
	}
	
	public void exibirContatos() {
		System.out.println(contatos);
	}
	
}
