import java.util.Scanner;

public class Ejercicio23 {
	
	/* Nombre: Kevin
	 * Fecha:8/10/19
	 * Descripcion:  Introducimos datos por teclado y los mostramos como en una tabla con \t.
	 * */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String DNI, nombre, direccion;
		int anyo, mes,dia;
		float salario, retencion;
		
		System.out.println("Introduce fecha de nacimiento en formato AAAA MM DD");
		anyo = scanner.nextInt();
		mes = scanner.nextInt();
		dia = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Introduce el DNI: ");
		DNI = scanner.nextLine();
		
		System.out.println("Introduce el nombre:");
		nombre = scanner.nextLine();
		
		System.out.println("Introduce direccion:");
		direccion = scanner.nextLine();
		
		System.out.println("Introduce salario:");
		salario=scanner.nextFloat();
		scanner.nextLine();			// Se pone este "Scanner.nextLine(); " para que pase de linea a la hora de escribir.
		
		System.out.println("Introduce retencion:");
		retencion=scanner.nextFloat();
		scanner.nextLine();
		
		System.out.println("Nombre........................: "+nombre);
		System.out.println("Direccion.....................: "+direccion+"\n");

		System.out.println("DNI...........................: "+DNI);
		System.out.println("Fecha de nacimiento...........: "+dia+" del mes "+mes+" del año "+anyo);
		
		System.out.println("Salario bruto.................: "+salario+"\n");
		System.out.println("Retencion.....................: "+retencion);
		System.out.println("Salario neto..................: "+(salario-(salario*(retencion/100))));

		
		
	}

}
