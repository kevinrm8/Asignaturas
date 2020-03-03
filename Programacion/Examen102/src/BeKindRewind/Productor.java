package BeKindRewind;

public class Productor {

	String nombre;
	int edad;
	int oscars;

	public Productor(String nombre, int edad, int oscars) {
		this.nombre = nombre;
		this.edad = edad;
		this.oscars = oscars;

	}
	
	public String getNombreProductor() {
		return nombre;
	}
	public int getOscarsProductor() {
		return oscars;
	}
}
