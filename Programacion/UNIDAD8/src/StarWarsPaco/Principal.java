package StarWarsPaco;

import java.util.*;

public class Principal {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion_menu;

		ArrayList<Nave> Lista_nave = new ArrayList<Nave>();
		ArrayList<Flota> Lista_flota = new ArrayList<Flota>();

		opcion_menu = menu();
		while (opcion_menu != 0) {
			switch (opcion_menu) {
			case 1:
				Alta_de_nave(Lista_nave);
				break;
			case 2:
				Alta_de_tripulante(Lista_nave);
				break;
			case 3:
				Alta_de_flota(Lista_flota, Lista_nave);
				break;
			case 4:
				Consultar_nave(Lista_nave);
				break;
			case 5: Consultar_flota(Lista_flota);
				break;

			default:
				break;
			}
			opcion_menu = menu();
		}
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

	private static void Alta_de_nave(ArrayList<Nave> lista_nave) {
		String NomNave;
		System.out.println("Dime el nombre de la nave:");
		NomNave = scanner.nextLine().toLowerCase();
		Nave Nave = new Nave(NomNave);
		lista_nave.add(Nave);
	}

	private static void Alta_de_tripulante(ArrayList<Nave> lista_nave) {
		String NomNave;
		int IndiceNave = -1;

		System.out.println("Nave en el que introducir el tripulante:");
		NomNave = scanner.nextLine().toLowerCase();

		for (int i = 0; i < lista_nave.size(); i++) {
			Nave NaveAux = lista_nave.get(i);

			if (NaveAux.nombre.equals(NomNave)) {
				IndiceNave = i;

				// crear_tripulante(); AQUI CREAR EL METODO PARA HACER EL TRIPULANTE
				String nombre;
				String rango;
				int edad;

				System.out.println("Nombre tripulante:");
				nombre = scanner.nextLine();
				System.out.println("Edad tripulante:");
				edad = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Rango tripulante:");
				rango = scanner.nextLine();

				lista_nave.get(IndiceNave).meterTripulante(new Tripulante(nombre, edad, rango));

			}

		}
		if (IndiceNave == -1) {
			System.out.println("La nave no existe");
		}

	}

	private static void Alta_de_flota(ArrayList<Flota> lista_flota,ArrayList<Nave> lista_nave) {
		String nombreFlota,NomNave;
		int Indice;
		
		System.out.println("Dime nombre de la flota:");
		nombreFlota = scanner.nextLine().toLowerCase();
		
		Flota Flota = new Flota(nombreFlota);
		lista_flota.add(Flota);
		//CREADA LA FLOTA, FALTA PONER NAVES EN LA FLOTA
		
		System.out.println("Nave a introducir en la flota "+nombreFlota);
		NomNave = scanner.nextLine();
		
			for(int i=0;i<lista_nave.size();i++) {
				Nave NaveAux = lista_nave.get(i);
				if(NaveAux.nombre.equals(NomNave)) {
					
					Indice = i;	
					lista_flota.get(0).meterNave(lista_nave.get(Indice));
					
//					lista_flota.get(Indice).meterNave(NaveAux);

				}
				

			}
		
		

	}

	private static void Consultar_nave(ArrayList<Nave> lista_nave) {
		String NomNave;
		int IndiceNave=-1;

		System.out.println("Nave a consultar:");
		NomNave = scanner.nextLine().toLowerCase();
		
		for(int i=0;i<lista_nave.size();i++) {
			Nave NaveAux = lista_nave.get(i);
			
			if(NaveAux.nombre.equals(NomNave)) {
				IndiceNave = i;
				
				lista_nave.get(IndiceNave).sacarTripulante();
				
				}
			
		}
		
	}


	private static void Consultar_flota(ArrayList<Flota> lista_flota) {
		String NomFlota;
		int IndiceNave=-1;

		System.out.println("Flota a consultar");
		NomFlota = scanner.nextLine().toLowerCase();
		
		for(int i=0;i<lista_flota.size();i++) {
			Flota FlotaAux = lista_flota.get(i);
			
			if(FlotaAux.nombre.equals(NomFlota)) {
				IndiceNave = i;
				
				 lista_flota.get(IndiceNave).VerFlota();
				
				}
			
		}
		
	}
}
