import java.util.Scanner;

public class Ejercicio62 {
/* Nombre: Kevin Rosales
	 * Fecha: 6/11/2019
	 * Descipcion: Crear un correo electronico que siga unas normas
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int arroba;
		String email,antesArroba,despuesArroba,antes_punto,despues_punto;
		String[] separada,separada1,separada2;
		
		
		
		System.out.println("Introduzca su email:");
		email=scanner.nextLine();
		
				
		if(email.indexOf("@")==-1)
			System.out.println("ERROR1: No existe una @");
		else 
			if(email.indexOf("@")==0) 
					System.out.println("ERROR2: La direccion empieza por una @");
				else 
					if(email.indexOf("@")<4) 
							System.out.println("ERROR3: El identificador no llega a 4 caracteres.");
						else {//Separo el email en dos, antes y despues @
							separada =email.split("@");
							antesArroba = separada[0];
							despuesArroba = separada[1];
						
							if(despuesArroba.indexOf(".")==-1) //Si no hay @ da error4
								System.out.println("ERRPR4: Despues de la @ no hay un punto");
							else {				//En el vector separada1 introduzco la parte de despues del @ separado por el .	
								separada1= despuesArroba.split("\\.");
								antes_punto=separada1[0];
								despues_punto=separada1[1];
								if(antes_punto.length()<4)
									System.out.println("ERROR5: El identificador2 no llega a 3 caracteres");
								else {
									separada2=despuesArroba.split("\\.");
									if(separada2[1].contentEquals("com")==false && separada2[1].contentEquals("es")==false && separada2[1].contentEquals("org")==false && separada2[1].contentEquals("gov")==false)
										System.out.println("ERROR6: Dominio distinto a .com, .es, .org y .gov");
									else System.out.println("Enhorabuena! Mail correcto!");
									}
								}	
				}
	}

}