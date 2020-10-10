package cantidatura.questao5;


public class Ave extends Animal {
	
	private void voar(){
		System.out.println("voar");
	}
	
	@Override
	protected void Comer(){
		System.out.println("alpiste");
	}
	
	public void ChamaAnimal(){
		Comer();
		dormir();
		voar();
	}
	
	


}
