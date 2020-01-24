import java.util.ArrayList;

public class Ej86 {
	/* Crea un ArrayList con los nombres 
	 * de 6 compañeros de clase. A continuación muestra esos nombrespor pantalla. Utiliza para ello un 
	 * bucle for que recorra todo el ArrayList.*/

	public static void main(String[] args) {
		ArrayList<String> NombreClase = new ArrayList();
		
		NombreClase.add("kevin");
		NombreClase.add("Axel");
		NombreClase.add("Esther");
		NombreClase.add("Pablo");
		NombreClase.add("Hector");
		NombreClase.add("Xavi");

		
	for(int i=0;i<NombreClase.size();i++) {
		System.out.println(NombreClase.get(i));
		}
	}
}
