package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioArrayVetorOne {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int A[] = {1, 0, 5, -2, -5, 7}, soma = 0, soman = 0;
		for(int i: A) {
			System.out.print(i+ ", ");
			soma = A[0] + A[1] + A[5];
		}
		System.out.print("\nA somat�ria foi de: " + soma);
		
		System.out.print("\n\nANTES DO VALOR DO VETOR SER MUDADO PARA 100, ESSE ERA O VETOR:\n\n");
		for(int c = 0; c < 6; c++) {
			for(int i: A) {
				c++;
				System.out.print("Esse � o " + c + "� valor do vertor [" + i + "]\n");
			}
		}
		System.out.print("\nDigite o valor 100! ");
		A[3] = leia.nextInt();
		while(A[3] != 100) {
			System.out.print("[ERRO]: ESCOLHA A OP��O INFORMADA!\n");
			System.out.print("\nDigite o valor 100! ");
			A[3] = leia.nextInt();
		}
		System.out.print("\nAP�S O VALOR DA 4� POSI��O SER MUDADO PARA 100, ESSE � O NOVO VETOR:\n\n");
		for(int c = 0; c < 6; c++) {
			for(int i: A) {
				c++;
				System.out.print("Esse � o " + c + "� valor do vertor [" + i + "]\n");
			}
		}
	}
	
}
