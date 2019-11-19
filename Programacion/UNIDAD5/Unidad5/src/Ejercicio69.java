import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio69 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char letra;
		// Dos formas de hacerlo con el random
		
//		Random random = new Random();
//		int aleatorio = (int) (random.nextDouble()*26+65);
		
		
		int aleatorio = ThreadLocalRandom.current().nextInt(65,65+26);

		
		letra =(char) aleatorio;
		System.out.println(letra);
	}

}
