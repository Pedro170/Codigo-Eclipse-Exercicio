package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioArrayVetorTwo {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num[] = new int[6], par = 2, somapar = 0, impar = 1, totimpar = 0;
		System.out.println("S� PODERAM SER DIGITADOS N�MEROS INTEIROS!\n");
		for(int x = 0; x < 6; x++) {
			System.out.print("\nDigite um n�mero: ");
			num[x] = leia.nextInt();
			if(num[x] % 2 == 0) {
				par = num[x];
				somapar = somapar + num[x]; 
				System.out.print("Esse n�mero � PAR [" + par + "]\n");
			}else{
				impar = num[x];
				totimpar++;
				System.out.print("Esse n�mero � �MPAR [" + impar + "]\n");
			}
		}
		
		System.out.println("\nA soma dos n�meros pares digitados foi de: " + somapar);
		System.out.print("Foram digitados: " + totimpar + " �mpares.");
		
	}
}
