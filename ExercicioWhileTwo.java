package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioWhileTwo {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int pessoas = 0, idade, sexo, humor, contidade = 0, contsexo = 0, conthumor = 0;
		while(pessoas < 2) {
			pessoas = pessoas + 1;
			System.out.print("Qual sua idade? ");
			idade = leia.nextInt();
			System.out.print("Qual o seu sexo?\n [1] - Feminino\n [2] - Masculino\n [3] - Outros:\n ");
			sexo = leia.nextInt();
			System.out.print("Você se considera uma pessoa calma, nervosa ou agressiva?\n [1] - Calma\n [2] - Nervosa\n [3] - Agressiva:\n ");
			humor = leia.nextInt();
			if(humor == 1) {
				conthumor++;
			}else if(sexo == 1 && humor == 2) {
				contsexo++;
				conthumor++;
			}else if(sexo == 2 && humor == 3) {
				contsexo++;
			}else if(sexo == 3 && humor == 1) {
				contsexo++;
			}else if(humor == 2 && idade >= 40) {
				contidade++;
			}else if(humor == 1 && idade <= 18) {
				contidade++;
			}else{
			}
		}
		
		System.out.println("O número de pessoas calmas encontradas na pesquisa foi de: " + conthumor);
		System.out.println("O número de mulheres nervosas foi de: " + contsexo);
		System.out.println("O número de homens agressivos foi de: " + contsexo);
		System.out.println("O número de outros calmos foi de: " + contsexo);
		System.out.println("O número de outros sexo foi de: " + contsexo);
		System.out.println("O número de pessoas nervosas com mais de 40 anos foi de: " + contidade);
		System.out.println("O número de pessoas calmas com menos de 18 anos foi de: " + contidade);
		
	}
}
