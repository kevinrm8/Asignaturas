import java.util.Scanner;

public class Reto413 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int casos,x,y,claro,oscuro;
		
		
		casos = scanner.nextInt();
		scanner.nextLine();
		
		while(casos > 0) {
			
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		claro = (x*y)/2;
		oscuro = claro;
		
		if(((x*y)%2) != 0) 
			claro++;
			
		System.out.println(claro+" "+oscuro);
		casos--;
		}
		scanner.close();
	}

}
