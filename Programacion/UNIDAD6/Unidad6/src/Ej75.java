import java.util.Scanner;

public class Ej75 {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Escribe el numero para pasar a letra");
		numero = scanner.nextInt();
		
		convierteEnPalabras(numero);
		
		
	}

	public static void convierteEnPalabras(int numero) {
		
		int tamanyo;
		int digito;
		
		tamanyo = longuitud(numero); // Sacar tamanyo del numero
		
		for( int i=tamanyo;i>0;i--) {
			int DigitoPosicion = Posdigito(numero,i);

			Escribe(DigitoPosicion);
			
			if(i!=1)
				System.out.print(",");
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
	
	
	public static int Posdigito(int numero, int Posicion) {
		
		int DigPos=0;
		for(int i=0;i<Posicion;i++) {
			DigPos=numero%10;
			numero= numero/10;
		}
		return DigPos;
	}
	
	public static void Escribe(int DigitoPosicion) {
		
		switch(DigitoPosicion) {
			case 0: 
				System.out.print("cero");
				break;
			case 1: 
				System.out.print("uno");
				break; 
			case 2: 
				System.out.print("dos");
				break; 
			case 3: 
				System.out.print("tres");
				break; 
			case 4: 
				System.out.print("cuatro");
				break; 
			case 5:
				System.out.print("cinco");
				break; 
			case 6: 
				System.out.print("seis");
				break; 
			case 7: 
				System.out.print("siete");
				break; 
			case 8: 
				System.out.print("ocho");
				break; 
			case 9:
				System.out.print("nueve");
				break; 
		}
		
	}
}
