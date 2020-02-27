package StarWarsPaco;

public class Tripulante {

	String nombre;
	String rango;
	int edad;
	
	public Tripulante(String nombre, int edad, String rango) {
		this.nombre = nombre;
		this.edad = edad;
		this.rango = rango;
	}
	
	public void MostrarTripulante() {
		System.out.println("- "+rango+" "+nombre+"("+edad+")");
	}
	
}
