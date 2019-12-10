import java.util.Scanner;

public class Ej80 {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num,bin;
		String Numero;
		
		System.out.println("Introduzca número para pasar a binario:");
		num = scanner.nextInt();
		
		Binario(num);
		
	}
	
	private static void Binario(int num) {
		
		String binario="";
		int bin = 0;
		if(num>0) {
			if( num%2 == 0)
				binario = "0" + binario; 
			else 
				binario = "1" + binario;
			num = num/2;
			
			Binario(num);
		}
		System.out.print(binario);
	}
	
}
