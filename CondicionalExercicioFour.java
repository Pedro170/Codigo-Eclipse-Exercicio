package ExerciciosGeneration;

import java.util.Scanner;

public class CondicionalExercicioFour {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float num;
		System.out.print("Digite um n�mero: ");
		num = leia.nextFloat();
		if(num % 2 == 0) {
			System.out.print("O n�mero digitado e PAR e a sua r�iz quadra �: " + Math.sqrt(num));
		}else{
			System.out.print("O n�mero digitado e �MPAR e a sua r�iz quadra �: " + Math.pow(num, 2));
		}
	}
}
