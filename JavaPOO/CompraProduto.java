package JavaPOO;

import java.util.Scanner;

public class CompraProduto {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		ClienteLoja inforCliente = new ClienteLoja();	
		System.out.print("Digite o nome do cliente: ");
		inforCliente.nome = leia.next();
		leia.nextLine();
		System.out.print("Digite o CPF do cliente: ");
		inforCliente.CPF = leia.next();
		System.out.print("Digite o endereço do cliente completo: ");
		inforCliente.endereco = leia.next();
		
		ProdutoEletronico nomeProduto = new ProdutoEletronico();
		leia.nextLine();
		System.out.print("Qual produto o senhor deseja comprar? ");
		nomeProduto.produto = leia.next();
		System.out.print("Qual marca senhor? ");
		nomeProduto.marca= leia.next();
		System.out.print("Qual a cor o senhor deseja? ");
		nomeProduto.cor = leia.next();
		System.out.print("Qual a quantidade que o senhor deseja? ");
		nomeProduto.quantidade = leia.nextInt();
		
		
		System.out.println("NOME DO CLIENTE: " + inforCliente.nome);
		System.out.println("CPF DO CLIENTE: " + inforCliente.CPF);
		System.out.println("ENDEREÇO DO CLIENTE: " + inforCliente.endereco);
	
		System.out.println("O PRODUTO: " + nomeProduto.produto);
		System.out.println("MARCA: " + nomeProduto.marca);
		System.out.println("COR: " + nomeProduto.cor);
		System.out.println("QUANTIDADE: " + nomeProduto.quantidade);
		System.out.println(nomeProduto.pegaQuant());
	}
}
