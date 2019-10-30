import java.util.Scanner;

public class QueLadoDeLaCalle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int entrada;
		do {
		entrada = scanner.nextInt();
			if (entrada != 0) {
				if(entrada%2==0) {
					System.out.println("DERECHA");
				}else System.out.println("IZQUIERDA");
						}
			} while(entrada !=0);	
	}
}