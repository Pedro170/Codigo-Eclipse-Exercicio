import java.util.Scanner;

public class TestaCaractere {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
		double x = 0, y = 0;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número inteiro para A: ");
		a = ler.nextInt();
		System.out.print("Digite um número inteiro para B: ");
		b = ler.nextInt();
		System.out.print("Digite um número inteiro para C: ");
		c = ler.nextInt();
		System.out.print("Digite um número inteiro para D: ");
		c = ler.nextInt();
		System.out.print("Digite um número inteiro para E: ");
		c = ler.nextInt();
		System.out.print("Digite um número inteiro para F: ");
		c = ler.nextInt();
		x = (c * e - b * f) / (a * e - b * d);
		y = (a * f - c * d) / (a * e - b * d);
		
		System.out.println("O valor de X será: " + x);
		System.out.println("O valor de Y será: " + y);

	}
}
