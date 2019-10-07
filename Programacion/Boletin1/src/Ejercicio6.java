
public class Ejercicio6 {
	/* Nombre: Kevin
	 * Fecha:02/10/19
	 * Descripcion: Primeros Programa 
	 * */
	

	public static void main(String[] args) {
		float a=2; float b=3; float c=1; 
		float x=0; float x1=0; float cuadrado =0; float raiz=0;
		
		/* Al gastar Math.sqrt la variable se reserva en Double, por lo tanto
		nosotros cambiamos de nuevo la variable forzando a float, ya que no necestiamos que guarde tanta memoria 
		para este ejercicio.
		Math.pow para hacer el numero al cuadrado.
		*/
		
		cuadrado = (float) Math.pow(b, 2);
		raiz = (float) Math.sqrt(cuadrado - (4*a*c));
		x= (-b+raiz)/(2*a);
		x1= (-b-raiz)/(2*a);
		System.out.println("El valor de x siendo a="+a+" b="+b+" y c="+c+" es igual a "+x+" y tambien "+x1);
			}

}
