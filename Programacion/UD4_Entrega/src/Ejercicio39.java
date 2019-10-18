import java.util.Scanner;

public class Ejercicio39 {
	/* Nombre: Kevin
	 * Fecha:18/10/19
	 * Descripcion: Primera practica entregale. Juego Piedra,Papel,Tijera.
	 * */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int aleatorio; // Declaro las variables, aleatorio y usuario
		String usuario;

		aleatorio = (int) (Math.random()*2); // Eligo aleatorioamente el valor [0-2] que despues sera Piedra Papel o Tijera para el PC
		
		System.out.println("Elige entre Piedra, Papel o Tijera.");
		usuario = scanner.nextLine();
		
		usuario =usuario.toUpperCase();
		
		//System.out.println(usuario);  // Linea para comprobar lo que ha escrito el usuario.
		
		if(usuario.equals("PIEDRA") || usuario.equals("PAPEL") || usuario.equals("TIJERA") ) {
		switch (aleatorio){		
				case 0/* Piedra */: { // Al valor aleatorio 0 le asumo que valdra Piedra
									if(usuario.equals("PIEDRA")){
										System.out.println("El PC ha elegido: Piedra y el usuario: "+usuario);
										System.out.println("El resultado es...\n EMPATE!");
																} 
									if(usuario.equals("PAPEL")) {
										System.out.println("El PC ha elegido: Piedra y el usuario: "+usuario);
										System.out.println("El resultado es...\n Usuario gana a PC!");
																}
									if(usuario.equals("TIJERA")) {
										System.out.println("El PC ha elegido: Piedra y el usuario: "+usuario);
										System.out.println("El resultado es...\n PC gana al Usuario!");
																}
									} break;
				
				case 1/* Papel */: {	// Al valor aleatorio 1 le asumo que valdra Piedra
									if(usuario.equals("PIEDRA")){
										System.out.println("El PC ha elegido: Papel y el usuario: "+usuario);
										System.out.println("El resultado es...\n PC gana al usuario!");
																} 
									if(usuario.equals("PAPEL")) {
										System.out.println("El PC ha elegido: Papel y el usuario: "+usuario);
										System.out.println("El resultado es...\n EMPATE!");
																}
									if(usuario.equals("TIJERA")) {
										System.out.println("El PC ha elegido: Papel y el usuario: "+usuario);
										System.out.println("El resultado es...\n Usuario gana al PC!");
																}
									} break;
				
				case 2/* Tijera */: {	// Al valor aleatorio 2 le asumo que valdra Piedra
									if(usuario.equals("PIEDRA")){
										System.out.println("El PC ha elegido: Tijera y el usuario: "+usuario);
										System.out.println("El resultado es...\n Usuario gana al PC!");
																} 
									if(usuario.equals("PAPEL")) {
										System.out.println("El PC ha elegido: Tijera y el usuario: "+usuario);
										System.out.println("El resultado es...\n PC gana al Usuario!");
																}
									if(usuario.equals("TIJERA")) {
										System.out.println("El PC ha elegido: Tijera y el usuario: "+usuario);
										System.out.println("El resultado es...\n EMPATE!");
											}
										}break;

		
			}		//FIN DEL SWITCH
		}	else System.out.println(usuario+" no está dentro de las variables esperadas. \n\nFIN DEL PROGRAMA");
		//FIN DEL IF
		
	}

}
