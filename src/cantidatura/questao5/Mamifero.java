package cantidatura.questao5;

public class Mamifero extends Animal{
	private void mamam(){
		System.out.println("mamar");
	}
	
	
	public void ChamaAnimal(){
		Comer();
		dormir();
		mamam();
	}
}
