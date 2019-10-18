import java.util.Scanner;

public class Ejercicio42 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			double sueldo, hora, extra,base,total;
			
			System.out.println("Horas trabajadas esta semana:");
			hora = scanner.nextInt();
			
			System.out.println("Sueldo a la hora:");
			sueldo = scanner.nextInt();
			
			if(hora <= 40) {
				total=hora*sueldo;
				System.out.println("El sueldo es de "+total);
			}else 
			{
				base = 40*sueldo;
				hora = hora - 40;
				extra =(hora*(sueldo+(sueldo*0.5)));
				total = base+extra;
				System.out.printf("El sueldo es de %s € siendo el sueldo base de %s € y de las horas extras %s e",total,base,extra);
			}
	}

}
