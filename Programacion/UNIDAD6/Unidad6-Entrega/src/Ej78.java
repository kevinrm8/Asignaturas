import java.util.Scanner;

public class Ej78 {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		String palabra;
		int intentos=0,aciertos=0,INTENTOS_TOTALES=8;
		char [] separada;
		char [] turespuesta;
		char [] copia;
		char caracter;

		int cont=0;
		int error=0;
		
		System.out.println("JUGADOR1:Introduce la palabra a adivinar:");
		palabra = scanner.nextLine().toLowerCase();
		
		do {
					
			separada = caracter(palabra); // COPIO LA PALABRA EN UN CHAR [], separando cada caracter con espacio
			copia = caracter(palabra); // COPIA AUXILIAR DE LA PALABRA
			
			turespuesta = new char [separada.length]; // Char de respuesta relleno con * 
			for(int i=0;i<separada.length;i++) {
				turespuesta[i] ='*';
			}
			// REPETIR HASTA LLEGAR AL MAXIMO NUMERO DE INTENTOS O ACERTAR LA PALABRA
			while(intentos< INTENTOS_TOTALES && aciertos != turespuesta.length) {
				System.out.print("\nJUGADOR2: La palabra para adivinar es la siguiente: \n");
				Palabraoculta(turespuesta); // MUESTRO LA PALABRA CON * 
			
				System.out.print("\nIntroduce una letra:");
				caracter = scanner.next().toLowerCase().charAt(0);
				cont =0;

				for(int i=0;i<separada.length;i++) { // CAMBIO EN turespuesta EL CARACTER CON EL ARRAY separada ( el original)
					
					if(caracter == turespuesta[i]) {
						System.out.print("\nLa letra "+caracter+" ya se encuentra en la palabra");
						error= -1;
						break;
					}else {
						if(caracter == separada[i]) {
							turespuesta[i]=separada[i];
							aciertos++;
							cont++;
							error = -1;
						}
					}
				}
				if(cont!=0) { // MOSTRAR CUANTAS VECES APARECE LA LETRA
					System.out.print("\nLa letra "+caracter+" estaba en la palabra "+cont+" veces.");
				}
				if(error==0) { // SUMO ERROR SI NO ESTA LA LETRA O YA LA HEMOS PUESTO ANTES
					intentos++;
					errores(intentos); // PARA MOSTRAR POR PANTALLA EL ERORR
				}
				error= 0;
			}
			
			if(aciertos == turespuesta.length) {
			System.out.print("\nPalabra adivinada! Gracias por jugar al AHORCADO" );
			}else { 
				System.out.print("Has fallada y no quedan intentos, la palabra era: ");
				for(int i=0;i<separada.length;i++)
					System.out.print(copia[i]+" ");
			}
		}while(intentos!= 8 && aciertos!= turespuesta.length);
	}
	
	// Separo la palabra en caracteres y lo guardo en un char
	public static char[] caracter(String palabra) {
		char [] letra;
		letra = new char[palabra.length()];
		for(int i=0;i<palabra.length();i++)
			letra [i] = palabra.charAt(i);
		return letra;
	}
	public static void Palabraoculta(char[] turespuesta) { // MUESTRO PALABRA CON ESPACIOS ENTRE *
		for(int i=0;i<turespuesta.length;i++)
			System.out.print(turespuesta[i]+" ");
	}
	public static void errores(int intentos) { // MUESTRO ERRORES
		switch(intentos) {
		case 1: System.out.print("\nError 1 de 8: Te pinto la horca");
			break;
		case 2: System.out.print("\nError 2 de 8: Te pinto la cabeza");
			break;
		case 3: System.out.print("\nError 3 de 8: Te pinto el cuerpo");
			break;
		case 4: System.out.print("\nError 4 de 8: Te pinto el brazo izquierda");
			break;
		case 5: System.out.print("\nError 5 de 8: Te pinto el brazo derecho");
			break;
		case 6: System.out.print("\nError 6 de 8: Te pinto la pierna izquierda");
			break;
		case 7: System.out.print("\nError 7 de 8: Te pinto la pierna derecha");
			break;
		case 8: System.out.print("\nError 8 de 8: AHORCADO\n");
			break;
		}
	}
}
