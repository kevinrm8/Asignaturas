import java.util.Scanner;

public class Ejercicio29 {
	//PASAR DE miniscula a MAYUSCULA

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String frase, FRASE;
		
		System.out.println("Introduce frase en miniscula: ");
		frase = scanner.nextLine();
		
		FRASE = frase.toUpperCase(); //LO QUE PASA A MAYUSCULAS
		
		System.out.println("Tu frase en miniscula es: "+frase);
		System.out.println("y en MAYUSCULAS es: "+FRASE);
		
	}

}
