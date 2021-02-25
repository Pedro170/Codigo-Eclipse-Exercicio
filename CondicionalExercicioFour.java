package ExerciciosGeneration;

import java.util.Scanner;

public class CondicionalExercicioFour {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float num;
		System.out.print("Digite um número: ");
		num = leia.nextFloat();
		if(num % 2 == 0) {
			System.out.print("O número digitado e PAR e a sua ráiz quadra é: " + Math.sqrt(num));
		}else{
			System.out.print("O número digitado e ÍMPAR e a sua ráiz quadra é: " + Math.pow(num, 2));
		}
	}
}
