import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		float nota1, nota2,media,ndeseada,minimo;
		
		System.out.println("Introduce la nota del priemr examen: ");
		nota1=scanner.nextFloat();
		scanner.nextLine();
		System.out.println("¿Que nota quieres sacar en el trimestre?");
		ndeseada=scanner.nextFloat();
		
		minimo = (float) ((ndeseada-(nota1*0.4))/0.6);
		
		System.out.println("Para tener un "+ndeseada+" en el trimestre necsitas sacar un "+minimo+" en el segundo examen.");
		
		
	}

}
