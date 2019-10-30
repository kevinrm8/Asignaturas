import java.util.Scanner;

public class Ejercicio16 {
	/* Nombre: Kevin
	 * Fecha:04/10/19
	 * Descripcion: Programa para leer por teclado variables 
	 * */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Introduce x ");
		x = scanner.nextInt(); // Leemos un numero por teclado y lo guardamos en la variable x
		scanner.nextLine();
		
		System.out.println("Introduce y ");
		y = scanner.nextInt();
		scanner.hasNextLine();
		
		System.out.println("Los valores introducidos son: "+x+ "y "+y); 
		System.out.println("\t\t SUMA\t RESA\t PRODUCTO\t COCIENTE"); // Gastamos el comando "\t" para tabular a la hora imprimir por pantalla
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("x="+x+" y="+y+"\t "+(x+y)+"\t"+(x-y)+"\t"+(x*y)+"\t\t"+(x/y));
		System.out.println("-----------------------------------------------------------------------");

	}

}
