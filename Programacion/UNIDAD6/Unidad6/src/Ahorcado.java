import java.util.Scanner;

public class Ahorcado {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		String cadena;
		String[] array;
		char letra;
		String buscar;
		
		System.out.println("Palabra:");
		cadena = scanner.nextLine();
		
		array = new String [cadena.length()];

		Secreta(cadena,array); // RELLENO PALABRA CON -
		
		
		
		System.out.println("Dime la letra a buscar:");
		buscar = scanner.nextLine();
		
		letra = buscar.charAt(0);
		
		
//		for(int i=0;i<cadena.length();i++) {
//			if(cadena.charAt(i)==letra) {
//				array[i]=buscar;
//			}
//			System.out.print(array[i]);
//		}
	
		
		
		}
		
		

		
//	String transmision;
//	
//	System.out.println("Introduzca la transmision a cifrar:");
//	transmision = scanner.nextLine();
//	
//	if(transmision.indexOf("el area 51") == -1) 
//		System.out.println("El area 51 no aparece en la retansmision");	
//	else {
//		transmision = transmision.replaceAll("el area 51", "Murcia");
//		System.out.println(transmision);		
//	}

public static void Secreta(String cadena,String[] array) {
	
	for(int i=0;i<cadena.length();i++) {
	array[i] ="-" ;
	System.out.print(array[i]);
}		
	}
}


