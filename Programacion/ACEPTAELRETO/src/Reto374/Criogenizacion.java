package Reto374;

import java.util.*;

public class Criogenizacion {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int casos, contmin, contmax;
		long temp, min, max;

		casos = scanner.nextInt();
		for (int i = 0; i < casos; i++) {

			temp = scanner.nextLong();
			min = temp;
			max = temp;
			contmin = 1;
			contmax = 1;
			while (temp != 0) {
				temp = scanner.nextLong();
				if (temp < min && temp != 0) {
					min = temp;
					contmin = 1;
				} else if (temp == min) {
					contmin++;
				}
				if (temp > max) {
					max = temp;
					contmax = 1;
				} else if (temp == max) {
					contmax++;
				}
			}
			System.out.println(min + " " + contmin + " " + max + " " + contmax);

		}

	}

}
