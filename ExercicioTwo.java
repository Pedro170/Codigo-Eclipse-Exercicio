import java.util.Scanner;

public class TestaCaractere {
	public static void main(String[] args) {
		int totaldias, anos, meses, dias;
		Scanner ler = new Scanner(System.in);
		System.out.print("Quantos dias de vida voc� tem? ");
		totaldias = ler.nextInt();
		anos = totaldias / 365;
		meses = (totaldias % 365) / 30;
		dias = (totaldias % 365) % 30;
		System.out.print("Eu tenho ano(s)" + anos + "\nEu tenho m�s(es)" + meses + "\nEu tenho dia(s)" + dias);
	}
}
