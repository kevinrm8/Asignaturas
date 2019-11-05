import java.util.Scanner;
/* Nombre: Kevin
 * Fecha: 5/11/2019
 * Descrpcion: Recorrer matriz y sumar los valores de la misma.
 * */


public class Ejercicio58 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int matriz[][],fila,col,valor,total=0,x,y;
		
		System.out.println("Tamaño matrix (X): ");
		x = scanner.nextInt();
		
		System.out.println("Tamaño matrix (Y): ");
		y = scanner.nextInt();

		//Inicializo la matriz con tamaño x, y
		matriz = new int [x][y];
		
		for(fila=0;fila<x;fila++) 
			{
			for(col=0;col<y;col++)
				{
				System.out.println("Valor de la posicion ["+(fila+1)+"],["+(col+1)+"]");
				valor = scanner.nextInt();
				matriz[fila][col] = valor;
				total += matriz [fila][col];
				}
			
			}
		System.out.println("La suma total de los valores es: "+total);
	}

}
