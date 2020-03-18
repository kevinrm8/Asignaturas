import java.util.*;

public class Pasteles {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Pastel> Todos = new ArrayList<Pastel>();
		ArrayList<Pastel> Aux = new ArrayList<Pastel>();
		ArrayList<Pastel> Ordenados = new ArrayList<Pastel>();

		int casos, maxAzucar, Anyadido, Natural, Apetencia, totalAzucar;
		casos = scanner.nextInt();
		maxAzucar = scanner.nextInt();
		
		int maxNatu,maxAnya;

		for (int i = 0; i < casos; i++) {
			Anyadido = scanner.nextInt();
			Natural = scanner.nextInt();
			Apetencia = scanner.nextInt();

			totalAzucar = Anyadido + Natural;

			if (totalAzucar <= maxAzucar) {
				Pastel P = new Pastel(Anyadido, Natural, Apetencia);
				Todos.add(P);
				Aux.add(P);
	
			}

		}//FIN DE LOS CASOS
		
		Iterator iter = Todos.iterator();
		while(iter.hasNext()) {
			Pastel P1 = (Pastel) iter.next();
			Iterator iter2 = Aux.iterator();
					while(iter2.hasNext()) {
						Pastel P2 = (Pastel) iter2.next();
						
						if(P1.getNatural()>P2.getNatural()) { // Natural mayor, me guardo el dato
							maxNatu = P1.getNatural();
						}else {
							if(P1.getNatural()==P2.getNatural()) { // si son iguales compruebo el anyadido
								if(P1.getAnyadido()>P2.getAnyadido()) {
									maxAnya = P1.getAnyadido();
								}else {
									if(P1.getAnyadido()==P2.getAnyadido()) {
										if(P1.getApetencia()>P2.getApetencia()) {
											
										}
									}
								}
							}
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
/*
 * 5 100 0 100 22 20 50 4 100 100 5 50 20 2 50 20 3
 * 
 * SALIDA 0 100 22 20 50 4 50 20 3 50 20 2
 */