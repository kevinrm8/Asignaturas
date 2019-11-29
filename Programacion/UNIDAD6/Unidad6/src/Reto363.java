import java.util.Scanner;

public class Reto363 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int cal_quema, comilonas,entren,cons_total=0;
		int cal_consumida;
		
		cal_quema = scanner.nextInt();

		while(cal_quema != 0) {
		comilonas = scanner.nextInt();		
		
		for(int i=0;i<comilonas;i++) {
			cal_consumida = scanner.nextInt();	
			cons_total += cal_consumida;
		} 
		entren = cons_total / cal_quema;
		if(cons_total%cal_quema !=0) 
			entren += 1;
		System.out.println(entren);
		cons_total =0;
		cal_quema = scanner.nextInt();
		}
	}

}
