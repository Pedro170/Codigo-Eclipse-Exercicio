package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioWhileOne {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade, contx = 0, conty = 0, contz = 0, totpessoas;
		System.out.println("O PROGRAMA PARA DE RODAR QUANDO FOR DIGITADO -99!\n");
		System.out.print("Qual sua idade? ");
		idade = leia.nextInt();
		while(idade != -99) {
			if(idade < 21) {
				contx = contx + 1;
			}else if(idade > 50) {
				conty = conty + 1;
			}else{
				contz = contz + 1;
			}
			System.out.print("Qual sua idade? ");
			idade = leia.nextInt();
		}
		totpessoas = contx + conty + contz;
		System.out.println("\nForam cadastradas " +totpessoas);
		System.out.println("Foram cadastrados " +contx+ " pessoa com menos de 21 anos!");
		System.out.println("Foram cadastrados " +conty+ " pessoa com mais de 50 anos!");
		System.out.println("Foram cadastrados " +contz+ " pessoa com a idade entre 21 e 50 anos!");
	}
}
