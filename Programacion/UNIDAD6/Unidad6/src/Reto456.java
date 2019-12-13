import java.util.Scanner;

public class Reto456 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int casos,n,m,r,aux;
		casos = scanner.nextInt();
		
		while(casos>0) {
			
			n = scanner.nextInt();
			m = scanner.nextInt();
			r = scanner.nextInt();
	
			aux = r/(n*m);
				if( r % (n*m) != 0 ) 
					aux ++;
				
			System.out.println(aux);
			
			casos --;
		}	
	}
}
