import java.util.Scanner;

public class exam2 {
	/* Nombre: Kevin
	 * Fecha: 20/11/19
	 * Descripcion: Laberinto con paredes, hay que llegar al final.  
*/

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int x=0,y=0,error=0;
		int[][] laberinto = new int [4][4];
		String movimiento;
		
		// Cuando en una posicion hay un '1' significa que hay pared
		laberinto [0][2] = 1;
		laberinto [1][0] = 1;
		laberinto [2][2] = 1;
		laberinto [2][3] = 1;
		laberinto [3][0] = 1;
		
		System.out.println("Bienvenido al laberinto de Paco!");
		System.out.println("Pulse W para arriba, S para abajo, A para la izquierda y D para la derecha");
		
		do {
			error=0;
			
			System.out.println("Estas en la casilla "+x+","+y+".¿Cual es tu proximo movimiento?");
			movimiento = scanner.nextLine();
			
			movimiento = movimiento.toUpperCase();			
			
			if(movimiento.contentEquals("W")) {
				System.out.println("Has pulsado hacia arriba");
				x--;
				if(x<0 || x>3) {// Comprobamos si esta fuera del tablera
					System.out.println("ERROR!. Nos salimos del tablero!");
					x++; // Si esta fuera del tableo, con 'x++' volvemos a la posicion anterior
					error=1;
				}else { /*Compruebo que no hay pared */
					if(laberinto[x][y]==1) {
						System.out.println("ERROR! En esa direccion hay una pared!");
						x++;
						error=1;
					}
					
				}
			}
			
			if(movimiento.contentEquals("S")) {
				System.out.println("Has pulsado hacia abajo");
				x++;
				if(x<0 || x>3) {// Comprobamos si esta fuera del tablera
					System.out.println("ERROR!. Nos salimos del tablero!");
					x--; // Si esta fuera del tableo, con 'x--' volvemos a la posicion anterior
					error=1;
				}else { 	/*Compruebo que no hay pared */
					if (laberinto[x][y]==1) {
						System.out.println("ERROR! En esa direccion hay una pared!");
						x--;
						error=1;
					}
				}	
			}
			
			if(movimiento.contentEquals("A")){
				System.out.println("Has pulsado hacia la izquierda");
				y--;
				if(y<0 || y>3) {// Comprobamos si esta fuera del tablera
					System.out.println("ERROR!. Nos salimos del tablero!");
					y++; // Si esta fuera del tableo, con 'y++' volvemos a la posicion anterior
					error=1;
				}else { /* Comrpuebo que no hay pared */
					if(laberinto[x][y]==1) {
						System.out.println("ERROR! En esa direccion hay una pared!");
						y++;
						error=1;
					}
				}
			}
			if(movimiento.contentEquals("D")){
				System.out.println("Has pulsado hacia derecha");
				y++;
				if(y<0 || y>3) {// Comprobamos si esta fuera del tablera
					System.out.println("ERROR!. Nos salimos del tablero!");
					y--; // Si esta fuera del tableo, con 'y--' volvemos a la posicion anterior
					error=1;
				} else { /* Compruebo que no hay pared */
					if(laberinto[x][y]==1) {
						System.out.println("ERROR! En esa direccion hay una pared!");
						y--;
						error=1;
					}
				}
			}
		
			} while(error==1 || (x != 3 || y !=3));
		
			System.out.println("Enhorabuena! Has llegado a la casilla 3,3 y por tanto has llegado al final del laberinto!");		
		
	}

}
