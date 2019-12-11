import java.util.Scanner;

public class Reto380 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int boda,gastos,total=0,cont=0;

		do {
			boda = scanner.nextInt();

			total = 0;
			cont = boda;
			
		while(cont > 0) {
			
			gastos = scanner.nextInt();
			total += gastos;
			cont --;
		}
		if(boda != 0)
			System.out.println(total);	
		
		}while(boda > 0);
	}
	
}
