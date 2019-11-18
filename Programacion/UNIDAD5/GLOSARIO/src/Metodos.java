import java.util.Random;
import java.util.concurrent.*;

public class Metodos {

	public static void main(String[] args) {
		/* Vamos a crear metodos para de todos los tipos */
		
		IntaString(); // Pasar de int a String
		aleatorio(); // Hacer numero aleatorio entre un rango
	}
	
	public static void IntaString () {
		//Pasar de INT a String
		int a1=6456;
		String a2 = Integer.toString(a1);
		
//		System.out.println(a2);
		
		//Pasar de String a INT
		String b1="84564";
		int b2 = Integer.parseInt(b1);
		
//		System.out.println(b2);
	}

	public static void aleatorio(){		
//		Random entre un maixmo y un minimo
		
		int min = 5, max=20;
		
		for(int i=0;i<200;i++)
			System.out.print(ThreadLocalRandom.current().nextInt(min,max)+"  ");
		
	}
	
}
