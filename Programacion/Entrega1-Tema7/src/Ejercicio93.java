import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio93 {

	/* Nombre: Kevin Rosales
	 * Fecha: 29/01/2020
	 * Descripcion: Cola del cine
	 * */
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String nombre;
		String[] part; //creamos String auxiliar para separar los nombres de los @
		int cansados,i;
		
		Queue <String> colacine = new LinkedList<String>();
		
			//ENTRAR EN LA COLA
		
		do { // Introducimos la gente de la cola
			System.out.println("Introduzca nombres para ENTRAR separados por @, 'nadie' para que no entre nadie o 'salir' para terminar el programa:");
			nombre = scanner.nextLine();
			nombre = nombre.toLowerCase(); // Lo pasamos a miniscula
			
			if(nombre.equals("salir")) // Para dejar de introducir
				break;
			if(nombre.equals("nadie"))  // Si no queremos meter a nadie	
				{
				System.out.println("Estado de la cola despues de ENTRAR:");
				mostrar(colacine); // Mostrar el Queue
				}
			
				else{
					part = nombre.split("@");// Separamos por el @
				
					for( i=0;i<part.length;i++)
						colacine.add(part[i]); // Introducimos en el Queue los nombres ya separados
					System.out.println("Estado de la cola despues de ENTRAR:");
					mostrar(colacine);
						}	
			
			//PARA SALIR ALGUIEN DE LA COLA
			salircola(colacine);
			
		} while ( !nombre.equals("salir"));
	}
	
	//para mostrar el Queue
	private static void mostrar(Queue<String> colacine) {
		Iterator iter = colacine.iterator(); // Para recorrer el Queue y mostrarlo
		while(iter.hasNext()) {
			System.out.println(iter.next());
			}		
	}

	//Para indicar cuantos salen de la cola
	private static void salircola(Queue<String> colacine) {
		
		int i,cansados;
		
		do {
			System.out.println("Introduzca numero de personas para SALIR de la cola:");
				cansados = scanner.nextInt();
				scanner.nextLine();
				
				if(cansados> colacine.size()) {//Comprobacion que hay suficientes personas para sacarlas de la fila
					System.out.println("No pueden salir "+cansados+" personas porque en la cola solo hay "+colacine.size());
				}else {
					
					for(i=0;i<cansados;i++) {
						System.out.println("Sale de la cola: "+colacine.element());
						colacine.remove(); // Eliminar el primero de la cola
						
						} 
					System.out.println("Estado de la cola despues de SALIR:");
					mostrar(colacine);
					break; // Salimos si sacamos alguien de la fila
				}
			}while(cansados>colacine.size());
	}
	
	}