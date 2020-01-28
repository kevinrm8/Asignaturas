import java.util.*;

public class Ej89 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		HashMap <String,String> Dicc = new HashMap <String,String> ();
		Dicc.put("Hola", "Hello");
		Dicc.put("Adios","By");
		
		String palabra;
		int sal=0;
		
		System.out.println("Palabra a buscar: ");
		palabra = scanner.nextLine();
		
		if(palabra.equals("salir"))
			sal = -1;
		
		while(sal!= -1){
		
	
		if(palabra.equals("salir")) {
			sal = -1;
			break;
		}
		
		if(Dicc.containsKey(palabra))
			System.out.println(Dicc.get(palabra));
		else 
			System.out.println("La palabra buscada no se encuentra en el diccionario");
		
		System.out.println("Palabra a buscar: ");
		palabra = scanner.nextLine();
		
		}
		
	}
}
