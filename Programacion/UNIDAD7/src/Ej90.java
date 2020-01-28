import java.util.Scanner;
import java.util.*;

public class Ej90 {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		
		int opcion=0;
		String nombre_grupo;
		ArrayList<String> GruposMusicales = new ArrayList();
		
		System.out.print("-GRUPOS MUSICALES-\n1-Agregar grupos al final de la lista\n2-Agregar grupos en una posicion concreta\n3-Recuperar grupo en una posicion determinada\n4-Modificar grupo en una posicion determinada\n5-Posicion del grupo de la lista\n6-Imprimir lista\n7-Salir del programa\nIntroduzca una opcion");
		opcion = scanner.nextInt();
		scanner.nextLine();
		
		while (opcion !=7) {

			
		switch(opcion){
		
		case 1: 
			GruposMusicales = AñadirAlFinal(GruposMusicales);
			break;
		case 2: 
			GruposMusicales = AñadirEnPosicion(GruposMusicales);
			break;
		case 3: RecuperarGrupo(GruposMusicales);
			break;
		case 4: GruposMusicales = Modificargrupo(GruposMusicales);
			break;
		case 5: PosicionDelGrupo(GruposMusicales);
			break;
		case 6: Imprimir(GruposMusicales);
			break;
		case 7: System.out.println("ADIOS!");
			break;
		
			}
		System.out.println("Introduzca una opcion: ");
		opcion = scanner.nextInt();
		scanner.nextLine();
		}
		
		
	}
	public static ArrayList<String> AñadirAlFinal (ArrayList<String> Grupo) {
		String nombre_grupo;
		
		System.out.println("Nombre del grupo añadir: ");
		nombre_grupo = scanner.nextLine();
		Grupo.add(nombre_grupo);
		System.out.println(Grupo);
		return Grupo;
	
	}
	
	public static ArrayList<String> AñadirEnPosicion (ArrayList<String> Grupo) {
		String nombre_grupo;
		int posicion;
		
		System.out.println("Posicion donde añadir: ");
		posicion = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Nombre del grupo añadir: ");
		nombre_grupo = scanner.nextLine();

		Grupo.add(posicion,nombre_grupo);
		System.out.println(Grupo);
		
		return Grupo;
		}
	
	public static void RecuperarGrupo(ArrayList<String> Grupo) {

		int pos;
		System.out.println("Ver grupo de la posicion: ");
		pos = scanner.nextInt();
		
		if(pos >= Grupo.size()) {
			System.out.println("La posicion no se encuentra en el Array");
		}else
			System.out.println(Grupo.get(pos));
	
	}
	public static ArrayList<String> Modificargrupo (ArrayList<String> Grupo) {
		int pos;
		String nombre_grupo;
		
		System.out.println("Posicion a modificar:");
		pos = scanner.nextInt();
		scanner.nextLine();

		if(pos>= Grupo.size()) {
			System.out.println("La posicion no existe");
		}else { 
			
			System.out.println("En la posicion "+pos+"se encuentra: "+Grupo.get(pos));
			System.out.println("Nombre del nuevo grupo:");
			nombre_grupo = scanner.nextLine();
			
			Grupo.add(pos,nombre_grupo);
		}
		
		
		return Grupo;
		}

	public static void PosicionDelGrupo(ArrayList<String> Grupo) {

		String nombre_grupo;
		System.out.println("Nombre del grupo a buscar: ");
		nombre_grupo = scanner.nextLine();
		
		System.out.println(Grupo.indexOf(nombre_grupo));
		
	}
	
	public static void Imprimir(ArrayList<String> Grupo) {
		
		for(int i=0;i<Grupo.size();i++) {
			System.out.println(Grupo.get(i));
		}
		
	}
}

