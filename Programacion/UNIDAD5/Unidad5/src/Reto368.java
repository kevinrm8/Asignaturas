import java.util.Scanner;

public class Reto368 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int huevos,cap,tiempo;

		do {
			huevos = scanner.nextInt();
			cap = scanner.nextInt();			
			
				if(huevos == 0 || cap == 0)
					break;
				else 
					tiempo=huevos/cap;
				if(huevos%cap == 0)
					System.out.println((tiempo*10));
				else System.out.println((tiempo+1)*10);
				
		}while (huevos!=0 && cap != 0);	
	}

}
