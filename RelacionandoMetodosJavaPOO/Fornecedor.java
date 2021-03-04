package RelacionandoMetodosJavaPOO;

public class Fornecedor extends Pessoa {
	private double valorCredito;
	private double valorDivida;
	private double obterSaldo;
	
	public Fornecedor(String nome, String cpf, String endereco, String celular, double valorCredito, double valorDivida, double obterSaldo) {
		super(nome, cpf, endereco, celular);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		this.obterSaldo = obterSaldo;
		
	}
	public void TestaPessoaForCliente() {
		System.out.printf("O crédito da empresa é de %f: \n", 70000);
		System.out.printf("A divida da empresa é de %f: \n", 45000);
	}
	public double valorDivida(double valorSaldo) {
		System.out.printf("O saldo da empresa é de  %d \n", valorSaldo);
		return valorSaldo - valorDivida;
	}
	
	public double valorPagar(double valorDivida) {
		System.out.printf("O saldo da empresa é de  %d \n", valorDivida);
		return 0;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public double getObterSaldo() {
		return obterSaldo;
	}

	public void setObterSaldo(double obterSaldo) {
		this.obterSaldo = obterSaldo;
	}
}
