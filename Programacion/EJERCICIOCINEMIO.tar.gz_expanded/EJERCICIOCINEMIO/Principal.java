package EJERCICIOCINEMIO;

import java.util.*;

public class Principal {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int opc, cant_salas;

		System.out.println("Bienvenido a Kinepolis, �de cuantas salas dispone tu cine?");
		cant_salas = scanner.nextInt();
		scanner.nextLine();

		HashMap<Integer, Queue> Salas = new HashMap<Integer, Queue>();

		for (int i = 0; i < cant_salas; i++) {
			//Queue<Cliente> SalaCine = new LinkedList<Cliente>();
			//Salas.put(i, SalaCine);
			
			Salas.put(i, new LinkedList<Cliente>());
		}

		System.out.println("---- Menu KINEPOLIS ----");
		do {
			System.out.println("1-Encolar cliente en una sala");
			System.out.println("2-Desencolar cliente en una sala");
			System.out.println("3-Informacion de una sala");
			System.out.println("4-Estado del cine");
			System.out.println("5-Salir");
			opc = scanner.nextInt();
			scanner.nextLine();

			switch (opc) {
			case 1:
				Encolar(Salas);
				break;
			case 2:
				Desencolar(Salas);
				break;
			case 3:
				Informacion(Salas);
				break;
			case 4:
				Estado(Salas);
				break;
			case 5:
				System.out.println("ADIOS!");
				break;

			}

		} while (opc != 5);
	}

	private static void Encolar(HashMap<Integer, Queue> salas) {
		int oper, edad;
		String nombre;

		System.out.println("Sobre que sala desea realizar la operacion?");
		oper = scanner.nextInt();
		scanner.nextLine(); // SALA DONDE A�ADIR CLIENTES

		while (oper > salas.size()) {
			System.out.println(
					"Valor de sala introducido err�neo. Introduzca valores desde el 1 hasta el " + salas.size());
			oper = scanner.nextInt();
			scanner.nextLine(); // SALA DONDE A�ADIR CLIENTES

		}
		System.out.println("Introduzca el nombre del nuevo cliente para la sala " + oper + ":"); // PREGUNTO DATOS
																									// CLIENTE
		nombre = scanner.nextLine();
		System.out.println("Introduzca su edad:");
		edad = scanner.nextInt();
		scanner.nextLine();

		salas.get(oper - 1).add(new Cliente(nombre, edad)); // A�ADO EN EL HASHMAP LA COLA CON EL CLIENTE

	}

	private static void Desencolar(HashMap<Integer, Queue> salas) {
		int oper;

		System.out.println("Sobre que sala desea realizar la operacion?");
		oper = scanner.nextInt();
		scanner.nextLine(); // SALA DONDE A�ADIR CLIENTES

		while (oper > salas.size()) {
			System.out.println(
					"Valor de sala introducido err�neo. Introduzca valores desde el 1 hasta el " + salas.size());
			oper = scanner.nextInt();
			scanner.nextLine(); // SALA DONDE A�ADIR CLIENTES

		}

		salas.get(oper - 1).remove();

	}

	private static void Estado(HashMap<Integer, Queue> salas) {
			
		Queue<Cliente> c1;
		
		for (int i = 0; i < salas.size(); i++) {
			
			c1 = salas.get(i);
			
			System.out.println("Clientes de la sala " + (i + 1) + ":");
			
			Iterator iter = c1.iterator();
			while (iter.hasNext()) {
				Cliente cli1 = (Cliente) iter.next();
				cli1.Mostrar();
			}

		}

	}

	private static void Informacion(HashMap<Integer, Queue> salas) {
		int oper;

		System.out.println("Sobre que sala desea realizar la operacion?");
		oper = scanner.nextInt();
		scanner.nextLine(); // SALA DONDE A�ADIR CLIENTES

		while (oper > salas.size()) {
			System.out.println(
					"Valor de sala introducido err�neo. Introduzca valores desde el 1 hasta el " + salas.size());
			oper = scanner.nextInt();
			scanner.nextLine(); // SALA DONDE A�ADIR CLIENTES

		}

		Queue s = salas.get(oper - 1);

		Iterator iter = s.iterator();
		while (iter.hasNext()) {
			Cliente cli1 = (Cliente) iter.next();
			System.out.println(cli1.getNombre() + "," + cli1.getEdad());
		}

	}

}
