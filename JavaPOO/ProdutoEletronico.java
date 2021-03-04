package JavaPOO;

public class ProdutoEletronico {
	String produto;
	String marca;
	String cor;
	int quantidade;
	
	String pegaQuant() {
		if(this.quantidade > 1) {
			System.out.println("O senhor têm 25% de desconto, pois comprou duas unidades!");
		}
		return "";
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
