import java.util.Scanner;

public class Reto158 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int arriba=0,abajo=0,muros,muro,casos,ant;
		
		casos = scanner.nextInt();	
		
		while(casos>0) {
			muros = scanner.nextInt();
			
			muro = scanner.nextInt();
			
			while(muros >1) {
				ant = muro;
				
				muro = scanner.nextInt();
				
				if(ant<muro) 
					arriba++;
				
				if(ant>muro)
					abajo++;
				
				muros--;
			}
			System.out.println(arriba+" "+ abajo);
			
			arriba =0;
			abajo = 0;
			
			casos --;
		
		}
	}

}
