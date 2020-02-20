package reto221;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int casos,cont=0,ticket,pares=0,impares=0;
		casos = scanner.nextInt();
		int[] butaca;
		
		for(int i=0;i<casos;i++) {
			
			ticket=scanner.nextInt();
			butaca = new int[ticket];

			for(int z=0;z<ticket;z++) {
				butaca[z] = scanner.nextInt();
				}
			
			for(int j=0;j<ticket;j++) {
				if(butaca[j]%2==0) {
					pares++;
				}else { 
					break;
					}
			}
			for(int j=ticket-1;j>=0;j--) {
				if(butaca[j]%2!=0) {
					impares++;
				}
			}
			
			if(pares+impares == ticket) {
				System.out.println("SI "+pares);
			}else System.out.println("NO");
			
			pares=0;
			impares=0;
		}
	}
}
