
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b; float area;
		
		System.out.println("Dime la base del triangulo ");
		b = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Dime la altura del triangulo ");
		a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("El triangulo de base "+b+" y altura "+a+" tiene una area de "+((a*b)/2));
		
	}

}
