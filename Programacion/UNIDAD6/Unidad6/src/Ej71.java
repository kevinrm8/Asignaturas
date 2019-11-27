import java.util.Scanner;

public class Ej71 {
	
	/* Comprobar numeros primos con metodos.
	 * 
	 * */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N,cont=0;
		
		System.out.println("Numero para comprobar si es primo:");
		N = scanner.nextInt();
		
		if(esPrimo(N)) {
			System.out.println("El numero es Primo");
		}else System.out.println("El numero no es primo");
		
		
		System.out.println();
		
		for(int i=2;i<1000;i++) {
			
			if(esPrimo(i)) {
				if(cont<3) {
					System.out.print(i+" ");
					cont++;
				}else {
					System.out.println(i+" ");
					cont = 0;	
				}
			}
		} // FIN for
		
	}
	
	private static boolean esPrimo(int n) {
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}		
		}
		return true;
		
		
	} // FIN esPrimo()

}
