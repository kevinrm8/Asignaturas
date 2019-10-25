import java.util.Scanner;

public class LaFiestaAburrida117b {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int gente;
		String nombre,soy;
		
		gente = scanner.nextInt();		
		scanner.nextLine();
		
		for(int i=0;i<gente;i++) {
			
			soy = scanner.next();
			nombre = scanner.next();
		
			System.out.println("Hola, "+nombre+".");
								}
	}

}
