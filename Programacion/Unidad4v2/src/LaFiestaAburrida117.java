import java.util.Scanner;

public class LaFiestaAburrida117 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int gente;
		String nombre;
		
		gente = scanner.nextInt();		
		scanner.nextLine();
		
		for(int i=0;i<gente;i++) {
			
			nombre = scanner.nextLine();
			String[] part = nombre.split(" ");
		
			System.out.println("Hola, "+part[1]+".");
								}
	}

}
