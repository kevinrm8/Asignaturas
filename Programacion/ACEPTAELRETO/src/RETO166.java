import java.util.Scanner;

public class RETO166 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int canalA, canalB,canal1,canal2,posiciones=0,optimo;
		
		do {
			canalA = scanner.nextInt();
			canalB = scanner.nextInt();
			
			canal1 = canalA;
			canal2 = canalB;
			
			while(canal1 != canal2) {
				canal2++;
				if(canal2 >99)
					canal2=1;
				posiciones++;
			}			
			optimo = posiciones;
			posiciones = 0;
			
			canal1=canalA;
			canal2=canalB;
			
			while(canal1 != canal2) {
				canal2--;
				
				if(canal2 == 0)
					canal2=99;
				posiciones++;
			}
			
			if(posiciones<optimo)
				optimo = posiciones;
			if(canalA ==0 & canalB ==0)
				break;
			
			System.out.println(optimo);
			posiciones=0;
		
		}while(canalA != 0 & canalB != 0);
	
		
	}
}
