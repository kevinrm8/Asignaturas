package Ejer120;

import java.io.*;
import java.util.Scanner;


public class Ejer120BorrarPalabra {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		File file_entrada = new File("D:\\DAM\\1r Curso 2019-2020\\Asignaturas\\Programacion\\UNIDAD10\\KEVIN.txt");
		File Salida = new File("D:\\DAM\\1r Curso 2019-2020\\Asignaturas\\Programacion\\UNIDAD10\\salida120.txt");
		FileWriter Escribir = new FileWriter(Salida);
		
		String linea = "";
		String buscar;
		String texto_final;

		System.out.println("Que palabra quieres buscar en el fichero?");
		buscar = scanner.nextLine();

		try {
			Scanner leer = new Scanner(file_entrada);
			Salida.createNewFile(); // Creo el archivo de salida
			
			while (leer.hasNext()) {
				linea = leer.nextLine();
				String[] palabra = linea.split(" ");
				texto_final = "";
				
				for (int i = 0; i < palabra.length; i++) { 
					
					if (palabra[i].equals(buscar)) { // Compruebo la palabra, si esta en el texto lo cambio por ""
						palabra[i] = "";
					}
					
					if (palabra[i].equals("")) { // PAra no dejar espacios en blanco de mas, si he cambiado la palabra lo guardo sin espacios
						texto_final += palabra[i];

					} else
						texto_final += palabra[i] + " "; // Si no he cambiado la palabra mantengo el espacio en blanco
				}
				Escribir.write(texto_final+"\n");
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		Escribir.close();
	}

}