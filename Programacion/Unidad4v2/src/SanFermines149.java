import java.util.Scanner;

public class SanFermines149 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int max=0;
		String toros;
		
		toros = scanner.nextLine();
		String[] part = toros.split(" ");
		int cantToros = Integer.parseInt(part[0]);
		
		if(cantToros >=1) {
			for(int i=1;i<=cantToros;i++) {
				max = Integer.parseInt(part[i]);
				if(Integer.parseInt(part[i])>max) 
					max=Integer.parseInt(part[i]);
			} System.out.println(max);	
			
		}
	}
}