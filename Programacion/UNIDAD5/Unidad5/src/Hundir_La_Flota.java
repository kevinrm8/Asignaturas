import java.util.Scanner;

public class Hundir_La_Flota {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int i,j,trans,posx,posy;
		String [][] tablero = new String[6][6];
		String nombre;
		
		System.out.println("Bienvenido al juego undir la flota 6x6, introduzca su nombre:");
		nombre = scanner.nextLine();
		
		System.out.println("Hola, capitan"+nombre+". Dejeme que le ayude a configurar su flota.");
	
		
		trans=1;
		do {
		System.out.println("Introduzca la posicion de su transatlantico numero "+trans+" de 3 o 'stop' para dejar de introducir datos:");
		
		}while(trans<3 ); // FALTA RESTRICCION PARA PONER STOP
		
	}

}
