package BeKindRewind;

public class Actor {

	String nombre;
	int edad;
	int oscars;

	public Actor(String nombre, int edad, int oscars) {
		this.nombre = nombre;
		this.edad = edad;
		this.oscars = oscars;
	}

	public String getNombreActor() {
		return nombre;
	}

	public int getOscarsActor() {
		return oscars;
	}
}
