import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio28 { 
/*
 * Creamos DecimalFormat para indicar cuantos decimales queremos en las variables. A la hora de imprimir por pantalla
 * debemos llamar a la variable creada formato para indicar que esa variable la queremos con esa cantidad de decimales.
 * 	
*/	

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		double radio,longitud, area, volumen;
		DecimalFormat formato = new DecimalFormat("#.000");
		
		System.out.println("Bienvenido al programa donde todo sale redondo!");
		System.out.println("------------------------------------------");
		System.out.println("Introduzca el valor del radio:");
		radio = scanner.nextFloat();
		scanner.nextLine();
		
		longitud = 2*Math.PI*radio;
		area = Math.PI*radio*radio;
		volumen =((4*Math.PI*Math.pow(radio,3))/3);
		
		
		System.out.println("La longitud de la circunferencia es: "+formato.format(longitud));
		System.out.println("El area de la corcunferencia es: "+formato.format(area));
		System.out.println("Si fuera una esfera, su volumen seria: "+formato.format(volumen));

		
	}

}
