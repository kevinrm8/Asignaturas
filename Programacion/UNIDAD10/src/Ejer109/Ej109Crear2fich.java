package Ejer109;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Ej109Crear2fich {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		File Pares = new File("Salida1.txt");	//CREO LOS OBJETOS DE TIPO ARCHIVO
		File Impares = new File("Salida2.txt");
		
		Crear(Pares,Impares); // CREO LOS ARCHIVOS
		
		Escribir(Pares,Impares); //ESCRIBIR EN LOS ARCHIVOS
	}
	
	
	private static void Crear(File Pares,File Impares) {

		try { // CREO EL ARCHIVO Y COMPRUEBO QUE ESTA BIEN O QUE YA ESTABA CREADO
			if(Pares.createNewFile()){
				System.out.println("El archivo "+Pares+" ha sido creado");
			}else
				System.out.println("El archivo "+Pares+" ya existia");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		try { // CREO EL ARCHIVO Y COMPRUEBO QUE ESTA BIEN O QUE YA ESTABA CREADO
			if(Impares.createNewFile()){
				System.out.println("El archivo "+Impares+" ha sido creado");
			}else
				System.out.println("El archivo "+Impares+" ya existia");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void Escribir(File Pares,File Impares) throws IOException {

		String numero;
		FileWriter WPares = new FileWriter(Pares);
		FileWriter WImpares = new FileWriter(Impares);

		for(int i=0;i<50;i++) {
			if(i%2==0) {
				numero = Integer.toString(i);
				WPares.write(numero+"\n");
			}else {
				numero = Integer.toString(i);
				WImpares.write(numero+"\n");
			}
		}
		WPares.close();
		WImpares.close();

	}

}

	

