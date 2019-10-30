import java.util.Scanner;

public class Ejercicio49 {
	/*Nombre: Kevin Rosales
	 * Fecha: 24/10/19
	 *  Resumen: Contar lo que hay dentro de un array
	 *  */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int lista[] = {-1,-2,-3,-4,0,0,7,8,9,10};
		int i,positivo=0,negativo=0,cero=0;
		
		
		for(i=0;i<lista.length;i++) {
			if(lista[i]>0)
				positivo++;
			else {
				if(lista[i]<0)
					negativo++;
				else cero++;
			}
									}
		System.out.printf("Hay un total de %s numeros positivos, %s de numeros negativos y %s de ceros",positivo,negativo,cero);
		
	}

}
