package Ejer125;

public class Multimedia {

	protected String Titulo;
	protected String Autor;
	protected String Formato;
	protected int Duracion;

	// Formato puede ser : wav,mp3,midi,avi,mov,mpg,cdAudio y dvd
	public Multimedia(String Titulo, String Autor, String Formato, int Duracion) {
		this.Titulo = Titulo;
		this.Autor = Autor;
		this.Formato = Formato;
		this.Duracion = Duracion;
	}

	public void setTitulo(String Titulo) {
		this.Titulo = Titulo;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setAutor(String Autor) {
		this.Autor = Autor;
	}

	public String getAutor() {
		return Autor;
	}

	public void setFormato(String Formato) {
		this.Formato = Formato;
	}

	public String getFormato() {
		return Formato;
	}

	public void setDuracion(int Duracion) {
		this.Duracion = Duracion;
	}

	public int getDuracion() {
		return Duracion;
	}

	public String ToString() {
		String resultado;
		resultado = this.Titulo + " | " + this.Autor + " | " + this.Formato + " | " + this.Duracion;
		return resultado;
	}
	/*
	 * FALTA METODO EQUALS
	 */
}
