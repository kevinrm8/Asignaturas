package PacoWar;

import java.util.*;
/* 
 * Nombre: kevin
 * Fecha: 26/02/2020
 * */

public class Nave {
	
	public static Scanner scanner = new Scanner(System.in);

	 String nombre;
	 ArrayList<Tripulante> Tripul = new ArrayList<Tripulante>();
	 
	public Nave(String nombre) {
		
		this.nombre = nombre;
	}
	
	public void getNave() {
		System.out.println(nombre);
	}
	
	public void Nuevo_Trip(String NomNave) { // CREO EL TRIPULANTE EN LA NAVE QUE ME PASAN
		String NomTrip,Rango;
		int EdadTrip;
		
		System.out.println("Introduzca el nombre del tripulante para la nave " + NomNave);
		NomTrip = scanner.nextLine();
		System.out.println("Introduzca la edad del nuevo tripulante:");
		EdadTrip = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Intrdozuca su rango(Soldado,Capitan,Comandante)");
		Rango = scanner.nextLine();
		Tripulante Trip = new Tripulante(NomTrip, EdadTrip, Rango); // LE AÑADO AL TRIPULANTE NOMBRE EDAD RANGO
		
		Tripul.add(Trip); // GUARDO EL TRIPULANTE EN EL ARRAYLIST
	}
	
	public void Mostrar_Nave(String NomNave) {
		
		
	}
}
