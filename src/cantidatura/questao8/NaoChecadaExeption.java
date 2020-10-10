package cantidatura.questao8;



public  class NaoChecadaExeption extends RuntimeException {

	private static final long serialVersionUID = 1149241039409861994L;
    
	public  NaoChecadaExeption(String msg){
		super(msg);
	}
	
	 public NaoChecadaExeption(String msg, Throwable cause){
	        super(msg, cause);
	 }
}
