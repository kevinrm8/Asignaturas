package PACOWARSDIA10032020;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opc;

		ArrayList<Naves> Lista_Naves = new ArrayList<Naves>();
		ArrayList<Tripulantes> Lista_Tripulantes = new ArrayList<Tripulantes>();

		menu();
		opc = scanner.nextInt();
		while (opc != 0) {

			switch (opc) {

			case 1:
				Alta_nave(Lista_Naves);
				break;
			case 2:
				Alta_Tripulante(Lista_Naves,Lista_Tripulantes);
				break;
			case 3:
				break;
			case 4:Consultar_Nave(Lista_Naves);
				break;
			case 5:
				break;
			case 0:
				break;
			default:
				break;

			}
			menu();
			opc = scanner.nextInt();
		}



	}



	public static void menu() {

		System.out.println("----Menu de la galaxia----");
		System.out.println("1-Alta de nave\t\t 4-Consultar nave");
		System.out.println("2-Alta de tripulante\t 5-Consultar flota");
		System.out.println("3-Alta de flota\t\t 0-Salir");
	}

	private static void Alta_nave(ArrayList<Naves> lista_Naves) {

		Scanner scanner = new Scanner(System.in);
		String nombre;
		System.out.println("Introduzca nombre de la nave:");
		nombre = scanner.nextLine();
		Naves N = new Naves(nombre);
		lista_Naves.add(N);
	}

	private static void Alta_Tripulante(ArrayList<Naves> lista_Naves, ArrayList<Tripulantes> lista_Tripulantes) {
		Scanner scanner = new Scanner(System.in);
		String nave,nombre,rango;
		int edad;
		
		System.out.println("Introduzca el nombre de la nave donde desea dar de alta el tripulante:");
		nave = scanner.nextLine();
		
		Iterator iter = lista_Naves.iterator();
		while(iter.hasNext()) {
			Naves Naux = (Naves) iter.next();
			if(Naux.getNombreNaves().equals(nave)) {
				System.out.println("Introduzca el nombre del tripulante para la nave "+nave);
				nombre = scanner.nextLine();
				System.out.println("Introduzca la edad del nuevo tripulante:");
				edad = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Introduzca su rango (Soldado,Capitan,Comandante");
				rango = scanner.nextLine();			
				
				Naux.setTripulante(new Tripulantes(nombre,edad,rango));//Añado en la nave el tripulante
			}
		}
	}
	private static void Consultar_Nave(ArrayList<Naves> lista_Naves) {
		Scanner scanner = new Scanner(System.in);
		String nombre;
		
		System.out.println("Introduzca el nombre de la nave:");
		nombre = scanner.nextLine();
		Iterator iter = lista_Naves.iterator();
		while(iter.hasNext()) {
			Naves N = (Naves) iter.next();
			if(N.getNombreNaves().equals(nombre)) {
				System.out.println("Encontrada la nave "+nombre+" con "+N.ContarTripulantes()+" tripulantes:");	
				N.VerTripulantes();
			}
			
		}
		
	}
	
	
}
