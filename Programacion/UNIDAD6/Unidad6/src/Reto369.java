import java.util.Scanner;

public class Reto369 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cant;
		
		do {
		cant = scanner.nextInt();
		
			if(cant == 0) break;
			for(int i=0;i<cant;i++) {
				System.out.print("1");
				}
			System.out.println();
		}while(cant !=0);
	}
}
