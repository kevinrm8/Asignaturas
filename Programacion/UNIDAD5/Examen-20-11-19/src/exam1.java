import java.util.Scanner;

public class exam1 {
	/* Nombre: Kevin
	 * Fecha: 20/11/19
	 * Descripcion: Programa para hacer una bandera y contar el coste
	 * */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x,y,fil,col;
		
		String[][] bandera;
		
		String[] nombre = null;
		int cont=0,P = 0,a = 0,c = 0,o = 0,precio;
		
		do {
			System.out.println("Introduzca dimensiones de la bandera de Paco ( min. 4x4");
			y=scanner.nextInt();
			x=scanner.nextInt();
		
		
			if(x<4)
				System.out.println("La dimension en X es inferior a 4");
			if(y<4)
			System.out.println("La dimension en Y es inferior a 4");
			}while (x<4 || y<4);	
		//Le doy dos posiicones mas a la matriz para poner los bordes.
		bandera = new String [x+2][y+2];
		fil= x+2;
		col= y+2;
		
		
		//Le doy valores al String nombre para utilizarlo en un bucle
		nombre = new String [4];
		
		nombre[0] = "P";
		nombre[1] = "a";
		nombre[2] = "c";
		nombre[3] = "o";
		
		//Bucle for rellenando la matriz 'bandera'
		for(int i=0;i<fil;i++) {
			for(int j=0;j<col;j++) {
				
				if(i==0 || i==fil-1 || j==0 || j==col-1)
					bandera[i][j] = "@";	
				else {
					bandera[i][j] = nombre[cont];
					
					cont++;
						if(cont>3) 
							cont=0;
						
					}System.out.print(bandera[i][j]);
				}System.out.println();
			}
		
		for(int i=0;i<fil;i++) {
			for(int j=0;j<col;j++) {
				//Cuento las letras que hay en la bandera
				if(bandera[i][j]== nombre[0]) 
					P++;
				if(bandera[i][j]== nombre[1]) 
					a++;
				if(bandera[i][j]== nombre[2]) 
					c++;
				if(bandera[i][j]== nombre[3]) 
					o++;
			}
		}
		
		precio = P*10 +(a+c+o)*5;
		
		System.out.println("Imprimir esta bandera costaria: "+precio+"€ ya que hay que imprimir:");
		System.out.println("-"+P+" letras P por valor de: "+(P*10)+"€");
		System.out.println("-"+P+" letras P por valor de: "+(a*5)+"€");
		System.out.println("-"+P+" letras P por valor de: "+(c*5)+"€");
		System.out.println("-"+P+" letras P por valor de: "+(o*5)+"€");



		
		}	
	}
