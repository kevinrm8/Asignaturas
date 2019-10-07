
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String nombre;
		String DNI;
		String Domicilio;
		String concepto1,concepto2,concepto3,concepto4,concepto5; 
		float cantidad1,cantidad2,cantidad3,cantidad4,cantidad5, precio1,precio2,precio3,precio4,precio5,importe1,importe2,importe3,importe4,importe5;
		float Descuento, Total; //Descuento en %
		
		
		
		System.out.println("Dime el nombre" );
		nombre = scanner.nextLine();
		System.out.println("El DNI: ");
		DNI = scanner.nextLine();
		System.out.println("Domicilio: ");
		Domicilio = scanner.nextLine();
		
		
		
		System.out.println("Concepto1: ");
		concepto1 = scanner.nextLine();
		System.out.println("Precio del "+concepto1);
		precio1 = scanner.nextFloat();
		scanner.nextLine();
		System.out.println("Cantidad del "+concepto1);
		cantidad1 = scanner.nextFloat();
		scanner.nextLine();

		importe1= precio1*cantidad1;
		
		
		System.out.println("Concepto2: ");
		concepto2 = scanner.nextLine();
		System.out.println("Precio del "+concepto2);
		precio2 = scanner.nextFloat();
		scanner.nextLine();
		System.out.println("Cantidad del "+concepto2);
		cantidad2 = scanner.nextFloat();
		scanner.nextLine();

		
		importe2= precio2*cantidad2;
		
		
		System.out.println("Concepto3: ");
		concepto3 = scanner.nextLine();
		System.out.println("Precio del "+concepto3);
		precio3 = scanner.nextFloat();
		scanner.nextLine();
		System.out.println("Cantidad del "+concepto3);
		cantidad3 = scanner.nextFloat();
		scanner.nextLine();

		
		importe3= precio3*cantidad3;
		
		
		System.out.println("Concept4: ");
		concepto4 = scanner.nextLine();
		System.out.println("Precio del "+concepto4);
		precio4 = scanner.nextFloat();
		scanner.nextLine();
		System.out.println("Cantidad del "+concepto3);
		cantidad4 = scanner.nextFloat();
		scanner.nextLine();

		
		importe4= precio4*cantidad4;
		
		System.out.println("Concepto5: ");
		concepto5 = scanner.nextLine();
		System.out.println("Precio del "+concepto5);
		precio5 = scanner.nextFloat();
		scanner.nextLine();
		System.out.println("Cantidad del "+concepto5);
		cantidad5 = scanner.nextFloat();
		scanner.nextLine();
		
		System.out.println("Porcentaje del descuento: ");
		Descuento = scanner.nextFloat();
		
		Descuento = Descuento/100;
		
		importe5= precio5*cantidad5;
		
		Total= importe1+importe2+importe3+importe4+importe5;
		
		
		System.out.println("CLIENTE: "+nombre+"\t\t DNI: "+DNI);
		System.out.println("DOMICILIO "+Domicilio);
		System.out.println("---------------------------------------------------------------------");

		System.out.println("CANTIDAD\tCONCEPTO-REFERNCIA\t\t PRECIO\t\t\t IMPORTE");
		System.out.println("---------------------------------------------------------------------");
		System.out.println(cantidad1+"\t\t"+concepto1+"\t\t\t\t "+precio1+"€\t\t\t "+importe1+"€");
		System.out.println("---------------------------------------------------------------------");
		System.out.println(cantidad2+"\t\t"+concepto2+"\t\t\t\t "+precio2+"€\t\t\t"+importe2+"€");
		System.out.println("---------------------------------------------------------------------");
		System.out.println(cantidad3+"\t\t"+concepto3+"\t\t\t\t "+precio3+"€\t\t\t"+importe3+"€");
		System.out.println("---------------------------------------------------------------------");
		System.out.println(cantidad4+"\t\t"+concepto4+"\t\t\t\t "+precio4+"€\t\t\t"+importe4+"€");
		System.out.println("---------------------------------------------------------------------");
		System.out.println(cantidad5+"\t\t"+concepto5+"\t\t\t\t "+precio5+"€\t\t\t"+importe5+"€");
		System.out.println("---------------------------------------------------------------------");

		System.out.println("\t\t\t\t "+Total+"");

		
		
	}

}
