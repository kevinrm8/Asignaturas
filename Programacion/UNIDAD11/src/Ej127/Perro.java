package Ej127;

public class Perro extends Mascota{
	
	public Perro(String nombre,String tipo) {
		super(nombre,tipo);
	}

	public String sonido() {
		return "guau";
	}
}
