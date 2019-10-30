import java.util.Scanner;

public class Ejercicio36 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		float nota1,nota2,media;
		String recuperacion;
		
		System.out.println("Nota1");
		nota1 = scanner.nextFloat();
		scanner.nextLine();
		
		
		System.out.println("Nota2");
		nota2 = scanner.nextFloat();
		scanner.nextLine();

		
		System.out.println("Nota del primer control:\t\t "+nota1);
		System.out.println("Nota del segundo control:\t\t "+nota2);
		
		media = ((nota1+nota2)/2);
		

		
		if (media<5) 
		{	
			System.out.print("¿Cual ha sido el resultado de la recuperacion?(apto/no apto):\t ");
			recuperacion = scanner.nextLine();
			if (recuperacion.equals("apto") )
				System.out.println("Tu nota de Programacion es:\t\t 5");
				else 
					System.out.println("Tu nota de Programacion es:\t\t "+media);	
		}

		if ( media >=5)
			System.out.println("Tu nota de Programacion es:\t\t " +media);
	}

}
