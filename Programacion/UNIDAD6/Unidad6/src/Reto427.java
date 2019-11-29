import java.util.Scanner;

public class Reto427 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String nombre,parentesco;
		int casos;
		
		casos = scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<casos;i++) {
			nombre = scanner.nextLine();
			parentesco = scanner.nextLine();
		
			if(nombre.equals("Luke") && parentesco.equals("padre"))
				System.out.println("TOP SECRET");
			else
				System.out.println(nombre+", yo soy tu "+parentesco);
		
		}
	}

}
