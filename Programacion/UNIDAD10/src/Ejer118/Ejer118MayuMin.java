package Ejer118;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer118MayuMin {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		File file_entrada = new File("D:\\DAM\\1r Curso 2019-2020\\Asignaturas\\Programacion\\UNIDAD10\\KEVIN.txt");
		String linea = "";

		try {
			Scanner leer = new Scanner(file_entrada);
			while (leer.hasNext()) {
				linea = leer.nextLine();
				String cambiado = cambia_maymin(linea);
				System.out.println(cambiado);
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	private static String cambia_maymin(String linea) {

		String[] palabra = linea.split(" ");
		String palabra_al_reves = "";

		for (int i = 0; i < palabra.length; i++) {
			palabra_al_reves += cambia_1palabra(palabra[i]+" ");
		}

		return palabra_al_reves;
	}

	private static String cambia_1palabra(String palabra) {

		String palabra_al_reves = "";
		for (int i = 0; i < palabra.length(); i++) {
			if (may_o_min(palabra.charAt(i)).equals("MAY")) {
				palabra_al_reves += Character.toLowerCase(palabra.charAt(i));
			}
			if (may_o_min(palabra.charAt(i)).equals("MIN")) {
				palabra_al_reves += Character.toUpperCase(palabra.charAt(i));
			}

		}

		return palabra_al_reves;
	}

	private static Object may_o_min(char c) {

		String resultado = "";

		char c_minus = Character.toLowerCase(c);
		char c_mayus = Character.toUpperCase(c);
		if (c == c_minus) {
			resultado = "MIN";
		} else
			resultado = "MAY";

		return resultado;
	}

}