package JavaPOO;

public class Preguica extends Animal {
	public Preguica() {
		
	}
	
	@Override
	public void Nome(String nomeAnimal) {
		System.out.println("Nome da pregui�a �: " + nomeAnimal);
	}
	
	@Override
	public void Idade(int idadeAnimal) {
		System.out.println("Idade: " + idadeAnimal);
	}
	
	@Override
	public void Som(String somAnimal) {
		System.out.println("Som que a pregui�a emite �: " + somAnimal);
	}
	
	public void SubirArvore() {
		System.out.print("Uma das caracter�sticas da pregui�a � subir em �rvore!");
	}
}
