package Ejer110;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Ej110Leer {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		File Pares = new File("Salida1.txt"); // CREO LOS OBJETOS DE TIPO ARCHIVO
		File Impares = new File("Salida2.txt");
		File Todo = new File("Salida3.txt");

		Crear(Pares, Impares,Todo); // CREO LOS ARCHIVOS

		Escribir(Pares, Impares); // ESCRIBIR EN LOS ARCHIVOS
		
		String linea,linea2;
		FileWriter WTodo = new FileWriter(Todo);
		
		try {
			Scanner sc = new Scanner(Pares);
			Scanner sc2 = new Scanner(Impares);
			
			while(sc.hasNext() || sc2.hasNext()) {
			linea = sc.nextLine();
			linea2 = sc2.nextLine();
			
			WTodo.write(linea+"\n"+linea2+"\n");
			}
			sc.close();
			WTodo.close();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void Crear(File Pares, File Impares,File Todo) {

		try { // CREO EL ARCHIVO Y COMPRUEBO QUE ESTA BIEN O QUE YA ESTABA CREADO
			if (Pares.createNewFile()) {
				System.out.println("El archivo " + Pares + " ha sido creado");
			} else
				System.out.println("El archivo " + Pares + " ya existia");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try { // CREO EL ARCHIVO Y COMPRUEBO QUE ESTA BIEN O QUE YA ESTABA CREADO
			if (Impares.createNewFile()) {
				System.out.println("El archivo " + Impares + " ha sido creado");
			} else
				System.out.println("El archivo " + Impares + " ya existia");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		try { // CREO EL ARCHIVO Y COMPRUEBO QUE ESTA BIEN O QUE YA ESTABA CREADO
			if (Todo.createNewFile()) {
				System.out.println("El archivo " + Todo + " ha sido creado");
			} else
				System.out.println("El archivo " + Todo + " ya existia");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void Escribir(File Pares, File Impares) throws IOException {

		String numero;
		FileWriter WPares = new FileWriter(Pares);
		FileWriter WImpares = new FileWriter(Impares);

		for (int i = 0; i < 50; i++) {
			if (i % 2 == 0) {
				numero = Integer.toString(i);
				WPares.write(numero + "\n");
			} else {
				numero = Integer.toString(i);
				WImpares.write(numero + "\n");
			}
		}
		WPares.close();
		WImpares.close();

	}

}