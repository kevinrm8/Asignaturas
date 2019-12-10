import java.util.Scanner;

public class Ej81 {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int a,b,c,d,Mayor;
		
		System.out.println("Dime los valores de A, B, C y D:");
		a= scanner.nextInt();
		b= scanner.nextInt();
		c= scanner.nextInt();
		d= scanner.nextInt();
		
		
		System.out.println("El numero mayor entre "+a+" y "+b+" es: "+ mayor(a,b));
		System.out.println("El numero mayor entre "+a+" y "+b+" y "+c+" es: "+ mayor(a,b,c));		
		System.out.println("El numero mayor entre "+a+" y "+b+" y "+c+" y "+d+" es: "+ mayor(a,b,c,d));		
	}

	public static int mayor(int a,int b) {
		int alto=0;
		
		if(a>=b)
			alto = a;
		else alto = b;
		
	return alto;	
	}
	public static int mayor(int a,int b,int c) {
		int alto=0;
		
		if(a>=b)
			alto = a;
		else {
			if(b>=c)
				alto = b;
			else alto = c;
		}
		
	return alto;	
	}
	
	public static int mayor(int a,int b, int c, int d) {
		int alto=0;
		
		if(a>=b)
			alto = a;
		else {
			if(b>=c)
				alto = b;
			else {
				if(c>=d)
					alto = c;
				else 
					alto = d;
			}
		}
	return alto;	
	}

}
