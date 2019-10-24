import java.util.Scanner;

public class Ejercicio51 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int altura,ancho=6,par,fila=0,columna=0;
		
		System.out.println("Por favor, introduzca la altura(numero impar mayor o igual a 5)");
		altura= scanner.nextInt();
		
		par= altura%2; // COMPROBAMOS SI EL NUMERO ES PAR O NO.

		if(altura<5 || par==0 )
			System.out.println("La altura introducida no es correcta.");
			
		else {
				for(fila=0;fila<altura;fila++) {
					for(columna=0;columna<ancho;columna++) {
						
						if(fila==0 ||  fila ==altura-1 || columna==0 || columna ==ancho-1 || fila==altura/2) {
								System.out.print("M");
						} else System.out.print(" ");
															} System.out.println("");//SALTO DE LINEA -- FIN FOR COLUMNA
					
												}  //  FIN FOR FILA
				

			
			
			
			}//FIN DE ELSE. LINEA 19
		
	}

}


