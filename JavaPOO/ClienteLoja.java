package JavaPOO;

public class ClienteLoja {
	String nome;
	String CPF;
	String endereco;
	
	public String getInforCompleta() {
		String inforCompleta = "NOME DO CLIENTE: " + nome +"\nCPF DO CLIENTE: "+ CPF +"\nENDEREÇO DO CLIENTE: "+ endereco;
		return inforCompleta;
	}
}
