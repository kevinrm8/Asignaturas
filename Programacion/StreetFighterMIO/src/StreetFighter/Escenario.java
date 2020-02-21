package StreetFighter;

import java.util.*;

public class Escenario {

	private String Esc;
	private Luchador J1;
	private Luchador J2;
	
	public Escenario(String Escenario,Luchador J1,Luchador J2) {
		Esc = Escenario;
		this.J1 = J1;
		this.J2 = J2;
	}
	
	public Luchador Pelea() {
		
		int victorias;
		int round=1;
		int intensidad;
		System.out.println("Comienza la pelea entre "+J1.getNombre()+" y "+J2.getNombre()+" en "+Esc);
		J1.setVictoria(0);
		
		do {

			System.out.println("ROUND " + round + "...FIGHT!!!");
			
			do {
				intensidad = J1.golpea(J2);
				System.out.println(
						J1.getNombre() + " golpea a " + J2.getNombre() + " con una intensidad de " + intensidad + "\t\t"
								+ J1.getNombre() + ": " + J1.getVida() + " - " + J2.getNombre() + ": " + J2.getVida());
				if (J2.getVida() == 0) {
					J1.sumarVictoria(1);
					System.out.println("El ganador de la ronda es: "+J1.getNombre());
					break;
					}

				intensidad = J2.golpea(J1);
				System.out.println(
						J2.getNombre() + " golpea a " + J1.getNombre() + " con una intensidad de " + intensidad + "\t\t"
								+ J1.getNombre() + ": " + J1.getVida() + " - " + J2.getNombre() + ": " + J2.getVida());
				if (J1.getVida() == 0) {
					J2.sumarVictoria(1);
					System.out.println("El ganador de la ronda es: "+J2.getNombre());
					break;
					}

			} while (J1.getVida() != 0 || J2.getVida() != 0);
	
		round++;
		J1.setVida(100);
		J2.setVida(100);
		
		
		}	while(J1.getVictoria()<2 && J2.getVictoria()<2);
		
			if(J1.getVictoria()==2)
				return J1;
			else 
				return J2;
			
	}
	
}
