import java.util.Scanner;

public class Retp293 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int caso,patas,insec,aracn,crus,escal,anillos;
			
		caso= scanner.nextInt();
			
			while(caso>0) {
		
			insec = scanner.nextInt();
			aracn = scanner.nextInt();
			crus = scanner.nextInt();
			escal = scanner.nextInt();
			anillos = scanner.nextInt();
							
			patas = insec*6+aracn*8+crus*10+(escal*anillos*2);
			System.out.println(patas);
			caso --;
			}		
	}
}
