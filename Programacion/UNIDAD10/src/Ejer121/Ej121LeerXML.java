package Ejer121;

import java.util.*;
import java.io.*;

public class Ej121LeerXML {

	public static void main(String[] args) throws IOException {

		String Titulo = null, Autor = null, Editorial, Categoria, Nota, ISBN, Comentario;
		int contador_libros = 0;
		int notas;
		float media = 0;
		File file_xml = new File("D:\\DAM\\1r Curso 2019-2020\\Asignaturas\\Programacion\\UNIDAD10\\ejer121.xml");
		FileWriter Escribir = null;
		try {
			Scanner leer = new Scanner(file_xml); // Leer el archivo xml
			String linea = null;
			while (leer.hasNext()) {
				linea = leer.nextLine();

				if (linea.contains("<LIBRO>")) { // LEO LOS DATOS DE 1 LIBRO
					notas =0;
					contador_libros++;
					do {
						linea = leer.nextLine();

						Titulo = linea.replace("\t\t<TITULO>", "").replace("</TITULO>", "");
						linea = leer.nextLine();
						Autor = linea.replace("\t\t<AUTOR>", "").replace("</AUTOR>", "");
						linea = leer.nextLine();
						Editorial = linea.replace("\t\t<EDITORIAL>", "").replace("</EDITORIAL>", "");
						linea = leer.nextLine();
						Categoria = linea.replace("\t\t<CATEGORIA>", "").replace("</CATEGORIA>", "");
						linea = leer.nextLine();
						ISBN = linea.replace("\t\t<ISBN>", "").replace("</ISBN>", "");
						linea = leer.nextLine();
						Nota = linea.replace("\t\t<NOTA>", "").replace("</NOTA>", "");
						notas = Integer.parseInt(Nota.substring(1,Nota.length()-1));
						linea = leer.nextLine();
						
						Comentario = linea.replace("\t\t<COMENTARIOS>", "").replace("</COMENTARIOS>", "");
						
						
						media += notas;
						File Libro = new File(Titulo);
						Escribir = new FileWriter(Libro);
						Escribir.write("--------------------\n");
						Escribir.write("Autor: " + Autor + "\nEditorial: " + Editorial + "\nCategoria: " + Categoria
								+ "\nISBN: " + ISBN + "\nNOTA: " + notas + "\nCOMENTARIOS: " + Comentario+"\n");
						Escribir.write("--------------------\n");
						Libro.createNewFile();

						// System.out.println(Titulo+"\n"+Autor+"\n"+Editorial+"\n"+Categoria+"\n"+ISBN+"\n"+notas+"\n"+Comentario+"\n");
					} while (linea.contains("</LIBRO>")); // ACABO DE LEER LOS DATOS DEL LIBRO, PASO AL SIGUIENTE
					Escribir.close();
				}
			}
			media = media / contador_libros;
			
			//PARA REDONDEAR LA MEDIA CON 2 DECIMALES
	        double parteEntera, resultado;
	        resultado = media;
	        parteEntera = Math.floor(resultado);
	        resultado=(resultado-parteEntera)*Math.pow(10, 2);
	        resultado=Math.round(resultado);
	        resultado=(resultado/Math.pow(10, 2))+parteEntera;
	    
			System.out.println("Se han procesado " + contador_libros + " libros y la noa media es: " + resultado);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}

// LIBRO AÑADIR EN XML
/* 
 * 	<LIBRO>
		<TITULO>MI LIBRO</TITULO>
		<AUTOR>Kevin Rosales</AUTOR>
		<EDITORIAL>LA CASA</EDITORIAL>
		<CATEGORIA>"CIENCIA FICCION"</CATEGORIA>
		<ISBN>ISBN-57614</ISBN>
		<NOTA>"9"</NOTA>
		<COMENTARIOS>El mejor puto libro de la historia</COMENTARIOS>
	</LIBRO>
 * */

class Libros {

	private String Titulo;
	private String Autor;
	private String Editorial;
	private String Categoria;
	private String ISBN;
	private int Nota;
	private String Comentario;

	public Libros(String titulo, String autor, String editorial, String categoria, String isbn, int nota,
			String comentario) {
		this.Titulo = titulo;
		this.Autor = autor;
		this.Editorial = editorial;
		this.Categoria = categoria;
		this.ISBN = isbn;
		this.Nota = nota;
		this.Comentario = comentario;

	}

}