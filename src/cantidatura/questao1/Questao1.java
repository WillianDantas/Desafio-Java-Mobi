package cantidatura.questao1;

import java.util.ArrayList;
import java.util.Random;

public class Questao1 implements IQuestao1{
    private final Integer _DIVISOR_PAR = 2;
	private final Integer _DIVISOR = 5;
    private final Integer _LIMITEMIN = 1;
    private final Integer _LIMITEMAX = 100;
    
    private ArrayList<Integer> vaListaNumero;
	@Override
	public ArrayList<Integer> Numero() {
		Random gerador = new Random();
		int R = gerador.nextInt(100);
		vaListaNumero = new ArrayList<Integer>();
		if (R <= this._LIMITEMIN && R >= this._LIMITEMAX ){
			System.out.println("Número digitado tem que ser => 1 ou <= 100");
			return vaListaNumero = null;
		}
	    for(int vaCount = 1; vaCount <= R; vaCount++ ){
	    	if((vaCount % this._DIVISOR_PAR) == 0){
	    		if ((vaCount % this._DIVISOR) > 0){
	    			vaListaNumero.add(vaCount);
	    		}
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
