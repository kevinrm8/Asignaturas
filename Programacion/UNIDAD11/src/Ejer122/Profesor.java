package Ejer122;

public class Profesor extends Persona {

	private int Sueldo;
	private String Centro;
	private String Lugar_trabajo;

	public Profesor(String Nombre, String DNI, String lugar_de_residencia, int Edad, int Sueldo, String Centro,
			String Lugar_trabajo) {
		super(Nombre, DNI, lugar_de_residencia, Edad);

		this.Sueldo = Sueldo;
		this.Centro = Centro;
		this.Lugar_trabajo = Lugar_trabajo;
	}

	public int getSueldo() {
		return Sueldo;
	}
	public String getCentro() {
		return Centro;
	}
	public String getLugarTrabajo() {
		return Lugar_trabajo;
	}
	
	public boolean Mismo(String lugar_trabajo, String lugar_de_residencia) {

		if (lugar_trabajo.equals(lugar_de_residencia))
			return true;
		else
			return false;

	}
	
}
