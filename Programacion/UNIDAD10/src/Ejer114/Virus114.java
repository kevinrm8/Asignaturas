package Ejer114;

import java.io.*;
import java.util.*;

public class Virus114 {
//C:\Users\Kevin\Desktop
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int cant;
		String nombre;

		System.out.println("Cuantas carpetas quiere crear en el escritorio?");
		cant = scanner.nextInt();scanner.nextLine();
		System.out.println("Que nombre quiere que aparezca en las carpetas?");
		nombre = scanner.nextLine();

		CrearCarpeta(cant, nombre);
	}

	private static void CrearCarpeta(int cant, String nombre) {

		for(int i=1;i<=cant;i++) {
			File carpeta = new File("D:\\DAM\\1r Curso 2019-2020\\Asignaturas\\Programacion\\UNIDAD10\\EJERCICIO114\\"+nombre+i);
		boolean exito =	carpeta.mkdir();
			if(exito) {
				System.out.println("Creado");
			}else System.out.println("No creado!");
		}
		

	}

}
