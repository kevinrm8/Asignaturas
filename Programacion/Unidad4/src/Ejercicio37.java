import java.util.Scanner;

public class Ejercicio37 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int x,y,repetir=1;
			
			
			do {
			System.out.println("Dime el valor de x: ");
			x = scanner.nextInt();
			System.out.println("Dime el valor de y: ");
			y = scanner.nextInt();
			scanner.nextLine();
			
			if (x>0 && y>0) 
				System.out.println("Estas en el primer cuadrante.");
					if (x<0 && y>0) 
						System.out.println("Estas en el segundo cuadrante.");
							if (x<0 && y<0) 
								System.out.println("Estas en el tercer cuadrante.");
									if (x>0 && y<0) 
										System.out.println("Estas en el cuarto cuadrante.");
											if(x!=0 && y==0) 
												System.out.println("Estas en el cuadrante de abscisas.");
													if(x==0 && y!=0) 
														System.out.println("Estas en el cuadrante de ordenadas.");
															if(x==0 && y==0) 
																System.out.println("Estas en el origen de coordenadas.");
				System.out.println("Quiere probar otra vez? (Si=1/No=0)");
				repetir=scanner.nextInt();		 																		
				}while (repetir !=0); 
							
	}		
}