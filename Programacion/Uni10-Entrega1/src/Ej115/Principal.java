package Ej115;

import java.io.*;
import java.util.*;

public class Principal {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		int opc=1;

		File Archivo = new File("D:\\DAM\\1r Curso 2019-2020\\Asignaturas\\Programacion\\Uni10-Entrega1\\salida.txt");
		FileWriter salida=null;

		ArrayList<String> Agenda = new ArrayList<String>();


		while (opc != 4) {
			try {
				opc = Menu();
				switch (opc) {
				case 1:
					Alta_Contacto(Agenda);
					break;
				case 2:
					Baja_Contacto(Agenda);
					break;
				case 3:
					Listar_Agenda(Agenda);
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Debes ingresar valores enteros");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		// AQUI SE EJECUTA LA OPCION DE SALIDA Y CREAMOS EL ARCHIVO CON EL ARRAYLIST
		try {
			Archivo.createNewFile();
			salida = new FileWriter(Archivo);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		//Escribir en el fichero
		try {
			Iterator iter = Agenda.iterator();
			String Aux=" ";
			while(iter.hasNext()) {
				Aux = (String) iter.next();
				salida.write(Aux+"\n");
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		//CERRAR LOS ARCHIVOS
		try {
			salida.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Gracias por utilizar la agenda");
	}

	public static int Menu() throws Exception {
		Scanner scanner = new Scanner(System.in);
		int opc;

		System.out.println("-----MENU-----");
		System.out.println("1-Dar de alta un contacto de la agenda");
		System.out.println("2-Dar de baja un contacto de la agenda");
		System.out.println("3-Listar agenda");
		System.out.println("4-Salir");
		opc = scanner.nextInt();

		Rango(opc);

		return opc;
	}

	private static void Alta_Contacto(ArrayList<String> agenda) {
		Scanner scanner = new Scanner(System.in);

		String nombre;

		System.out.println("Introduzca nombre del nuevo contacto:");
		nombre = scanner.nextLine();

		boolean PROBAR = true;
		Iterator iter = agenda.iterator();
		String aux=" ";
		while (iter.hasNext()) {
			aux = (String) iter.next();
			if (nombre.toLowerCase().equals(aux.toLowerCase())) {
				PROBAR = false;
				break;
			}
		}
		if (PROBAR) {
			agenda.add(nombre);
			System.out.println("Alta realizada con éxito!. Numero de contactos en la agenda: "+agenda.size());
		} else
			System.out.println("ERROR: El contacto ya existe en la agenda");

	}

	private static void Baja_Contacto(ArrayList<String> agenda) {

		Scanner scanner = new Scanner(System.in);
		String nombre;
		int cont = 0;

		System.out.println("Introduzca nombre del contacto a dar de baja:");
		nombre = scanner.nextLine();

		boolean PROBAR = true;
		Iterator iter = agenda.iterator();
		String aux=" ";
		while (iter.hasNext()) {
			 aux = (String) iter.next();
			if (nombre.toLowerCase().equals(aux.toLowerCase())) {
				PROBAR = false;
				break;
			}
		}
		if (!PROBAR) {
			agenda.remove(aux);
			System.out.println("Baja realizada con exito!. Numero de contactos en la agenad: "+agenda.size());
		}else
			System.out.println("ERROR: El contacto no existe en la agenda");
	}

	private static void Listar_Agenda(ArrayList<String> agenda) {
		Iterator iter = agenda.iterator();
		while (iter.hasNext()) {
			String Aux = (String) iter.next();
			System.out.println(Aux);
		}
		
	}

	public static int Rango(int num) throws Exception {
		if (num > 4 || num < 1) {
			throw new Exception("ERROR: Opción incorrecta");
		} else {
			return num;
		}
	}
	
	
}
