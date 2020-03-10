package Ej108Zoologico;

import java.util.*;

public class Principal {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int opc=0;

		ArrayList<Animales> Animal = new ArrayList<Animales>();
		do {
			try {
			opc = menu();
			
			if(opc<0 || opc>6) { // VALIDAR SI ESTA DENTRO DE RANGO
				throw new Exception("El numero '"+opc+"' esta fuera de rango");
			}
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
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		} while (opc != 5);

		System.out.println("Gracias por visitar el Zoo");
	}

	public static int menu() throws Exception { // MENU
		Scanner scanner = new Scanner(System.in);
			int opc= 0;
			System.out.println("Bienvenido al Zoo Tigres & leones\n--------------------");
			System.out.println("1-Dar de alta animal");
			System.out.println("2-Dar de baja animal");
			System.out.println("3-Modificar peso");
			System.out.println("4-Listado animales");
			System.out.println("5-Salir");
			try {
				opc = Validar_Entero(); // COMRPOBAR QUE ES UN NUMERO
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		return opc;
	}

	private static void Alta_animal(ArrayList<Animales> animal) {
		String tipo;
		String nombre;
		int peso;
		try {
			System.out.println("Introduce el tipo de animal(l-leon, t-tigre)");
			tipo = Validar_Tipo();
			System.out.println("Introduzca el nombre del animal(Sin incluir numeros!");
			nombre = Validar_Nombre();
			System.out.println("Introduzca el peso de " + nombre);
			peso = Validar_Entero();
			animal.add(new Animales(nombre, tipo, peso)); // DAR DE ALTA AL ANIMAL Y METERLO EN EL ARRAYLIST

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private static void Baja_animal(ArrayList<Animales> animal) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String nombre;
		int cont=0;
		boolean comprobar = false; // SE DEBE PODER HACER DE OTRA FORMA
		
		System.out.println("Introduzca el nombre del animal para dar de baja:");
		nombre = Validar_Nombre();
		
		Iterator iter = animal.iterator();
		while(iter.hasNext()) {
			Animales Aux = (Animales) iter.next();
			if(Aux.getNombre().equals(nombre)) {
				animal.remove(cont);
				System.out.println("Animal de nombre "+nombre+" dado de baja.");
				comprobar = true;
			}
			cont++;
			
		} //FIN ITERATOR
		if (!comprobar) {
			System.out.println("No existe animal con ese nombre");
		}
	}

	private static void Modificar_peso(ArrayList<Animales> animal) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String nombre;
		int NuevoPeso;
		boolean comprobar = false; // SE DEBE PODER HACER DE OTRA FORMA

		System.out.println("Introduzca el nombre del animal para modificar el peso");
		nombre = Validar_Nombre();
		
		Iterator iter = animal.iterator();
		while(iter.hasNext()) {
			Animales Aux = (Animales) iter.next();
			if(Aux.getNombre().equals(nombre)) {
				System.out.println("Dime el nuevo peso de "+nombre);
				NuevoPeso = Validar_Entero();
				Aux.setPeso(NuevoPeso);
			}
		}
		if (!comprobar) {
			System.out.println("No existe animal con ese nombre");
		}
		
	}

	private static void Listado_animales(ArrayList<Animales> animal) {
		
		Iterator iter = animal.iterator();
		while(iter.hasNext()) {
			Animales Aux = (Animales) iter.next();
			System.out.println(Aux.Listado_animales());
		}
		if(animal.size()==0) {
			System.out.println("No hay animales");
		}
		
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

	public static String Validar_Nombre() throws Exception {
		Scanner scanner = new Scanner(System.in);
		String nombre, aux;
		nombre = scanner.nextLine().toLowerCase();

		for (int i = 0; i < nombre.length(); i++) {
			if (Character.isDigit(nombre.charAt(i))) {
				throw new Exception("El nombre contiene algun numero");
			}
		}
		return nombre;

	}

	public static int Validar_Entero() throws Exception {
		Scanner scanner = new Scanner(System.in);
		int numero;
		try {
			numero = scanner.nextInt();
		} catch (InputMismatchException e) {
			throw new Exception("No has puesto un numero");
		}

		return numero;

	}

}
