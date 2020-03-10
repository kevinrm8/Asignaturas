package BeKindRewind;

import java.util.*;

public class Principal {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int opc;

		ArrayList<Director> Directores = new ArrayList<Director>();
		ArrayList<Actor> Actores = new ArrayList<Actor>();
		ArrayList<Productor> Productores = new ArrayList<Productor>();
		ArrayList<Pelicula> Peliculas = new ArrayList<Pelicula>();

		do {
			opc = menu();
			switch (opc) {
			case 1:
				Alta_Director(Directores);
				break;
			case 2:
				Alta_Actor(Actores);
				break;
			case 3:
				Alta_Productor(Productores);
				break;
			case 4:
				Alta_Pelicula(Peliculas, Directores, Productores, Actores);
				break;
			case 5:
				Listado_Peliculas(Peliculas, Directores, Productores, Actores);
				break;
			case 6:
				System.out.println("Fin");
				break;
			default:
				System.out.println("Valor no valido");
			}

		} while (opc != 6);
	}

	private static int menu() {
		int opc;

		System.out.println("--VIDEOCLUB BE KIND - REWIND--");
		System.out.println("1-Dar de alta un Director");
		System.out.println("2-Dar de alta un Actor");
		System.out.println("3-Dar de alta un Productor");
		System.out.println("4-Dar de alta una Pelicula");
		System.out.println("5-Listado de peliculas");
		System.out.println("6-Salir");
		opc = scanner.nextInt();
		scanner.nextLine();

		return opc;
	}

	private static void Alta_Director(ArrayList<Director> directores) {

		String nombre;
		int edad, oscars;

		System.out.println("Vamos a dar de alta un Director\nIntroduzca su nombre:");
		nombre = scanner.nextLine();
		System.out.println("Introduzca la edad de " + nombre);
		edad = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Introduzca el numero de oscars que ha ganado " + nombre);
		oscars = scanner.nextInt();

		directores.add(new Director(nombre, edad, oscars));
		System.out.println("Director numero " + (directores.size()) + " dado de alta!");

	}

	private static void Alta_Productor(ArrayList<Productor> productores) {

		String nombre;
		int edad, oscars;

		System.out.println("Vamos a dar de alta un Productor\nIntroduzca su nombre:");
		nombre = scanner.nextLine();
		System.out.println("Introduzca la edad de " + nombre);
		edad = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Introduzca el numero de oscars que ha ganado " + nombre);
		oscars = scanner.nextInt();

		productores.add(new Productor(nombre, edad, oscars));
		System.out.println("Productor numero " + (productores.size()) + " dado de alta!");

	}

	private static void Alta_Actor(ArrayList<Actor> actores) {

		String nombre;
		int edad, oscars;

		System.out.println("Vamos a dar de alta un Actor\nIntroduzca su nombre:");
		nombre = scanner.nextLine();
		System.out.println("Introduzca la edad de " + nombre);
		edad = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Introduzca el numero de oscars que ha ganado " + nombre);
		oscars = scanner.nextInt();

		actores.add(new Actor(nombre, edad, oscars));
		System.out.println("Actor numero " + (actores.size()) + " dado de alta!");
	}

	private static void Alta_Pelicula(ArrayList<Pelicula> peliculas, ArrayList<Director> directores,
			ArrayList<Productor> productores, ArrayList<Actor> actores) {

		String titulo, Director, Productor, Actor;
		int oscars = 0, cont = 1; // Contador de los oscars que tiene la pelicula y los actores de la pelicula
		Director DireAux = null;
		Productor ProduAux = null;
		Actor Act = null;
		
		ArrayList<Actor> ActorAux = new ArrayList<Actor>();

		System.out.println("Introduzca el titulo de la nueva Pelicula");
		titulo = scanner.nextLine();

		System.out.println("Introduzca el director de " + titulo);
		Director = scanner.nextLine();
		//ITERATOR DE DIRECTORES
		Iterator iter = directores.iterator();
		while(iter.hasNext()) {
			DireAux = (Director) iter.next();
			if(DireAux.getNombreDirector().equals(Director)) {
				break;
			}
		}

		System.out.println("Introduzca el productor de " + titulo);
		Productor = scanner.nextLine();
		//ITERATOR PRODUCTOR
		
		iter = productores.iterator();
		while(iter.hasNext()) {
			ProduAux = (Productor) iter.next();
			if(ProduAux.getNombreProductor().equals(Productor)) {
				break;
			}
		}	
		
		System.out.println("Ahora vamos a introducir los actores de " + titulo
				+ ", pulse 'salir' en cualquier momento para dejar de introducirlos:");
		do {
			System.out.println("Introduzca nombre del actor:" + cont);
			Actor = scanner.nextLine();

			iter = actores.iterator();
			while(iter.hasNext()) {
				Act = (Actor) iter.next();
				if(Act.getNombreActor().equals(Actor)) {
					ActorAux.add(Act);
				}
			}
			
			cont++;
		} while (!Actor.equals("salir"));

		peliculas.add(new Pelicula(titulo, DireAux, ProduAux, ActorAux)); // Creo pelicula con el titulo y
																					// oscars totales
	} 


	private static void Listado_Peliculas(ArrayList<Pelicula> peliculas, ArrayList<Director> directores,
			ArrayList<Productor> productores, ArrayList<Actor> actores) {

		System.out.println("Peliculas: " + peliculas.size() + "\nDirectores: " + directores.size() + "\nProductores: "
				+ productores.size() + "\nActores: " + actores.size());
		for (int i = 0; i < peliculas.size(); i++) {
			peliculas.get(i).ReturnPeli();

		}
	}

}