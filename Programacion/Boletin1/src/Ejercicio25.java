import java.util.Scanner;

public class Ejercicio25 {
	/* Nombre: Kevin
	 * Fecha:8/10/19
	 * Descripcion: Calculamos la hipotenusa.
	 * */

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		float a,b,c;
		
		System.out.println("Dime el valor del cateto a: ");
		a=scanner.nextFloat();
		
		System.out.println("Dime el valor del cateto b: ");
		b=scanner.nextFloat();

		c= (float) Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		
		System.out.println("El valor de la hipotenusa es: "+c);
		
	}

}
