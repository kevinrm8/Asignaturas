package Ej108Zoologico;

import java.util.*;

public class Principal {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int opc;

		ArrayList<Animales> Animal = new ArrayList<Animales>();

		menu();
		try {

			do {
				opc = scanner.nextInt();
				scanner.nextLine();
				switch (opc) {
				case 1:
					Alta_animal(Animal);
					break;
				case 2:
					Baja_animal(Animal);
					break;
				case 3:
					Modificar_peso(Animal);
					break;
				case 4:
					Listado_animales(Animal);
					break;
				}
				menu();
				opc = scanner.nextInt();
				scanner.nextLine();

			} while (opc != 5);
		} catch (Exception e) {
			System.out.println("No es un numero");
		}
		System.out.println("Gracias por visitar el Zoo");
	}

	public static void menu() throws Exception {

		System.out.println("Bienvenido al Zoo Tigres & leones\n--------------------");
		System.out.println("1-Dar de alta animal");
		System.out.println("2-Dar de baja animal");
		System.out.println("3-Modificar peso");
		System.out.println("4-Listado animales");
		System.out.println("5-Salir");
	}

	private static void Alta_animal(ArrayList<Animales> animal) {
		String tipo;
		String nombre;
		int peso;
		try {
			System.out.println("Introduce el tipo de animal(l-leon, t-tigre)");
			tipo = Validar_Tipo();
			System.out.println("Introduzca el nombre del animal(Sin incluir numeros!");
			nombre = Validar_Nomrbe();
			System.out.println("Introduzca el peso de " + nombre);
			peso = Validar_Peso();
			animal.add(new Animales(nombre, tipo, peso));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private static void Baja_animal(ArrayList<Animales> animal) {

	}

	private static void Modificar_peso(ArrayList<Animales> animal) {

	}

	private static void Listado_animales(ArrayList<Animales> animal) {

	}

	public static String Validar_Tipo() throws Exception {
		Scanner scanner = new Scanner(System.in);
		String tipo;
		tipo = scanner.nextLine().toLowerCase();

		if (!tipo.equals("l") && !tipo.equals("t")) {
			throw new Exception("No es un tipo valido");
		} else
			return tipo;
	}

	public static String Validar_Nomrbe() throws Exception {
		Scanner scanner = new Scanner(System.in);
		String nombre, aux;
		nombre = scanner.nextLine().toLowerCase();

		for (int i = 0; i < nombre.length(); i++) {
			if (Character.isDigit(nombre.charAt(i))) {
				throw new Exception("Contiene un numero");
			}
		}
		return nombre;

	}

	public static int Validar_Peso() throws Exception {
		Scanner scanner = new Scanner(System.in);
		int peso;
		try {
			peso = scanner.nextInt();
		} catch (InputMismatchException e) {
			throw new Exception("Numero no valido");
		}

		return peso;

	}

}
