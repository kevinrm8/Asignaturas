import java.util.Scanner;
import java.util.*;

/* Nombre: Kevin
 * Fecha: 5/11/2019
 * Descrpcion: Vector con las notas musicales
 * */
public class Ejercicio60 {
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int melodia,nota;
		String compas[];

		//Maximo 7 notas. Melodia minimo 4 maximo 28 ( multiplo de 4)
		
		do {
		melodia = (int) (random.nextDouble()*24+4);
		}while (melodia%4 != 0 );
		
		 //Declaramos el tamaño del vector 'compas'
		 compas  = new String [melodia];
		 
		 for(int i=0;i<compas.length;i++) { 
			 nota = (int) (Math.random()*7+1);
		 
		 switch (nota){
		 case 1: 	compas[i] = "do ";
			 break; 
		 case 2: 	compas[i] = "re ";
			 break; 
		 case 3:  	compas[i] = "mi "; 
		 	break;
		 case 4:  	compas[i] = "fa ";
			 break; 
		 case 5:  	compas[i] = "sol ";
			 break; 
		 case 6:  	compas[i] = "la ";
			 break; 
		 case 7:  	compas[i] = "si "; 
		 	break;
		 	} // Cuando estamos en la ultima posicion ponemos lo que esta en la primera.
		 	if(i==(compas.length-1))
		 			compas[i] = compas[0];
		 }
		 // Mostramos por pantalla el vector
		 for(int j=0;j<compas.length;j++) {
			 System.out.print(compas[j]);
			 // Con esta condicion decimos que cada 4, ponemos '|' y en la ultima ponemos otro '|'
			 if((j>0) && ((j+1)%4==0)) {
			 	System.out.print(" | ");
			 	if(j==compas.length-1)
			 		System.out.print("|");
			 }	
		 }
	}

}
