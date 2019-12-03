import java.util.Scanner;

public class Reto313 {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cant=0,banco,gasto;
		cant = scanner.nextInt();		
		while ( cant > 0){
				banco = scanner.nextInt();
				gasto = scanner.nextInt();
				if((banco+gasto)>=0)
					System.out.println("SI");
				else 
					System.out.println("NO");	
				cant--;
		}
	}
}
