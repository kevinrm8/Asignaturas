package EjCafetera;
import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int opc;
		int X;
		
		System.out.println("Bienvido a Cafeteria SERPIS");
		System.out.println("Capacidad de la  cafetera");
		
		X = scanner.nextInt();
		Cafetera cafet1 = new Cafetera(X);

		do {
		System.out.println("0- Rellenar cafetera");
		System.out.println("1- Servir cafe");
		System.out.println("2-Agregar cafe a la cafetera");
		System.out.println("3-Vaciar cafetera");
		System.out.println("4-Salir");

		opc = scanner.nextInt();
		
		switch (opc){
		case 0:
			System.out.println("Con cuanto quiere rellenarla?:");
			X = scanner.nextInt();
			cafet1.llenar_cafetera(X);
			break;
		case 1: 
			System.out.println("Cuanto quiere? En cl");
			X = scanner.nextInt();
			cafet1.servir_taza(X);
			break;
		case 2:
			System.out.println("Cuanto quiere agregar a la cafetera? En cl");
			X = scanner.nextInt();
			cafet1.agregar_cafe(X);
			break;
		case 3:
			cafet1.vaciar_cafetera();
			break;
		default:
			System.out.println("Opcion incorrecta");
			break;
		
		}
		}
		while (opc!=4);
		}
	}
		
		
		
//		Cafetera cafet1 = new Cafetera(1000);
//		cafet1.llenar_cafetera();
//		cafet1.servir_taza(90);
//		cafet1.servir_taza(10);
//		cafet1.agregar_cafe(50);
//		cafet1.servir_taza(960);
//		cafet1.servir_taza(1);
//		cafet1.agregar_cafe(1200);
//		cafet1.agregar_cafe(50);
//		cafet1.vaciar_cafetera();
//		cafet1.llenar_cafetera();
	


