import java.util.Scanner;

public class Ejercicio31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, primero,central,ultimo;
		
		System.out.println("Dime un numero de 3 cifras: ");
		n= scanner.nextInt();
		
		primero = n/100;
		central = n%100;
		central= central/10;
		ultimo = n%10;
		
		System.out.println("Primera cifra de "+n+"->"+primero);
		System.out.println("Cifra central de "+n+"->"+central);
		System.out.println("Ultima cifra de "+n+"->"+ultimo);

		
	}

}
