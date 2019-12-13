import java.util.Scanner;

public class Reto480 {

	public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			int i,restantes=0,casos,uvas,malas,x,aux,total_malas=0;
			casos = scanner.nextInt();
			
			while(casos>0) {
				uvas = scanner.nextInt();
				malas = scanner.nextInt();
				x = scanner.nextInt();
				
				for(i=0;i<(uvas/x);i++) {
					if((uvas - x) > 0);
						total_malas += malas;
				}

				restantes = uvas - ((uvas/x)*x);
				
					if(restantes>malas)
						total_malas += malas;
					else 
						total_malas += restantes;
				
				System.out.println(total_malas);
				total_malas=0;
				casos --;
			}	
		}
	}


