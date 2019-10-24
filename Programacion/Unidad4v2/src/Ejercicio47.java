import java.util.Scanner;

public class Ejercicio47 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	int codigo,combinacion,intentos=3;
	
	codigo = 1234;
	
	do {
		System.out.println("Dime tu codigo para abrir la caja (4 cifras)");
			combinacion = scanner.nextInt();
			
			if(combinacion ==codigo) {
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
								}else {
									intentos--;
									System.out.printf("Lo siento, esa no es la combinacion. Te quedan %s intentos.",intentos);
									System.out.println();
										}
		}while (intentos!=0 || combinacion == codigo);
	 
	System.out.println("Se acabaron los intentos, no se puede abrir");
	
		}
	}
