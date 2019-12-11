import java.util.Scanner;

public class Reto434 {
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int casos,palomas, cajas;
		casos = scanner.nextInt();
		
		while(casos>0) {
		palomas = scanner.nextInt();
		cajas = scanner.nextInt();
		
		if(palomas > cajas) {
			System.out.println("PRINCIPIO");
		}else 
			System.out.println("ROMANCE");
		casos --;
		}
		
		
		
	}

}
