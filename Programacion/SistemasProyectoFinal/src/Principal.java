import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int opc = 0;

		do {
			try {
				opc = menu();

				if (opc < 0 || opc > 9 || opc == 0) {
					System.out.println("El numero esta fuera de rango");
				}
				switch (opc) {
				case 1: Decimal_Binario();
					break;
				case 2:
					break;

				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (opc != 9);

	}

	private static int menu() {
		int opc = 0;

		System.out.println("-------------------------------");
		System.out.println("1-Pasar Decimal a Binario");
		System.out.println("2-Pasar de Binario a Decimal");
		System.out.println("-------------------------------");
		try {
			opc = Validar_Entero();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return opc;
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
	
	private static void Decimal_Binario() {
		
	}
	
}
