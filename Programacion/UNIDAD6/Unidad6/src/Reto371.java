import java.util.Scanner;

public class Reto371 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int lado,cerillas,triangulo,cer_total = 0;
		do {
			lado = scanner.nextInt();
			if(lado == 0)
				System.exit(0);
			
			for(int i=1;i<=lado;i++) {
				cerillas = 3*i;
				cer_total += cerillas;	
			}
			System.out.println(cer_total);
			cer_total=0;
		}	while (lado != 0);
	}
}
