import java.util.Scanner;

public class Acepta140 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero,digito,suma=0,invertido=0,resto;
		
		numero = scanner.nextInt();

		do {	
			
			while(numero > 0) {
			resto= numero %10;
			invertido = (invertido *10) + resto;
			numero/=10;
			}
							
				while(invertido >= 0) { 
					digito = invertido %10;
					invertido = invertido /10;
		
					suma += digito;
					
					System.out.print(digito);
					if(invertido > 0) {
						System.out.print(" + ");
					}
					if (invertido == 0) break;
				}
				System.out.print(" = "+suma); 
				System.out.println();	
					
				numero = scanner.nextInt();
				suma=0; 
				
		}while (numero >=0);
	}
}
