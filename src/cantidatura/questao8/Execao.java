package cantidatura.questao8;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Execao {
	public void LancaChecada() throws ChecadaExeption {
		Calendar dia = new GregorianCalendar();
		int vaDia = dia.get(Calendar.DAY_OF_MONTH);
			if((vaDia % 2) > 0){
				throw new ChecadaExeption("Número é ímpar");
			}
			
	}
	
	public void propagaCheca() throws ChecadaExeption{
		LancaChecada();
	}
	
	public void trataCheca(){
		try{
			propagaCheca();
		}catch(ChecadaExeption e){
			System.out.println(e.getMessage());
			
		}
	}
	 
}


