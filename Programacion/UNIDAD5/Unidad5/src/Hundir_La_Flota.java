import java.util.Scanner;

public class Hundir_La_Flota {
public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		int i,j,trans,posx,posy;
		String [][] tablero = new String[6][6];
		String nombre,posicion;
		
		int [] vector;
		
		//RELLENO EL TABLERO CON -
		for(j=0;j<tablero.length;j++) {
			for(i=0;i<tablero[j].length;i++) {
				tablero[j][i] = "- ";
				System.out.print(tablero[j][i]);
			}System.out.println();
		}
				
		
		System.out.println("Bienvenido al juego undir la flota 6x6, introduzca su nombre:");
		nombre = scanner.nextLine();
		
		System.out.println("Hola, capitan "+nombre+". Dejeme que le ayude a configurar su flota.");
	
		
		trans=1;
		do {
		System.out.println("Introduzca la posicion de su transatlantico numero "+trans+" de 3 o 'stop' para dejar de introducir datos:");
		posicion = scanner.nextLine();
		
		if(posicion.equals("stop"))
			break;
		else 
			{vector = transatlantico(posicion);
			posx = vector[0];
			posy = vector[1];
			
			if(posy+4 >6)
				System.out.println("Estas fuera del tablero");
			else {
				for(posy=posy;posy<tablero.length;posy++) {
					if(tablero[posx][posy] =="T" || tablero[posx+1][posy] =="T" || tablero[posx+2][posy] =="T" || tablero[posx+3][posy] =="T")
						System.out.println("El espacio esta ocupado");
					else tablero[posx][posy] = "T ";
					}			
				trans++;
				}
			}
		
		}while(trans<=3);

		for(i=0;i<tablero.length;i++) {
			for(j=0;j<tablero.length;j++) {
				System.out.print(tablero[i][j]);
			}System.out.println();
		}
		
		
	}
	private static int[] transatlantico(String posicion) {
		int[] pos = new int[2];

			pos[0] = Character.getNumericValue(posicion.charAt(0));
			pos[1] = Character.getNumericValue(posicion.charAt(1));

		return pos;
	}
	
}
