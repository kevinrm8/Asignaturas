import java.util.*;

public class Principal {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		int opc = 0;

		ArrayList<Contenido> Lista = new ArrayList<Contenido>();

		do {
			try {
				opc = menu(Lista);

				if (opc < 0 || opc > 6) { // VALIDAR SI ESTA DENTRO DE RANGO
					throw new Exception("El numero '" + opc + "' esta fuera de rango");
				}
				switch (opc) {

				case 1:
					Alta_Pelicula(Lista);
					break;
				case 2:
					Alta_Serie(Lista);
					break;
				case 3:
					Ver_Contenido(Lista);
					break;
				case 4:
					Listar_Contenido(Lista);
					break;
				case 5:
					Listar_Contenido_Pendiente(Lista);
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (opc != 6);
		System.out.println("Gracias por utilizar Neflix");
	}

	private static int menu(ArrayList<Contenido> lista) {
		Scanner scanner = new Scanner(System.in);
		int opc = 0;
		// MENU
		System.out.println("-----------------------------------------------");
		System.out.println("1-Dar de alta una pelicula");
		System.out.println("2-Dar de alta una serie");
		System.out.println("3-Ver un contenido");
		System.out.println("4-Listar contenido");
		System.out.println("5-Listar contenido pendiente por ver");
		System.out.println("6-Salir");
		System.out.println("-----------------------------------------------");
		try {
			opc = Validar_Entero(); // COMRPOBAR QUE ES UN NUMERO
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return opc;
	}

	private static void Alta_Pelicula(ArrayList<Contenido> lista) {
		Scanner scanner = new Scanner(System.in);
		String Titulo, Productora;
		int Anyo, O_nominados, O_ganados;

		System.out.println("Titulo de la Pelicula:");
		Titulo = scanner.nextLine();
		System.out.println("Productora de la Pelicula");
		Productora = scanner.nextLine();
		System.out.println("Año de la pelicula");
		Anyo = scanner.nextInt();

		do {
			System.out.println("Oscars nominados: ");
			O_nominados = scanner.nextInt();
			System.out.println("Oscars ganados:");
			O_ganados = scanner.nextInt();

			if (O_ganados > O_nominados) {
				System.out.println("ERROR! más oscars ganados que nominados!");
			}

		} while (O_ganados > O_nominados);

		Pelicula P = new Pelicula(Titulo.toLowerCase(), Productora, Anyo, O_nominados, O_ganados);
		lista.add(P);

		System.out.println("La pelicula " + Titulo + " ha sido dada de alta correctamente!");

	}

	private static void Alta_Serie(ArrayList<Contenido> lista) {
		Scanner scanner = new Scanner(System.in);
		String Titulo, Productora, terminada;
		int Anyo, NTemporadas;
		boolean finalizada = false;

		System.out.println("Titulo de la Serie:");
		Titulo = scanner.nextLine();
		System.out.println("Productora de la Serie");
		Productora = scanner.nextLine();
		System.out.println("Año de la Serie");
		Anyo = scanner.nextInt();
		do {
			System.out.println("Numero de temporadas: ");
			NTemporadas = scanner.nextInt();
			if (NTemporadas <= 0) {
				System.out.println("ERROR! " + Titulo + " deberia tener, al menos 1 temporada!");
			}
		} while (NTemporadas <=0);

		scanner.nextLine();
		do {

			System.out.println("La serie esta terminada(S/N)");
			terminada = scanner.nextLine().toLowerCase();

		} while (!terminada.equals("s") && !terminada.equals("n"));

		// Comprobar si la serie esta terminada o no y pasarlo a un Boolean
		if (terminada.equals("s"))
			finalizada = true;

		Serie S = new Serie(Titulo.toLowerCase(), Productora, Anyo, NTemporadas, finalizada);
		lista.add(S);
		System.out.println("La serie " + Titulo + " ha sido dada de alta correctamente!");
	}

	private static void Ver_Contenido(ArrayList<Contenido> lista) {
		Scanner scanner = new Scanner(System.in);

		Contenido Cont;
		String titulo;
		System.out.println("Que contenido desea ver?");
		titulo = scanner.nextLine();

		boolean existe = false;

		int i = 0; // Localizar la posicion de la serie o pelicula que vamos a poner en VISTO
		Iterator<Contenido> CAux = lista.iterator();
		while (CAux.hasNext()) {
			Cont = CAux.next();
			if (Cont.getTitulo().equals(titulo.toLowerCase())) {
				Cont.setVisto(true);
				lista.set(i, Cont); // Sobre escribir la peli o serie, ahora con el contenido en visto
				existe = true;
				break;
			}
			i++;
		}
		if (!existe) {
			System.out.println("El contenido " + titulo + " no existe en Netflix");
		} else
			System.out.println("El contenido " + titulo + " marcado como visto!");

	}

	private static void Listar_Contenido(ArrayList<Contenido> lista) {

		Contenido Cont;

		Iterator<Contenido> CAux = lista.iterator();
		while (CAux.hasNext()) {
			Cont = CAux.next();
			System.out.println(Cont.toString());
		}
	}

	private static void Listar_Contenido_Pendiente(ArrayList<Contenido> lista) {

		Contenido Cont;

		Iterator<Contenido> CAux = lista.iterator();
		while (CAux.hasNext()) {
			Cont = CAux.next();
			if (!Cont.isVisto()) {
				System.out.println(Cont.toString());
			}
		}
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
