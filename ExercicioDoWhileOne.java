package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioDoWhileOne {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, somanum = 0; 
		do {
			System.out.print("Digite um número: ");
			num = leia.nextInt();
			somanum = somanum + num;
		}while(num != 0);
		System.out.print("A soma dos número digitados foi de: " + somanum);
	}
}
