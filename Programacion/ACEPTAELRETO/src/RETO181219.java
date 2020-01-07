import java.util.Scanner;

public class RETO181219 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int casos =0;
		int botella =0;
		int persona =0;
		casos = scanner.nextInt();
		
		while(casos >0) {
			botella = scanner.nextInt();
			botella = botella *8;
			
			do {
				persona = scanner.nextInt();
				
				if(persona>=botella) {
					break;
				}
				
			}while(persona!= 0);
			
			casos --;
		}
		
		
		
	}

}
