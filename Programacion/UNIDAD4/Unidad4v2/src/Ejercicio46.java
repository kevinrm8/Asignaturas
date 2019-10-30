import java.util.Scanner;

public class Ejercicio46 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int hora,min,num_sem,dia_rest,min_acabardia,min_total = 0;
		String dia;
		
		do {
		System.out.println("A que dia de la semana estamos?");
		dia = scanner.nextLine();
		dia = dia.toUpperCase();
			} while (!dia.equals("LUNES") && !dia.equals("MARTES") && !dia.equals("MIERCOLES") && !dia.equals("JUEVES") && !dia.equals("VIERNES"));
		
		do {
		System.out.println("Que hora es?(Formato 24h)");
		hora = scanner.nextInt();
			} while (hora<0 || hora>24);
		
		do {
		System.out.println("Tambien los minutos");
		min = scanner.nextInt();
			} while (min<0 || min>60);		
		switch (dia) {
		case "LUNES":
			min_acabardia=((24-hora))*60-min; //Restamos a las horas del dia la hora actual para saber cuanto falta para las 00:00 y lo pasamos a minutos
			min_total=(24*60)*3+(14*60)+min_acabardia;
			System.out.printf("Faltan un total de %s minutos para llegar a las 14:00 del viernes",min_total);
			
			break;
		case "MARTES":
			min_acabardia=((24-hora))*60-min; //Restamos a las horas del dia la hora actual para saber cuanto falta para las 00:00 y lo pasamos a minutos
			min_total=(24*60)*2+(14*60)+min_acabardia;
			System.out.printf("Faltan un total de %s minutos para llegar a las 14:00 del viernes",min_total);

			break;
		case "MIERCOLES":
			min_acabardia=(((24-hora))*60-min); //Restamos a las horas del dia la hora actual para saber cuanto falta para las 00:00 y lo pasamos a minutos
			min_total=(24*60)+(14*60)+min_acabardia;
			System.out.printf("Faltan un total de %s minutos para llegar a las 14:00 del viernes",min_total);

			break;
		case "JUEVES":
			min_acabardia=(24-hora)*60-min; //Restamos a las horas del dia la hora actual para saber cuanto falta para las 00:00 y lo pasamos a minutos
			min_total=(14*60)+min_acabardia;
			System.out.printf("Faltan un total de %s minutos para llegar a las 14:00 del viernes",min_total);

			break;
		case "VIERNES":
			if(hora>14) {
				min_total=(hora*60)-840; // Nos hemos pasado estos minutos de las 14:00
				System.out.printf("Se han pasado %s minutos de las 14:00 del viernes",min_total);
						}
			else  { 
				min_total=840-(hora*60);
				System.out.printf("Faltan un total de %s minutos para llegar a las 14:00 del viernes",min_total);
					}
			break;
		default: 
			break;
		}
		

		
	}

}
