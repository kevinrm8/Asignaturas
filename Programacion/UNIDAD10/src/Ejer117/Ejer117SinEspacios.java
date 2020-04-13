package Ejer117;

import java.io.*;
import java.util.Scanner;

public class Ejer117SinEspacios {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		File Archivo = new File("D:\\DAM\\1r Curso 2019-2020\\Asignaturas\\Programacion\\UNIDAD10\\Texto117.txt");
		FileWriter Escribir = new FileWriter(Archivo);
		// PARA LEER ARCHIVO YA EXISTENTE
		File file_entrada = new File("D:\\DAM\\1r Curso 2019-2020\\Asignaturas\\Programacion\\UNIDAD10\\KEVIN.txt");
		
		
		String texto;
		System.out.println("Escribe texto del archivo "+Archivo);
		texto = scanner.nextLine();

		try {
			Archivo.createNewFile();
			Escribir.write(texto);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		Escribir.close();

		// LEER ARCHIVO
		try {
			Scanner leer = new Scanner(file_entrada); // Cambiar 'Archivo' por file_entrada para leer el otro archivo
			while (leer.hasNext()) {
				String linea = leer.nextLine();
				String[] palabra = linea.split(" ");
				
				String TextoSinEspacios="";
				TextoSinEspacios += JuntarPalabras(palabra);
				
				System.out.println(TextoSinEspacios);
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		

	}

	private static String JuntarPalabras(String[] palabra) {
		String texto="";
		
		for(int i=0;i<palabra.length;i++) {
			texto += palabra[i];
		}
		return texto;
	}

}
