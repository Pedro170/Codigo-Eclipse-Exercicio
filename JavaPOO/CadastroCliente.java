package JavaPOO;

import java.util.Scanner;

public class CadastroCliente {
	public static void main(String args[]) {
		System.out.println("CADASTRE SEU CLIENTE AQUI");
		Cliente cliente1 = new Cliente("João Pedro", "612.839.903-77", "Rua Dr Ignácio Proença de Gouveia, 209");
		Cliente cliente2 = new Cliente("Karine Atunes Faria", "442.472.8258-11", "Rua Gomes Leal, 298");
		Cliente cliente3 = new Cliente("Hellen Cristina Neves Iwata", "365.589.965-06", "Rua jeni Klabin Segall");
		System.out.print(cliente1.getInforCompleta());
		System.out.print(cliente2.getInforCompleta());
		System.out.print(cliente2.getInforCompleta());
	}
}
