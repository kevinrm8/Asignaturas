package Ejer113;

import java.io.*;
import java.util.*;

/* 
Best Player of the World
Hola, mi nombre es Gareth Bale
Os paso un enlace a mi pagina web favorita
www.rfegolf.es
*/
public class Ej113Web {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		ArrayList<PaginaWeb> TODAS = new ArrayList<PaginaWeb>();

		System.out.println(
				"Bienvenido al programa de generacion de paginas web\n-------------------------------------------------");
		System.out.println("Cuantas paginas hacer?");
		int cont = scanner.nextInt();
		int num=0;
		do {
			PedirDatos(TODAS);// PIDO LOS DATOS POR TECLADO
			CrearPagina(TODAS,num);
			cont--;
			num++;
		} while (cont > 0);
	}

	private static void PedirDatos(ArrayList TODAS) { // PIDO DATOS Y CREO EL OBJETO PAGINA QUE CONTIENE LOS DATOS DE LA
														// PAGINA WEB
		Scanner scanner = new Scanner(System.in);
		String titulo, rotulo, parrafo, url;

		System.out.println("Introduzca el titulo (<title>) de la pagina web:");
		titulo = scanner.nextLine();

		System.out.println("Introduzca el teto del rotulo h1(<h1>) de la pagina web:");
		rotulo = scanner.nextLine();

		System.out.println("Introduzca el texto del parrafo p(<p>) de la pagina web:");
		parrafo = scanner.nextLine();

		System.out.println("Introduzca la pagina web que se enlazara en la etiqueta < a href=>: ");
		url = scanner.nextLine();

		PaginaWeb Pagina = new PaginaWeb(titulo, rotulo, parrafo, url);
		TODAS.add(Pagina);
	}

	private static void CrearPagina(ArrayList TODAS, int num) throws IOException {
		Scanner scanner = new Scanner(System.in);
		PaginaWeb P = null;

		PaginaWeb Pag;
		File Web = new File("index"+num+".html");
		try {
			Web.createNewFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		FileWriter Escribir = new FileWriter(Web);

		P = (PaginaWeb) TODAS.get(num);// Le decimos la posicion del array para saber los datos de la pagina

		Escribir.write("<html>\n<head>\n<title>" + P.getTitulo() + "</title>\n</head>\n<body>\n<h1>" + P.getRotulo()
				+ "</h1>\n<p>" + P.getParrafo() + "</p>\n<a href = 'http://" + P.getURL()
				+ "'>Esto es un enlace</a>\n</body>\n</html>");
		Escribir.close();
		System.out.println("Pagina web creada!, gracias por utilizar este programa...");
	}

}

class PaginaWeb {

	private String Titulo;
	private String Rotulo;
	private String Parrafo;
	private String URL;

	public PaginaWeb(String Titulo, String Rotulo, String Parrafo, String URL) {
		this.Titulo = Titulo;
		this.Rotulo = Rotulo;
		this.Parrafo = Parrafo;
		this.URL = URL;
	}

	public String getTitulo() {
		return Titulo;
	}

	public String getRotulo() {
		return Rotulo;
	}

	public String getParrafo() {
		return Parrafo;
	}

	public String getURL() {
		return URL;
	}

}