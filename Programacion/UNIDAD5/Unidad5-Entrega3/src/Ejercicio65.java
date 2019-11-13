import java.util.Scanner;

public class Ejercicio65 {
	/* Nombre: Kevin
	 * Fecha: 13/11/2019
	 * Descripcion: Crear contraseña de forma correcta
	 * 	*/

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String pass;
		int contador_numeros,minuscula,mayuscula,arroba,mal=0;
		
		System.out.println("El password ha de tener las siguientes restriccions: \n"+
				"1- Ha de tener, al menos, 8 caracteres.\n" + 
				"2- Al menos la mitad del password ha de estar en minúsculas.\n" + 
				"3- El password ha de tener, al menos, 2 mayúsculas.\n" + 
				"4- El password ha de tener, al menos, 3 números.\n" + 
				"5- El password NO ha de incluir el carácter ‘@’.\n"
				+ "Introduzca su password:");
		pass = scanner.nextLine();

		do{
			mal=0;
		//Compruebo el tamaño de la contraseña
		if (pass.length()<8) {
			System.out.println("El tamaño de la password ha de ser de al menos 8 caracteres, y el suyo es de "+pass.length());
			mal++;
				}
		
		//Compruebo que al menos hay 3 numeros
		contador_numeros = numeros(pass);
		if(contador_numeros<3) {
			System.out.println("Deben existir al menos 3 numeros y solo tienes "+contador_numeros);
			mal++;
			}
		//Cuento las minusculas
		minuscula = miniscula(pass);
		if(minuscula<(pass.length()/2)) {
			System.out.println("Debe tener al menos "+(pass.length()/2)+ " en minuscula y solo tiene"+minuscula);
			mal++;
			}
		
		//Cuenta las mayusculas
		mayuscula = mayuscula(pass);
		if(mayuscula<2) {
			System.out.println("Deben existir al menos 2 mayuscula y solo tienes "+mayuscula);
			mal++;
			}
		
		//Compruebo si tiene @
		arroba = arroba(pass);
		if(arroba!=-1) {
			System.out.println("El password no puede contener el caracter '@'.");
			mal++;
			}
		
		if(mal!=0) {
				System.out.println("Intentelo de nuevo");
				pass = scanner.nextLine();
				}
		
		}while(mal!=0);
		
	}
		


	private static int numeros(String pass) {
		int contador=0;
		char [] cadena = pass.toCharArray();
		
		for(int i=0;i<pass.length();i++) {
			if(Character.isDigit(cadena[i])) {
				contador++;
			}
		}
		
		return contador;
	}

	private static int miniscula(String pass) {
		
		char [] aux = pass.toCharArray();
		int cont=0;
		
		for(int i=0;i<pass.length();i++) {
			
			if(!Character.isDigit(aux[i]))
				if(pass.charAt(i) == Character.toLowerCase(aux[i])){
				cont++;
					}
				}
			return cont;
			}

	private static int mayuscula(String pass) {
		
		char [] aux = pass.toCharArray();
		int cont=0;
		
		for(int i=0;i<pass.length();i++) {
			
			if(!Character.isDigit(aux[i]))
				if(pass.charAt(i) == Character.toUpperCase(aux[i])){
				cont++;
					}
				}
				return cont;
			}
		
	private static int arroba(String pass) {
		int i = pass.indexOf("@");
		return i;
	}	
	}

