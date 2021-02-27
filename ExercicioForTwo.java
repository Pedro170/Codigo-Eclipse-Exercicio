package ExerciciosGeneration;

public class ExercicioForTwo {
	public static void main(String[] args) {
		int somaimpar = 0, somapar = 0;
		for(int x = 1; x <= 10; x++) {
			if(x % 2 != 0) {
				somaimpar = somaimpar + 1;
			}else{
				somapar = somapar + 1;
			}
		}
		System.out.print("Foram lidos " +somaimpar+ " números Ímpares\n");
		System.out.print("Foram lidos " +somapar+ " números Pares");
	}
}
