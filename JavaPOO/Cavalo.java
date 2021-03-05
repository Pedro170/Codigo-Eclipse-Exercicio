package JavaPOO;

public class Cavalo extends Animal {

	public Cavalo() {
	}
	
	@Override
	public void Nome(String nomeAnimal) {
		System.out.println("Nome do cavalo: " + nomeAnimal);
	}
	
	@Override
	public void Idade(int idadeAnimal) {
		System.out.println("Idade: " + idadeAnimal);
	}
	
	@Override
	public void Som(String somAnimal) {
		System.out.println("Som que o cavalo emite: " + somAnimal);
	}
	
	public void Correr() {
		System.out.print("Uma das características do cavalo é correr e correr muinto!");
	}
	
	
}
