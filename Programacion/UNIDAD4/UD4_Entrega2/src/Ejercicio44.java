import java.util.Scanner;

public class Ejercicio44 {
	/* Nombre: Kevin Rosales
	 * Fecha:22/10/19
	 * Descripcion: Hacer un progama que pinte una X.
	 * */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int altura, par,fila=0,col=0;
		 
		
		System.out.println("Dime la altura(Debe ser impar y major que 3)");
		altura = scanner.nextInt();
		
		
		par= altura%2; // Comprobamos si el numero "altura" es par o impar. Si la variable "par" es 0, quiere decir que el numero
						//introducido es par.
		
		
		if(altura<3 || par==0) { // Si el numero es menor que 3 o par se acaba el programa.
			System.out.println("El numero es menor que 3 o es un numero par");
								} else {
		
		for(fila=0;fila<altura;fila++) { // Este for recorre las filas.
			for(col=0;col<altura;col++) { // Este recorre las columnas.
											// Hasta que no acaba la fila no pasa a la segunda columna.
				if(fila==col || col==altura-fila-1) // Escribe "*" cuando la fila y la columna son iguales, cuando no se pone espacia
					System.out.print("*");						
				else System.out.print(" ");
			} System.out.println(" "); // Sirve para saltar de linea.
			
		}					
			
			
		
								}	
	}
}
