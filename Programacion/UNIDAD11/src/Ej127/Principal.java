package Ej127;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opc;

		ArrayList<Mascota> Lista = new ArrayList<Mascota>();

		do {
			opc = menu();

			switch (opc) {

			case 1:
				Alta_Mascota(Lista);
				break;
			case 2:
				Perros_Gatos(Lista);
				break;
			case 3:
				Periquitos_Conejos(Lista);
				break;
			case 4:
				Gatos_Periquitos(Lista);
				break;
			case 5:
				Perros_Conejos(Lista);
				break;
			}

		} while (opc != 6);
		System.out.println("Gracias por utilizar el programa Mascotas");
	}

	private static int menu() {
		Scanner scanner = new Scanner(System.in);
		int opc;
		System.out.println(
				"-----------------------------\r\n" + "1-Dar de alta una mascota\r\n" + "2-Escuchar perros y gatos\r\n"
						+ "3-Escuchar periquitos y conejos\r\n" + "4-Escuchar gatos y periquitos\r\n"
						+ "5-Escuchar perros y conejos\r\n" + "6-Salir\r\n" + "-----------------------------");
		opc = scanner.nextInt();
		return opc;
	}

	private static void Alta_Mascota(ArrayList<Mascota> lista) {

		Scanner scanner = new Scanner(System.in);
		String tipo, nombre;

		do {
			System.out.println("Introduzca el tipo de mascota a dar de alta (P-Perro/G-Gato/Q-Periquito/C-Conejo):");
			tipo = scanner.nextLine().toLowerCase();

		} while (!tipo.equals("p") && !tipo.equals("g") && !tipo.equals("q") && !tipo.equals("c"));

		System.out.println("Introduzca el nombre de la mascota:");
		nombre = scanner.nextLine();

		switch (tipo) {
		case "p":
			Perro P = new Perro(nombre, "Perro");
			lista.add(P);
			System.out.println("Se ha dado de alta un perro de nombre: " + nombre);
			break;
		case "g":
			Gato G = new Gato(nombre, "Gato");
			lista.add(G);
			System.out.println("Se ha dado de alta un gato de nombre: " + nombre);
			break;
		case "q":
			Periquito Q = new Periquito(nombre, "Periquito");
			lista.add(Q);
			System.out.println("Se ha dado de alta un periquito de nombre: " + nombre);
			break;
		case "c":
			Conejo C = new Conejo(nombre, "Conejo");
			lista.add(C);
			System.out.println("Se ha dado de alta un conejo de nombre: " + nombre);
			break;

		}
	}

	private static void Perros_Gatos(ArrayList<Mascota> lista) {
		Mascota M;
		Iterator<Mascota> iter = lista.iterator();
		while (iter.hasNext()) {
			M = iter.next();

			if (M.getTipo().equals("Perro"))
				System.out.println("Hola me llamo "+M.getNombre() + " y soy "+M.getTipo() +" y hago "+ M.sonido());
			if (M.getTipo().equals("Gato"))
				System.out.println("Hola me llamo "+M.getNombre() + " y soy "+M.getTipo() +" y hago "+ M.sonido());
		}
	}

	private static void Periquitos_Conejos(ArrayList<Mascota> lista) {
		Mascota M;
		Iterator<Mascota> iter = lista.iterator();
		while (iter.hasNext()) {
			M = iter.next();

			if (M.getTipo().equals("Periquito"))
				System.out.println("Hola me llamo "+M.getNombre() + " y soy "+M.getTipo() +" y hago "+ M.sonido());
			if (M.getTipo().equals("Conejo"))
				System.out.println("Hola me llamo "+M.getNombre() + " y soy "+M.getTipo() +" y hago "+ M.sonido());
		}
	}

	private static void Gatos_Periquitos(ArrayList<Mascota> lista) {
		Mascota M;
		Iterator<Mascota> iter = lista.iterator();
		while (iter.hasNext()) {
			M = iter.next();

			if (M.getTipo().equals("Gato"))
				System.out.println("Hola me llamo "+M.getNombre() + " y soy "+M.getTipo() +" y hago "+ M.sonido());
			if (M.getTipo().equals("Periquito"))
				System.out.println("Hola me llamo "+M.getNombre() + " y soy "+M.getTipo() +" y hago "+ M.sonido());
		}
	}

	private static void Perros_Conejos(ArrayList<Mascota> lista) {
		Mascota M;
		Iterator<Mascota> iter = lista.iterator();
		while (iter.hasNext()) {
			M = iter.next();

			if (M.getTipo().equals("Perro"))
				System.out.println("Hola me llamo "+M.getNombre() + " y soy "+M.getTipo() +" y hago "+ M.sonido());
			if (M.getTipo().equals("Conejo"))
				System.out.println("Hola me llamo "+M.getNombre() + " y soy "+M.getTipo() +" y hago "+ M.sonido());
		}
	}
}
