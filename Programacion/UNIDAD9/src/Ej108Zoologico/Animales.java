package Ej108Zoologico;

public class Animales {
	private String nombre;
	private String tipo;
	private int peso;

	public Animales(String nombre, String tipo, int peso) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int nuevoPeso) {
		peso = nuevoPeso;
	}
}
