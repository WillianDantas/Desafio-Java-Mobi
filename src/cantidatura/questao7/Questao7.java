package cantidatura.questao7;



public class Questao7 {
    public void Resultado(String TipoClasse){
    	int vaInicio = 0;
    	int vaFim = 0;
    	String vaLetra = TipoClasse.toUpperCase().replaceAll("\"", "");
    	String vaLetraA = "A";
    	String vaLetraB = "B";
    	String vaLetraC = "C";
    	if (vaLetra.intern() == vaLetraA.intern()){
        	A vaA = new A();
        	vaInicio = vaA.implementeMe().length() -1;
        	vaFim = vaA.implementeMe().length();
        	System.out.println(vaA.implementeMe().substring(vaInicio, vaFim));;
    	}else if (vaLetra.intern() == vaLetraB.intern()){
    		B vaB = new B();
    		vaInicio = vaB.implementeMe().length() -1;
        	vaFim = vaB.implementeMe().length();
        	System.out.println(vaB.implementeMe().substring(vaInicio, vaFim));	
    	}else if (vaLetra.intern() == vaLetraC.intern()){
    		C vaC = new C();
    		vaInicio = vaC.implementeMe().length() -1;
        	vaFim = vaC.implementeMe().length();
        	System.out.println(vaC.implementeMe().substring(vaInicio, vaFim));
    	}else{
    		System.out.println("Não a letra correspondente");
    	}
    }
}
