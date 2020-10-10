package cantidatura.questao3;

import java.util.ArrayList;
import java.util.Random;


public class Questao3 implements IQuestao3{
    private final Integer _LIMITEMIN = 1;
    private final Integer _LIMITEMAX = 1000;
    private final Integer _RLIMITEMIN = 1;
    private final Integer _RLIMITEMAX = 10;
    
    private ArrayList<Integer> vaListaNumero;
	@Override
	public ArrayList<Integer> Numero() {
		Random gerador = new Random();
		int R = gerador.nextInt(10);
		int S = gerador.nextInt(1000);
		int vaSoma = 0; 
		vaListaNumero = new ArrayList<Integer>();
		if (S <= this._LIMITEMIN && S >= this._LIMITEMAX ){
			System.out.println("Número digitado S tem que ser => 1 ou <= 1000");
			return vaListaNumero = null;
		}
		if (R <= this._RLIMITEMIN && R >= this._RLIMITEMAX ){
			System.out.println("Número digitado R tem que ser => 1 ou <= 10");
			return vaListaNumero = null;
		}
	    for(int vaCount = 1; vaCount <= S; vaCount++ ){
	    	if((R % vaCount) ==  0){
	           vaSoma =  vaSoma + vaCount;
	           vaListaNumero.add(vaSoma);
	    	}    
	    }
	    
	    return vaListaNumero;
	}
	@Override
	public void Imprimir(ArrayList<Integer> Lista) {
	   int vaTotal = 0; 
	   for (int vaNumero : Lista){
	      vaTotal = vaTotal + vaNumero;
	   }
       System.out.println(vaTotal);
	}    

}
