package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioArrayMatrizTwo {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float MatrizA[][] = new float[2][2], MatrizB[][] = new float[2][2], MatrizCA[][] = new float[2][2], MatrizCS[][] = new float[2][2];
		int op, cons = 0, linha, coluna;
		for(linha = 0; linha < 2; linha++) {
			for(coluna = 0; coluna < 2; coluna++) {
				System.out.printf("Insira o elemento MATRIZ A[%d][%d]: ", linha + 1, coluna + 1);
				MatrizA[linha][coluna] = leia.nextInt();
				System.out.printf("Insira o elemento MATRIZ B[%d][%d]: ", linha + 1, coluna + 1);
				MatrizB[linha][coluna] = leia.nextInt();
			}		
		}
		
		System.out.println("Escolha uma das opções do que deseja fazer com a matriz:\n");
		System.out.print("[1] - Somar as duas matrizes.\n[2] - Subtrair a matriz da segunda.\n[3] - Adicionar uma contante as duas matrizes.\n[4] - Imprimir as duas matrizes\n");
		op = leia.nextInt();
		while(op < 1 || op > 4) {
			System.out.print("[ERRO]: NÚMERO INVÁLIDO, ESCOLHA UMA DAS OPÇÕES!\n");
			System.out.println("\nEscolha uma das opções do que deseja fazer com a matriz:\n");
			System.out.print("[1] - Somar as duas matrizes.\n[2] - Subtrair a matriz da segunda.\n[3] - Adicionar uma contante as duas matrizes.\n[4] - Imprimir as duas matrizes\n");
			op = leia.nextInt();
		}
		switch(op) {

		case 1:
			for(linha = 0; linha < 2; linha++) {
				for(coluna = 0; coluna < 2; coluna++) {
					MatrizCA[linha][coluna] = MatrizA[linha][coluna] + MatrizB[linha][coluna];
				}
			}
			System.out.print("\nMATRIZ A + B");
			
			System.out.print("\n\n| " + MatrizCA[0][0] + " | " + MatrizCA[0][1] + " |\n");
			System.out.println("---------------");
			System.out.print("| " + MatrizCA[1][0] + " | " + MatrizCA[1][1] + " |\n");
			System.out.println("---------------");
			break;
		case 2:
			for(linha = 0; linha < 2; linha++) {
				for(coluna = 0; coluna < 2; coluna++) {
					MatrizCS[linha][coluna] = MatrizA[linha][coluna] - MatrizB[linha][coluna];
				}
			}
			System.out.print("\nMATRIZ A - B");
			
			System.out.print("\n\n| " + MatrizCS[0][0] + " | " + MatrizCS[0][1] + " |\n");
			System.out.println("---------------");
			System.out.print("| " + MatrizCS[1][0] + " | " + MatrizCS[1][1] + " |\n");
			System.out.println("---------------");
			break;
		case 3:
			System.out.print("Qual contante deseja adicionar: ");
			cons = leia.nextInt();
			for(linha = 0; linha < 2; linha++) {
				for(coluna = 0; coluna < 2; coluna++) {
					MatrizA[linha][coluna] = MatrizA[linha][coluna] + cons;
					MatrizB[linha][coluna] = MatrizB[linha][coluna] + cons;
				}
			}
			System.out.print("\nMATRIZ A\n");
			
			System.out.print("\n\n| " + MatrizA[0][0] + " | " + MatrizA[0][1] + " |\n");
			System.out.println("---------------");
			System.out.print("| " + MatrizA[1][0] + " | " + MatrizA[1][1] + " |\n");
			System.out.println("---------------");
			
			System.out.print("\nMATRIZ B");
			
			System.out.print("\n\n| " + MatrizB[0][0] + " | " + MatrizB[0][1] + " |\n");
			System.out.println("---------------");
			System.out.print("| " + MatrizB[1][0] + " | " + MatrizB[1][1] + " |\n");
			System.out.println("---------------");
			
			break;
		case 4:
			System.out.print("\nMATRIZ A\n");
			
			System.out.print("\n\n| " + MatrizA[0][0] + " | " + MatrizA[0][1] + " |\n");
			System.out.println("-------------");
			System.out.print("| " + MatrizA[1][0] + " | " + MatrizA[1][1] + " |\n");
			System.out.println("-------------");
			
			System.out.print("\nMATRIZ B");
			
			System.out.print("\n\n| " + MatrizB[0][0] + " | " + MatrizB[0][1] + " |\n");
			System.out.println("-------------");
			System.out.print("| " + MatrizB[1][0] + " | " + MatrizB[1][1] + " |\n");
			System.out.println("-------------");
			break;
		}
		
			
		
		
		/*
		System.out.print("\nMATRIZ A\n");
		
		System.out.print("\n\n| " + MatrizA[0][0] + " | " + MatrizA[0][1] + " |\n");
		System.out.println("---------------");
		System.out.print("| " + MatrizA[1][0] + " | " + MatrizA[1][1] + " |\n");
		System.out.println("---------------");
		
		System.out.print("\nMATRIZ B");
		
		System.out.print("\n\n| " + MatrizB[0][0] + " | " + MatrizB[0][1] + " |\n");
		System.out.println("---------------");
		System.out.print("| " + MatrizB[1][0] + " | " + MatrizB[1][1] + " |\n");
		System.out.println("---------------");
		
		System.out.print("\nMATRIZ A + B");
		
		System.out.print("\n\n| " + MatrizCA[0][0] + " | " + MatrizCA[0][1] + " |\n");
		System.out.println("---------------");
		System.out.print("| " + MatrizCA[1][0] + " | " + MatrizCA[1][1] + " |\n");
		System.out.println("---------------");
		
		System.out.print("\nMATRIZ A - B");
		
		System.out.print("\n\n| " + MatrizCS[0][0] + " | " + MatrizCS[0][1] + " |\n");
		System.out.println("---------------");
		System.out.print("| " + MatrizCS[1][0] + " | " + MatrizCS[1][1] + " |\n");
		System.out.println("---------------");
		*/
	}
}
