package Ejer119;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejer119Buscador {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		File file_entrada = new File("D:\\DAM\\1r Curso 2019-2020\\Asignaturas\\Programacion\\UNIDAD10\\KEVIN.txt");
		String linea = "";
		String buscar;
		int contador_linea = 1; // CONTADOR DE LAS LINEAS
		
		boolean encontrado = false;
		boolean NOAPARECE = false;

		System.out.println("Que palabra quieres buscar en el fichero?");
		buscar = scanner.nextLine();

		try {
			Scanner leer = new Scanner(file_entrada);
			while (leer.hasNext()) {
				linea = leer.nextLine();
				encontrado = comprobar(linea, buscar, contador_linea); // Le paso la linea, la palabra que tiene que buscar y el contador de la linea
				contador_linea++; // Incremento la linea para pasar al a siguiente
				if(encontrado) { // Si encuentra la palabra en una linea la imprimo por pantalla
					System.out.println(linea);
					NOAPARECE=true; // Con este boolean detecto si NUNCA ha encontrado la palabra en el texto
				}
			}
			if(!NOAPARECE) { // SI finalmente la palabra no aparece, imprimo lo siguiente por pantalla
				System.out.println("La palabra "+buscar+" no se encuentra en el fichero");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private static boolean comprobar(String linea, String buscar, int contador_linea) {
		boolean encontrado = false;

		String[] palabra = linea.split(" ");

		for (int i = 0; i < palabra.length; i++) {
			if (palabra[i].equals(buscar)) {
				System.out.println("Encontrado en la linea: " + contador_linea);
				 encontrado = true;
			}
		}
		return encontrado;

	}

}
