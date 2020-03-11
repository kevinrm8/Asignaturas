package PACOWARSDIA10032020;

public class Tripulantes {

	private String nombre;
	private int edad;
	private String rango;

	public Tripulantes(String nombre, int edad, String rango) {
		this.nombre = nombre;
		this.edad = edad;
		if (rango.equals("soldado")) {
			rango = "Soldado";
		} else {
			if (rango.equals("capitan")) {
				rango = "Capitan";
			} else
				rango = "Comandante";
		}

	}
	
	public String getNombreTripulante() {
		return nombre;
	}
	public String getRangoTripulante() {
		return rango;
		
	}	public int getEdadTripulante() {
		return edad;
	}
	
}
