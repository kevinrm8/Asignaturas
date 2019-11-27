import java.util.Scanner;

public class Ej72 {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int opcion;
		
		do {
			System.out.println("1.- Sumar");
			System.out.println("2.- Restar");
			System.out.println("3.- Multiplicar");
			System.out.println("4.- Dividir");
			System.out.println("5.- Potencia");
			System.out.println("6.- Raíz cuadrada");
			System.out.println("9.- Salir");
			
			opcion = scanner.nextInt();
			
			switch (opcion) {
			case 1: suma();
				break;
			case 2: restar();
				break;
			case 3: multiplicar();
				break;
			case 4: dividir();
				break;
			case 5: potencia();
				break;
			case 6: raiz_cuadrada();
				break;
			case 9: System.out.println("Un placer ayudarte, hasta luego!");
				break;
			}
		}while(opcion!=9);
		
		
	}

	private static void suma() {
		float a,b;
		
		System.out.println("Dime dos numeros:");
		a = scanner.nextFloat();
		b = scanner.nextFloat();
		
		float suma = a+b;
		System.out.println(suma);
	}
	private static void restar() {
		float a,b;
		
		System.out.println("Dime dos numeros:");
		a = scanner.nextFloat();
		b = scanner.nextFloat();
		
		float resta = a-b;
		System.out.println(resta);		
	}
	private static void multiplicar() {
		float a,b;
		
		System.out.println("Dime dos numeros:");
		a = scanner.nextFloat();
		b = scanner.nextFloat();
		
		float multi = a*b;
		System.out.println(multi);
	}
	private static void dividir() {
		float a,b;
		
		System.out.println("Dime dos numeros:");
		a = scanner.nextFloat();
		b = scanner.nextFloat();
		
		float div = a/b;
		System.out.println(div);		
	}
	private static void potencia() {
		float a,b;
		
		System.out.println("Dime dos numeros:");
		a = scanner.nextFloat();
		b = scanner.nextFloat();
		
		float potencia = (float) Math.pow(a,b);
		System.out.println(potencia);		
	}
	private static void raiz_cuadrada() {
		float a;
		
		System.out.println("Dime dos numeros:");
		a = scanner.nextFloat();
		
		float raiz2 = (float) Math.sqrt(a);
		System.out.println(raiz2);			
	}


}
