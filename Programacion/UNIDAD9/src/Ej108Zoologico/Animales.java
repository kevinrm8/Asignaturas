package Ej108Zoologico;

public class Animales {
	private String nombre;
	private String tipo;
	private int peso;

	public Animales(String nombre, String tipo, int peso) {
		this.nombre = nombre;
		if(tipo.equals("t")) {
			this.tipo = "Tigre";
		}else 
			this.tipo="Leon";
		
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
	public String Listado_animales() {
		return tipo+" de nombre "+nombre+" y peso "+peso+" kg.";
	}
}
