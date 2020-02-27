package StarWarsPaco;

import java.util.*;

public class Nave {

	String nombre;
	ArrayList<Tripulante> Tripulacion = new ArrayList<Tripulante>();

	public Nave(String nombre) {

		this.nombre = nombre;
	}

	public void getNombre() {
		System.out.println(nombre);
	}

	public void meterTripulante(Tripulante t) {
		Tripulacion.add(t);
	}

	public void sacarTripulante() {
		
		for (int i = 0; i < Tripulacion.size(); i++) {
			Tripulacion.get(i).MostrarTripulante();
		}
	}
}
