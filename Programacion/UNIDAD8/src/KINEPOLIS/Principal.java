package KINEPOLIS;

import java.util.*;

public class Principal {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int opc, cant, anyadir, edad, info;
		String nombre;

		System.out.println("Bienvenido a Kinepolis, ¿de cuantas salas dispone tu cine?");
		cant = scanner.nextInt();

		ArrayList<Queue<Cliente>> Colacine = new ArrayList<Queue<Cliente>>();

		for (int i = 0; i < cant; i++) {
			Queue<Cliente> Sala = new LinkedList<Cliente>();
			Colacine.add(Sala);
		}

		System.out.println("---- Menu KINEPOLIS ----");
		do {
			System.out.println("1-Encolar cliente en una sala");
			System.out.println("2-Desencolar cliente en una sala");
			System.out.println("3-Informacion de una sala");
			System.out.println("Estado del cine");
			System.out.println("5-Salir");
			opc = scanner.nextInt();
			scanner.nextLine();

			switch (opc) {
			case 1:
				Encolar(Colacine);
				break;
			case 2: Desencolar(Colacine);
				break;
			case 3:
				Informacion(Colacine);
				break;
			case 4:
				Estado(Colacine);
				break;
			case 5:
				break;
			default:
				System.out.println("Opcion invalida");
			}

		} while (opc != 5);

	}



	private static void Encolar(ArrayList<Queue<Cliente>> colacine) {
		int oper, edad;
		String nombre;
		System.out.println("¿Sobre que sala desea realizar la operacion?");
		oper = scanner.nextInt();
		scanner.nextLine();

		while (oper > colacine.size() || oper < 1) {
			System.out.println(
					"Valor de sala introducido erroneo. Introduzca valores desde el 1 hasta el " + colacine.size());
			oper = scanner.nextInt();
			scanner.nextLine();
		}

		System.out.println("Introduzca nombre del nuevo cliente para la sala " + oper);
		nombre = scanner.nextLine();
		System.out.println("Introduzca su edad:");
		edad = scanner.nextInt();
		scanner.nextLine();

		colacine.get(oper - 1).add(new Cliente(nombre, edad));

	}
	private static void Desencolar(ArrayList<Queue<Cliente>> colacine) {
		int oper;
		System.out.println("¿Sobre que sala desea realizar la operacion?");
		oper = scanner.nextInt();
		scanner.nextLine();

		while (oper > colacine.size() || oper < 1) {
			System.out.println(
					"Valor de sala introducido erroneo. Introduzca valores desde el 1 hasta el " + colacine.size());
			oper = scanner.nextInt();
			scanner.nextLine();
		}
		
		colacine.get(oper-1).remove();

		
	}
	private static void Informacion(ArrayList<Queue<Cliente>> colacine) {
		int oper;
		System.out.println("¿Sobre que sala desea realizar la operacion?");
		oper = scanner.nextInt();
		scanner.nextLine();

		while (oper > colacine.size() || oper < 1) {
			System.out.println(
					"Valor de sala introducido erroneo. Introduzca valores desde el 1 hasta el " + colacine.size());
			oper = scanner.nextInt();
			scanner.nextLine();
		}

		Queue<Cliente> Aux;

		for (int i = 0; i < colacine.size(); i++) {

			if (i == (oper - 1)) {
				Aux = colacine.get(i);

				Iterator iter = Aux.iterator();
				while (iter.hasNext()) {
					Cliente cliaux = (Cliente) iter.next();
					cliaux.mostrar();
				}
			}

		}

	}

	private static void Estado(ArrayList<Queue<Cliente>> colacine) {
		// Creaccion de cola auxiliar
		Queue<Cliente> Aux;

		// Recorremos el arrayList
		for (int i = 0; i < colacine.size(); i++) {

			// Igualamos la cola auxiliar a la cola del arrayList en la posicion i
			Aux = colacine.get(i);
			System.out.println("clientes de la sala " + (i + 1) + ":");

			// Recorremos la cola y mostramos
			Iterator iter = Aux.iterator();
			while (iter.hasNext()) {
				Cliente cliaux = (Cliente) iter.next();
				cliaux.mostrar();
			}
		}

	}

}
