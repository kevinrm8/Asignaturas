package EJERCICIOCINEMIO;

public class Cliente {

	String Nombre;
	int edad;
	
	public Cliente(String nombre,int edad){
		this.Nombre = nombre;
		this.edad = edad;
		
	}
	
	public String getNombre() {
		return Nombre;
	}
	public int getEdad() {
		return edad;
	}
	
}


