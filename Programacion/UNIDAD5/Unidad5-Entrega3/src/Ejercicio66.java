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
		int fil,col,inf,sup,buscar=0,cont=0,control=0;
		String salir="";
		
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
			
			
			do {
				 control=0;
				try {
					System.out.println("¿Que numero quieres buscar en la matriz?(-1 para salir)");
					salir=scanner.nextLine(); 
	 			
					if(salir.contentEquals("salir")) //salir del bucle Do
						break;
					else
						buscar = Integer.parseInt(salir);
	 			
				} catch (NumberFormatException e) {
					control =1;
					System.out.println("Datos introducidos incorrectos");
					}
				}while (control != 0);
			
			if(salir.contentEquals("salir")) // sale del segundo bucle DO
				break;
			
			cont = 0;
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
