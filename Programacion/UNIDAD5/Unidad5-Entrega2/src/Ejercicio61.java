import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio61 {
	/* Nombre: Kevin Rosales
	 * Fecha: 6/11/2019
	 * Descipcion: Crear un vector, con un menu.
	 * */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int opcion,tamanyo;
		int[] vector;
		
		System.out.println("Dime el tamaño del vector:");
		tamanyo=scanner.nextInt();
		
		//Declaramos el tamaño del vector
		vector = new int[tamanyo];
		
		do { // MENU
			System.out.println("-------------Pulse una opcion del menu:----------------");
			System.out.println("1-Rellenar vector por teclado");
			System.out.println("2-Rellenar vector de forma aleatoria (nums de 1 a 100");
			System.out.println("3-Modificar una posicion del vector");
			System.out.println("4-Consultar una posicion del vector");
			System.out.println("5-Mostrat todo el vector");
			System.out.println("6-Ordenar ascendentemente el vector");
			System.out.println("9-Salir");
			System.out.println("--------------------------------------------------------");

			opcion= scanner.nextInt();
			// SEGUN LA OPCION DEL MENU
			switch(opcion) {
			case 1: vector = opcion1(vector,tamanyo);
				break; 
					
			case 2: vector = opcion2(vector);
				break;
				
			case 3: vector = opcion3(vector,tamanyo);
				break;
				
			case 4: opcion4(vector,tamanyo);
				break;
				
			case 5: opcion5(vector);
				break;
				
			case 6: vector = opcion6(vector);
				break;
				
			case 9: opcion9(); // FIN DEL PROGRAMA
				break;

			}
	}while (opcion !=9);

	}
	
	public static int[] opcion1(int[] vector,int tamanyo) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		//Rellenar el vector manualmente
		for(int i=0;i<vector.length;i++) {
			System.out.println("Dime el valor "+(i+1)+" de "+tamanyo+":");
			num=scanner.nextInt();
			vector[i]=num;
		}
		System.out.println("");
		return vector;
	}
	
	public static int[] opcion2(int[] vector) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		
		for(int i=0;i<vector.length;i++) {
			num = (int) (Math.random()*100+1);
			vector[i]=num;
		}
		return vector;
	}
	
	public static int[] opcion3(int[] vector,int tamanyo) {
		Scanner scanner = new Scanner(System.in);
		
		int posicion,nuevo;
		do {
			System.out.println("Introduzca una posicion del vector:");
			posicion=scanner.nextInt();
	
			if(posicion<=0 || posicion>tamanyo){
				System.out.println("La posicion esta fuera del rango");
			}
		}while(posicion<=0 || posicion>tamanyo);
		
		System.out.println("¿Que valor quiere introducir en la posicion "+posicion+"?");
		nuevo = scanner.nextInt();
		
		vector[posicion-1] =nuevo;
		return vector;
		
	}
	
	public static void opcion4(int[] vector, int tamanyo) {
		Scanner scanner = new Scanner(System.in);

		int posicion,nuevo;
		do {
			System.out.println("Introduzca una posicion del vector:");
			posicion=scanner.nextInt();
	
			if(posicion<=0 || posicion>tamanyo){
				System.out.println("La posicion esta fuera del rango");
			}
		}while(posicion<=0 || posicion>tamanyo);
		
		System.out.println("El valor contenido en "+posicion+" es: "+vector[(posicion-1)]);
		
	}
	
	public static void opcion5(int[] vector) {
		Scanner scanner = new Scanner(System.in);
		//Mostramos el vector
		System.out.print("[");
		for(int i=0; i<vector.length;i++) {
			System.out.print(vector[i]);
			if(i<vector.length-1)
				System.out.print(",");
		}
		System.out.print("]");
		System.out.println("");
			
	}
	
	public static int[] opcion6(int[] vector) {
		Scanner scanner = new Scanner(System.in);
		
		//Con Arrays.sort ordenamos de menor a mayor y lo devuelve.
		Arrays.sort(vector);
		return vector;
	}
	
	public static void opcion9() { // Para terminar el programa
		System.out.println("Gracias por utilizar este menu");
	}
}
