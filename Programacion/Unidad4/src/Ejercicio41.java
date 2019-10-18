import java.util.Scanner;

public class Ejercicio41 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n,b,r,i;
		r=1;
		
		System.out.println("Dime el valor b: ");
		b = scanner.nextInt();
		System.out.println("Dime el valor n: ");
		n = scanner.nextInt();
		
		for(i=0;i<n;i++) {
			r=r*b;
		}
		System.out.println("El valor final es: "+r);
	}
}
