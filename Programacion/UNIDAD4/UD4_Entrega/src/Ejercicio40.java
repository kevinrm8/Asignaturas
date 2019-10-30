import java.util.Scanner;

public class Ejercicio40 {
	/* Nombre: Kevin Rosales
	 * Fecha:18/10/19
	 * Descripcion: Ejercico para gastar bucles.
	 * */


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n,i,j; // Declaro las variables necesarias, n el numero que pones por teclado.
					//i,j los variables de los bucles.
		
		System.out.println("Dime un valor: ");
		n = scanner.nextInt();
		
		for(i=1;i<=n;i++){ //Primer bucle con el que recorremos todas las variables.
			for(j=i;j<=n;j++){ // Con el segundo bucle recorremos todo sin que se repita, por eso inicio j con el valor de i.
				System.out.println("Par "+i+","+j+": "+i+"+"+j+"+2*"+i+"*"+j+" vale "+(i+j+(2*i*j)));
			}//FIN del for j
		}//Fin del for i
	}

}
