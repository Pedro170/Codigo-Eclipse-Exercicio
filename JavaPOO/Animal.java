package JavaPOO;

public abstract class Animal {
	private String TipoAnimal;
	
	public Animal() {
		this.TipoAnimal = TipoAnimal;
	}
	
	abstract public void Nome(String nomeAnimal);
	abstract public void Idade(int idadeAnimal);
	abstract public void Som(String somAnimal);
	
	public String getTipoAnimal() {
		return TipoAnimal;
	}
	public void setTipoAnimal(String tipoAnimal) {
		TipoAnimal = tipoAnimal;
	}
}
