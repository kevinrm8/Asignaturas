package Ej1;

import java.util.*;

public class EjD {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int casos, maximo, anyadido, natural, apetencia;

		casos = scanner.nextInt();

		ArrayList<Pastel> TodosPosibles = new ArrayList<Pastel>();
		ArrayList<Pastel> Ordenado = new ArrayList<Pastel>();
		ArrayList<Pastel> OrdeAux = new ArrayList<Pastel>();

		maximo = scanner.nextInt();

		for (int i = 0; i < casos; i++) {
			anyadido = scanner.nextInt();
			natural = scanner.nextInt();
			apetencia = scanner.nextInt();

			if ((anyadido + natural) <= maximo) {
				Pastel P = new Pastel(anyadido, natural, apetencia);
				TodosPosibles.add(P);
			}
		}
		
		Collections.sort(TodosPosibles);
		
		// SIN ORDENAR
		Iterator iter = TodosPosibles.iterator();
		while(iter.hasNext()) {
			Pastel Aux = (Pastel) iter.next();
			System.out.println(Aux.getAnyadido()+" "+Aux.getNatural()+" "+Aux.getApetencia());
		}
		
		

	}

}

class Pastel implements Comparable<Pastel>{
	private int anyadido;
	private int natural;
	private int apetencia;

	public Pastel(int anyadido, int natural, int apetencia) {
		this.anyadido = anyadido;
		this.natural = natural;
		this.apetencia = apetencia;
	}

	public int getAnyadido() {
		return anyadido;
	}

	public int getNatural() {
		return natural;
	}

	public int getApetencia() {
		return apetencia;
	}

	@Override
	public int compareTo(Pastel arg0) {
		String a = new String(String.valueOf(this.getAnyadido())+this.getNatural());
		String b = new String(String.valueOf(arg0.getAnyadido())+arg0.getNatural());
		return a.compareTo(b);
	}

}


/*

5 100
0 100 22
50 20 3
100 100 2000
20 50 2
50 20 4
*/