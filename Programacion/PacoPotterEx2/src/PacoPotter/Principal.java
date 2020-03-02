package PacoPotter;

import java.util.*;

public class Principal {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int opc;

		ArrayList<Alumnos> Al = new ArrayList<Alumnos>();
		ArrayList<Biblioteca> Libro = new ArrayList<Biblioteca>();
		ArrayList<Prestamos> Prestados = new ArrayList<Prestamos>();

		do {
			opc = menu();
			switch (opc) {
			case 1:
				Alta_de_libro(Libro);
				break;
			case 2:
				Alta_de_alumno(Al);
				break;
			case 3:
				Prestar_libro(Al, Libro, Prestados);
				break;
			case 4:
				break;
			case 5:
				Resumen_biblioteca(Al, Libro, Prestados);
				break;
			case 9:
				break;
			default:
				System.out.println("Numero incorrecto");
				break;
			}
		} while (opc != 9);

	}

	private static int menu() {

		int opcion_menu;

		System.out.println("Bienvenido a la Biblioteca de Hogwarts");
		System.out.println("1-Dar de alta un libro");
		System.out.println("2-Dar de alta un alumno");
		System.out.println("3-Prestar un libro");
		System.out.println("4-Devolver un libro");
		System.out.println("5-Resumen de la biblioteca");
		System.out.println("9-Salir");
		opcion_menu = scanner.nextInt();
		scanner.nextLine();

		return opcion_menu;
	}

	private static void Alta_de_alumno(ArrayList<Alumnos> al) {

		String dni, nombre;
		int edad;

		System.out.println("Introduzca DNI del alumno " + Alumnos.contador);
		dni = scanner.nextLine();
		System.out.println("Introduzca su nombre:");
		nombre = scanner.nextLine();
		System.out.println("Introduzca su edad:");
		edad = scanner.nextInt();
		scanner.nextLine();

		Alumnos Al = new Alumnos(dni, nombre, edad);
		al.add(Al);

		System.out.println("Se ha dado de alta al siguiente alumno:");
		System.out.println(Al.Ver_alumno());
	}

	private static void Alta_de_libro(ArrayList<Biblioteca> libro) {
		String titulo, autor;
		int pag;

		System.out.println("Introduzca titulo del libro numero " + Biblioteca.contador);
		titulo = scanner.nextLine();
		System.out.println("Introduzca su autor:");
		autor = scanner.nextLine();
		System.out.println("Introduzca numero de paginas:");
		pag = Integer.parseInt(scanner.nextLine());
		Biblioteca Libro = new Biblioteca(titulo, autor, pag);
		libro.add(Libro);

		System.out.println("Se ha dado de alta el siguiente libro:");
		System.out.println(Libro.Ver_libro());

	}

	private static void Resumen_biblioteca(ArrayList<Alumnos> al, ArrayList<Biblioteca> libro,
			ArrayList<Prestamos> prestados) {

		Iterator<Alumnos> AluAux = al.iterator();
		Iterator<Biblioteca> BibAux = libro.iterator();
		Iterator<Prestamos> PreAux = prestados.iterator();

		System.out.println("Alumnos dados de alta:");
		while (AluAux.hasNext()) {
			System.out.println(AluAux.next().Ver_alumno());
		}

		System.out.println("Libros dados de alta:");
		while (BibAux.hasNext()) {
			System.out.println(BibAux.next().Ver_libro());
		}

		System.out.println("Prestamos:");
		while (PreAux.hasNext()) {

		}

	}

	private static void Prestar_libro(ArrayList<Alumnos> al, ArrayList<Biblioteca> libro,
			ArrayList<Prestamos> prestados) {
		Alumnos alu = null;
		Biblioteca Libro;
		String dni, titulo;

		System.out.println("Introduzca DNI del alumno:");
		dni = scanner.nextLine();

		Iterator<Alumnos> AluAux = al.iterator();
		while (AluAux.hasNext()) {
			alu = AluAux.next();
			if (AluAux.next().getDniAlu().equals(dni)) {
				break;
			}
		}

		System.out.println("Introduzca titulo del libro a prestar:");
		titulo = scanner.nextLine();

		Iterator<Biblioteca> LibroAux = libro.iterator();
		while (LibroAux.hasNext()) {
			Libro = LibroAux.next();
			if (Libro.getTitulo().equals(titulo)) { // PARA SABER SI EXISTE EL LIBRO
				if (Libro.getDisponible().equals("DISP")) {
					Libro.setPrest();
					Prestamos Pr1 = new Prestamos(alu, Libro);
					prestados.add(Pr1);
				} // GET DISPONIBLE
			} else
				System.out.println("Este libro no existe");
		}
	}
}
