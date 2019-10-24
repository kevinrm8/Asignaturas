import java.util.Scanner;

public class Ejercicio45 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int practicas;
		float tarifa = 0,matricula = 0,Ppractica = 0;
		String carnet;
		
		System.out.println("Que tipo de carnet tienes?(A/B/C/D");
		carnet= scanner.nextLine();

		carnet = carnet.toUpperCase();
		
		switch (carnet) {
		case "A":	
			matricula =150;
			System.out.println("¿Cuantas practicas ha realizado?");
			practicas = scanner.nextInt();
			Ppractica=practicas*15;
			tarifa= matricula +Ppractica;

			break;
			
		case "B":
			matricula =325;
			System.out.println("¿Cuantas practicas ha realizado?");
			practicas = scanner.nextInt();
			Ppractica=practicas*21;
			tarifa= matricula +Ppractica;

			break;
			
		case "C":
			matricula =520;
			System.out.println("¿Cuantas practicas ha realizado?");
			practicas = scanner.nextInt();
			Ppractica=practicas*36;

			tarifa= matricula +Ppractica;

			break;
			
		case "D":
			matricula =610;
			System.out.println("¿Cuantas practicas ha realizado?");
			practicas = scanner.nextInt();
			Ppractica=practicas*50;
			tarifa= matricula +Ppractica;
			break;
			
		default: System.out.println("No has introducido un carnet correcto");
			break;
		}
		System.out.printf("El coste total de la tarifa es de %s. La matricula le ha costado %s y las practicas %s",tarifa,matricula,Ppractica);
		
	}

}
