
public class Ejercicio9 {
	/* Nombre: Kevin
	 * Fecha:02/10/19
	 * Descripcion: Numero secreto segun la formula del encunciado
	 * 
	 * */
	public static void main(String[] args) {
		int edad=27; int cociente =0; float resultado=0;
		System.out.println("-Luego, dividirá el año del descubrimiento de América por esa  "+(1492/edad));
		System.out.println("-Al cociente se le restará el número de grand slams ganados por Nadal.");
		cociente = (1492/edad)-19;
		resultado = (float)Math.sqrt(cociente); 
		System.out.println("El número secreto es..." +resultado);

	}

}
