import java.util.Scanner;

public class Ej74 {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	
		String cadena;
		
		System.out.println("Escriba la cadena:");
		cadena = scanner.nextLine();
		
		imprimeCajaTexto(cadena);
		
	}

	public static void imprimeCajaTexto(String cadena) {
	
		int tamanyo = cadena.length() + 2;
		imprimirAst(tamanyo); // Linea de *
		
		System.out.println();
		
		for(int i=0;i<tamanyo;i++) {
			if(i==0 || i==tamanyo-1)
				System.out.print("*");
			else System.out.print(" ");
		}
		
		System.out.println();
		
		System.out.println("*"+cadena+"*");
		
		for(int i=0;i<tamanyo;i++) {
			if(i==0 || i==tamanyo-1)
				System.out.print("*");
			else System.out.print(" ");
		}
		
		System.out.println();
		
		imprimirAst(tamanyo); // Linea de *

	}

	public static void imprimirAst(int tamanyo) {
		
		for(int i=0;i<tamanyo;i++)
		System.out.print("*");
	}

}
