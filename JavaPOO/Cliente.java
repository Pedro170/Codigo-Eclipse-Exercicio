package JavaPOO;

public class Cliente {
	private String nome;
	private String CPF;
	private String endereco;
	public Cliente(String primeirainfor, String segundainfor, String logradouro) {
		nome = primeirainfor;
		CPF = segundainfor;
		endereco = logradouro;
	}
	
	public String getInforCompleta() {
		String inforCompleta = "\n\nNOME DO CLIENTE: " + nome +"\nCPF DO CLIENTE: "+ CPF +"\nENDEREÇO DO CLIENTE: "+ endereco;
		return inforCompleta;
	}
}
