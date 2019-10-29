import java.util.Scanner;

public class Ejercicio53 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero,r,intentos=1;
		int comparar;
		r = (int) (Math.random()*(100-0)+1);
		
		do {
		System.out.println("Dime un numero entre 1-100");
		numero = scanner.nextInt();
				
		comparar = Integer.compare(numero, r);
		
		if(comparar>0) {
			System.out.println("El numero magico es menor");
			intentos++;
					}
		if(comparar<0) {
			System.out.println("El numero magico es mayor");
			intentos++;
						}
			
		}while (numero != r); {
			System.out.println("Enhorabuena! has acertado el numero que era " +numero);
			System.out.println("Numero de intentos "+intentos);

						}
	}

}
