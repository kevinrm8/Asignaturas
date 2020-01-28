import java.util.*;

public class Ej88 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String nombre;
		int pass,Contra,cont=3;
		
		HashMap <String,Integer> Control = new HashMap <String,Integer> ();
		Control.put("Kevin", 888);
		Control.put("Axel",777);

		
		while(cont>0) {
			System.out.println("Nombre: ");
			nombre = scanner.nextLine();
			
			if( !Control.containsKey(nombre)) {
				System.out.println("Nombre invalido");
				cont--;
				}
			else {
				System.out.println("Password: ");
				pass = scanner.nextInt();

				if(Control.get(nombre).equals(pass)){
					System.out.println("HAS ENTRADO");
					break;
				}else {
					System.out.println("Contraseña invalida");
					cont --;
				}
			}

			}
		if(cont<=0)
			System.out.println("No tienes acceso a la pagina");	
	}
}
