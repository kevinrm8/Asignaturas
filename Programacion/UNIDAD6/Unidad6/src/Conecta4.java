import java.util.Scanner;

public class Conecta4 {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		char[][] panel = new char[7][7];
		
		
		rellenar(panel); // Relleno panel con -
		
		
		int n;
		String columna;
		int J1,J2;
		
		System.out.print("En que columna quieres poner la ficha?");
		columna= scanner.next().toLowerCase();
				
		panel = colocarficha(columna,panel);
		
		ver(panel);

	}

	private static void ver(char[][] panel) {
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				System.out.print(panel[i][j]+" ");
				}System.out.print("\n");
			}
	}

	private static char[][] colocarficha(String columna,char[][] panel) {
		char jugada;
		int pos;
		
		jugada = columna.charAt(0);
		pos = Character.getNumericValue(jugada)%10; // Paso el valor de la letra a un numero
		
		for(int i=7;i<1;i--) {
			if(panel[i][pos] =='-') {
				panel[i][pos]='X';
				break;
			}
		}
		return panel;
	}

	private static void rellenar(char[][] panel) {
		char n;
		n='A';

		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				if(i==0) {
				panel[i][j] = n;
				System.out.print(n+" ");
				n++;
				}else
				System.out.print((panel[i][j]='-')+" ");
			}System.out.print("\n");
		}
	}
	
	
	
}
