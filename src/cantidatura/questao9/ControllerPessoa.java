package cantidatura.questao9;

import java.util.ArrayList;

public class ControllerPessoa {
	
	public ArrayList<Pessoa> vaLista; 
	public ArrayList<Pessoa> vaLista2;
	public ArrayList<Pessoa> vaListaDistinta;
	private  Pessoa vaPessoa;
	private  Pessoa vaChachePessoa;
	public static int IdPessoa;
	public static int IdadePessoa;
	public static String NomePessoa;
	
	public void AdicionarListaPessoa(){
	     vaLista =  new ArrayList<Pessoa>();
	     Pessoa vaPessoa = new Pessoa();
	     vaPessoa.setId(1);
	     vaPessoa.setIdade(10);
	     vaPessoa.setNome("João");
	     vaLista.add(vaPessoa);
	     
	     vaPessoa = new Pessoa();
	     vaPessoa.setId(2);
	     vaPessoa.setIdade(5);
	     vaPessoa.setNome("Alice");
	     vaLista.add(vaPessoa);
	     
	     vaPessoa = new Pessoa();
	     vaPessoa.setId(3);
	     vaPessoa.setIdade(27);
	     vaPessoa.setNome("Fernando");
	     vaLista.add(vaPessoa);
	     
	     vaPessoa = new Pessoa();
	     vaPessoa.setId(4);
	     vaPessoa.setIdade(12);
	     vaPessoa.setNome("Carlos");
	     vaLista.add(vaPessoa);
	     
	     vaPessoa = new Pessoa();
	     vaPessoa.setId(5);
	     vaPessoa.setIdade(31);
	     vaPessoa.setNome("Priscila");
	     vaLista.add(vaPessoa);
		
	}
	
	
	public void RemoverListaPessoa(){
		Pessoa vaDeletePessoa = new Pessoa();
		vaDeletePessoa.setIdade(27);
		for(int i=0;i<vaLista.size();i++){
			if(vaLista.get(i).getIdade() == vaDeletePessoa.getIdade()){
				vaLista.remove(i);
			}
		}
		
	}
	
	
	public void ListaPessoa(){
		int vaMin;
		int vaId;
		int vaIdade;
		String vaNome;
		int vaIdAux;
		int vaIdadeAux;
		String vaNomeAux;
				
		for (int i=0;i<(vaLista.size() - 1);i++){
			vaMin = i;
			for(int b = i + 1;b<vaLista.size(); b++ ){
				if (vaLista.get(b).getIdade() < vaLista.get(vaMin).getIdade()){
                        vaMin = b;
				}
				
			}
		     
			if (vaLista.get(i).getIdade() != vaLista.get(vaMin).getIdade()){
				   
				    vaIdAux = vaLista.get(i).getId();
				    vaIdadeAux = vaLista.get(i).getIdade();
				    vaNomeAux = vaLista.get(i).getNome();
				    vaId = vaLista.get(vaMin).getId();
				    vaIdade = vaLista.get(vaMin).getIdade();
				    vaNome = vaLista.get(vaMin).getNome();
				    vaLista.get(i).setId(vaId);
				    vaLista.get(i).setIdade(vaIdade);
				    vaLista.get(i).setNome(vaNome);
				    vaLista.get(vaMin).setId(vaIdAux);
				    vaLista.get(vaMin).setIdade(vaIdadeAux);
				    vaLista.get(vaMin).setNome(vaNomeAux);
				
				
			}
		}
		
		for (Pessoa vaPessoa : vaLista){
			 System.out.println("Id: "+ vaPessoa.getId() +" Nome: " + vaPessoa.getNome()+ " Idade: " + vaPessoa.getIdade());  
		}
        		
	}
	
    
	public void AdicionarListaPessoa2(){
		vaLista2 =  new ArrayList<Pessoa>();
	     Pessoa vaPessoa = new Pessoa();
	     vaPessoa.setId(1);
	     vaPessoa.setIdade(8);
	     vaPessoa.setNome("Paulo");
	     vaLista2.add(vaPessoa);
	     
	     vaPessoa = new Pessoa();
	     vaPessoa.setId(2);
	     vaPessoa.setIdade(19);
	     vaPessoa.setNome("Silas");
	     vaLista2.add(vaPessoa);
	     
	     vaPessoa = new Pessoa();
	     vaPessoa.setId(3);
	     vaPessoa.setIdade(18);
	     vaPessoa.setNome("Paulo");
	     vaLista2.add(vaPessoa);
	     
	     vaPessoa = new Pessoa();
	     vaPessoa.setId(4);
	     vaPessoa.setIdade(25);
	     vaPessoa.setNome("Pedro");
	     vaLista2.add(vaPessoa);
	     
	     vaPessoa = new Pessoa();
	     vaPessoa.setId(5);
	     vaPessoa.setIdade(50);
	     vaPessoa.setNome("Paulo");
	     vaLista2.add(vaPessoa);
		
	}
	
	public void ListaPessoa2(){
		
		for (Pessoa vaPessoa : vaLista2){
			 System.out.println("Id: "+ vaPessoa.getId() +" Nome: " + vaPessoa.getNome()+ " Idade: " + vaPessoa.getIdade());  
		}
	}
	
	
	public void ListaDistinta(){
		vaListaDistinta = new ArrayList<Pessoa>();
		Pessoa vaPessoa = new Pessoa();
		vaPessoa.setId(vaLista2.get(0).getId());
		vaPessoa.setIdade(vaLista2.get(0).getIdade());
		vaPessoa.setNome(vaLista2.get(0).getNome());
		vaListaDistinta.add(vaPessoa);
		boolean vaDistinto = true;
		for(int i=0;i<vaLista2.size();i++){
			for(int b=0;b<vaListaDistinta.size();b++){
				if(vaLista2.get(i).getNome() == vaListaDistinta.get(b).getNome()){
					vaDistinto = false;
				}
			}
			
			if(vaDistinto){
				vaPessoa = new Pessoa();
				vaPessoa.setId(vaLista2.get(i).getId());
				vaPessoa.setIdade(vaLista2.get(i).getIdade());
				vaPessoa.setNome(vaLista2.get(i).getNome());
				vaListaDistinta.add(vaPessoa);
				
			}
			vaDistinto = true;
		}
	}
	
	public void ListaPessoa3(){
		
		for (Pessoa vaPessoa : vaListaDistinta){
			 System.out.println("Id: "+ vaPessoa.getId() +" Nome: " + vaPessoa.getNome()+ " Idade: " + vaPessoa.getIdade());  
		}
	}
	
	
	public Pessoa CachePessoa(int id){
		    int vaIndex = 0;
		    vaLista.clear();
		    vaPessoa = new Pessoa();
		    AdicionarListaPessoa();
		    if (IdPessoa > 0 ){
		    	vaPessoa.setId(IdPessoa);
		    	vaPessoa.setIdade(IdadePessoa);
		    	vaPessoa.setNome(NomePessoa);
		    	
		    }
		    
		    if(vaPessoa.getId() > 0 & vaPessoa.getId() == id){
		   		 return vaPessoa;
			}
		    
			
		
	         if (vaChachePessoa == null){
	        	 for (int i = 0; i< vaLista.size(); i++){
	        		 if (vaLista.get(i).getId() == id){
	        			 vaChachePessoa = vaLista.get(i);
	        			 vaIndex = i;
	        		 }
	        	 }
	        	 
	         }
	         
	         IdPessoa = vaLista.get(vaIndex).getId();
	         IdadePessoa = vaLista.get(vaIndex).getIdade();
	         NomePessoa = vaLista.get(vaIndex).getNome();
         
	         return vaChachePessoa; 
	}

}
