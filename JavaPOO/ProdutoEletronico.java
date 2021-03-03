package JavaPOO;

public class ProdutoEletronico {
	String produto;
	String marca;
	String cor;
	int quantidade;
	
	int pegaQuant() {
		if(this.quantidade > 1) {
			System.out.println("O senhor têm 25% de desconto, pois comprou duas unidades!");
		}
		return 3;
	}
	
}
