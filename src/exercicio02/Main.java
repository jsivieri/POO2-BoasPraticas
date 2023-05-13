package exercicio02;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Agenda agenda1 = new Agenda();
		agenda1.adicionarContato("Joao","242424","joao@gmail.com");
		agenda1.adicionarContato("Laura","9879q90w","laura@gmail.com");
		
		agenda1.exibirContatos();
		
		agenda1.excluirContato("Laura");
		
		agenda1.exibirContatos();
		
		agenda1.buscarContato("Joao");
		
		agenda1.atualizarContato("Joao","Pedro","(34) 99876-4545","pedro@hotmail.com");
		
		agenda1.exibirContatos();
		
		

	}

}
