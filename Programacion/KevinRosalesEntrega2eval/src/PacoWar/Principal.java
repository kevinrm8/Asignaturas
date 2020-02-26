package PacoWar;

import java.util.*;
/* 
 * Nombre: kevin
 * Fecha: 26/02/2020
 * */

public class Principal {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion_menu;

		ArrayList<Nave> MisNaves = new ArrayList<Nave>(); // EL ARRAYLIST DE NAVES
		ArrayList<Flota> MisFlotas = new ArrayList<Flota>(); // EL ARRAYLIST DE FLOTAS

		opcion_menu = menu();
		while (opcion_menu != 0) {
			switch (opcion_menu) {
			case 1:
				Alta_de_nave(MisNaves);
				break;
			case 2:
				Alta_de_tripulante(MisNaves);
				break;
			case 3:
				Alta_de_flota(MisFlotas);
				break;
			case 4:
				Consultar_Nave(MisNaves);
				break;
			case 5:
				Consultar_flota();
				break;

			default:
				break;
			}
			opcion_menu = menu();
		}
		System.out.println("Que la fuerza te acompañe...");
	}

	private static void Consultar_flota() {
		// TODO Auto-generated method stub

	}

	public static int menu() {
		int opc = 0;
		System.out.println("---Menu de la Galaxia---");
		System.out.println("1-Alta de nave\t\t\t4-Consultar nave");
		System.out.println("2-Alta de tripulante\t\t5-Consultar flota");
		System.out.println("3-Alta de flota\t\t\t0-Salir");
		System.out.println("-----------------------------");
		opc = scanner.nextInt();
		scanner.nextLine();
		return opc;
	}

	private static void Alta_de_nave(ArrayList<Nave> misNaves) {
		String nombre;
		System.out.println("Dime el nombre de la nave:");
		nombre = scanner.nextLine().toLowerCase();
		Nave Nave = new Nave(nombre);
		misNaves.add(Nave); // GUARDO NAVE EN ARRAYLIST
	}

	private static void Alta_de_tripulante(ArrayList<Nave> misNaves) {
		String NomNave;

		System.out.println("Introduzca nombre de la nave donde desea dar de alta al tripulante:");
		NomNave = scanner.nextLine().toLowerCase();

		Iterator iter = misNaves.iterator();
		while (iter.hasNext()) {
			Nave NaveAux = (Nave) iter.next();
			if (NaveAux.nombre.equals(NomNave)) {// LLAMAR AL METODO DENTRO DE NAVE PARA CREAR EL NUEVO TRIPULANTE
				NaveAux.Nuevo_Trip(NomNave);
			} else {
				System.out.println("No existe esa nave"); // SI NO ENCUENTRAE EL NOMBRE DE LA NAVE SALE MENSAJE DE ERROR
			}
		}

	}

	private static void Alta_de_flota(ArrayList<Flota> misFlotas) {
		String NomFlota;
		System.out.println("Introduzca nombre para su flota:");
		NomFlota = scanner.nextLine().toLowerCase();

		Flota Flota = new Flota(NomFlota); // CREO LA FLOTA CON EL NOMBRE
		misFlotas.add(Flota); // AÑADO LA FLOTA A LA LISTA DE FLOTAS
	}

	private static void Consultar_Nave(ArrayList<Nave> misNaves) {
		String NomNave;

		System.out.println("Intoduzca nombre de la nave:");
		NomNave = scanner.nextLine().toLowerCase();
		
		Iterator iter = misNaves.iterator();
		while (iter.hasNext()) {
			Nave NaveAux = (Nave) iter.next();
			if (NaveAux.nombre.equals(NomNave)) {// LLAMAR AL METODO DENTRO DE NAVE PARA CREAR EL NUEVO TRIPULANTE
				NaveAux.Mostrar_Nave();
				//Nave VerTrip = new Nave(NomNave);
			//	VerTrip.Mostrar_Nave(NomNave); // NO CONSIGO QUE MUESTRE LOS TRIPULANTES DENTRO DE LA NAVE
			} else {
				System.out.println("No existe esa nave");
			}
		}
	}

}
