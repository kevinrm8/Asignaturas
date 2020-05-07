package Ej127;

public abstract class Mascota {

	private String Nombre;
	private String Tipo;
	public Mascota(String nombre,String tipo) {
		Nombre = nombre;
		Tipo = tipo;
	}
	public abstract String sonido();
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
}
