import java.util.Scanner;

public class Ejercicio63 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] vector;
		int tamanyo,i,ordenado;
		
		System.out.println("Introduzca la dimension del vector");
		tamanyo = scanner.nextInt();
		
		vector = new int [tamanyo];
		//Relleno el vector
		for (i =0;i<vector.length;i++) {
			vector[i] = (int) (Math.random()*100)+1;
			}
		
		System.out.println("Tu vector es:");
		//Muestro el vector
		for (i =0;i<vector.length;i++) 
			System.out.print(vector[i]+" ");
		
		System.out.println();
		
		ordenado = comprobar(vector,tamanyo);
		if (ordenado==-1)
			System.out.println("El vector no esta ordenado");
		if(ordenado == 0)
			System.out.println("El vector si esta ordenado");

		
		
		
	}

	private static int comprobar(int[] vector,int tamanyo) {
		int orden=5;
		int[] min = new int [tamanyo];
 		
		for (int i=0;i<vector.length-1;i++) {
			
			if(min[i+1]<vector[i])
				return orden= -1;
			
			else orden= 0;
		}
		
		return orden;
	}

	
	
}
