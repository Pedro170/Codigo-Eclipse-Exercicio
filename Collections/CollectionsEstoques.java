package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class CollectionsEstoques {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		Collection <String> estoque = new ArrayList();
		estoque.add("Bolacha");
		estoque.add("Açucar");
		estoque.add("Café");
		estoque.add("Leite");
		estoque.add("Refrigerante");
		estoque.add("Bolo");
		System.out.println("-----------------------------------------------");
		System.out.println("O que temos na lista de compras: \n" + estoque);
		System.out.println("-----------------------------------------------");
		System.out.print("\nDeseja remover algum item da lista? ");
		String remova = leia.next();
		estoque.remove(remova);
		System.out.println("\nO que você removeu ? Pode me mostar? \n" + estoque);
		System.out.println("-----------------------------------------------");
		System.out.print("O que deseja adicionar na lista? ");
		String add = leia.next();
		Collection<String> adicionar = Arrays.asList(add);
		System.out.println("O que você adicionou na lista? " + adicionar);
		System.out.println("-----------------------------------------------");
		estoque.addAll(adicionar);
		System.out.println("Como ficou a lista agora? " + estoque);
	}
}
