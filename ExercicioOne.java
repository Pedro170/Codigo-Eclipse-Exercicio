import java.util.Scanner;

public class TestaCaractere {
	public static void main(String[] args) {
		int a, b, c;
		double d = 0, r = 0, s = 0;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número inteiro para A: ");
		a = ler.nextInt();
		System.out.print("Digite um número inteiro para B: ");
		b = ler.nextInt();
		System.out.print("Digite um número inteiro para C: ");
		c = ler.nextInt();
		
		d = (r + s) / 2;
		r = Math.pow(a + b, 2);
		s = Math.pow(b + c, 2);
		
		System.out.println(d);
		System.out.println(r);
		System.out.println(s);
	}
}
