package Ej103;

import java.util.*;

public class Principal103 {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws ExceptionCero {
		/* EJERCICIO 103
		int numerador,denominador,cociente;
		String respuesta;
		//try {
			System.out.println("Numerador: ");
			numerador = scanner.nextInt();
			
			System.out.println("Denominador: ");
			denominador = scanner.nextInt();
			
			
			cociente = numerador/denominador;
			respuesta = String.valueOf(cociente);
			
			//Fallo(numerador,denominador);
			
//		}catch(InputMismatchException e) {
//			respuesta="Me hace falta un numero";
//		}catch(ArithmeticException e1) {
//			respuesta = "Division entre cero";
//		}catch(Exception e2) {
//			respuesta ="Otro error";
//		}
//			System.out.println(respuesta);
		 HASTA AQUI EL EJERCICIO 103		*/
		// ESTO SERIA PARA HACER EL 104
		int numerador,denominador,cociente;
		String respuesta;
		
		System.out.println("Numerador: ");
		numerador = scanner.nextInt();
		System.out.println("Denominador: ");
		denominador = scanner.nextInt();
		Fallo(numerador,denominador);

		
	}
	//EJERCICIO 104
	public static void Fallo(int num, int deno) throws ExceptionCero {
		int cociente;
		String respuesta;
		try {
			cociente = num/deno;

		}catch(ArithmeticException e) {
			throw new ExceptionCero("Division por cero");
		}
	}


}
