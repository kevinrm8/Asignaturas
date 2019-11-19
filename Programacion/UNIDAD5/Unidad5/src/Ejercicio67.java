import java.util.Scanner;

public class Ejercicio67 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int lado,i,j;
		
		int [][] matriz;
		
		boolean par;
		
		do {
		System.out.println("Dime la base de la matriz");
		lado = scanner.nextInt();
		 par = EsPar(lado);
		}while (par == false);
		
		matriz = new int [lado][lado];
		
			
		for(i=0;i<(matriz.length);i++) {
			
			for(j=0;j<(matriz.length);j++) {
				
				if(i<(matriz.length/2) && j<(matriz.length/2))
					matriz[i][j] = 1;
				
				if(i<(matriz.length/2) && j>=(matriz.length/2))
					matriz[i][j] =2;
				
				if(i>=(matriz.length/2) && j<(matriz.length/2))
					matriz[i][j] = 3;
				
				if(i>=(matriz.length/2) && j>=(matriz.length/2))
					matriz[i][j] =4;
				
				
				System.out.print(matriz[i][j]);
			}System.out.println();
		}
	}
	//Comprobar si el dato es par
	public static boolean EsPar(int lado) {		
		if(lado%2==0)
			return true;
		
		return false;
	}

}
