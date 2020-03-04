package Reto359;

import java.util.*;

public class Principal359 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int casos,cont=0,concha,suma=0;

		casos = scanner.nextInt();
		for (int i = 0; i < casos; i++) {
			suma = 0;
			cont = 0;
			concha = scanner.nextInt();
			while(concha != -1) {
				suma +=concha;
				cont++;
				concha = scanner.nextInt();

			}
			
			if(cont>suma) {
				System.out.println("Timo");
			}
			if(cont==suma) {
				System.out.println("Justo");
			}
			if(cont<suma) {
				System.out.println("Suerte");
			}
		}
	}

}
