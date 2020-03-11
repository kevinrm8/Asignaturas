package PACOWARSDIA10032020;

import java.util.*;

public class Naves {

	private String nombre;
	public ArrayList<Tripulantes> Lista_Tripulacion = new ArrayList<Tripulantes>();

	public Naves(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombreNaves() {
		return nombre;
	}
	
	public void setTripulante(Tripulantes t){
		this.Lista_Tripulacion.add(t);
	}
	
	public int ContarTripulantes() {
		int numTrip=0;
		Iterator iter = Lista_Tripulacion.iterator();
		while(iter.hasNext()) {
			Tripulantes t = (Tripulantes) iter.next();
			numTrip++;
		}
		return numTrip;
	}
	
	public void VerTripulantes() {
		Iterator iter = Lista_Tripulacion.iterator();
		while(iter.hasNext()) {
			Tripulantes t = (Tripulantes)iter.next();
			System.out.println(t.getNombreTripulante());
		}
	}
}
