package Ej105;

public class Principal105 {

	public static void main(String[] args) {
		
		int [] v = new int[3];		

		try {
			v[3] = 3; // Al intentar poner numero en la posicion 3, da error
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Fuera de rango");
		}
		
	}

}
