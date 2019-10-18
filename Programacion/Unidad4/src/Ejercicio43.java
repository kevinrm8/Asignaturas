import java.util.Scanner;

public class Ejercicio43 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a,n;
		
		System.out.println("Ingrese un numero:");
		n = scanner.nextInt();
		
		if(n!=0) {
				for(a=n-1;a>1;a--) {
					n=n*a;
				}
				System.out.printf("El valor de n es %s",n);
				System.out.println("\nFIN DEL PROGRAMA");
			
			
		}else 	{
		n=1;
		System.out.printf("Valor de n es %s \nFIN DEL PROGRAMA",n);
				}
	}
}
