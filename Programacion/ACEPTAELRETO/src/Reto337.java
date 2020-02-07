import java.util.Scanner;

public class Reto337 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int casos,sum=0,sonrisa=0,dient[] = new int[6],dient2[] = new int[6];
		
			
		casos = scanner.nextInt();
		
		//CASOS
		for(int e=0;e<casos;e++) {
			
			for(int i =0;i<6;i++) {
				dient[i] = scanner.nextInt();
			}
			for(int i=0;i<6;i++) {
				dient2[i]= scanner.nextInt();
			}
			sum=0;
			sum = dient[0]+dient2[0];
			
			for(int i=1;i<6;i++) {
				if(dient[i]+dient2[i]!= sum) {
					sonrisa=-1;
				}
			}
			if(sonrisa==0) {
				System.out.println("SI");
			}else 
				System.out.println("NO");
			sonrisa = 0;
			
			
		}//FIN CASOS
		
		
	}

}
