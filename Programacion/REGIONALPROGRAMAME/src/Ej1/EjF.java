package Ej1;

import java.util.*;

public class EjF {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int casos = teclado.nextInt();
        int[][] matriz;
        int N, M;
        int dato, anterior;
        boolean valido;
        for (int i = 0; i < casos; i++) {
            N = teclado.nextInt();
            M = teclado.nextInt();
            valido = true;
            matriz = new int[N][M];
            for (int j = 0; j < matriz.length; j++) {
                for (int j2 = 0; j2 < matriz[0].length; j2++) {
                    matriz[j][j2] = teclado.nextInt();
                }
            }

            for (int j = 0; j < matriz.length; j++) {
                for (int j2 = 0; j2 < matriz[0].length; j2++) {
                    if (j2 == 0) {
                    } else if (matriz[j][j2] < matriz[j][j2 - 1]) {
                        valido = false;
                        break;
                    }

                }
            }

            for (int j = 0; j < matriz.length; j++) {
                for (int j2 = 0; j2 < matriz.length; j2++) {
                    if (j2 == 0) {

                    } else if (matriz[j2][j] > matriz[j2 - 1][j]) {
                        valido = false;
                        break;
                    }
                }
            }
            if (valido == true) {
                System.out.println("VALIDO");
            } else {
                System.out.println("INVALIDO");
            }
        }
    }

}
