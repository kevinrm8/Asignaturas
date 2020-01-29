import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio92 {

	
	/* Nombre: Kevin Rosales martinez
	 * FECHA: 29/1/2020
	 * Ejercicio EUROVISION
	 * */
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int r,ganador=0,cont=0;
		String pais,PaisWin="";
		
		
				
		HashMap <String,Integer> paises = new HashMap <String,Integer> (); // Creamos el HashMap
		System.out.println("¡Bienvenidos al festival de Eurovision!");

		do {
			System.out.println("Introduce nombre del pais "+cont+":");
			pais = scanner.nextLine();
			pais = pais.toLowerCase();
			
			// Comprobamos que hay minimo de 3 paises y al escribir 'salir' terminamos de introducir
			if ( pais.equals("salir") && paises.size()<3) { 
				System.out.println("Minimo de paises 3");
			}
			// Si el pais introducido no es la palabra 'salir' lo introducimos en el hashmap con sus votos de forma aleatoria
			if(!pais.equals("salir")){	
				r = ThreadLocalRandom.current().nextInt(1,12); // Creamos num aleatorio
				paises.put(pais,r);
				cont++;
				if(r>=ganador) {
					ganador = r;
					PaisWin = pais;
					}
				}
			
		} while ( !pais.equals("salir") || paises.size()<3);
		
		// MOSTRAMOS GANADOR
		System.out.println("Con las puntuaciones repartidas, el país ganador es: "+ PaisWin); 
		
		
		do {//Preguntamos un pais en particular para saber sus votos
			System.out.println("Introduzca nombre de pais para saber su puntuacion: ");
			pais = scanner.nextLine();
			pais = pais.toLowerCase();
			
			if(pais.equals("salir")) {// Si escribimos salir se acaba el programa
				System.out.println("Se acabo EUROVISION, adios!");
				break;
				}
			//Si no esta el pais escrito volvemos a preguntar
			if(!paises.containsKey(pais)) {
				System.out.println(pais+" No ha participado en el festival");
			}else System.out.println(paises.get(pais));// Si el pais esta entonces devolvemos sus votos
		
			
		} while ( !pais.equals("salir"));
		
		
		
	}

}
