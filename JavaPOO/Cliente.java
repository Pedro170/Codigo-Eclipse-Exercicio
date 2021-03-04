package JavaPOO;

public class Cliente {
	private String nome;
	private String CPF;
	private String endereco;
	
	 public Cliente(String primeirainfor, String segundainfor, String logradouro) {
		 this.nome = primeirainfor;
		 this.CPF = segundainfor;
		 this.endereco = logradouro;
	 }
	
	public String getInforCompleta() {
		String inforCompleta = "\nNOME DO CLIENTE: " + nome +"\nCPF DO CLIENTE: "+ CPF +"\nENDEREÇO DO CLIENTE: "+ endereco;
		return inforCompleta;
	}
}
