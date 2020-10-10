package cantidatura.questao9;

public class Questao9 {
	
	public void Executar(){
	  ControllerPessoa	vaControllerPessoa =  new ControllerPessoa();
	  
	  vaControllerPessoa.AdicionarListaPessoa();
	  
	  System.out.println("Listar Pessoas Cadastradas:");
	  System.out.println(" ");
	  
	  vaControllerPessoa.ListaPessoa();
	  
	  System.out.println("Deletar Pessoa(s) com 27 anos:");
	  System.out.println(" ");	
	  
	  vaControllerPessoa.RemoverListaPessoa();
	  
	  System.out.println(" ");
	  System.out.println("Nova Lista:");
	  System.out.println(" ");
	  
	  vaControllerPessoa.ListaPessoa();
	  

	  vaControllerPessoa.AdicionarListaPessoa2();
	  
	  System.out.println(" ");
	  System.out.println("Lista Pessoas Cadastradas 2:");
	  System.out.println(" ");
	  
	  vaControllerPessoa.ListaPessoa2();
	  vaControllerPessoa.ListaDistinta();
	  
	  
	  System.out.println(" ");
	  System.out.println("Lista Distinta:");
	  System.out.println(" ");
	  
	  vaControllerPessoa.ListaPessoa3();
	  
	  
	  System.out.println(" ");
	  System.out.println("Imprimir pessoa com id = 5:");
	  System.out.println(" ");
	  
	  Pessoa vaPessoa;
	  vaPessoa = vaControllerPessoa.CachePessoa(5);
	  System.out.println("Id: "+ vaPessoa.getId() +" Nome: " + vaPessoa.getNome()+ " Idade: " + vaPessoa.getIdade());  
	  vaPessoa = vaControllerPessoa.CachePessoa(5);
	  System.out.println("Id: "+ vaPessoa.getId() +" Nome: " + vaPessoa.getNome()+ " Idade: " + vaPessoa.getIdade());  
	  
	  
	  
	  
	  
	  
	  
	  
	}

}
