package Ejer116;

import java.io.*;
import java.util.Scanner;

public class Ej116Estadisticas {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		File Archivo = new File("D:\\DAM\\1r Curso 2019-2020\\Asignaturas\\Programacion\\UNIDAD10\\entrada.txt");
		FileWriter Escribir = new FileWriter(Archivo);

		int Numpalabras = 0, Numcaracteres = 0;
		float media;
		String linea = "";

		// CREAMOS EL ARCHIVO
		String texto;
		texto = scanner.nextLine();

		try {
			Archivo.createNewFile();
			Escribir.write(texto);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		Escribir.close();

		// Leer el archivo

		try {
			Scanner leer = new Scanner(Archivo);
			while (leer.hasNext()) {
				linea = leer.nextLine();
				String[] palabra = linea.split(" ");
				Numpalabras += palabra.length;
				Numcaracteres += cuenta_caracteres(palabra);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Numero de palabras: "+Numpalabras+"\nNumero de caracteres: "+Numcaracteres+"\nLongitud media de una palabra: "+(float)(Numcaracteres/Numpalabras));
		
	}

	private static int cuenta_caracteres(String[] palabra) {
		int numcaract = 0;

		for (int i = 0; i < palabra.length; i++) {
			numcaract += palabra[i].length();
		}
		return numcaract;
	}

}
