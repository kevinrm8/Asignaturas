import java.util.Scanner;

public class Reto252 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String frase="";
		String frase2;
		String prueba;
		String[] partes;
		String[] letras;
		do {
			frase2="";
			prueba="";
			frase = scanner.nextLine();
		if(frase.equals("XXX"))
			break;
		
			partes = frase.split(" ");
			for(int i=0;i<partes.length;i++) {
				prueba += partes[i];
			}
			letras =prueba.split("");
			for (int i=0;i<letras.length;i++)
				frase2 = letras[i] + frase2;
			
			if(prueba.equalsIgnoreCase(frase2)) {
				System.out.println("SI");
			} else 
				System.out.println("NO");
			
		}while(frase.equals("XXX")== false);
	}
}
