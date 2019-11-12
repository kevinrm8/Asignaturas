import java.util.Scanner;

public class Ejercicio64 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int tamanyo,suma=0,sumaFila,suma2,magico;
		int[][] matriz;
		
		System.out.println("Tamaño de la matriz: ");
		tamanyo= scanner.nextInt();
		
		matriz = new int [tamanyo][tamanyo];
		
		 relleno(matriz,tamanyo);
		
		 // SUMO LA PRIMERA FILA, SERA EL NUMERO CON EL QUE COMPARO EL RESTO
		 for(int i=0;i<tamanyo;i++) {
			 for(int j=0;j<tamanyo;j++) {
				 suma += matriz[i][j];
				 } System.out.println(suma);
			 }
		
		 
		magico = comparador(matriz,tamanyo,suma);
		
		if(magico == 0)
			System.out.println("La matriz no es magica");
		else 
			System.out.println("La matriz si es magica");

		
	}

	

	private static void relleno(int[][] matriz,int tamanyo) {
		Scanner scanner = new Scanner(System.in);
		
		int posicion;
		for (int i=0;i<tamanyo;i++)
			for(int j=0;j<tamanyo;j++) {
				System.out.print("Posicion: "+i+j);
				posicion = scanner.nextInt();
				matriz[i][j]=posicion;
				}
		// MOSTRAR LA MATRIZ
		for (int i=0;i<tamanyo;i++) {
			System.out.println();
			for(int j=0;j<tamanyo;j++) 
				System.out.print(matriz[i][j]+" ");
				}

		
	}
	private static int comparador(int[][] matriz, int tamanyo, int suma) {
		int sumafila=0;
		
		 for(int i=0;i<tamanyo;i++) {
			 for(int j=0;j<tamanyo;j++) {
				 sumafila += matriz[i][j];
			 } 
			 // Compruebo la suma de la fla
			 System.out.println(sumafila);
			 if(suma!=sumafila)
				 return 0;
			 else sumafila=0;
		 }return -1;
	
				 
	}
}
