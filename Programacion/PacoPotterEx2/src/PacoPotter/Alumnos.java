package PacoPotter;

public class Alumnos {
	String nombre;
	String DNI;
	int Edad;
	static int contador=1;
	int ID;
	
	public Alumnos(String DNI,String nombre, int Edad) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.Edad= Edad;
		ID=contador;
		contador++;
	}
	
	public String Ver_alumno() {
		return "\tAlumno de NIF: "+DNI+" y nombre: "+nombre+" tiene "+Edad+" anios.";
	}
	
	public String getDniAlu() {
		return DNI;
	}
	
	public String getNombreAlu() {
		return nombre;
	}
	public int getEdadAlu() {
		return Edad;
	}
	

}
