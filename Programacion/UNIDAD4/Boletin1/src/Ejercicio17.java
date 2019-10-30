import java.util.Scanner;

/* Nombre: Kevin
 * Fecha:04/10/19
 * Descripcion: Psar de Mb a byte, Kb, MB, GB, TB
 * */

public class Ejercicio17 {

	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float valor;
		
		System.out.println("Dime el valor de Mb "); // Leemos el valor de Mb y lo guardamos en "valor"
		valor = scanner.nextFloat();
		scanner.hasNextLine();

		System.out.println("byte\t\tKB\t\tMB\tGB\t\tTB"); // Imprimimos por pantalla de forma ordenada con "\t" 
		System.out.println((valor*Math.pow(1024, 2))+"\t"+(valor*1024)+"\t\t"+valor+"\t"+(valor/1024)+"45\t"+(valor/Math.pow(1024,2)));
	}

}
