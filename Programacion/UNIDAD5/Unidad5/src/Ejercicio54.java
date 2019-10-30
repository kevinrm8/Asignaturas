import java.util.Scanner;
import java.util.Random;

public class Ejercicio54 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int tamanyo,num_inf,num_super,suma=0;
		int []vector;
		Random random = new Random();
		
		System.out.println("Dime el tamaño del array:");
		tamanyo = scanner.nextInt();
		
		System.out.println("Dime el limite inferior y superior:");
		num_inf = scanner.nextInt();
		num_super = scanner.nextInt();
	
		
		 vector = new int[tamanyo];
		 
		for(int i=0;i<vector.length;i++) {
			vector [i] =  (int)(random.nextDouble()*num_super+num_inf);
			suma += vector[i];
										}
		System.out.println("Se ha generado el siguiente array de "+tamanyo+" posiciones");
		for(int i=0;i<vector.length;i++)
			System.out.print("{"+vector[i]+"} ");
			
		System.out.println("La suma tota es: "+suma);
	}

}
