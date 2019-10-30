
public class Ejercicio13 {
	/* Nombre: Kevin
	 * Fecha:02/10/19
	 * Descripcion: Calcular precio del cine
	 * */
	public static void main(String[] args) {
		float Patricia=0, Elena=0, Oscar=0, Entrada=9, Palomitas=6,refresco=0, dulces=0;
		
		refresco= Palomitas/2; // Calculamos los precios del refresco y los dulces que nos dice en el enunciado
		dulces = (float)Math.pow(refresco,3);
		
		Patricia= Entrada+ Palomitas+refresco+dulces; // Segun enunciado sumamos lo que gasta cada uno en el cine
		Elena = Patricia;
		Oscar = Entrada + refresco;
		
		System.out.println("Patricia ha gastado "+Patricia); //Mostramos en pantalla lo que gasta cada uno y el total
		System.out.println("Elena ha gastado "+Elena);
		System.out.println("Oscar ha gastado "+Oscar);
		System.out.println("En total la broma les ha salido por "+(Patricia+Elena+Oscar));

	}

}
