package RelacionandoMetodosJavaPOO;

public class TestaPessoaForCliente {
	public static void main(String args []) {
		Pessoa magazine = new Pessoa("Magazine", "91.378.520/0001-98", "Rua, 14", "(49) 95351-3899");
		System.out.println("NOME DA FORNECEDORA: " + magazine.getNome() + "\nCNPJ : " + magazine.getCpf() + "\nENDEREÇO: " + magazine.getEndereco() + "\nTELEFONE: " + magazine.getCelular());
	}
}
