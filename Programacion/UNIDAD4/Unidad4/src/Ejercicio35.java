import java.util.Scanner;

public class Ejercicio35 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System.in);
		
		float altura,ancho,Pescudo, tamaño,precio,total,envio=3.25f;
		String escudo;
		
		
		System.out.println("Introduzca la altura de la bandera en cm:");
		altura = scanner.nextFloat();
		
		System.out.println("Introduzca el ancho de la bandera en cm:");
		ancho = scanner.nextFloat();
		scanner.nextLine();
		
		do {
			System.out.println("¿Quiere escudo bordado?(s/n): ");
			escudo = scanner.nextLine();
			
		} while  (!escudo.equals("s") && !escudo.equals("n"));
			
		
		tamaño = altura*ancho;
		precio = (float) (0.01*tamaño);
		
		System.out.println("Gracias. Aqui tiene el desglose de su compra.");
		System.out.println("Bandera de "+tamaño+" cm2:\t\t\t "+precio+"€");
		
		if (escudo.equals("s")) {
		
			Pescudo = 3.25f;
			System.out.println("Con escudo:\t\t\t\t "+Pescudo+"€");
			}
			else {
				
				Pescudo =0;
				System.out.println("Sin escudo: "+Pescudo+"€");
			};
		System.out.println("Gastos de envio:\t\t\t "+envio+"€");
		total = precio+envio+Pescudo;
		System.out.println("Total:\t\t\t\t\t " +total+"€");
		
			 
			
			
		
			
			
	}
}
