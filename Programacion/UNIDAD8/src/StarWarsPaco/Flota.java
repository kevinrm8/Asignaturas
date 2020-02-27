package StarWarsPaco;

import java.util.ArrayList;

public class Flota {

	String nombre;
	ArrayList<Nave> Naves = new ArrayList<Nave>();
	
	public Flota(String nombre) {
		this.nombre = nombre;
	}
	
	public void meterNave(Nave f) {
		Naves.add(f);
		
	}
	public void VerFlota() {
		for (int i = 0; i < Naves.size(); i++) {
			Naves.get(i).getNombre();
		}
	}
	
}
