package Ejer111;

import java.io.*;
import java.util.*;

public class Ej111Leer {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Scanner scanner = new Scanner(System.in);
		String cadena;
		int num;
		File Numeros;
		ArrayList<String> Lista = new ArrayList<String>();

		FileReader f = new FileReader("Salida3.txt");
		BufferedReader b = new BufferedReader(f);
		while ((cadena = b.readLine()) != null) {
			num = Integer.parseInt(cadena); // PARA poder convertirlo en el archivo "Salida3.txt" Entre cada numero no debe haber ningun espacio, solo un salto de linea
			if (num % 5 == 0)
				Lista.add(cadena);
		}
		b.close();

		Iterator iter = Lista.iterator();
		while (iter.hasNext()) {
			String P = (String) iter.next();
			System.out.println(P);
		}

	}

	
}
