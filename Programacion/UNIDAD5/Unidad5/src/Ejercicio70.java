import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio70 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x, y;
		String matriz[][];
		
		// Numero aleatorio que elije la maquina
	//	int aleatorio = ThreadLocalRandom.current().nextInt(0,2);

		
		matriz = new String[3][3];
		
		do {
			System.out.println("Fila:");
			x = scanner.nextInt();
			System.out.println("Columna:");
			y = scanner.nextInt();
			
		}while (x<0 || x>2 || y<0 || y>2 );
		
		// Muestro matriz vacia de X y O
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				matriz[i][j] = "-";
				matriz[x][y] = "X";

				System.out.print(matriz[i][j]);
			} System.out.println();
		}
		
		System.out.println("Ahora tira la maquina...");
		int aleaF;
		int aleaC;
		
		do {
		// Numero aleatorio que elije la maquina
				aleaF = ThreadLocalRandom.current().nextInt(0,2);
				aleaC = ThreadLocalRandom.current().nextInt(0,2);
				
		}while (matriz[aleaF][aleaC] == "-");	
		
			for(int i=0;i<matriz.length;i++) {
				for(int j=0;j<matriz.length;j++) {
					matriz[aleaF][aleaC] = "O";

					System.out.print(matriz[i][j]);
				} System.out.println();
			}
	}

}
