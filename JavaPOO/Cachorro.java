package JavaPOO;

public class Cachorro extends Animal {
	public Cachorro() {
		
		}
	@Override
	public void Nome(String nomeAnimal) {
		System.out.println("Nome do cachorro: " + nomeAnimal);
	}
	
	@Override
	public void Idade(int idadeAnimal) {
		System.out.println("Idade: " + idadeAnimal);
	}
	
	@Override
	public void Som(String somAnimal) {
		System.out.println("Som que o cachorro emite: " + somAnimal);
	}
	
	public void Correr() {
		System.out.print("Uma das características do cachorro é correr!");
	}
}
