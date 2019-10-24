import java.util.Scanner;

public class Ejercicio48 {
	/*Nombre: Kevin Rosales
	 * Fecha: 24/10/19
	 *  Resumen: Sumar numeros hasta que el usuario ponga un numero negativo
	 *  */

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		int numero, suma=0;
		
		do {
			
			System.out.println("Escribe un numero:");
			numero= scanner.nextInt();
			
			if(numero>=0)
			suma=suma+numero;
			
			
		} while( numero>=0);
		
		System.out.println("La suma total es: "+suma);
		
	}

}
