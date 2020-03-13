package Ej1;

import java.util.*;

public class EjD {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int casos, maximo, anyadido, natural, apetencia;

		casos = scanner.nextInt();

		ArrayList<Pastel> Ordenado = new ArrayList<Pastel>();
		ArrayList<Pastel> OrdeAux = new ArrayList<Pastel>();

		maximo = scanner.nextInt();

		for (int i = 0; i < casos; i++) {
			anyadido = scanner.nextInt();
			natural = scanner.nextInt();
			apetencia = scanner.nextInt();

			Pastel P = new Pastel(anyadido, natural, apetencia);

			Ordenado.add(P);

		}

		int cont = 0;

		Iterator iter = Ordenado.iterator();
		Iterator iter2 = OrdeAux.iterator();

		while (iter.hasNext()) {
			Pastel PAux = (Pastel) iter.next();
			
			while(iter2.hasNext()) {
				Pastel PAux2 = (Pastel) iter2.next();
				if(PAux.getNatural()<PAux2.getNatural()) {
					OrdeAux.add(PAux2);
					Ordenado.remove(index)
				}
				
				
			}
			
		}

	}

}

class Pastel {
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

}
