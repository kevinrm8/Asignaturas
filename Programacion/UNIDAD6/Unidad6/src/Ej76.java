import java.util.Scanner;

public class Ej76 {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero,opcion=0;
		
		while(opcion != 3) {
			System.out.println("Introduzca un numero");
			numero = scanner.nextInt();
			System.out.println("Introduzca una opcion:");
			System.out.println("1-Realizar el sumatorio de "+numero);
			System.out.println("2-Realizar el factorial de "+numero);
			System.out.println("3-Salir de este programa");
			
			opcion = scanner.nextInt();
			Elegir(opcion,numero);
		}
	}

	private static void Elegir(int opcion,int numero) {
		
		switch(opcion) {
		case 1: 
			System.out.println("El sumatorio de "+numero+" es: "+sumatorio(numero));
			break;
		case 2: 
			System.out.println("El factorial de "+numero+" es: "+factorial(numero));
			break;
		case 3: 
			System.out.println("ADIOS!");
			break;
		}		
	}

	public static double sumatorio(int numero) {
		int suma=0;
		
		for(int i=1;i<=numero;i++) {
			suma += i;
		}
		return suma;
	}
	
	public static double factorial(int numero) {
		double fact=numero;
		
		for(int i=1;i<numero;i++) {
			fact *=i;
		}
		return fact;
	}

}
