import java.util.Scanner;

public class HundirLaFlota2 {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int i,j,num_trans=1,num_carg=1,num_lanchera=1,posx=0,posy=0;
		
		char [][] tablero = new char[6][6];
		String [] coord = new String[2];
		String nombre,posicion;		
		
		boolean espacio;
		
		//RELLENO EL TABLERO CON -
		for(j=0;j<tablero.length;j++) {
			for(i=0;i<tablero[j].length;i++) {
				tablero[j][i] = '-';
				System.out.print(tablero[j][i]);
			}System.out.println();
		}
				
		System.out.println("Bienvenido al juego undir la flota 6x6, introduzca su nombre:");
		nombre = scanner.nextLine();
		
		System.out.println("Hola, capitan "+nombre+". Dejeme que le ayude a configurar su flota.");
	
		
		System.out.println("Introduzca la posicion de su transatlantico numero "+num_trans+" de 3 o 'stop' para dejar de introducir datos:");
		posicion = scanner.nextLine();
		
		while(!posicion.equals("stop")) {
			coord=posicion.split(" ");
			posx = Integer.parseInt(coord[0]);
			posy = Integer.parseInt(coord[1]);
			
			if((posy+3)>5) {
				System.out.println("Estas fuera del tablero");
				
				System.out.println("Introduzca la posicion de su transatlantico numero "+num_trans+" de 3 o 'stop' para dejar de introducir datos:");
				posicion = scanner.nextLine();
				
			}else {
				i=0;
				espacio = true;
				while(i<4) {
					if(tablero[posx][posy+i] !='-') {
						System.out.println("El espacio esta ocupado");
						espacio = false;
						break;
					}
					i++;
				}
				if(espacio) {
					i=0;
					while(i<4) {
					tablero[posx][posy+i]='T';
					i++;
					}
					num_trans++;
				}
				if(num_trans>3) {
					posicion = "stop";
				}else {
					System.out.println("Introduzca la posicion de su transatlantico numero "+num_trans+" de 3 o 'stop' para dejar de introducir datos:");
					posicion = scanner.nextLine();
				}
			}
		}//WHILE TRANS
		
		// MUESTRA TRANSATLANTICOS
		System.out.println("Aqui estan sus transatlanticos:");
		for(j=0;j<tablero.length;j++) {
			for(i=0;i<tablero.length;i++) {
				System.out.print(tablero[j][i]);
			}System.out.println();
		}
		
		//CARGUEROS
		
		System.out.println("Introduzca la posicion de su carguero numero "+num_carg+" de 3 o 'stop' para dejar de introducir datos:");
		posicion = scanner.nextLine();
		
		while(!posicion.equals("stop")) {
			coord=posicion.split(" ");
			posx = Integer.parseInt(coord[0]);
			posy = Integer.parseInt(coord[1]);
			
			if((posx+2)>5) {
				System.out.println("Estas fuera del tablero");
				
				System.out.println("Introduzca la posicion de su carguero numero "+num_carg+" de 3 o 'stop' para dejar de introducir datos:");
				posicion = scanner.nextLine();
				
			}else {
				i=0;
				espacio= true;
				while(i<3) {
					if(tablero[posx+i][posy]!='-') {
						System.out.println("Espacio ocupado");
						espacio =false;
						break;
					}
					i++;
				}
				if(espacio) {
					i=0;
					while(i<3) {
					tablero[posx+i][posy] ='C';
					i++;
					}
					num_carg++;
				}
				if(num_carg>3) {
					posicion="stop";
				} else {
					System.out.println("Introduzca la posicion de su carguero numero "+num_carg+" de 3 o 'stop' para dejar de introducir datos:");
					posicion = scanner.nextLine();
				}
			}	
		}//WHILE CARGUERO
		
		// MUESTRA TRANSATLANTICOS Y CARGUERO
				System.out.println("Aqui estan sus transatlanticos y cargueros:");
				for(j=0;j<tablero.length;j++) {
					for(i=0;i<tablero.length;i++) {
						System.out.print(tablero[j][i]);
					}System.out.println();
				}
				
		// LANCHAS
				
				System.out.println("Introduzca la posicion de su lanchera numero "+num_lanchera+" de 3 o 'stop' para dejar de introducir datos:");
				posicion = scanner.nextLine();			
				
				while(!posicion.equals("stop")) {
					coord=posicion.split(" ");
					posx = Integer.parseInt(coord[0]);
					posy = Integer.parseInt(coord[1]);
					
					if(posx>6 || posy>6) {
						System.out.println("Estas fuera del tablero");
						
						System.out.println("Introduzca la posicion de su lanchera numero "+num_lanchera+" de 3 o 'stop' para dejar de introducir datos:");
						posicion = scanner.nextLine();
						
					}else {
						i=0;
						espacio= true;
						while(i<3) {
							if(tablero[posx][posy]!='-') {
								System.out.println("Espacio ocupado");
								espacio =false;
								break;
							}
							i++;
						}
						if(espacio) {
							i=0;
							while(i<3) {
							tablero[posx][posy] ='L';
							i++;
							}
							num_lanchera++;
						}
						if(num_lanchera>3) {
							posicion="stop";
						} else {
							System.out.println("Introduzca la posicion de su lanchera numero "+num_carg+" de 3 o 'stop' para dejar de introducir datos:");
							posicion = scanner.nextLine();
						}
					}	
				}//WHILE LANCHERA
				
				// MUESTRA TRANSATLANTICOS Y CARGUERO Y LANCHERA
				System.out.println("Aqui estan sus transatlanticos y cargueros:");
				for(j=0;j<tablero.length;j++) {
					for(i=0;i<tablero.length;i++) {
						System.out.print(tablero[j][i]);
					}System.out.println();
				}
	}
}
