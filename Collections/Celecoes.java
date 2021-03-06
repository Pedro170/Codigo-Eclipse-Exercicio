package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Celecoes {
	public static void main(String args[]) {
		Collection <String> nomes = new ArrayList();
		nomes.add("João");
		nomes.add("Pedro");
		nomes.add("Santos");
		nomes.add("Silva");
		

		
		System.out.println("Lista de nomes: " + nomes);
		nomes.remove("Silva");
		System.out.print("Lista de nomes: " + nomes);
		
		//System.out.println("Contém o nome Pedro: " + nomes.contains("Pedro"));
		//System.out.println("Lista: " + nomes);
		/*
		System.out.println("Lista de nomes: " + nomes);
		nomes.clear();
		System.out.print("Lista de nomes: " + nomes);
		/*
		System.out.println("Lista de nomes: " + nomes);
		nomes.remove("Silva");
		System.out.print("Lista de nomes: " + nomes);
		*/
		
		/*
		
		
		if(nomes.isEmpty()) {
			System.out.println("Lista vazia...");
		}else{
			System.out.print("Lista de nomes: " + nomes);
		}
		*/
		
	}
}
