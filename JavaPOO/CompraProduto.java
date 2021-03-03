package JavaPOO;

import java.util.Scanner;

public class CompraProduto {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		ProdutoEletronico nomeProduto = new ProdutoEletronico();
		System.out.print("Qual produto o senhor deseja comprar? ");
		nomeProduto.produto = leia.next();
		System.out.print("Qual modelo senhor? ");
		nomeProduto.marca= leia.next();
		System.out.print("Qual a cor o senhor deseja? ");
		nomeProduto.cor = leia.next();
		System.out.print("Qual a quantidade que o senhor deseja? ");
		nomeProduto.quantidade = leia.nextInt();
		
		
		System.out.println("O PRODUTO: " + nomeProduto.produto);
		System.out.println("MARCA: " + nomeProduto.marca);
		System.out.println("COR: " + nomeProduto.cor);
		System.out.println("QUANTIDADE: " + nomeProduto.quantidade);
		System.out.println(nomeProduto.pegaQuant());
	}
}
