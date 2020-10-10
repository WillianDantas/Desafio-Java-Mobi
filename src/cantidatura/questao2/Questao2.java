package cantidatura.questao2;

import java.util.ArrayList;
import java.util.Random;


public class Questao2 implements IQuestao2{
	private final Integer _DIVISOR_PAR = 2;
    private final Integer _LIMITEMIN = 1;
    private final Integer _LIMITEMAX = 100;
    private final Integer _RLIMITEMIN = 1;
    private final Integer _RLIMITEMAX = 10;
    
    private ArrayList<Integer> vaListaNumero;
	@Override
	public ArrayList<Integer> Numero() {
		Random gerador = new Random();
		int R = gerador.nextInt(10);
		int S = gerador.nextInt(100);	
		vaListaNumero = new ArrayList<Integer>();
		if (S <= this._LIMITEMIN && S >= this._LIMITEMAX ){
			System.out.println("Número digitado S tem que ser => 1 ou <= 100");
			return vaListaNumero = null;
		}
		if (R <= this._RLIMITEMIN && R >= this._RLIMITEMAX ){
			System.out.println("Número digitado R tem que ser => 1 ou <= 10");
			return vaListaNumero = null;
		}
	    for(int vaCount = 1; vaCount <= S; vaCount++ ){
	    	if((S % vaCount) ==  0){
	    		if (vaCount == (R * 2)){
		    		vaListaNumero = null;
		    		System.out.println("Multiplo do doblo R encontrado!");
		    		break;
	    		}
	    	}
	    	if((vaCount % this._DIVISOR_PAR) == 0){
	    		vaListaNumero.add(vaCount);

	    	}
	    }
	    
	    return vaListaNumero;
	}
	@Override
	public void Imprimir(ArrayList<Integer> Lista) {
	    
	   if (Lista == null){
		   System.out.println("Não há Numeros para serem impressos!");
	   }else{
		   for (Integer vaNumero : Lista){
		      System.out.println(vaNumero);
		   }
	   }
	}
	

}
