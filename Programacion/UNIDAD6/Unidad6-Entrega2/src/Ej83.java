import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/* Nombre: Axel Perez y Kevin Rosales
 * Fecha: 11/12/2019
 * Descripcion: Juego de los insultos
 * */

public class Ej83 {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int i;
		String maquina,humano;
		String letra_maquina, letra_humano;
		int contador = 0;
		
		for(i=0;i<5;i++) {			 
			maquina = elegir_frase_maquina(i); // Maquina elige por orden la frase a mostrar para hacer la rima
			
			while(contador<3){ // Mientras el contador ( fallos ) sea menor que 3 seguiremos vivos en el juego y pdoremos intentarlo de nuevo
				System.out.println(maquina);
				humano = elegir_opcion_humano(); // Elegimos la opcion manualmente

				letra_maquina = maquina.substring(maquina.length()-2,maquina.length());	 // guardamos las 2 ultimas letras de la opcion maquina
				letra_humano = humano.substring(humano.length()-2,humano.length()); // guardamos las 2 ultimas letras de la opcion humano
				
				if(letra_maquina.equals(letra_humano)) { // Comparamos si son iguales las dos ultimas letras
					System.out.println("Punto para mi!");
					break;
				}else { // Si no son iguales sumamos un fallo
					contador++;
					System.out.printf("Fallo %s de 3!. Me han hecho pupita! Intentalo de nuevo!\n", contador);
				}
			}
			
		}
		if(contador==3) { // Si llegas a 3 fallos pierdes
			System.out.println("Has perdido!");
		}else {
			System.out.println("Enhorabuena! Has ganado la batalla de insultos de Monkey Island!");
		}
	}
	
	public static String elegir_frase_maquina(int n) { // Opciones de la maquina
		
		String s="";
		switch (n) {
		case 0:
			s = "1-Eres tan repulsivo como una mona marrana";
			break;
		case 1:			
			s = "2-Mis ataques han dejado islas enteras sin poblados";
			break;
		case 2: 			
			s = "3-Tu cara haría vomitar hasta el cerdo menos aseado";
			break;
		case 3: 			
			s="4-Mis habilidades con la espada son muy veneradas";
			break;
		case 4:			
			s = "5-Piedad, te lo ruego, no mas insultos por favor";
			break;
		}
		return s;
		
	}
	
	public static String elegir_opcion_humano() { // Muestra opciones del humano
		String respuesta="";
		
		boolean Nocorrecta = false;
		
		muestraRespuestas();
		
		
		while(!Nocorrecta) {
		char letra=scanner.nextLine().toLowerCase().charAt(0);
		
		switch (letra) { // Guardamos la opcion elegida en un String
			case 'a':
				respuesta = "Que pena que todas esten inventadas";
				Nocorrecta = true;
				break;
			case 'b':			
				respuesta = "Y eso sin contar a las otras con las que te has citado";
				Nocorrecta = true;
				break;
			case 'c': 			
				respuesta = "Tu olor y tu cara me recuerdan a un queso sin frescor";		
				Nocorrecta = true;
				break;
			case 'd': 			
				respuesta="Eso es porque me parezco mucho a tu hermana";
				Nocorrecta = true;
				break;
			case 'e':			
				respuesta = "Con tu aliento, seguro que todos fueron asfixiados";
				Nocorrecta = true;
				break;
			default: {System.out.println("Letra incorrecta");
			muestraRespuestas();
				break;
				}
			}
		}
		return respuesta;
	}
	
	public static void muestraRespuestas() {

		System.out.println("a) Que pena que todas esten inventadas");
		System.out.println("b) Y eso sin contar a las otras con las que te has citado");
		System.out.println("c) Tu olor y tu cara me recuerdan a un queso sin frescor");
		System.out.println("d) Eso es porque me parezco mucho a tu hermana");
		System.out.println("e) Con tu aliento, seguro que todos fueron asfixiados");
	}
}
