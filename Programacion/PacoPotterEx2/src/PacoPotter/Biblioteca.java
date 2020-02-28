package PacoPotter;

public class Biblioteca {
	String titulo;
	String autor;
	int pag;
	String disponible;
	static int contador=1;
	int ID;
	
	public Biblioteca(String titulo,String autor,int pag) {
		this.titulo = titulo;
		this.autor = autor;
		this.pag = pag;
		disponible = "DISP";
		ID = contador;
		contador++;
		
	}
	
	public String Ver_libro() {
		return "\t- "+titulo+" escrito por: "+autor+ "tiene " +pag+" pags. | "+disponible;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getPaginas() {
		return pag;
	}
	public String getDisponible() {
		return disponible;
	}
	public void setPrest() {
		disponible = "PREST";
	}
	public void setDisp() {
		disponible = "DISP";
	}
}
