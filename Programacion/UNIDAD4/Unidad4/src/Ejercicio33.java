import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int contador=0;
		String respuesta;
		
		do {
			System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.(V/F)");
			respuesta = scanner.nextLine();
			
		} while (!respuesta.equals("V") && !respuesta.contentEquals("F"));
			if (respuesta.equals("V"))
				contador = contador + 3;
				
		do {
			System.out.println("Ha aumentado sus gastos de vestuario.");
			respuesta = scanner.nextLine();
				
			} while (!respuesta.equals("V") && !respuesta.contentEquals("F"));
				if (respuesta.equals("V"))
					contador = contador + 3;
		
			do {
				System.out.println("Ha perdido el interés que mostraba anteriormente por ti.");
				respuesta = scanner.nextLine();
							
				} while (!respuesta.equals("V") && !respuesta.equals("F"));
					if (respuesta.equals("V"))
						contador = contador + 3;
			do {
				System.out.println("Ahora se asea con más frecuencia.");
				respuesta = scanner.nextLine();
										
				} while (!respuesta.equals("V") && !respuesta.equals("F"));
					if (respuesta.equals("V"))
						contador = contador + 3;
		
			do {
				System.out.println("No te deja que mires la agenda de su teléfono móvil.");
				respuesta = scanner.nextLine();
													
				} while (!respuesta.equals("V") && !respuesta.equals("F"));
					if (respuesta.equals("V"))
						contador = contador + 3;
	
			do {
				System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
				respuesta = scanner.nextLine();
				
				} while (!respuesta.equals("V") && !respuesta.equals("F"));
					if (respuesta.equals("V"))
						contador = contador +3;
			do {
				System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
				respuesta = scanner.nextLine();
				
				} while (!respuesta.equals("V") && !respuesta.equals("F"));
					if (respuesta.equals("V"))
					contador = contador +3;
					
			do {
				System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
				respuesta = scanner.nextLine();
				
				} while (!respuesta.equals("V") && !respuesta.equals("F"));
					if (respuesta.equals("V"))
					contador = contador +3;
					
			do {
				System.out.println("Has notado que últimamente se perfuma más.");
				respuesta = scanner.nextLine();
					
				} while (!respuesta.equals("V") && !respuesta.equals("F"));
					if (respuesta.equals("V"))
					contador = contador +3;
				
			do {
				System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
				respuesta = scanner.nextLine();
							
				} while (!respuesta.equals("V") && !respuesta.equals("F"));
					if (respuesta.equals("V"))
						contador = contador +3;	
					
			
				if (contador >=0 && contador <=10)
				System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel ");
				
				if (contador >10 && contador <=22)
				System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia ");

				if (contador >22 && contador <=30)
				System.out.println(" Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza ");
				
		}
	}



