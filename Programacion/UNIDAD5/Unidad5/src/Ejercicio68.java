import java.util.Scanner;

public class Ejercicio68 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		String cad;
		char[] caracteres;
		int i;
		
		System.out.println("Introduzca una cadena");
		cad = scanner.nextLine();
		
		//Longuitud
		
		caracteres = new char [cad.length()];
		
		for(i=0;i<cad.length();i++) {
			if(cad.charAt(i)==' ')
				caracteres[i]='@';
			else caracteres[i]=cad.charAt(i);
			
			if(i==0)
				System.out.print("[");
			if(i!=cad.length()-1)
				System.out.print(caracteres[i]+", ");
			else 			
				System.out.print(caracteres[i]+"]");

		}
	}

}
