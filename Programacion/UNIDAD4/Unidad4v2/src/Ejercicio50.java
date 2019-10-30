import java.util.Scanner;

/* Nombre: Kevin
 * Fecha: 24/10/19
 * Descripcion: Muestra valores que hay en medio de los introducidos de 7 en 7.
 * */
public class Ejercicio50 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1,num2,menor=0,mayor=0,i,resta=0;
		
		System.out.println("Dime el primer numero");
		num1 = scanner.nextInt();
		
		System.out.println("Dime el segundo numero");
		num2 = scanner.nextInt();
		
		if(num1>num2) {
			mayor=num1;
			menor=num2;
					}
		else {
			if(num2>num1) {
				mayor=num2;
				menor=num1;
						} if(num1==num2) {
							System.out.println("El numero 1 y el numero 2 son iguales.");
								} else {
									for (i=menor;i<=mayor;i=i+7) {
										System.out.println(i);
										resta=mayor-i;
										if(resta<7) 
											System.out.println(mayor);
																}
										}
			
		
			} 
		
	
			
	}

}
