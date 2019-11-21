import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char[] caracola;
		String cadena;
		
		cadena = scanner.nextLine();
		caracola = new char [cadena.length()];
		
		for(int i=0;i<cadena.length();i++)
		
		caracola[i] =cadena.charAt(i); 
		
		System.out.println(caracola[5]);

		
	}

}
