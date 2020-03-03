package BeKindRewind;

public class Director {

	String nombre;
	int edad;
	int oscars;

	public Director(String nombre, int edad, int oscars) {
		this.nombre = nombre;
		this.edad = edad;
		this.oscars = oscars;
	}

	public String getNombreDirector() {
		return nombre;
	}
	
	public int getOscarsDirector() {
		return oscars;
	}
}
