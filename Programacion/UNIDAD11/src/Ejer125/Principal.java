package Ejer125;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		String Titulo, Autor, Formato, Actor,Actriz;
		int Duracion;
		
		ListaMultimedia LM = new ListaMultimedia(10); // a) Se crea un objeto de tipo ListaMultimedia de tamaño máximo 10.
		for(int i=0;i<2;i++) {
			
			System.out.println("Nombre del titulo "+i+":");
			Titulo = scanner.nextLine();
			System.out.println("Nombre del Autor "+i+":");
			Autor = scanner.nextLine();
			System.out.println("Nombre del Formato "+i+":");
			Formato = scanner.nextLine();
			System.out.println("Duracion de la pelicula "+i+":");
			Duracion = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Nombre del Actor "+i+":");
			Actor = scanner.nextLine();
			System.out.println("Nombre de la Actriz "+i+":");
			Actriz = scanner.nextLine();
			Pelicula peli = new Pelicula(Titulo,Autor,Formato,Duracion,Actor,Actriz);
			LM.add(peli);
		}
		System.out.println(LM.toString());
		Pelicula busca = new Pelicula("Titanic","James Cameron","0",0,"0","0");
		int posicion = LM.indexOf(busca);
		Pelicula recupera = (Pelicula)LM.get(posicion);
		System.out.println("POS "+posicion+":"+recupera.toString());
	}

}
