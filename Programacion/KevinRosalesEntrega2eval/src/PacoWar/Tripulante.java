package PacoWar;
/* 
 * Nombre: kevin
 * Fecha: 26/02/2020
 * */
public class Tripulante {
		String nombre;
		int edad;
		String rango;
	
	public Tripulante(String nombre,int edad,String rango){
		this.nombre = nombre;
		this.edad = edad;
		this.rango = rango;
	}
	
	public void mostrar_tripulante() {
		System.out.println("- "+rango+" "+nombre+" ("+edad+")");
	}
	

}
