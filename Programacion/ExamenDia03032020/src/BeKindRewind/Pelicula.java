package BeKindRewind;

import java.util.*;

public class Pelicula {
	String titulo;
	int OscarsTotales;

	Actor Act;
	Director Dire;
	Productor Produ;
	
	ArrayList<Actor> Actor = new ArrayList<Actor>();

//	Director dire; Para hacer de tal forma que desde aqui llamamos al director/productor/actor para saber sus oscars
//	Productor Produ;
//	Actor Acto;

	public Pelicula(String titulo, Director Director,Productor Productor, ArrayList<Actor> Actores) {
		this.titulo = titulo;
		Actor = Actores;
		Dire = Director; // Nombre del director
		Produ = Productor;
	}

	// COMO HACER MEJOR QUE DEVUELVA TODO Y LOS OSCARS MEJORAR, CALCULAR OSCARS AQUI
	// Y NO EN EL PRINCPIAL
	public void ReturnPeli() {
		System.out.println("--\n+'" + titulo + "', dirigida por:" + Dire.getNombreDirector() + " producida por: " + Produ.getNombreProductor()
				+ " e interpretada por:");
		VerActores(Actor);
		OscarsTotales = calculoOscar(Actor);
		System.out
				.println("Entre el director, productor y actores, " + titulo + " tiene " + OscarsTotales + " oscars.\n\n--");
		//return ""; HE CAMBIADO A VOID, ESTABA CON STRING

	}

	// COMO IMPRIMIR POR PANTALLA ACTORES
	public void VerActores(ArrayList<Actor> Actores) {
		
		Iterator iter = Actores.iterator();
		while(iter.hasNext()) {
		Act = (Actor) iter.next();
		System.out.println(Act.getNombreActor());
		}
		
	}

	private int calculoOscar(ArrayList<Actor> Actores) {
		int total=0;
		
		total = Dire.getOscarsDirector()+Produ.getOscarsProductor();
		Iterator iter = Actores.iterator();
		while(iter.hasNext()) {
		Act = (Actor) iter.next();
		total += Act.getOscarsActor();
		}
		
		return total;
	}

}
