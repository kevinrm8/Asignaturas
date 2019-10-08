import java.util.Scanner;

public class Ejercicio22 {
	/* Nombre: Kevin
	 * Fecha:8/10/19
	 * Descripcion:  Uso de las tabulaciones con "\t"
	 * */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int clase;
		String nombre;
		float nota1, nota2,nota3, media;
		
		System.out.println("Introduzca número de estudiante: ");
		clase = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Introduzca nombre y apellido del alumno: ");
		nombre = scanner.nextLine();
		System.out.println("Introduzca nota1: ");
		nota1 = scanner.nextFloat();
		System.out.println("Introduzca nota2: ");
		nota2 = scanner.nextFloat();
		System.out.println("Introduzca nota3: ");
		nota3 = scanner.nextFloat();
		scanner.nextLine();
		
		media = (nota1+nota2+nota3)/3;
		
		System.out.println("Alumno: "+clase+("-"+nombre+"\t\t\t ex.1\tex.2\tex.3\tmedia"));
		System.out.println("Notas 1era evaluacion: \t\t\t "+nota1+"\t"+nota2+"\t"+nota3+"\t"+media);
		
	}

}
