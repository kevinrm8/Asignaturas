import java.util.Scanner;

public class Ejercicio52 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int vector[] = new int[100];
		int suma=0,media;
		
		for(int i=0;i<vector.length;i++) {
			vector[i]=i+1;
		}
		
		for(int i=0;i<vector.length;i++) {
			suma = suma +vector[i];
		}
		media = suma/vector.length;
		
		System.out.println("la suma es: "+suma+" y la media: " +media);
	}

}
