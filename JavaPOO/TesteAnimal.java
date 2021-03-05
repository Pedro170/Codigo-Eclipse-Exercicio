package JavaPOO;
import java.util.Scanner;

public class TesteAnimal {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguiça = new Preguica();
		
		Animal animal = null;
		int x=0;
		do
		{
			System.out.println("Qual o tipo do seu animal:\n[1] - cachorro.\n[2] - cavalo.\n[3] - preguiça.");
			x=leia.nextInt();
			if(x==1)
			{
				animal=cachorro;
				System.out.println("Qual o nome do seu Cachorro ? ");
				String nome = leia.next();
				System.out.println("Quantos anos seu Cachorro tem ? ");
				int idade= leia.nextInt();
				System.out.println("Essa é lega! Qual o som seu cachorro emite");
				String som = leia.next();
				System.out.println("-------------------------------------------------");
				cachorro.Nome(nome);
				cachorro.Idade(idade);
				cachorro.Som(som);
				cachorro.Correr();
			}
			else if(x==2)
			{
				animal=cavalo;
				System.out.println("Qual o nome do seu Cavalo? ");
				String nome = leia.next();
				System.out.println("Quantos anos seu Cavalo tem? ");
				int idade= leia.nextInt();
				System.out.println("Essa é lega! Qual o som seu Cavalo emite");
				String som = leia.next();
				System.out.println("-------------------------------------------------");
				cavalo.Nome(nome);
				cavalo.Idade(idade);
				cavalo.Som(som);
				cavalo.Correr();
			}
			else if(x==3)
			{
				animal=preguiça;
				System.out.println("Qual o nome do seu Preguiça? ");
				String nome = leia.next();
				System.out.println("Quantos anos seu Preguiça tem? ");
				int idade= leia.nextInt();
				System.out.println("Essa é lega! Qual o som seu Preguiça emite");
				String som = leia.next();
				System.out.println("-------------------------------------------------");
				preguiça.Nome( nome );
				preguiça.Idade( idade );
				preguiça.Som( som );
				preguiça.SubirArvore();
				
			} 
			else
			{
			System.out.println("Informação Invalida");	
			}
			
			
		}while (x<=0 || x>=4);
	}
}