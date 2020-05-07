package Ejer122;

public class Persona {

	private String Nombre,DNI,lugar_de_residencia;
	private int Edad;
	
	public Persona(String Nombre,String DNI, String lugar_de_residencia,int Edad){
		this.DNI = DNI;
		this.Nombre = Nombre;
		this.lugar_de_residencia = lugar_de_residencia;
		this.Edad = Edad;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public String getDni() {
		return DNI;
	}
	public String getResidencia() {
		return lugar_de_residencia;
	}
	public int getEdad() {
		return Edad;
	}
	public int Jubilacion() {
		return (65 - this.Edad);
	}
}
