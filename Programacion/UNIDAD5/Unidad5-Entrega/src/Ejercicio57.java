import java.util.Scanner;

public class Ejercicio57 {
	/* Nombre: Kevin Rosales
	 * Fecha: 30/10/19
	 * Descripcion: Programa para manejar cadenas.
	 * */


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int opcion,inicio,fin;
		String cadena,cadena1,cadenainvertida="";
		do { // MENU
			System.out.println("1-Longitud de una cadena");
			System.out.println("2-Comparacion de dos cadenas");
			System.out.println("3-Concatenacion de dos cadenas");
			System.out.println("4-Obtener subcadenas");
			System.out.println("5-Invertir subcadenas");
			System.out.println("6-Es palindromo");
			System.out.println("9-Salir");
			opcion= scanner.nextInt();

			switch(opcion) {
			case 1: 
				System.out.println("Introduce cadena:");
				cadena = scanner.next();
				System.out.println("La longuitud de la cadena es: "+cadena.length());
				
				break;
			case 2: 
				System.out.println("Introduce cadena:");
				cadena = scanner.next();
				System.out.println("Introduce otra cadena:");
				cadena1 = scanner.next();
				// COMPARAMOS CADENA SEGUN RESULTADO SABEMOS CUAL ES MAYOR
				int diferencia = cadena.compareTo(cadena1);
				
				if(diferencia >0)
					System.out.println("La cadena " +cadena+ " es mayor que "+cadena1);
				if(diferencia<0)
					System.out.println("La cadena " +cadena1+ " es mayor que "+cadena);
				else System.out.println("Las cadenas son iguales.");
				
				break;
			case 3: 
				System.out.println("Introduce cadena:");
				cadena = scanner.next();
				System.out.println("Introduce otra cadena:");
				cadena1 = scanner.next();
				
				String cadena2 = cadena.concat(cadena1);
				System.out.println(cadena2);
				
				break;
			case 4: 
				System.out.println("Introduce cadena:");
				cadena = scanner.next();
				// DECIMOS INICIO Y FIN, para crear la subcadena
				System.out.println("Inicio de la subcadena:");
				inicio = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Inicio de la subcadena:");
				fin = scanner.nextInt();
				scanner.nextLine();
				//Muestra la subcadena
				System.out.println(cadena.substring(inicio,fin));
				break;
			case 5: 
				System.out.println("Introduce cadena:");
				cadena = scanner.next();
				//Invierte la cadena, la guardamos en otra variable.
				for(int i=cadena.length()-1;i>=0;i--)
					cadenainvertida = cadenainvertida +cadena.charAt(i);
					
				System.out.println("La cadena invertida es: "+cadenainvertida);
				break;
			case 6: /* Al invertir la cadena, igual que el anterior, si las cadenas son 
					 iguales es porque es un palindromo */
				System.out.println("Introduce cadena:");
				cadena = scanner.next();
				
				for(int i=cadena.length()-1;i>=0;i--)
					cadenainvertida = cadenainvertida +cadena.charAt(i);
				if(cadena == cadenainvertida)
					System.out.println("Es palindromo");
				else System.out.println("No es un palindromo");
				
				break;
			case 9: 
				// FIN DEL PROGRAMA
				System.out.println("FIN DEL PROGRAMA");
				break;
			} 
			}while (opcion!=9);
			
			}
		}
		
		
		

		
		
		
	


