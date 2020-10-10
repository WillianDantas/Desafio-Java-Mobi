package cantidatura.questao4;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Questao4 implements IQuestao4{

	private String diasMes(int mes)  {
		String vaTexto = null;
		switch (mes){
		 case 31:
		    vaTexto = "Mês com 31 dias";
		    break;
		 case 30:
		 	vaTexto = "Mês com 30 dias";
		 	break;
		 default:
		 	vaTexto = "Mês com menos de 30 dias";
		 	break;
		 
		}
		
		
		return vaTexto;
	}

	public final void qualDiaMes() {
		 Random gerador = new Random();
		 int vaMes = gerador.nextInt(12);
		 
		 Calendar datas = new GregorianCalendar();
		 datas.set(Calendar.MONTH, vaMes - 1 );
		 int vaQuantidadesDias = datas.getActualMaximum(Calendar.DAY_OF_MONTH);
		 System.out.println(diasMes(vaQuantidadesDias));
	}
  

	 

}
