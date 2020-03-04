package BeKindRewind;

import java.util.*;

public class Pelicula {
	String titulo;
	int OscarsTotales;
	String Director;
	String Productor;
	
	Director Dire;

	ArrayList<String> Actores = new ArrayList<String>();

//	Director dire; Para hacer de tal forma que desde aqui llamamos al director/productor/actor para saber sus oscars
//	Productor Produ;
//	Actor Acto;

	public Pelicula(String titulo, Director Director, String Productor, int OscarsTotales, ArrayList<String> Actores) {
		this.titulo = titulo;
		this.OscarsTotales = OscarsTotales;
		this.Actores = Actores;
		Dire = Director; // Nombre del director
		this.Productor = Productor;
	}

	// COMO HACER MEJOR QUE DEVUELVA TODO Y LOS OSCARS MEJORAR, CALCULAR OSCARS AQUI
	// Y NO EN EL PRINCPIAL
	public void ReturnPeli() {
		System.out.println("+'" + titulo + "', dirigida por:" + Dire.getNombreDirector() + " producida por: " + Productor
				+ " e interpretada por: ");
		VerActores(Actores);
		System.out
				.println("Entre el director, productor y actores, " + titulo + " tiene " + OscarsTotales + " oscars.\n\n--");
		//return ""; HE CAMBIADO A VOID, ESTABA CON STRING

	}

	// COMO IMPRIMIR POR PANTALLA ACTORES
	public void VerActores(ArrayList<String> Actores) {
		for (int i = 0; i < Actores.size(); i++) {
			System.out.println(Actores.get(i));
		}
	}

}
