package Ej107;

import java.util.*;

public class Principal106 {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int opc;
		try {
			do {
				opc = menu();
				switch (opc) {
				case 1:
					Leer_num_entero();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				default:
					break;
				}

			} while (opc != 4);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static int menu() {
		int opc;
		System.out.println("1-Leer un numero entero");
		System.out.println("2-Leer un numero entero que sea mayor de 100");
		System.out.println("3-Leer un numero entero que sea irreal");
		System.out.println("4-Salir del programa");
		return scanner.nextInt();

	}

	private static void Leer_num_entero() throws Exception {
		int numero;
		try {
			numero = scanner.nextInt();

		} catch (Exception e) {
			throw new Exception("Numero no es entero");
		}
	}

}
