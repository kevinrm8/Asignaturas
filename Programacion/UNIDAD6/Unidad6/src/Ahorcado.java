import java.util.Scanner;

public class Ahorcado {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		String palabra;
		int intentos=0,aciertos=0,INTENTOS_TOTALES=5;
		char respuesta;
		char [] separada;
		char [] turespuesta;
		char caracter;
		char []copia;
		
//		System.out.println("Palabra:");
//		palabra = scanner.nextLine();
		
		do {
			System.out.println("Palabra:");
			palabra = scanner.nextLine();
			
			
			separada = caracter(palabra);
			copia = caracter(palabra);
			
			turespuesta = new char [separada.length]; // Char de respuesta relleno con - 
			for(int i=0;i<separada.length;i++) {
				turespuesta[i] ='-';
			}
			
			while(intentos< INTENTOS_TOTALES && aciertos != turespuesta.length) {
				Palabraoculta(turespuesta);
			
				System.out.print("\nIntroduce una letra:");
				caracter = scanner.next().toLowerCase().charAt(0);
			
				for(int i=0;i<separada.length;i++) {
					if(caracter == separada[i]) {
						turespuesta[i]=separada[i];
						separada[i] = ' ';
						aciertos++;
					}
				}
					intentos++;
			}
			
			if(aciertos == turespuesta.length) {
			System.out.print("\nFelicidades, has acertado la palabra " );
			Palabraoculta(turespuesta);
			}else { 
				System.out.print("Has fallada y no quedan intentos, la palabra era: ");
				for(int i=0;i<separada.length;i++)
					System.out.print(copia[i]+" ");
			}
			
			respuesta = pregunta("\nQuiere volver a jugar?",scanner);
			
			
			//RESET DE ACIERTOS E INTENTOS
			aciertos =0;
			intentos=0;
			
		}while(respuesta != 'n');
	}
	
	// Separo la palabra en caracteres y lo guardo en un char
	public static char[] caracter(String palabra) {
		char [] letra;
		letra = new char[palabra.length()];
		for(int i=0;i<palabra.length();i++)
			letra [i] = palabra.charAt(i);
		return letra;
	}
	public static void Palabraoculta(char[] turespuesta) {
		for(int i=0;i<turespuesta.length;i++)
			System.out.print(turespuesta[i]+" ");
	}
	
	 public static char pregunta(String men, Scanner scanner) {
	        char resp;
	        System.out.println(men + " (s/n)");
	        resp = scanner.next().toLowerCase().charAt(0);
	        while (resp != 's' && resp != 'n') {
	            System.out.println("Error! solo se admite S o N");
	            resp = scanner.next().toLowerCase().charAt(0);
	        }
	        return resp;
	    }
}


