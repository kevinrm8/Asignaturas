import java.util.Scanner;

public class Ejercicio32 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
	
		float velocidad;
		System.out.println("Introduce velocidad Km/h:");
		velocidad = scanner.nextFloat();
		
		velocidad = (velocidad *1000)/3600;
		
		System.out.println("La velociad en m/s es: "+velocidad+" m/s");
		
	}
	
}
