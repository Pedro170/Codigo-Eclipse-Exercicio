package ExerciciosGeneration;

import java.util.Scanner;

public class CondicionalExercicioThree {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();
		if(idade >= 10 && idade <=14) {
			System.out.print("Você faz parte da categoria INFANTIL.");
		}else if(idade > 14 && idade <= 17) {
			System.out.print("Você faz parte da categoria JUVENIL.");
		}else if(idade > 17 && idade <= 120) {
			System.out.print("Você faz parte da categoria ADULTO.");
		}else{
			System.out.print("[ERRO] Nosso sistema não aceita pessoas menores de 10 anos!\n[ERRO]Ou você tem mais de 120 anos ou está morto!");
		}
	}
}
