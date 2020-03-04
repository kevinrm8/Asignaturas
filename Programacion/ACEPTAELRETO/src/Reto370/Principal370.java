package Reto370;

import java.util.Scanner;

public class Principal370 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int casos,a,b,menor,mayor;
		String llaves;
		String [] vector;

		casos = scanner.nextInt();scanner.nextLine();
		
		for (int i = 0; i < casos; i++) {
			
				llaves = scanner.nextLine();
				vector = llaves.split("-");
				a = Integer.parseInt(vector[0]);
				b = Integer.parseInt(vector[1]);
				
				if(a>b) {
					mayor = a;
					menor = b;
				}else {
					mayor = b;
					menor = a;
				}

				if(mayor-menor ==1 && menor%2 ==0) {
						System.out.println("SI");
					}else 
						System.out.println("NO");
				
				}
		}
		
		
	}
