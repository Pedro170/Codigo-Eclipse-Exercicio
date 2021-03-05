package JavaPOO;

public class Preguica extends Animal {
	public Preguica() {
		
	}
	
	@Override
	public void Nome(String nomeAnimal) {
		System.out.println("Nome da preguiça é: " + nomeAnimal);
	}
	
	@Override
	public void Idade(int idadeAnimal) {
		System.out.println("Idade: " + idadeAnimal);
	}
	
	@Override
	public void Som(String somAnimal) {
		System.out.println("Som que a preguiça emite é: " + somAnimal);
	}
	
	public void SubirArvore() {
		System.out.print("Uma das características da preguiça é subir em árvore!");
	}
}
