import java.util.Random;
import java.util.Scanner;

public class Ejercicio66 {
	/* Nombre: Kevin
	 * Fecha: 13/11/2019
	 * Descripcion: Crear matriz y buscar numeros dentro de ella
	*/

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[][] matriz;
		int fil,col,inf,sup,buscar,cont=0;
		String salir;
		
		System.out.println("Introduzca num de filas de la matriz");
		fil = scanner.nextInt();
		System.out.println("Introduzca num de columnas de la matriz");
		col = scanner.nextInt();
		System.out.println("Introduzca num inferior del rango");
		inf = scanner.nextInt();
		System.out.println("Introduzca num superior del rango");
		sup = scanner.nextInt();
		scanner.nextLine(); 
		matriz = new int[fil][col];
		
		//Relleno matriz aleatoriamente
		for(int i=0;i<fil;i++) {
			for(int j=0;j<col;j++) {
				matriz[i][j] = (int) (Math.random()*sup+inf);
			}
		}
		
		//Muestro la matriz por pantalla
		for(int i=0;i<fil;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matriz[i][j]+" ");
			}System.out.println();
		}
		do {
			//Buscar numero en la matriz
			System.out.println("¿Que numero quieres buscar en la matriz?(-1 para salir)");
			
			// HE INTENTADO HACERLO CON PARSE INT PERO NO ME HA DADO TIEMPO
// 			salir=scanner.nextLine(); 
//			if(salir.contentEquals("salir"))
//				break;
//			else
//			
//			buscar = Integer.parseInt(salir);

			buscar = scanner.nextInt();
			
			
			// NO ME HA DADO TIEMPO PARA HACER BIEN LA SALIDA. 
			//Pongo que si es -1 se acabe el programa
			if(buscar ==-1)
				break;
			
			for(int i=0;i<fil;i++) {
				for(int j=0;j<col;j++) {
					if(buscar<inf && buscar>sup)
						System.out.println("El valor introducido "+buscar+" esta fuera del rango["+inf+"] ["+sup+"]");
					else 
						if(buscar == matriz[i][j]) {
							cont++;
						}	
				}
			}
			
			//Si el numero aparece en la matriz indica cuantas veces aparece, sino dira que no sale ninguna vez
			if(cont>0)
				System.out.println("El valor "+buscar+" está en la matriz y aparece "+cont+" veces:");
			else System.out.println("El valor "+buscar+" no aparece en la matriz");
			
			//Indica en que posiciones aparece el numero a buscar
			for(int i=0;i<fil;i++) {
				for(int j=0;j<col;j++) {
					if(buscar == matriz[i][j])
						System.out.println("Lo encuentro en la posicion ["+i+"] ["+j+"]");
				}
			}
		}while (buscar !=-1);
	}

}
