package cantidatura.questao6;


public class Questao6 extends Estenda{
    
	public static int vaValorParaTodas = 0;
	private final int _VALORMAXIMO = 3;
	public String vaTxt  = null;
	
	public void meEstenda() {
		vaValorParaTodas = vaValorParaTodas + 1;
		if (vaValorParaTodas == this._VALORMAXIMO){
		     this.vaTxt = "Chegou ao limite máximo";
		}else{
			this.vaTxt = "Valor :" + vaValorParaTodas;
		}
		
	}
	
	
	public void Resposta(){
		System.out.println(this.vaTxt);
	}
	
	
}
