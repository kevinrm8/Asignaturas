
public class Ejercicio14 {
	/* Nombre: Kevin
	 * Fecha:02/10/19
	 * Descripcion: Programa para calcular el area de un cuadrado, triangulo y circulo.
	 * */

	public static void main(String[] args) {
		float a=2, b=3;
		
		System.out.println("Vamos a utilizar las variables "+a+" y "+b);
		System.out.println("Si "+a+" fuera la altura y "+b+" la base de un triángulo, el área de ese triángulo sería "+(a*b)/2);
		System.out.println("Si "+a+" fuera un lado de un cuadrado, su área sería "+(float)Math.pow(a,2));
		System.out.println("Si "+a+" fuera un radio de un circulo, su área sería "+(float)Math.PI*(float)Math.pow(a,2));
	
	}	

}