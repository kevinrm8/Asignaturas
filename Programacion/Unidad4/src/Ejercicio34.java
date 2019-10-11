import java.util.Scanner;

public class Ejercicio34 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int cargo, viaje, civil;
		float sueldo=0, neto=0,bruto=0,dietas=0,retencion=0;
		
		
		System.out.println("1. Programador junior ");
		System.out.println("2. Programador senior ");
		System.out.println("3. Jefe de proyecto ");
		
		do {
			System.out.println("Introduzca el cargo del empleado(1-3):");
			cargo = scanner.nextInt();
			
			}while(cargo!=1 && cargo!=2 && cargo!=3);
		
			System.out.println("¿Cuantos dias ha estado de viaje visitando clientes?");
			viaje = scanner.nextInt();
			
		do {
			System.out.println("Introduzca su estado civil (1- Soltero, 2-Casado): ");
			civil = scanner.nextInt();
				
			}while(civil !=1 && civil !=2);
			
				
		switch(cargo)
			{
			case 1: sueldo = 950; break;
			case 2: sueldo = 1200; break;
			case 3: sueldo = 1600; break;
			}
		dietas = viaje*30;
		bruto = sueldo + dietas;
		
		switch(civil) {
			case 1: {neto = (float) (bruto -(sueldo*0.25));
					retencion = 25; break;
					}
			case 2: {neto = (float) (bruto - (sueldo*0.2));
					retencion = 20; break;
					}
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("Sueldo base es\t\t\t"+sueldo);
		System.out.println("Dietas ("+viaje+"viajes)\t\t"+dietas);
		System.out.println("-----------------------------------------");
		System.out.println("Sueldo bruto\t\t\t"+bruto);
		System.out.println("Retencion IRP("+retencion+"%)\t\t "+(sueldo*(retencion/100)));
		System.out.println("-----------------------------------------");
		System.out.println("Sueldo neto\t\t\t" +neto);
		System.out.println("-----------------------------------------");
		
	}
}
