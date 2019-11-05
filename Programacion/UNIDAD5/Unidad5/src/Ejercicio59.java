import java.util.Scanner;
/* Nombre: Kevin
 * Fecha: 5/11/2019
 * Descrpcion: Tirar dados de forma aleatoria, parar el bucle cuando los dos dados sean iguales..
 * */
public class Ejercicio59 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int dado,dado1,tirada=1;
		
		System.out.println("Vamos a tirar los dados...");
		
		do {
			//Tirar los dados. Dandole valor de forma aleatoria.
			dado=(int) (Math.random()*6+1);
			dado1=(int) (Math.random()*6+1);
			
			//Mostrar el numero de la tirada y los resultados.
			System.out.println("En la tirada "+tirada+" ha salido "+dado+" y el "+dado1);
			tirada++;	
			
			}while(dado !=dado1);
			if(dado == dado1)
				System.out.println("Al final han salido iguales!");
	}

}
