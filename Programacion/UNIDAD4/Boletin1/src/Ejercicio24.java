
import java.util.Scanner;

public class Ejercicio24 {
	/* Nombre: Kevin
	 * Fecha:8/10/19
	 * Descripcion:  Ecuacion de segundo grado
	 * */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float a,b,c,raiz,X1,X2;
		
		
		System.out.println("Dime el valor de a: ");
		a=scanner.nextFloat();
		scanner.nextLine();
		
		System.out.println("Dime el valor de b: ");
		b=scanner.nextFloat();
		scanner.nextLine();
		
		System.out.println("Dime el valor de c: ");
		c=scanner.nextFloat();
		scanner.nextLine();
		
		raiz = (float) Math.pow(b, 2)-(4*a*c);
		raiz = (float) Math.sqrt(raiz);
		
		X1 = (-b+raiz)/(2*a);
		X2 = (-b-raiz)/(2*a);

		System.out.println("El resultado es: "+X1+" pero tambien puede tomar el valor de :"+X2);
		
		
	}

}
