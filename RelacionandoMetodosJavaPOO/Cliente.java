package RelacionandoMetodosJavaPOO;

public class Cliente extends Pessoa{
	private double salario;
	private String trabalho;
	public Cliente(String nome, String cpf, String endereco, String celular, double salario, String tarbalho) {
		super(nome, cpf, endereco, celular);
		this.salario = salario;
		this.trabalho = trabalho;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getTrabalho() {
		return trabalho;
	}
	public void setTrabalho(String trabalho) {
		this.trabalho = trabalho;
	}
}
