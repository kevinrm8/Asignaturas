import java.util.Scanner;

public class Ej77 {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
	/* Nombre: Kevin Rosales
	 * Fecha: 4/12/2019
	 * Descripcion: Pasar de numeros a palos
	 * */
		
		int numero;
		int tamanyo;
		int digito;
		int DigitoPosicion;
		String codigo;
	
		System.out.println("Escribe el numero para pasar a letra");
		numero = scanner.nextInt();
		
		tamanyo = longuitud(numero); // Sacar tamaño del numero
		
		for( int i=tamanyo;i>0;i--) {
			 DigitoPosicion = Posdigito(numero,i);

			codigo = convierteEnPalotes(DigitoPosicion);
			System.out.print(codigo);
			
			if(i!=1) // Para separar los palotes excepto en el ultimo que no escribira -
				System.out.print("-");
		}
	}

		
	public static int longuitud(int numero) { // CONTAR CUANTAS POSICIONES TIENE EL NUMERO
		int n=0;
		
		while(numero != 0) {
			numero = numero/10;
			n++;
		}
		return n;
	}
	
	public static int Posdigito(int numero, int Posicion) { // DEVUELVO EL NUMERO EN LA POSICION QUE LE PASAMOS
		
		int DigPos=0;
		for(int i=0;i<Posicion;i++) {
			DigPos=numero%10;
			numero= numero/10;
		}
		return DigPos;
	}
	
	public static String convierteEnPalotes(int DigitoPosicion) {
		String cadena="";
		switch(DigitoPosicion) {
			case 0: 
				return cadena="";
			case 1: 
				return cadena="|";
			case 2: 
				return cadena="||";
			case 3: 
				return cadena="|||";
			case 4: 
				return cadena="||||";
			case 5:
				return cadena="|||||";
			case 6: 
				return cadena="||||||";
			case 7: 
				return cadena="|||||||";
			case 8: 
				return cadena="|||||||";
			case 9:
				return cadena="|||||||||";
		}
		return cadena;
	}
}

