package Reto407;

import java.util.*;

public class Parchis {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int c,p,t,aux,suma;
		
		do {
			c =scanner.nextInt();
			p =scanner.nextInt();			
			t =scanner.nextInt();
			
			if(c==0 & p == 0 & t ==0) {
				break;
			}
			suma = p+t;
			if((suma)<c) {
				p = p+t;
			}
			if((suma)==c) {
				p=suma;
			}
			if((suma)>c) {
				aux=suma-c;
				p = c-aux;
			}
			System.out.println(p);
			
		}while(c!=0 & p != 0 & t !=0);
	}

}
