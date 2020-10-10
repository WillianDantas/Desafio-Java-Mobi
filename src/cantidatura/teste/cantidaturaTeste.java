package cantidatura.teste;
import java.util.ArrayList;

import cantidatura.questao1.Questao1;
import cantidatura.questao2.Questao2;
import cantidatura.questao3.Questao3;
import cantidatura.questao4.Questao4;
import cantidatura.questao5.Questao5;
import cantidatura.questao6.Questao6;
import cantidatura.questao7.Questao7;
import cantidatura.questao8.Questao8;
import cantidatura.questao9.Questao9;


public class cantidaturaTeste {

	public static void main(String[] args){
	    Questao1 vaQuestao1 = new Questao1();
	    Questao2 vaQuestao2 = new Questao2();
	    Questao3 vaQuestao3 = new Questao3();
	    Questao4 vaQuestao4 = new Questao4();
	    Questao5 vaQuestao5 = new Questao5();
	    Questao6 vaQuestao6 = new Questao6();
	    Questao6 vaEstender = new Questao6();
	    Questao7 vaQuestao7 = new Questao7();
	    Questao8 vaQuestao8 = new Questao8();
	    Questao9 vaQuestao9 = new Questao9();
	    
	    
	    
	    
	    
	    System.out.println(" ");
	    System.out.println("Questão 1");
	    ArrayList<Integer> vaLista1 = vaQuestao1.Numero();
	    vaQuestao1.Imprimir(vaLista1); 
	   
	    System.out.println(" ");
	    System.out.println("Questão 2");
	    
	    ArrayList<Integer> vaLista2 = vaQuestao2.Numero();
	    vaQuestao2.Imprimir(vaLista2);
	    
	    System.out.println(" ");
	    System.out.println("Questão 3");
	    
	    ArrayList<Integer> vaLista3 = vaQuestao3.Numero();
	    vaQuestao3.Imprimir(vaLista3);
	    
	    System.out.println(" ");
	    System.out.println("Questão 4");
	    
	    vaQuestao4.qualDiaMes();
	    
	    System.out.println(" ");
	    System.out.println("Questão 5");
	    System.out.println("Ave");
	    vaQuestao5.ave();
	    System.out.println(" ");
	    System.out.println("Questão 5");
	    System.out.println("Mamifero");
	    vaQuestao5.mamifero();
	    
	    System.out.println(" ");
	    System.out.println("Questão 6");
	    
	    vaQuestao6.meEstenda();
	    vaEstender.meEstenda();
	    vaEstender.Resposta();
	    
	    System.out.println(" ");
	    System.out.println("Questão 7");
	    vaQuestao7.Resultado("a");
	    
	    System.out.println(" ");
	    System.out.println("Questão 8");
	    vaQuestao8.resposta();
	    
	    
	    System.out.println(" ");
	    System.out.println("Questão 9");
	    vaQuestao9.Executar();
	    

	}

}
