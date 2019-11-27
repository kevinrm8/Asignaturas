import java.util.Scanner;

public class Ej73 {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String transmision;
		
		System.out.println("Introduzca la transmision a cifrar:");
		transmision = scanner.nextLine();
		
		if(transmision.indexOf("el area 51") == -1) 
			System.out.println("El area 51 no aparece en la retansmision");	
		else {
			transmision = transmision.replaceAll("el area 51", "Murcia");
			System.out.println(transmision);		
		}
	}
}
