package AvionEj95B;

import java.util.*;



public class Principal {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		ArrayList<Vuelos> Billetes = new ArrayList<Vuelos>();
		
		String opc;

		
		System.out.println("Bienvenido a las aerolineas paco Airways, ¿qué desea hacer?");
		
		
		do {
			System.out.println("1-Comprar billete de avion");
			System.out.println("2-Cancelar billete de avion");
			System.out.println("3-Estado de mi reserva");
			System.out.println("S-Salir");
			System.out.println("OPCION:");

			opc = scanner.nextLine();
			opc = opc.toUpperCase();
			
			switch(opc) {
			
			case "1": 
				CrearBillete(Billetes);
				break;
				
			case "2": 
				cancelar(Billetes);
				
				break;
				
			case "3": 
					estado(Billetes);
				break;

			case "S":
				System.out.println("Paco Airways no le agradece su confianza. Gracias por nada.");
				break;
			}
			
		}while (!opc.equals("S"));
	}


	private static void CrearBillete(ArrayList<Vuelos> Billetes) {
		String MiBillete;
		String[] separado;
		
		System.out.println("Introduzca origen, destino, dia de ida y dia de vuelta separados por @:");
		MiBillete = scanner.nextLine();
		separado = MiBillete.split("@");
		
		
		Vuelos billete = new Vuelos(separado[0],separado[1],separado[2],separado[3]);
		Billetes.add(billete);
		System.out.println("Billete comprado!\n");
		
	}
	
	
	private static void cancelar(ArrayList<Vuelos> billetes) {
		
		int numero;
		String ver;
		
		System.out.println("Introduzca id del billete a cancelar");
		numero = Integer.parseInt(scanner.nextLine());
		if(numero>billetes.size()) {
			System.out.println("No existe el billete seleccionado\n");
		}else {
		
		System.out.println("Seguro quiere cancelar el vuelo?(S/N)");
		ver=scanner.nextLine();
		ver = ver.toUpperCase();
		
		if(ver.equals("S")) {
			billetes.get(numero-1).cancelar();
			System.out.println("Billete cancelado!\n");
		}else {
			System.out.println("Operacion de cancelacion cancelada a su vez\n");
			}
		}
	}

	private static void estado(ArrayList<Vuelos> billetes) {
		String est;
		System.out.println("V-Vigentes,C-Cancelados,T-Todos");
		
		est = scanner.nextLine();
		est= est.toUpperCase();
		
		Iterator<Vuelos> iter = billetes.iterator();
		while(iter.hasNext()){
			Vuelos b = iter.next();
			b.MostrarVuelos(est);
			
		}
		
	}

	
}
