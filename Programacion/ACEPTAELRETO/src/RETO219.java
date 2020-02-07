import java.util.Scanner;

public class RETO219 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int casos,decimos,comprar,cont=0;
		casos = scanner.nextInt();
		scanner.nextLine();
		
		while (casos>0) {
			decimos = scanner.nextInt();
			scanner.nextLine();
			cont=0;
			
			for(int i=0;i<decimos;i++) {
				comprar=scanner.nextInt();
				if(comprar%2==0) {
					cont++;
				}
				
			}
			System.out.println(cont);
			casos--;
		}

	}
}
