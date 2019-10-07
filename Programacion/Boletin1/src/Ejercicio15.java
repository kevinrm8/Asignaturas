
public class Ejercicio15 {

	/* Nombre: Kevin
	 * Fecha:02/10/19
	 * Descripcion: calculamos los descuentos del IVA a un producto en particular
	 * */
	public static void main(String[] args) {
		float x=100, IVAGen=0.21f, IVARed=0.1f, IVASup =0.4f; // Datos del IVA que se descuenta segun sea General, Reducido o Supereducido
	
		System.out.println("El importe de tu producto es de "+x+"€.");
		System.out.println("Si tu producto tuviera un IVA General, su importe descontando el IVA sería: "+(x-(x*IVAGen)));
		System.out.println("Si tu producto tuviera un IVA Reducido, su importe descontando el IVA sería: "+(x-(x*IVARed)));
		System.out.println("Si tu producto tuviera un IVA Superreducido, su importe descontando el IVA sería: "+(x-(x*IVASup)));
	}
}
