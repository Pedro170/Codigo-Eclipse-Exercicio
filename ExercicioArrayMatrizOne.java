package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioArrayMatrizOne {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int Matriz[][] = new int [3][3], maior = 0;
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", linha + 1, coluna + 1);
				Matriz[linha][coluna] = leia.nextInt();
				if(Matriz[linha][coluna] > 10) {
					maior++;
				}
			}
		}
		System.out.print("\n\n| " + Matriz[0][0] + " | " + Matriz[0][1] + " | " + Matriz[0][2] + " |\n");
		System.out.println("-------------");
		System.out.print("| " + Matriz[1][0] + " | " + Matriz[1][1] + " | " + Matriz[1][2] + " |\n");
		System.out.println("-------------");
		System.out.print("| " + Matriz[2][0] + " | " + Matriz[2][1] + " | " + Matriz[2][2] + " |");
		
		System.out.print("\n Apareceram " + maior +  " valores maior(es) que 10");
		
	}
}
