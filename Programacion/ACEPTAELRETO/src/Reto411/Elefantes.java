package Reto411;

import java.util.Scanner;

public class Elefantes {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		long kilos, elefantes, suma = 0, cont;

		do {
			kilos = scanner.nextLong();
			if (kilos == 0)
				break;
			cont = 0;
			suma = 0;
			do {
				elefantes = scanner.nextLong();
				suma += elefantes;
				if (suma <= kilos & elefantes != 0) {
					cont++;
				}

			} while (elefantes != 0);

			System.out.println(cont);

		} while (kilos != 0);

	}

}
