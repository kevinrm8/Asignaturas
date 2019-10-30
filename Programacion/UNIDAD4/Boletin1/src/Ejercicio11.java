
public class Ejercicio11 {
	/* Nombre: Kevin
	 * Fecha:02/10/19
	 * Descripcion: Programa para calcular el IMC
	 * */
	public static void main(String[] args) {
		int peso=80000; 	// Indicamos el peso en gramos y la altura en cm
		float altura=175;
		float IMC=0; 		// para calcualr el IMC necesitamos el peso en KG y la altura en m cuadrados
			
		IMC = (peso/1000)/(float)Math.pow((altura/100), 2);
		
		System.out.println("El IMC calculado es "+IMC);
		
	}

}
