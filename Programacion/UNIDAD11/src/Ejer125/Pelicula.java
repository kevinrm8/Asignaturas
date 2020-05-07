package Ejer125;

public class Pelicula extends Multimedia {

	private String Actor;
	private String Actriz;

	public Pelicula(String Titulo, String Autor, String Formato, int Duracion, String Actor, String Actriz) {
		super(Titulo, Autor, Formato, Duracion);
		this.Actor=Actor;
		this.Actriz=Actriz;
	}

	public String getActor() {
		return Actor;
	}

	public void setActor(String actor) {
		Actor = actor;
	}

	public String getActriz() {
		return Actriz;
	}

	public void setActriz(String actriz) {
		Actriz = actriz;
	}

	public String ToString() {
		String resultado = "";
		resultado = this.Titulo + " | " + this.Autor + " | " + this.Formato + " | " + this.Duracion + " | " + this.Actor
				+ " | " + this.Actriz;
		return resultado;
	}

}
