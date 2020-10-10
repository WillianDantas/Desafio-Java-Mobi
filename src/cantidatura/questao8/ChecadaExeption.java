package cantidatura.questao8;



public  class ChecadaExeption extends Exception {

	private static final long serialVersionUID = 1149241039409861914L;
    
	public  ChecadaExeption(String msg){
		super(msg);
	}
	
	 public ChecadaExeption(String msg, Throwable cause){
	        super(msg, cause);
	 }
}
