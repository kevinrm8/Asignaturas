import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Ejercicio56 {
	/* Nombre: Kevin Rosales
	 * Fecha: 30/10/19
	 * Descripcion: Programa para manejar fechas.
	 * */
	

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		
		Calendar cal = new GregorianCalendar();
		int opcion;
		
		Date ahora = new Date();
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
		formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
		
		do { // MENU
			System.out.println("1-Obtener fecha actual");
			System.out.println("2-Obtener hora actual");
			System.out.println("3-Sumar días");
			System.out.println("4-Diferencia en días");
			System.out.println("5-Anterior o Posterior");
			System.out.println("9-Salir");
			opcion= scanner.nextInt();
			// SEGUN LA OPCION DEL MENU
			switch(opcion) {
			case 1: opcion1(ahora); 
				break; 
					
			case 2: opcion2(ahora);
				break;
				
			case 3: opcion3(ahora);
				break;
				
			case 4: opcion4(ahora);
				break;
				
			case 5: opcion5(ahora);
				break;
				
			case 9: opcion9(ahora); // FIN DEL PROGRAMA
				break;

			}
			
		} while (opcion!=9);
			
	}
	
	public static void opcion1(Date ahora) {
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
		formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("La fecha de hoy es: "+formatoDelTexto.format(ahora));
		return;
	}
	
	public static void opcion2(Date ahora) {
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
		formatoDelTexto = new SimpleDateFormat("hh:mm:ss");
		System.out.println("La fecha de hoy es: "+formatoDelTexto.format(ahora));
		return;
	}
	public static void opcion3(Date ahora) {
		int suma_dias;
		Scanner scanner = new Scanner(System.in);
		
		
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
		formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Cuantos dias queire sumar?");
		
		suma_dias = scanner.nextInt();

		System.out.println("La fecha de hoy es: "+formatoDelTexto.format(ahora));

		Calendar cal = new GregorianCalendar();
		cal.setTimeInMillis(ahora.getTime());
		cal.add(Calendar.DATE, suma_dias);
		
		Date fechaSuma = new Date(cal.getTimeInMillis());
		
		System.out.println("Hoy +"+suma_dias+" es: " +formatoDelTexto.format(fechaSuma));
		return;
	}
	public static void opcion4(Date ahora) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
		formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");

		
////		long diferencia=0;
		int dia,mes,ano,dia1,mes1,ano1;
		Date fecha,fecha1;
		long diferencia;
		
		System.out.println("Introduce dia:");
		dia=scanner.nextInt();
		System.out.println("Introduce mes:");
		mes=scanner.nextInt();
		System.out.println("Introduce ano:");
		ano=scanner.nextInt();

		String cadena = dia+"-"+mes+"-"+ano;
		
		System.out.println("Introduce dia:");
		dia1=scanner.nextInt();
		System.out.println("Introduce mes:");
		mes1=scanner.nextInt();
		System.out.println("Introduce año:");
		ano1=scanner.nextInt();
		String cadena1 = dia1+"-"+mes1+"-"+ano1;
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		//PASAMOS LAS FECHAS DE STRING A FORMATE FECHA
		
		fecha = dateFormat.parse(cadena);
		fecha1 = dateFormat.parse(cadena1);
		
		diferencia = fecha.getTime()-fecha1.getTime();
		
		diferencia= diferencia/1000*60*60*24;
		
		System.out.println("La diferencia es de: "+diferencia);
		return;
	}
	public static void opcion5(Date ahora) {
		
		return;
	}
	public static void opcion9(Date ahora) {
		System.out.println("Ha sido un placer ayudarte, ADIOS!");
		return;
	}

}
